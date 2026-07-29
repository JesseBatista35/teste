    Overview
    Projects
    Search
    API Explorer
    Events

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

PodP sispl-processamento-sumarizacao-des-785696bdd4-42d8c
CrashLoopBackOff

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 6 events
Older events are not stored.
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
3461 times in the last 20 hours
Back-off restarting failed container sispl-processamento-sumarizacao-des in pod sispl-processamento-sumarizacao-des-785696bdd4-42d8c_sispl-des(3e638b49-a542-49e5-832d-6bbc516d477f)
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
há 5 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
824 times in the last 20 hours
Liveness probe failed: command timed out
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
há 6 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
276 times in the last 20 hours
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-processamento-sumarizacao:2.1.14.0" already present on machine
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
há 6 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
277 times in the last 20 hours
Created container: sispl-processamento-sumarizacao-des
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
29 de jul. de 2026, 10:30
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
273 times in the last 20 hours
Container sispl-processamento-sumarizacao-des failed liveness probe, will be restarted
PodPsispl-processamento-sumarizacao-des-785696bdd4-42d8cNamespaceNSsispl-des
29 de jul. de 2026, 09:16
Generated from kubelet on nctvmrh001-scgft-worker-0-x4nk9
767 times in the last 20 hours
Readiness probe errored and resulted in unknown state: rpc error: code = Unknown desc = command error: cannot register an exec PID: container is stopping, stdout: , stderr: , exit code -1



    Overview
    Projects
    Search
    API Explorer
    Events

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

PodP sispl-processamento-sumarizacao-des-785696bdd4-42d8c
CrashLoopBackOff

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Warning alert:Some lines have been abridged because they are exceptionally long.
To view unabridged log content, you can either

    or download it.

8390 lines - Log stream ended.
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
10:47:49,106 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
10:47:49,904 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
10:47:49,911 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
10:47:50,212 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.4.GA (WildFly Core 15.0.8.Final-redhat-00001) starting
10:47:50,327 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
10:47:50,820 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "http.nonProxyHosts" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
10:47:50,821 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "http.proxyHost" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
10:47:50,821 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property "https.proxyHost" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.
10:47:52,524 INFO  [org.wildfly.security] (ServerService Thread Pool -- 28) ELY00001: WildFly Elytron version 1.15.11.Final-redhat-00002
10:47:53,009 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 18) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
10:47:54,204 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:47:54,303 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 11) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:47:55,401 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 30) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/a1/9af7065bf9fc6e4228013d92f3370b2451be89/content
10:47:55,415 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 30) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/a7/27561e59f4660ad9249517fc7b18db257086b1/content
10:47:55,532 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 30) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/e7/7d3635d02c26697526437c59a55f5b9a9a21ee/content
10:47:55,544 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
10:47:55,600 INFO  [org.xnio] (MSC service thread 1-4) XNIO version 3.8.6.Final-redhat-00001
10:47:55,607 INFO  [org.xnio.nio] (MSC service thread 1-4) XNIO NIO Implementation Version 3.8.6.Final-redhat-00001
10:47:55,718 INFO  [org.jboss.remoting] (MSC service thread 1-6) JBoss Remoting version 5.0.23.SP1-redhat-00001

