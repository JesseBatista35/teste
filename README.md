-sh-4.2$ oc get pod simpi-dict-api-des-12-2h7h2 -o jsonpath='{.spec.containers[*].name}{"\n"}'
Error from server (NotFound): pods "simpi-dict-api-des-12-2h7h2" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod simpi-dict-api-des-12-2h7h2 -n simpi-des
Error from server (NotFound): pods "simpi-dict-api-des-12-2h7h2" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs simpi-dict-api-des-12-2h7h2 -c simpi-dict-api-des -n simpi-des --previous
Error from server (NotFound): pods "simpi-dict-api-des-12-2h7h2" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs simpi-dict-api-des-12-2h7h2 -c <nome-sidecar-bt> -n simpi-des
-sh: nome-sidecar-bt: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec simpi-dict-api-des-12-2h7h2 -c simpi-dict-api-des -n simpi-des -- sh -c 'echo VAULT_LOCATION=$VAULT_LOCATION; ls -la $VAULT_LOCATION 2>&1; find /usr/src/app/secrets_files -type f 2>&1'
Error from server (NotFound): pods "simpi-dict-api-des-12-2h7h2" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n simpi-des -w
NAME                                                        READY     STATUS      RESTARTS   AGE
simpi-api-resolve-pendencia-des-112-deploy                  0/1       Completed   0          2h
simpi-api-resolve-pendencia-des-113-deploy                  0/1       Completed   0          1h
simpi-api-resolve-pendencia-des-113-xqsq8                   2/2       Running     0          1h
simpi-cadastro-fluxo-des-41-deploy                          0/1       Completed   0          35d
simpi-cadastro-fluxo-des-42-522tp                           2/2       Running     15         24d
simpi-cadastro-fluxo-des-42-deploy                          0/1       Completed   0          24d
simpi-container-dict-des-559-deploy                         0/1       Completed   0          10d
simpi-container-dict-des-560-deploy                         0/1       Completed   0          4d
simpi-container-dict-des-560-vq52j                          2/2       Running     0          4d
simpi-dict-api-des-12-deploy                                0/1       Error       0          11m
simpi-envio-pagamento-interno-des-95-deploy                 0/1       Completed   0          42d
simpi-envio-pagamento-interno-des-96-deploy                 0/1       Completed   0          38d
simpi-envio-pagamento-interno-des-96-wcqj7                  2/2       Running     5          38d
simpi-med-des-66-deploy                                     0/1       Completed   0          3d
simpi-med-des-67-86nnk                                      2/2       Running     0          1h
simpi-med-des-67-deploy                                     0/1       Completed   0          1h
simpi-mensageria-automatico-dlq-des-50-4hj45                2/2       Running     14         58d
simpi-mensageria-envio-administrativo-des-208-zzlhq         2/2       Running     58         58d
simpi-mensageria-envio-automatico-des-280-deploy            0/1       Completed   0          35d
simpi-mensageria-envio-automatico-des-281-2685b             2/2       Running     0          32d
simpi-mensageria-envio-automatico-des-281-deploy            0/1       Completed   0          32d
simpi-mensageria-envio-transacional-des-397-deploy          0/1       Completed   0          18d
simpi-mensageria-envio-transacional-des-397-x4xtk           2/2       Running     5          18d
simpi-mensageria-expiradas-des-60-deploy                    0/1       Completed   0          51d
simpi-mensageria-expiradas-des-61-deploy                    0/1       Completed   0          45d
simpi-mensageria-expiradas-des-61-sk67r                     2/2       Running     26         45d
simpi-mensageria-recebimento-automatico-des-121-deploy      0/1       Completed   0          44d
simpi-mensageria-recebimento-automatico-des-122-deploy      0/1       Completed   0          42d
simpi-mensageria-recebimento-automatico-des-122-f9x77       2/2       Running     21         42d
simpi-mensageria-recebimento-des-80-deploy                  0/1       Completed   0          53d
simpi-mensageria-recebimento-des-81-deploy                  0/1       Completed   0          52d
simpi-mensageria-recebimento-des-81-nfvlr                   2/2       Running     27         52d
simpi-mensageria-retorno-administrativas-des-156-deploy     0/1       Completed   0          6d
simpi-mensageria-retorno-administrativas-des-157-7f5dq      2/2       Running     2          4d
simpi-mensageria-retorno-administrativas-des-157-deploy     0/1       Completed   0          4d
simpi-mensageria-retorno-canceladas-des-108-deploy          0/1       Completed   0          32d
simpi-mensageria-retorno-canceladas-des-109-deploy          0/1       Completed   0          20d
simpi-mensageria-retorno-canceladas-des-109-lkrcg           2/2       Running     8          20d
simpi-mensageria-retorno-des-174-deploy                     0/1       Completed   0          5d
simpi-mensageria-retorno-des-175-deploy                     0/1       Completed   0          3d
simpi-mensageria-retorno-des-175-mmpkd                      2/2       Running     3          3d
simpi-mensageria-roteador-automatico-des-57-deploy          0/1       Completed   0          53d
simpi-mensageria-roteador-automatico-des-58-deploy          0/1       Completed   0          52d
simpi-mensageria-roteador-automatico-des-58-h8lmr           2/2       Running     0          52d
simpi-pix-batch-des-146-deploy                              0/1       Completed   0          9d
simpi-pix-batch-des-147-deploy                              0/1       Completed   0          35m
simpi-pix-batch-secundario-des-111-56x6k                    2/2       Running     26         58d
simpi-pix-carga-bacen-des-149-deploy                        0/1       Completed   0          27d
simpi-pix-carga-bacen-des-150-7j9x5                         2/2       Running     1          27d
simpi-pix-carga-bacen-des-150-deploy                        0/1       Completed   0          27d
simpi-pix-contabil-des-41-deploy                            0/1       Completed   0          32d
simpi-pix-contabil-des-42-d5nzm                             2/2       Running     7          20d
simpi-pix-contabil-des-42-deploy                            0/1       Completed   0          20d
simpi-pix-frontend-des-103-deploy                           0/1       Completed   0          25d
simpi-pix-frontend-des-104-8lmq5                            3/3       Running     2          6d
simpi-pix-frontend-des-104-deploy                           0/1       Completed   0          6d
simpi-pix-gestao-batch-des-71-deploy                        0/1       Completed   0          18d
simpi-pix-gestao-batch-des-72-deploy                        0/1       Completed   0          6d
simpi-pix-gestao-batch-des-72-wg4vk                         2/2       Running     1          6d
simpi-pix-gestao-des-377-deploy                             0/1       Completed   0          9d
simpi-pix-gestao-des-378-deploy                             0/1       Completed   0          9d
simpi-pix-gestao-des-378-llmjw                              2/2       Running     0          9d
simpi-pix-mensageria-envio-sencundario-des-92-deploy        0/1       Completed   0          49d
simpi-pix-mensageria-envio-sencundario-des-93-deploy        0/1       Completed   0          49d
simpi-pix-mensageria-envio-sencundario-des-93-th5ps         2/2       Running     9          49d
simpi-pix-mensageria-envio-sencundario-des-94-deploy        0/1       Error       0          36m
simpi-pix-mensageria-recebimento-secundario-des-38-deploy   0/1       Completed   0          5d
simpi-pix-mensageria-recebimento-secundario-des-39-8fjpx    2/2       Running     4          5d
simpi-pix-mensageria-recebimento-secundario-des-39-deploy   0/1       Completed   0          5d
simpi-pix-polling-primario-des-40-deploy                    0/1       Completed   0          4d
simpi-pix-polling-primario-des-41-bmht7                     2/2       Running     0          1d
simpi-pix-polling-primario-des-41-deploy                    0/1       Completed   0          1d
simpi-pix-polling-secundario-des-28-fl248                   2/2       Running     0          58d
simpi-pix-processador-xml-primario-des-107-deploy           0/1       Completed   0          53d
simpi-pix-processador-xml-primario-des-108-blnv4            2/2       Running     4          7d
simpi-pix-processador-xml-primario-des-108-deploy           0/1       Completed   0          52d
simpi-pix-processador-xml-secundario-des-49-deploy          0/1       Completed   0          53d
simpi-pix-processador-xml-secundario-des-50-deploy          0/1       Completed   0          52d
simpi-pix-processador-xml-secundario-des-50-rtfm5           2/2       Running     7          12d
simpi-pix-relatorio-des-195-deploy                          0/1       Completed   0          6d
simpi-pix-relatorio-des-196-deploy                          0/1       Completed   0          6d
simpi-pix-relatorio-des-196-f2zw7                           2/2       Running     3          6d
simpi-pix-resolve-pendencia-des-64-6hglm                    2/2       Running     0          52d
simpi-pix-roteador-backend-des-39-deploy                    0/1       Completed   0          6d
simpi-pix-roteador-backend-des-40-4dn4j                     2/2       Running     0          6d
simpi-pix-roteador-backend-des-40-deploy                    0/1       Completed   0          6d
simpi-pix-roteador-frontend-des-52-deploy                   0/1       Completed   0          34d
simpi-pix-roteador-frontend-des-53-deploy                   0/1       Completed   0          9d
simpi-pix-roteador-frontend-des-53-vrcd6                    3/3       Running     2          9d
simpi-pix-simulador-icom-des-26-deploy                      0/1       Completed   0          40d
simpi-pix-simulador-icom-des-27-deploy                      0/1       Completed   0          34d
simpi-pix-simulador-icom-des-27-mkvhk                       2/2       Running     0          34d
simpi-processar-log-dict-des-12-wpn2s                       2/2       Running     0          58d
simpi-rate-limit-des-39-deploy                              0/1       Completed   0          38d
simpi-rate-limit-des-39-xjrgt                               2/2       Running     0          38d
simpi-resolve-pendencia-des-192-deploy                      0/1       Completed   0          52d
simpi-resolve-pendencia-des-193-deploy                      0/1       Completed   0          52d
simpi-retorno-pagamento-interno-des-26-deploy               0/1       Completed   0          44d
simpi-retorno-pagamento-interno-des-27-5t2df                2/2       Running     22         42d
simpi-retorno-pagamento-interno-des-27-deploy               0/1       Completed   0          42d
simpi-roteador-ambientes-des-83-fctc9                       2/2       Running     0          46d

