-sh-4.2$ oc logs -n sicbc-backend-des-15-mstdb --tail=100
error: expected 'logs (POD | TYPE/NAME) [CONTAINER_NAME]'.
POD or TYPE/NAME is a required argument for the logs command
See 'oc logs -h' for help and examples.
-sh-4.2$ oc logs -n sicbc-des sicbc-backend-des-15-mstdb --tail=100
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
-sh-4.2$ oc logs -n sicbc-des sicbc-backend-des-15-mstdb --previous  --tail=100
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
-sh-4.2$ oc logs -n sicbc-des sicbc-backend-des-15-mstdb -f
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod -n sicbc-des sicbc-backend-des-15-mstdb
E0605 17:07:54.395372   67222 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sicbc-backend-des-15-mstdb", GenerateName:"sicbc-backend-des-15-", Namespace:"sicbc-des", SelfLink:"", UID:"59ea7424-7ca1-4717-8b3e-4e824fbb0674", ResourceVersion:"1999792048", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63916286708, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"CGC_DES":"7390", "CGC_OPS":"7259", "app":"sicbc-backend-des", "deployment":"sicbc-backend-des-15", "deploymentconfig":"sicbc-backend-des", "name":"sicbc-backend-des"}, Annotations:map[string]string{"openshift.io/scc":"anyuid", "k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.2.19.246\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.2.19.246\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "openshift.io/deployment-config.latest-version":"15", "openshift.io/deployment-config.name":"sicbc-backend-des", "openshift.io/deployment.name":"sicbc-backend-des-15"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"sicbc-backend-des-15", UID:"51f8c2b7-5da1-4b88-b388-e9e5d1061cce", Controller:(*bool)(0xc4216bccfa), BlockOwnerDeletion:(*bool)(0xc4216bccfb)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4214d9700), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-swp2g", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc420ff2800), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sicbc-backend-des", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:2, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/deployments/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-swp2g", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc420feeb40), ReadinessProbe:(*core.Probe)(0xc420feeba0), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc4214d9980), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc4216bd428), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx042.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc420cf5730), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc4216bd4e0)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc4216bd500)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc4216bd528), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63916286708, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63916286708, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sicbc-backend-des]"}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63916286708, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sicbc-backend-des]"}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63916286708, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.62", PodIP:"25.2.19.246", StartTime:(*v1.Time)(0xc420ff2780), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sicbc-backend-des", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(0xc420ff27c0), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc420cf56c0)}, Ready:false, RestartCount:4, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend@sha256:c24536edade6d5ced895a3694123b00d9c3d01dbb563bc5ac209a75b372d609d", ContainerID:"cri-o://f950fddd9236913576b898b238fbee4f5463f9a8f5c0140536b16f868811daf2"}}}}': selfLink was empty, can't make reference
Name:               sicbc-backend-des-15-mstdb
Namespace:          sicbc-des
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx042.nprd.caixa/10.116.208.62
Start Time:         Fri, 05 Jun 2026 17:05:08 -0300
Labels:             CGC_DES=7390
                    CGC_OPS=7259
                    app=sicbc-backend-des
                    deployment=sicbc-backend-des-15
                    deploymentconfig=sicbc-backend-des
                    name=sicbc-backend-des
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.2.19.246"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.2.19.246"
    ],
    "default": true,
    "dns": {}
}]
                openshift.io/deployment-config.latest-version=15
                openshift.io/deployment-config.name=sicbc-backend-des
                openshift.io/deployment.name=sicbc-backend-des-15
                openshift.io/scc=anyuid
