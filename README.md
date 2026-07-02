
-sh-4.2$ oc get pvc -n sibec-tqs
NAME                          STATUS    VOLUME                        CAPACITY   ACCESS MODES   STORAGECLASS      AGE
sibec-arquivos-data-tqs       Pending   sibec-arquivos-data-tqs       0                                           68m
sibec-arquivos-fgw-data-tqs   Bound     sibec-arquivos-fgw-data-tqs   5Gi        RWX            rook-ceph-block   188d
sibec-data-tqs                Bound     sibec-data-tqs                10Gi       RWX                              518d
sibec-internet-data-tqs       Bound     sibec-internet-data-tqs       50Gi       RWX                              503d
-sh-4.2$ ^C
-sh-4.2$ oc describe pvc sibec-arquivos-data-tqs -n sibec-tqs
Name:          sibec-arquivos-data-tqs
Namespace:     sibec-tqs
StorageClass:
Status:        Pending
Volume:        sibec-arquivos-data-tqs
Labels:        <none>
Annotations:   <none>
Finalizers:    [kubernetes.io/pvc-protection]
Capacity:      0
Access Modes:
VolumeMode:    Filesystem
-sh-4.2$
