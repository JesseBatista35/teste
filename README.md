    image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
        imagePullPolicy: IfNotPresent
        name: secrets-check
        resources: {}
        terminationMessagePath: /dev/termination-log
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - emptyDir:
          medium: Memory
        name: secrets
      - configMap:
          defaultMode: 420
          name: siinp-nucleo-des-script-bt-check
        name: script-bt-volume
      - name: siinp-mtls-sandbox-of-072025-new
        secret:
          defaultMode: 420
          secretName: siinp-mtls-sandbox-of-072025-new
      - name: siinp-mtls-sandbox-of-112025
        secret:
          defaultMode: 420
          secretName: siinp-mtls-sandbox-of-112025
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des
NAME                         READY     STATUS    RESTARTS   AGE
siinp-nucleo-des-291-4vtrx   1/1       Running   0          3h48m
siinp-nucleo-des-291-c55mr   1/1       Running   0          3h47m
siinp-nucleo-des-291-rvnkb   1/1       Running   0          3h47m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs siinp-nucleo-des-291-rvnkb -n siinp-des -c secrets-check

--- Resultados da Comparacao ---
Sucesso! O conteudo do diretorio corresponde a lista esperada.
-sh-4.2$ ^C
-sh-4.2$ oc describe pod siinp-nucleo-des-291-4vtrx  -n siinp-des
E0914 14:55:58.593056   34723 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"siinp-nucleo-des-291-4vtrx", GenerateName:"siinp-nucleo-des-291-", Namespace:"siinp-des", SelfLink:"", UID:"0f39889f-0dfe-47e4-856e-ab3726719501", ResourceVersion:"2201290875", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63924991587, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"deploymentconfig":"siinp-nucleo-des", "name":"siinp-nucleo-des", "CGC_DES":"7390", "CGC_OPS":"7259", "app":"siinp-nucleo-des", "deployment":"siinp-nucleo-des-291"}, Annotations:map[string]string{"openshift.io/deployment-config.latest-version":"291", "openshift.io/deployment-config.name":"siinp-nucleo-des", "openshift.io/deployment.name":"siinp-nucleo-des-291", "openshift.io/scc":"anyuid", "k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.3.36.161\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.3.36.161\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"siinp-nucleo-des-291", UID:"90a0f8a7-8474-4feb-bd3b-a5324c87ec7c", Controller:(*bool)(0xc4218e2a0c), BlockOwnerDeletion:(*bool)(0xc4218e2a0d)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"secrets", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(0xc421355400), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"script-bt-volume", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(0xc4215e0e40), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"siinp-mtls-sandbox-of-072025-new", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4215e0e80), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"siinp-mtls-sandbox-of-112025", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4215e0ec0), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"siinp-nucleo-data-des", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(0xc421355480), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"siinp-mtls-sandbox-of-072026", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4215e0f00), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4215e0f40), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-p879b", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc421355c20), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container{core.Container{Name:"secrets-agent-sidecar", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort(nil), EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"SECRETS_PATH", Value:"/usr/src/app/secrets_files", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"BT_API_URL", Value:"https://sicsn.caixa/BeyondTrust/api/public/v3", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CLIENT_ID", Value:"", ValueFrom:(*core.EnvVarSource)(0xc421355660)}, core.EnvVar{Name:"CLIENT_SECRET", Value:"", ValueFrom:(*core.EnvVarSource)(0xc421355680)}, core.EnvVar{Name:"BT_API_VERSION", Value:"3.1", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SECRETS_LIST", Value:"SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"BT_VERIFY_CA", Value:"False", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"memory":resource.Quantity{i:resource.int64Amount{value:419430400, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}, Requests:core.ResourceList{"memory":resource.Quantity{i:resource.int64Amount{value:419430400, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-p879b", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(nil), ReadinessProbe:(*core.Probe)(nil), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc4215e1340), Stdin:false, StdinOnce:false, TTY:false}, core.Container{Name:"secrets-check", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552", Command:[]string{"/bin/bash", "/script/bt-check.sh"}, Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort(nil), EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"SECRETS_PATH", Value:"/usr/src/app/secrets_files", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CONFIG_CASE_INSENSITIVE", Value:"0", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SECRETS_LIST", Value:"SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList(nil), Requests:core.ResourceList(nil)}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"script-bt-volume", ReadOnly:false, MountPath:"/script", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-p879b", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(nil), ReadinessProbe:(*core.Probe)(nil), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc4215e1380), Stdin:false, StdinOnce:false, TTY:false}}, Containers:[]core.Container{core.Container{Name:"siinp-nucleo-des", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo:20260904.1644-1.84.2.6-SNAPSHOT", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"AMBIENTE", Value:"PRD", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_LDAP_SUBJECT_DN", Value:"UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER", Value:"https://logindes.caixa.gov.br/auth/realms/internet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER", Value:"https://login.des.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_OPEN_FINANCE_CNPJ", Value:"00360305000104", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_OPEN_FINANCE_ISPB", Value:"00360305", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_OPEN_FINANCE_ORGANISATION_ID", Value:"c160a6f5-e5df-5067-9e97-ec6fba62fd87", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID", Value:"692793df-2c97-4102-9845-0ec180e50d46", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_PIXAPI_DICT_PATH", Value:"/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SIINP_APIM_APIKEY", Value:"l7d1b52b1a66d6451db7a9a2a1784fe5a9", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SIINP_APIM_URL", Value:"https://api.des.caixa:8443", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SSO_INTRANET_CLIENT_ID", Value:"cli-ser-inp", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SSO_INTRANET_CLIENT_SECRET", Value:"4b746850-e224-4db3-b656-4acc71d6d74f", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SSO_INTRANET_TOKEN_ENDPOINT", Value:"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_TRUSTSTORE_PATH", Value:"/deployments/caixa-truststore-acteste-nprd.jks", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DATA_CADASTRO_CLIENTE_INICIADORA", Value:"2026-08-17", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DINAMO_HSM_HOSTNAME", Value:"hsmdes.extra.caixa.gov.br", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DINAMO_HSM_PASSWORD", Value:"${sinpsd01_hsm}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY", Value:"inp_obsandbox_enc_", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY", Value:"assinatura_caixa_", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DINAMO_HSM_USER_ID", Value:"SINPSD01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DIN_JCA_CONF_FILE", Value:"classesConfiguration.ND", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HISTFILE", Value:"/tmp/.bash_history", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HSM_DISABLE_SESSION_CACHE", Value:"0", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HSM_IP", Value:"hsmdes.extra.caixa.gov.br", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HSM_LOG_DIR", Value:"stdout", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HSM_LOG_LEVEL", Value:"0", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HTTP_PROXY", Value:"http://proxydes.caixa:80", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HTTPS_PROXY", Value:"http://proxydes.caixa:80", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IBC_REDIRECT_URI", Value:"https://siinp-nucleo-web-des.apps.nprd.caixa", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JAVA_OPTIONS_APPEND", Value:"-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JORNADA_CACHE_TTL_SECONDS", Value:"3600", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JORNADA_URI_REDIRECT", Value:"https://siinp-nucleo-web-des.apps.nprd.caixa/authorize", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LISTA_LOGO_SERVIDORES_BLOQUEADO", Value:"ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LISTA_SERVIDORES_BLOQUEADO", Value:"teste", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LISTA_SERVIDORES_PRIORITARIOS", Value:"221601a9-6e70-4698-9ea3-1bb28ceb4269,439a9b5c-2cfb-4e57-b60b-20eea83899ca,9326f9b2-ae57-42c4-a0d9-acc4ba434696,06c19499-3412-4125-84b7-d0fbc98b5019,756b9782-d9d4-4f9b-9756-997eba0e2cbd,6a0ec228-70b7-4292-9e64-8fa731b2a730,d7e27a98-ef6c-4b79-b2d8-c2527eba8d84,68308291-ec0d-4398-83ce-68b6b1087e49,aaacb9cf-e8c3-402b-93b8-cf4d3e2ec497,8dd11bd5-165e-4662-9eaa-112ef0d499c0", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LISTA_SERVIDORES_PRIORITARIOS_PJ", Value:"c6b15844-e748-4408-abb6-e71fd59d71c5,75db457a-612d-4d62-b557-ba9d32b05216,7c6748a1-2be0-4593-a769-77feb406b3a0,770f6211-dbd4-4c84-b6b1-9104b4a99359,c2d48e71-07af-4442-8c7d-c82d0eb45e5f,6c8b9aed-8e24-4ad6-985f-213623a23be3,2d641a88-4441-44d9-b39a-a864d1ce8890,fde63db6-f775-44d3-ad88-406a1fb0a48d,edb215da-d1f1-47f0-b794-62a7d798ba6a,649ffe9a-503d-4635-a0fd-41f4b5135b6c", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER", Value:"false", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"MINIAPP_CONVENIO_ID", Value:"10", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"MINIAPP_REDIRECT_URI", Value:"https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"NO_PROXY", Value:"https://data.sandbox.directory.openbankingbrasil.org.br/participants", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE", Value:"urn:ietf:params:oauth:client-assertion-type:jwt-bearer", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN", Value:"client_credentials", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE", Value:"ParentOrganisationReference", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_SCOPE_TOKEN", Value:"directory:software", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE", Value:"https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_URI_PARTICIPANTS", Value:"https://data.sandbox.directory.openbankingbrasil.org.br/participants", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION", Value:"https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_BANKING_BRASIL_URI_TOKEN", Value:"https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_FINANCE_MTLS_CERT", Value:"/deployments/siinp_mtls_sandbox_of_072026.p12", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_FINANCE_MTLS_PASSWORD", Value:"${siinp_keystore_sandbox}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"OPEN_FINANCE_TOKEN_ID_PEPER", Value:"Qk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJp", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PCM_BASEPATH_REQUEST", Value:"/siinp/request", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PCM_BASEPATH_RESPONSE", Value:"/siinp/response", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"POOLING_PAGAMENTO_DELAY", Value:"0", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PROXY_USER_PASSWORD", Value:"${sinpbd01_proxy}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PROXY_USER", Value:"SINPBD01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE", Value:"86400S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE", Value:"86400S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE", Value:"60S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE", Value:"5", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_MAX_SIZE", Value:"50", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_MIN_SIZE", Value:"5", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_URL", Value:"jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/PDBD001NG", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_METRICS_ENABLED", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_PASSWORD", Value:"${sinpbd01_oracle}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_USERNAME", Value:"SINPBD01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HIBERNATE_ORM_LOG_SQL", Value:"false", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_CORS_METHODS", Value:"GET,PUT,POST,DELETE,PATCH", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_CORS_ORIGINS", Value:"https://siinp-nucleo-web-des.apps.nprd.caixa,https://siinp-gestao-web-des.apps.nprd.caixa,http://localhost:4200", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_CORS", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_TEST_PORT", Value:"8888", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL", Value:"DEBUG", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_LOG_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REDIS_HOSTS", Value:"redis://redis-master.redis-siinp-des.svc.cluster.local:6379", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REDIS_MAX_POOL_SIZE", Value:"32", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REDIS_MAX_WAITING_HANDLERS", Value:"256", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REDIS_PASSWORD", Value:"${redis_password}", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REDIS_TIMEOUT", Value:"20S", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SANDBOX_URI_REDIRECT", Value:"siinp-nucleo-web-des.apps.nprd.caixa", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SCOPES_DCR", Value:"openid_payments", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SECURITY_CRYPTO_KEY", Value:"OI8OTCQC8nJPq9vi9psPgSScWu/6RbezD1o2KzlHETg=", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"THREAD_POOL", Value:"20", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS", Value:"", ValueFrom:(*core.EnvVarSource)(0xc4213559c0)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:4, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"4", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:5368709120, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"5Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:2, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"2", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:3221225472, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"3Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"secrets", ReadOnly:false, MountPath:"/usr/src/app/secrets_files", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"siinp-mtls-sandbox-of-072025-new", ReadOnly:false, MountPath:"/deployments/siinp_mtls_sandbox_of_072025_new.p12", SubPath:"siinp_mtls_sandbox_of_072025_new.p12", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"siinp-mtls-sandbox-of-112025", ReadOnly:false, MountPath:"/deployments/siinp_mtls_sandbox_of_112025.p12", SubPath:"siinp_mtls_sandbox_of_112025.p12", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"siinp-nucleo-data-des", ReadOnly:false, MountPath:"/siinp", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"siinp-mtls-sandbox-of-072026", ReadOnly:false, MountPath:"/deployments/siinp_mtls_sandbox_of_072026.p12", SubPath:"siinp_mtls_sandbox_of_072026.p12", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/deployments/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-p879b", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc421357a10), ReadinessProbe:(*core.Probe)(0xc421357a40), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc4215e13c0), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc421362bd8), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx079.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc420d02070), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421362c90)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421362cb0)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc421362cd8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63924991592, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63924991627, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"ContainersReady", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63924991627, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63924991587, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.99", PodIP:"25.3.36.161", StartTime:(*v1.Time)(0xc421355b60), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"secrets-agent-sidecar", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc420c97f80)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:true, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent@sha256:99b89f8f06de50f9b7122edc7ce50cb4b990986bae82cde069730eae087cabbe", ContainerID:"cri-o://d784d5cddd418d23c3065067275eaee16527936f5224f1728a715b3fcaf83b71"}, core.ContainerStatus{Name:"secrets-check", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc420d02000)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:true, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi@sha256:f5983f7c7878cc9b26a3962be7756e3c810e9831b0b9f9613e6f6b445f884e74", ContainerID:"cri-o://c86c9c15d0953233363380f9d34aabe43be0e27c2bc7defe67c338dc04998706"}}, ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"siinp-nucleo-des", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(0xc421355be0), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, Ready:true, RestartCount:0, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo:20260904.1644-1.84.2.6-SNAPSHOT", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo@sha256:bf7ae2f9a281a1de0fd3f424153c43d175dcb4f0d75abd7fd0d1364aa8ff365b", ContainerID:"cri-o://8ebcf65a74b07a345d73f39f8de779d11f83dcedec7a7bb59e99bb96b2e68767"}}}}': selfLink was empty, can't make reference
Name:               siinp-nucleo-des-291-4vtrx
Namespace:          siinp-des
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx079.nprd.caixa/10.116.208.99
Start Time:         Mon, 14 Sep 2026 11:06:27 -0300
Labels:             CGC_DES=7390
                    CGC_OPS=7259
                    app=siinp-nucleo-des
                    deployment=siinp-nucleo-des-291
                    deploymentconfig=siinp-nucleo-des
                    name=siinp-nucleo-des
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.3.36.161"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.3.36.161"
    ],
    "default": true,
    "dns": {}
}]
                openshift.io/deployment-config.latest-version=291
                openshift.io/deployment-config.name=siinp-nucleo-des
                openshift.io/deployment.name=siinp-nucleo-des-291
                openshift.io/scc=anyuid
