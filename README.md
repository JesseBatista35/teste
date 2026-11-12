
-sh-4.2$
-sh-4.2$ oc exec siinp-nucleo-tqs-651-w6hhb -c siinp-nucleo-tqs -n siinp-tqs -- ls -la /usr/src/app/secrets_files/
Error from server (NotFound): pods "siinp-nucleo-tqs-651-w6hhb" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project siinp-tqs
Now using project "siinp-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siinp-nucleo-tqs-651-w6hhb -c siinp-nucleo-tqs -n siinp-tqs -- env | grep -i SMALLRYE
Error from server (NotFound): pods "siinp-nucleo-tqs-651-w6hhb" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                        READY     STATUS      RESTARTS       AGE
siinp-api-pagamentos-tqs-49-deploy          0/1       Completed   0              82d
siinp-api-pagamentos-tqs-50-deploy          0/1       Completed   0              69d
siinp-api-pagamentos-tqs-50-wmgx2           1/1       Running     0              69d
siinp-api-pagamentos-tqs2-tqs-1-deploy      0/1       Completed   0              68d
siinp-api-pagamentos-tqs2-tqs-1-pz57z       1/1       Running     0              68d
siinp-api-participantes-tqs-1-deploy        0/1       Completed   0              86d
siinp-api-participantes-tqs-2-deploy        0/1       Completed   0              69d
siinp-api-participantes-tqs-2-gq5jf         1/1       Running     0              69d
siinp-api-participantes-tqs2-tqs-1-28xmq    1/1       Running     0              69d
siinp-api-participantes-tqs2-tqs-1-deploy   0/1       Completed   0              69d
siinp-api-vinculo-tqs-1-deploy              0/1       Completed   0              69d
siinp-api-vinculo-tqs-1-zxcrb               1/1       Running     0              69d
siinp-api-vinculo-tqs2-tqs-1-bvnjm          1/1       Running     0              68d
siinp-api-vinculo-tqs2-tqs-1-deploy         0/1       Completed   0              68d
siinp-api-webhook-tqs-1-deploy              0/1       Completed   0              84d
siinp-api-webhook-tqs-1-jmpfs               1/1       Running     0              84d
siinp-api-webhook-tqs2-tqs-1-deploy         0/1       Completed   0              69d
siinp-api-webhook-tqs2-tqs-1-lgxj4          1/1       Running     0              69d
siinp-gestao-tqs-344-deploy                 0/1       Completed   0              7d20h
siinp-gestao-tqs-345-deploy                 0/1       Completed   0              6d21h
siinp-gestao-tqs-345-td5tp                  1/1       Running     0              6d21h
siinp-gestao-web-tqs-105-deploy             0/1       Completed   0              71d
siinp-gestao-web-tqs-106-deploy             0/1       Completed   0              61d
siinp-gestao-web-tqs-106-nvng5              2/2       Running     0              61d
siinp-nucleo-tqs-646-deploy                 0/1       Completed   0              2d3h
siinp-nucleo-tqs-647-deploy                 0/1       Completed   0              2d2h
siinp-nucleo-tqs-647-krllq                  1/1       Running     1 (31m ago)    2d2h
siinp-nucleo-tqs-651-deploy                 0/1       Error       0              18h
siinp-nucleo-tqs2-tqs-56-deploy             0/1       Completed   0              91d
siinp-nucleo-tqs2-tqs-57-bg6sj              1/1       Running     0              84d
siinp-nucleo-tqs2-tqs-57-deploy             0/1       Completed   0              85d
siinp-nucleo-tqs2-tqs-57-jzzjc              1/1       Running     0              85d
siinp-nucleo-tqs2-tqs-57-rlvfn              1/1       Running     0              84d
siinp-nucleo-web-tqs-205-deploy             0/1       Completed   0              7d4h
siinp-nucleo-web-tqs-206-deploy             0/1       Completed   0              134m
siinp-nucleo-web-tqs-206-rlr6h              2/2       Running     2 (132m ago)   134m
siinp-nucleo-web-tqs2-tqs-69-deploy         0/1       Completed   0              90d
siinp-nucleo-web-tqs2-tqs-70-deploy         0/1       Completed   0              89d
siinp-nucleo-web-tqs2-tqs-70-xj22c          2/2       Running     0              89d
-sh-4.2$
