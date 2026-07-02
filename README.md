
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool
Expecting value: line 1 column 2 (char 1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{.spec.template.spec.containers[*].name}'
sibec-arquivos-tqs-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath="{.spec.template.spec.containers[?(@.name=='NOME_DO_CONTAINER')].volumeMounts}" | python3 -m json.tool
Expecting value: line 1 column 1 (char 0)
-sh-4.2$
-sh-4.2$
-sh-4.2$

