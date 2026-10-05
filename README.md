 sispx-des
* sispx-tqs
* thousandeyes
To see projects on another server, pass '--server=<server>'.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project simpi-des
Now using project "simpi-des" on server "https://api.pixnprd4.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                                        READY     STATUS      RESTARTS        AGE
simpi-api-resolve-pendencia-des-117-deploy                  0/1       Completed   0               40d
simpi-api-resolve-pendencia-des-118-9tpxb                   2/2       Running     3 (10h ago)     11d
simpi-api-resolve-pendencia-des-118-deploy                  0/1       Completed   0               11d
simpi-cadastro-fluxo-des-51-deploy                          0/1       Completed   0               25d
simpi-cadastro-fluxo-des-52-deploy                          0/1       Completed   0               24d
simpi-cadastro-fluxo-des-52-vrfkp                           2/2       Running     11 (10h ago)    24d
simpi-container-dict-des-567-deploy                         0/1       Completed   0               18d
simpi-container-dict-des-568-d9d6d                          2/2       Running     0               7d5h
simpi-container-dict-des-568-deploy                         0/1       Completed   0               7d5h
simpi-dict-api-des-134-deploy                               0/1       Completed   0               4d6h
simpi-dict-api-des-135-2l458                                2/2       Running     0               4d5h
simpi-dict-api-des-135-deploy                               0/1       Completed   0               4d5h
simpi-dict-api-des-136-deploy                               0/1       Error       0               117m
simpi-dict-api-des-137-deploy                               0/1       Error       0               85m
simpi-envio-pagamento-interno-des-101-deploy                0/1       Completed   0               5d
simpi-envio-pagamento-interno-des-102-6jrh2                 2/2       Running     0               3d
simpi-envio-pagamento-interno-des-102-deploy                0/1       Completed   0               3d
simpi-med-des-95-deploy                                     0/1       Completed   0               31d
simpi-med-des-96-deploy                                     0/1       Completed   0               25d
simpi-med-des-96-rrr9s                                      2/2       Running     0               25d
simpi-mensageria-automatico-dlq-des-51-deploy               0/1       Completed   0               44d
simpi-mensageria-automatico-dlq-des-52-8ktpl                2/2       Running     0               3d
simpi-mensageria-automatico-dlq-des-52-deploy               0/1       Completed   0               3d
simpi-mensageria-envio-administrativo-des-211-deploy        0/1       Completed   0               40d
simpi-mensageria-envio-administrativo-des-212-cr9mp         2/2       Running     12 (10h ago)    40d
simpi-mensageria-envio-administrativo-des-212-deploy        0/1       Completed   0               40d
simpi-mensageria-envio-automatico-des-291-deploy            0/1       Completed   0               4d2h
simpi-mensageria-envio-automatico-des-292-7jh2t             2/2       Running     0               3d
simpi-mensageria-envio-automatico-des-292-deploy            0/1       Completed   0               3d
simpi-mensageria-envio-secundario-des-229-deploy            0/1       Completed   0               40d
simpi-mensageria-envio-transacional-des-400-deploy          0/1       Completed   0               40d
simpi-mensageria-envio-transacional-des-401-6zlsv           2/2       Running     12 (10h ago)    34d
simpi-mensageria-envio-transacional-des-401-deploy          0/1       Completed   0               40d
simpi-mensageria-expiradas-des-60-deploy                    0/1       Completed   0               100d
simpi-mensageria-expiradas-des-61-deploy                    0/1       Completed   0               94d
simpi-mensageria-expiradas-des-61-sk67r                     2/2       Running     46 (10h ago)    94d
simpi-mensageria-recebimento-automatico-des-125-deploy      0/1       Completed   0               5d
simpi-mensageria-recebimento-automatico-des-126-deploy      0/1       Completed   0               3d
simpi-mensageria-recebimento-automatico-des-126-wzlzb       2/2       Running     4 (10h ago)     3d
simpi-mensageria-recebimento-des-95-deploy                  0/1       Completed   0               46d
simpi-mensageria-recebimento-des-96-deploy                  0/1       Completed   0               9d
simpi-mensageria-recebimento-des-96-mmwxm                   2/2       Running     5 (10h ago)     9d
simpi-mensageria-recebimento-secundario-des-143-deploy      0/1       Completed   0               40d
simpi-mensageria-retorno-administrativas-des-164-deploy     0/1       Completed   0               32d
simpi-mensageria-retorno-administrativas-des-165-85v8s      2/2       Running     8 (10h ago)     31d
simpi-mensageria-retorno-administrativas-des-165-deploy     0/1       Completed   0               31d
simpi-mensageria-retorno-canceladas-des-116-deploy          0/1       Completed   0               39d
simpi-mensageria-retorno-canceladas-des-117-deploy          0/1       Completed   0               38d
simpi-mensageria-retorno-canceladas-des-117-fzpm8           2/2       Running     6 (10h ago)     25d
simpi-mensageria-retorno-canceladas-des-118-deploy          0/1       Error       0               9d
simpi-mensageria-retorno-canceladas-des-119-deploy          0/1       Error       0               5d21h
simpi-mensageria-retorno-des-193-deploy                     0/1       Completed   0               7d1h
simpi-mensageria-retorno-des-194-deploy                     0/1       Completed   0               7d
simpi-mensageria-retorno-des-194-scwhh                      2/2       Running     4 (10h ago)     7d
simpi-mensageria-roteador-automatico-des-72-deploy          0/1       Completed   0               4d2h
simpi-mensageria-roteador-automatico-des-73-deploy          0/1       Completed   0               3d
simpi-mensageria-roteador-automatico-des-73-kgbl2           2/2       Running     0               3d
simpi-pix-batch-des-150-deploy                              0/1       Completed   0               3d3h
simpi-pix-batch-des-151-deploy                              0/1       Completed   0               3d3h
simpi-pix-batch-des-151-hjznn                               2/2       Running     85 (59m ago)    3d3h
simpi-pix-batch-secundario-des-115-deploy                   0/1       Completed   0               48d
simpi-pix-batch-secundario-des-116-deploy                   0/1       Completed   0               3d3h
simpi-pix-batch-secundario-des-116-s595z                    2/2       Running     3 (10h ago)     3d3h
simpi-pix-carga-bacen-des-154-deploy                        0/1       Completed   0               4d22h
simpi-pix-carga-bacen-des-155-5f5kd                         2/2       Running     2 (2d15h ago)   2d23h
simpi-pix-carga-bacen-des-155-deploy                        0/1       Completed   0               2d23h
simpi-pix-contabil-des-41-deploy                            0/1       Completed   0               81d
simpi-pix-contabil-des-42-d5nzm                             2/2       Running     25 (10h ago)    69d
simpi-pix-contabil-des-42-deploy                            0/1       Completed   0               69d
simpi-pix-frontend-des-107-deploy                           0/1       Completed   0               32d
simpi-pix-frontend-des-108-deploy                           0/1       Completed   0               32d
simpi-pix-frontend-des-108-jwggm                            3/3       Running     2 (32d ago)     32d
simpi-pix-gestao-batch-des-74-deploy                        0/1       Completed   0               3d2h
simpi-pix-gestao-batch-des-75-deploy                        0/1       Completed   0               3d2h
simpi-pix-gestao-des-383-deploy                             0/1       Completed   0               21d
simpi-pix-gestao-des-384-deploy                             0/1       Completed   0               3d3h
simpi-pix-gestao-des-384-zr2wp                              2/2       Running     0               3d3h
simpi-pix-mensageria-envio-sencundario-des-139-deploy       0/1       Completed   0               4d2h
simpi-pix-mensageria-envio-sencundario-des-140-2xmxr        2/2       Running     1 (10h ago)     3d5h
simpi-pix-mensageria-envio-sencundario-des-140-deploy       0/1       Completed   0               3d5h
simpi-pix-mensageria-recebimento-secundario-des-40-deploy   0/1       Completed   0               35d
simpi-pix-mensageria-recebimento-secundario-des-41-deploy   0/1       Completed   0               3d2h
simpi-pix-mensageria-recebimento-secundario-des-41-dttcc    2/2       Running     3 (10h ago)     3d2h
simpi-pix-polling-primario-des-67-deploy                    0/1       Completed   0               40d
simpi-pix-polling-primario-des-68-dcdkk                     2/2       Running     0               31d
simpi-pix-polling-primario-des-68-deploy                    0/1       Completed   0               39d
simpi-pix-polling-secundario-des-35-deploy                  0/1       Completed   0               37d
simpi-pix-polling-secundario-des-36-982jp                   2/2       Running     0               37d
simpi-pix-polling-secundario-des-36-deploy                  0/1       Completed   0               37d
simpi-pix-processador-xml-primario-des-125-deploy           0/1       Completed   0               40d
simpi-pix-processador-xml-primario-des-126-2qkxn            2/2       Running     11 (10h ago)    25d
simpi-pix-processador-xml-primario-des-126-deploy           0/1       Completed   0               40d
simpi-pix-processador-xml-secundario-des-51-deploy          0/1       Completed   0               40d
simpi-pix-processador-xml-secundario-des-52-deploy          0/1       Completed   0               13d
simpi-pix-processador-xml-secundario-des-52-q92bt           2/2       Running     5 (10h ago)     13d
simpi-pix-relatorio-des-209-deploy                          0/1       Completed   0               5d5h
simpi-pix-relatorio-des-210-deploy                          0/1       Completed   0               6h23m
simpi-pix-relatorio-des-210-nv7kr                           2/2       Running     0               6h23m
simpi-pix-resolve-pendencia-des-64-6hglm                    2/2       Running     0               101d
simpi-pix-roteador-backend-des-39-deploy                    0/1       Completed   0               56d
simpi-pix-roteador-backend-des-40-4dn4j                     2/2       Running     2 (27d ago)     56d
simpi-pix-roteador-backend-des-40-deploy                    0/1       Completed   0               56d
simpi-pix-roteador-frontend-des-52-deploy                   0/1       Completed   0               83d
simpi-pix-roteador-frontend-des-53-deploy                   0/1       Completed   0               59d
simpi-pix-roteador-frontend-des-53-vrcd6                    3/3       Running     2 (59d ago)     59d
simpi-pix-simulador-icom-des-26-deploy                      0/1       Completed   0               90d
simpi-pix-simulador-icom-des-27-deploy                      0/1       Completed   0               83d
simpi-pix-simulador-icom-des-27-mkvhk                       2/2       Running     0               83d
simpi-processar-log-dict-des-12-wpn2s                       1/2       Running     0               107d
simpi-rate-limit-des-46-deploy                              0/1       Completed   0               32d
simpi-rate-limit-des-47-deploy                              0/1       Completed   0               32d
simpi-rate-limit-des-47-fxw5p                               2/2       Running     0               32d
simpi-resolve-pendencia-des-192-deploy                      0/1       Completed   0               102d
simpi-resolve-pendencia-des-193-deploy                      0/1       Completed   0               101d
simpi-retorno-pagamento-interno-des-28-deploy               0/1       Completed   0               5d
simpi-retorno-pagamento-interno-des-29-deploy               0/1       Completed   0               3d
simpi-retorno-pagamento-interno-des-29-hjrjj                2/2       Running     4 (10h ago)     3d
simpi-roteador-ambientes-des-90-deploy                      0/1       Completed   0               40d
simpi-roteador-ambientes-des-91-4l5k8                       2/2       Running     0               40d
simpi-roteador-ambientes-des-91-deploy                      0/1       Completed   0               40d
-sh-4.2$
