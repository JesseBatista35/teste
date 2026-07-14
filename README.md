
Using project "sisam-tqs".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project siabm-des
NAME        DISPLAY NAME   STATUS
siabm-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siabm-des
NAME                                                                    READY     STATUS      RESTARTS   AGE
siabm-autenticacao-24horas-des-158-deploy                               0/1       Completed   0          13d
siabm-autenticacao-24horas-des-159-64ndn                                1/1       Running     0          5d17h
siabm-autenticacao-24horas-des-159-cv2j2                                1/1       Running     0          5d17h
siabm-autenticacao-24horas-des-159-deploy                               0/1       Completed   0          5d17h
siabm-autenticacao-24horas-des-159-gmpfm                                1/1       Running     0          5d17h
siabm-autenticacao-24horas-des-159-m5fqp                                1/1       Running     0          5d17h
siabm-autenticacao-24horas-sandbox-des-24-deploy                        0/1       Completed   0          20d
siabm-autenticacao-24horas-sandbox-des-25-deploy                        0/1       Completed   0          14d
siabm-autenticacao-24horas-sandbox-des-25-pqxdq                         1/1       Running     0          14d
siabm-autenticacao-api-des-187-deploy                                   0/1       Completed   0          10d
siabm-autenticacao-api-des-188-deploy                                   0/1       Completed   0          18h
siabm-autenticacao-api-des-188-fqnmq                                    1/1       Running     0          18h
siabm-autenticacao-api-sandbox-des-12-deploy                            0/1       Completed   0          4d18h
siabm-autenticacao-api-sandbox-des-13-deploy                            0/1       Completed   0          4d18h
siabm-autenticacao-api-sandbox-des-13-rg72f                             1/1       Running     0          4d18h
siabm-cadastramento-api-des-151-deploy                                  0/1       Completed   0          139d
siabm-cadastramento-api-des-152-deploy                                  0/1       Completed   0          110d
siabm-cadastramento-api-des-153-deploy                                  0/1       Completed   0          110d
siabm-cadastramento-api-des-155-deploy                                  0/1       Completed   0          90d
siabm-cadastramento-api-des-156-deploy                                  0/1       Completed   0          90d
siabm-cadastramento-api-des-157-deploy                                  0/1       Completed   0          90d
siabm-cadastramento-api-des-158-deploy                                  0/1       Completed   0          90d
siabm-cadastramento-api-des-159-deploy                                  0/1       Completed   0          89d
siabm-cadastramento-api-des-160-deploy                                  0/1       Completed   0          89d
siabm-cadastramento-api-des-161-deploy                                  0/1       Completed   0          81d
siabm-cadastramento-api-des-162-deploy                                  0/1       Completed   0          80d
siabm-cadastramento-api-des-163-deploy                                  0/1       Completed   0          78d
siabm-cadastramento-api-des-164-deploy                                  0/1       Completed   0          76d
siabm-cadastramento-api-des-165-deploy                                  0/1       Completed   0          68d
siabm-cadastramento-api-des-166-deploy                                  0/1       Completed   0          19d
siabm-cadastramento-api-des-166-hrzmt                                   1/1       Running     0          19d
siabm-cadastramento-api-sandbox-des-16-deploy                           0/1       Completed   0          19d
siabm-cadastramento-api-sandbox-des-17-deploy                           0/1       Completed   0          4d18h
siabm-cadastramento-api-sandbox-des-17-vsh57                            1/1       Running     0          4d18h
siabm-file-system-ged-des-149-deploy                                    0/1       Completed   0          13d
siabm-file-system-ged-des-150-deploy                                    0/1       Completed   0          12d
siabm-file-system-ged-des-150-glh9t                                     1/1       Running     0          12d
siabm-frontend-des-50-deploy                                            0/1       Completed   0          88d
siabm-frontend-des-51-6dq4v                                             2/2       Running     0          77d
siabm-frontend-des-51-deploy                                            0/1       Completed   0          77d
siabm-frontend-sandbox-des-5-deploy                                     0/1       Completed   0          157d
siabm-frontend-sandbox-des-6-rf6q4                                      2/2       Running     0          157d
siabm-matcher-des-16-deploy                                             0/1       Completed   0          224d
siabm-matcher-des-17-7bp97                                              1/1       Running     0          220d
siabm-matcher-des-17-deploy                                             0/1       Completed   0          220d
siabm-relatorio-api-des-212-deploy                                      0/1       Completed   0          77d
siabm-relatorio-api-des-212-nnkv2                                       1/1       Running     0          77d
siabm-relatorio-api-sandbox-des-13-deploy                               0/1       Completed   0          47d
siabm-relatorio-api-sandbox-des-14-deploy                               0/1       Completed   0          20d
siabm-relatorio-api-sandbox-des-14-q6b9q                                1/1       Running     0          20d
siabm-seguranca-biometria-consulta-api-des-73-deploy                    0/1       Completed   0          153d
siabm-seguranca-biometria-consulta-api-des-74-deploy                    0/1       Completed   0          88d
siabm-seguranca-biometria-consulta-api-sandbox-des-2-deploy             0/1       Completed   0          186d
siabm-seguranca-biometria-consulta-api-sandbox-des-2-wv6nt              1/1       Running     0          10d
siabm-seguranca-biometria-registros-autenticacao-des-18-deploy          0/1       Completed   0          157d
siabm-seguranca-biometria-registros-autenticacao-des-19-deploy          0/1       Completed   0          88d
siabm-seguranca-biometria-registros-autenticacao-sandbox-des-5-deploy   0/1       Completed   0          98d
siabm-troca-criptografia-des-37-5slln                                   1/1       Running     0          276d
-sh-4.2$ oc rsh -n siabm-des
error: rsh requires a single Pod to connect to
See 'oc rsh -h' for help and examples.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siabm-autenticacao-api-sandbox-des-13-rg72f -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-sandbox-des-13-rg72f" not found
-sh-4.2$ java version
Erro: Não foi possível localizar nem carregar a classe principal version
-sh-4.2$ java -version
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo $JAVA_HOME

-sh-4.2$ ls -la $JAVA_HOME/lib/ext 2>/dev/null || echo "pasta ext não existe - Java 9+"
pasta ext não existe - Java 9+
-sh-4.2$
-sh-4.2$
-sh-4.2$
