-sh-4.2$ oc get pods --all-namespaces | grep -i "not ready\|error\|crash"
build-images-ads                                   simkt-backend-143-build                                                 0/1       Error                        0                  38d
build-images-ads                                   simkt-backend-144-build                                                 0/1       Error                        0                  38d
build-images-ads                                   sipcs-digital-pay-19-build                                              0/1       Error                        0                  100d
build-images-ads                                   sipcs-digital-pay-20-build                                              0/1       Error                        0                  100d
build-images-ads                                   sipcs-digital-pay-21-build                                              0/1       Error                        0                  100d
build-images-ads                                   sipcs-digital-pay-22-build                                              0/1       Error                        0                  100d
build-images-ads                                   sipcs-digital-pay-23-build                                              0/1       Error                        0                  100d
connector-tqs                                      connector-tqs-2-9m5fr                                                   0/1       CrashLoopBackOff             273 (108s ago)     26h
fwc-des                                            fwc-bry-fw2-carimbo-des-18-ptbph                                        0/1       CrashLoopBackOff             7 (2m45s ago)      14m
fwc-des                                            fwc-bry-fw2-politica-des-22-2l9zd                                       0/1       CrashLoopBackOff             7 (2m48s ago)      14m
fwc-des                                            fwc-bry-fw2-repositorio-des-30-deploy                                   0/1       Error                        0                  46h
fwc-des                                            fwc-bry-fw2-repositorio-des-32-deploy                                   0/1       Error                        0                  46h
fwc-des                                            fwc-bry-fw2-validador-des-25-deploy                                     0/1       Error                        0                  46h
fwc-des                                            rabbitmq-cluster-des-0                                                  0/1       CrashLoopBackOff             7 (86s ago)        13m
fwc-tqs                                            fwc-bry-fw2-administrativo-tqs-10-deploy                                0/1       Error                        0                  196d
fwc-tqs                                            fwc-bry-fw2-administrativo-tqs-9-deploy                                 0/1       Error                        0                  196d
fwc-tqs                                            fwc-bry-fw2-politica-tqs-6-577jg                                        0/1       CrashLoopBackOff             7 (110s ago)       13m
fwc-tqs                                            fwc-bry-hub-signer-tqs-2-deploy                                         0/1       Error                        0                  196d
fwc-tqs                                            fwc-bry-hub-signer-tqs-3-deploy                                         0/1       Error                        0                  196d
fwc-tqs                                            fwc-nginx-caixa-tqs-1-deploy                                            0/1       Error                        0                  190d
infra-ia-des                                       mongodb-cluster-cfg-0                                                   1/2       CrashLoopBackOff             7 (115s ago)       13m
rook-ceph                                          rook-ceph-crashcollector-ceadecldlx011.nprd.caixa-5c594f74qbkrv         1/1       Running                      0                  359d
rook-ceph                                          rook-ceph-crashcollector-ceadecldlx012.nprd.caixa-845b77c6wzp9s         1/1       Running                      0                  359d
rook-ceph                                          rook-ceph-crashcollector-ceadecldlx013.nprd.caixa-5b9d9fc9wnmtz         1/1       Running                      0                  359d
rook-ceph                                          rook-ceph-crashcollector-ceadecldlx065.nprd.caixa-86f749fbgcl5b         1/1       Running                      0                  250d
rook-ceph                                          rook-ceph-crashcollector-ceadecldlx074.nprd.caixa-6847789dj9tmr         1/1       Running                      0                  340d
sample-des                                         sample-angular-des-10-deploy                                            0/1       Error                        0                  150d
sample-des                                         sample-angular-des-11-deploy                                            0/1       Error                        0                  150d
sample-tqs                                         sample-quarkus-tqs-12-deploy                                            0/1       Error                        0                  189d
siaas-des                                          siaas-web-des-214-deploy                                                0/1       Error                        0                  9d
siaas-hmp                                          siaas-api-hmp-1-deploy                                                  0/1       Error                        0                  119d
siaas-tqs                                          siaas-api-tqs-14-deploy                                                 0/1       Error                        0                  3d3h
siaas-tqs                                          siaas-api-tqs-15-deploy                                                 0/1       Error                        0                  2d22h
siabm-des                                          siabm-relatorio-api-des-211-deploy                                      0/1       Error                        0                  46d
siacc-tqs                                          siacc-pixautomatico-api-mensageria-tqs-4-deploy                         0/1       Error                        0                  88d
siacc-tqs                                          siacc-pixautomatico-batch-remessa-tqs-15-deploy                         0/1       Error                        0                  38d
siacg-des                                          siacg-cip-backend-des-32-deploy                                         0/1       Error                        0                  52d
siacg-des                                          siacg-garantias-api-des-299-deploy                                      0/1       Error                        0                  3d1h
siali-des                                          siali-des-esteiras-6-deploy                                             0/1       Error                        0                  30d
siali-tqs                                          siali-frontend-tqs-5-deploy                                             0/1       Error                        0                  2d5h
siapf-des                                          siapf-micro-des-24-deploy                                               0/1       Error                        0                  45d
siasc-des                                          siasc-imp-atualizacao-des-62-deploy                                     0/1       Error                        0                  36d
siasc-tqs                                          siasc-backend-internet-tqs-30-ksttp                                     0/1       CrashLoopBackOff             427 (3m59s ago)    32h
siatc-tqs                                          siatc-atendimento-mfe-tqs-106-deploy                                    0/1       Error                        0                  2d1h
siavl-des                                          siavl-minhasnotas-backend-des-276-deploy                                0/1       Error                        0                  14d
siavl-tqs                                          siavl-api-arquivos-tqs-9-9dgpq                                          0/1       CrashLoopBackOff             7 (2m29s ago)      13m
siavl-tqs                                          siavl-atdremoto-backend-tqs-348-deploy                                  0/1       Error                        0                  66d
siavl-tqs                                          siavl-atdremoto-backend-tqs-350-deploy                                  0/1       Error                        0                  11d
siavl-tqs                                          siavl-backend-tqs-43-deploy                                             0/1       Error                        0                  86d
siavl-tqs                                          siavl-backend-tqs-44-deploy                                             0/1       Error                        0                  58d
sibec-des                                          sibec-gestao-des-1-deploy                                               0/1       Error                        0                  2d23h
sibem-des                                          sibem-doacao-backend-intranet-des-1-deploy                              0/1       Error                        0                  71m
sibem-hmp                                          sibem-bens-preciosos-internet-backend-hmp-2-deploy                      0/1       Error                        0                  88d
sibem-hmp                                          sibem-bens-preciosos-internet-backend-hmp-3-deploy                      0/1       Error                        0                  87d
sibot-des                                          sibot-motororacle-sibot3-des-9-lzjls                                    0/1       CrashLoopBackOff             110 (3m32s ago)    8h
sicap-des                                          sicap-webhook-des-176-deploy                                            0/1       Error                        0                  15d
sicap-hmp                                          sicap-api-gerenciar-webhook-hmp-1-deploy                                0/1       Error                        0                  50d
sicbp-des                                          sicbp-resumo-mfe-des-33-deploy                                          0/1       Error                        0                  25h
sicbp-des                                          sicbp-trilhaauditoria-backend-des-64-deploy                             0/1       Error                        0                  47h
siccr-tqs                                          siccr-api-credito-consulta-proposta-tqs-10-deploy                       0/1       Error                        0                  178d
siccr-tqs                                          siccr-api-credito-consulta-proposta-tqs-11-deploy                       0/1       Error                        0                  177d
siccr-tqs                                          siccr-api-credito-consulta-proposta-tqs-8-deploy                        0/1       Error                        0                  178d
siccr-tqs                                          siccr-api-credito-consulta-proposta-tqs-9-deploy                        0/1       Error                        0                  178d
siccr-tqs                                          siccr-api-credito-desenrola-tqs-2-deploy                                0/1       Error                        0                  32d
siccr-tqs                                          siccr-api-credito-desenrola-tqs-3-deploy                                0/1       Error                        0                  31d
siced-tqs                                          siced-backend-tqs-69-deploy                                             0/1       Error                        0                  143d
siced-tqs                                          siced-backend-tqs-70-deploy                                             0/1       Error                        0                  139d
siced-tqs                                          siced-backend-tqs-71-deploy                                             0/1       Error                        0                  133d
siced-tqs                                          siced-backend-tqs-72-deploy                                             0/1       Error                        0                  112d
sicfd-hmp                                          sicfd-pgfn-hmp-1-deploy                                                 0/1       Error                        0                  17d
sicfd-tqs                                          sicfd-consignado-tqs-43-deploy                                          0/1       Error                        0                  18d
sicfd-tqs                                          sicfd-retificacao-financeira-tqs-59-deploy                              0/1       Error                        0                  9d
sicgr-des                                          sicgr-api-b3-des-10-gsnbd                                               0/1       CrashLoopBackOff             7 (2m18s ago)      13m
sicid-tqs                                          sicid-api-internet-tqs-20-deploy                                        0/1       Error                        0                  15d
sicim-des                                          sicim-frontend-intranet-des-5-deploy                                    0/1       Error                        0                  2d4h
sicli-des                                          sicli-enriquecimento-documentos-des-5-deploy                            0/1       Error                        0                  29d
sicli-des                                          sicli-enriquecimento-extratodoi-des-16-deploy                           0/1       Error                        0                  10d
sicli-tqs                                          sicli-enriquecimento-renda-tqs-1-deploy                                 0/1       Error                        0                  21d
sicli-tqs                                          sicli-gestao-cadastro-backend-tqs-54-cv6gc                              0/1       CrashLoopBackOff             7 (2m52s ago)      13m
sicmo-hmp                                          sicmo-backend-hmp-11-deploy                                             0/1       Error                        0                  196d
sicmo-hmp                                          sicmo-internet-hmp-11-deploy                                            0/1       Error                        0                  196d
sicow-des                                          sicow-seg-okd-des-14-deploy                                             0/1       Error                        0                  57d
sicow-des                                          sicow-seg-okd-des-15-deploy                                             0/1       Error                        0                  57d
sicow-des                                          sicow-seg-okd-des-16-deploy                                             0/1       Error                        0                  45d
sicow-des                                          sicow-seg-okd-des-17-deploy                                             0/1       Error                        0                  44d
sicow-des                                          sicow-seg-okd-des-18-deploy                                             0/1       Error                        0                  42d
sicow-des                                          sicow-seg-okd-des-19-deploy                                             0/1       Error                        0                  38d
sicow-des                                          sicow-seg-okd-des-20-deploy                                             0/1       Error                        0                  37d
sicow-des                                          sicow-seg-okd-des-21-deploy                                             0/1       Error                        0                  36d
sicow-tqs                                          sicow-nia-job-tqs-1-deploy                                              0/1       Error                        0                  36d
sicow-tqs                                          sicow-seg-job-tqs-1-deploy                                              0/1       Error                        0                  36d
sicpc-des                                          sicpc-frontend-des-18-deploy                                            0/1       Error                        0                  65d
sicpf-tqs                                          sicpf-backend-tqs-5-deploy                                              0/1       Error                        0                  76d
sicrb-des                                          sicrb-backend-intranet-jboss-des-3-deploy                               0/1       Error                        0                  31d
sicrb-des                                          sicrb-backend-intranet-jboss-des-4-deploy                               0/1       Error                        0                  31d
sicsd-hmp                                          sicsd-backend-hmp-2-deploy                                              0/1       Error                        0                  153d
sicsd-hmp                                          sicsd-frontend-hmp-8-deploy                                             0/1       Error                        0                  176d
sicsd-hmp                                          sicsd-frontend-hmp-9-deploy                                             0/1       Error                        0                  153d
sicsd-tqs                                          sicsd-backend-tqs-14-deploy                                             0/1       Error                        0                  125d
sicsd-tqs                                          sicsd-backend-tqs-15-deploy                                             0/1       Error                        0                  99d
sicve-des                                          sicve-vendas-backend-des-34-v8tqj                                       0/1       CrashLoopBackOff             7 (2m48s ago)      13m
sicve-hmp                                          sicve-hmp-1-wdt5l                                                       0/1       CrashLoopBackOff             29 (4m42s ago)     122m
sid01-tqs                                          sid01-api-tqs-5-deploy                                                  0/1       Error                        0                  70d
sid02-tqs                                          sid02-api-tqs-3-deploy                                                  0/1       Error                        0                  70d
sid09-tqs                                          sid09-api-tqs-3-deploy                                                  0/1       Error                        0                  71d
sid09-tqs                                          sid09-consultas-tqs-8-deploy                                            0/1       Error                        0                  58d
sidcx-tqs                                          sidcx-backend-quarkus-tqs-74-deploy                                     0/1       Error                        0                  128d
sidcx-tqs                                          sidcx-transferegov-api-tqs-136-deploy                                   0/1       Error                        0                  22h
sidcx-tqs                                          sidcx-transferegov-api-tqs-137-deploy                                   0/1       Error                        0                  21h
sidcx-tqs                                          sidcx-transferegov-api-tqs-138-deploy                                   0/1       Error                        0                  20h
sidcx-tqs                                          sidcx-transferegov-api-tqs-140-deploy                                   0/1       Error                        0                  20h
sidcx-tqs                                          sidcx-transferegov-api-tqs-141-deploy                                   0/1       Error                        0                  4h50m
sidcx-tqs                                          sidcx-transferegov-api-tqs-142-deploy                                   0/1       Error                        0                  4h40m
sidda-des                                          sidda-api-des-97-deploy                                                 0/1       Error                        0                  13d
sidda-hmp                                          sidda-api-hmp-34-deploy                                                 0/1       Error                        0                  151d
sidda-tqs                                          sidda-api-tqs-17-deploy                                                 0/1       Error                        0                  20d
sidre-des                                          sidre-api-des-6-fq46d                                                   0/1       CrashLoopBackOff             6 (14s ago)        13m
sidre-des                                          sidre-des-1-2fjzj                                                       0/1       CrashLoopBackOff             109 (3m5s ago)     8h
sidun-hmp                                          sidun-api-faturamento-hmp-5-9vxqx                                       0/1       CrashLoopBackOff             7 (2m7s ago)       13m
sidun-tqs                                          sidun-api-inclusao-tqs-3-nzqq4                                          0/1       Error                        7 (5m44s ago)      13m
siecm-des                                          siecm-backend-des-103-deploy                                            0/1       Error                        0                  106d
siecm-des                                          siecm-batch-des-24-deploy                                               0/1       Error                        0                  36d
siehc-tqs                                          siehc-frontend-tqs-29-deploy                                            0/1       Error                        0                  94d
siele-hmp                                          siele-hmp-1-thv2m                                                       0/1       CrashLoopBackOff             6 (18s ago)        13m
siemp-des                                          siemp-custeio-renovavel-des-83-deploy                                   0/1       Error                        0                  127d
siemp-des                                          siemp-custeio-renovavel-des-85-deploy                                   0/1       Error                        0                  101d
siepa-des                                          siepa-btc-des-1-deploy                                                  0/1       Error                        0                  100d
siepa-des                                          siepa-btc-des-2-deploy                                                  0/1       Error                        0                  100d
siepa-tqs                                          siepa-processor-tqs-30-deploy                                           0/1       Error                        0                  15d
siepr-tqs                                          siepr-backend-tqs-81-deploy                                             0/1       Error                        0                  120d
sievj-des                                          sievj-api-portal-des-7-8gkbf                                            0/1       CrashLoopBackOff             1301 (3m16s ago)   4d2h
sifap-hmp                                          sifap-intranet-backend-hmp-114-deploy                                   0/1       Error                        0                  3d8h
sifmp-des                                          sifmp-api-aplicacao-des-1-deploy                                        0/1       Error                        0                  31d
sifpp-tqs                                          sifpp-frontend-tqs-1-deploy                                             0/1       Error                        0                  28d
sifpp-tqs                                          sifpp-frontend-tqs-2-deploy                                             0/1       Error                        0                  27d
sifrs-tqs                                          sifrs-tqs-27-deploy                                                     0/1       Error                        0                  179d
sifug-des                                          sifug-siofg-api-des-284-deploy                                          0/1       Error                        0                  26m
sifug-hmp                                          sifug-siofg-api-hmp-144-deploy                                          0/1       Error                        0                  31d
sifug-tqs                                          sifug-siofg-api-tqs-136-deploy                                          0/1       Error                        0                  30d
sifug-tqs                                          sifug-siofg-api-tqs-137-deploy                                          0/1       Error                        0                  30d
sifug-tqs                                          sifug-siofg-api-tqs-138-deploy                                          0/1       Error                        0                  17d
sifug-tqs                                          sifug-siofg-api-tqs-139-deploy                                          0/1       Error                        0                  16d
sifug-tqs                                          sifug-siofg-micro-tqs-30-deploy                                         0/1       Error                        0                  17d
sifug-tqs                                          sifug-siofg-micro-tqs-31-deploy                                         0/1       Error                        0                  16d
sigcn-des                                          sigcn-celular-seguro-des-47-8sslw                                       0/1       CrashLoopBackOff             7 (10s ago)        13m
sigcn-des                                          sigcn-worker-des-63-deploy                                              0/1       Error                        0                  106d
sigcn-hmp                                          sigcn-worker-hmp-1-deploy                                               0/1       Error                        0                  158d
sigcn-hmp                                          sigcn-worker-hmp-2-deploy                                               0/1       Error                        0                  157d
sigcn-tqs                                          sigcn-backend-tqs-1-deploy                                              0/1       Error                        0                  121d
sigcn-tqs                                          sigcn-backend-tqs-2-deploy                                              0/1       Error                        0                  17d
sigcx-tqs                                          sigcx-api-middleware-tqs-1-deploy                                       0/1       Error                        0                  168d
sigdd-tqs                                          sigdd-backend-tqs-4-drl5v                                               0/1       CrashLoopBackOff             7 (2m29s ago)      13m
sigec-des                                          sigec-por-online-des-10-deploy                                          0/1       Error                        0                  153d
sigec-hmp                                          sigec-csc-frontend-hmp-21-deploy                                        0/1       Error                        0                  50d
sigec-hmp                                          sigec-por-openfinance-hmp-10-vnjkd                                      0/1       CrashLoopBackOff             7 (2m20s ago)      13m
sigec-hmp                                          sigec-por-opf-ted-hmp-1-deploy                                          0/1       Error                        0                  112d
sigec-tqs                                          sigec-por-openfinance-ted-batch-tqs-1-deploy                            0/1       Error                        0                  176d
sigec-tqs                                          sigec-por-openfinance-ted-batch-tqs-2-deploy                            0/1       Error                        0                  175d
sigec-tqs                                          sigec-por-openfinance-tqs-17-deploy                                     0/1       Error                        0                  122d
sigec-tqs                                          sigec-por-opf-ted-tqs-1-deploy                                          0/1       Error                        0                  128d
sigec-tqs                                          sigec-por-opf-ted-tqs-2-deploy                                          0/1       Error                        0                  120d
sigel-des                                          sigel-arquivos-bacen-des-179-deploy                                     0/1       Error                        0                  17d
sigfa-des                                          sigfa-api-aplicacao-okd4-des-1111-dt52z                                 0/1       CrashLoopBackOff             5 (107s ago)       8m10s
sigfa-des                                          sigfa-batch-processamento-des-251-lmnc5                                 0/1       Init:CrashLoopBackOff        23533 (81s ago)    297d
sigms-des                                          sigms-processo-serial-des-112-deploy                                    0/1       Error                        0                  21d
sigms-des                                          sigms-processo-serial-des-113-deploy                                    0/1       Error                        0                  20d
sigpf-des                                          sigpf-servicos-des-748-deploy                                           0/1       Error                        0                  3d22h
sigpf-tqs                                          sigpf-servicos-tqs-94-deploy                                            0/1       Error                        0                  6h38m
sigpf-tqs                                          sigpf-servicos-tqs-96-deploy                                            0/1       Error                        0                  6h12m
sigpi-tqs                                          sigpi-termo-risco-tqs-23-deploy                                         0/1       Error                        0                  2d1h
sigsj-des                                          sigsj-destinacao-des-128-deploy                                         0/1       Error                        0                  7d4h
sigsj-hmp                                          sigsj-backend-publico-hmp-2-deploy                                      0/1       Error                        0                  106d
sigsj-hmp                                          sigsj-frontend-hmp-16-deploy                                            0/1       Error                        0                  141d
sigsj-hmp                                          sigsj-frontend-hmp-17-deploy                                            0/1       Error                        0                  87d
sigsj-hmp                                          sigsj-frontend-hmp-18-deploy                                            0/1       Error                        0                  52d
sigsj-hmp                                          sigsj-frontend-hmp-19-deploy                                            0/1       Error                        0                  24d
sigsj-tqs                                          sigsj-notificacao-tqs-33-deploy                                         0/1       Error                        0                  31d
sigsr-des                                          sigsr-backend-des-6-lxbwl                                               0/1       CrashLoopBackOff             29 (4m20s ago)     122m
sigsr-tqs                                          sigsr-backend-tqs-3-qlfs4                                               0/1       CrashLoopBackOff             29 (2m39s ago)     121m
sigts-des                                          sigts-seguridade-okd4-des-5-deploy                                      0/1       Error                        0                  29h
sigts-des                                          sigts-seguridade-okd4-des-6-deploy                                      0/1       Error                        0                  28h
sihoj-des                                          sihoj-conquiste-backend-des-15-s24lf                                    0/1       CrashLoopBackOff             7 (2m32s ago)      13m
sihoj-des                                          sihoj-painelatendimento-microfront-des2-des-7-deploy                    0/1       Error                        0                  176d
siico-des                                          siico-api-cbo-des-74-deploy                                             0/1       Error                        0                  9d
siico-des                                          siico-api-cbo-des-75-deploy                                             0/1       Error                        0                  9d
siico-des                                          siico-api-cbo-des-76-deploy                                             0/1       Error                        0                  9d
siico-des                                          siico-api-cbo-des-77-deploy                                             0/1       Error                        0                  8d
siico-des                                          siico-api-cbo-des-78-deploy                                             0/1       Error                        0                  3d
siico-des                                          siico-api-cbo-des-79-deploy                                             0/1       Error                        0                  3d
siife-tqs                                          siife-backend-tqs-42-deploy                                             0/1       Error                        0                  86d
siifx-tqs                                          siifx-api-aplicacao-pos-tqs-118-wcbkm                                   0/1       CreateContainerConfigError   0                  3d
siinp-des                                          siinp-batch-des-8-vg7dd                                                 0/1       CrashLoopBackOff             7 (113s ago)       13m
siinp-tqs                                          siinp-nucleo-tqs-510-deploy                                             0/1       Error                        0                  25h
siint-des                                          siint-visamtt-des-19-deploy                                             0/1       Error                        0                  177d
siint-tqs                                          siint-frontend-tqs-1-hg8p5                                              0/2       CrashLoopBackOff             14 (2m24s ago)     13m
siiso-des                                          siiso-informacoes-sociais-api-des-4-deploy                              0/1       Error                        0                  24d
siiso-tqs                                          siiso-internet-tqs-4-f4dnl                                              0/1       CrashLoopBackOff             111 (3m41s ago)    8h
siivg-des                                          siivg-monolito-des-30-deploy                                            0/1       Error                        0                  214d
siivg-des                                          siivg-monolito-des-31-deploy                                            0/1       Error                        0                  211d
sijur-hmp                                          sijur-publicacoes-backend-hmp-11-deploy                                 0/1       Error                        0                  30d
sijur-hmp                                          sijur-publicacoes-backend-hmp-12-deploy                                 0/1       Error                        0                  30d
sijur-tqs                                          sijur-publicacoes-backend-tqs-46-deploy                                 0/1       Error                        0                  30d
silic-hmp                                          silic-v2-backend-hmp-1-deploy                                           0/1       Error                        0                  64d
silic-hmp                                          silic-v2-backend-hmp-2-deploy                                           0/1       Error                        0                  48d
simcn-tqs                                          simcn-backend-tqs-2-deploy                                              0/1       Error                        0                  26h
simil-des                                          simil-precificacao-batch-des-19-deploy                                  0/1       Error                        0                  37d
simil-tqs                                          simil-precificacao-intranet-api-tqs-2-deploy                            0/1       Error                        0                  56d
simkt-des                                          simkt-backend-des-25-5sjxs                                              0/1       CrashLoopBackOff             7 (2m27s ago)      13m
simkt-des                                          simkt-backend-des-32-deploy                                             0/1       Error                        0                  38d
simkt-des                                          simkt-backend-des-33-deploy                                             0/1       Error                        0                  11d
simkt-tqs                                          simkt-backend-tqs-8-deploy                                              0/1       Error                        0                  38d
simov-des                                          simov-backend-des-490-deploy                                            0/1       Error                        0                  16d
simpi-des                                          simpi-mensageria-recebimento-automatico-des-5-p5vw5                     0/1       CrashLoopBackOff             7 (94s ago)        13m
simpr-des                                          simpr-batch-des-382-deploy                                              0/1       Error                        0                  33m
simpr-des                                          simpr-batch-des-383-deploy                                              0/1       Error                        0                  22m
simsc-tqs                                          simsc-consultas-publicas-backend-tqs-8-deploy                           0/1       Error                        0                  199d
simsc-tqs                                          simsc-consultas-publicas-backend-tqs-9-deploy                           0/1       Error                        0                  198d
simtr-des                                          simtr-frontend-des-10-deploy                                            0/1       Error                        0                  87d
simtr-des                                          simtr-scheduler-des-44-deploy                                           0/1       Error                        0                  28h
simtr-des                                          simtr-template-api-des-7-deploy                                         0/1       Error                        0                  92d
simtr-hmp                                          simtr-dossie-produto-hmp-10-j82np                                       0/1       CrashLoopBackOff             7 (25s ago)        13m
simtr-hmp                                          simtr-gestao-documento-hmp-5-5z87t                                      0/1       CrashLoopBackOff             7 (28s ago)        13m
simtr-hmp                                          simtr-hub-outsourcing-hmp-4-4nrqz                                       0/1       Error                        7 (5m34s ago)      13m
simtr-hmp                                          simtr-parametrizacao-hmp-3-2spzl                                        0/1       CrashLoopBackOff             6 (2m25s ago)      13m
simtr-hmp                                          simtr-patriarca-hmp-3-m8l47                                             0/1       CrashLoopBackOff             6 (2m18s ago)      13m
simtr-hmp                                          simtr-scheduler-hmp-3-xgvr8                                             0/1       CrashLoopBackOff             7 (115s ago)       13m
simtx-des                                          simtx-cobranca-bancaria-des-1972-deploy                                 0/1       Error                        0                  13d
simtx-tqs                                          simtx-batch-tqs-3-deploy                                                0/1       Error                        0                  127d
simtx-tqs                                          simtx-batch-tqs-4-deploy                                                0/1       Error                        0                  94d
simtx-tqs                                          simtx-cobranca-bancaria-tqs-10-deploy                                   0/1       Error                        0                  112d
simtx-tqs                                          simtx-dda-api-tqs-1-deploy                                              0/1       Error                        0                  184d
simtx-tqs                                          simtx-pix-recorrente-tqs-3-deploy                                       0/1       Error                        0                  176d
simtx-tqs                                          simtx-pix-tqs-9-kn7zk                                                   0/1       CrashLoopBackOff             7 (2m30s ago)      13m
sinac-des                                          sinac-api-core-des-11-deploy                                            0/1       Error                        0                  24h
sinda-des                                          sinda-internet-backoffice-mtr-des-26-nqvbx                              0/1       CrashLoopBackOff             217 (2m33s ago)    16h
sineb-hmp                                          sineb-backend-hmp-5-cwqgg                                               0/1       CrashLoopBackOff             6 (4m29s ago)      13m
sinep-hmp                                          sinep-api-hmp-14-deploy                                                 0/1       Error                        0                  24d
sinop-des                                          sinop-motor-des-116-deploy                                              0/1       Error                        0                  3d21h
sinop-des                                          sinop-motor-des-117-deploy                                              0/1       Error                        0                  3d21h
sinop-hmp                                          sinop-teste-geqti-hmp-9-967ps                                           0/1       CrashLoopBackOff             217 (3m11s ago)    16h
sinop-tqs                                          sinop-teste-geqti-tqs-11-4thbw                                          0/1       CrashLoopBackOff             1489 (2m43s ago)   4d16h
sinot-hmp                                          sinot-inter-hmp-5-gcsdh                                                 0/1       CrashLoopBackOff             109 (2m48s ago)    8h
siobr-tqs                                          siobr-micro-tqs-53-deploy                                               0/1       Error                        0                  6d20h
siobr-tqs                                          siobr-micro-tqs-54-deploy                                               0/1       Error                        0                  6d20h
siobr-tqs                                          siobr-micro-tqs-55-deploy                                               0/1       Error                        0                  6d16h
siobr-tqs                                          siobr-micro-tqs-56-deploy                                               0/1       Error                        0                  6d16h
siobr-tqs                                          siobr-micro-tqs-57-deploy                                               0/1       Error                        0                  6d15h
siobr-tqs                                          siobr-micro-tqs-58-deploy                                               0/1       Error                        0                  24h
siobr-tqs                                          siobr-micro-tqs-59-deploy                                               0/1       Error                        0                  21h
siopi-des                                          siopi-simulado-des-13-deploy                                            0/1       Error                        0                  209d
siopi-des                                          siopi-simulado-des-14-deploy                                            0/1       Error                        0                  207d
siopi-tqs                                          siopi-simulado-tqs-5-deploy                                             0/1       Error                        0                  207d
sipbs-des                                          sipbs-internet-comunicacao-backend-des-152-deploy                       0/1       Error                        0                  4d3h
sipbs-des                                          sipbs-internet-micro-des-375-deploy                                     0/1       Error                        0                  23h
sipbs-des                                          sipbs-internet-micro-des-378-deploy                                     0/1       Error                        0                  21h
sipbs-des                                          sipbs-internet-micro-des-380-deploy                                     0/1       Error                        0                  4h59m
sipbs-des                                          sipbs-internet-micro-des-381-deploy                                     0/1       Error                        0                  4h43m
sipbs-hmp                                          sipbs-internet-comunicacao-backend-hmp-25-deploy                        0/1       Error                        0                  2d21h
sipcs-hmp                                          sipcs-idpay-unico-hmp-1-deploy                                          0/1       Error                        0                  199d
sipcs-tqs                                          sipcs-cartao-api-tqs-14-deploy                                          0/1       Error                        0                  133d
sipcs-tqs                                          sipcs-cartao-api-tqs-15-deploy                                          0/1       Error                        0                  127d
sipcs-tqs                                          sipcs-cliente-dados-tqs-27-deploy                                       0/1       Error                        0                  93d
sipcs-tqs                                          sipcs-cliente-endereco-tqs-23-deploy                                    0/1       Error                        0                  206d
sipcs-tqs                                          sipcs-contabil-tqs-6-jglfz                                              0/1       CrashLoopBackOff             7 (98s ago)        13m
sipcs-tqs                                          sipcs-fatura-pagamento-tqs-53-deploy                                    0/1       Error                        0                  108d
sipcs-tqs                                          sipcs-internacional-tqs-8-deploy                                        0/1       Error                        0                  25d
sipcs-tqs                                          sipcs-openbanking-tqs-3-deploy                                          0/1       Error                        0                  8d
sipcs-tqs                                          sipcs-openbanking-tqs-4-deploy                                          0/1       Error                        0                  8d
sipdi-des                                          sipdi-api-bff-canal-investimento-des-1-deploy                           0/1       Error                        0                  4d1h
sipdi-des                                          sipdi-api-bff-canal-investimento-des-2-deploy                           0/1       Error                        0                  4d1h
sipdi-des                                          sipdi-api-bff-control-passivo-des-5-deploy                              0/1       Error                        0                  25h
sipdi-des                                          sipdi-api-bff-control-passivo-des-6-deploy                              0/1       Error                        0                  6h34m
sipdi-des                                          sipdi-api-bff-segmento-des-8-deploy                                     0/1       Error                        0                  196d
sipdi-des                                          sipdi-api-bff-termo-des-5-deploy                                        0/1       Error                        0                  175d
sipdi-des                                          sipdi-api-bff-tipo-termo-des-3-deploy                                   0/1       Error                        0                  57d
sipdi-des                                          sipdi-api-bff-tipo-termo-des-4-deploy                                   0/1       Error                        0                  57d
sipdi-des                                          sipdi-api-bff-trilha-auditoria-des-5-deploy                             0/1       Error                        0                  193d
sipdi-tqs                                          sipdi-api-bff-termo-tqs-2-deploy                                        0/1       Error                        0                  176d
sipdi-tqs                                          sipdi-api-visao-unica-tqs-13-8pm4w                                      0/1       CreateContainerConfigError   0                  203d
sipen-des                                          sipen-javaweb-des-75-deploy                                             0/1       Error                        0                  129d
sipen-des                                          sipen-javaweb-des-76-deploy                                             0/1       Error                        0                  128d
siper-tqs                                          siper-api-tqs-3-deploy                                                  0/1       Error                        0                  217d
sipfb-tqs                                          sipfb-backend-tqs-88-jrnrs                                              0/1       Error                        7 (5m25s ago)      13m
sipnc-des                                          sipnc-conta2779-backend-des-95-deploy                                   0/1       Error                        0                  16d
sipnc-des                                          sipnc-contapedemeia-backend-des-74-deploy                               0/1       Error                        0                  7d5h
sipnc-hmp                                          sipnc-emissaocartao-backend-hmp-4-deploy                                0/1       Error                        0                  197d
sipnc-tqs                                          sipnc-catalogofundos-backend-tqs-26-deploy                              0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-cestaservicos-backend-tqs-61-deploy                               0/1       Error                        0                  43d
sipnc-tqs                                          sipnc-cestaservicos-backend-tqs-63-deploy                               0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-conta1460-backend-tqs-1-deploy                                    0/1       Error                        0                  91d
sipnc-tqs                                          sipnc-conta1460-backend-tqs-2-deploy                                    0/1       Error                        0                  91d
sipnc-tqs                                          sipnc-conta2779-backend-tqs-7-deploy                                    0/1       Error                        0                  29d
sipnc-tqs                                          sipnc-crot-backend-tqs-10-deploy                                        0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-crot-backend-tqs-11-deploy                                        0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-crot-backend-tqs-14-deploy                                        0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-crot-backend-tqs-9-w6cvd                                          0/1       CrashLoopBackOff             6 (3m37s ago)      13m
sipnc-tqs                                          sipnc-custodiaestoque-backend-tqs-15-deploy                             0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-custodiamov-backend-tqs-21-deploy                                 0/1       Error                        0                  37d
sipnc-tqs                                          sipnc-extratofundosinv-backend-tqs-56-deploy                            0/1       Error                        0                  21d
sipnc-tqs                                          sipnc-gestaousuario-backend-tqs-4-deploy                                0/1       Error                        0                  23d
sipnc-tqs                                          sipnc-manutconta1288-backend-tqs-2-9t6dt                                0/1       CreateContainerConfigError   3 (98d ago)        189d
sipnc-tqs                                          sipnc-manutconta2777-backend-tqs-4-deploy                               0/1       Error                        0                  15d
sipnc-tqs                                          sipnc-posicaohistorica-backend-tqs-11-deploy                            0/1       Error                        0                  37d
sippg-des                                          sippg-api-des-1435-deploy                                               0/1       Error                        0                  23h
sippg-des                                          sippg-web-des-560-deploy                                                0/1       Error                        0                  15d
sippg-tqs                                          sippg-web-tqs-412-deploy                                                0/1       Error                        0                  15d
siptn-tqs                                          siptn-backend-tqs-400-deploy                                            0/1       Error                        0                  37d
siptn-tqs                                          siptn-backend-tqs-403-deploy                                            0/1       Error                        0                  35d
siptn-tqs                                          siptn-backend-tqs-404-deploy                                            0/1       Error                        0                  35d
siptn-tqs                                          siptn-backend-tqs-405-deploy                                            0/1       Error                        0                  35d
siptn-tqs                                          siptn-backend-tqs-406-deploy                                            0/1       Error                        0                  32d
siptn-tqs                                          siptn-backend-tqs-407-deploy                                            0/1       Error                        0                  28d
siptn-tqs                                          siptn-backend-tqs-408-deploy                                            0/1       Error                        0                  24d
siptn-tqs                                          siptn-backend-tqs-409-deploy                                            0/1       Error                        0                  14d
siptn-tqs                                          siptn-backend-tqs-410-deploy                                            0/1       Error                        0                  2d22h
siptn-tqs                                          siptn-backend-tqs-411-deploy                                            0/1       Error                        0                  2d22h
siptn-tqs                                          siptn-backend-tqs-412-deploy                                            0/1       Error                        0                  2d21h
siptn-tqs                                          siptn-backend-tqs-413-deploy                                            0/1       Error                        0                  2d
siptn-tqs                                          siptn-backend-tqs-414-deploy                                            0/1       Error                        0                  29h
siptn-tqs                                          siptn-backend-tqs-415-deploy                                            0/1       Error                        0                  23h
siptn-tqs                                          siptn-backend-tqs-416-deploy                                            0/1       Error                        0                  22h
siptn-tqs                                          siptn-backend-tqs-417-deploy                                            0/1       Error                        0                  22h
siptn-tqs                                          siptn-backend-tqs-418-deploy                                            0/1       Error                        0                  22h
siptn-tqs                                          siptn-backend-tqs-419-deploy                                            0/1       Error                        0                  20h
siqpe-tqs                                          siqpe-frontend-tqs-3-tpdbr                                              0/2       CrashLoopBackOff             14 (2m24s ago)     13m
sired-des                                          sired-backend-intranet-des-99-deploy                                    0/1       Error                        0                  22h
sired-tqs                                          sired-backend-internet-tqs-29-deploy                                    0/1       Error                        0                  3d1h
sired-tqs                                          sired-backend-intranet-tqs-47-deploy                                    0/1       Error                        0                  24h
sired-tqs                                          sired-backend-intranet-tqs-49-deploy                                    0/1       Error                        0                  21h
sirep-des                                          sirep-frontend-intranet-novo-des2-des-1-9ksjp                           0/2       CrashLoopBackOff             14 (2m10s ago)     13m
sirff-des                                          sirff-back-des-56-g9pch                                                 0/1       CrashLoopBackOff             7 (75s ago)        13m
sirft-tqs                                          sirft-internet-tqs-5-deploy                                             0/1       Error                        0                  77d
sirft-tqs                                          sirft-internet-tqs-6-deploy                                             0/1       Error                        0                  72d
sirft-tqs                                          sirft-internet-tqs-7-deploy                                             0/1       Error                        0                  50d
sirft-tqs                                          sirft-internet-tqs-8-deploy                                             0/1       Error                        0                  48d
sirft-tqs                                          sirft-internet-tqs-9-deploy                                             0/1       Error                        0                  21d
sirmc-datagrid-des                                 rhdg-1                                                                  0/1       CrashLoopBackOff             7 (116s ago)       13m
sirmc-tqs                                          sirmc-captacaotedpix-atucliente-backend-tqs-10-deploy                   0/1       Error                        0                  62d
sirmc-tqs                                          sirmc-captacaotedpix-atucliente-backend-tqs-11-deploy                   0/1       Error                        0                  62d
sirmc-tqs                                          sirmc-captacaotedpix-atucliente-backend-tqs-12-deploy                   0/1       Error                        0                  53d
sirur-des                                          sirur-batch-des-1-deploy                                                0/1       Error                        0                  83d
sirur-des                                          sirur-batch-des-2-deploy                                                0/1       Error                        0                  64d
sirur-tqs                                          sirur-custeio-renovavel-tqs3-tqs-3-deploy                               0/1       Error                        0                  59d
sirur-tqs                                          sirur-documentos-tqs2-tqs-25-deploy                                     0/1       Error                        0                  56d
sisag-des                                          sisag-consulta-talao-cheque-backend-des-5-fh2g4                         0/1       CrashLoopBackOff             26 (3m5s ago)      119m
sisag-hmp                                          sisag-autorizacao-backend-hmp-4-deploy                                  0/1       Error                        0                  133d
sisag-tqs                                          sisag-poupanca-integrada-backend-tqs-44-nzvvf                           0/1       CrashLoopBackOff             6 (4m22s ago)      13m
sisaq-des                                          sisaq-api-judiciario-des-4-deploy                                       0/1       Error                        0                  15d
sisaq-tqs                                          sisaq-api-cnj-tqs-25-deploy                                             0/1       Error                        0                  8d
sisaq-tqs                                          sisaq-api-cnj-tqs-26-deploy                                             0/1       Error                        0                  7d4h
sisaq-tqs                                          sisaq-api-cnj-tqs-27-deploy                                             0/1       Error                        0                  4d16h
sisaq-tqs                                          sisaq-api-cnj-tqs-28-deploy                                             0/1       Error                        0                  4d7h
sisdc-des                                          sisdc-arrecadacao-des-145-r2mwm                                         0/2       CrashLoopBackOff             14 (2m15s ago)     13m
sisdc-tqs                                          sisdc-arrecadacao-tqs-56-8pk5l                                          0/2       CrashLoopBackOff             14 (2m ago)        13m
sisfg-des                                          sisfg-grfweb-des-99-deploy                                              0/1       Error                        0                  185d
sisgf-des                                          sisgf-backend-des-258-deploy                                            0/1       Error                        0                  43h
sisgf-des                                          sisgf-backend-des-259-deploy                                            0/1       Error                        0                  43h
sisgf-des                                          sisgf-backend-des-260-deploy                                            0/1       Error                        0                  42h
sisgf-des                                          sisgf-backend-des-261-deploy                                            0/1       Error                        0                  28h
sisgf-des                                          sisgf-backend-des-262-deploy                                            0/1       Error                        0                  23h
sisgh-des                                          sisgh-back-des-31-deploy                                                0/1       Error                        0                  31d
sisgh-hmp                                          sisgh-link-hmp-5-f4f5g                                                  0/1       CrashLoopBackOff             7 (110s ago)       13m
sisgh-tqs                                          sisgh-api-tqs-86-deploy                                                 0/1       Error                        0                  24h
sisib-des                                          sisib-backend-des-698-deploy                                            0/1       Error                        0                  24h
sisib-des                                          sisib-oficio-des-32-deploy                                              0/1       Error                        0                  35d
sisib-des                                          sisib-oficio-des-33-deploy                                              0/1       Error                        0                  22d
sisib-des                                          sisib-sisbajud-backend-des-2-deploy                                     0/1       Error                        0                  43d
sisib-tqs                                          sisib-backend-tqs-63-deploy                                             0/1       Error                        0                  2d22h
sisib-tqs                                          sisib-oficio-tqs-1-deploy                                               0/1       Error                        0                  167d
sisko-tqs                                          sisko-backend-tqs-11-h8tt2                                              0/1       CrashLoopBackOff             111 (2m56s ago)    8h
sisme-des                                          sisme-api-des-114-deploy                                                0/1       Error                        0                  113d
sisme-des                                          sisme-rotinas-batch-des-5-deploy                                        0/1       Error                        0                  206d
sismn-tqs                                          sismn-gecci-tqs-29-deploy                                               0/1       Error                        0                  101d
sismn-tqs                                          sismn-gecci-tqs-30-deploy                                               0/1       Error                        0                  95d
sisou-tqs                                          sisou-api-ouvidoria-internet-tqs-23-deploy                              0/1       Error                        0                  3d21h
sispl-des                                          sispl-consulta-transacao-des-44-deploy                                  0/1       Error                        0                  67d
sispl-des                                          sispl-consulta-transacao-des-45-deploy                                  0/1       Error                        0                  64d
sispl-des                                          sispl-consulta-transacao-des-46-deploy                                  0/1       Error                        0                  64d
sispl-des                                          sispl-consulta-transacao-des-47-deploy                                  0/1       Error                        0                  50d
sispl-des                                          sispl-consulta-transacao-des-48-deploy                                  0/1       Error                        0                  50d
sispl-des                                          sispl-consulta-transacao-des-49-deploy                                  0/1       Error                        0                  46d
sispl-des                                          sispl-consulta-transacao-des-50-deploy                                  0/1       Error                        0                  46d
sispl-hmp                                          sispl-captacao-mkp-hmp-34-deploy                                        0/1       Error                        0                  43d
sispl-hmp                                          sispl-captacao-mkp-hmp-35-deploy                                        0/1       Error                        0                  36d
sitbs-tqs                                          sitbs-backend-tqs-3-deploy                                              0/1       Error                        0                  27h
siwfc-tqs                                          siwfc-backend-internet-tqs-20-deploy                                    0/1       Error                        0                  219d
siwfc-tqs                                          siwfc-backend-internet-tqs-21-deploy                                    0/1       Error                        0                  218d
siwfc-tqs                                          siwfc-backend-internet-tqs-22-deploy                                    0/1       Error                        0                  79d
siwfc-tqs                                          siwfc-backend-internet-tqs-23-deploy                                    0/1       Error                        0                  72d
siwfc-tqs                                          siwfc-backend-internet-tqs-25-deploy                                    0/1       Error                        0                  34d
siwfc-tqs                                          siwfc-backend-tqs-28-deploy                                             0/1       Error                        0                  219d
siwfc-tqs                                          siwfc-backend-tqs-29-deploy                                             0/1       Error                        0                  219d
siwfc-tqs                                          siwfc-backend-tqs-30-deploy                                             0/1       Error                        0                  170d
siwfc-tqs                                          siwfc-backend-tqs-31-deploy                                             0/1       Error                        0                  64d
siwfc-tqs                                          siwfc-backend-tqs-32-deploy                                             0/1       Error                        0                  45d
siwfc-tqs                                          siwfc-frontend-internet-tqs-23-deploy                                   0/1       Error                        0                  176d
siwfc-tqs                                          siwfc-frontend-internet-tqs-24-deploy                                   0/1       Error                        0                  161d
siwfc-tqs                                          siwfc-frontend-internet-tqs-25-deploy                                   0/1       Error                        0                  158d
siwfc-tqs                                          siwfc-frontend-internet-tqs-26-deploy                                   0/1       Error                        0                  158d
siwfc-tqs                                          siwfc-frontend-internet-tqs-27-deploy                                   0/1       Error                        0                  156d
siwfc-tqs                                          siwfc-frontend-internet-tqs-28-deploy                                   0/1       Error                        0                  79d
siwfc-tqs                                          siwfc-frontend-internet-tqs-29-deploy                                   0/1       Error                        0                  72d
siwfc-tqs                                          siwfc-frontend-internet-tqs-30-deploy                                   0/1       Error                        0                  71d
siwfc-tqs                                          siwfc-frontend-internet-tqs-31-deploy                                   0/1       Error                        0                  15d
siwfc-tqs                                          siwfc-frontend-tqs-15-deploy                                            0/1       Error                        0                  45d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe node ceadecldlx001.nprd.caixa
E0612 15:14:36.576252  120900 describe.go:2645] Unable to construct reference to '&core.Node{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"ceadecldlx001.nprd.caixa", GenerateName:"", Namespace:"", SelfLink:"", UID:"1a1a819d-7d04-4796-9cfe-e0a3657700bb", ResourceVersion:"2013525425", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63885677780, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"beta.kubernetes.io/arch":"amd64", "beta.kubernetes.io/os":"linux", "kubernetes.io/arch":"amd64", "kubernetes.io/hostname":"ceadecldlx001.nprd.caixa", "kubernetes.io/os":"linux", "node-role.kubernetes.io/monitoring":"", "node.openshift.io/os_id":"fedora"}, Annotations:map[string]string{"machineconfiguration.openshift.io/state":"Done", "volumes.kubernetes.io/controller-managed-attach-detach":"true", "csi.volume.kubernetes.io/nodeid":"{\"rook-ceph.cephfs.csi.ceph.com\":\"ceadecldlx001.nprd.caixa\",\"rook-ceph.rbd.csi.ceph.com\":\"ceadecldlx001.nprd.caixa\"}", "machineconfiguration.openshift.io/controlPlaneTopology":"HighlyAvailable", "machineconfiguration.openshift.io/desiredConfig":"rendered-monitoring-e506794ea609b0794ddc2d628211da29", "machineconfiguration.openshift.io/desiredDrain":"uncordon-rendered-monitoring-e506794ea609b0794ddc2d628211da29", "machineconfiguration.openshift.io/currentConfig":"rendered-monitoring-e506794ea609b0794ddc2d628211da29", "machineconfiguration.openshift.io/lastAppliedDrain":"uncordon-rendered-monitoring-e506794ea609b0794ddc2d628211da29", "machineconfiguration.openshift.io/reason":""}, OwnerReferences:[]v1.OwnerReference(nil), Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.NodeSpec{PodCIDR:"", ProviderID:"", Unschedulable:false, Taints:[]core.Taint{core.Taint{Key:"node-role.kubernetes.io/monitoring", Value:"reserved", Effect:"NoExecute", TimeAdded:(*v1.Time)(nil)}, core.Taint{Key:"node-role.kubernetes.io/monitoring", Value:"reserved", Effect:"NoSchedule", TimeAdded:(*v1.Time)(nil)}}, ConfigSource:(*core.NodeConfigSource)(nil), DoNotUse_ExternalID:""}, Status:core.NodeStatus{Capacity:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:32, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"32", Format:"DecimalSI"}, "ephemeral-storage":resource.Quantity{i:resource.int64Amount{value:128300593152, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"125293548Ki", Format:"BinarySI"}, "hugepages-1Gi":resource.Quantity{i:resource.int64Amount{value:0, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"0", Format:"DecimalSI"}, "hugepages-2Mi":resource.Quantity{i:resource.int64Amount{value:0, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"0", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:67411476480, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}, "pods":resource.Quantity{i:resource.int64Amount{value:250, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"250", Format:"DecimalSI"}}, Allocatable:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:31500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"31500m", Format:"DecimalSI"}, "ephemeral-storage":resource.Quantity{i:resource.int64Amount{value:114396791822, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"114396791822", Format:"DecimalSI"}, "hugepages-1Gi":resource.Quantity{i:resource.int64Amount{value:0, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"0", Format:"DecimalSI"}, "hugepages-2Mi":resource.Quantity{i:resource.int64Amount{value:0, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"0", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:66232877056, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}, "pods":resource.Quantity{i:resource.int64Amount{value:250, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"250", Format:"DecimalSI"}}, Phase:"", Conditions:[]core.NodeCondition{core.NodeCondition{Type:"MemoryPressure", Status:"False", LastHeartbeatTime:v1.Time{Time:time.Time{wall:0x0, ext:63916884833, loc:(*time.Location)(0x49403c0)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63885690271, loc:(*time.Location)(0x49403c0)}}, Reason:"KubeletHasSufficientMemory", Message:"kubelet has sufficient memory available"}, core.NodeCondition{Type:"DiskPressure", Status:"False", LastHeartbeatTime:v1.Time{Time:time.Time{wall:0x0, ext:63916884833, loc:(*time.Location)(0x49403c0)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63885690271, loc:(*time.Location)(0x49403c0)}}, Reason:"KubeletHasNoDiskPressure", Message:"kubelet has no disk pressure"}, core.NodeCondition{Type:"PIDPressure", Status:"False", LastHeartbeatTime:v1.Time{Time:time.Time{wall:0x0, ext:63916884833, loc:(*time.Location)(0x49403c0)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63885690271, loc:(*time.Location)(0x49403c0)}}, Reason:"KubeletHasSufficientPID", Message:"kubelet has sufficient PID available"}, core.NodeCondition{Type:"Ready", Status:"True", LastHeartbeatTime:v1.Time{Time:time.Time{wall:0x0, ext:63916884833, loc:(*time.Location)(0x49403c0)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63885789588, loc:(*time.Location)(0x49403c0)}}, Reason:"KubeletReady", Message:"kubelet is posting ready status"}}, Addresses:[]core.NodeAddress{core.NodeAddress{Type:"InternalIP", Address:"10.116.208.19"}, core.NodeAddress{Type:"Hostname", Address:"ceadecldlx001.nprd.caixa"}}, DaemonEndpoints:core.NodeDaemonEndpoints{KubeletEndpoint:core.DaemonEndpoint{Port:10250}}, NodeInfo:core.NodeSystemInfo{MachineID:"c8d5502e169e413185c34c5eef93ca85", SystemUUID:"713b0242-d84e-cd79-2330-929ccd04a148", BootID:"4935e091-da72-468f-8283-932cd35960ce", KernelVersion:"6.1.18-200.fc37.x86_64", OSImage:"Fedora CoreOS 37.20230322.3.0", ContainerRuntimeVersion:"cri-o://1.25.1", KubeletVersion:"v1.25.8+27e744f", KubeProxyVersion:"v1.25.8+27e744f", OperatingSystem:"linux", Architecture:"amd64"}, Images:[]core.ContainerImage{core.ContainerImage{Names:[]string{"quay.io/cephcsi/cephcsi@sha256:002f213210212c883c40e77ca7305c71aeefed705221009367b53b20db42aef9", "quay.io/cephcsi/cephcsi@sha256:f9b3c94f948cb9978f98bafa9ce84f6f9fa7b5d794f1d8d152e456d8d2b03f9c", "quay.io/cephcsi/cephcsi:v3.10.2"}, SizeBytes:1618545132}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:c53bb2c01dc951dfe46ba91d76553d6d16b007de0a5475f05c91e51505900a0c"}, SizeBytes:710488984}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:4ad29b1b7065799a38a31e70c5343f9d73ac2310c8ee91b62a7aa11f5886e621"}, SizeBytes:596501643}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:d5fc161170fcf68900b2694039803a2e7f1b31eb913566139a41f91851f166d7"}, SizeBytes:574516705}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:faf9846febdeb63120f97f783e877f77fd94aa55c6496e51c3b4e7a2be31daf3"}, SizeBytes:545024852}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:aaa1e3e5ee43edc40ac32d16befb0956c77d5de4faada9e2b45c2501e1a49abf"}, SizeBytes:526299026}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:b4baa353728e01e0e3355ec964f64d684e172c3b5d75f9c28b365a03ae664d2c"}, SizeBytes:523946382}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:16c053c41e55c24ea1c8d539fcfdacd22291604c1fbfcf8676564a99df0584b4"}, SizeBytes:507428618}, core.ContainerImage{Names:[]string{"image-registry.openshift-image-registry.svc:5000/openshift/filebeat@sha256:a6c4b41e49b65501d6c0ec9982413cbd06f01ce85bf06faccd71e6454dc7a69b", "image-registry.openshift-image-registry.svc:5000/openshift/filebeat:7.15.1"}, SizeBytes:503491453}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:91e7d68b28aa00e209065604b2b9ac1400671d9102581e8b49b37726acd7b6e4"}, SizeBytes:493220384}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:eb33a6e20c0435acebe8eb2f24bb3d92685cc287c5b8acd75e2369412d240762"}, SizeBytes:491230539}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:79fe00328f34d13777f15cc7ef9c42af96e27b35efc2ee67ce5c67ea0e65a66b"}, SizeBytes:482781659}, core.ContainerImage{Names:[]string{"mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi@sha256:972b78a753094ee071b7b4340dab8bfdc0417c7637a90a0a78fd81a0e168d2eb", "mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi@sha256:a157fdcbd7edfdf295528d97228b03b303d4609f80cb87ed24fd3a59d4da3256", "mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi:v1.27.0"}, SizeBytes:431208906}, core.ContainerImage{Names:[]string{"mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi@sha256:00e1f1025f1c7a35e8d781777434976ff86cd75fecd951bd441a01136632d033", "mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi@sha256:b7d79bdbb98c28ec6400ba1ed91adcd16ed9534c32b19329941537027441e593", "mcr.microsoft.com/oss/v2/kubernetes-csi/blob-csi:v1.26.7"}, SizeBytes:426464163}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:a5ebc0877eeb833483b35b36de0bccc2256a7b6eedc06c1e57f7b0ccd8c47bf7"}, SizeBytes:426121431}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:b5338a60427878d53dbb73302d7c70973ded408413651e640884ca0b370019bd"}, SizeBytes:423310998}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:2ec86dec420abaf6993edabb5b5091dfccb7ed281386baa410a0e2ad698f1baa"}, SizeBytes:416188578}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:0ff6144fdab964a9d738d85ffa0847ba7ac78e90e9f97089eae031cf060c8063"}, SizeBytes:415705985}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:d80ad8c22fcdec89a38556e92a1ed6d84a4e0207ea5bc3aac6e62e1824441c35"}, SizeBytes:406055357}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:9696f8f231d49aadf63ab980ec5c17c4fd87011930daecd30cc9e4ee102f1aeb"}, SizeBytes:402351209}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:560c71fa677dddedcd03b760c9cb3ce0046f1c02c141ca80ed28c34c3606ecad"}, SizeBytes:396974273}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:b172d2da8f5e056d857cf3198e192f63f43ae0034e5b171d3987f8d378fb885f"}, SizeBytes:387046219}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:3fc008580e4e404960b2de4020a2939ab6421bdf8f51c0b60af4ad903272c741"}, SizeBytes:382411122}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:685911b0e1df40d338acfb04340ad8b5033930033644cbd784c8c45cce5bd614"}, SizeBytes:379885214}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:b6536bfcfaf30a6425d589facd672bae3245f933b2a7399bda3f12e393bd671b"}, SizeBytes:377361805}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:e1ac8abdf0cb131d4d1f1c31cfcf045021a6f02fb467bc69420eea9cf9d70d18"}, SizeBytes:375318125}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:e5521a3d1f64483e63ffe5bc23d9f882781cd4d152ac6de72013eaefe6dfcf89"}, SizeBytes:371510113}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:8996491feb0826d27e289779f3655eda38c6ee8765fa155b290616ee662f322f"}, SizeBytes:367782114}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:c72ac031fa99abbc3d9db63827802edacaefa3db3e2680f7ca29839ca991bf56"}, SizeBytes:359738692}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:0f5c985e58fff4038fc1c8b580cdec0c50f13e090c7c5590634df00cb18ee8ab"}, SizeBytes:354455179}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:c4218978f242fbc800301ede5f4a53c0520dbcccc0b65d88c653731aa2781180"}, SizeBytes:297268865}, core.ContainerImage{Names:[]string{"quay.io/openshift/okd-content@sha256:a8bcc8cf428e222c7e6677fe5f7f05e79da2aed1ded851cad696d83c94860b4c"}, SizeBytes:275275974}, core.ContainerImage{Names:[]string{"registry.k8s.io/sig-storage/csi-node-driver-registrar@sha256:bb5144434c868d65d8dd7c267daaab73fef5b43ec941fe5289f95e1f36398a20", "registry.k8s.io/sig-storage/csi-node-driver-registrar@sha256:c53535af8a7f7e3164609838c4b191b42b2d81238d75c1b2a2b582ada62a9780", "registry.k8s.io/sig-storage/csi-node-driver-registrar:v2.10.0"}, SizeBytes:23313823}}, VolumesInUse:[]core.UniqueVolumeName{"kubernetes.io/csi/rook-ceph.rbd.csi.ceph.com^0001-0009-rook-ceph-0000000000000002-2d4db65b-4cec-482a-b7ac-4845c1233d57"}, VolumesAttached:[]core.AttachedVolume{core.AttachedVolume{Name:"kubernetes.io/csi/rook-ceph.rbd.csi.ceph.com^0001-0009-rook-ceph-0000000000000002-2d4db65b-4cec-482a-b7ac-4845c1233d57", DevicePath:""}}, Config:(*core.NodeConfigStatus)(nil)}}': selfLink was empty, can't make reference
Name:               ceadecldlx001.nprd.caixa
Roles:              monitoring
Labels:             beta.kubernetes.io/arch=amd64
                    beta.kubernetes.io/os=linux
                    kubernetes.io/arch=amd64
                    kubernetes.io/hostname=ceadecldlx001.nprd.caixa
                    kubernetes.io/os=linux
                    node-role.kubernetes.io/monitoring=
                    node.openshift.io/os_id=fedora
