2026-07-28T19:08:58.3182579Z ##[section]Starting: Logs da Aplicação
2026-07-28T19:08:58.3185435Z ==============================================================================
2026-07-28T19:08:58.3185511Z Task         : Bash
2026-07-28T19:08:58.3185552Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-28T19:08:58.3185618Z Version      : 3.227.0
2026-07-28T19:08:58.3185656Z Author       : Microsoft Corporation
2026-07-28T19:08:58.3185714Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-28T19:08:58.3185790Z ==============================================================================
2026-07-28T19:08:59.2038820Z Generating script.
2026-07-28T19:08:59.2049358Z ========================== Starting Command Output ===========================
2026-07-28T19:08:59.2056322Z [command]/bin/bash /opt/ads-agent/_work/_temp/aa42d932-986a-4fa9-a7da-0ca75323866a.sh
2026-07-28T19:08:59.2100326Z + shopt -s expand_aliases
2026-07-28T19:08:59.2100997Z + [[ -n openshift_nprd_loterias ]]
2026-07-28T19:08:59.2101249Z + [[ openshift_nprd_loterias =~ ocp ]]
2026-07-28T19:08:59.2101394Z + [[ -n openshift_nprd_loterias ]]
2026-07-28T19:08:59.2101523Z + [[ openshift_nprd_loterias =~ (okd4|openshift) ]]
2026-07-28T19:08:59.2101682Z + app=sispl-canal-webhook-pix-des
2026-07-28T19:08:59.2101805Z + oc version
2026-07-28T19:08:59.3244076Z oc v3.11.0+0cbc58b
2026-07-28T19:08:59.3244576Z kubernetes v1.11.0+d4cacc0
2026-07-28T19:08:59.3245414Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-28T19:08:59.3384469Z 
2026-07-28T19:08:59.3385180Z Server https://api.nctvmrh001.nuvem.caixa:6443
2026-07-28T19:08:59.3385330Z kubernetes v1.33.12
2026-07-28T19:08:59.3413812Z ++ oc get pod -l name=sispl-canal-webhook-pix-des -n sispl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-28T19:08:59.3414844Z ++ tac
2026-07-28T19:08:59.3415601Z ++ grep -v '^$'
2026-07-28T19:08:59.3423113Z ++ head -n1
2026-07-28T19:08:59.5339049Z + last_pod=sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z
2026-07-28T19:08:59.5339607Z + echo 'Logs do POD: sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z'
2026-07-28T19:08:59.5340335Z + oc logs sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -c sispl-canal-webhook-pix-des -n sispl-des
2026-07-28T19:08:59.5340626Z Logs do POD: sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z
2026-07-28T19:08:59.7760139Z =========================================================================
2026-07-28T19:08:59.7760906Z 
2026-07-28T19:08:59.7761126Z   JBoss Bootstrap Environment
2026-07-28T19:08:59.7761176Z 
2026-07-28T19:08:59.7761274Z   JBOSS_HOME: /opt/jboss
2026-07-28T19:08:59.7761315Z 
2026-07-28T19:08:59.7761416Z   JAVA: /usr/java/latest/bin/java
2026-07-28T19:08:59.7761463Z 
2026-07-28T19:08:59.7763002Z   JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-webhook-pix-des-esteiras
2026-07-28T19:08:59.7763972Z 
2026-07-28T19:08:59.7764100Z =========================================================================
2026-07-28T19:08:59.7764244Z 
2026-07-28T19:08:59.7764566Z [0m16:05:01,429 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.0.Final-redhat-1
2026-07-28T19:08:59.7765201Z [0m[33m16:05:02,012 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
2026-07-28T19:08:59.7765495Z [0m[0m16:05:02,032 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
2026-07-28T19:08:59.7765776Z [0m[0m16:05:02,431 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) starting
2026-07-28T19:08:59.7766122Z [0m[0m16:05:02,605 INFO  [org.jboss.vfs] (MSC service thread 1-4) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
2026-07-28T19:08:59.7766467Z [0m[31m16:05:06,035 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
2026-07-28T19:08:59.7767018Z [0m[0m16:05:06,043 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-28T19:08:59.7767703Z [0m[0m16:05:06,111 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 26) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-28T19:08:59.7768118Z [0m[0m16:05:06,117 INFO  [org.wildfly.security] (ServerService Thread Pool -- 11) ELY00001: WildFly Elytron version 1.1.7.Final-redhat-1
2026-07-28T19:08:59.7768497Z [0m[0m16:05:06,608 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 15) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/55/e351450f83a5286bf1a25b50f12a0e4c74563a/content
2026-07-28T19:08:59.7769015Z [0m[0m16:05:06,656 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 15) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/73/f3f95d33993f968113d1ff268860bbbc737daa/content
2026-07-28T19:08:59.7769656Z [0m[31m16:05:06,807 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Error initializing vault --  org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-DES.keystore)
2026-07-28T19:08:59.7770155Z 	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:93) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7770625Z 	at org.jboss.as.server.services.security.VaultAddHandler.performRuntime(VaultAddHandler.java:84) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7771134Z 	at org.jboss.as.controller.AbstractAddStepHandler.performRuntime(AbstractAddStepHandler.java:337) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7771516Z 	at org.jboss.as.controller.AbstractAddStepHandler$1.execute(AbstractAddStepHandler.java:151) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7771953Z 	at org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:982) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7772346Z 	at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:726) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7772742Z 	at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:450) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7773120Z 	at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1402) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7773481Z 	at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:516) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7773848Z 	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:468) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7774212Z 	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:430) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7774540Z 	at org.jboss.as.server.ServerService.boot(ServerService.java:437) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7774948Z 	at org.jboss.as.server.ServerService.boot(ServerService.java:396) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7775303Z 	at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:370) [wildfly-controller-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7775505Z 	at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_131]
2026-07-28T19:08:59.7775839Z Caused by: org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-DES.keystore)
2026-07-28T19:08:59.7776191Z 	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:210) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
2026-07-28T19:08:59.7776562Z 	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:91) [wildfly-server-3.0.10.Final-redhat-1.jar:3.0.10.Final-redhat-1]
2026-07-28T19:08:59.7776780Z 	... 14 more
2026-07-28T19:08:59.7777033Z Caused by: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vaultcaixa-sispl-DES.keystore)
2026-07-28T19:08:59.7777377Z 	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:691) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
2026-07-28T19:08:59.7777718Z 	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:205) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
2026-07-28T19:08:59.7778021Z 	... 15 more
2026-07-28T19:08:59.7778411Z Caused by: java.io.FileNotFoundException: /opt/jboss/standalone/configuration/vaultcaixa-sispl-DES.keystore (No such file or directory)
2026-07-28T19:08:59.7778628Z 	at java.io.FileInputStream.open0(Native Method) [rt.jar:1.8.0_131]
2026-07-28T19:08:59.7778793Z 	at java.io.FileInputStream.open(FileInputStream.java:195) [rt.jar:1.8.0_131]
2026-07-28T19:08:59.7778970Z 	at java.io.FileInputStream.<init>(FileInputStream.java:138) [rt.jar:1.8.0_131]
2026-07-28T19:08:59.7779267Z 	at org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:150) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
2026-07-28T19:08:59.7779614Z 	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:688) [picketbox-5.0.2.Final-redhat-1.jar:5.0.2.Final-redhat-1]
2026-07-28T19:08:59.7779786Z 	... 16 more
2026-07-28T19:08:59.7779823Z 
2026-07-28T19:08:59.7780103Z [0m[31m16:05:06,814 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
2026-07-28T19:08:59.7780472Z [0m[0m16:05:06,916 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) stopped in 15ms
2026-07-28T19:08:59.7837056Z ##[section]Finishing: Logs da Aplicação
