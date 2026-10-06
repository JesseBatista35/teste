
-sh-4.2$ oc describe pod sicmo-internet-des-97-jhcrl -n sicmo-des
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sicmo-internet-des-97-jhcrl -n sicmo-des \
> -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sicmo-internet-des-97-jhcrl -n sicmo-des \
>   -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deploy,dc -n sicmo-des | grep sicmo
deploymentconfig.apps.openshift.io/sicmo-api-17-des              23         1         1
deploymentconfig.apps.openshift.io/sicmo-backend-des             199        1         1
deploymentconfig.apps.openshift.io/sicmo-eap-des                 4          1         0
deploymentconfig.apps.openshift.io/sicmo-internet-des            97         1         1
deploymentconfig.apps.openshift.io/sicmo-internet-frontend-des   99         1         1
deploymentconfig.apps.openshift.io/sicmo-web-des                 211        1         1
-sh-4.2$ oc get dc sicmo-internet-des -n sicmo-des -o yaml > internet.yaml
-sh-4.2$ oc get dc sicmo-intranet-des -n sicmo-des -o yaml > intranet.yaml   # ajuste o nome real
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sicmo-intranet-des" not found
-sh-4.2$ diff <(yq '.spec.template.spec.initContainers' intranet.yaml) <(yq '.spec.template.spec.initContainers' internet.yaml)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$
-sh-4.2$
-sh-4.2$

<img width="1667" height="697" alt="image" src="https://github.com/user-attachments/assets/689619e5-791d-4de9-8d62-50663e2e66fc" />



Streaming events...
Showing 3 events
Older events are not stored.
PodPsicmo-internet-des-97-8bb57
NamespaceNSsicmo-des
6 de out. de 2026, 12:35
Generated from kubelet on ceadecldlx019.nprd.caixa
2 times in the last 2 minutes
Unable to attach or mount volumes: unmounted volumes=[sicmo-internet-data-des], unattached volumes=[sicmo-internet-data-des caixa-truststore-acteste-nprd secrets kube-api-access-b6tdd script-bt-volume]: timed out waiting for the condition
PodPsicmo-internet-des-97-8bb57
NamespaceNSsicmo-des
6 de out. de 2026, 12:34
Generated from kubelet on ceadecldlx019.nprd.caixa
10 times in the last 4 minutes
MountVolume.SetUp failed for volume "sicmo-internet-data-des" : mount failed: exit status 32 Mounting command: mount Mounting arguments: -t nfs hypernprd12.ad.caixa:/fs_sicmo /var/lib/kubelet/pods/6cea3605-4634-444c-a977-58f4eb281ff9/volumes/kubernetes.io~nfs/sicmo-internet-data-des Output: mount.nfs: access denied by server while mounting hypernprd12.ad.caixa:/fs_sicmo
PodPsicmo-internet-des-97-8bb57
NamespaceNSsicmo-des
6 de out. de 2026, 12:30
Generated from default-scheduler
Successfully assigned sicmo-des/sicmo-internet-des-97-8bb57 to ceadecldlx019.nprd.caixa
