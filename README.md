
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
secrets -> /usr/src/app/secrets_files
sibec-arquivos-nfs-data-tqs -> /sibec
caixa-truststore-acteste-nprd -> /deployments/caixa-truststore-acteste-nprd.jks
-sh-4.2$ ^C
-sh-4.2$ oc get pvc -n sibec-tqs | grep arquivos
sibec-arquivos-data-tqs       Terminating   sibec-arquivos-data-tqs       50Gi       RWX                              65m
sibec-arquivos-nfs-data-tqs   Bound         sibec-arquivos-nfs-data-tqs   50Gi       RWX            rook-ceph-block   63m
-sh-4.2$ oc get pv sibec-arquivos-data-tqs
NAME                      CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS        CLAIM                               STORAGECLASS   REASON    AGE
sibec-arquivos-data-tqs   50Gi       RWX            Retain           Terminating   sibec-tqs/sibec-arquivos-data-tqs                            65m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sibec-arquivos-data-tqs
NAME                      CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS        CLAIM                               STORAGECLASS   REASON    AGE
sibec-arquivos-data-tqs   50Gi       RWX            Retain           Terminating   sibec-tqs/sibec-arquivos-data-tqs                            65m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sibec-tqs | grep arquivos
sibec-arquivos-tqs-170-deploy            0/1       Completed   0               61m
sibec-arquivos-tqs-171-deploy            0/1       Completed   0               28m
sibec-arquivos-tqs-171-zzdnb             1/1       Running     0               28m
-sh-4.2$
-sh-4.2$
-sh-4.2$
