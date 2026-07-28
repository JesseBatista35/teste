
-sh-4.2$ oc get pod sispl-api-mkp-des-75d9d6f594-hmfjv -n sispl-des
NAME                                 READY     STATUS    RESTARTS      AGE
sispl-api-mkp-des-75d9d6f594-hmfjv   0/1       Running   4 (28s ago)   5m9s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sispl-api-mkp-des-75d9d6f594-hmfjv -n sispl-des --previous
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-28 17:09:34,423 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod sispl-api-mkp-des-75d9d6f594-hmfjv -n sispl-des
E0728 17:11:30.859578   49991 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sispl-api-mkp-des-75d9d6f594-hmfjv", GenerateName:"sispl-api-mkp-des-75d9d6f594-", Namespace:"sispl-des", SelfLink:"", UID:"53878497-d4d2-424e-94b2-f2407da4dfdf", ResourceVersion:"39047685", Generation:1, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63920865962, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"name":"sispl-api-mkp-des", "pod-template-hash":"75d9d6f594", "CGC_DES":"7390", "CGC_OPS":"7259"}, Annotations:map[string]string{"k8s.ovn.org/pod-networks":"{\"default\":{\"ip_addresses\":[\"25.131.1.178/23\"],\"mac_address\":\"0a:58:19:83:01:b2\",\"gateway_ips\":[\"25.131.0.1\"],\"routes\":[{\"dest\":\"25.128.0.0/14\",\"nextHop\":\"25.131.0.1\"},{\"dest\":\"25.0.0.0/16\",\"nextHop\":\"25.131.0.1\"},{\"dest\":\"169.254.0.5/32\",\"nextHop\":\"25.131.0.1\"},{\"dest\":\"100.64.0.0/16\",\"nextHop\":\"25.131.0.1\"}],\"ip_address\":\"25.131.1.178/23\",\"gateway_ip\":\"25.131.0.1\",\"role\":\"primary\"}}", "k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"ovn-kubernetes\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.131.1.178\"\n    ],\n    \"mac\": \"0a:58:19:83:01:b2\",\n    \"default\": true,\n    \"dns\": {}\n}]", "openshift.io/scc":"anyuid", "security.openshift.io/validated-scc-subject-type":"serviceaccount"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"apps/v1", Kind:"ReplicaSet", Name:"sispl-api-mkp-des-75d9d6f594", UID:"b8185b77-f78f-4480-8904-58aa954acb25", Controller:(*bool)(0xc421644e1a), BlockOwnerDeletion:(*bool)(0xc421644e1b)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc42135e080), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-k8x4t", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc42165a160), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sispl-api-mkp-des", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_CONNECTION_STRING", Value:"verificar a InstrumentationKey de DES", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_ROLE_NAME", Value:"SISPL-API-MKP-DES", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE", Value:"10", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_SECURITY_CLIENTS_AUTHORIZED", Value:"cli-ser-spl+cli-ser-lce+cli-ser-spl_jboss", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JAVA_OPTIONS_APPEND", Value:"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_DB_KIND", Value:"db2", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE__IDAA__JDBC_URL", Value:"jdbc:db2://10.192.224.76:5051/CSDA", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE__IDAA__USERNAME", Value:"SSPLTI01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT", Value:"5", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL", Value:"1M", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_DRIVER", Value:"com.ibm.db2.jcc.DB2Driver", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE", Value:"15", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_MAX_SIZE", Value:"60", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_MIN_SIZE", Value:"5", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_JDBC_URL", Value:"jdbc:db2://10.192.224.76:5021/CSD1", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_USERNAME", Value:"SSPLDB01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_CORS", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_PORT", Value:"8080", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_HTTP_TEST_PORT", Value:"8083", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_LOG_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_APPLICATION_TYPE", Value:"service", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_AUTH_SERVER_URL", Value:"https://logindes.caixa.gov.br/auth/realms/internet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_CLIENT_ID", Value:"cli-ser-spl", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_CLISERLCE_AUTH_SERVER_URL", Value:"https://login.hmp.corp.caixa.gov.br/auth/realms/internet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_CLISERLCE_CLIENT_ID", Value:"cli-ser-lce", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_CLISERLCE_PUBLIC_KEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL", Value:"https://login.des.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_INTRANET_GESTAO_AUTH_SERVER_URL", Value:"https://login.hmp.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_INTRANETGESTAO_AUTH_SERVER_URL", Value:"https://login.hmp.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_OIDC_PUBLIC_KEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECTION_POOL_SIZE", Value:"40", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECT_TIMEOUT", Value:"10000", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTOLOTE_URL", Value:"http://cics.des.coredf.caixa:8080", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTO_READ_TIMEOUT", Value:"30000", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTO_SCOPE", Value:"javax.enterprise.context.ApplicationScoped", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_CSWCRIPTO_URL", Value:"http://d2df.coredf.caixa:1081", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_REST_CLIENT_TOKENSSO_URL", Value:"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE", Value:"true", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MKP_CLIENTID", Value:"cli-ser-spl", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MKP_CLIENTSECRET", Value:"14719361-0346-4cc1-b51f-fb55f197f4ed", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_CHANNEL", Value:"BRD6.SVRCONN.SILCE", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_HOSTNAME", Value:"10.192.228.145", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_MANAGER", Value:"BRD6", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_PORT", Value:"1418", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_QUEUE_CAPTACAO_BACKOUT", Value:"LQ.LOG.SISPL.MARKETPLACE.BACKOUT", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"SISPL_MQ_USERNAME", Value:"SSPLBD01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"QUARKUS_DATASOURCE_PASSWORD", Value:"", ValueFrom:(*core.EnvVarSource)(0xc421247f20)}, core.EnvVar{Name:"QUARKUS_DATASOURCE__IDAA__PASSWORD", Value:"", ValueFrom:(*core.EnvVarSource)(0xc421247f40)}, core.EnvVar{Name:"MOCK2", Value:"", ValueFrom:(*core.EnvVarSource)(0xc421247f60)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/deployments/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-k8x4t", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc421620840), ReadinessProbe:(*core.Probe)(0xc421620870), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"IfNotPresent", SecurityContext:(*core.SecurityContext)(0xc42135e300), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc421645f30), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"nctvmrh001-scgft-worker-0-5k79t", SecurityContext:(*core.PodSecurityContext)(0xc420df5260), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421645ff0)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc421a08090)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc421a080f8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"PodReadyToStartContainers", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63920865967, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63920865963, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63920865963, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sispl-api-mkp-des]"}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63920865963, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sispl-api-mkp-des]"}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63920865962, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.190.160.26", PodIP:"25.131.1.178", StartTime:(*v1.Time)(0xc42165a0e0), QOSClass:"Guaranteed", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sispl-api-mkp-des", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(0xc42165a120), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc420df51f0)}, Ready:false, RestartCount:4, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp@sha256:a705681f647165ec351ab72e6063e55f5b49f27621c4e909e10e29bed12ebc9b", ContainerID:"cri-o://151881fc92f2c107523d051de9fee23fc70c5f433fdf14f32fa3d21954c85046"}}}}': selfLink was empty, can't make reference
Name:               sispl-api-mkp-des-75d9d6f594-hmfjv
Namespace:          sispl-des
Priority:           0
PriorityClassName:  <none>
Node:               nctvmrh001-scgft-worker-0-5k79t/10.190.160.26
Start Time:         Tue, 28 Jul 2026 17:06:03 -0300
Labels:             CGC_DES=7390
                    CGC_OPS=7259
                    name=sispl-api-mkp-des
                    pod-template-hash=75d9d6f594
