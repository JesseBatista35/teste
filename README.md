1. Na 471 (root): a 6.3.0, que está ativa no 7.4

Primeiro, veja o nome exato do WAR da API dentro do EAR:

unzip -l /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content | grep -i "\.war"

Se aparecer ccr-api.war, rode:

unzip -p /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content ccr-api.war > /tmp/ccr-api-630.war && unzip -p /tmp/ccr-api-630.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"
2. No 6.4 (10.116.88.20): a 6.5.0, do intranet5

Primeiro, localize o arquivo do pacote:

S=$(sudo grep -A1 'deployment name="SIFEC-CCR5"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -o 'sha1="[^"]*"' | head -1 | cut -d'"' -f2); F=/opt/jboss/jboss-eap/dc/data/content/${S:0:2}/${S:2}/content; echo $F; sudo ls -l $F

Depois, na mesma sessão, extraia o web.xml:

sudo unzip -p $F ccr-api.war > /tmp/ccr-api-650.war && unzip -p /tmp/ccr-api-650.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"

Me manda as duas saídas. Se as URLs protegidas forem diferentes (por exemplo, o /v8/* protegido na 6.3 e liberado na 6.5), está confirmado que basta atualizar a versão.
