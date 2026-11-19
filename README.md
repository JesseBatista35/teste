oc get netnamespace sipgc-des -o jsonpath='{.egressIPs}{"\n"}'
oc get netnamespace sipgc-tqs -o jsonpath='{.egressIPs}{"\n"}'
