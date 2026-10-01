   timeout 5 bash -c '</dev/tcp/10.116.93.230/31153' && echo PORTA_OK || echo FALHOU
   oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'

      oc get netnamespace sihdg-tqs -o jsonpath='{.egressIPs}{"\n"}'
