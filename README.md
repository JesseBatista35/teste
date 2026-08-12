-sh-4.2$ oc get pod siint-saquetecban-pendencia-api-des-37-8clsc -o jsonpath='{.spec.containers[0].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siint-saquetecban-pendencia-api:20260806.0959-1.0.0-SNAPSHOT
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod siint-saquetecban-pendencia-api-des-47-d4m25 -o jsonpath='{.spec.containers[0].image}{"\n"}' 2>/dev/null
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siint-saquetecban-pendencia-api:1.0.0.10
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -w &
[1] 99032
-sh-4.2$ NAME                                            READY     STATUS             RESTARTS   AGE
siint-consulta-limite-saque-des-8-bbhks         1/1       Running            0          301d
siint-frontend-des-148-deploy                   0/1       Completed          0          5d
siint-frontend-des-149-deploy                   0/1       Completed          0          1d
siint-frontend-des-149-rdccp                    2/2       Running            0          1d
siint-rtsi-des-39-deploy                        0/1       Completed          0          69d
siint-rtsi-des-40-deploy                        0/1       Completed          0          56d
siint-rtsi-des-40-xrrqg                         1/1       Running            0          56d
siint-rtsi-des-44-deploy                        0/1       Error              0          1d
siint-rtsi-des-45-deploy                        0/1       Error              0          1d
siint-rtsi-des-46-deploy                        0/1       Error              0          1d
siint-saque-des-29-l6kl9                        1/1       Running            1          1y
siint-saquetecban-pendencia-api-des-36-deploy   0/1       Completed          0          6d
siint-saquetecban-pendencia-api-des-37-8clsc    1/1       Running            0          6d
siint-saquetecban-pendencia-api-des-37-deploy   0/1       Completed          0          6d
siint-saquetecban-pendencia-api-des-41-deploy   0/1       Error              0          20h
siint-saquetecban-pendencia-api-des-43-deploy   0/1       Error              0          1h
siint-saquetecban-pendencia-api-des-44-deploy   0/1       Error              0          1h
siint-saquetecban-pendencia-api-des-45-deploy   0/1       Error              0          47m
siint-saquetecban-pendencia-api-des-47-d4m25    0/1       CrashLoopBackOff   5          5m
siint-saquetecban-pendencia-api-des-47-deploy   1/1       Running            0          5m
siint-visamtt-des-20-deploy                     0/1       Completed          0          236d
siint-visamtt-des-20-tllgn                      1/1       Running            0          236d
siint-web-backend-des-300-deploy                0/1       Completed          0          6d
siint-web-backend-des-301-7q28f                 1/1       Running            0          6d
siint-web-backend-des-301-deploy                0/1       Completed          0          6d
siint-zosconnproxy-des-3-deploy                 0/1       Completed          0          104d
siint-zosconnproxy-des-4-deploy                 0/1       Completed          0          103d
siint-zosconnproxy-des-4-mvvr7                  2/2       Running            0          103d
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Running   6         6m
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Error     6         6m
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       CrashLoopBackOff   6         6m
siint-saquetecban-pendencia-api-des-47-deploy   1/1       Terminating   0         7m
siint-saquetecban-pendencia-api-des-47-deploy   0/1       Terminating   0         7m
siint-saquetecban-pendencia-api-des-47-deploy   0/1       Terminating   0         7m
siint-saquetecban-pendencia-api-des-47-deploy   0/1       Terminating   0         7m
siint-saquetecban-pendencia-api-des-48-deploy   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-48-deploy   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-48-deploy   0/1       ContainerCreating   0         0s
siint-saquetecban-pendencia-api-des-48-deploy   0/1       ContainerCreating   0         2s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Terminating   6         7m
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Terminating   6         7m
siint-saquetecban-pendencia-api-des-48-deploy   1/1       Running   0         3s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Terminating   6         7m
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Terminating   6         7m
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Init:0/2   0         0s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Init:0/2   0         2s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Init:0/2   0         2s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Init:1/2   0         4s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       PodInitializing   0         5s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Running   0         6s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Error     0         8s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Running   1         9s
siint-saquetecban-pendencia-api-des-48-fjhpz   0/1       Error     1         11s

