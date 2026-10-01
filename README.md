oc get dc sihdg-jboss8-tqs -n sihdg-tqs -o jsonpath='{range .spec.template.spec.volumes[*]}{.name}{" -> "}{.persistentVolumeClaim.claimName}{.nfs.server}{":"}{.nfs.path}{"\n"}{end}'
oc get pvc -n sihdg-tqs
