oc get dc sibec-arquivos -n <namespace-tqs> -o yaml | grep -A 40 "env:"

oc set env dc/sibec-arquivos --list -n <namespace-tqs> | grep -i -E "pass|senha|datasource"

oc get dc sibec-arquivos -n <namespace-tqs> -o jsonpath='{.spec.template.spec.volumes}' | jq
oc get dc sibec-arquivos -n <namespace-tqs> -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | jq