Annotations:        csi.volume.kubernetes.io/nodeid={"rook-ceph.cephfs.csi.ceph.com":"ceadecldlx001.nprd.caixa","rook-ceph.rbd.csi.ceph.com":"ceadecldlx001.nprd.caixa"}
                    machineconfiguration.openshift.io/controlPlaneTopology=HighlyAvailable
                    machineconfiguration.openshift.io/currentConfig=rendered-monitoring-e506794ea609b0794ddc2d628211da29
                    machineconfiguration.openshift.io/desiredConfig=rendered-monitoring-e506794ea609b0794ddc2d628211da29
                    machineconfiguration.openshift.io/desiredDrain=uncordon-rendered-monitoring-e506794ea609b0794ddc2d628211da29
                    machineconfiguration.openshift.io/lastAppliedDrain=uncordon-rendered-monitoring-e506794ea609b0794ddc2d628211da29
                    machineconfiguration.openshift.io/reason=
                    machineconfiguration.openshift.io/state=Done
                    volumes.kubernetes.io/controller-managed-attach-detach=true
CreationTimestamp:  Mon, 16 Jun 2025 10:36:20 -0300
Taints:             node-role.kubernetes.io/monitoring=reserved:NoExecute
                    node-role.kubernetes.io/monitoring=reserved:NoSchedule
