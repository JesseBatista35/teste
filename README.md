Para achar onde a classe está e o que o EAR declara, rode no host:

cd /opt/jboss-eap/standalone/deployments
ls -l
for f in *.jar *.ear; do unzip -l "$f" 2>/dev/null | grep -q 'sisgd/framework/cm/ConectorException' && echo "TEM: $f"; done
unzip -l gec-ear.ear | grep -iE "sisgd|framework|jboss-deployment-structure|jboss-all|lib/"
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml 2>/dev/null
unzip -p gec-ear.ear gec-web.war 2>/dev/null > /tmp/gec-web.war && unzip -l /tmp/gec-web.war | grep -iE "jboss-deployment-structure|jboss-web.xml|WEB-INF/lib/.*(sisgd|framework)"

Se a classe estiver só em framework_sisgd.jar, as causas prováveis são estas:

O EAR não declara dependência em deployment.framework_sisgd.jar no jboss-deployment-structure.xml. No 6.4 isso pode ter funcionado por outro caminho, como um módulo global.
A dependência existe, mas aponta para um nome que não bate.
O jar era um módulo em jboss-modules-custom (a pasta existe no repo de config) e não foi copiado para este host.

O comando mostra qual é. Se for a primeira causa, a correção é pequena: um jboss-deployment-structure.xml no gec-ear.ear, ou um módulo para o jar no standalone. Se for a terceira, é um passo da esteira (Copiando modules adicionais).

Dois itens do log que são só ruído por enquanto:

WMQ: as linhas ERROR [stderr] ... Sistema de mensagens do WMQ: '9.0.4.0...' são o banner do adaptador, com EXPLICAÇÃO: null. Não é erro real.
APM: os Connect timed out do elastic-apm indicam que apm-server-devops.produtos.caixa não está acessível a partir deste host. Não afeta o deploy.

Me mande a saída desses comandos que eu fecho a causa e a correção.
