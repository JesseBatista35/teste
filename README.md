h-4.2$
-sh-4.2$ oc project sicql-tqs
Now using project "sicql-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                           READY     STATUS      RESTARTS       AGE
sicql-maps-feeder-tqs-1-deploy                 0/1       Error       0              2d18h
sicql-mapsfeeder-tqs-4-deploy                  0/1       Error       0              16m
sicql-mapsfeeder-tqs-5-deploy                  1/1       Running     0              5m18s
sicql-mapsfeeder-tqs-5-q65w8                   0/1       Running     4 (72s ago)    5m16s
sicql-mapspegasusenquadramento-tqs-52-deploy   0/1       Completed   0              74d
sicql-mapspegasusenquadramento-tqs-53-bzzt5    1/1       Running     0              20d
sicql-mapspegasusenquadramento-tqs-53-deploy   0/1       Completed   0              20d
sicql-mapspegasusgestorescef-tqs-57-deploy     0/1       Completed   0              74d
sicql-mapspegasusgestorescef-tqs-58-deploy     0/1       Completed   0              20d
sicql-mapspegasusgestorescef-tqs-58-h9lpn      1/1       Running     0              20d
sicql-mapspegasusgestorescef-tqs-58-wpzvt      1/1       Running     0              20d
sicql-mapspricing-tqs-45-deploy                0/1       Completed   0              40d
sicql-mapspricing-tqs-46-deploy                0/1       Completed   0              20d
sicql-mapspricing-tqs-46-s4xrh                 1/1       Running     1 (3d8h ago)   20d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=sicql-mapsfeeder-tqs-5-q65w8
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod $POD | grep -E -A6 "Last State|Liveness|Readiness"
E1005 10:53:05.051354   81927 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sicql-mapsfeeder-tqs-5-q65w8", GenerateName:"sicql-mapsfeeder-tqs-5-", Namespace:"sicql-tqs", SelfLink:"", UID:"fbe6a1e1-a016-429c-8dd4-9203f9f9137e", ResourceVersion:"2242692728", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63926804768, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"deployment":"sicql-mapsfeeder-tqs-5", "deploymentconfig":"sicql-mapsfeeder-tqs", "name":"sicql-mapsfeeder-tqs", "CGC_DES":"7390", "CGC_OPS":"7259", "app":"sicql-mapsfeeder-tqs"}, Annotations:map[string]string{"k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.3.20.23\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.3.20.23\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "openshift.io/deployment-config.latest-version":"5", "openshift.io/deployment-config.name":"sicql-mapsfeeder-tqs", "openshift.io/deployment.name":"sicql-mapsfeeder-tqs-5", "openshift.io/scc":"anyuid"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"sicql-mapsfeeder-tqs-5", UID:"ab034f27-3a1a-4695-ab2c-a3292e43ab4e", Controller:(*bool)(0xc4219a332a), BlockOwnerDeletion:(*bool)(0xc4219a332b)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"kube-api-access-gkvms", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc4219ea0c0), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sicql-mapsfeeder-tqs", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"web", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"INSTANCE_IP", Value:"", ValueFrom:(*core.EnvVarSource)(0xc4219d7e60)}, core.EnvVar{Name:"DATABASE_HOST", Value:"10.116.28.37", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DATABASE_NAME", Value:"cqldb001", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DATABASE_PORT", Value:"5204", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DATABASE_SCHEMA", Value:"odin", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"DATABASE_USERNAME", Value:"scqlbt01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"FEEDER_TO_PRECIFICADOR_QUEUE", Value:"LQ.REQ.TESTEPRICING", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IBMMQ_QUEUE_MANAGER", Value:"BRD1", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"IBMMQ_URL", Value:"tcp://10.192.228.145:1414", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_ANONYMOUS_READ_ONLY", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_BIND_DN", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_BIND_PASSWORD", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_DOMAIN", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_GROUP_BASE_DN", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_GROUP_NAME_ATTRIBUTE", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_URL", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"LDAP_USER_BASE_DN", Value:"", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"MQ_TYPE", Value:"ibmmq", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PEGASUS_DIGESTER_QUEUE", Value:"LQ.REQ.TESTEPEGASUS", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"REVERSE_PROXY_URL", Value:"https://sicql-mapsfeeder-tqs.apps.apl4.caixa/", ValueFrom:(*core.EnvVarSource)(nil)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:500, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"500m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"kube-api-access-gkvms", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc4219dcd80), ReadinessProbe:(*core.Probe)(0xc4219dcdb0), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc4219a9080), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc4219a3da0), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx048.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc4206cd6c0), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc4219a3e60)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc4219a3e80)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc4219a3ea8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63926804768, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63926804768, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sicql-mapsfeeder-tqs]"}, core.PodCondition{Type:"ContainersReady", Status:"False", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63926804768, loc:(*time.Location)(0x49403c0)}}, Reason:"ContainersNotReady", Message:"containers with unready status: [sicql-mapsfeeder-tqs]"}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63926804768, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.68", PodIP:"25.3.20.23", StartTime:(*v1.Time)(0xc4219ea040), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sicql-mapsfeeder-tqs", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(0xc4219ea080), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc4206cd650)}, Ready:false, RestartCount:4, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder@sha256:f16395d5104d1ef4d8be13809db2e16f86c95f737c69767bde29b597f6f03204", ContainerID:"cri-o://a110e130318e5a52bb0d4652d08028750e24eae256c246a3d31efa4f40860714"}}}}': selfLink was empty, can't make reference
    Last State:     Terminated
      Reason:       OOMKilled
      Exit Code:    137
      Started:      Mon, 05 Oct 2026 10:50:56 -0300
      Finished:     Mon, 05 Oct 2026 10:51:45 -0300
    Ready:          False
    Restart Count:  4