Unschedulable:      false
Conditions:
  Type             Status  LastHeartbeatTime                 LastTransitionTime                Reason                       Message
  ----             ------  -----------------                 ------------------                ------                       -------
  MemoryPressure   False   Fri, 12 Jun 2026 15:13:53 -0300   Mon, 16 Jun 2025 14:04:31 -0300   KubeletHasSufficientMemory   kubelet has sufficient memory available
  DiskPressure     False   Fri, 12 Jun 2026 15:13:53 -0300   Mon, 16 Jun 2025 14:04:31 -0300   KubeletHasNoDiskPressure     kubelet has no disk pressure
  PIDPressure      False   Fri, 12 Jun 2026 15:13:53 -0300   Mon, 16 Jun 2025 14:04:31 -0300   KubeletHasSufficientPID      kubelet has sufficient PID available
  Ready            True    Fri, 12 Jun 2026 15:13:53 -0300   Tue, 17 Jun 2025 17:39:48 -0300   KubeletReady                 kubelet is posting ready status
Addresses:
  InternalIP:  10.116.208.19
  Hostname:    ceadecldlx001.nprd.caixa
Capacity:
 cpu:                32
 ephemeral-storage:  125293548Ki
 hugepages-1Gi:      0
 hugepages-2Mi:      0
 memory:             65831520Ki
 pods:               250
