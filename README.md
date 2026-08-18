
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                        READY     STATUS            RESTARTS      AGE
sigfa-api-aplicacao-okd4-des-1149-deploy    0/1       Completed         0             30h
sigfa-api-aplicacao-okd4-des-1150-cwm5f     1/1       Running           0             22h
sigfa-api-aplicacao-okd4-des-1150-deploy    0/1       Completed         0             22h
sigfa-api-boletagem-des-89-deploy           0/1       Completed         0             11d
sigfa-api-boletagem-des-89-pzjnp            1/1       Running           0             11d
sigfa-api-extratos-des-15-deploy            0/1       Error             0             21m
sigfa-api-extratos-des-16-deploy            1/1       Running           0             12s
sigfa-api-extratos-des-16-m75ws             0/1       PodInitializing   0             9s
sigfa-api-fundos-okd4-des-103-deploy        0/1       Completed         0             21d
sigfa-api-fundos-okd4-des-104-deploy        0/1       Completed         0             20d
sigfa-api-fundos-okd4-des-104-xd2hg         1/1       Running           0             20d
sigfa-api-garantias-okd4-des-198-deploy     0/1       Completed         0             70d
sigfa-api-garantias-okd4-des-199-8tk24      1/1       Running           3 (69d ago)   70d
sigfa-api-garantias-okd4-des-199-deploy     0/1       Completed         0             70d
sigfa-api-movimentacoes-des-96-deploy       0/1       Completed         0             11d
sigfa-api-movimentacoes-des-97-bvn6b        1/1       Running           0             11d
sigfa-api-movimentacoes-des-97-deploy       0/1       Completed         0             11d
sigfa-api-openfinance-des-145-deploy        0/1       Completed         0             18d
sigfa-api-openfinance-des-146-deploy        0/1       Completed         0             18d
sigfa-api-openfinance-des-146-nvqng         1/1       Running           0             18d
sigfa-api-saldo-consolidado-des-51-deploy   0/1       Completed         0             13d
sigfa-api-saldo-consolidado-des-52-deploy   0/1       Completed         0             12d
sigfa-api-saldo-consolidado-des-52-lb8s2    1/1       Running           0             12d
sigfa-api-saldos-des-14-qbwls               1/1       Running           1             426d
sigfa-batch-processamento-des-251-deploy    0/1       Completed         0             364d
sigfa-batch-processamento-des-251-h9njt     0/1       Init:0/2          0             39d
sigfa-frontend-angular-des-1-deploy         0/1       Completed         0             341d
sigfa-frontend-angular-des-1-l7fgk          2/2       Running           0             341d
sigfa-frontend-okd4-des-58-deploy           0/1       Completed         0             11d
sigfa-frontend-okd4-des-59-8cz6x            2/2       Running           0             30h
sigfa-frontend-okd4-des-59-deploy           0/1       Completed         0             30h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug pod/sigfa-api-extratos-des-16-m75ws -n sigfa-des -c sigfa-api-extratos-des}
error: the container "sigfa-api-extratos-des}" is not a valid container name; must be one of [sigfa-api-extratos-des]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
