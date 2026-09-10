
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des --field-selector=status.phase=Running -o jsonpath='{.items[0].metadata.name}')
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ ls -la /sihdg_sinaf
ls: cannot access '/sihdg_sinaf': No such file or directory
sh-5.1$
sh-5.1$
sh-5.1$ df -h /sihdg_sinaf
df: /sihdg_sinaf: No such file or directory
sh-5.1$
sh-5.1$
sh-5.1$
