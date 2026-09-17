
Verificação do NFS do servidor 10.116.208.100 para ver se tem algum diretório montando. Esse é da Esteira devOps, foi criado recentemente


[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.208.100
p585600@10.116.208.100: Permission denied (publickey,gssapi-keyex,gssapi-with-mic).
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$




You have access to 985 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sicfd-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project simcn-des
Now using project "simcn-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                           READY     STATUS      RESTARTS   AGE
simcn-backend-des-250-deploy   0/1       Completed   0          24h
simcn-backend-des-250-wfg6x    1/1       Running     0          24h
simcn-frontend-des-57-t7jb2    2/2       Running     0          46h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