Status:         Running
IP:             25.3.36.161
Controlled By:  ReplicationController/siinp-nucleo-des-291
Init Containers:
  secrets-agent-sidecar:
    Container ID:   cri-o://d784d5cddd418d23c3065067275eaee16527936f5224f1728a715b3fcaf83b71
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent@sha256:99b89f8f06de50f9b7122edc7ce50cb4b990986bae82cde069730eae087cabbe
    Port:           <none>
    Host Port:      <none>
    State:          Terminated
      Reason:       Completed
      Exit Code:    0
      Started:      Mon, 14 Sep 2026 11:06:29 -0300
      Finished:     Mon, 14 Sep 2026 11:06:31 -0300
    Ready:          True
    Restart Count:  0
    Limits:
      memory:  400Mi
    Requests:
      memory:  400Mi
    Environment:
      SECRETS_PATH:    /usr/src/app/secrets_files
      BT_API_URL:      https://sicsn.caixa/BeyondTrust/api/public/v3
      CLIENT_ID:       <set to the key 'BT_CLIENT_ID' in secret 'bt-client-secret-siinp-nucleo-des'>      Optional: false
      CLIENT_SECRET:   <set to the key 'BT_CLIENT_SECRET' in secret 'bt-client-secret-siinp-nucleo-des'>  Optional: false
      BT_API_VERSION:  3.1
      SECRETS_LIST:    SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM
      BT_VERIFY_CA:    False
    Mounts:
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-p879b (ro)
  secrets-check:
    Container ID:  cri-o://c86c9c15d0953233363380f9d34aabe43be0e27c2bc7defe67c338dc04998706
    Image:         default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
    Image ID:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi@sha256:f5983f7c7878cc9b26a3962be7756e3c810e9831b0b9f9613e6f6b445f884e74
    Port:          <none>
    Host Port:     <none>
    Command:
      /bin/bash
      /script/bt-check.sh
    State:          Terminated
      Reason:       Completed
      Exit Code:    0
      Started:      Mon, 14 Sep 2026 11:06:31 -0300
      Finished:     Mon, 14 Sep 2026 11:06:31 -0300
    Ready:          True
    Restart Count:  0
    Environment:
      SECRETS_PATH:             /usr/src/app/secrets_files
      CONFIG_CASE_INSENSITIVE:  0
      SECRETS_LIST:             SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM
    Mounts:
      /script from script-bt-volume (rw)
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-p879b (ro)
Containers:
  siinp-nucleo-des:
    Container ID:   cri-o://8ebcf65a74b07a345d73f39f8de779d11f83dcedec7a7bb59e99bb96b2e68767
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo:20260904.1644-1.84.2.6-SNAPSHOT
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo@sha256:bf7ae2f9a281a1de0fd3f424153c43d175dcb4f0d75abd7fd0d1364aa8ff365b
    Port:           8080/TCP
    Host Port:      0/TCP
    State:          Running
      Started:      Mon, 14 Sep 2026 11:06:35 -0300
    Ready:          True
    Restart Count:  0
    Limits:
      cpu:     4
      memory:  5Gi
    Requests:
      cpu:      2
      memory:   3Gi
    Liveness:   http-get http://:8080/q/health/live delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:                                                                               America/Sao_Paulo
      AMBIENTE:                                                                         PRD
      CAIXA_LDAP_SUBJECT_DN:                                                            UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR
      CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER:                                              https://logindes.caixa.gov.br/auth/realms/internet
      CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY:                                           MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
      CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER:                                              https://login.des.caixa/auth/realms/intranet
      CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY:                                           MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
      CAIXA_OPEN_FINANCE_CNPJ:                                                          00360305000104
      CAIXA_OPEN_FINANCE_ISPB:                                                          00360305
      CAIXA_OPEN_FINANCE_ORGANISATION_ID:                                               c160a6f5-e5df-5067-9e97-ec6fba62fd87
      CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID:                                         692793df-2c97-4102-9845-0ec180e50d46
      CAIXA_PIXAPI_DICT_PATH:                                                           /transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
      CAIXA_SIINP_APIM_APIKEY:                                                          l7d1b52b1a66d6451db7a9a2a1784fe5a9
      CAIXA_SIINP_APIM_URL:                                                             https://api.des.caixa:8443
      CAIXA_SSO_INTRANET_CLIENT_ID:                                                     cli-ser-inp
      CAIXA_SSO_INTRANET_CLIENT_SECRET:                                                 4b746850-e224-4db3-b656-4acc71d6d74f
      CAIXA_SSO_INTRANET_TOKEN_ENDPOINT:                                                https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
      CAIXA_TRUSTSTORE_PATH:                                                            /deployments/caixa-truststore-acteste-nprd.jks
      DATA_CADASTRO_CLIENTE_INICIADORA:                                                 2026-08-17
      DINAMO_HSM_HOSTNAME:                                                              hsmdes.extra.caixa.gov.br
      DINAMO_HSM_PASSWORD:                                                              ${sinpsd01_hsm}
      DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY:                                        inp_obsandbox_enc_
      DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY:                                         assinatura_caixa_
      DINAMO_HSM_USER_ID:                                                               SINPSD01
      DIN_JCA_CONF_FILE:                                                                classesConfiguration.ND
      HISTFILE:                                                                         /tmp/.bash_history
      HSM_DISABLE_SESSION_CACHE:                                                        0
      HSM_IP:                                                                           hsmdes.extra.caixa.gov.br
      HSM_LOG_DIR:                                                                      stdout
      HSM_LOG_LEVEL:                                                                    0
      HTTP_PROXY:                                                                       http://proxydes.caixa:80
      HTTPS_PROXY:                                                                      http://proxydes.caixa:80
      IBC_REDIRECT_URI:                                                                 https://siinp-nucleo-web-des.apps.nprd.caixa
      JAVA_OPTIONS_APPEND:                                                              -Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m
      JORNADA_CACHE_TTL_SECONDS:                                                        3600
      JORNADA_URI_REDIRECT:                                                             https://siinp-nucleo-web-des.apps.nprd.caixa/authorize
      LISTA_LOGO_SERVIDORES_BLOQUEADO:                                                  ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974
      LISTA_SERVIDORES_BLOQUEADO:                                                       teste
      LISTA_SERVIDORES_PRIORITARIOS:                                                    221601a9-6e70-4698-9ea3-1bb28ceb4269,439a9b5c-2cfb-4e57-b60b-20eea83899ca,9326f9b2-ae57-42c4-a0d9-acc4ba434696,06c19499-3412-4125-84b7-d0fbc98b5019,756b9782-d9d4-4f9b-9756-997eba0e2cbd,6a0ec228-70b7-4292-9e64-8fa731b2a730,d7e27a98-ef6c-4b79-b2d8-c2527eba8d84,68308291-ec0d-4398-83ce-68b6b1087e49,aaacb9cf-e8c3-402b-93b8-cf4d3e2ec497,8dd11bd5-165e-4662-9eaa-112ef0d499c0
      LISTA_SERVIDORES_PRIORITARIOS_PJ:                                                 c6b15844-e748-4408-abb6-e71fd59d71c5,75db457a-612d-4d62-b557-ba9d32b05216,7c6748a1-2be0-4593-a769-77feb406b3a0,770f6211-dbd4-4c84-b6b1-9104b4a99359,c2d48e71-07af-4442-8c7d-c82d0eb45e5f,6c8b9aed-8e24-4ad6-985f-213623a23be3,2d641a88-4441-44d9-b39a-a864d1ce8890,fde63db6-f775-44d3-ad88-406a1fb0a48d,edb215da-d1f1-47f0-b794-62a7d798ba6a,649ffe9a-503d-4635-a0fd-41f4b5135b6c
      MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER:                                  false
      MINIAPP_CONVENIO_ID:                                                              10
      MINIAPP_REDIRECT_URI:                                                             https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar
      NO_PROXY:                                                                         https://data.sandbox.directory.openbankingbrasil.org.br/participants
      OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE:                                        urn:ietf:params:oauth:client-assertion-type:jwt-bearer
      OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN:                                             client_credentials
      OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE:                                ParentOrganisationReference
      OPEN_BANKING_BRASIL_SCOPE_TOKEN:                                                  directory:software
      OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE:                                            https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks
      OPEN_BANKING_BRASIL_URI_PARTICIPANTS:                                             https://data.sandbox.directory.openbankingbrasil.org.br/participants
      OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION:                             https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion
      OPEN_BANKING_BRASIL_URI_TOKEN:                                                    https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token
      OPEN_FINANCE_MTLS_CERT:                                                           /deployments/siinp_mtls_sandbox_of_072026.p12
      OPEN_FINANCE_MTLS_PASSWORD:                                                       ${siinp_keystore_sandbox}
      OPEN_FINANCE_TOKEN_ID_PEPER:                                                      Qk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJp
      PCM_BASEPATH_REQUEST:                                                             /siinp/request
      PCM_BASEPATH_RESPONSE:                                                            /siinp/response
      POOLING_PAGAMENTO_DELAY:                                                          0
      PROXY_USER_PASSWORD:                                                              ${sinpbd01_proxy}
      PROXY_USER:                                                                       SINPBD01
      QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE:    60S
      QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE:                            60S
      QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE:       60S
      QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE:                    60S
      QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE:                          86400S
      QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE:             86400S
      QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE:                 60S
      QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE:              60S
      QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE:     60S
      QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE:                   60S
      QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE:  60S
      QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE:           60S
      QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE:               60S
      QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE:      60S
      QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS:                                           true
      QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE:                                             5
      QUARKUS_DATASOURCE_JDBC_MAX_SIZE:                                                 50
      QUARKUS_DATASOURCE_JDBC_MIN_SIZE:                                                 5
      QUARKUS_DATASOURCE_JDBC_URL:                                                      jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/PDBD001NG
      QUARKUS_DATASOURCE_METRICS_ENABLED:                                               true
      QUARKUS_DATASOURCE_PASSWORD:                                                      ${sinpbd01_oracle}
      QUARKUS_DATASOURCE_USERNAME:                                                      SINPBD01
      QUARKUS_HIBERNATE_ORM_LOG_SQL:                                                    false
      QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS:                               true
      QUARKUS_HTTP_CORS_METHODS:                                                        GET,PUT,POST,DELETE,PATCH
      QUARKUS_HTTP_CORS_ORIGINS:                                                        https://siinp-nucleo-web-des.apps.nprd.caixa,https://siinp-gestao-web-des.apps.nprd.caixa,http://localhost:4200
      QUARKUS_HTTP_CORS:                                                                true
      QUARKUS_HTTP_TEST_PORT:                                                           8888
      QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL:                                        DEBUG
      QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL:                                     INFO
      QUARKUS_LOG_LEVEL:                                                                INFO
      QUARKUS_REDIS_HOSTS:                                                              redis://redis-master.redis-siinp-des.svc.cluster.local:6379
      QUARKUS_REDIS_MAX_POOL_SIZE:                                                      32
      QUARKUS_REDIS_MAX_WAITING_HANDLERS:                                               256
      QUARKUS_REDIS_PASSWORD:                                                           ${redis_password}
      QUARKUS_REDIS_TIMEOUT:                                                            20S
      SANDBOX_URI_REDIRECT:                                                             siinp-nucleo-web-des.apps.nprd.caixa
      SCOPES_DCR:                                                                       openid_payments
      SECURITY_CRYPTO_KEY:                                                              OI8OTCQC8nJPq9vi9psPgSScWu/6RbezD1o2KzlHETg=
      THREAD_POOL:                                                                      20
      SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:                                            <set to the key 'SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS' in secret 'siinp-nucleo-des'>  Optional: false
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /deployments/siinp_mtls_sandbox_of_072025_new.p12 from siinp-mtls-sandbox-of-072025-new (rw)
      /deployments/siinp_mtls_sandbox_of_072026.p12 from siinp-mtls-sandbox-of-072026 (rw)
      /deployments/siinp_mtls_sandbox_of_112025.p12 from siinp-mtls-sandbox-of-112025 (rw)
      /siinp from siinp-nucleo-data-des (rw)
      /usr/src/app/secrets_files from secrets (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-p879b (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             True
  ContainersReady   True
  PodScheduled      True
Volumes:
  secrets:
    Type:    EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:  Memory
  script-bt-volume:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      siinp-nucleo-des-script-bt-check
    Optional:  false
  siinp-mtls-sandbox-of-072025-new:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  siinp-mtls-sandbox-of-072025-new
    Optional:    false
  siinp-mtls-sandbox-of-112025:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  siinp-mtls-sandbox-of-112025
    Optional:    false
  siinp-nucleo-data-des:
    Type:       PersistentVolumeClaim (a reference to a PersistentVolumeClaim in the same namespace)
    ClaimName:  siinp-nucleo-data-des
    ReadOnly:   false
  siinp-mtls-sandbox-of-072026:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  siinp-mtls-sandbox-of-072026
    Optional:    false
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  kube-api-access-p879b:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$ oc get configmap siinp-nucleo-des-script-bt-check -n siinp-des -o yaml
apiVersion: v1
data:
  bt-check.sh: "#!/bin/sh\n\n# ==============================================================================\n#
    check_secrets.sh\n#\n# Verifica se um diretório contém um conjunto exato de arquivos
    especificado em\n# uma variável de ambiente.\n#\n# Ele verifica seguintes condições:\n#
    1. O script somente executado se ao menos uma das seguintes variáveis de ambiente\n#
    \   estiver definida: `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`. Se ambas estiverem\n#
    \   definidas, somente será usado `SECRETS_LIST`. Se somente uma estiver definida,\n#
    \   será usada a definida.\n# 2. Todos os arquivos listados na variável de ambiente
    `SECRETS_LIST`\n#    (ou na `MANAGED_ACCOUNTS_LIST`) devem existir em um caminho
    relativo ao\n#    `SECRETS_PATH`.\n# 3. Nenhum outro arquivo além dos listados
    em `SECRETS_LIST` (ou em\n#    `MANAGED_ACCOUNTS_LIST`) pode existir no `SECRETS_PATH`
    ou em seus subdiretórios.\n#\n# Variáveis de Ambiente:\n#   - SECRETS_PATH:  O
    caminho absoluto ou relativo para o diretório a ser\n#                   inspecionado.\n#
    \  - SECRETS_LIST: Uma string com caminhos de arquivos relativos, separados\n#
    \                  por vírgula. \n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#
    \  - MANAGED_ACCOUNTS_LIST: Uma string com caminhos de arquivos relativos, separados\n#
    \                  por vírgula.\n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#\n#
    Códigos de Saída:\n#   - 0: Sucesso. O conteúdo do diretório corresponde perfeitamente
    à lista.\n#   - 1: Falha. Foi encontrada uma divergência (arquivos faltando ou
    extras),\n#        ou ocorreu um erro.\n#   - 2: Variável de ambiente SECRETS_PATH
    não existe ou está vazia.\n#   - 3: Diretório de arquivos de segredos SECRETS_PATH
    não existe ou não é um\n#        diretório.\n#   - 4: Nao foram encontrados arquivos
    de segredos no diretorio SECRETS_PATH\n#   - 5: Falha. Não foi possível criar
    arquivo temporário com a lista de segredos\n#        que devem estar disponíveis.
    Listado na variável de ambiente SECRETS_LIST\n#        ou MANAGED_ACCOUNTS_LIST.\n#
    \  - 6: Falha. Não foi possível criar arquivo temporário com os arquivos\n#        encontrados
    no diretório SECRETS_PATH.\n#   - 7: Falha. Variáveis de ambiente `SECRETS_LIST`
    ou `MANAGED_ACCOUNTS_LIST`\n#        estão definidas, mas não contem caminho de
    arquivos segredos.\n#   - 8: Falha interna. Variável 'expected_count' de uso interno
    do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#
    \  - 9: Falha interna. Variável 'found_count' de uso interno do script\n#        deve
    ser numérica, mas está apresentando caracteres não numéricos.\n#   - 10: Falha
    interna. Não foi possível comparar a lista de segredos esperados\n#         com
    lista de segredos encontrados.\n# ==============================================================================\n\n#
    Exit codes\nEXIT_CODE_SUCCESS=0\nEXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS=1\nEXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE=2\nEXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE=3\nEXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO=4\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS=5\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS=6\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA=7\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO=8\nEXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO=9\nEXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS=10\n\n#
    Localização padrão do diretório contendo segredos\n# Será utilizado se a variável
    de ambiente SECRETS_PATH não estiver definida.\nSECRETS_PATH_DEFAULT=\"${SECRETS_PATH:-/usr/src/app/secrets_files}\"\n\n#
    MUITOS LOGS: 1 - sim ; 0 - não\nCONFIG_LOTS_OF_LOGS=0\n\n# Realizar a verificação
    em modo case sensitive por padrão.\n# 1 - sim ; 0 - não\nCONFIG_CASE_INSENSITIVE=\"${CONFIG_CASE_INSENSITIVE:-1}\"\n\n#
    Emitir logs de diagnóstico se a verificação falhar\nCONFIG_FAIL_DIAGNOSTIC=1\n\n#
    Verifica se o parâmetro da função contem somente dígitos numéricos\ncontem_somente_numeros()
    {\n  local nome_da_variavel=\"${1}\"\n\n  # remove o nome_da_variable da lista
    de parâmetros\n  shift\n\n  case \"${@}\" in\n    *[!0-9]*|'')\n      printf \"ERRO:
    uma variavel '%s' interna do script contem caracteres nao numericos '%s'.\\n\"
    \"${nome_da_variavel}\" \"${@}\" >&2\n\n      return 1\n      ;; # Não é número\n
    \   *)\n      return 0\n      ;; # Contem somente dígitos\n  esac\n}\n\n# ---
    Configuração e Modo Estrito ---\n\n# Encerra o script imediatamente se um comando
    terminar com status diferente de zero.\nset -e\n\n# Trata variáveis não definidas
    como um erro durante a substituição.\n#set -u\n\n\n# --- Validação da Entrada
    ---\n\n# Verifica se SECRETS_PATH está definida ou está vazia\nif [ \"x${SECRETS_PATH}\"
    = \"x\" ]; then\n#  printf \"ERRO: A variavel de ambiente '%s' nao esta definida
    ou estah vazia.\\n\" \"SECRETS_PATH\" >&2\n#  exit ${EXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE}\n\n
    \ printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia,
    sera utilizado valor padrao '%s'.\\n\" \"SECRETS_PATH\" \"${SECRETS_PATH_DEFAULT}\"
    >&2\n\n  SECRETS_PATH=\"${SECRETS_PATH_DEFAULT}\"\nfi\n# Referencia caminho de
    um diretório ?\nif [ ! -d \"${SECRETS_PATH}\" ]; then\n  printf \"ERRO: O diretorio
    de segredos nao foi encontrado em '%s'.\\n\" \"${SECRETS_PATH}\" >&2\n\n  exit
    ${EXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE}\nfi\n\n[ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"Iniciando verificacao para o diretorio: '%s'\\n\" \"$SECRETS_PATH\"\n\n\n#
    --- Lógica Principal ---\n\n# Cria arquivos temporários para armazenar as listas
    ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita
    problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells
    que não encerram com 'set -e' em caso de falha do mktemp\nexpected_files_sorted=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\nexpected_files_sorted_case_insensitive=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\n\n#
    Configura um 'trap' para garantir que os arquivos temporários sejam removidos
    em qualquer saída do script\n# (sucesso, falha ou interrupção).\ntrap 'rm -f \"$expected_files_sorted\"
    \"$found_files_sorted\"' EXIT\n\n# Cria arquivos temporários para armazenar as
    listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro
    e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para
    shells que não encerram com 'set -e' em caso de falha do mktemp\nfound_files_sorted=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\nfound_files_sorted_case_insensitive=$(
    mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\n\n\n#
    --- Passo 1: Gerar a lista de arquivos ESPERADOS ---\n\n# Devemos verificar se
    existem arquivos de segredos?\n# Finalizar com sucesso se nenhuma das variáveis
    de ambiente estiver definida.\nif [ \"x${SECRETS_LIST}\" = \"x\" -a \"x${MANAGED_ACCOUNTS_LIST}\"
    = \"x\" ]; then\n  printf \"Script nao serah executado, pois nenhuma das seguintes
    variaveis de ambiente estah definida: '%s' , '%s'.\\n\" \"SECRETS_LIST\" \"MANAGED_ACCOUNTS_LIST\"\n\n
    \ exit ${EXIT_CODE_SUCCESS}\nfi\n\nif [ \"x${SECRETS_LIST}\" != \"x\" ]; then\n
    \   SECRETS_TO_CHECK=\"${SECRETS_LIST}\"\nelse\n    SECRETS_TO_CHECK=\"${MANAGED_ACCOUNTS_LIST}\"\nfi\n\n#
    Converte a string SECRETS_LIST (separada por vírgulas) em uma lista separada por
    quebras de linha.\n# Em seguida, ordena a lista, transforma tudo em minúsculas
    e a salva no arquivo temporário.\n# Esta abordagem lida corretamente com caminhos
    de arquivo que contêm espaços.\n# Assume-se que os nomes dos arquivos não contêm
    vírgulas.\n# Filtramos linhas vazias para o caso de a lista ter vírgulas duplas
    ou no final.\necho \"${SECRETS_TO_CHECK}\" | tr ',' '\\n' | grep --invert-match
    --extended-regexp '^[\\t ]*$' | sort > \"${expected_files_sorted}\"\ncat \"${expected_files_sorted}\"
    | tr '[:upper:]' '[:lower:]' | sort > \"${expected_files_sorted_case_insensitive}\"\n\n#
    Verifica se algum segredo esta listado\nexpected_count=$( cat \"${expected_files_sorted}\"
    | wc --lines ) || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\n\n#
    Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"expected_count\"
    \"${expected_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO}\n\n[
    \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && printf \"Arquivos esperados:\\n\"\n\nif
    [ \"${expected_count}\" -gt 0 ]; then\n  # Exibe para feedback do usuário\n  [
    \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && cat \"${expected_files_sorted}\"\nelse\n
    \ [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] && printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO:
    Nao foram definidos segredos para recuperar do cofre.\\n\" >&2\n  printf \"ERRO:
    Tanto a variavel '%s' ('%s') quanto a '%s' ('%s') nao contem lista de segredos.\\n\"
    \"SECRETS_LIST\" \"${SECRETS_LIST}\" \"MANAGED_ACCOUNTS_LIST\" \"${MANAGED_ACCOUNTS_LIST}\"
    >&2\n\n  exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\nfi\n\n\n#
    --- Passo 2: Gerar a lista de arquivos ENCONTRADOS ---\n\n# Encontra todos os
    arquivos (-type f) no diretório de segredos.\n# Usa 'sed' para remover o prefixo
    do diretório, deixando apenas o caminho relativo.\n# O 'cd' e o '.' no find garantem
    que obteremos caminhos relativos como 'file.txt'\n# em vez de './file.txt', para
    corresponder ao formato esperado.\n# Converte tudo para minúsculas.\n[ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"\\nArquivos encontrados:\\n\"\n\n# Verifica se o find retorna
    algum resultado\nfound_count=$( cd \"${SECRETS_PATH}\" && find . -type f ! -iregex
    \".*\\_metadata$\" -print | wc --lines ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n#
    Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"found_count\"
    \"${found_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO}\n\nif
    [ \"${found_count}\" -gt 0 ]; then\n  ( cd \"${SECRETS_PATH}\" && find . -type
    f ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' | sort
    > \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n
    \ ( cat \"${found_files_sorted}\" | tr '[:upper:]' '[:lower:]' > \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n  [ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && cat \"${found_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\"
    -gt 0 ] && printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram encontrados
    arquivos com segredos no diretorio '%s'.\\n\" \"${SECRETS_PATH}\" >&2\n\n  exit
    ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\nfi\n\n\n# --- Passo 3:
    Comparar as listas e reportar o status ---\n\nprintf \"\\n--- Resultados da Comparacao
    ---\\n\"\nvalidation_failed=0\n\n# Usa 'comm' para encontrar as diferenças entre
    os dois arquivos ordenados.\n# - 'comm -23' mostra linhas que são exclusivas do
    primeiro arquivo (arquivos FALTANDO).\n# - 'comm -13' mostra linhas que são exclusivas
    do segundo arquivo (arquivos EXTRAS).\n\nif [ \"${CONFIG_CASE_INSENSITIVE}\" -ne
    0 ]; then\n  missing_files=$( comm -23 \"${expected_files_sorted}\" \"${found_files_sorted}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n
    \ extra_files=$( comm -13 \"${expected_files_sorted}\" \"${found_files_sorted}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nelse\n
    \ missing_files=$( comm -23 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n
    \ extra_files=$( comm -13 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\"
    ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nfi\n\nif
    [ \"x${missing_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO
    na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:\\n\" >&2\n\n
    \ echo \"${missing_files}\" >&2\nfi\n\nif [ \"x${extra_files}\" != \"x\" ]; then\n
    \ validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos NAO
    ESPERADOS foram encontrados:\\n\" >&2\n\n  echo \"${extra_files}\" >&2\nfi\n\n\n#
    --- Status Final de Saída ---\n\nif [ \"${validation_failed}\" -ne 0 ]; then\n
    \ printf \"\\nERRO: Verificacao nao foi bem-sucedida.\\n\" >&2\n\n  if [ \"${CONFIG_FAIL_DIAGNOSTIC}\"
    -eq 1 ]; then\n    # Verificar se algum arquivo de segredo existe, mas está vazio.\n
    \   # Se mktemp apresentar erro, emitir o código de erro de validação com falha\n
    \   empty_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\n
    \   ( cd \"${SECRETS_PATH}\" && find . -type f -empty ! -iregex \".*\\_metadata$\"
    -print | sed --regexp-extended 's|^\\./||' 2>/dev/null | sort > \"${empty_files_sorted}\"
    )\n    if [ -f \"${empty_files_sorted}\" ]; then\n      printf \"\\nERRO: Diagnostico.
    Arquivos vazios encontrados.\\n\" >&2\n      cat \"${empty_files_sorted}\" >&2
    || true\n      printf \"\\n\" >&2\n      rm \"${empty_files_sorted}\" >&2 || true\n
    \     printf \"\\n\" >&2\n    fi\n\n    # Recupera os endereços IP do POD.\n    #
    Entretanto, pode não ser o IP que os ativos de rede irão\n    # observar devido
    a \"NAT\" de saída no cluster.\n    printf \"\\nERRO: Diagnostico. IP do POD.\\n\"
    >&2\n    ( ip address show >&2 2>/dev/null || ifconfig -a >&2 2>/dev/null )\n
    \ fi\n\n  exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\nelse\n
    \ printf \"Sucesso! O conteudo do diretorio corresponde a lista esperada.\\n\"\n\n
    \ exit ${EXIT_CODE_SUCCESS}\nfi\n"
kind: ConfigMap
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"v1","data":{"bt-check.sh":"#!/bin/sh\n\n# ==============================================================================\n# check_secrets.sh\n#\n# Verifica se um diretório contém um conjunto exato de arquivos especificado em\n# uma variável de ambiente.\n#\n# Ele verifica seguintes condições:\n# 1. O script somente executado se ao menos uma das seguintes variáveis de ambiente\n#    estiver definida: `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`. Se ambas estiverem\n#    definidas, somente será usado `SECRETS_LIST`. Se somente uma estiver definida,\n#    será usada a definida.\n# 2. Todos os arquivos listados na variável de ambiente `SECRETS_LIST`\n#    (ou na `MANAGED_ACCOUNTS_LIST`) devem existir em um caminho relativo ao\n#    `SECRETS_PATH`.\n# 3. Nenhum outro arquivo além dos listados em `SECRETS_LIST` (ou em\n#    `MANAGED_ACCOUNTS_LIST`) pode existir no `SECRETS_PATH` ou em seus subdiretórios.\n#\n# Variáveis de Ambiente:\n#   - SECRETS_PATH:  O caminho absoluto ou relativo para o diretório a ser\n#                   inspecionado.\n#   - SECRETS_LIST: Uma string com caminhos de arquivos relativos, separados\n#                   por vírgula. \n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#   - MANAGED_ACCOUNTS_LIST: Uma string com caminhos de arquivos relativos, separados\n#                   por vírgula.\n#                   Exemplo: \"db/user,db/password,app/token.json\"\n#\n# Códigos de Saída:\n#   - 0: Sucesso. O conteúdo do diretório corresponde perfeitamente à lista.\n#   - 1: Falha. Foi encontrada uma divergência (arquivos faltando ou extras),\n#        ou ocorreu um erro.\n#   - 2: Variável de ambiente SECRETS_PATH não existe ou está vazia.\n#   - 3: Diretório de arquivos de segredos SECRETS_PATH não existe ou não é um\n#        diretório.\n#   - 4: Nao foram encontrados arquivos de segredos no diretorio SECRETS_PATH\n#   - 5: Falha. Não foi possível criar arquivo temporário com a lista de segredos\n#        que devem estar disponíveis. Listado na variável de ambiente SECRETS_LIST\n#        ou MANAGED_ACCOUNTS_LIST.\n#   - 6: Falha. Não foi possível criar arquivo temporário com os arquivos\n#        encontrados no diretório SECRETS_PATH.\n#   - 7: Falha. Variáveis de ambiente `SECRETS_LIST` ou `MANAGED_ACCOUNTS_LIST`\n#        estão definidas, mas não contem caminho de arquivos segredos.\n#   - 8: Falha interna. Variável 'expected_count' de uso interno do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#   - 9: Falha interna. Variável 'found_count' de uso interno do script\n#        deve ser numérica, mas está apresentando caracteres não numéricos.\n#   - 10: Falha interna. Não foi possível comparar a lista de segredos esperados\n#         com lista de segredos encontrados.\n# ==============================================================================\n\n# Exit codes\nEXIT_CODE_SUCCESS=0\nEXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS=1\nEXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE=2\nEXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE=3\nEXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO=4\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS=5\nEXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS=6\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA=7\nEXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO=8\nEXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO=9\nEXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS=10\n\n# Localização padrão do diretório contendo segredos\n# Será utilizado se a variável de ambiente SECRETS_PATH não estiver definida.\nSECRETS_PATH_DEFAULT=\"${SECRETS_PATH:-/usr/src/app/secrets_files}\"\n\n# MUITOS LOGS: 1 - sim ; 0 - não\nCONFIG_LOTS_OF_LOGS=0\n\n# Realizar a verificação em modo case sensitive por padrão.\n# 1 - sim ; 0 - não\nCONFIG_CASE_INSENSITIVE=\"${CONFIG_CASE_INSENSITIVE:-1}\"\n\n# Emitir logs de diagnóstico se a verificação falhar\nCONFIG_FAIL_DIAGNOSTIC=1\n\n# Verifica se o parâmetro da função contem somente dígitos numéricos\ncontem_somente_numeros() {\n  local nome_da_variavel=\"${1}\"\n\n  # remove o nome_da_variable da lista de parâmetros\n  shift\n\n  case \"${@}\" in\n    *[!0-9]*|'')\n      printf \"ERRO: uma variavel '%s' interna do script contem caracteres nao numericos '%s'.\\n\" \"${nome_da_variavel}\" \"${@}\" \u003e\u00262\n\n      return 1\n      ;; # Não é número\n    *)\n      return 0\n      ;; # Contem somente dígitos\n  esac\n}\n\n# --- Configuração e Modo Estrito ---\n\n# Encerra o script imediatamente se um comando terminar com status diferente de zero.\nset -e\n\n# Trata variáveis não definidas como um erro durante a substituição.\n#set -u\n\n\n# --- Validação da Entrada ---\n\n# Verifica se SECRETS_PATH está definida ou está vazia\nif [ \"x${SECRETS_PATH}\" = \"x\" ]; then\n#  printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia.\\n\" \"SECRETS_PATH\" \u003e\u00262\n#  exit ${EXIT_CODE_FALHA_SECRETS_PATH_VARIAVEL_NAO_EXISTE}\n\n  printf \"ERRO: A variavel de ambiente '%s' nao esta definida ou estah vazia, sera utilizado valor padrao '%s'.\\n\" \"SECRETS_PATH\" \"${SECRETS_PATH_DEFAULT}\" \u003e\u00262\n\n  SECRETS_PATH=\"${SECRETS_PATH_DEFAULT}\"\nfi\n# Referencia caminho de um diretório ?\nif [ ! -d \"${SECRETS_PATH}\" ]; then\n  printf \"ERRO: O diretorio de segredos nao foi encontrado em '%s'.\\n\" \"${SECRETS_PATH}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_SECRETS_PATH_DIRETORIO_NAO_EXISTE}\nfi\n\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"Iniciando verificacao para o diretorio: '%s'\\n\" \"$SECRETS_PATH\"\n\n\n# --- Lógica Principal ---\n\n# Cria arquivos temporários para armazenar as listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells que não encerram com 'set -e' em caso de falha do mktemp\nexpected_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\nexpected_files_sorted_case_insensitive=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SECREDOS_ESPERADOS}\n\n# Configura um 'trap' para garantir que os arquivos temporários sejam removidos em qualquer saída do script\n# (sucesso, falha ou interrupção).\ntrap 'rm -f \"$expected_files_sorted\" \"$found_files_sorted\"' EXIT\n\n# Cria arquivos temporários para armazenar as listas ordenadas de arquivos esperados e encontrados.\n# Usar mktemp é seguro e evita problemas de colisão de nomes de arquivo.\n# NOTA: O '|| exit 1' é para shells que não encerram com 'set -e' em caso de falha do mktemp\nfound_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\nfound_files_sorted_case_insensitive=$( mktemp ) || exit ${EXIT_CODE_FALHA_AO_CRIAR_ARQUIVO_TEMPORARIO_SEGREDOS_ENCONTRADOS}\n\n\n# --- Passo 1: Gerar a lista de arquivos ESPERADOS ---\n\n# Devemos verificar se existem arquivos de segredos?\n# Finalizar com sucesso se nenhuma das variáveis de ambiente estiver definida.\nif [ \"x${SECRETS_LIST}\" = \"x\" -a \"x${MANAGED_ACCOUNTS_LIST}\" = \"x\" ]; then\n  printf \"Script nao serah executado, pois nenhuma das seguintes variaveis de ambiente estah definida: '%s' , '%s'.\\n\" \"SECRETS_LIST\" \"MANAGED_ACCOUNTS_LIST\"\n\n  exit ${EXIT_CODE_SUCCESS}\nfi\n\nif [ \"x${SECRETS_LIST}\" != \"x\" ]; then\n    SECRETS_TO_CHECK=\"${SECRETS_LIST}\"\nelse\n    SECRETS_TO_CHECK=\"${MANAGED_ACCOUNTS_LIST}\"\nfi\n\n# Converte a string SECRETS_LIST (separada por vírgulas) em uma lista separada por quebras de linha.\n# Em seguida, ordena a lista, transforma tudo em minúsculas e a salva no arquivo temporário.\n# Esta abordagem lida corretamente com caminhos de arquivo que contêm espaços.\n# Assume-se que os nomes dos arquivos não contêm vírgulas.\n# Filtramos linhas vazias para o caso de a lista ter vírgulas duplas ou no final.\necho \"${SECRETS_TO_CHECK}\" | tr ',' '\\n' | grep --invert-match --extended-regexp '^[\\t ]*$' | sort \u003e \"${expected_files_sorted}\"\ncat \"${expected_files_sorted}\" | tr '[:upper:]' '[:lower:]' | sort \u003e \"${expected_files_sorted_case_insensitive}\"\n\n# Verifica se algum segredo esta listado\nexpected_count=$( cat \"${expected_files_sorted}\" | wc --lines ) || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\n\n# Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"expected_count\" \"${expected_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_NAO_EH_NUMERO}\n\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"Arquivos esperados:\\n\"\n\nif [ \"${expected_count}\" -gt 0 ]; then\n  # Exibe para feedback do usuário\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 cat \"${expected_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram definidos segredos para recuperar do cofre.\\n\" \u003e\u00262\n  printf \"ERRO: Tanto a variavel '%s' ('%s') quanto a '%s' ('%s') nao contem lista de segredos.\\n\" \"SECRETS_LIST\" \"${SECRETS_LIST}\" \"MANAGED_ACCOUNTS_LIST\" \"${MANAGED_ACCOUNTS_LIST}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_SECRETS_MANAGED_LIST_VARIAVEL_DEFINIDA_MAS_VAZIA}\nfi\n\n\n# --- Passo 2: Gerar a lista de arquivos ENCONTRADOS ---\n\n# Encontra todos os arquivos (-type f) no diretório de segredos.\n# Usa 'sed' para remover o prefixo do diretório, deixando apenas o caminho relativo.\n# O 'cd' e o '.' no find garantem que obteremos caminhos relativos como 'file.txt'\n# em vez de './file.txt', para corresponder ao formato esperado.\n# Converte tudo para minúsculas.\n[ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"\\nArquivos encontrados:\\n\"\n\n# Verifica se o find retorna algum resultado\nfound_count=$( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f ! -iregex \".*\\_metadata$\" -print | wc --lines ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n# Verifica se o retorno contem somente numeros\ncontem_somente_numeros \"found_count\" \"${found_count}\" || exit ${EXIT_CODE_FALHA_SECRETS_PATH_ERRO_VARIAVEL_CONTAGEM_NAO_EH_NUMERO}\n\nif [ \"${found_count}\" -gt 0 ]; then\n  ( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' | sort \u003e \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n  ( cat \"${found_files_sorted}\" | tr '[:upper:]' '[:lower:]' \u003e \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\n\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 cat \"${found_files_sorted}\"\nelse\n  [ \"${CONFIG_LOTS_OF_LOGS}\" -gt 0 ] \u0026\u0026 printf \"(nenhum)\\n\"\n\n  printf \"\\nERRO: Nao foram encontrados arquivos com segredos no diretorio '%s'.\\n\" \"${SECRETS_PATH}\" \u003e\u00262\n\n  exit ${EXIT_CODE_FALHA_NENHUM_ARQUIVO_SEGREDOS_ENCONTRADO}\nfi\n\n\n# --- Passo 3: Comparar as listas e reportar o status ---\n\nprintf \"\\n--- Resultados da Comparacao ---\\n\"\nvalidation_failed=0\n\n# Usa 'comm' para encontrar as diferenças entre os dois arquivos ordenados.\n# - 'comm -23' mostra linhas que são exclusivas do primeiro arquivo (arquivos FALTANDO).\n# - 'comm -13' mostra linhas que são exclusivas do segundo arquivo (arquivos EXTRAS).\n\nif [ \"${CONFIG_CASE_INSENSITIVE}\" -ne 0 ]; then\n  missing_files=$( comm -23 \"${expected_files_sorted}\" \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n  extra_files=$( comm -13 \"${expected_files_sorted}\" \"${found_files_sorted}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nelse\n  missing_files=$( comm -23 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\n  extra_files=$( comm -13 \"${expected_files_sorted_case_insensitive}\" \"${found_files_sorted_case_insensitive}\" ) || exit ${EXIT_CODE_FALHA_NA_IDENTIFICACAO_DE_ARQUIVOS_ESPERADOS_DIFERENTE_DOS_ENCONTRADOS}\nfi\n\nif [ \"x${missing_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:\\n\" \u003e\u00262\n\n  echo \"${missing_files}\" \u003e\u00262\nfi\n\nif [ \"x${extra_files}\" != \"x\" ]; then\n  validation_failed=1\n  printf \"ERRO na validacao: Os seguintes arquivos NAO ESPERADOS foram encontrados:\\n\" \u003e\u00262\n\n  echo \"${extra_files}\" \u003e\u00262\nfi\n\n\n# --- Status Final de Saída ---\n\nif [ \"${validation_failed}\" -ne 0 ]; then\n  printf \"\\nERRO: Verificacao nao foi bem-sucedida.\\n\" \u003e\u00262\n\n  if [ \"${CONFIG_FAIL_DIAGNOSTIC}\" -eq 1 ]; then\n    # Verificar se algum arquivo de segredo existe, mas está vazio.\n    # Se mktemp apresentar erro, emitir o código de erro de validação com falha\n    empty_files_sorted=$( mktemp ) || exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\n    ( cd \"${SECRETS_PATH}\" \u0026\u0026 find . -type f -empty ! -iregex \".*\\_metadata$\" -print | sed --regexp-extended 's|^\\./||' 2\u003e/dev/null | sort \u003e \"${empty_files_sorted}\" )\n    if [ -f \"${empty_files_sorted}\" ]; then\n      printf \"\\nERRO: Diagnostico. Arquivos vazios encontrados.\\n\" \u003e\u00262\n      cat \"${empty_files_sorted}\" \u003e\u00262 || true\n      printf \"\\n\" \u003e\u00262\n      rm \"${empty_files_sorted}\" \u003e\u00262 || true\n      printf \"\\n\" \u003e\u00262\n    fi\n\n    # Recupera os endereços IP do POD.\n    # Entretanto, pode não ser o IP que os ativos de rede irão\n    # observar devido a \"NAT\" de saída no cluster.\n    printf \"\\nERRO: Diagnostico. IP do POD.\\n\" \u003e\u00262\n    ( ip address show \u003e\u00262 2\u003e/dev/null || ifconfig -a \u003e\u00262 2\u003e/dev/null )\n  fi\n\n  exit ${EXIT_CODE_FALHA_ERRO_VALIDACAO_ARQUIVOS_DE_SEGREDOS}\nelse\n  printf \"Sucesso! O conteudo do diretorio corresponde a lista esperada.\\n\"\n\n  exit ${EXIT_CODE_SUCCESS}\nfi\n"},"kind":"ConfigMap","metadata":{"annotations":{},"creationTimestamp":null,"name":"siinp-nucleo-des-script-bt-check","namespace":"siinp-des"}}
  creationTimestamp: 2025-08-12T23:22:49Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:bt-check.sh: {}
      f:metadata:
        f:annotations:
          .: {}
          f:kubectl.kubernetes.io/last-applied-configuration: {}
    manager: oc
    operation: Update
    time: 2025-08-21T19:37:11Z
  name: siinp-nucleo-des-script-bt-check
  namespace: siinp-des
  resourceVersion: "2196170239"
  uid: b075fb87-274d-4600-99a0-f9d7774ef79d
-sh-4.2$
