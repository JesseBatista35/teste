   oc get projects | grep -i siepr
   oc get routes -n <namespace-siepr> -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination
