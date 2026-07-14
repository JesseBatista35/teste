
-sh-4.2$ oc get pods -n siabm-des | grep siabm-autenticacao-api
siabm-autenticacao-api-des-187-deploy                                   0/1       Completed   0          10d
siabm-autenticacao-api-des-188-deploy                                   0/1       Completed   0          18h
siabm-autenticacao-api-des-188-fqnmq                                    1/1       Running     0          18h
siabm-autenticacao-api-sandbox-des-13-deploy                            0/1       Completed   0          4d18h
siabm-autenticacao-api-sandbox-des-14-584bj                             1/1       Running     0          4m34s
siabm-autenticacao-api-sandbox-des-14-deploy                            0/1       Completed   0          4m37s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siabm-autenticacao-api-sandbox-des-14-584bj -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-sandbox-des-14-584bj" not found
-sh-4.2$
