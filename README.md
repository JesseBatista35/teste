OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
Builds
Observe
Compute
User Management
Administration

Project: sihdg-hmp
Pods
Pod details
Pod
P
sihdg-jboss8-hmp-2-76z52
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 8 events
Older events are not stored.
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:18
Generated from kubelet on ceadecldlx084.nprd.caixa
2 times in the last 0 minutes
Liveness probe failed: /bin/bash: line 1: /opt/jboss/bin/livenessProbe.sh: No such file or directory
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:18
Generated from kubelet on ceadecldlx084.nprd.caixa
2 times in the last 0 minutes
Readiness probe failed: /bin/bash: line 1: /opt/jboss/bin/readinessProbe.sh: No such file or directory
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from multus
Add eth0 [25.3.41.59/23] from openshift-sdn
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from kubelet on ceadecldlx084.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.22.0.5"
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from kubelet on ceadecldlx084.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.22.0.5" in 54.748814ms (54.760256ms including waiting)
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from kubelet on ceadecldlx084.nprd.caixa
Created container sihdg-jboss8-hmp
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from kubelet on ceadecldlx084.nprd.caixa
Started container sihdg-jboss8-hmp
PodPsihdg-jboss8-hmp-2-76z52
NamespaceNSsihdg-hmp
30 de out. de 2026, 16:16
Generated from default-scheduler
Successfully assigned sihdg-hmp/sihdg-jboss8-hmp-2-76z52 to ceadecldlx084.nprd.caixa




-sh-4.2$ oc logs -f <pod-sihdg-jboss8-hmp-2-76z52> -n sihdg-hmp | grep -E "sihdgDS|WFLYSRV0025|WFLYSRV0026|ERROR"
-sh: pod-sihdg-jboss8-hmp-2-76z52: Arquivo ou diretório não encontrado
-sh-4.2$ oc logs -f sihdg-jboss8-hmp-2-76z52  -n sihdg-hmp | grep -E "sihdgDS|WFLYSRV0025|WFLYSRV0026|ERROR"
16:16:56,440 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 3890ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
16:16:58,526 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/jdbc/sihdgDS]
16:17:05,137 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for sihdgDS
16:17:05,508 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS
16:17:07,320 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS'
16:17:07,414 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 46) HHH000204: Processing PersistenceUnitInfo [name: sihdgDS]
16:17:07,811 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS
16:17:08,338 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS'
16:17:21,715 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 24779ms - Started 1183 of 1265 services (162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
ERROR *** WildFly wrapper process (1) received TERM signal ***
16:18:22,503 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 79) WFLYJPA0011: Stopping Persistence Unit (phase 2 of 2) Service 'sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS'
16:18:22,507 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 79) WFLYJPA0011: Stopping Persistence Unit (phase 1 of 2) Service 'sihdg-3.22.0.4.ear/sihdg-api.war#sihdgDS'
16:18:22,509 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Unbound data source [java:jboss/jdbc/sihdgDS]
-sh-4.2$
