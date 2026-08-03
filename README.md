-sh-4.2$ oc rsh -c sispl-canal-webhook-pix-tqs sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ tail -n 300 /opt/jboss/standalone/log/server.log | grep -i -E "pix|webhook|exception|error"
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
        elastic.apm.global_labels = deployment=sispl-canal-webhook-pix-tqs-esteiras
        jboss.host.name = sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm
        jboss.node.name = sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm
        jboss.qualified.host.name = sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm
        jboss.server.name = sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm
        sun.net.http.errorstream.enableBuffering = true
2026-08-03 17:24:37,725 DEBUG [org.jboss.as.config] (MSC service thread 1-8) VM Arguments: -D[Standalone] -verbose:gc -Xloggc:/opt/jboss/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-webhook-pix-tqs-esteiras -Dorg.jboss.boot.log.file=/opt/jboss/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss/standalone/configuration/logging.properties
2026-08-03 17:24:41,608 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
sh-4.2$
sh-4.2$
sh-4.2$ tail -f /opt/jboss/standalone/log/server.log
2026-08-03 17:24:41,608 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
2026-08-03 17:24:41,615 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-08-03 17:24:41,702 INFO  [org.wildfly.security] (ServerService Thread Pool -- 26) ELY00001: WildFly Elytron version 1.1.7.Final-redhat-1
2026-08-03 17:24:41,705 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 4) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-08-03 17:24:42,356 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 5) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/55/e351450f83a5286bf1a25b50f12a0e4c74563a/content
2026-08-03 17:24:42,410 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 5) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/73/f3f95d33993f968113d1ff268860bbbc737daa/content
2026-08-03 17:24:42,924 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
2026-08-03 17:24:42,938 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-08-03 17:24:43,002 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.5.4.Final-redhat-1
2026-08-03 17:24:43,007 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.5.4.Final-redhat-1
^C
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ curl -v telnet://<host-sispl-api>:<porta> --connect-timeout 3
sh: host-sispl-api: No such file or directory
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ curl -v -m 5 https://<host-que-deveria-notificar>/healthcheck
sh: host-que-deveria-notificar: No such file or directory
sh-4.2$
sh-4.2$
sh-4.2$
