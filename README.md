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
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sibec-arquivos-tqs -n sibec-tqs
deploymentconfig.apps.openshift.io/sibec-arquivos-tqs rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sibec-arquivos-tqs -n sibec-tqs
Waiting for rollout to finish: 1 old replicas are pending termination...
Waiting for rollout to finish: 1 old replicas are pending termination...
Waiting for latest deployment config spec to be observed by the controller loop...
replication controller "sibec-arquivos-tqs-172" successfully rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sibec-arquivos-tqs -n sibec-tqs
replication controller "sibec-arquivos-tqs-172" successfully rolled out
-sh-4.2$ oc rollout status dc/sibec-arquivos-tqs -n sibec-tqs
replication controller "sibec-arquivos-tqs-172" successfully rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pvc -n sibec-tqs | grep arquivos
sibec-arquivos-nfs-data-tqs   Bound     sibec-arquivos-nfs-data-tqs   50Gi       RWX            rook-ceph-block   66m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sibec-arquivos-data-tqs
No resources found.
Error from server (NotFound): persistentvolumes "sibec-arquivos-data-tqs" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
