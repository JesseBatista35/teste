oc get dc --all-namespaces | grep sibec-arquivos


oc get dc sibec-arquivos -n <namespace> -o jsonpath='{.spec.template.spec.volumes}' | python3 -m json.tool


oc get dc sibec-arquivos -n <namespace> -o jsonpath='{.spec.template.spec.containers[0].volumeMounts}' | python3 -m json.tool
