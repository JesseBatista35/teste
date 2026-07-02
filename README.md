
-sh-4.2$ oc get pv sibec-arquivos-data-tqs
NAME                      CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS     CLAIM                               STORAGECLASS   REASON    AGE
sibec-arquivos-data-tqs   50Gi       RWX            Retain           Released   sibec-tqs/sibec-arquivos-data-tqs                            498d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pv sibec-arquivos-data-tqs
Name:            sibec-arquivos-data-tqs
Labels:          app=sibec-arquivos-tqs
Annotations:     pv.kubernetes.io/bound-by-controller=yes
Finalizers:      [kubernetes.io/pv-protection]
StorageClass:
Status:          Released
Claim:           sibec-tqs/sibec-arquivos-data-tqs
Reclaim Policy:  Retain
Access Modes:    RWX
VolumeMode:      Filesystem
Capacity:        50Gi
Node Affinity:   <none>
Message:
Source:
    Type:      NFS (an NFS mount that lasts the lifetime of a pod)
    Server:    nfsctcnprd.ctc.caixa
    Path:      /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/SIBEC
    ReadOnly:  false
-sh-4.2$
