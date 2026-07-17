Psifof-api-aplicacao-tqs-63-w65l9
NamespaceNSsifof-tqs
17 de jul. de 2026, 10:45
Generated from kubelet on ceadecldlx062.nprd.caixa
Unable to attach or mount volumes: unmounted volumes=[sifof-api-aplicacao-data-tqs], unattached volumes=[kube-api-access-dj4dn script-bt-volume sifof-api-aplicacao-data-tqs caixa-truststore-acteste-nprd secrets]: timed out waiting for the condition
PodPsifof-api-aplicacao-tqs-63-w65l9
NamespaceNSsifof-tqs
17 de jul. de 2026, 10:44
Generated from kubelet on ceadecldlx062.nprd.caixa
MountVolume.SetUp failed for volume "sifof-api-aplicacao-data-tqs" : mount failed: exit status 32 Mounting command: mount Mounting arguments: -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF /var/lib/kubelet/pods/c6b99161-2ee2-4e36-a6f0-38445d7d4fe0/volumes/kubernetes.io~nfs/sifof-api-aplicacao-data-tqs Output: mount.nfs: Connection timed out
PodPsifof-api-aplicacao-tqs-63-w65l9
NamespaceNSsifof-tqs
17 de jul. de 2026, 10:43
Generated from kubelet on ceadecldlx062.nprd.caixa
Unable to attach or mount volumes: unmounted volumes=[sifof-api-aplicacao-data-tqs], unattached volumes=[secrets kube-api-access-dj4dn script-bt-volume sifof-api-aplicacao-data-tqs caixa-truststore-acteste-nprd]: timed out waiting for the condition




