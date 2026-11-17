Teste rápido no host, sem rebuild (para confirmar antes de mexer no código):

Confirme que o gec-web.war carrega o arqref por conta própria (não deve aparecer no lib/ do EAR):
unzip -l /tmp/gec-web.war | grep -i arqref
Monte o descritor corrigido e atualize o EAR no lugar:
mkdir -p /tmp/dsfix/META-INF && cd /tmp/dsfix
unzip -p /opt/jboss-eap/standalone/deployments/gec-ear.ear META-INF/jboss-deployment-structure.xml > META-INF/jboss-deployment-structure.xml

Edite esse arquivo e troque o bloco do gec-web.war por:

xml
<sub-deployment name="gec-web.war">
    <dependencies>
        <module name="deployment.framework.jar" />
        <module name="deployment.framework_sisgd.jar" />
    </dependencies>
</sub-deployment>
Atualize o arquivo dentro do EAR e redisparede o deploy:
cd /tmp/dsfix && zip /opt/jboss-eap/standalone/deployments/gec-ear.ear META-INF/jboss-deployment-structure.xml
cd /opt/jboss-eap/standalone/deployments && rm -f gec-ear.ear.failed && touch gec-ear.ear.dodeploy
/opt/jboss-eap/bin/jboss-cli.sh --connect --command="deployment-info"

(Se o zip não existir, jar uf gec-ear.ear -C /tmp/dsfix META-INF/jboss-deployment-structure.xml faz o mesmo. Se o scanner não pegar, deploy --force /opt/jboss-eap/standalone/deployments/gec-ear.ear pelo CLI.)

Se o gec-ear.ear ficar OK, a hipótese está confirmada. Aí a correção definitiva vai no código: o jboss-deployment-structure.xml fica no módulo gec-ear do repositório SIGEC-portabilidade (procure no Repos por jboss-deployment-structure.xml, provavelmente em gec-ear/src/main/application/META-INF/ ou gec-ear/src/main/resources/META-INF/). Aplique a mesma alteração na branch e rode o build do online de novo. A mudança no host é só para validar, porque a próxima release recria o EAR a partir do build.

Se o deploy falhar de novo, o erro será outro, mais adiante na lista. Me mande o trecho do server.log de /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log com os WFLYCTL0013 ou Caused by novos.