--
    Liveness:   http-get http://:8080/actuator/health/liveness delay=60s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/actuator/health/readiness delay=60s timeout=3s period=10s #success=1 #failure=3
    Environment:
      TZ:                            America/Sao_Paulo
      INSTANCE_IP:                    (v1:status.podIP)
      DATABASE_HOST:                 10.116.28.37
      DATABASE_NAME:                 cqldb001
      DATABASE_PORT:                 5204
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events --field-selector involvedObject.name=$POD --sort-by=.lastTimestamp | tail -15
F1005 10:53:11.682462   81946 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$ oc logs $POD --previous | tail -60
10:51:26,692 INFO  [org.wildfly.extension.microprofile.config.smallrye] (ServerService Thread Pool -- 64) WFLYCONF0001: Activating MicroProfile Config Subsystem
10:51:26,692 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
10:51:26,609 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
10:51:26,697 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 67) WFLYNAM0001: Activating Naming Subsystem
10:51:26,697 INFO  [org.wildfly.extension.microprofile.opentracing] (ServerService Thread Pool -- 66) WFLYTRACEXT0001: Activating MicroProfile OpenTracing Subsystem
10:51:26,697 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 52) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
10:51:26,711 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 53) WFLYHEALTH0001: Activating Base Health Subsystem
10:51:26,712 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
10:51:26,789 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
10:51:26,789 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 61) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
10:51:26,808 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
10:51:26,912 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 63) WFLYMETRICS0001: Activating Base Metrics Subsystem
10:51:26,990 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.3.Final)
10:51:27,098 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Undertow 2.2.14.Final starting
10:51:27,109 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = h2
10:51:27,193 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Starting Naming Service
10:51:27,193 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
10:51:27,196 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.3)
10:51:27,201 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0018: Started Driver service with driver-name = postgresql
10:51:27,489 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-7) WFLYELY00023: KeyStore file '/opt/wildfly/standalone/configuration/application.keystore' does not exist. Used blank.
10:51:27,500 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-7) WFLYELY01084: KeyStore /opt/wildfly/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
10:51:27,703 INFO  [org.jboss.as.ejb3] (MSC service thread 1-6) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
10:51:27,703 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
10:51:27,805 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 18.3)
10:51:27,805 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = oracle
10:51:27,894 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 44) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "datasources"),
    ("xa-data-source" => "odinDS")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${env.DATABASE_PASSWORD}'"
10:51:27,906 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0012: Started server default-server.
10:51:27,906 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/wildfly/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
10:51:27,910 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
10:51:27,910 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
10:51:28,498 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
10:51:29,292 INFO  [org.jboss.as.ejb3] (MSC service thread 1-5) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
10:51:29,498 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
10:51:29,498 INFO  [org.jboss.as.patching] (MSC service thread 1-8) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
10:51:29,503 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/wildfly/standalone/deployments
10:51:29,507 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "feeder.war" (runtime-name: "feeder.war")
10:51:29,507 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
10:51:29,621 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.4.Final (Apache CXF 3.4.5)
10:51:39,095 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-6) IJ020001: Required license terms for file:/opt/wildfly/standalone/tmp/vfs/temp/tempb3a6013d23a31f18/content-16ff9c850453d842/contents/
10:51:39,899 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-4) IJ020001: Required license terms for file:/opt/wildfly/standalone/tmp/vfs/temp/tempb3a6013d23a31f18/content-16ff9c850453d842/contents/
10:51:40,295 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0007: Registered connection factory java:jboss/DefaultJMSConnectionFactory
10:51:40,297 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-4) IJ020016: Missing <recovery> element. XA recovery disabled for: java:jboss/DefaultJMSConnectionFactory
10:51:40,299 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-4) wmq.jmsra.rar: MQJCA5003: 'maxSequentialDeliveryFailures' cannot be set outside Websphere Liberty Profile
10:51:40,502 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0006: Registered admin object at java:/queue/FeederPrecificador
10:51:40,504 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0006: Registered admin object at java:/queue/AtivoFeeder
10:51:40,594 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 6.0.22.Final
10:51:40,907 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000128: Infinispan version: Infinispan 'Taedonggang' 12.1.7.Final
10:51:41,096 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
10:51:41,098 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
10:51:41,205 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
10:51:41,611 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-4) IJ020002: Deployed: file:/opt/wildfly/standalone/tmp/vfs/temp/tempb3a6013d23a31f18/content-16ff9c850453d842/contents/
10:51:41,612 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound Jakarta Connectors AdminObject [java:/queue/FeederPrecificador]
10:51:41,689 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-5) WFLYJCA0002: Bound Jakarta Connectors ConnectionFactory [java:jboss/DefaultJMSConnectionFactory]
10:51:41,690 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound Jakarta Connectors AdminObject [java:/queue/AtivoFeeder]
10:51:41,998 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000025: wakeUpInterval is <= 0, not starting expired purge thread
10:51:42,189 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 79) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
/opt/wildfly/bin/standalone.sh: line 338:   458 Killed                  "/usr/java/openjdk-8/bin/java" -D"[Standalone]" -server -XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true "-Dorg.jboss.boot.log.file=/opt/wildfly/standalone/log/server.log" "-Dlogging.configuration=file:/opt/wildfly/standalone/configuration/logging.properties" -jar "/opt/wildfly/jboss-modules.jar" -mp "/opt/wildfly/modules" org.jboss.as.standalone -Djboss.home.dir="/opt/wildfly" -Djboss.server.base.dir="/opt/wildfly/standalone" '-b' '0.0.0.0' '-Djboss.bind.address.management=0.0.0.0'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD --previous | grep -Ei 'ERROR|WFLYCTL0211|Cannot resolve|JMSWMQ|MQRC|Exception' | head -40
Resulting JBOSS_JAVA_SIZING=-XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m
  JAVA_OPTS:  -server -XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true
