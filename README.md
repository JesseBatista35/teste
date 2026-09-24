oc get project selenium-grid -o yaml | grep -iE "requester|description|display"
oc get rolebindings -n selenium-grid
oc get dc -n selenium-grid -o custom-columns=NAME:.metadata.name,IMAGE:.spec.template.spec.containers[*].image

oc rsh -n selenium-grid <pod-chrome> df -h /dev/shm
oc get dc <dc-chrome> -n selenium-grid -o yaml | grep -iA3 shm

