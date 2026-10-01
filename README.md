oc rsh -n sihdg-tqs sihdg-jboss8-tqs-27-vmg99

getent hosts CBRDEDADNT002.extra.caixa.gov.br
timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK_IP || echo FALHOU_IP
timeout 5 bash -c '</dev/tcp/CBRDEDADNT002.extra.caixa.gov.br/31153' && echo PORTA_OK_NOME || echo FALHOU_NOME
exit

oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'