Allocatable:
 cpu:                31500m
 ephemeral-storage:  114396791822
 hugepages-1Gi:      0
 hugepages-2Mi:      0
 memory:             64680544Ki
 pods:               250
System Info:
 Machine ID:                              c8d5502e169e413185c34c5eef93ca85
 System UUID:                             713b0242-d84e-cd79-2330-929ccd04a148
 Boot ID:                                 4935e091-da72-468f-8283-932cd35960ce
 Kernel Version:                          6.1.18-200.fc37.x86_64
 OS Image:                                Fedora CoreOS 37.20230322.3.0
 Operating System:                        linux
 Architecture:                            amd64
 Container Runtime Version:               cri-o://1.25.1
 Kubelet Version:                         v1.25.8+27e744f
 Kube-Proxy Version:                      v1.25.8+27e744f
Non-terminated Pods:                      (18 in total)
  Namespace                               Name                                                      CPU Requests  CPU Limits  Memory Requests  Memory Limits
  ---------                               ----                                                      ------------  ----------  ---------------  -------------
  filebeat                                filebeat-novo-hzkxd                                       100m (0%)     505m (1%)   128Mi (0%)       512Mi (0%)
  openshift-cluster-node-tuning-operator  tuned-lnwb7                                               10m (0%)      0 (0%)      50Mi (0%)        0 (0%)
  openshift-dns                           node-resolver-fkp48                                       5m (0%)       0 (0%)      21Mi (0%)        0 (0%)
  openshift-image-registry                node-ca-nhps4                                             10m (0%)      0 (0%)      10Mi (0%)        0 (0%)
  openshift-machine-config-operator       machine-config-daemon-sdrkl                               40m (0%)      0 (0%)      100Mi (0%)       0 (0%)
  openshift-monitoring                    alertmanager-main-1                                       9m (0%)       0 (0%)      120Mi (0%)       0 (0%)
  openshift-monitoring                    node-exporter-4cm2g                                       9m (0%)       0 (0%)      47Mi (0%)        0 (0%)
  openshift-monitoring                    prometheus-adapter-7df684bd89-vztwn                       1m (0%)       0 (0%)      40Mi (0%)        0 (0%)
  openshift-monitoring                    prometheus-k8s-0                                          75m (0%)      0 (0%)      1104Mi (1%)      0 (0%)
  openshift-monitoring                    prometheus-operator-admission-webhook-7c4d5c568f-mwxx8    5m (0%)       0 (0%)      30Mi (0%)        0 (0%)
  openshift-monitoring                    thanos-querier-86848dbd69-tdnq6                           15m (0%)      0 (0%)      92Mi (0%)        0 (0%)
  openshift-multus                        multus-additional-cni-plugins-zw9hk                       10m (0%)      0 (0%)      10Mi (0%)        0 (0%)
  openshift-multus                        multus-wvwxm                                              10m (0%)      0 (0%)      65Mi (0%)        0 (0%)
  openshift-multus                        network-metrics-daemon-8tt7x                              20m (0%)      0 (0%)      120Mi (0%)       0 (0%)
  openshift-network-diagnostics           network-check-target-lr9zm                                10m (0%)      0 (0%)      15Mi (0%)        0 (0%)
  openshift-sdn                           sdn-tjxgr                                                 110m (0%)     0 (0%)      220Mi (0%)       0 (0%)
  rook-ceph                               csi-cephfsplugin-h9lhb                                    0 (0%)        0 (0%)      0 (0%)           0 (0%)
  rook-ceph                               csi-rbdplugin-8kjrp                                       0 (0%)        0 (0%)      0 (0%)           0 (0%)
