
You have access to 990 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "build-images-ads".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n <namespace-sipcs-des> get pods
-sh: namespace-sipcs-des: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sipcs-des
Now using project "sipcs-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                                   READY     STATUS      RESTARTS          AGE
sipcs-agencia-des-127-deploy                           0/1       Completed   0                 16d
sipcs-agencia-des-128-6v6ts                            1/1       Running     0                 16d
sipcs-agencia-des-128-deploy                           0/1       Completed   0                 16d
sipcs-anti-fraude-des-43-deploy                        0/1       Completed   0                 351d
sipcs-anti-fraude-des-44-deploy                        0/1       Completed   0                 238d
sipcs-anti-fraude-des-44-kbbxh                         1/1       Running     0                 238d
sipcs-anuidade-des-80-deploy                           0/1       Completed   0                 20d
sipcs-anuidade-des-81-deploy                           0/1       Completed   0                 17d
sipcs-anuidade-des-81-wq6jt                            1/1       Running     0                 17d
sipcs-api-cartao-caixa-tem-des-50-deploy               0/1       Completed   0                 328d
sipcs-api-cartao-caixa-tem-des-51-bjbr6                1/1       Running     0                 20d
sipcs-api-cartao-caixa-tem-des-51-deploy               0/1       Completed   0                 20d
sipcs-api-cartao-caixa-tem-des-51-s8q7k                1/1       Running     0                 20d
sipcs-api-cartao-caixa-tem-des-51-wc4wv                1/1       Running     0                 20d
sipcs-api-cliente-cartao-des-5-lvsk7                   1/1       Running     287 (5h53m ago)   208d
sipcs-auditoria-consome-des-57-deploy                  0/1       Completed   0                 123d
sipcs-auditoria-consome-des-58-7tx4k                   1/1       Running     0                 123d
sipcs-auditoria-consome-des-58-deploy                  0/1       Completed   0                 123d
sipcs-auditoria-produz-des-33-deploy                   0/1       Completed   0                 123d
sipcs-auditoria-produz-des-34-deploy                   0/1       Completed   0                 123d
sipcs-auditoria-produz-des-34-hvt64                    1/1       Running     0                 123d
sipcs-backend-sat-parametro-fornecedor-des-12-g8h9j    1/1       Running     0                 422d
sipcs-backend-sat-parametro-geral-des-3-x6cj7          1/1       Running     0                 368d
sipcs-bloqueio-des-114-deploy                          0/1       Completed   0                 16d
sipcs-bloqueio-des-115-deploy                          0/1       Completed   0                 16d
sipcs-bloqueio-des-115-zzz2t                           1/1       Running     0                 16d
sipcs-cartao-api-des-10-deploy                         0/1       Completed   0                 266d
sipcs-cartao-api-des-10-pt7p5                          1/1       Running     0                 266d
sipcs-cartao-des-16-7khb9                              1/1       Running     0                 364d
sipcs-cliente-comunicacao-des-92-deploy                0/1       Completed   0                 20d
sipcs-cliente-comunicacao-des-93-deploy                0/1       Completed   0                 7d
sipcs-cliente-comunicacao-des-93-r79pf                 1/1       Running     0                 7d
sipcs-cliente-dados-des-69-deploy                      0/1       Completed   0                 20d
sipcs-cliente-dados-des-70-deploy                      0/1       Completed   0                 20d
sipcs-cliente-dados-des-70-lb46j                       1/1       Running     0                 20d
sipcs-cliente-endereco-des-182-deploy                  0/1       Completed   0                 44d
sipcs-cliente-endereco-des-183-2j46h                   1/1       Running     0                 16d
sipcs-cliente-endereco-des-183-deploy                  0/1       Completed   0                 16d
sipcs-cobranca-parcelamento-des-103-deploy             0/1       Completed   0                 15d
sipcs-cobranca-parcelamento-des-104-9mjjj              1/1       Running     0                 10d
sipcs-cobranca-parcelamento-des-104-deploy             0/1       Completed   0                 11d
sipcs-cobranca-parcelamento-des-104-m92rp              1/1       Running     0                 11d
sipcs-cobranca-renegociacao-des-82-deploy              0/1       Completed   0                 3d4h
sipcs-cobranca-renegociacao-des-83-5x8v2               1/1       Running     0                 3d
sipcs-cobranca-renegociacao-des-83-deploy              0/1       Completed   0                 3d
sipcs-contabil-des-50-deploy                           0/1       Completed   0                 20d
sipcs-contabil-des-51-deploy                           0/1       Completed   0                 22h
sipcs-contabil-des-51-ngq4t                            1/1       Running     0                 22h
sipcs-contactless-des-50-deploy                        0/1       Completed   0                 16d
sipcs-contactless-des-51-deploy                        0/1       Completed   0                 16d
sipcs-contactless-des-51-hklbn                         1/1       Running     0                 16d
sipcs-contratacao-des-6-xqlcc                          1/1       Running     0                 359d
sipcs-digital-pay-criptografia-elo-des-14-deploy       0/1       Completed   0                 277d
sipcs-digital-pay-criptografia-elo-des-15-deploy       0/1       Completed   0                 195d
sipcs-digital-pay-criptografia-elo-des-15-m85r9        1/1       Running     0                 195d
sipcs-digital-pay-criptografia-visa-des-3-2m925        1/1       Running     0                 238d
sipcs-digital-pay-criptografia-visa-des-3-deploy       0/1       Completed   0                 238d
sipcs-digital-pay-des-118-deploy                       0/1       Completed   0                 217d
sipcs-digital-pay-des-119-6qrfm                        1/1       Running     0                 16d
sipcs-digital-pay-des-119-deploy                       0/1       Completed   0                 16d
sipcs-digital-pay-gestao-des-5-deploy                  0/1       Completed   0                 253d
sipcs-digital-pay-gestao-des-6-deploy                  0/1       Completed   0                 16d
sipcs-digital-pay-gestao-des-6-ptsll                   1/1       Running     0                 16d
sipcs-digital-pay-provisionamento-elo-des-78-deploy    0/1       Completed   0                 14d
sipcs-digital-pay-provisionamento-elo-des-79-cdvw6     1/1       Running     0                 14d
sipcs-digital-pay-provisionamento-elo-des-79-deploy    0/1       Completed   0                 14d
sipcs-digital-pay-provisionamento-visa-des-20-deploy   0/1       Completed   0                 77d
sipcs-digital-pay-provisionamento-visa-des-21-deploy   0/1       Completed   0                 67d
sipcs-digital-pay-provisionamento-visa-des-21-n2nct    1/1       Running     0                 67d
sipcs-digital-pay-vcas-des-69-deploy                   0/1       Completed   0                 346d
sipcs-digital-pay-vcas-des-70-deploy                   0/1       Completed   0                 20d
sipcs-digital-pay-vcas-des-70-hxcw7                    1/1       Running     0                 20d
sipcs-elo-standin-des-142-deploy                       0/1       Completed   0                 154d
sipcs-elo-standin-des-143-deploy                       0/1       Completed   0                 154d
sipcs-elo-standin-des-143-dwkpl                        1/1       Running     0                 92d
sipcs-elo-standin-des-144-deploy                       0/1       Error       0                 16d
sipcs-embossing-des-15-deploy                          0/1       Completed   0                 216d
sipcs-embossing-des-16-deploy                          0/1       Completed   0                 207d
sipcs-embossing-des-16-q2w7q                           1/1       Running     0                 207d
sipcs-fatura-des-47-deploy                             0/1       Completed   0                 20h
sipcs-fatura-des-48-deploy                             0/1       Completed   0                 20h
sipcs-fatura-des-48-dtjt8                              1/1       Running     0                 20h
sipcs-fatura-formato-des-160-deploy                    0/1       Completed   0                 339d
sipcs-fatura-formato-des-161-deploy                    0/1       Completed   0                 20d
sipcs-fatura-formato-des-161-kkrgb                     1/1       Running     0                 20d
sipcs-fatura-pagamento-des-199-deploy                  0/1       Completed   0                 6d20h
sipcs-fatura-pagamento-des-200-2f5wz                   1/1       Running     0                 6d18h
sipcs-fatura-pagamento-des-200-deploy                  0/1       Completed   0                 6d18h
sipcs-gestao-des-242-deploy                            0/1       Completed   0                 3h44m
sipcs-gestao-des-243-deploy                            0/1       Completed   0                 3h41m
sipcs-gestao-des-243-kwrj8                             1/1       Running     0                 3h41m
sipcs-id-positiva-des-65-deploy                        0/1       Completed   0                 197d
sipcs-id-positiva-des-66-deploy                        0/1       Completed   0                 16d
sipcs-id-positiva-des-66-rskm5                         1/1       Running     0                 16d
sipcs-idpay-unico-des-23-deploy                        0/1       Completed   0                 147d
sipcs-idpay-unico-des-24-deploy                        0/1       Completed   0                 16d
sipcs-idpay-unico-des-24-p6mvz                         1/1       Running     0                 16d
sipcs-internacional-des-170-deploy                     0/1       Completed   0                 17d
sipcs-internacional-des-171-deploy                     0/1       Completed   0                 16d
sipcs-internacional-des-171-mglrb                      1/1       Running     0                 16d
sipcs-lab-core-microfront-des-19-hj8fs                 2/2       Running     0                 397d
sipcs-lab-loginunico-des-14-zslkx                      2/2       Running     0                 103d
sipcs-limite-des-68-deploy                             0/1       Completed   0                 6d22h
sipcs-limite-des-69-555vd                              1/1       Running     0                 6d22h
sipcs-limite-des-69-6895s                              1/1       Running     0                 6d22h
sipcs-limite-des-69-6wwtn                              1/1       Running     0                 6d22h
sipcs-limite-des-69-deploy                             0/1       Completed   0                 6d22h
sipcs-login-unico-jboss-okd-des-13-deploy              0/1       Completed   0                 6d20h
sipcs-login-unico-jboss-okd-des-14-7jk5f               1/1       Running     0                 6d20h
sipcs-login-unico-jboss-okd-des-14-deploy              0/1       Completed   0                 6d20h
sipcs-loginunico-des-9-deploy                          0/1       Completed   0                 412d
sipcs-loginunico-des-9-wmb5d                           1/1       Running     7 (2m28s ago)     23m
sipcs-multiplo-des-71-deploy                           0/1       Completed   0                 17d
sipcs-multiplo-des-72-deploy                           0/1       Completed   0                 16d
sipcs-multiplo-des-72-rl2zf                            1/1       Running     0                 16d
sipcs-openbanking-des-94-deploy                        0/1       Completed   0                 48d
sipcs-openbanking-des-95-deploy                        0/1       Completed   0                 37d
sipcs-openbanking-des-95-mg4qf                         1/1       Running     0                 37d
sipcs-openfinance-bfm-des-11-deploy                    0/1       Completed   0                 265d
sipcs-openfinance-bfm-des-12-csf5s                     1/1       Running     0                 212d
sipcs-openfinance-bfm-des-12-deploy                    0/1       Completed   0                 212d
sipcs-painel-sia-autorizacoes-des-80-deploy            0/1       Completed   0                 213d
sipcs-painel-sia-autorizacoes-des-81-deploy            0/1       Completed   0                 17d
sipcs-painel-sia-autorizacoes-des-81-xnx9n             1/1       Running     0                 17d
sipcs-quick-start-des-49-deploy                        0/1       Completed   0                 132d
sipcs-quick-start-des-50-58tqp                         1/1       Running     0                 132d
sipcs-quick-start-des-50-deploy                        0/1       Completed   0                 132d
sipcs-quick-start-des-50-p76w8                         1/1       Running     0                 132d
sipcs-rastreio-des-38-deploy                           0/1       Completed   0                 20d
sipcs-rastreio-des-39-deploy                           0/1       Completed   0                 20d
sipcs-rastreio-des-39-wtrpb                            1/1       Running     0                 20d
sipcs-sat-webservice-des-48-deploy                     0/1       Completed   0                 244d
sipcs-sat-webservice-des-49-deploy                     0/1       Completed   0                 242d
sipcs-sat-webservice-des-49-s6nwm                      1/1       Running     0                 10d
sipcs-senha-des-71-deploy                              0/1       Error       0                 20d
sipcs-senha-des-72-9cnft                               1/1       Running     0                 14d
sipcs-senha-des-72-deploy                              0/1       Completed   0                 14d
sipcs-sia-autorizador-validador-des-8-deploy           0/1       Completed   0                 87d
sipcs-sia-autorizador-validador-des-8-k6bjr            1/1       Running     0                 87d
sipcs-transacao-des-62-deploy                          0/1       Completed   0                 168m
sipcs-transacao-des-63-2w97w                           1/1       Running     0                 48m
sipcs-transacao-des-63-deploy                          0/1       Completed   0                 48m
sipcs-vencimento-des-34-deploy                         0/1       Completed   0                 210d
sipcs-vencimento-des-35-deploy                         0/1       Completed   0                 20d
sipcs-vencimento-des-35-lhvxs                          1/1       Running     0                 20d
sipcs-virtual-des-250-deploy                           0/1       Completed   0                 7d5h
sipcs-virtual-des-251-deploy                           0/1       Completed   0                 7d
sipcs-virtual-des-251-rxf47                            1/1       Running     0                 7d
sipcs-whatsapp-envio-des-20-deploy                     0/1       Completed   0                 172d
sipcs-whatsapp-envio-des-21-deploy                     0/1       Completed   0                 172d
sipcs-whatsapp-envio-des-21-k8j5t                      1/1       Running     0                 172d
-sh-4.2$
-sh-4.2$
-sh-4.2$
