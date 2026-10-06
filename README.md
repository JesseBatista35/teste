h-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sicmo-internet-data-des -o yaml | grep -A4 'nfs:'
        f:nfs:
          .: {}
          f:path: {}
          f:server: {}
        f:persistentVolumeReclaimPolicy: {}
--
  nfs:
    path: /fs_sicmo
    server: hypernprd12.ad.caixa
  persistentVolumeReclaimPolicy: Retain
  volumeMode: Filesystem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sicmo-backend-data-des  -o yaml | grep -A4 'nfs:'
        f:nfs:
          .: {}
          f:path: {}
          f:server: {}
        f:persistentVolumeReclaimPolicy: {}
--
  nfs:
    path: /fs_sicmo
    server: hypernprd56.ad.caixa
  persistentVolumeReclaimPolicy: Retain
  volumeMode: Filesystem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sicmo-des --field-selector involvedObject.name=sicmo-internet-des-94-kn4qr
LAST SEEN   TYPE      REASON        OBJECT                            MESSAGE
95m         Normal    Scheduled     pod/sicmo-internet-des-94-kn4qr   Successfully assigned sicmo-des/sicmo-internet-des-94-kn4qr to ceadecldlx041.nprd.caixa
9m53s       Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   MountVolume.SetUp failed for volume "sicmo-internet-data-des" : mount failed: exit status 32
Mounting command: mount
Mounting arguments: -t nfs hypernprd12.ad.caixa:/fs_sicmo /var/lib/kubelet/pods/2cd364e0-dc02-43ab-81ac-a3025b19a8fd/volumes/kubernetes.io~nfs/sicmo-internet-data-des
Output: mount.nfs: access denied by server while mounting hypernprd12.ad.caixa:/fs_sicmo
59m       Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[caixa-truststore-acteste-nprd secrets kube-api-access-2gqwx script-bt-volume sicmo-internet-data-des]: timed out waiting for the condition
5m6s      Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[sicmo-internet-data-des caixa-truststore-acteste-nprd secrets kube-api-access-2gqwx script-bt-volume]: timed out waiting for the condition
34m       Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[secrets kube-api-access-2gqwx script-bt-volume sicmo-internet-data-des caixa-truststore-acteste-nprd]: timed out waiting for the condition
36s       Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[script-bt-volume sicmo-internet-data-des caixa-truststore-acteste-nprd secrets kube-api-access-2gqwx]: timed out waiting for the condition
14m       Warning   FailedMount   pod/sicmo-internet-des-94-kn4qr   Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[kube-api-access-2gqwx script-bt-volume sicmo-internet-data-des caixa-truststore-acteste-nprd secrets]: timed out waiting for the condition
-sh-4.2$
