-sh-4.2$
-sh-4.2$ oc logs -f sid01-lancamentos-financeiros-okd4-tqs-50-n6crg
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 16:16:12.969-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 10.136 s)
2026-09-18 16:16:12.973-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 16:16:21.392-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-18 16:16:23,101 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main)
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-18 16:16:26,288 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 16:16:27,790 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 14.615s. Listening on: http://0.0.0.0:8080
2026-09-18 16:16:27,791 INFO  [io.quarkus] (main) Profile prod activated.
2026-09-18 16:16:27,791 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 16:17:11.512-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.63:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests.  )","tryCount":3}
2026-09-18 16:21:21.395-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 19): Sending telemetry to the ingestion service:
 * Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (2 times)


^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sid01-lancamentos-financeiros-okd4-tqs-50-n6crg --previous
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 15:34:13.969-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 9.491 s)
2026-09-18 15:34:13.973-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 15:34:23.680-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-18 15:34:24,973 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main)
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-18 15:34:27,482 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 15:34:29,276 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 15.188s. Listening on: http://0.0.0.0:8080
2026-09-18 15:34:29,276 INFO  [io.quarkus] (main) Profile prod activated.
2026-09-18 15:34:29,277 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 15:35:12.856-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.65:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests.  )","tryCount":3}
2026-09-18 15:39:23.682-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 19): Sending telemetry to the ingestion service:
 * Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (2 times)
