Jesse Mouta Pereira Batista
Home
Favorites
Ecosystem
Helm
Workloads
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
Networking
Services
Routes
Ingresses
NetworkPolicies
UserDefinedNetworks
Storage
Builds
Observe
Compute
User Management
Administration

Project: sispl-tqs
Pods
Pod details
Pod
P
sispl-canal-webhook-pix-tqs-54cb654c99-8767g
ImagePullBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 7 events
Older events are not stored.
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
3 times in the last 0 minutes
Failed to pull image "sispl-canal-webhook-pix-tqs:2.2.0.10": unable to pull image or OCI artifact: pull image err: initializing source docker://sispl-canal-webhook-pix-tqs:2.2.0.10: reading manifest 2.2.0.10 in docker.io/library/sispl-canal-webhook-pix-tqs: requested access to the resource is denied; artifact err: get manifest: build image source: reading manifest 2.2.0.10 in docker.io/library/sispl-canal-webhook-pix-tqs: requested access to the resource is denied
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
3 times in the last 0 minutes
Error: ErrImagePull
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
3 times in the last 1 minute
Pulling image "sispl-canal-webhook-pix-tqs:2.2.0.10"
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
2 times in the last 0 minutes
Back-off pulling image "sispl-canal-webhook-pix-tqs:2.2.0.10"
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
2 times in the last 0 minutes
Error: ImagePullBackOff
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
há 1 minuto
Generated from multus
Add eth0 [25.129.3.138/23] from ovn-kubernetes
PodPsispl-canal-webhook-pix-tqs-54cb654c99-8767g
NamespaceNSsispl-tqs
há 1 minuto
Generated from default-scheduler
Successfully assigned sispl-tqs/sispl-canal-webhook-pix-tqs-54cb654c99-8767g to nctvmrh001-scgft-worker-0-cs2xc



=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-webhook-pix-tqs-esteiras

=========================================================================

[0m11:39:30,020 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.0.Final-redhat-1
[0m[33m11:39:30,543 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m11:39:30,616 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m11:39:31,132 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0049: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) starting
[0m[0m11:39:31,408 INFO  [org.jboss.vfs] (MSC service thread 1-7) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[31m11:39:34,911 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
[0m[0m11:39:34,921 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m11:39:34,940 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 19) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m11:39:34,942 INFO  [org.wildfly.security] (ServerService Thread Pool -- 8) ELY00001: WildFly Elytron version 1.1.7.Final-redhat-1
[0m[0m11:39:35,557 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 28) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/55/e351450f83a5286bf1a25b50f12a0e4c74563a/content
[0m[0m11:39:35,647 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 28) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/73/f3f95d33993f968113d1ff268860bbbc737daa/content
[0m[31m11:39:35,819 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Error initializing vault --  org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-TQS.keystore)
	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:93) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.server.services.security.VaultAddHandler.performRuntime(VaultAddHandler.java:84) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractAddStepHandler.performRuntime(AbstractAddStepHandler.java:337) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractAddStepHandler$1.execute(AbstractAddStepHandler.java:151) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:982) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:726) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:450) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1402) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:516) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:468) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:430) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.server.ServerService.boot(ServerService.java:437) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.server.ServerService.boot(ServerService.java:396) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:370) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_131]
Caused by: org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-TQS.keystore)
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:210) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:91) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
	... 14 more
Caused by: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-TQS.keystore)
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:691) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:205) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
	... 15 more
Caused by: java.io.FileNotFoundException: /opt/jboss/standalone/configuration/vaultcaixa-sispl-TQS.keystore (No such file or directory)
	at java.io.FileInputStream.open0(Native Method) [rt.jar:1.8.0_131]
	at java.io.FileInputStream.open(FileInputStream.java:195) [rt.jar:1.8.0_131]
	at java.io.FileInputStream.<init>(FileInputStream.java:138) [rt.jar:1.8.0_131]
	at org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:150) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:688) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
	... 16 more

[0m[31m11:39:35,825 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
[0m[0m11:39:36,012 INFO  [org.jboss.as] (MSC service thread 1-6) WFLYSRV0050: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) stopped in 96ms
[0m
