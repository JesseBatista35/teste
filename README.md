No 6.4 (10.116.88.20):

sudo sed -n '56870,56872p' /opt/jboss/jboss-eap/dc/configuration/domain.xml

Na 471 (10.116.97.59):

sudo grep -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml -path '*configuration*' | head -1)

Compare os dois valores de sha1="...". Confira também na planilha qual versão de parametros está listada: se for a 3.2.0.1, o hash vai dizer se o pacote do 7.4 é ela.

Teste do curl

O 000 não quer dizer que a aplicação está fora. Você rodou o curl na máquina do 6.4 (-sh-4.1$), e essa máquina antiga não alcança a URL. Rode na 473:

curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-api/

Se der 000 também na 473, abra a URL no navegador da sua estação. O Inocêncio já tinha testado o migracaosifec.des.caixa por lá e funcionou.
