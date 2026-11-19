
-sh-4.2$ ^C
-sh-4.2$ oc get netnamespace sipgc-des -o jsonpath='{.egressIPs}{"\n"}'
[10.116.222.85]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace sipgc-tqs -o jsonpath='{.egressIPs}{"\n"}'
[10.116.222.238]
-sh-4.2$
