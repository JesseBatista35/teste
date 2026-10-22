OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
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

Project: sicow-des
Pods
Pod details
Pod
P
sicow-penhor-okd-des-57-twmh6
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
Showing 9 events
Older events are not stored.
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:30
Generated from kubelet on ceadecldlx023.nprd.caixa
3 times in the last 2 minutes
Created container sicow-penhor-okd-des
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:30
Generated from kubelet on ceadecldlx023.nprd.caixa
3 times in the last 2 minutes
Started container sicow-penhor-okd-des
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:30
Generated from kubelet on ceadecldlx023.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicow-penhor-okd:1.0.15.9" in 56.169783ms (56.182126ms including waiting)
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:30
Generated from kubelet on ceadecldlx023.nprd.caixa
3 times in the last 2 minutes
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicow-penhor-okd:1.0.15.9"
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:29
Generated from kubelet on ceadecldlx023.nprd.caixa
2 times in the last 0 minutes
Back-off restarting failed container
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:28
Generated from kubelet on ceadecldlx023.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicow-penhor-okd:1.0.15.9" in 55.833547ms (55.84129ms including waiting)
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:27
Generated from kubelet on ceadecldlx023.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicow-penhor-okd:1.0.15.9" in 2.670126779s (2.670139937s including waiting)
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:27
Generated from multus
Add eth0 [25.0.9.174/23] from openshift-sdn
PodPsicow-penhor-okd-des-57-twmh6
NamespaceNSsicow-des
22 de out. de 2026, 17:27
Generated from default-scheduler
Successfully assigned sicow-des/sicow-penhor-okd-des-57-twmh6 to ceadecldlx023.nprd.caixa


=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx1024m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration//opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent-3.7.1.jar -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 

=========================================================================

OpenJDK 64-Bit Server VM warning: If the number of processors is expected to increase from one, then you should configure the number of parallel GC threads appropriately using -XX:ParallelGCThreads=N
2026-10-22 17:30:19.033-03:00 WARN  i.o.s.a.ResourceConfiguration - Found reference to io.opentelemetry.sdk.autoconfigure.internal.EnvironmentResourceProvider in otel.java.enabled.resource.providers. Please update to io.opentelemetry.sdk.autoconfigure.EnvironmentResourceProvider. Support for the old provider name will be removed after 1.49.0.
2026-10-22 17:30:37.030-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 171, JVM running for 32.626 s)
2026-10-22 17:30:37.032-03:00 INFO  c.m.applicationinsights.agent - Java version: 1.8.0_372, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre
[0m17:30:38,402 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m17:30:39,710 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m17:30:39,883 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m17:30:40,474 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m17:30:40,696 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m17:30:44,182 INFO  [org.wildfly.security] (ServerService Thread Pool -- 31) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m17:30:45,085 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 24) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m17:30:46,684 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:30:46,686 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:30:46,777 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 38) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[33m17:30:46,974 WARN  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 34) WFLYMSGAMQ0071: There is no resource matching the expiry-address jms.queue.ExpiryQueue for the address-settings #, expired messages from destinations matching this address-setting will be lost!
[0m[33m17:30:46,974 WARN  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 34) WFLYMSGAMQ0072: There is no resource matching the dead-letter-address jms.queue.DLQ for the address-settings #, undelivered messages from destinations matching this address-setting will be lost!
[0m[0m17:30:47,590 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 2) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/43/10e3eda419b2f2c7d4fb432f9cf7908f535920/content
[0m[0m17:30:48,091 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 2) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/e1/adf087cf9c9f7bb41452a1008f77e2b2b8e435/content
[0m[31m17:30:48,102 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0362: Capabilities required by resource '/subsystem=logging/root-logger=ROOT' are not available:
    org.wildfly.logging.handler.SICOWPENHOR; Possible registration points for this capability: 
		/subsystem=logging/async-handler=*
		/subsystem=logging/console-handler=*
		/subsystem=logging/file-handler=*
		/subsystem=logging/periodic-rotating-file-handler=*
		/subsystem=logging/periodic-size-rotating-file-handler=*
		/subsystem=logging/size-rotating-file-handler=*
		/subsystem=logging/custom-handler=*
		/subsystem=logging/syslog-handler=*
		/subsystem=logging/socket-handler=*
		/subsystem=logging/logging-profile=*/async-handler=*
		/subsystem=logging/logging-profile=*/console-handler=*
		/subsystem=logging/logging-profile=*/file-handler=*
		/subsystem=logging/logging-profile=*/periodic-rotating-file-handler=*
		/subsystem=logging/logging-profile=*/periodic-size-rotating-file-handler=*
		/subsystem=logging/logging-profile=*/size-rotating-file-handler=*
		/subsystem=logging/logging-profile=*/custom-handler=*
		/subsystem=logging/logging-profile=*/syslog-handler=*
		/subsystem=logging/logging-profile=*/socket-handler=*
[0m[31m17:30:48,106 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
[0m[0m17:30:48,290 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) stopped in 110ms
[0m