Status:         Running
IP:             25.2.19.246
Controlled By:  ReplicationController/sicbc-backend-des-15
Containers:
  sicbc-backend-des:
    Container ID:   cri-o://f950fddd9236913576b898b238fbee4f5463f9a8f5c0140536b16f868811daf2
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend@sha256:c24536edade6d5ced895a3694123b00d9c3d01dbb563bc5ac209a75b372d609d
    Port:           8080/TCP
    Host Port:      0/TCP
    State:          Waiting
      Reason:       CrashLoopBackOff
    Last State:     Terminated
      Reason:       Error
      Exit Code:    1
      Started:      Fri, 05 Jun 2026 17:06:59 -0300
      Finished:     Fri, 05 Jun 2026 17:06:59 -0300
    Ready:          False
    Restart Count:  4
    Limits:
      cpu:     2
      memory:  2Gi
    Requests:
      cpu:      1
      memory:   1Gi
    Liveness:   tcp-socket :8080 delay=15s timeout=30s period=10s #success=1 #failure=3
    Readiness:  tcp-socket :8080 delay=25s timeout=50s period=10s #success=1 #failure=3
    Environment:
      TZ:  America/Sao_Paulo
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-swp2g (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             False
  ContainersReady   False
  PodScheduled      True
Volumes:
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  kube-api-access-swp2g:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$ oc get  pod -n sicbc-des sicbc-backend-des-15-mstdb -o yaml
apiVersion: v1
kind: Pod
metadata:
  annotations:
    k8s.v1.cni.cncf.io/network-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.19.246"
          ],
          "default": true,
          "dns": {}
      }]
    k8s.v1.cni.cncf.io/networks-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.19.246"
          ],
          "default": true,
          "dns": {}
      }]
    openshift.io/deployment-config.latest-version: "15"
    openshift.io/deployment-config.name: sicbc-backend-des
    openshift.io/deployment.name: sicbc-backend-des-15
    openshift.io/scc: anyuid
  creationTimestamp: 2026-06-05T20:05:08Z
  generateName: sicbc-backend-des-15-
  labels:
    CGC_DES: "7390"
    CGC_OPS: "7259"
    app: sicbc-backend-des
    deployment: sicbc-backend-des-15
    deploymentconfig: sicbc-backend-des
    name: sicbc-backend-des
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:openshift.io/deployment-config.latest-version: {}
          f:openshift.io/deployment-config.name: {}
          f:openshift.io/deployment.name: {}
        f:generateName: {}
        f:labels:
          .: {}
          f:CGC_DES: {}
          f:CGC_OPS: {}
          f:app: {}
          f:deployment: {}
          f:deploymentconfig: {}
          f:name: {}
        f:ownerReferences:
          .: {}
          k:{"uid":"51f8c2b7-5da1-4b88-b388-e9e5d1061cce"}: {}
      f:spec:
        f:containers:
          k:{"name":"sicbc-backend-des"}:
            .: {}
            f:env:
              .: {}
              k:{"name":"TZ"}:
                .: {}
                f:name: {}
                f:value: {}
            f:image: {}
            f:imagePullPolicy: {}
            f:livenessProbe:
              .: {}
              f:failureThreshold: {}
              f:initialDelaySeconds: {}
              f:periodSeconds: {}
              f:successThreshold: {}
              f:tcpSocket:
                .: {}
                f:port: {}
              f:timeoutSeconds: {}
            f:name: {}
            f:ports:
              .: {}
              k:{"containerPort":8080,"protocol":"TCP"}:
                .: {}
                f:containerPort: {}
                f:protocol: {}
            f:readinessProbe:
              .: {}
              f:failureThreshold: {}
              f:initialDelaySeconds: {}
              f:periodSeconds: {}
              f:successThreshold: {}
              f:tcpSocket:
                .: {}
                f:port: {}
              f:timeoutSeconds: {}
            f:resources:
              .: {}
              f:limits:
                .: {}
                f:cpu: {}
                f:memory: {}
              f:requests:
                .: {}
                f:cpu: {}
                f:memory: {}
            f:terminationMessagePath: {}
            f:terminationMessagePolicy: {}
            f:volumeMounts:
              .: {}
              k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                .: {}
                f:mountPath: {}
                f:name: {}
                f:subPath: {}
        f:dnsPolicy: {}
        f:enableServiceLinks: {}
        f:imagePullSecrets:
          .: {}
          k:{"name":"registry-secret"}: {}
        f:restartPolicy: {}
        f:schedulerName: {}
        f:securityContext: {}
        f:terminationGracePeriodSeconds: {}
        f:volumes:
          .: {}
          k:{"name":"caixa-truststore-acteste-nprd"}:
            .: {}
            f:name: {}
            f:secret:
              .: {}
              f:defaultMode: {}
              f:secretName: {}
    manager: kube-controller-manager
    operation: Update
    time: 2026-06-05T20:05:08Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          f:k8s.v1.cni.cncf.io/network-status: {}
          f:k8s.v1.cni.cncf.io/networks-status: {}
    manager: multus
    operation: Update
    subresource: status
    time: 2026-06-05T20:05:11Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:conditions:
          k:{"type":"ContainersReady"}:
            .: {}
            f:lastProbeTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
            f:type: {}
          k:{"type":"Initialized"}:
            .: {}
            f:lastProbeTime: {}
            f:lastTransitionTime: {}
            f:status: {}
            f:type: {}
          k:{"type":"Ready"}:
            .: {}
            f:lastProbeTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
            f:type: {}
        f:containerStatuses: {}
        f:hostIP: {}
        f:phase: {}
        f:podIP: {}
        f:podIPs:
          .: {}
          k:{"ip":"25.2.19.246"}:
            .: {}
            f:ip: {}
        f:startTime: {}
    manager: kubelet
    operation: Update
    subresource: status
    time: 2026-06-05T20:07:01Z
  name: sicbc-backend-des-15-mstdb
  namespace: sicbc-des
  ownerReferences:
  - apiVersion: v1
    blockOwnerDeletion: true
    controller: true
    kind: ReplicationController
    name: sicbc-backend-des-15
    uid: 51f8c2b7-5da1-4b88-b388-e9e5d1061cce
  resourceVersion: "1999792048"
  uid: 59ea7424-7ca1-4717-8b3e-4e824fbb0674