10:51:27,894 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 44) WFLYCTL0013: Operation ("add") failed - address: ([
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${env.DATABASE_PASSWORD}'"
/opt/wildfly/bin/standalone.sh: line 338:   458 Killed                  "/usr/java/openjdk-8/bin/java" -D"[Standalone]" -server -XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true "-Dorg.jboss.boot.log.file=/opt/wildfly/standalone/log/server.log" "-Dlogging.configuration=file:/opt/wildfly/standalone/configuration/logging.properties" -jar "/opt/wildfly/jboss-modules.jar" -mp "/opt/wildfly/modules" org.jboss.as.standalone -Djboss.home.dir="/opt/wildfly" -Djboss.server.base.dir="/opt/wildfly/standalone" '-b' '0.0.0.0' '-Djboss.bind.address.management=0.0.0.0'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicql-mapspricing-tqs --list | grep -Ei 'mq|queue|ldap|activemq'
LDAP_ANONYMOUS_READ_ONLY=true
LDAP_BIND_DN=
LDAP_BIND_PASSWORD=
LDAP_DOMAIN=
LDAP_GROUP_BASE_DN=cn=SICQL,ou=groups,o=caixa
LDAP_GROUP_FILTER=(&(objectClass=groupOfUniqueNames)(uniqueMember=uid={1},ou=people,o=caixa))
LDAP_GROUP_NAME_ATTRIBUTE=cn
LDAP_URL=ldap://10.192.230.65:2489
LDAP_USER_BASE_DN=ou=people,o=caixa
LDAP_USER_FILTER=(&(objectClass=inetOrgPerson)(objectClass=cefusuario)(uid={0}))
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicql-mapspricing-tqs -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}{"\n"}{.spec.template.spec.containers[0].readinessProbe}{"\n"}{.spec.template.spec.containers[0].resources}{"\n"}'


map[limits:map[cpu:2 memory:5Gi] requests:map[cpu:50m memory:256Mi]]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicql-mapsfeeder-tqs --list | grep -Ei 'mq|queue|ldap|activemq'
FEEDER_TO_PRECIFICADOR_QUEUE=LQ.REQ.TESTEPRICING
IBMMQ_QUEUE_MANAGER=BRD1
IBMMQ_URL=tcp://10.192.228.145:1414
LDAP_ANONYMOUS_READ_ONLY=
LDAP_BIND_DN=
LDAP_BIND_PASSWORD=
LDAP_DOMAIN=
LDAP_GROUP_BASE_DN=
LDAP_GROUP_NAME_ATTRIBUTE=
LDAP_URL=
LDAP_USER_BASE_DN=
MQ_TYPE=ibmmq
PEGASUS_DIGESTER_QUEUE=LQ.REQ.TESTEPEGASUS
-sh-4.2$ oc get dc sicql-mapsfeeder-tqs -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}{"\n"}{.spec.template.spec.containers[0].readinessProbe}{"\n"}{.spec.template.spec.containers[0].resources}{"\n"}'
map[successThreshold:1 failureThreshold:3 httpGet:map[path:/actuator/health/liveness port:8080 scheme:HTTP] initialDelaySeconds:60 timeoutSeconds:3 periodSeconds:10]
map[initialDelaySeconds:60 timeoutSeconds:3 periodSeconds:10 successThreshold:1 failureThreshold:3 httpGet:map[path:/actuator/health/readiness port:8080 scheme:HTTP]]
map[requests:map[cpu:500m memory:1Gi] limits:map[cpu:1 memory:1Gi]]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc | grep feeder
sicql-maps-feeder-tqs                1          1         0
sicql-mapsfeeder-tqs                 5          1         1
-sh-4.2$
