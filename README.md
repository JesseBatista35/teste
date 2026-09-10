-sh-4.2$
-sh-4.2$ cat <<EOF | oc apply -f -
> apiVersion: v1
> kind: PersistentVolume
> metadata:
>   labels:
>     app: sihdg-des
>   name: sihdg-sinaf-data-des
> spec:
>   accessModes:
>     - ReadWriteMany
>   capacity:
>     storage: 50Gi
>   claimRef:
>     apiVersion: v1
>     kind: PersistentVolumeClaim
>     name: sihdg-sinaf-data-des
>     namespace: sihdg-des
>   nfs:
>     path: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
>     server: nprdnfs01.ad.caixa
>   persistentVolumeReclaimPolicy: Retain
>   volumeMode: Filesystem
> EOF
persistentvolume/sihdg-sinaf-data-des created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat <<EOF | oc apply -f -
> apiVersion: v1
> kind: PersistentVolumeClaim
> metadata:
>   name: sihdg-sinaf-data-des
>   namespace: sihdg-des
> spec:
>   accessModes:
>     - ReadWriteMany
>   resources:
>     requests:
>       storage: 50Gi
>   storageClassName: ""
>   volumeMode: Filesystem
>   volumeName: sihdg-sinaf-data-des
> EOF
persistentvolumeclaim/sihdg-sinaf-data-des created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv,pvc | grep sinaf
persistentvolume/sihdg-sinaf-data-des                                    50Gi       RWX            Retain           Bound         sihdg-des/sihdg-sinaf-data-des                                                                                          15s

persistentvolumeclaim/sihdg-sinaf-data-des     Bound     sihdg-sinaf-data-des     50Gi       RWX                           8s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sihdg-jboss8-des
error: #91 is already in progress (Running).
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sihdg-jboss8-des
Waiting for rollout to finish: 1 old replicas are pending termination...

