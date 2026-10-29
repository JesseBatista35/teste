oc set volume dc/sibec-arquivos-tqs -n sibec-tqs --remove --name=sibec-arquivos-data-tqs
oc delete pvc sibec-arquivos-data-tqs -n sibec-tqs
oc delete pv sibec-arquivos-data-tqs

oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
