oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool

oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | python3 -m json.tool

oc set env dc/sibec-arquivos-tqs --list -n sibec-tqs | grep -i -E "pass|senha|datasource"