spec:
  containers:
  - env:
    - name: TZ
      value: America/Sao_Paulo
    image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04
    imagePullPolicy: Always
    livenessProbe:
      failureThreshold: 3
      initialDelaySeconds: 15
      periodSeconds: 10
      successThreshold: 1
      tcpSocket:
        port: 8080
      timeoutSeconds: 30
    name: sicbc-backend-des
    ports:
    - containerPort: 8080
      protocol: TCP
    readinessProbe:
      failureThreshold: 3
      initialDelaySeconds: 25
      periodSeconds: 10
      successThreshold: 1
      tcpSocket:
        port: 8080
      timeoutSeconds: 50
    resources:
      limits:
        cpu: "2"
        memory: 2Gi
      requests:
        cpu: "1"
        memory: 1Gi
    securityContext:
      capabilities:
        drop:
        - MKNOD
    terminationMessagePath: /dev/termination-log
    terminationMessagePolicy: File
    volumeMounts:
    - mountPath: /deployments/caixa-truststore-acteste-nprd.jks
      name: caixa-truststore-acteste-nprd
      subPath: caixa-truststore-acteste-nprd.jks
    - mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      name: kube-api-access-swp2g
      readOnly: true
  dnsPolicy: ClusterFirst
  enableServiceLinks: true
  imagePullSecrets:
  - name: registry-secret
  nodeName: ceadecldlx042.nprd.caixa
  preemptionPolicy: PreemptLowerPriority
  priority: 0
  restartPolicy: Always
  schedulerName: default-scheduler
  securityContext:
    seLinuxOptions:
      level: s0:c97,c94
  serviceAccount: default
  serviceAccountName: default
  terminationGracePeriodSeconds: 30
  tolerations:
  - effect: NoExecute
    key: node.kubernetes.io/not-ready
    operator: Exists
    tolerationSeconds: 300
  - effect: NoExecute
    key: node.kubernetes.io/unreachable
    operator: Exists
    tolerationSeconds: 300
  - effect: NoSchedule
    key: node.kubernetes.io/memory-pressure
    operator: Exists
  volumes:
  - name: caixa-truststore-acteste-nprd
    secret:
      defaultMode: 420
      secretName: caixa-truststore-acteste-nprd
  - name: kube-api-access-swp2g
    projected:
      defaultMode: 420
      sources:
      - serviceAccountToken:
          expirationSeconds: 3607
          path: token
      - configMap:
          items:
          - key: ca.crt
            path: ca.crt
          name: kube-root-ca.crt
      - downwardAPI:
          items:
          - fieldRef:
              apiVersion: v1
              fieldPath: metadata.namespace
            path: namespace
      - configMap:
          items:
          - key: service-ca.crt
            path: service-ca.crt
          name: openshift-service-ca.crt
status:
  conditions:
  - lastProbeTime: null
    lastTransitionTime: 2026-06-05T20:05:08Z
    status: "True"
    type: Initialized
  - lastProbeTime: null
    lastTransitionTime: 2026-06-05T20:05:08Z
    message: 'containers with unready status: [sicbc-backend-des]'
    reason: ContainersNotReady
    status: "False"
    type: Ready
  - lastProbeTime: null
    lastTransitionTime: 2026-06-05T20:05:08Z
    message: 'containers with unready status: [sicbc-backend-des]'
    reason: ContainersNotReady
    status: "False"
    type: ContainersReady
  - lastProbeTime: null
    lastTransitionTime: 2026-06-05T20:05:08Z
    status: "True"
    type: PodScheduled
  containerStatuses:
  - containerID: cri-o://f950fddd9236913576b898b238fbee4f5463f9a8f5c0140536b16f868811daf2
    image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04
    imageID: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend@sha256:c24536edade6d5ced895a3694123b00d9c3d01dbb563bc5ac209a75b372d609d
    lastState:
      terminated:
        containerID: cri-o://f950fddd9236913576b898b238fbee4f5463f9a8f5c0140536b16f868811daf2
        exitCode: 1
        finishedAt: 2026-06-05T20:06:59Z
        reason: Error
        startedAt: 2026-06-05T20:06:59Z
    name: sicbc-backend-des
    ready: false
    restartCount: 4
    started: false
    state:
      waiting:
        message: back-off 1m20s restarting failed container=sicbc-backend-des pod=sicbc-backend-des-15-mstdb_sicbc-des(59ea7424-7ca1-4717-8b3e-4e824fbb0674)
        reason: CrashLoopBackOff
  hostIP: 10.116.208.62
  phase: Running
  podIP: 25.2.19.246
  podIPs:
  - ip: 25.2.19.246
  qosClass: Burstable
  startTime: 2026-06-05T20:05:08Z
-sh-4.2$