-sh-4.2$ oc describe pod sifof-api-aplicacao-tqs-63-w65l9
Error from server (NotFound): pods "sifof-api-aplicacao-tqs-63-w65l9" not found
-sh-4.2$ oc describe pod sifof-api-aplicacao-tqs-63-w65l9 -n sifof-tqs
E0717 10:49:32.769278   59316 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sifof-api-aplicacao-tqs-63-w65l9", GenerateName:"sifof-api-aplicacao-tqs-63-", Namespace:"sifof-tqs", SelfLink:"", UID:"c6b99161-2ee2-4e36-a6f0-38445d7d4fe0", ResourceVersion:"2083819257", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63919892491, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"deployment":"sifof-api-aplicacao-tqs-63", "deploymentconfig":"sifof-api-aplicacao-tqs", "name":"sifof-api-aplicacao-tqs", "CGC_DES":"7390", "CGC_OPS":"7259", "app":"sifof-api-aplicacao-tqs"}, Annotations:map[string]string{"k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.1.45.189\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.1.45.189\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "kubernetes.io/limit-ranger":"LimitRanger plugin set: cpu request for init container secrets-agent-sidecar; cpu limit for init container secrets-agent-sidecar; cpu, memory request for init container secrets-check; cpu, memory limit for init container secrets-check", "openshift.io/deployment-config.latest-version":"63", "openshift.io/deployment-config.name":"sifof-api-aplicacao-tqs", "openshift.io/deployment.name":"sifof-api-aplicacao-tqs-63", "openshift.io/scc":"anyuid"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"sifof-api-aplicacao-tqs-63", UID:"b779a748-2e32-4cf4-900e-6778ecb48b38", Controller:(*bool)(0xc42166d8da), BlockOwnerDeletion:(*bool)(0xc42166d8db)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"secrets", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(0xc4218ee260), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"script-bt-volume", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc42128cb80), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"sifof-api-aplicacao-data-tqs", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(0xc4218ee2c0), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc42128cbc0), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-dj4dn", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc4218eea20), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container{core.Container{Name:"secrets-agent-sidecar", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort(nil), EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"SECRETS_PATH", Value:"/usr/src/app/secrets_files", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"BT_API_URL", Value:"https://sicsn.caixa/BeyondTrust/api/public/v3", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CLIENT_ID", Value:"", ValueFrom:(*core.EnvVarSource)(0xc4218ee4c0)}, core.EnvVar{Name:"CLIENT_SECRET", Value:"", ValueFrom:(*core.EnvVarSource)(0xc4218ee4e0)}, core.EnvVar{Name:"BT_API_VERSION", Value:"3.1", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SECRETS_LIST", Value:"SIFOF_TQS/CLISERFOF_SSO_INTRA,SIFOF_TQS/SIFOF_BT_APIKEY,SIFOF_TQS/SFOFTS01_ORACLE", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"BT_VERIFY_CA", Value:"False", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:419430400, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:419430400, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-dj4dn", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(nil), ReadinessProbe:(*core.Probe)(nil), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc42128d140), Stdin:false, StdinOnce:false, TTY:false}, core.Container{Name:"secrets-check", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552", Command:[]string{"/bin/bash", "/script/bt-check.sh"}, Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort(nil), EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"SECRETS_PATH", Value:"/usr/src/app/secrets_files", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SECRETS_LIST", Value:"SIFOF_TQS/CLISERFOF_SSO_INTRA,SIFOF_TQS/SIFOF_BT_APIKEY,SIFOF_TQS/SFOFTS01_ORACLE", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:536870912, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:536870912, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"script-bt-volume", ReadOnly:false, MountPath:"/script", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-dj4dn", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(nil), ReadinessProbe:(*core.Probe)(nil), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc42128d180), Stdin:false, StdinOnce:false, TTY:false}}, Containers:[]core.Container{core.Container{Name:"sifof-api-aplicacao-tqs", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sifof-api-aplicacao:1.2.0.6", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"API_KEY", Value:"${SIFOF_BT_APIKEY}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HTTPS_PROXY", Value:"http://proxydes.caixa:80", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_STAGING_BASE_PATH", Value:"/sifof/tqs/importacao", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_STAGING_FAILED", Value:"/sifof/tqs/importacao/failed", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_STAGING_PENDING", Value:"/sifof/tqs/importacao/pending", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_STAGING_PROCESSED", Value:"/sifof/tqs/importacao/processed", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_STAGING_PROCESSING", Value:"/sifof/tqs/importacao/processing", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IMPORTACAO_UPLOAD_MAX_FILE_SIZE", Value:"52428800", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JAVA_OPTIONS_APPEND", Value:"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"NO_PROXY", Value:"*.caixa,*.caixa.gov.br", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_URL", Value:"jdbc:oracle:thin:@cnpexdadvm02clu11.extra.caixa.gov.br:1521/ORAT05BC", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_PASSWORD", Value:"${SFOFTS01_ORACLE}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_USERNAME", Value:"SFOFTS01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_LOG_LEVEL", Value:"DEBUG", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_AUTH_SERVER_URL", Value:"https://login.des.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET", Value:"${CLISERFOF_SSO_INTRA}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS", Value:"", ValueFrom:(*core.EnvVarSource)(0xc4218ee7c0)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:2147483648, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:200, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"200m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:268435456, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"sifof-api-aplicacao-data-tqs", ReadOnly:false, MountPath:"/sifof", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/deployments/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-dj4dn", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc4210a7a70), ReadinessProbe:(*core.Probe)(0xc4210a7aa0), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc42128d1c0), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc421830618), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx062.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc4204d3420), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421830970)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421830990)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc4218309b8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Pending", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63919892491, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotInitialized", Message:"containers with incomplete status: [secrets-check]"}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63919892491, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sifof-api-aplicacao-tqs]"}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63919892491, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sifof-api-aplicacao-tqs]"}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63919892491, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.82", PodIP:"25.1.45.189", StartTime:(*v1.Time)(0xc4218ee940), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"secrets-agent-sidecar", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc4204d3340)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:true, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent@sha256:7b923d384a51e0055063443839ed66a11d4980a96e85285c62500c314b01c813", ContainerID:"cri-o://0c62b5bccaef2e76195888c3fb279a956b07318cfd143ad69448671ad8aa2e21"}, core.ContainerStatus{Name:"secrets-check", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(0xc4218ee9a0), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc4204d33b0)}, Ready:false, RestartCount:4, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi@sha256:f5983f7c7878cc9b26a3962be7756e3c810e9831b0b9f9613e6f6b445f884e74", ContainerID:"cri-o://73effd02ada4ed6f96bab0018299956dcc787a072c9b73700801eed7cc434750"}}, ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sifof-api-aplicacao-tqs", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(0xc4218ee9e0), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:false, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sifof-api-aplicacao:1.2.0.6", ImageID:"", ContainerID:""}}}}': selfLink was empty, can't make reference
Name:               sifof-api-aplicacao-tqs-63-w65l9
Namespace:          sifof-tqs
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx062.nprd.caixa/10.116.208.82
Start Time:         Fri, 17 Jul 2026 10:41:31 -0300
Labels:             CGC_DES=7390
                    CGC_OPS=7259
                    app=sifof-api-aplicacao-tqs
                    deployment=sifof-api-aplicacao-tqs-63
                    deploymentconfig=sifof-api-aplicacao-tqs
                    name=sifof-api-aplicacao-tqs
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.1.45.189"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.1.45.189"
    ],
    "default": true,
    "dns": {}
}]
                kubernetes.io/limit-ranger=LimitRanger plugin set: cpu request for init container secrets-agent-sidecar; cpu limit for init container secrets-agent-sidecar; cpu, memory request for init container secr...
                openshift.io/deployment-config.latest-version=63
                openshift.io/deployment-config.name=sifof-api-aplicacao-tqs
                openshift.io/deployment.name=sifof-api-aplicacao-tqs-63
                openshift.io/scc=anyuid