Allocated resources:
  (Total limits may be over 100 percent, i.e., overcommitted.)
  Resource  Requests     Limits
  --------  --------     ------
  cpu       439m (1%)    505m (1%)
  memory    2172Mi (3%)  512Mi (0%)
-sh-4.2$ oc get oauths.config.openshift.io cluster -o yaml
apiVersion: config.openshift.io/v1
kind: OAuth
metadata:
  annotations:
    include.release.openshift.io/ibm-cloud-managed: "true"
    include.release.openshift.io/self-managed-high-availability: "true"
    include.release.openshift.io/single-node-developer: "true"
    release.openshift.io/create-only: "true"
  creationTimestamp: 2022-11-09T20:25:54Z
  generation: 12
  managedFields:
  - apiVersion: config.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:include.release.openshift.io/ibm-cloud-managed: {}
          f:include.release.openshift.io/self-managed-high-availability: {}
          f:include.release.openshift.io/single-node-developer: {}
          f:release.openshift.io/create-only: {}
        f:ownerReferences:
          .: {}
          k:{"uid":"db258541-025f-45cc-aeb0-3d3cc4c5a66e"}: {}
      f:spec: {}
    manager: cluster-version-operator
    operation: Update
    time: 2022-11-09T20:25:54Z
  - apiVersion: config.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:identityProviders: {}
    manager: kubectl-edit
    operation: Update
    time: 2025-10-17T23:06:47Z
  name: cluster
  ownerReferences:
  - apiVersion: config.openshift.io/v1
    kind: ClusterVersion
    name: version
    uid: db258541-025f-45cc-aeb0-3d3cc4c5a66e
  resourceVersion: "1439882448"
  uid: 9577b605-cbfa-4f28-9823-6b1325d662fc
