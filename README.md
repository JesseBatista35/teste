
Using project "simcn-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc get project selenium-grid -o yaml | grep -iE "requester|description|display"
Error from server (NotFound): namespaces "selenium-grid" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rolebindings -n selenium-grid
No resources found.
-sh-4.2$ oc get dc -n selenium-grid -o custom-columns=NAME:.metadata.name,IMAGE:.spec.template.spec.containers[*].image
NAME      IMAGE
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n selenium-grid <pod-chrome> df -h /dev/shm
-sh: pod-chrome: Arquivo ou diretório não encontrado
-sh-4.2$ oc get dc <dc-chrome> -n selenium-grid -o yaml | grep -iA3 shm
-sh: dc-chrome: Arquivo ou diretório não encontrado
-sh-4.2$
