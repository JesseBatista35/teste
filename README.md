
-sh-4.2$ oc logs siint-saquetecban-pendencia-api-des-45-deploy
--> Scaling up siint-saquetecban-pendencia-api-des-45 from 0 to 1, scaling down siint-saquetecban-pendencia-api-des-37 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling siint-saquetecban-pendencia-api-des-45 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod siint-saquetecban-pendencia-api-des-45-deploy
E0812 11:16:03.385243   77611 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"siint-saquetecban-pendencia-api-des-45-deploy", GenerateName:"", Namespace:"siint-des", SelfLink:"", UID:"fa740e68-87ab-482e-a3a4-9dbb177df9ae", ResourceVersion:"2136235751", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63922139317, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"openshift.io/deployer-pod-for.name":"siint-saquetecban-pendencia-api-des-45"}, Annotations:map[string]string{"k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.0.33.41\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.0.33.41\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "kubernetes.io/limit-ranger":"LimitRanger plugin set: cpu, memory request for container deployment; cpu, memory limit for container deployment", "openshift.io/deployment-config.name":"siint-saquetecban-pendencia-api-des", "openshift.io/deployment.name":"siint-saquetecban-pendencia-api-des-45", "openshift.io/scc":"anyuid"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"siint-saquetecban-pendencia-api-des-45", UID:"a1894319-55f8-4f93-b277-d00c377c19b9", Controller:(*bool)(nil), BlockOwnerDeletion:(*bool)(nil)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"kube-api-access-72f2g", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc421a5dba0), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"deployment", Image:"quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort(nil), EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"OPENSHIFT_DEPLOYMENT_NAME", Value:"siint-saquetecban-pendencia-api-des-45", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPENSHIFT_DEPLOYMENT_NAMESPACE", Value:"siint-des", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:536870912, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}, Requests:core.ResourceList{"memory":resource.Quantity{i:resource.int64Amount{value:536870912, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}, "cpu":resource.Quantity{i:resource.int64Amount{value:30, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"30m", Format:"DecimalSI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"kube-api-access-72f2g", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(nil), ReadinessProbe:(*core.Probe)(nil), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc421a6c000), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Never", TerminationGracePeriodSeconds:(*int64)(0xc421a665c0), ActiveDeadlineSeconds:(*int64)(0xc421a665c8), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"deployer", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx066.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc4205b6d90), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421a66690)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421a666b0)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc421a666d8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Failed", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63922139317, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63922139923, loc:(*time.Location)(0x49403c0)}}, Reason:"PodFailed", Message:""}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63922139923, loc:(*time.Location)(0x49403c0)}}, Reason:"PodFailed", Message:""}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63922139317, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.86", PodIP:"25.0.33.41", StartTime:(*v1.Time)(0xc421a5db40), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"deployment", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc4205b6d20)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:false, RestartCount:0, Image:"quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18", ImageID:"quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18", ContainerID:"cri-o://638d02cb478f4358d89e08ed7038022b053b976239ae28d5f9f345a699e491ab"}}}}': selfLink was empty, can't make reference
Name:               siint-saquetecban-pendencia-api-des-45-deploy
Namespace:          siint-des
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx066.nprd.caixa/10.116.208.86
Start Time:         Wed, 12 Aug 2026 10:48:37 -0300
Labels:             openshift.io/deployer-pod-for.name=siint-saquetecban-pendencia-api-des-45
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.0.33.41"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.0.33.41"
    ],
    "default": true,
    "dns": {}
}]
         kubernetes.io/limit-ranger=LimitRanger plugin set: cpu, memory request for container deployment; cpu, memory limit for container deployment
         openshift.io/deployment-config.name=siint-saquetecban-pendencia-api-des
         openshift.io/deployment.name=siint-saquetecban-pendencia-api-des-45
         openshift.io/scc=anyuid
Status:  Failed
IP:      25.0.33.41
Containers:
  deployment:
    Container ID:   cri-o://638d02cb478f4358d89e08ed7038022b053b976239ae28d5f9f345a699e491ab
    Image:          quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18
    Image ID:       quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18
    Port:           <none>
    Host Port:      <none>
    State:          Terminated
      Reason:       Error
      Exit Code:    1
      Started:      Wed, 12 Aug 2026 10:48:39 -0300
      Finished:     Wed, 12 Aug 2026 10:58:43 -0300
    Ready:          False
    Restart Count:  0
    Limits:
      cpu:     500m
      memory:  512Mi
    Requests:
      cpu:     30m
      memory:  512Mi
    Environment:
      OPENSHIFT_DEPLOYMENT_NAME:       siint-saquetecban-pendencia-api-des-45
      OPENSHIFT_DEPLOYMENT_NAMESPACE:  siint-des
    Mounts:
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-72f2g (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             False
  ContainersReady   False
  PodScheduled      True
Volumes:
  kube-api-access-72f2g:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$
