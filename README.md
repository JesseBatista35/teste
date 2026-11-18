Esta etapa tem dois problemas. O do commons-lang3 está confirmado. O do ELY01148 ainda é hipótese, e vou separar uma coisa da outra.

1. commons-lang3 (causa confirmada)

O EAR só tem commons-lang-2.4, sem nenhum commons-lang3.
No pom raiz, commons-lang3 está com <scope>provided</scope> no dependencyManagement. É o mesmo padrão do arqref e do POI: o jar não é empacotado e o JBoss não o fornece.
O fix é um <scope>compile</scope> explícito no módulo certo. Os poms já estão dentro dos artefatos, então rode isto para eu escrever o fix exato:
bash
cd /opt/jboss-eap/standalone/deployments
unzip -p gec-ear.ear META-INF/maven/br.gov.caixa.sigec/gec-ear/pom.xml
echo ===== gec-ejb =====
unzip -p gec-ear.ear gec-ejb.jar 'META-INF/maven/br.gov.caixa.sigec/gec-ejb/pom.xml'
Outras dependências provided do pom raiz podem aparecer como NoClassDefFound na sequência: guava, commons-codec, commons-collections, reflections, swagger-* e jasperreports. Algumas o JBoss já fornece. Quando eu tiver os poms, já digo quais empacotar de uma vez, para evitar um ciclo de build por classe.

2. ELY01148 (causa ainda não confirmada)

O que sei: os dois WARs falham no mesmo ponto. Nenhum tem security-domain no jboss-web.xml, então os dois caem no mapeamento padrão do Undertow para um domínio Elytron. O gec-web usa FORM, e o gec-api usa o resolver do Keycloak.
O terceiro stacktrace do log, na linha 35166, parece ser a nova tentativa de deploy do pipeline.
Minha principal suspeita é o ear-subdeployments-isolated=false, mas é só suspeita. Não confirmei a causa, e um build inteiro para testar é caro.

Faça o teste direto no host, só para diagnóstico. A correção definitiva vai para o repo depois:

bash
mkdir -p /tmp/t_iso && cd /tmp/t_iso && rm -rf * 
cp /opt/jboss-eap/standalone/deployments/gec-ear.ear .
mkdir META-INF
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml \
  | sed 's#<ear-subdeployments-isolated>false#<ear-subdeployments-isolated>true#' > META-INF/jboss-deployment-structure.xml
zip -q gec-ear.ear META-INF/jboss-deployment-structure.xml
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml | grep isolated

Depois dispare o deploy:

bash
cd /opt/jboss-eap/standalone/deployments
rm -f gec-ear.ear.failed
cp /tmp/t_iso/gec-ear.ear gec-ear.ear
touch gec-ear.ear.dodeploy
sleep 90; ls -l gec-ear.ear.*; cat gec-ear.ear.failed 2>/dev/null | head -c 1500
Se subir .deployed, a causa é o isolamento. Aí o fix é mudar ear-subdeployments-isolated para true no jboss-deployment-structure.xml do gec-ear e ajustar as dependências que os WARs perderem.
Se continuar o ELY01148, ou aparecer ClassNotFound de classes do gec-ejb, não é o isolamento. Me mande o .failed e eu analiso o Elytron.

Se continuar o ELY01148, rode também este comando, que não expõe senha:

bash
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=undertow:read-resource(recursive=true)" | grep -iE "application-security-domain|default-security-domain|elytron|name" | head -30
grep -nE "application-security-domain|default-security-domain|<secure-deployment|keycloak" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head -30

O host é de DES e a mudança manual é só para o teste. A alteração permanente fica no repo (gec-ear), e o EAR volta ao estado da esteira no próximo release.
