Na 473, rode exatamente assim:

curl -s -o /dev/null -w "%{http_code}\n" http://10.116.97.79:10650/ccr-parametros-web/
curl -s -o /dev/null -w "%{http_code}\n" http://10.116.97.79:10650/ccr-parametros-api/
API 200 e web 404: o web não tem página na raiz, e não é problema de ambiente. É só pedir a rota ao João Pedro.
Web 200 ou 302: o JBoss está servindo, e o 404 vem do Apache. Aí a correção é nossa.

Ainda falta o hash na 471:

sudo grep -H -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml)
Como o Claude está se saindo nesta sessão?
