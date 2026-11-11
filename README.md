E no 6.4, confira se o PARAMETROS de lá é o mesmo pacote:

sudo grep -n 'SICCR-PARAMETROS"' /opt/jboss/jboss-eap/dc/configuration/domain.xml
Teste rápido do PARAMETROS
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-api/

Uma resposta 200, 302 ou 401 significa que a aplicação está respondendo. Se der 404 ou 503, me avise.
