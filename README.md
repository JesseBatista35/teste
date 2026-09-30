
-sh-4.2$  oc exec <pod-sirex-agenda-api> -n <namespace-des> -- java -version
-sh: pod-sirex-agenda-api: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                      READY     STATUS      RESTARTS       AGE
cleanup-identities-29846296-j7c92         0/1       Completed   0              3m7s
cleanup-identities-29846297-skf8w         0/1       Completed   0              2m7s
cleanup-identities-29846298-w56bf         0/1       Completed   0              67s
cleanup-identities-29846299-thl6m         0/1       Completed   0              7s
lista-ips-cb749d6ff-pflvv                 1/1       Running     0              61d
nfs-client-provisioner-596457dfdf-xs72z   1/1       Running     61 (77m ago)   152d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sirex-des
Now using project "sirex-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                      READY     STATUS      RESTARTS   AGE
sirex-agenda-api-des-79-deploy            0/1       Completed   0          11d
sirex-agenda-api-des-80-48n9b             1/1       Running     0          7d21h
sirex-agenda-api-des-80-deploy            0/1       Completed   0          7d21h
sirex-agenda-api-des-81-deploy            0/1       Error       0          36m
sirex-agenda-backend-des-52-8jn2v         1/1       Running     0          285d
sirex-agenda-frontend-des-33-deploy       0/1       Completed   0          11d
sirex-agenda-frontend-des-34-deploy       0/1       Completed   0          8d
sirex-agenda-frontend-des-34-gzgvt        2/2       Running     0          8d
sirex-backend-des-627-deploy              0/1       Completed   0          8d
sirex-backend-des-628-deploy              0/1       Completed   0          5d21h
sirex-backend-des-628-x8cs2               1/1       Running     0          5d21h
sirex-frontend-des-782-deploy             0/1       Completed   0          11d
sirex-frontend-des-783-deploy             0/1       Completed   0          8d
sirex-frontend-des-783-ft5vk              2/2       Running     0          8d
sirex-frontend-novoangular-des-33-hdvkc   2/2       Running     0          232d
-sh-4.2$
