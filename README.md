# 1. DNS resolve?
oc exec -it <pod-sipgc-des> -n sipgc-des -- getent hosts des.sigoc.caixa

# 2. Porta 443 abre?
oc exec -it <pod-sipgc-des> -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"



-sh-4.2$
-sh-4.2$ oc project sipgc-des
Now using project "sipgc-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                  READY     STATUS      RESTARTS      AGE
sipgc-api-agrupamento-des-52-deploy   0/1       Completed   0             20d
sipgc-api-agrupamento-des-53-deploy   0/1       Completed   0             8d
sipgc-api-agrupamento-des-53-fnjsg    1/1       Running     0             8d
sipgc-api-informacoes-des-36-deploy   0/1       Completed   0             40h
sipgc-api-informacoes-des-37-deploy   0/1       Completed   0             17h
sipgc-api-informacoes-des-37-s9497    1/1       Running     0             17h
sipgc-api-membros-des-39-deploy       0/1       Completed   0             62d
sipgc-api-membros-des-40-deploy       0/1       Completed   0             41d
sipgc-api-membros-des-40-dts97        1/1       Running     0             41d
sipgc-api-papel-des-33-deploy         0/1       Completed   0             62d
sipgc-api-papel-des-34-deploy         0/1       Completed   0             8d
sipgc-api-papel-des-34-k2mdq          1/1       Running     0             8d
sipgc-api-portfolio-des-52-deploy     0/1       Completed   0             40h
sipgc-api-portfolio-des-53-deploy     0/1       Completed   0             23h
sipgc-api-portfolio-des-53-fgz8m      1/1       Running     0             23h
sipgc-api-seguranca-des-141-deploy    0/1       Completed   0             62d
sipgc-api-seguranca-des-142-deploy    0/1       Completed   0             43d
sipgc-api-seguranca-des-142-k6762     1/1       Running     0             43d
sipgc-front-des-195-deploy            0/1       Completed   0             19h
sipgc-front-des-196-deploy            0/1       Completed   0             18h
sipgc-front-des-196-rpz4h             2/2       Running     1 (18h ago)   18h
-sh-4.2$
