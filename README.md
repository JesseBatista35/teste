
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
sh-5.1$  timeout 5 bash -c '</dev/tcp/10.116.93.230/31153' && echo PORTA_OK || echo FALHOU
FALHOU
sh-5.1$
sh-5.1$
sh-5.1$ oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
sh: oc: command not found
sh-5.1$
sh-5.1$
sh-5.1$  oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
sh: oc: command not found
sh-5.1$
