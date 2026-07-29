
-sh-4.2$
-sh-4.2$ oc get all -n sispl-des | grep sispl-processamento-sumarizacao

pod/sispl-processamento-sumarizacao-des-574688844-rkvrn   1/1       Running            4 (67s ago)       9m9s

service/sispl-processamento-sumarizacao-des                ClusterIP   25.0.124.69    <none>        8080/TCP,8778/TCP,8009/TCP   21h

deployment.apps/sispl-processamento-sumarizacao-des   1/1       1            1           21h
replicaset.apps/sispl-processamento-sumarizacao-des-574688844    1         1         1         9m9s
replicaset.apps/sispl-processamento-sumarizacao-des-785696bdd4   0         0         0         21h


imagestream.image.openshift.io/sispl-processamento-sumarizacao-des        image-registry.openshift-image-registry.svc:5000/sispl-des/sispl-processamento-sumarizacao-des
route.route.openshift.io/sispl-processamento-sumarizacao-des   sispl-processamento-sumarizacao-des.apps.nctvmrh001.nuvem.caixa             sispl-processamento-sumarizacao-des   web       edge/Redirect   None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment,statefulset,dc -n sispl-des
NAME                                                  READY     UP-TO-DATE   AVAILABLE   AGE
deployment.apps/sispl-api-apostas-des                 1/1       1            1           13d
deployment.apps/sispl-api-apostas-ocp4-plus-des       0/1       1            0           44h
deployment.apps/sispl-api-mkp-des                     0/1       1            0           41h
deployment.apps/sispl-canal-processamento-pix-des     0/1       1            0           21h
deployment.apps/sispl-canal-webhook-pix-des           1/1       1            1           20h
deployment.apps/sispl-captacao-mkp-des                0/1       1            0           21h
deployment.apps/sispl-consulta-apostas-api-des        1/1       1            1           13d
deployment.apps/sispl-parametros-des                  0/1       1            0           22h
deployment.apps/sispl-processamento-sumarizacao-des   1/1       1            1           21h
-sh-4.2$
