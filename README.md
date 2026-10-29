oc get pods -n sibec-des | grep arquivos
oc get dc sibec-arquivos-des -n sibec-des -o jsonpath='{.status.latestVersion}{"\n"}{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
oc get events -n sibec-des --sort-by=.metadata.creationTimestamp | tail -8

oc rsh <pod-novo> sh -c 'id; ls -ln /sibec/Folha | head -5; du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
