
-sh-4.2$
-sh-4.2$ oc rsh -n sihdg-tqs sihdg-jboss8-tqs-13-zzgrb
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ getent hosts CBRDEDADNT002.extra.caixa.gov.br
10.116.93.230   CBRDEDADNT002.extra.caixa.gov.br
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK || echo FALHOU
FALHOU
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
sh: oc: command not found
sh-5.1$
sh-5.1$
sh-5.1$ oc get hostsubnet | grep 10.116.221.46
sh: oc: command not found
sh-5.1$
sh-5.1$
sh-5.1$