/usr/local/s2i/run: line 6:     8 Killed                  /deployments/run-java.sh
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod sid01-lancamentos-financeiros-okd4-tqs-50-n6crg
E0918 16:23:14.679448   44853 describe.go:612] Unable to construct reference to '&core.Pod{TypeMeta:v1.TypeMeta{Kind:"", APIVersion:""}, ObjectMeta:v1.ObjectMeta{Name:"sid01-lancamentos-financeiros-okd4-tqs-50-n6crg", GenerateName:"sid01-lancamentos-financeiros-okd4-tqs-50-", Namespace:"sid01-tqs", SelfLink:"", UID:"d9a71f33-ec8b-462e-8a69-98c81ff4eaef", ResourceVersion:"2209684143", Generation:0, CreationTimestamp:v1.Time{Time:time.Time{wall:0x0, ext:63925343681, loc:(*time.Location)(0x49403c0)}}, DeletionTimestamp:(*v1.Time)(nil), DeletionGracePeriodSeconds:(*int64)(nil), Labels:map[string]string{"CGC_DES":"5142", "CGC_OPS":"7259", "app":"sid01-lancamentos-financeiros-okd4-tqs", "deployment":"sid01-lancamentos-financeiros-okd4-tqs-50", "deploymentconfig":"sid01-lancamentos-financeiros-okd4-tqs", "name":"sid01-lancamentos-financeiros-okd4-tqs"}, Annotations:map[string]string{"k8s.v1.cni.cncf.io/network-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.0.9.134\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "k8s.v1.cni.cncf.io/networks-status":"[{\n    \"name\": \"openshift-sdn\",\n    \"interface\": \"eth0\",\n    \"ips\": [\n        \"25.0.9.134\"\n    ],\n    \"default\": true,\n    \"dns\": {}\n}]", "openshift.io/deployment-config.latest-version":"50", "openshift.io/deployment-config.name":"sid01-lancamentos-financeiros-okd4-tqs", "openshift.io/deployment.name":"sid01-lancamentos-financeiros-okd4-tqs-50", "openshift.io/generated-by":"OpenShiftNewApp", "openshift.io/scc":"anyuid"}, OwnerReferences:[]v1.OwnerReference{v1.OwnerReference{APIVersion:"v1", Kind:"ReplicationController", Name:"sid01-lancamentos-financeiros-okd4-tqs-50", UID:"0f1f9876-46aa-4a66-b388-cdf45e4ecdba", Controller:(*bool)(0xc42121cf2a), BlockOwnerDeletion:(*bool)(0xc42121cf2b)}}, Initializers:(*v1.Initializers)(nil), Finalizers:[]string(nil), ClusterName:""}, Spec:core.PodSpec{Volumes:[]core.Volume{core.Volume{Name:"nsgd-des-wo61876377", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4210adb00), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"nsgd-tqs-wo62898624", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4210adb40), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"nsgd-des-certificado-2024-acteste", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4210adb80), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"caixa-truststore-acteste-nprd", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(0xc4210adbc0), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(nil), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}, core.Volume{Name:"kube-api-access-tpb8s", VolumeSource:core.VolumeSource{HostPath:(*core.HostPathVolumeSource)(nil), EmptyDir:(*core.EmptyDirVolumeSource)(nil), GCEPersistentDisk:(*core.GCEPersistentDiskVolumeSource)(nil), AWSElasticBlockStore:(*core.AWSElasticBlockStoreVolumeSource)(nil), GitRepo:(*core.GitRepoVolumeSource)(nil), Secret:(*core.SecretVolumeSource)(nil), NFS:(*core.NFSVolumeSource)(nil), ISCSI:(*core.ISCSIVolumeSource)(nil), Glusterfs:(*core.GlusterfsVolumeSource)(nil), PersistentVolumeClaim:(*core.PersistentVolumeClaimVolumeSource)(nil), RBD:(*core.RBDVolumeSource)(nil), Quobyte:(*core.QuobyteVolumeSource)(nil), FlexVolume:(*core.FlexVolumeSource)(nil), Cinder:(*core.CinderVolumeSource)(nil), CephFS:(*core.CephFSVolumeSource)(nil), Flocker:(*core.FlockerVolumeSource)(nil), DownwardAPI:(*core.DownwardAPIVolumeSource)(nil), FC:(*core.FCVolumeSource)(nil), AzureFile:(*core.AzureFileVolumeSource)(nil), ConfigMap:(*core.ConfigMapVolumeSource)(nil), VsphereVolume:(*core.VsphereVirtualDiskVolumeSource)(nil), AzureDisk:(*core.AzureDiskVolumeSource)(nil), PhotonPersistentDisk:(*core.PhotonPersistentDiskVolumeSource)(nil), Projected:(*core.ProjectedVolumeSource)(0xc42104dc00), PortworxVolume:(*core.PortworxVolumeSource)(nil), ScaleIO:(*core.ScaleIOVolumeSource)(nil), StorageOS:(*core.StorageOSVolumeSource)(nil)}}}, InitContainers:[]core.Container(nil), Containers:[]core.Container{core.Container{Name:"sid01-lancamentos-financeiros-okd4-tqs", Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sid01-lancamentos-financeiros:1.5.0.2", Command:[]string(nil), Args:[]string(nil), WorkingDir:"", Ports:[]core.ContainerPort{core.ContainerPort{Name:"", HostPort:0, ContainerPort:8080, Protocol:"TCP", HostIP:""}}, EnvFrom:[]core.EnvFromSource(nil), Env:[]core.EnvVar{core.EnvVar{Name:"TZ", Value:"America/Sao_Paulo", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_CONNECTION_STRING", Value:"InstrumentationKey=af499966-a437-4fed-9f90-b415f82a8004;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_ROLE_NAME", Value:"SID01-lancamentos-financeiros-TQS", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE", Value:"33", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL", Value:"INFO", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER", Value:"https://login2tqs.caixa.gov.br/auth/realms/internet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01H0wQ9sOd2rmZV11mGIOoAN/Yklz6SuL+eeXJsnak/osL3xkTszTQ+S/8iZScXpmOj5eM3QbncD9yF0/DHEWrS7DzBetrWnlpa53HocW9u+FEcVgtxofKlAz0rcVyOxl4YuKSElDmo0C0qFgLIaiXPKSnGiB5GmBegvK3nBo95/IPUKUxLUJzpOU7/7nkIVlUrHEx68dcWWsZtpRzrblSOIP/P6DX0sCtr0afSGypE8FbFaSw4CnvLpPzHfDWhqW8J8Z1cY6qX9aF8cV5955EOf/QW6LQAK7QZiD3pnOPnnVvRduUtQRfM7C4rT++TmmPhlTmaXeIsrcsZqI8Q5+wIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER", Value:"https://logintqs.caixa.gov.br/auth/realms/internet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnUpqUUzfo9cWEFMy4ycmT1VqSSuvOvVxEbKl8xxyHkJNDEnXJB9Yia5kPYfCcUZrqzbqr06aKYCNITdo4i2UWb/bI4JxN78Uv2rm9v+x/DoEbLGJIq+eq/cezfTnxWdLctCgCKduchr4pSJkw9CTEbyMF/EjcKbwP3l4iKzQ9WKOmYSH3JxKwTQahLnVsGSryEQhJsjM6ixJWdlGe2WonaAzQigEOpb6e79pae1H5QKGNzRIrucPW5ABIK8sZKPeQNZE2+OtajuQckORS5f3w2PsbSfCh+kW81rMnyuxX+0iy6wz6hcJUQVsA60HkIl/hZ90U4DMrD7BwMTDB+5E/wIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER", Value:"https://login.tqs.caixa/auth/realms/intranet", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY", Value:"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnA3K4+m+xZE7pqA4HgFMhpXztxWUwwhDZ1GlWQwqLGOwAj0EjzvhinZ8GG+qAClOSdrMCFbVrMELkvmfK8x/5Xrd70poUkq3x2gUUrJGNkuoxlYI9NKtsbEzRxxroVZVPRbJzrnRv2/kTFFE6SxTOfd0ZGbuV7CIuIAD42RsLvyjZALK9sM+eHJG+W0zb+L5+zfHP2g6y1/Ykf72mXnTKLgMAMGr1eEyVyBF1dOnsH/AOovm6w4Y5IDgnd1aWDN0ywfH9WsIq0ork7Kb/76IjNlS7+BhV2rnlFnvNm4pji6Ft3tkKMd0Gpx+6lHzWMk2kjb5pA5uDGq3lzFhtYqcnQIDAQAB", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CICSWEB_ROOT_ENDPOINT_HTTP", Value:"https://cicsweb.tqs.caixa:2584", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"CICSWEB_ROOT_ENDPOINT_HTTPS", Value:"https://cicsweb.tqs.caixa:2587", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"HTTPS_PROXY", Value:"http://proxydes.caixa:80", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"JAVA_OPTIONS_APPEND", Value:"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"NO_PROXY", Value:".caixa,.caixa.gov.br,10.0.0.0/8", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"USER_BASIC_AUTH", Value:"SNSGSQ01", ValueFrom:(*core.EnvVarSource)(nil)}, core.EnvVar{Name:"PASS_BASIC_AUTH", Value:"", ValueFrom:(*core.EnvVarSource)(0xc42104d9e0)}}, Resources:core.ResourceRequirements{Limits:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:1, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:1073741824, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"1Gi", Format:"BinarySI"}}, Requests:core.ResourceList{"cpu":resource.Quantity{i:resource.int64Amount{value:50, scale:-3}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"50m", Format:"DecimalSI"}, "memory":resource.Quantity{i:resource.int64Amount{value:268435456, scale:0}, d:resource.infDecAmount{Dec:(*inf.Dec)(nil)}, s:"", Format:"BinarySI"}}}, VolumeMounts:[]core.VolumeMount{core.VolumeMount{Name:"nsgd-des-wo61876377", ReadOnly:false, MountPath:"/deployments/nsgd-des-wo61876377.jks", SubPath:"nsgd-des-wo61876377.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"nsgd-tqs-wo62898624", ReadOnly:false, MountPath:"/deployments/nsgd-tqs-wo62898624.jks", SubPath:"nsgd-tqs-wo62898624.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"nsgd-des-certificado-2024-acteste", ReadOnly:false, MountPath:"/deployments/nsgd-des-certificado-2024-acteste.jks", SubPath:"nsgd-des-certificado-2024-acteste.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"caixa-truststore-acteste-nprd", ReadOnly:false, MountPath:"/deployments/caixa-truststore-acteste-nprd.jks", SubPath:"caixa-truststore-acteste-nprd.jks", MountPropagation:(*core.MountPropagationMode)(nil)}, core.VolumeMount{Name:"kube-api-access-tpb8s", ReadOnly:true, MountPath:"/var/run/secrets/kubernetes.io/serviceaccount", SubPath:"", MountPropagation:(*core.MountPropagationMode)(nil)}}, VolumeDevices:[]core.VolumeDevice(nil), LivenessProbe:(*core.Probe)(0xc421051230), ReadinessProbe:(*core.Probe)(0xc421051260), Lifecycle:(*core.Lifecycle)(nil), TerminationMessagePath:"/dev/termination-log", TerminationMessagePolicy:"File", ImagePullPolicy:"Always", SecurityContext:(*core.SecurityContext)(0xc4210ade40), Stdin:false, StdinOnce:false, TTY:false}}, RestartPolicy:"Always", TerminationGracePeriodSeconds:(*int64)(0xc42121dbb8), ActiveDeadlineSeconds:(*int64)(nil), DNSPolicy:"ClusterFirst", NodeSelector:map[string]string(nil), ServiceAccountName:"default", AutomountServiceAccountToken:(*bool)(nil), NodeName:"ceadecldlx023.nprd.caixa", SecurityContext:(*core.PodSecurityContext)(0xc4210d58f0), ImagePullSecrets:[]core.LocalObjectReference{core.LocalObjectReference{Name:"registry-secret"}}, Hostname:"", Subdomain:"", Affinity:(*core.Affinity)(nil), SchedulerName:"default-scheduler", Tolerations:[]core.Toleration{core.Toleration{Key:"node.kubernetes.io/not-ready", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc42121dc70)}, core.Toleration{Key:"node.kubernetes.io/unreachable", Operator:"Exists", Value:"", Effect:"NoExecute", TolerationSeconds:(*int64)(0xc42121dc90)}, core.Toleration{Key:"node.kubernetes.io/memory-pressure", Operator:"Exists", Value:"", Effect:"NoSchedule", TolerationSeconds:(*int64)(nil)}}, HostAliases:[]core.HostAlias(nil), PriorityClassName:"", Priority:(*int32)(0xc42121dcb8), DNSConfig:(*core.PodDNSConfig)(nil), ReadinessGates:[]core.PodReadinessGate(nil)}, Status:core.PodStatus{Phase:"Running", Conditions:[]core.PodCondition{core.PodCondition{Type:"Initialized", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63925343681, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"Ready", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63925355832, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"ContainersReady", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63925355832, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}, core.PodCondition{Type:"PodScheduled", Status:"True", LastProbeTime:v1.Time{Time:time.Time{wall:0x0, ext:0, loc:(*time.Location)(nil)}}, LastTransitionTime:v1.Time{Time:time.Time{wall:0x0, ext:63925343681, loc:(*time.Location)(0x49403c0)}}, Reason:"", Message:""}}, Message:"", Reason:"", NominatedNodeName:"", HostIP:"10.116.208.43", PodIP:"25.0.9.134", StartTime:(*v1.Time)(0xc42104db80), QOSClass:"Burstable", InitContainerStatuses:[]core.ContainerStatus(nil), ContainerStatuses:[]core.ContainerStatus{core.ContainerStatus{Name:"sid01-lancamentos-financeiros-okd4-tqs", State:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(0xc42104dbc0), Terminated:(*core.ContainerStateTerminated)(nil)}, LastTerminationState:core.ContainerState{Waiting:(*core.ContainerStateWaiting)(nil), Running:(*core.ContainerStateRunning)(nil), Terminated:(*core.ContainerStateTerminated)(0xc4210d5880)}, Ready:true, RestartCount:9, Image:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sid01-lancamentos-financeiros:1.5.0.2", ImageID:"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sid01-lancamentos-financeiros@sha256:b9af687c1debfdc424fbdc94a00c947e48949805e774f5ed6e048444e472840d", ContainerID:"cri-o://46405639a58c07e67fb28c2a292a4228973de6bf65384c35a9df9c1872569d34"}}}}': selfLink was empty, can't make reference
Name:               sid01-lancamentos-financeiros-okd4-tqs-50-n6crg
Namespace:          sid01-tqs
Priority:           0
PriorityClassName:  <none>
Node:               ceadecldlx023.nprd.caixa/10.116.208.43
Start Time:         Fri, 18 Sep 2026 12:54:41 -0300
Labels:             CGC_DES=5142
                    CGC_OPS=7259
                    app=sid01-lancamentos-financeiros-okd4-tqs
                    deployment=sid01-lancamentos-financeiros-okd4-tqs-50
                    deploymentconfig=sid01-lancamentos-financeiros-okd4-tqs
                    name=sid01-lancamentos-financeiros-okd4-tqs
