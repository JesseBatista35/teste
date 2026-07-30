-sh-4.2$ oc get secret -n sispl-tqs | grep -i vault
vaultcaixa-sispl-tqs              Opaque                           1         24m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod sispl-canal-webhook-pix-tqs-6dffbbcc6c-5drxz -n sispl-tqs | grep -A10 Mounts
E0730 12:00:41.021913   37945 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sispl-canal-webhook-pix-tqs-6dffbbcc6c-5drxz", GenerateName:"sispl-canal-webhook-pix-tqs-6dffbbcc6c-", Namespace:"sispl-tqs", SelfLink:"", UID:"6c2a8f0f-1da1-4872-a221-99db2ef2aa54", ResourceVersion:"41304526", Generation:1, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63921019101, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"CGC_DES":"7390", "CGC_OPS":"7259", "name":"sispl-canal-webhook-pix-tqs", "pod-template-hash":"6dffbbcc6c"}, Annotations:map[string]string{"k8s.ovn.org/pod-networks":"{\"default\":{\"ip_addresses\":[\"25.128.6.209/23\"],\"mac_address\":\"0a:58:19:80:06:d1\",\"gateway_ips\":[\"25.128.6.1\"],\"routes\":[{\"dest\":\"25.128.0.0/14\",\"nextHop\":\"25.128.6.1\"},{\"dest\":\"25.0.0.0/16\",\"nextHop\":\"25.128.6.1\"},{\"dest\":\"169.254.0.5/32\",\"nextHop\":\"25.128.6.1\"},{\"dest\":\"100.64.0.0/16\",\"nextHop\":\"25.128.6.1\"}],\"ip_address\":\"25.128.6.209/23\",\"gateway_ip\":\"25.128.6.1\",\"role\":\"primary\"}}", "k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"ovn-kubernetes\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.128.6.209\"\n    ],\n    \"mac\": \"0a:58:19:80:06:d1\",\n    \"default\": true,\n    \"dns\": {}\n}]", "openshift.io/scc":"anyuid", "security.openshift.io/validated-scc-subject-type":"serviceaccount"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"apps/v1", Kind:"ReplicaSet", Name:"sispl-canal-webhook-pix-tqs-6dffbbcc6c", UID:"b6d60c2a-2e37-4197-90bd-7a364e640765", Controller:(*bool)(0xc4206a570a), BlockOwnerDeletion:(*bool)(0xc4206a570b)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"vaultcaixa-sispl-tqs", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc420e77640), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"jboss", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc420e77680), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"caixa-truststore", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc420e776c0), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"vault-sispl-canal-webhook-pix", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc420e77700), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"jboss-config-sispl-canal-webhook-pix", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc420e77740), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"java-config-sispl-canal-webhook-pix", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc420e77780), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-bp289", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc4207a4460), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sispl-canal-webhook-pix-tqs", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-canal-webhook-pix:2.2.0.10", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"web", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}, core.ContainerPort{Name:"jmx", HostPort:0, ContainerPort:8778, Protocol:"TCP", HostIP:""}, core.ContainerPort{Name:"ajp", HostPort:0, ContainerPort:8009, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"INSTANCE_IP", Value:"", ValueFrom:(*core.EnvVarSource)(0xc420553ec0)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"vaultcaixa-sispl-tqs", ReadOnly:false, MountPath:"/opt/jboss/standalone/configuration/vaultcaixa-sispl-tqs.keystore", SubPath:"vaultcaixa-sispl-tqs.keystore", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"jboss", ReadOnly:false, MountPath:"/opt/jboss/standalone/configuration/jboss.keystore", SubPath:"jboss.keystore", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"caixa-truststore", ReadOnly:false, MountPath:"/opt/jboss/standalone/configuration/caixa-truststore.jks", SubPath:"caixa-truststore.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"vault-sispl-canal-webhook-pix", ReadOnly:false, MountPath:"/opt/jboss/standalone/configuration/VAULT.dat", SubPath:"VAULT.dat", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"jboss-config-sispl-canal-webhook-pix", ReadOnly:false, MountPath:"/tmp/standalone-okd.xml", SubPath:"standalone-okd.xml", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"java-config-sispl-canal-webhook-pix", ReadOnly:false, MountPath:"/opt/jboss/bin/standalone.conf", SubPath:"standalone.conf", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-bp289", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc42136bd10), ReadinessProbe:(*core.Probe)(0xc42136bd40), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc420e77a80), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc420680320), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"nctvmrh001-scgft-worker-0-txtg5", SecurityContext:(*core.PodSecurityContext)(0xc421518e70), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc4206803e0)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc420680400)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc420680428), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"PodReadyToStartContainers", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63921019102, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63921019101, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63921019101, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sispl-canal-webhook-pix-tqs]"}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63921019101, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sispl-canal-webhook-pix-tqs]"}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63921019101, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.190.160.35", PodIP:"25.128.6.209", StartTime:(*v1.Time)(0xc4207a4380), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sispl-canal-webhook-pix-tqs", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(0xc4207a43c0), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc421518e00)}, Ready:false, RestartCount:9, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-canal-webhook-pix:2.2.0.10", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-canal-webhook-pix@sha256:68e53be2ad84131391d417189316fb551adf075691b0445625f053992d6baecd", ContainerID:"cri-o://d4108b2c3001c0d29af89156ac6dc75dfa4668ff9e93629f281e3d525fd747e4"}}}}': selfLink was empty, can't make reference
    Mounts:
      /opt/jboss/bin/standalone.conf from java-config-sispl-canal-webhook-pix (rw)
      /opt/jboss/standalone/configuration/VAULT.dat from vault-sispl-canal-webhook-pix (rw)
      /opt/jboss/standalone/configuration/caixa-truststore.jks from caixa-truststore (rw)
      /opt/jboss/standalone/configuration/jboss.keystore from jboss (rw)
      /opt/jboss/standalone/configuration/vaultcaixa-sispl-tqs.keystore from vaultcaixa-sispl-tqs (rw)
      /tmp/standalone-okd.xml from jboss-config-sispl-canal-webhook-pix (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-bp289 (ro)
Conditions:
  Type                        Status
  PodReadyToStartContainers   True
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-canal-webhook-pix-tqs -n sispl-tqs -o yaml | grep -B5 -A15 vaultcaixa
                  k:{"mountPath":"/opt/jboss/standalone/configuration/jboss.keystore"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/opt/jboss/standalone/configuration/vaultcaixa-sispl-tqs.keystore"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/tmp/standalone-okd.xml"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
            f:dnsPolicy: {}
            f:imagePullSecrets:
              .: {}
              k:{"name":"registry-secret"}: {}
            f:restartPolicy: {}
            f:schedulerName: {}
--
                f:configMap:
                  .: {}
                  f:defaultMode: {}
                  f:name: {}
                f:name: {}
              k:{"name":"vaultcaixa-sispl-tqs"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
    manager: oc
    operation: Update
    time: 2026-07-30T14:36:08Z
  - apiVersion: apps/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:template:
          f:spec:
--
            cpu: "1"
            memory: 2Gi
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /opt/jboss/standalone/configuration/vaultcaixa-sispl-tqs.keystore
          name: vaultcaixa-sispl-tqs
          subPath: vaultcaixa-sispl-tqs.keystore
        - mountPath: /opt/jboss/standalone/configuration/jboss.keystore
          name: jboss
          subPath: jboss.keystore
        - mountPath: /opt/jboss/standalone/configuration/caixa-truststore.jks
          name: caixa-truststore
          subPath: caixa-truststore.jks
        - mountPath: /opt/jboss/standalone/configuration/VAULT.dat
          name: vault-sispl-canal-webhook-pix
          subPath: VAULT.dat
        - mountPath: /tmp/standalone-okd.xml
          name: jboss-config-sispl-canal-webhook-pix
          subPath: standalone-okd.xml
        - mountPath: /opt/jboss/bin/standalone.conf
          name: java-config-sispl-canal-webhook-pix
          subPath: standalone.conf
--
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - name: vaultcaixa-sispl-tqs
        secret:
          defaultMode: 420
          secretName: vaultcaixa-sispl-tqs
      - name: jboss
        secret:
          defaultMode: 420
          secretName: jboss
      - name: caixa-truststore
        secret:
          defaultMode: 420
          secretName: caixa-truststore
      - configMap:
          defaultMode: 420
          name: vault-sispl-canal-webhook-pix
        name: vault-sispl-canal-webhook-pix
      - configMap:
          defaultMode: 420
          name: jboss-config-sispl-canal-webhook-pix
-sh-4.2$

