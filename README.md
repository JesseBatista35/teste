oc get pv sihdg-jboss8-pwc-tqs sihdg-jboss8-data-tqs -o custom-columns=PV:.metadata.name,SERVER:.spec.nfs.server,PATH:.spec.nfs.path,CAP:.spec.capacity.storage,CLAIM:.spec.claimRef.name
oc get dc sihdg-jboss8-tqs -n sihdg-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
