$
-sh-4.2$ df -h /sihdg_sinaf /sihdg_des
df: “/sihdg_sinaf”: Arquivo ou diretório não encontrado
df: “/sihdg_des”: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des --field-selector=status.phase=Running -o jsonpath='{.items[0].metadata.name}')
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
df -h /sihdg_sinaf /sihdg_des
df: /sihdg_sinaf: No such file or directory
Filesystem                      Size  Used Avail Use% Mounted on
hypernprd56.ad.caixa:/fs_sihdg   50G     0   50G   0% /sihdg_des
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ df -h /sihdg_sinaf /sihdg_des
df: /sihdg_sinaf: No such file or directory
Filesystem                      Size  Used Avail Use% Mounted on
hypernprd56.ad.caixa:/fs_sihdg   50G     0   50G   0% /sihdg_des
sh-5.1$
sh-5.1$
sh-5.1$ oc get pods
sh: oc: command not found
sh-5.1$
sh-5.1$
sh-5.1$ oc get pods
sh: oc: command not found
sh-5.1$
sh-5.1$
sh-5.1$
sh-5.1$ exit
exit
command terminated with exit code 127
-sh-4.2$ oc get pods
NAME                            READY     STATUS      RESTARTS   AGE
sihdg-angular18-des-16-deploy   0/1       Completed   0          6d2h
sihdg-angular18-des-17-deploy   0/1       Completed   0          28h
sihdg-angular18-des-17-zshgs    2/2       Running     0          28h
sihdg-backend-des-329-deploy    0/1       Completed   0          51d
sihdg-backend-des-330-6pl4m     1/1       Running     0          5d23h
sihdg-backend-des-330-deploy    0/1       Completed   0          5d23h
sihdg-frontend-des-195-deploy   0/1       Completed   0          132d
sihdg-frontend-des-196-6kk65    2/2       Running     0          115d
sihdg-frontend-des-196-deploy   0/1       Completed   0          115d
sihdg-jboss8-des-88-deploy      0/1       Completed   0          9d
sihdg-jboss8-des-88-nsrzb       1/1       Running     0          9d
sihdg-jboss8-des-91-deploy      0/1       Error       0          17h
sihdg-jboss8-des-92-deploy      0/1       Error       0          16h
-sh-4.2$
-sh-4.2$
-sh-4.2$


ops pods ja deram erro nao da pra olhar