Annotations:        k8s.v1.cni.cncf.io/network-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.0.9.134"
    ],
    "default": true,
    "dns": {}
}]
  k8s.v1.cni.cncf.io/networks-status=[{
    "name": "openshift-sdn",
    "interface": "eth0",
    "ips": [
        "25.0.9.134"
    ],
    "default": true,
    "dns": {}
}]
                openshift.io/deployment-config.latest-version=50
                openshift.io/deployment-config.name=sid01-lancamentos-financeiros-okd4-tqs
                openshift.io/deployment.name=sid01-lancamentos-financeiros-okd4-tqs-50
                openshift.io/generated-by=OpenShiftNewApp
                openshift.io/scc=anyuid
Status:         Running
IP:             25.0.9.134
Controlled By:  ReplicationController/sid01-lancamentos-financeiros-okd4-tqs-50
Containers:
  sid01-lancamentos-financeiros-okd4-tqs:
    Container ID:   cri-o://46405639a58c07e67fb28c2a292a4228973de6bf65384c35a9df9c1872569d34
    Image:          default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sid01-lancamentos-financeiros:1.5.0.2
    Image ID:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sid01-lancamentos-financeiros@sha256:b9af687c1debfdc424fbdc94a00c947e48949805e774f5ed6e048444e472840d
    Port:           8080/TCP
    Host Port:      0/TCP
    State:          Running
      Started:      Fri, 18 Sep 2026 16:16:02 -0300
    Last State:     Terminated
      Reason:       OOMKilled
      Exit Code:    137
      Started:      Fri, 18 Sep 2026 15:34:04 -0300
      Finished:     Fri, 18 Sep 2026 16:16:02 -0300
    Ready:          True
    Restart Count:  9
    Limits:
      cpu:     1
      memory:  1Gi
    Requests:
      cpu:      50m
      memory:   256Mi
    Liveness:   http-get http://:8080/q/health/live delay=60s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=60s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:                                                 America/Sao_Paulo
      APPLICATIONINSIGHTS_CONNECTION_STRING:              InstrumentationKey=af499966-a437-4fed-9f90-b415f82a8004;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
      APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL:  INFO
      APPLICATIONINSIGHTS_ROLE_NAME:                      SID01-lancamentos-financeiros-TQS
      APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE:            33
      APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL:         INFO
      CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER:               https://login2tqs.caixa.gov.br/auth/realms/internet
      CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY:            MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01H0wQ9sOd2rmZV11mGIOoAN/Yklz6SuL+eeXJsnak/osL3xkTszTQ+S/8iZScXpmOj5eM3QbncD9yF0/DHEWrS7DzBetrWnlpa53HocW9u+FEcVgtxofKlAz0rcVyOxl4YuKSElDmo0C0qFgLIaiXPKSnGiB5GmBegvK3nBo95/IPUKUxLUJzpOU7/7nkIVlUrHEx68dcWWsZtpRzrblSOIP/P6DX0sCtr0afSGypE8FbFaSw4CnvLpPzHfDWhqW8J8Z1cY6qX9aF8cV5955EOf/QW6LQAK7QZiD3pnOPnnVvRduUtQRfM7C4rT++TmmPhlTmaXeIsrcsZqI8Q5+wIDAQAB
      CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER:                https://logintqs.caixa.gov.br/auth/realms/internet
      CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY:             MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnUpqUUzfo9cWEFMy4ycmT1VqSSuvOvVxEbKl8xxyHkJNDEnXJB9Yia5kPYfCcUZrqzbqr06aKYCNITdo4i2UWb/bI4JxN78Uv2rm9v+x/DoEbLGJIq+eq/cezfTnxWdLctCgCKduchr4pSJkw9CTEbyMF/EjcKbwP3l4iKzQ9WKOmYSH3JxKwTQahLnVsGSryEQhJsjM6ixJWdlGe2WonaAzQigEOpb6e79pae1H5QKGNzRIrucPW5ABIK8sZKPeQNZE2+OtajuQckORS5f3w2PsbSfCh+kW81rMnyuxX+0iy6wz6hcJUQVsA60HkIl/hZ90U4DMrD7BwMTDB+5E/wIDAQAB
      CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER:                https://login.tqs.caixa/auth/realms/intranet
      CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY:             MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnA3K4+m+xZE7pqA4HgFMhpXztxWUwwhDZ1GlWQwqLGOwAj0EjzvhinZ8GG+qAClOSdrMCFbVrMELkvmfK8x/5Xrd70poUkq3x2gUUrJGNkuoxlYI9NKtsbEzRxxroVZVPRbJzrnRv2/kTFFE6SxTOfd0ZGbuV7CIuIAD42RsLvyjZALK9sM+eHJG+W0zb+L5+zfHP2g6y1/Ykf72mXnTKLgMAMGr1eEyVyBF1dOnsH/AOovm6w4Y5IDgnd1aWDN0ywfH9WsIq0ork7Kb/76IjNlS7+BhV2rnlFnvNm4pji6Ft3tkKMd0Gpx+6lHzWMk2kjb5pA5uDGq3lzFhtYqcnQIDAQAB
      CICSWEB_ROOT_ENDPOINT_HTTP:                         https://cicsweb.tqs.caixa:2584
      CICSWEB_ROOT_ENDPOINT_HTTPS:                        https://cicsweb.tqs.caixa:2587
      HTTPS_PROXY:                                        http://proxydes.caixa:80
      JAVA_OPTIONS_APPEND:                                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar
      NO_PROXY:                                           .caixa,.caixa.gov.br,10.0.0.0/8
      USER_BASIC_AUTH:                                    SNSGSQ01
      PASS_BASIC_AUTH:                                    <set to the key 'PASS_BASIC_AUTH' in secret 'sid01-lancamentos-financeiros-okd4-tqs'>  Optional: false
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /deployments/nsgd-des-certificado-2024-acteste.jks from nsgd-des-certificado-2024-acteste (rw)
      /deployments/nsgd-des-wo61876377.jks from nsgd-des-wo61876377 (rw)
      /deployments/nsgd-tqs-wo62898624.jks from nsgd-tqs-wo62898624 (rw)
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-tpb8s (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             True
  ContainersReady   True
  PodScheduled      True
Volumes:
  nsgd-des-wo61876377:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  nsgd-des-wo61876377
    Optional:    false
  nsgd-tqs-wo62898624:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  nsgd-tqs-wo62898624
    Optional:    false
  nsgd-des-certificado-2024-acteste:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  nsgd-des-certificado-2024-acteste
    Optional:    false
  caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
  kube-api-access-tpb8s:
  <unknown>
QoS Class:       Burstable
Node-Selectors:  <none>
Tolerations:     node.kubernetes.io/memory-pressure:NoSchedule
                 node.kubernetes.io/not-ready:NoExecute for 300s
                 node.kubernetes.io/unreachable:NoExecute for 300s
-sh-4.2$ watch oc get pods
-sh-4.2$


watch oc get pods



-sh-4.2$ watch oc get pods
Every 2,0s: oc get pods                                                                                                                                                     Fri Sep 18 16:23:46 2026

NAME                                                   READY     STATUS      RESTARTS          AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     233 (7h13m ago)   16d
sid01-lancamentos-financeiros-okd4-tqs-49-deploy       0/1       Completed   0                 6h15m
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0                 3h29m
sid01-lancamentos-financeiros-okd4-tqs-50-n6crg        1/1       Running     9 (7m44s ago)     3h29m
sid01-simulador-tqs-201-deploy                         0/1       Completed   0                 100d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0                 93d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0                 93d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0                 14d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0                 14d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0                 112d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0                 112d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0                 21d


