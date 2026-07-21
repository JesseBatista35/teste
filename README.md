oc get pod <pod-siavl> -o jsonpath='{.spec.containers[0].envFrom}'
oc get secret <nome-do-secret> -o jsonpath='{.data}' | jq
