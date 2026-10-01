
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod <pod> -n sihdg-tqs
-sh: pod: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod sihdg-jboss8-tqs-13-zzgrb -n sihdg-tqs
E1001 11:51:14.199691   94778 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sihdg-jboss8-tqs-13-zzgrb", GenerateName:"sihdg-jboss8-tqs-13-", Namespace:"sihdg-tqs", SelfLink:"", UID:"145ea03c-842b-4e95-85dc-f1fe7cbdfb2b", ResourceVersion:"2159945621", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63923175542, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"CGC_OPS":"7259", "app":"sihdg-jboss8-tqs", "deployment":"sihdg-jboss8-tqs-13", "deploymentconfig":"sihdg-jboss8-tqs", "name":"sihdg-jboss8-tqs", "CGC_DES":"7390"}, Annotations:map[string]string{"openshift.io/deployment-config.latest-version":"13", "openshift.io/deployment-config.name":"sihdg-jboss8-tqs", "openshift.io/deployment.name":"sihdg-jboss8-tqs-13", "openshift.io/scc":"anyuid", "k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.1.10.255\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.1.10.255\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"sihdg-jboss8-tqs-13", UID:"5669b989-0db0-4b93-8b0d-27e81b4c7dd9", Controller:(*bool)(0xc420fd07fa), BlockOwnerDeletion:(*bool)(0xc420fd07fb)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4215c4c40), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"jboss-config-sihdg-jboss8", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc4215c4c80), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"java-config-sihdg-jboss8", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc4215c4cc0), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"jdk-security-config-sihdg-jboss8", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc4215c4d00), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-tjrtr", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc42114e2a0), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sihdg-jboss8-tqs", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.14.0.4", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"jmx", HostPort:0, ContainerPort:8778, Protocol:"TCP", HostIP:""}, core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"INSTANCE_IP", Value:"", ValueFrom:(*core.EnvVarSource)(0xc42114e040)}, core.EnvVar{Name:"JAVA_OPTS_APPEND", Value:"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}, "cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:10, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"10m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"jboss-config-sihdg-jboss8", ReadOnly:false, MountPath:"/opt/server/standalone/configuration/standalone.xml", SubPath:"standalone.xml", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"java-config-sihdg-jboss8", ReadOnly:false, MountPath:"/opt/server/bin/standalone.conf", SubPath:"standalone.conf", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"jdk-security-config-sihdg-jboss8", ReadOnly:false, MountPath:"/opt/server/bin/java.security.override", SubPath:"java.security.override", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-tjrtr", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc42114bf20), ReadinessProbe:(*core.Probe)(0xc42114bf50), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc4215c4f80), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc420fd1230), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx028.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc4210c5880), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc420fd12f0)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc420fd1310)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc420fd1338), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63923175542, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63923175582, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"ContainersReady", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63923175582, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63923175542, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.48", PodIP:"25.1.10.255", StartTime:(*v1.Time)(0xc42114e220), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sihdg-jboss8-tqs", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(0xc42114e260), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:true, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.14.0.4", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:22bc53921d41b7e36831d55de7d1cc48a4c83eb7c34cd13dc6b3b48f2e62040a", ContainerID:"cri-o://5dc42b9736ba1ad3322333972b16bc3ab7e29721d93c6ce143bdc72fcc2f109c"}}}}': selfLink was empty, can't make reference
Name:               sihdg-jboss8-tqs-13-zzgrb
Namespace:          sihdg-tqs
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx028.nprd.caixa/10.116.208.48
Start Time:         Mon, 24 Aug 2026 10:39:02 -0300
Labels:             CGC_DES=7390
                    CGC_OPS=7259
                    app=sihdg-jboss8-tqs
                    deployment=sihdg-jboss8-tqs-13
                    deploymentconfig=sihdg-jboss8-tqs
                    name=sihdg-jboss8-tqs
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.1.10.255"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.1.10.255"
    ],
    "default": true,
    "dns": {}
}]
                openshift.io/deployment-config.latest-version=13
                openshift.io/deployment-config.name=sihdg-jboss8-tqs
                openshift.io/deployment.name=sihdg-jboss8-tqs-13
                openshift.io/scc=anyuid
Status:         Running
IP:             25.1.10.255
Controlled By:  ReplicationController/sihdg-jboss8-tqs-13
Containers:
  sihdg-jboss8-tqs:
    Container ID:   cri-o://5dc42b9736ba1ad3322333972b16bc3ab7e29721d93c6ce143bdc72fcc2f109c
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.14.0.4
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:22bc53921d41b7e36831d55de7d1cc48a4c83eb7c34cd13dc6b3b48f2e62040a
    Ports:          8778/TCP, 8080/TCP
    Host Ports:     0/TCP, 0/TCP
    State:          Running
      Started:      Mon, 24 Aug 2026 10:39:09 -0300
    Ready:          True
    Restart Count:  0
    Limits:
      cpu:     1
      memory:  2Gi
    Requests:
      cpu:      10m
      memory:   2Gi
    Liveness:   http-get http://:8080/sihdg-api/health/live delay=60s timeout=5s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/sihdg-api/health/ready delay=30s timeout=5s period=10s #success=1 #failure=5
    Environment:
      TZ:                America/Sao_Paulo
      INSTANCE_IP:        (v1:status.podIP)
      JAVA_OPTS_APPEND:  -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override
    Mounts:
      /opt/server/bin/java.security.override from jdk-security-config-sihdg-jboss8 (rw)
      /opt/server/bin/standalone.conf from java-config-sihdg-jboss8 (rw)
      /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /opt/server/standalone/configuration/standalone.xml from jboss-config-sihdg-jboss8 (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-tjrtr (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             True
  ContainersReady   True
  PodScheduled      True
Volumes:
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  jboss-config-sihdg-jboss8:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      jboss-config-sihdg-jboss8
    Optional:  false
  java-config-sihdg-jboss8:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      java-config-sihdg-jboss8
    Optional:  false
  jdk-security-config-sihdg-jboss8:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      jdk-security-config-sihdg-jboss8
    Optional:  false
  kube-api-access-tjrtr:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