Annotations:        k8s.ovn.org/pod-networks={"default":{"ip_addresses":["25.131.1.178/23"],"mac_address":"0a:58:19:83:01:b2","gateway_ips":["25.131.0.1"],"routes":[{"dest":"25.128.0.0/14","nextHop":"25.131.0.1"},{"dest"...
                    k8s.v1.cni.cncf.io/network-status=[{
    "name": "ovn-kubernetes",
    "interface": "eth0",
    "ips": [
        "25.131.1.178"
    ],
    "mac": "0a:58:19:83:01:b2",
    "default": true,
    "dns": {...
                openshift.io/scc=anyuid
                security.openshift.io/validated-scc-subject-type=serviceaccount
Status:         Running
IP:             25.131.1.178
Controlled By:  ReplicaSet/sispl-api-mkp-des-75d9d6f594
Containers:
  sispl-api-mkp-des:
    Container ID:   cri-o://151881fc92f2c107523d051de9fee23fc70c5f433fdf14f32fa3d21954c85046
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp@sha256:a705681f647165ec351ab72e6063e55f5b49f27621c4e909e10e29bed12ebc9b
    Port:           8080/TCP
    Host Port:      0/TCP
    State:          Running
      Started:      Tue, 28 Jul 2026 17:10:43 -0300
    Last State:     Terminated
      Reason:       Error
      Exit Code:    137
      Started:      Tue, 28 Jul 2026 17:09:33 -0300
      Finished:     Tue, 28 Jul 2026 17:10:43 -0300
    Ready:          False
    Restart Count:  4
    Limits:
      cpu:     1
      memory:  1Gi
    Requests:
      cpu:      1
      memory:   1Gi
    Liveness:   http-get http://:8080/q/health/live delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:                                                      America/Sao_Paulo
      APPLICATIONINSIGHTS_CONNECTION_STRING:                   verificar a InstrumentationKey de DES
      APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL:       INFO
      APPLICATIONINSIGHTS_ROLE_NAME:                           SISPL-API-MKP-DES
      APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE:                 10
      APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL:              INFO
      CAIXA_SECURITY_CLIENTS_AUTHORIZED:                       cli-ser-spl+cli-ser-lce+cli-ser-spl_jboss
      JAVA_OPTIONS_APPEND:                                     -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
      QUARKUS_DATASOURCE_DB_KIND:                              db2
      QUARKUS_DATASOURCE__IDAA__JDBC_URL:                      jdbc:db2://10.192.224.76:5051/CSDA
      QUARKUS_DATASOURCE__IDAA__USERNAME:                      SSPLTI01
      QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT:             5
      QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL:  1M
      QUARKUS_DATASOURCE_JDBC_DRIVER:                          com.ibm.db2.jcc.DB2Driver
      QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE:                    15
      QUARKUS_DATASOURCE_JDBC_MAX_SIZE:                        60
      QUARKUS_DATASOURCE_JDBC_MIN_SIZE:                        5
      QUARKUS_DATASOURCE_JDBC_URL:                             jdbc:db2://10.192.224.76:5021/CSD1
      QUARKUS_DATASOURCE_USERNAME:                             SSPLDB01
      QUARKUS_HTTP_CORS:                                       true
      QUARKUS_HTTP_PORT:                                       8080
      QUARKUS_HTTP_TEST_PORT:                                  8083
      QUARKUS_LOG_LEVEL:                                       INFO
      QUARKUS_OIDC_APPLICATION_TYPE:                           service
      QUARKUS_OIDC_AUTH_SERVER_URL:                            https://logindes.caixa.gov.br/auth/realms/internet
      QUARKUS_OIDC_CLIENT_ID:                                  cli-ser-spl
      QUARKUS_OIDC_CLISERLCE_AUTH_SERVER_URL:                  https://login.hmp.corp.caixa.gov.br/auth/realms/internet
      QUARKUS_OIDC_CLISERLCE_CLIENT_ID:                        cli-ser-lce
      QUARKUS_OIDC_CLISERLCE_PUBLIC_KEY:                       MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB
      QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL:                   https://login.des.caixa/auth/realms/intranet
      QUARKUS_OIDC_INTRANET_GESTAO_AUTH_SERVER_URL:            https://login.hmp.caixa/auth/realms/intranet
      QUARKUS_OIDC_INTRANETGESTAO_AUTH_SERVER_URL:             https://login.hmp.caixa/auth/realms/intranet
      QUARKUS_OIDC_PUBLIC_KEY:                                 MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB
      QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECTION_POOL_SIZE:      40
      QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECT_TIMEOUT:           10000
      QUARKUS_REST_CLIENT_CSWCRIPTOLOTE_URL:                   http://cics.des.coredf.caixa:8080
      QUARKUS_REST_CLIENT_CSWCRIPTO_READ_TIMEOUT:              30000
      QUARKUS_REST_CLIENT_CSWCRIPTO_SCOPE:                     javax.enterprise.context.ApplicationScoped
      QUARKUS_REST_CLIENT_CSWCRIPTO_URL:                       http://d2df.coredf.caixa:1081
      QUARKUS_REST_CLIENT_TOKENSSO_URL:                        https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
      QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE:                       true
      SISPL_MKP_CLIENTID:                                      cli-ser-spl
      SISPL_MKP_CLIENTSECRET:                                  14719361-0346-4cc1-b51f-fb55f197f4ed
      SISPL_MQ_CHANNEL:                                        BRD6.SVRCONN.SILCE
      SISPL_MQ_HOSTNAME:                                       10.192.228.145
      SISPL_MQ_MANAGER:                                        BRD6
      SISPL_MQ_PORT:                                           1418
      SISPL_MQ_QUEUE_CAPTACAO_BACKOUT:                         LQ.LOG.SISPL.MARKETPLACE.BACKOUT
      SISPL_MQ_USERNAME:                                       SSPLBD01
      QUARKUS_DATASOURCE_PASSWORD:                             <set to the key 'QUARKUS_DATASOURCE_PASSWORD' in secret 'sispl-api-mkp-des'>         Optional: false
      QUARKUS_DATASOURCE__IDAA__PASSWORD:                      <set to the key 'QUARKUS_DATASOURCE__IDAA__PASSWORD' in secret 'sispl-api-mkp-des'>  Optional: false
      MOCK2:                                                   <set to the key 'MOCK2' in secret 'sispl-api-mkp-des'>                               Optional: false
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-k8x4t (ro)
Conditions:
  Type                        Status
  PodReadyToStartContainers   True
  Initialized                 True
  Ready                       False
  ContainersReady             False
  PodScheduled                True
Volumes:
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  kube-api-access-k8x4t:
  <unknown>
QoS Class:       Guaranteed
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$
