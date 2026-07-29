    Topology
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

    Pods

    Pod details

PodP sispl-processamento-sumarizacao-des-574688844-rkvrn
Running

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
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
2 times in the last 0 minutes
Readiness probe errored and resulted in unknown state: rpc error: code = Unknown desc = command error: cannot register an exec PID: container is stopping, stdout: , stderr: , exit code -1
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Container sispl-processamento-sumarizacao-des failed liveness probe, will be restarted
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
3 times in the last 0 minutes
Liveness probe failed: command timed out
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-processamento-sumarizacao:2.1.0.14" in 8.865s (8.865s including waiting). Image size: 1170309806 bytes.
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Created container: sispl-processamento-sumarizacao-des
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Started container sispl-processamento-sumarizacao-des
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from multus
Add eth0 [25.131.0.16/23] from ovn-kubernetes
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-processamento-sumarizacao:2.1.0.14"
PodPsispl-processamento-sumarizacao-des-574688844-rkvrnNamespaceNSsispl-des
há 1 minuto
Generated from default-scheduler
Successfully assigned sispl-des/sispl-processamento-sumarizacao-des-574688844-rkvrn to nctvmrh001-scgft-worker-0-5k79t




/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms2048m -Xmx2048m -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-azure2024_v1.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=http://proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=http://proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent.jar -Djava.net.useSystemProxies=false -Dhttp.proxyHost=http://proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=http://proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 

=========================================================================

2026-07-29 11:08:24.251-03:00 WARN  c.m.a.a.i.c.ConfigurationBuilder - the requested sampling percentage 30.0 was rounded to nearest 100/N: 33.333332
2026-07-29 11:08:24.364-03:00 ERROR c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.2.10 failed to start (PID 193)
java.lang.IllegalArgumentException: Invalid connection string
	at com.microsoft.applicationinsights.agent.internal.telemetry.TelemetryClient.setConnectionString(TelemetryClient.java:348)
	at com.microsoft.applicationinsights.agent.internal.init.TelemetryClientInitializer.setConnectionString(TelemetryClientInitializer.java:119)
	at com.microsoft.applicationinsights.agent.internal.init.TelemetryClientInitializer.initialize(TelemetryClientInitializer.java:60)
	at com.microsoft.applicationinsights.agent.internal.init.AiComponentInstaller.start(AiComponentInstaller.java:181)
	at com.microsoft.applicationinsights.agent.internal.init.AiComponentInstaller.beforeAgent(AiComponentInstaller.java:81)
	at com.microsoft.applicationinsights.agent.internal.init.MainEntryPoint.start(MainEntryPoint.java:96)
	at io.opentelemetry.javaagent.tooling.AgentInstallerOverride.installBytebuddyAgent(AgentInstallerOverride.java:32)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at io.opentelemetry.javaagent.tooling.AgentStarterImpl.start(AgentStarterImpl.java:71)
	at io.opentelemetry.javaagent.bootstrap.AgentInitializer.initialize(AgentInitializer.java:37)
	at io.opentelemetry.javaagent.OpenTelemetryAgent.startAgent(OpenTelemetryAgent.java:55)
	at io.opentelemetry.javaagent.OpenTelemetryAgent.premain(OpenTelemetryAgent.java:44)
	at com.microsoft.applicationinsights.agent.Agent.premain(Agent.java:48)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:386)
	at sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:401)
Caused by: com.microsoft.applicationinsights.agent.internal.telemetry.InvalidConnectionStringException: Could not parse connection string.
	at com.microsoft.applicationinsights.agent.internal.telemetry.ConnectionString.getKeyValuePairs(ConnectionString.java:93)
	at com.microsoft.applicationinsights.agent.internal.telemetry.ConnectionString.parseInto(ConnectionString.java:51)
	at com.microsoft.applicationinsights.agent.internal.telemetry.TelemetryClient.setConnectionString(TelemetryClient.java:346)
	... 21 common frames omitted
Caused by: java.lang.IllegalArgumentException: null
	at com.microsoft.applicationinsights.agent.internal.common.Strings.splitToMap(Strings.java:51)
	at com.microsoft.applicationinsights.agent.internal.telemetry.ConnectionString.getKeyValuePairs(ConnectionString.java:91)
	... 23 common frames omitted
[0m11:08:25,227 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m11:08:26,029 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m11:08:26,104 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m11:08:26,324 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.4.GA (WildFly Core 15.0.8.Final-redhat-00001) starting
[0m[0m11:08:26,500 INFO  [org.jboss.vfs] (MSC service thread 1-8) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[33m11:08:26,944 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "http.nonProxyHosts" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
[0m[33m11:08:26,945 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "http.proxyHost" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
[0m[33m11:08:26,946 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "https.proxyHost" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
[0m[0m11:08:28,615 INFO  [org.wildfly.security] (ServerService Thread Pool -- 27) ELY00001: WildFly Elytron version 1.15.11.Final-redhat-00002
[0m[0m11:08:29,100 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 10) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m11:08:30,004 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m11:08:30,100 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 18) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m11:08:30,860 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 35) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/a1/9af7065bf9fc6e4228013d92f3370b2451be89/content
[0m[0m11:08:30,912 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 35) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/07/ccfe7e4c92483708dcffcccde285fa7bbddf4c/content
[0m[0m11:08:31,014 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 35) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/e7/7d3635d02c26697526437c59a55f5b9a9a21ee/content
[0m[0m11:08:31,028 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m11:08:31,104 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.6.Final-redhat-00001
[0m[0m11:08:31,108 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.6.Final-redhat-00001
[0m[0m11:08:31,405 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m11:08:31,405 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 70) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m11:08:31,408 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy version 3.15.3.Final-redhat-00001
[0m[0m11:08:31,414 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m11:08:31,415 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: Worker 'default' has auto-configured to 32 IO threads with 256 max task threads based on your 16 available processors
[0m[0m11:08:31,415 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 62) WFLYNAM0001: Activating Naming Subsystem
[0m[0m11:08:31,502 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 68) WFLYSEC0002: Activating Security Subsystem
[0m[0m11:08:31,503 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m11:08:31,507 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 61) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m11:08:31,507 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 72) WFLYWS0002: Activating WebServices Extension
[0m[0m11:08:31,510 INFO  [org.jboss.as.security] (MSC service thread 1-4) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00008
[0m[0m11:08:31,602 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.3.Final-redhat-00001)
[0m[0m11:08:31,614 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0003: Undertow 2.2.16.Final-redhat-00001 starting
[0m[0m11:08:31,703 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 5.0.23.SP1-redhat-00001
[0m[0m11:08:31,802 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m11:08:31,808 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m11:08:32,099 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.29)
[0m[0m11:08:32,102 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0018: Started Driver service with driver-name = DB2JDBCDriver
[0m[0m11:08:32,102 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
[0m[0m11:08:32,104 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m11:08:32,498 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m11:08:32,510 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
[0m[0m11:08:32,511 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m11:08:32,511 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m
