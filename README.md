oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{range .spec.template.spec.containers[*].env[*]}{.name}={.value}{"\n"}{end}'

oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{range .spec.template.spec.containers[*].env[*]}{.name}{"\t"}{.valueFrom.secretKeyRef.name}{"\t"}{.valueFrom.secretKeyRef.key}{"\t"}{.valueFrom.configMapKeyRef.name}{"\n"}{end}'

oc get secret bt-client-secret-sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.data}' | python3 -m json.tool

oc get configmap -n sicfd-des | grep -i "bt\|beyond\|monitora"

