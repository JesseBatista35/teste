oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool


oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.containers[*].name}'


oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath="{.spec.template.spec.containers[?(@.name=='NOME_DO_CONTAINER')].volumeMounts}" | python3 -m json.tool

