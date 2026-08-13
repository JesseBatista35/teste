oc get pod <nome-do-pod> -n <namespace> -o jsonpath='{.spec.containers[0].env}' | grep -i URL_BOLETO

oc rsh <nome-do-pod> env | grep URL_BOLETO

