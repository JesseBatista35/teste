Se o erro persistir, peço ao time de Mainframe a verificação de: CEMT I URIMAP(D01UMTQS) (USAGE, PIPELINE, WEBSERVICE, PROGRAM, TRANSACTION); CEMT I WEBS(lancamentoV4) (URIMAP associado e STATE); a definição da N1W1 (DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR); e se o D01POSOL está instalado somente nos AORs, já que o ASRA foi registrado no CICQTWB3, que é TOR.

eu nao mandie essa parte aqui acima 


Using project "sid01-tqs".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sid01-lancamentos-financeiros-okd4-tqs CICSWEB_ROOT_ENDPOINT_HTTPS=https://cicsweb.tqs.caixa:32587 -n sid01-tqs
deploymentconfig.apps.openshift.io/sid01-lancamentos-financeiros-okd4-tqs updated
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS      RESTARTS        AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     401 (20m ago)   25d
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-xm7sw        1/1       Running     8 (11h ago)     6d20h
sid01-simulador-tqs-201-deploy                         0/1       Completed   0               109d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0               103d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0               103d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0               23d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0               23d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0               122d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0               122d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0               30d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS      RESTARTS        AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     401 (20m ago)   25d
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-xm7sw        1/1       Running     8 (11h ago)     6d20h
sid01-simulador-tqs-201-deploy                         0/1       Completed   0               109d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0               103d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0               103d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0               23d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0               23d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0               122d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0               122d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0               30d
-sh-4.2$




ach oque tem que tem que fazer o roulot e start