Status:         Pending
IP:             25.1.45.189
Controlled By:  ReplicationController/sifof-api-aplicacao-tqs-63
Init Containers:
  secrets-agent-sidecar:
    Container ID:   cri-o://0c62b5bccaef2e76195888c3fb279a956b07318cfd143ad69448671ad8aa2e21
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent@sha256:7b923d384a51e0055063443839ed66a11d4980a96e85285c62500c314b01c813
    Port:           <none>
    Host Port:      <none>
    State:          Terminated
      Reason:       Completed
      Exit Code:    0
      Started:      Fri, 17 Jul 2026 10:46:45 -0300
      Finished:     Fri, 17 Jul 2026 10:46:47 -0300
    Ready:          True
    Restart Count:  0
    Limits:
      cpu:     500m
      memory:  400Mi
    Requests:
      cpu:     500m
      memory:  400Mi
    Environment:
      SECRETS_PATH:    /usr/src/app/secrets_files
      BT_API_URL:      https://sicsn.caixa/BeyondTrust/api/public/v3
      CLIENT_ID:       <set to the key 'BT_CLIENT_ID' in secret 'bt-client-secret-sifof-api-aplicacao-tqs'>      Optional: false
      CLIENT_SECRET:   <set to the key 'BT_CLIENT_SECRET' in secret 'bt-client-secret-sifof-api-aplicacao-tqs'>  Optional: false
      BT_API_VERSION:  3.1
      SECRETS_LIST:    SIFOF_TQS/CLISERFOF_SSO_INTRA,SIFOF_TQS/SIFOF_BT_APIKEY,SIFOF_TQS/SFOFTS01_ORACLE
      BT_VERIFY_CA:    False
    Mounts:
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-dj4dn (ro)
  secrets-check:
    Container ID:  cri-o://73effd02ada4ed6f96bab0018299956dcc787a072c9b73700801eed7cc434750
    Image:         default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
    Image ID:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi@sha256:f5983f7c7878cc9b26a3962be7756e3c810e9831b0b9f9613e6f6b445f884e74
    Port:          <none>
    Host Port:     <none>
    Command:
      /bin/bash
      /script/bt-check.sh
    State:          Waiting
      Reason:       CrashLoopBackOff
    Last State:     Terminated
      Reason:       Error
      Exit Code:    4
      Started:      Fri, 17 Jul 2026 10:48:10 -0300
      Finished:     Fri, 17 Jul 2026 10:48:10 -0300
    Ready:          False
    Restart Count:  4
    Limits:
      cpu:     500m
      memory:  512Mi
    Requests:
      cpu:     500m
      memory:  512Mi
    Environment:
      SECRETS_PATH:  /usr/src/app/secrets_files
      SECRETS_LIST:  SIFOF_TQS/CLISERFOF_SSO_INTRA,SIFOF_TQS/SIFOF_BT_APIKEY,SIFOF_TQS/SFOFTS01_ORACLE
    Mounts:
      /script from script-bt-volume (rw)
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-dj4dn (ro)
Containers:
  sifof-api-aplicacao-tqs:
    Container ID:
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sifof-api-aplicacao:1.2.0.6
    Image ID:
    Port:           8080/TCP
    Host Port:      0/TCP
    State:          Waiting
      Reason:       PodInitializing
    Ready:          False
    Restart Count:  0
    Limits:
      cpu:     1
      memory:  2Gi
    Requests:
      cpu:      200m
      memory:   256Mi
    Liveness:   http-get http://:8080/q/health/live delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:                                      America/Sao_Paulo
      API_KEY:                                 ${SIFOF_BT_APIKEY}
      HTTPS_PROXY:                             http://proxydes.caixa:80
      IMPORTACAO_STAGING_BASE_PATH:            /sifof/tqs/importacao
      IMPORTACAO_STAGING_FAILED:               /sifof/tqs/importacao/failed
      IMPORTACAO_STAGING_PENDING:              /sifof/tqs/importacao/pending
      IMPORTACAO_STAGING_PROCESSED:            /sifof/tqs/importacao/processed
      IMPORTACAO_STAGING_PROCESSING:           /sifof/tqs/importacao/processing
      IMPORTACAO_UPLOAD_MAX_FILE_SIZE:         52428800
      JAVA_OPTIONS_APPEND:                     -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
      NO_PROXY:                                *.caixa,*.caixa.gov.br
      QUARKUS_DATASOURCE_JDBC_URL:             jdbc:oracle:thin:@cnpexdadvm02clu11.extra.caixa.gov.br:1521/ORAT05BC
      QUARKUS_DATASOURCE_PASSWORD:             ${SFOFTS01_ORACLE}
      QUARKUS_DATASOURCE_USERNAME:             SFOFTS01
      QUARKUS_LOG_LEVEL:                       DEBUG
      QUARKUS_OIDC_AUTH_SERVER_URL:            https://login.des.caixa/auth/realms/intranet
      QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET:  ${CLISERFOF_SSO_INTRA}
      SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:   <set to the key 'SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS' in secret 'sifof-api-aplicacao-tqs'>  Optional: false
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /sifof from sifof-api-aplicacao-data-tqs (rw)
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-dj4dn (ro)
Conditions:
  Type              Status
  Initialized       False
  Ready             False
  ContainersReady   False
  PodScheduled      True
Volumes:
  secrets:
    Type:    EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:  Memory
  script-bt-volume:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      sifof-api-aplicacao-tqs-script-bt-check
    Optional:  false
  sifof-api-aplicacao-data-tqs:
    Type:       PersistentVolumeClaim (a reference to a PersistentVolumeClaim in the same namespace)
    ClaimName:  sifof-api-aplicacao-data-tqs
    ReadOnly:   false
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  kube-api-access-dj4dn:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$
