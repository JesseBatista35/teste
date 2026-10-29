# mountPath de cada volume
oc get dc sibec-arquivos-des -n sibec-des -o jsonpath='{range .spec.template.spec.volumes[*]}{.name}{" -> "}{.persistentVolumeClaim.claimName}{"\n"}{end}{"---\n"}{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'

# pod rodando + ocupação dos dois mounts
oc get pods -n sibec-des | grep arquivos
oc rsh <pod-arquivos> sh -c 'id; mount | grep -i sibec; df -h | grep -i sibec'

# eventos (sem o sort que quebrou)
oc get events -n sibec-des --sort-by=.metadata.creationTimestamp | tail -20

oc rsh <pod-arquivos> sh -c 'cd <mount_antigo> && tar cf - . | (cd <mount_novo> && tar xf - --no-same-owner)'
