oc rsh -n sihdg-tqs sihdg-jboss8-tqs-13-zzgrb
# dentro do pod:
getent hosts CBRDEDADNT002.extra.caixa.gov.br
timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK || echo FALHOU


oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
oc get hostsubnet | grep 10.116.221.46