spec:
  identityProviders:
  - mappingMethod: claim
    name: AAD
    openID:
      claims:
        email:
        - email
        name:
        - name
        preferredUsername:
        - upn
        - email
      clientID: 8f91600b-e1c4-4438-ac6d-a4d05a8abbcc
      clientSecret:
        name: openid-client-secret-add
      extraScopes: []
      issuer: https://login.microsoftonline.com/ab9bba98-684a-43fb-add8-9c2bebede229
    type: OpenID
-sh-4.2$ oc logs -n openshift-authentication deployment/oauth-openshift
Found 3 pods, using pod/oauth-openshift-547d845f4d-k4cqp
Copying system trust bundle
I0612 15:20:26.460401       1 dynamic_serving_content.go:113] "Loaded a new cert/key pair" name="serving-cert::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.crt::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.key"
I0612 15:20:26.460637       1 dynamic_serving_content.go:113] "Loaded a new cert/key pair" name="sni-serving-cert::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa"
I0612 15:20:26.722393       1 requestheader_controller.go:244] Loaded a new request header values for RequestHeaderAuthRequestController
I0612 15:20:26.728790       1 secure_serving.go:57] Forcing use of http/1.1 only
I0612 15:20:26.728834       1 genericapiserver.go:418] MuxAndDiscoveryComplete has all endpoints registered and discovery information is complete
I0612 15:20:26.732735       1 configmap_cafile_content.go:202] "Starting controller" name="client-ca::kube-system::extension-apiserver-authentication::client-ca-file"
I0612 15:20:26.732771       1 shared_informer.go:255] Waiting for caches to sync for client-ca::kube-system::extension-apiserver-authentication::client-ca-file
I0612 15:20:26.732721       1 requestheader_controller.go:169] Starting RequestHeaderAuthRequestController
I0612 15:20:26.732738       1 configmap_cafile_content.go:202] "Starting controller" name="client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file"
I0612 15:20:26.732810       1 shared_informer.go:255] Waiting for caches to sync for client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file
I0612 15:20:26.732800       1 shared_informer.go:255] Waiting for caches to sync for RequestHeaderAuthRequestController
I0612 15:20:26.732877       1 dynamic_serving_content.go:132] "Starting controller" name="serving-cert::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.crt::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.key"
I0612 15:20:26.732959       1 tlsconfig.go:200] "Loaded serving cert" certName="serving-cert::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.crt::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.key" certDetail="\"oauth-openshift.openshift-authentication.svc\" [serving] validServingFor=[oauth-openshift.openshift-authentication.svc,oauth-openshift.openshift-authentication.svc.cluster.local] issuer=\"openshift-service-serving-signer@1668025811\" (2026-02-06 20:47:44 +0000 UTC to 2028-02-06 20:47:45 +0000 UTC (now=2026-06-12 15:20:26.732927936 +0000 UTC))"
I0612 15:20:26.733011       1 dynamic_serving_content.go:132] "Starting controller" name="sni-serving-cert::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa"
I0612 15:20:26.733088       1 named_certificates.go:53] "Loaded SNI cert" index=1 certName="sni-serving-cert::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa" certDetail="\"*.apps.nprd.caixa\" [] groups=[Caixa Economica Federal] validServingFor=[*.apps.nprd.caixa] issuer=\"AC Icptestes Sub\" (2024-07-18 15:07:38 +0000 UTC to 2029-07-18 15:17:38 +0000 UTC (now=2026-06-12 15:20:26.733066135 +0000 UTC))"
I0612 15:20:26.733171       1 named_certificates.go:53] "Loaded SNI cert" index=0 certName="self-signed loopback" certDetail="\"apiserver-loopback-client@1781277626\" [serving] validServingFor=[apiserver-loopback-client] issuer=\"apiserver-loopback-client-ca@1781277626\" (2026-06-12 14:20:26 +0000 UTC to 2027-06-12 14:20:26 +0000 UTC (now=2026-06-12 15:20:26.733162146 +0000 UTC))"
I0612 15:20:26.733201       1 secure_serving.go:210] Serving securely on [::]:6443
I0612 15:20:26.733217       1 genericapiserver.go:488] [graceful-termination] waiting for shutdown to be initiated
I0612 15:20:26.733218       1 tlsconfig.go:240] "Starting DynamicServingCertificateController"
I0612 15:20:26.833491       1 shared_informer.go:262] Caches are synced for RequestHeaderAuthRequestController
I0612 15:20:26.833547       1 shared_informer.go:262] Caches are synced for client-ca::kube-system::extension-apiserver-authentication::client-ca-file
I0612 15:20:26.833537       1 shared_informer.go:262] Caches are synced for client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file
I0612 15:20:26.833762       1 tlsconfig.go:178] "Loaded client CA" index=0 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_aggregator-client-signer@1779551727\" [] issuer=\"<self>\" (2026-05-23 15:55:27 +0000 UTC to 2026-06-22 15:55:28 +0000 UTC (now=2026-06-12 15:20:26.833739013 +0000 UTC))"
I0612 15:20:26.833796       1 tlsconfig.go:178] "Loaded client CA" index=1 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_aggregator-client-signer@1780847741\" [] issuer=\"<self>\" (2026-06-07 15:55:40 +0000 UTC to 2026-07-07 15:55:41 +0000 UTC (now=2026-06-12 15:20:26.833786064 +0000 UTC))"
I0612 15:20:26.833904       1 tlsconfig.go:200] "Loaded serving cert" certName="serving-cert::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.crt::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.key" certDetail="\"oauth-openshift.openshift-authentication.svc\" [serving] validServingFor=[oauth-openshift.openshift-authentication.svc,oauth-openshift.openshift-authentication.svc.cluster.local] issuer=\"openshift-service-serving-signer@1668025811\" (2026-02-06 20:47:44 +0000 UTC to 2028-02-06 20:47:45 +0000 UTC (now=2026-06-12 15:20:26.833891881 +0000 UTC))"
I0612 15:20:26.834040       1 named_certificates.go:53] "Loaded SNI cert" index=1 certName="sni-serving-cert::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa" certDetail="\"*.apps.nprd.caixa\" [] groups=[Caixa Economica Federal] validServingFor=[*.apps.nprd.caixa] issuer=\"AC Icptestes Sub\" (2024-07-18 15:07:38 +0000 UTC to 2029-07-18 15:17:38 +0000 UTC (now=2026-06-12 15:20:26.834030747 +0000 UTC))"
I0612 15:20:26.834108       1 named_certificates.go:53] "Loaded SNI cert" index=0 certName="self-signed loopback" certDetail="\"apiserver-loopback-client@1781277626\" [serving] validServingFor=[apiserver-loopback-client] issuer=\"apiserver-loopback-client-ca@1781277626\" (2026-06-12 14:20:26 +0000 UTC to 2027-06-12 14:20:26 +0000 UTC (now=2026-06-12 15:20:26.834099587 +0000 UTC))"
I0612 15:20:26.834275       1 tlsconfig.go:178] "Loaded client CA" index=0 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"admin-kubeconfig-signer\" [] issuer=\"<self>\" (2022-11-09 20:17:06 +0000 UTC to 2032-11-06 20:17:06 +0000 UTC (now=2026-06-12 15:20:26.83426624 +0000 UTC))"
I0612 15:20:26.834295       1 tlsconfig.go:178] "Loaded client CA" index=1 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"kubelet-bootstrap-kubeconfig-signer\" [] issuer=\"<self>\" (2022-11-09 20:17:07 +0000 UTC to 2032-11-06 20:17:07 +0000 UTC (now=2026-06-12 15:20:26.834287276 +0000 UTC))"
I0612 15:20:26.834316       1 tlsconfig.go:178] "Loaded client CA" index=2 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_kube-apiserver-to-kubelet-signer@1768940295\" [] issuer=\"<self>\" (2026-01-20 20:18:14 +0000 UTC to 2027-01-20 20:18:15 +0000 UTC (now=2026-06-12 15:20:26.83430775 +0000 UTC))"
I0612 15:20:26.834334       1 tlsconfig.go:178] "Loaded client CA" index=3 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_node-system-admin-signer@1768941048\" [] issuer=\"<self>\" (2026-01-20 20:30:47 +0000 UTC to 2027-01-20 20:30:48 +0000 UTC (now=2026-06-12 15:20:26.834324729 +0000 UTC))"
I0612 15:20:26.834350       1 tlsconfig.go:178] "Loaded client CA" index=4 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_kube-control-plane-signer@1776889403\" [] issuer=\"<self>\" (2026-04-22 20:23:23 +0000 UTC to 2026-06-21 20:23:24 +0000 UTC (now=2026-06-12 15:20:26.834342968 +0000 UTC))"
I0612 15:20:26.834372       1 tlsconfig.go:178] "Loaded client CA" index=5 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-controller-manager-operator_csr-signer-signer@1776958256\" [] issuer=\"<self>\" (2026-04-23 15:30:55 +0000 UTC to 2026-06-22 15:30:56 +0000 UTC (now=2026-06-12 15:20:26.834359655 +0000 UTC))"
I0612 15:20:26.834390       1 tlsconfig.go:178] "Loaded client CA" index=6 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_kube-control-plane-signer@1779481407\" [] issuer=\"<self>\" (2026-05-22 20:23:26 +0000 UTC to 2026-07-21 20:23:27 +0000 UTC (now=2026-06-12 15:20:26.834380943 +0000 UTC))"
I0612 15:20:26.834406       1 tlsconfig.go:178] "Loaded client CA" index=7 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-controller-manager-operator_csr-signer-signer@1779550258\" [] issuer=\"<self>\" (2026-05-23 15:30:57 +0000 UTC to 2026-07-22 15:30:58 +0000 UTC (now=2026-06-12 15:20:26.834398822 +0000 UTC))"
I0612 15:20:26.834425       1 tlsconfig.go:178] "Loaded client CA" index=8 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"kube-csr-signer_@1779680201\" [] issuer=\"openshift-kube-controller-manager-operator_csr-signer-signer@1779550258\" (2026-05-25 03:36:40 +0000 UTC to 2026-06-24 03:36:41 +0000 UTC (now=2026-06-12 15:20:26.834415645 +0000 UTC))"
I0612 15:20:26.834444       1 tlsconfig.go:178] "Loaded client CA" index=9 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"kube-csr-signer_@1780976201\" [] issuer=\"openshift-kube-controller-manager-operator_csr-signer-signer@1779550258\" (2026-06-09 03:36:40 +0000 UTC to 2026-07-09 03:36:41 +0000 UTC (now=2026-06-12 15:20:26.834435978 +0000 UTC))"
I0612 15:20:26.834463       1 tlsconfig.go:178] "Loaded client CA" index=10 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_aggregator-client-signer@1779551727\" [] issuer=\"<self>\" (2026-05-23 15:55:27 +0000 UTC to 2026-06-22 15:55:28 +0000 UTC (now=2026-06-12 15:20:26.834454803 +0000 UTC))"
I0612 15:20:26.834479       1 tlsconfig.go:178] "Loaded client CA" index=11 certName="client-ca::kube-system::extension-apiserver-authentication::client-ca-file,client-ca::kube-system::extension-apiserver-authentication::requestheader-client-ca-file" certDetail="\"openshift-kube-apiserver-operator_aggregator-client-signer@1780847741\" [] issuer=\"<self>\" (2026-06-07 15:55:40 +0000 UTC to 2026-07-07 15:55:41 +0000 UTC (now=2026-06-12 15:20:26.834472431 +0000 UTC))"
I0612 15:20:26.834549       1 tlsconfig.go:200] "Loaded serving cert" certName="serving-cert::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.crt::/var/config/system/secrets/v4-0-config-system-serving-cert/tls.key" certDetail="\"oauth-openshift.openshift-authentication.svc\" [serving] validServingFor=[oauth-openshift.openshift-authentication.svc,oauth-openshift.openshift-authentication.svc.cluster.local] issuer=\"openshift-service-serving-signer@1668025811\" (2026-02-06 20:47:44 +0000 UTC to 2028-02-06 20:47:45 +0000 UTC (now=2026-06-12 15:20:26.834538956 +0000 UTC))"
I0612 15:20:26.834637       1 named_certificates.go:53] "Loaded SNI cert" index=1 certName="sni-serving-cert::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa::/var/config/system/secrets/v4-0-config-system-router-certs/apps.nprd.caixa" certDetail="\"*.apps.nprd.caixa\" [] groups=[Caixa Economica Federal] validServingFor=[*.apps.nprd.caixa] issuer=\"AC Icptestes Sub\" (2024-07-18 15:07:38 +0000 UTC to 2029-07-18 15:17:38 +0000 UTC (now=2026-06-12 15:20:26.834626602 +0000 UTC))"
I0612 15:20:26.834692       1 named_certificates.go:53] "Loaded SNI cert" index=0 certName="self-signed loopback" certDetail="\"apiserver-loopback-client@1781277626\" [serving] validServingFor=[apiserver-loopback-client] issuer=\"apiserver-loopback-client-ca@1781277626\" (2026-06-12 14:20:26 +0000 UTC to 2027-06-12 14:20:26 +0000 UTC (now=2026-06-12 15:20:26.834684847 +0000 UTC))"
-sh-4.2$

