Pega o arquivo do legado. No servidor legado do SIGSJ (o sspdeapllx0039, de onde tiramos a libSenhasSIIBC.so):

bash
ls -la /log_ias/config-log4j/ceflib/
cat /log_ias/config-log4j/ceflib/ceflib.xml

Me cola o conteúdo do ceflib.xml que eu te ajudo a validar/ajustar o path de log de dentro dele (ele aponta pra onde vai escrever o log).

Correção rápida pra testar agora (depois a gente torna persistente na esteira):

bash
# na VM 955
mkdir -p /log_ias/config-log4j/ceflib
# copia o ceflib.xml do legado pra cá (scp do 0039) e coloca em:
#   /log_ias/config-log4j/ceflib/ceflib.xml
chown -R jboss:jboss /log_ias

Persistente na esteira (igual fizemos com os outros): a gente adiciona o ceflib.xml no repo SIGSJ-intranet-config em configuration/properties/ e inclui no custom.sh:

bash
mkdir -p /log_ias/config-log4j/ceflib
mv $SRC/ceflib.xml /log_ias/config-log4j/ceflib/.
chown -R jboss:jboss /log_ias

Uma coisa importante pra você saber: esse erro é de log4j não achar o config de log da ceflib — ele quebra o logging da lib, mas pode não derrubar o login em si (o SIROT GJ01/GJ02 do intranet já estava funcionando). Vale confirmar: o login do intranet ainda está entrando normal, ou parou junto com esse erro? Isso define se é só ajuste de log ou se está bloqueando de fato.

Me manda o cat do ceflib.xml do legado e o ls da pasta na VM que eu fecho o custom.sh certinho pra entregar isso automático.

QUAL IP DO LEGADO

O legado do SIGSJ é o sspdeapllx0039 (foi de onde tiramos a libSenhasSIIBC.so e que tinha conexão com o SIROT 101:8111).

Não tenho o IP dele anotado aqui — só o hostname. Pra pegar o IP, de qualquer máquina:

bash
