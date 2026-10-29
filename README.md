oc rsh -n sibec-des sibec-arquivos-des-210-hkjgk sh -c 'env | grep -i filestore.path.servidor'

oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
oc get pvc -n sibec-tqs
