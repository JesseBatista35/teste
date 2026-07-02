
-sh-4.2$ oc get dc --all-namespaces | grep sibec-arquivos
sibec-des         sibec-arquivos-des                                             154        1         1
sibec-hmp         sibec-arquivos-hmp                                             23         1         1
sibec-tqs         sibec-arquivos-tqs                                             110        1         1
-sh-4.2$ oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool
No resources found.
Error from server (NotFound): namespaces "-o" not found
Expecting value: line 1 column 1 (char 0)
-sh-4.2$ oc get dc sibec-arquivos -n -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | python3 -m json.tool
No resources found.
Error from server (NotFound): namespaces "-o" not found
Expecting value: line 1 column 1 (char 0)
-sh-4.2$
