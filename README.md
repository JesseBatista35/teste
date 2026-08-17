
Last login: Fri Aug 14 16:46:59 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~cWU-ELgpuSftRwB_nPdPtzdUC7c7Zxq4BLwKxfp2I1M --server=https://api.pixnprd4.caixa:6443
Logged into "https://api.pixnprd4.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 155 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project simpi-des
Now using project "simpi-des" on server "https://api.pixnprd4.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                                        READY     STATUS             RESTARTS        AGE
simpi-api-resolve-pendencia-des-112-deploy                  0/1       Completed          0               120m
simpi-api-resolve-pendencia-des-113-deploy                  0/1       Completed          0               114m
simpi-api-resolve-pendencia-des-113-xqsq8                   2/2       Running            0               114m
simpi-cadastro-fluxo-des-41-deploy                          0/1       Completed          0               35d
simpi-cadastro-fluxo-des-42-522tp                           2/2       Running            15 (7h7m ago)   24d
simpi-cadastro-fluxo-des-42-deploy                          0/1       Completed          0               24d
simpi-container-dict-des-559-deploy                         0/1       Completed          0               10d
simpi-container-dict-des-560-deploy                         0/1       Completed          0               4d13h
simpi-container-dict-des-560-vq52j                          2/2       Running            0               4d13h
simpi-dict-api-des-12-2h7h2                                 1/2       CrashLoopBackOff   6 (47s ago)     6m52s
simpi-dict-api-des-12-deploy                                1/1       Running            0               8m45s
simpi-envio-pagamento-interno-des-95-deploy                 0/1       Completed          0               42d
simpi-envio-pagamento-interno-des-96-deploy                 0/1       Completed          0               38d
simpi-envio-pagamento-interno-des-96-wcqj7                  2/2       Running            5 (18d ago)     38d
simpi-med-des-66-deploy                                     0/1       Completed          0               3d1h
simpi-med-des-67-86nnk                                      2/2       Running            0               85m
simpi-med-des-67-deploy                                     0/1       Completed          0               85m
simpi-mensageria-automatico-dlq-des-50-4hj45                2/2       Running            14 (30d ago)    58d
simpi-mensageria-envio-administrativo-des-208-zzlhq         2/2       Running            58 (7h7m ago)   58d
simpi-mensageria-envio-automatico-des-280-deploy            0/1       Completed          0               35d
simpi-mensageria-envio-automatico-des-281-2685b             2/2       Running            0               32d



o pod morre muit oprapido
