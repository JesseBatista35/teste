-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sicmo-internet-data-des -o yaml > pv-internet-bkp.yaml
-sh-4.2$ oc get pvc sicmo-internet-data-des -n sicmo-des -o yaml > pvc-internet-bkp.yaml
-sh-4.2$ ls -l *bkp.yaml
-rw-r--r-- 1 p585600 usucef 1682 Out  6 14:11 pvc-internet-bkp.yaml
-rw-r--r-- 1 p585600 usucef 1953 Out  6 14:11 pv-internet-bkp.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat > pv-pvc-internet.yaml <<'EOF'
> apiVersion: v1
> kind: PersistentVolume
> metadata:
>   name: sicmo-internet-data-des
> spec:
>   capacity:
>     storage: 10Gi
>   accessModes:
>   - ReadWriteMany
>   persistentVolumeReclaimPolicy: Retain
>   nfs:
>     server: hypernprd56.ad.caixa
>     path: /fs_sicmo
>   claimRef:
>     namespace: sicmo-des
>     name: sicmo-internet-data-des
> ---
> apiVersion: v1
> kind: PersistentVolumeClaim
> metadata:
>   name: sicmo-internet-data-des
>   namespace: sicmo-des
> spec:
>   accessModes:
>   - ReadWriteMany
>   resources:
>     requests:
>       storage: 10Gi
>   storageClassName: ""
>   volumeName: sicmo-internet-data-des
> grep server pv-pvc-internet.yaml
> ^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat > pv-pvc-internet.yaml <<'EOF'
> apiVersion: v1
> kind: PersistentVolume
> metadata:
>   name: sicmo-internet-data-des
> spec:
>   capacity:
>     storage: 10Gi
>   accessModes:
>   - ReadWriteMany
>   persistentVolumeReclaimPolicy: Retain
>   nfs:
>     server: hypernprd56.ad.caixa
>     path: /fs_sicmo
>   claimRef:
>     namespace: sicmo-des
>     name: sicmo-internet-data-des
> ---
> apiVersion: v1
> kind: PersistentVolumeClaim
> metadata:
>   name: sicmo-internet-data-des
>   namespace: sicmo-des
> spec:
>   accessModes:
>   - ReadWriteMany
>   resources:
>     requests:
>       storage: 10Gi
>   storageClassName: ""
>   volumeName: sicmo-internet-data-des
> EOF
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep server pv-pvc-internet.yaml
    server: hypernprd56.ad.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc scale dc sicmo-internet-des --replicas=0 -n sicmo-des
deploymentconfig.apps.openshift.io/sicmo-internet-des scaled
-sh-4.2$ oc delete pvc sicmo-internet-data-des -n sicmo-des
persistentvolumeclaim "sicmo-internet-data-des" deleted
-sh-4.2$ oc delete pv sicmo-internet-data-des
persistentvolume "sicmo-internet-data-des" deleted
-sh-4.2$ oc apply -f pv-pvc-internet.yaml
persistentvolume/sicmo-internet-data-des created
persistentvolumeclaim/sicmo-internet-data-des created
-sh-4.2$ oc get pvc sicmo-internet-data-des -n sicmo-des
NAME                      STATUS    VOLUME                    CAPACITY   ACCESS MODES   STORAGECLASS   AGE
sicmo-internet-data-des   Bound     sicmo-internet-data-des   10Gi       RWX                           4s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc scale dc sicmo-internet-des --replicas=1 -n sicmo-des
deploymentconfig.apps.openshift.io/sicmo-internet-des scaled
-sh-4.2$ oc get pod -n sicmo-des | grep internet-des
sicmo-internet-des-94-deploy            0/1       Completed   0          21h
sicmo-internet-des-94-swszw             0/1       Init:0/2    0          4s
sicmo-internet-des-97-deploy            0/1       Error       0          105m
-sh-4.2$
-sh-4.2$
-sh-4.2$
