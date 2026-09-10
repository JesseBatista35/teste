oc get dc sihdg-jboss8-des -o jsonpath='{range .spec.template.spec.containers[0].volumeMounts[*]}{.name}{"\t"}{.mountPath}{"\n"}{end}'

