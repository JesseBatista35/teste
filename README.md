
Pod
P
simcn-backend-des-256-kkm8d
Running



=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Sep 24, 2026 2:44:11 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
[0m14:44:11,688 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m14:44:12,207 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m14:44:12,222 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m14:44:12,448 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m14:44:12,594 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0mWARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.wildfly.extension.elytron.SSLDefinitions (jar:file:/opt/jboss/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.11.CP/org/wildfly/extension/elytron/main/wildfly-elytron-integration-15.0.26.Final-redhat-00001.jar!/) to method com.sun.net.ssl.internal.ssl.Provider.isFIPS()
WARNING: Please consider reporting this to the maintainers of org.wildfly.extension.elytron.SSLDefinitions
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[0m14:44:14,622 INFO  [org.wildfly.security] (ServerService Thread Pool -- 25) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[33m14:44:14,952 WARN  [org.jboss.as.clustering.infinispan] (Controller Boot Thread) WFLYCLINF0004: The 'strategy' attribute of the 'eviction' element is no longer supported and will be ignored
[0m[33m14:44:14,953 WARN  [org.jboss.as.clustering.infinispan] (Controller Boot Thread) WFLYCLINF0004: The 'strategy' attribute of the 'eviction' element is no longer supported and will be ignored
[0m[0m14:44:15,012 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 30) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m14:44:15,358 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m14:44:15,375 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 17) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m14:44:15,655 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 8) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/d4/eb0b58b0edc4d347e594672cd0bb933fb909e1/content
[0m[0m14:44:15,681 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m14:44:15,720 INFO  [org.xnio] (MSC service thread 1-4) XNIO version 3.8.9.Final-redhat-00001
[0m[0m14:44:15,738 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 43) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m14:44:15,741 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 59) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m14:44:15,782 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 51) WFLYNAM0001: Activating Naming Subsystem
[0m[0m14:44:15,782 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 58) WFLYSEC0002: Activating Security Subsystem
[0m[0m14:44:15,785 INFO  [org.jboss.as.security] (MSC service thread 1-3) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m14:44:15,786 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 61) WFLYWS0002: Activating WebServices Extension
[0m[0m14:44:15,787 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 49) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m14:44:15,790 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m14:44:15,886 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 44) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m14:44:15,890 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m14:44:15,981 INFO  [org.xnio.nio] (MSC service thread 1-4) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[33m14:44:15,988 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 60) WFLYCLWEBUT0007: No routing provider found for default-server; using legacy provider based on static configuration
[0m[0m14:44:16,083 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 42) WFLYIO001: Worker 'default' has auto-configured to 4 IO threads with 32 max task threads based on your 2 available processors
[0m[0m14:44:16,091 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.driver.OracleDriver (version 12.1)
[0m[0m14:44:16,102 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m14:44:16,104 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 60) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m14:44:16,197 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m14:44:16,198 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m14:44:16,199 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Starting Naming Service
[0m[0m14:44:16,205 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m14:44:16,285 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m14:44:16,295 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 32 (per class), which is derived from thread worker pool sizing.
[0m[0m14:44:16,295 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 8 (per class), which is derived from the number of CPUs on this host.
[0m[0m14:44:16,400 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m[0m14:44:16,414 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
[0m[0m14:44:16,415 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
[0m[0m14:44:16,486 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m14:44:16,502 INFO  [org.jboss.as.patching] (MSC service thread 1-3) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[0m14:44:16,505 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[33m14:44:16,620 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-4) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m14:44:16,622 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m14:44:16,629 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "simcn-backend.ear" (runtime-name: "simcn-backend.ear")
[0m[0m14:44:16,722 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
[0m[0m14:44:16,781 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:/jdbc/OracleSimcnDS]
[0m[0m14:44:16,792 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m14:44:16,903 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[33m14:44:18,885 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry ../owm/jlib/owm-3_0.jar in /content/simcn-backend.ear/lib/oraclepki.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m14:44:18,885 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry owm-3_0.jar in /content/simcn-backend.ear/lib/oraclepki.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m14:44:18,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry ../../ldap/jlib/osdt_core.jar in /content/simcn-backend.ear/lib/oraclepki.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m14:44:18,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry ../../ldap/jlib/osdt_cert.jar in /content/simcn-backend.ear/lib/oraclepki.jar  does not point to a valid jar for a Class-Path reference.
[0m[0m14:44:18,901 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Starting subdeployment (runtime-name: "simcn-api.war")
[0m[0m14:44:18,901 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Starting subdeployment (runtime-name: "simcn-ejb.jar")
[0m[33m14:44:18,903 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/simcn-backend.ear/simcn-ejb.jar/META-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
[0m[0m14:44:19,415 INFO  [org.jboss.as.jpa] (MSC service thread 1-4) WFLYJPA0002: Read persistence.xml for SimcnPU
[0m[0m14:44:19,703 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for simcn-backend.ear/simcn-ejb.jar#SimcnPU
[0m[0m14:44:19,791 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment simcn-backend.ear
[0m[0m14:44:19,917 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m14:44:20,198 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 64) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
[0m[0m14:44:20,296 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 65) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'simcn-backend.ear/simcn-ejb.jar#SimcnPU'
[0m[0m14:44:20,315 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment simcn-ejb.jar
[0m[0m14:44:20,317 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m14:44:20,318 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m14:44:20,413 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 65) HHH000204: Processing PersistenceUnitInfo [
	name: SimcnPU
	...]
[0m[0m14:44:20,414 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioConciliacaoService' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/RelatorioConciliacaoService!br.gov.caixa.bsb.simcn.service.RelatorioConciliacaoService
	java:app/simcn-ejb/RelatorioConciliacaoService!br.gov.caixa.bsb.simcn.service.RelatorioConciliacaoService
	java:module/RelatorioConciliacaoService!br.gov.caixa.bsb.simcn.service.RelatorioConciliacaoService
	java:global/simcn-backend/simcn-ejb/RelatorioConciliacaoService
	java:app/simcn-ejb/RelatorioConciliacaoService
	java:module/RelatorioConciliacaoService

[0m[0m14:44:20,414 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroSubcontaProdutoDao' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/ParametroSubcontaProdutoDao!br.gov.caixa.bsb.simcn.dao.saldos.ParametroSubcontaProdutoDao
	java:app/simcn-ejb/ParametroSubcontaProdutoDao!br.gov.caixa.bsb.simcn.dao.saldos.ParametroSubcontaProdutoDao
	java:module/ParametroSubcontaProdutoDao!br.gov.caixa.bsb.simcn.dao.saldos.ParametroSubcontaProdutoDao
	java:global/simcn-backend/simcn-ejb/ParametroSubcontaProdutoDao
	java:app/simcn-ejb/ParametroSubcontaProdutoDao
	java:module/ParametroSubcontaProdutoDao

[0m[0m14:44:20,414 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GeradorRelatoriosSchedule' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/GeradorRelatoriosSchedule!br.gov.caixa.bsb.simcn.schedule.GeradorRelatoriosSchedule
	java:app/simcn-ejb/GeradorRelatoriosSchedule!br.gov.caixa.bsb.simcn.schedule.GeradorRelatoriosSchedule
	java:module/GeradorRelatoriosSchedule!br.gov.caixa.bsb.simcn.schedule.GeradorRelatoriosSchedule
	java:global/simcn-backend/simcn-ejb/GeradorRelatoriosSchedule
	java:app/simcn-ejb/GeradorRelatoriosSchedule
	java:module/GeradorRelatoriosSchedule

[0m[0m14:44:20,414 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioGerencialBatimentoSchedule' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/RelatorioGerencialBatimentoSchedule!br.gov.caixa.bsb.simcn.schedule.RelatorioGerencialBatimentoSchedule
	java:app/simcn-ejb/RelatorioGerencialBatimentoSchedule!br.gov.caixa.bsb.simcn.schedule.RelatorioGerencialBatimentoSchedule
	java:module/RelatorioGerencialBatimentoSchedule!br.gov.caixa.bsb.simcn.schedule.RelatorioGerencialBatimentoSchedule
	java:global/simcn-backend/simcn-ejb/RelatorioGerencialBatimentoSchedule
	java:app/simcn-ejb/RelatorioGerencialBatimentoSchedule
	java:module/RelatorioGerencialBatimentoSchedule

[0m[0m14:44:20,414 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AcompanhamentoSubcontaProdutoSchedule' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/AcompanhamentoSubcontaProdutoSchedule!br.gov.caixa.bsb.simcn.schedule.AcompanhamentoSubcontaProdutoSchedule
	java:app/simcn-ejb/AcompanhamentoSubcontaProdutoSchedule!br.gov.caixa.bsb.simcn.schedule.AcompanhamentoSubcontaProdutoSchedule
	java:module/AcompanhamentoSubcontaProdutoSchedule!br.gov.caixa.bsb.simcn.schedule.AcompanhamentoSubcontaProdutoSchedule
	java:global/simcn-backend/simcn-ejb/AcompanhamentoSubcontaProdutoSchedule
	java:app/simcn-ejb/AcompanhamentoSubcontaProdutoSchedule
	java:module/AcompanhamentoSubcontaProdutoSchedule

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProcessarArquivoService' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/ProcessarArquivoService!br.gov.caixa.bsb.simcn.service.conciliacao.ProcessarArquivoService
	java:app/simcn-ejb/ProcessarArquivoService!br.gov.caixa.bsb.simcn.service.conciliacao.ProcessarArquivoService
	java:module/ProcessarArquivoService!br.gov.caixa.bsb.simcn.service.conciliacao.ProcessarArquivoService
	java:global/simcn-backend/simcn-ejb/ProcessarArquivoService
	java:app/simcn-ejb/ProcessarArquivoService
	java:module/ProcessarArquivoService

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConciliacaoIncoerenciaLoteService' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/ConciliacaoIncoerenciaLoteService!br.gov.caixa.bsb.simcn.service.conciliacao.ConciliacaoIncoerenciaLoteService
	java:app/simcn-ejb/ConciliacaoIncoerenciaLoteService!br.gov.caixa.bsb.simcn.service.conciliacao.ConciliacaoIncoerenciaLoteService
	java:module/ConciliacaoIncoerenciaLoteService!br.gov.caixa.bsb.simcn.service.conciliacao.ConciliacaoIncoerenciaLoteService
	java:global/simcn-backend/simcn-ejb/ConciliacaoIncoerenciaLoteService
	java:app/simcn-ejb/ConciliacaoIncoerenciaLoteService
	java:module/ConciliacaoIncoerenciaLoteService

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SimcnStartupListener' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/SimcnStartupListener!br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener
	java:app/simcn-ejb/SimcnStartupListener!br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener
	java:module/SimcnStartupListener!br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener
	java:global/simcn-backend/simcn-ejb/SimcnStartupListener
	java:app/simcn-ejb/SimcnStartupListener
	java:module/SimcnStartupListener

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoIncoerenciaService' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/TipoIncoerenciaService!br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService
	java:app/simcn-ejb/TipoIncoerenciaService!br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService
	java:module/TipoIncoerenciaService!br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService
	java:global/simcn-backend/simcn-ejb/TipoIncoerenciaService
	java:app/simcn-ejb/TipoIncoerenciaService
	java:module/TipoIncoerenciaService

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoStreamService' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/ArquivoStreamService!br.gov.caixa.bsb.simcn.service.ArquivoStreamService
	java:app/simcn-ejb/ArquivoStreamService!br.gov.caixa.bsb.simcn.service.ArquivoStreamService
	java:module/ArquivoStreamService!br.gov.caixa.bsb.simcn.service.ArquivoStreamService
	java:global/simcn-backend/simcn-ejb/ArquivoStreamService
	java:app/simcn-ejb/ArquivoStreamService
	java:module/ArquivoStreamService

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TesterDAO' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/TesterDAO!br.gov.caixa.bsb.simcn.tester.TesterDAO
	java:app/simcn-ejb/TesterDAO!br.gov.caixa.bsb.simcn.tester.TesterDAO
	java:module/TesterDAO!br.gov.caixa.bsb.simcn.tester.TesterDAO
	java:global/simcn-backend/simcn-ejb/TesterDAO
	java:app/simcn-ejb/TesterDAO
	java:module/TesterDAO

[0m[0m14:44:20,415 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConciliacaoAutomaticaSchedule' in deployment unit 'subdeployment "simcn-ejb.jar" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-ejb/ConciliacaoAutomaticaSchedule!br.gov.caixa.bsb.simcn.schedule.ConciliacaoAutomaticaSchedule
	java:app/simcn-ejb/ConciliacaoAutomaticaSchedule!br.gov.caixa.bsb.simcn.schedule.ConciliacaoAutomaticaSchedule
	java:module/ConciliacaoAutomaticaSchedule!br.gov.caixa.bsb.simcn.schedule.ConciliacaoAutomaticaSchedule
	java:global/simcn-backend/simcn-ejb/ConciliacaoAutomaticaSchedule
	java:app/simcn-ejb/ConciliacaoAutomaticaSchedule
	java:module/ConciliacaoAutomaticaSchedule

[0m[0m14:44:20,502 INFO  [org.jboss.keycloak] (MSC service thread 1-3) Keycloak subsystem override for deployment simcn-api.war
[0m[0m14:44:20,502 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processing weld deployment simcn-api.war
[0m[0m14:44:20,508 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoSubcontaProdutoService' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ParametrizacaoSubcontaProdutoService!br.gov.caixa.bsb.simcn.service.saldos.ParametrizacaoSubcontaProdutoService
	java:app/simcn-api/ParametrizacaoSubcontaProdutoService!br.gov.caixa.bsb.simcn.service.saldos.ParametrizacaoSubcontaProdutoService
	java:module/ParametrizacaoSubcontaProdutoService!br.gov.caixa.bsb.simcn.service.saldos.ParametrizacaoSubcontaProdutoService
	java:global/simcn-backend/simcn-api/ParametrizacaoSubcontaProdutoService
	java:app/simcn-api/ParametrizacaoSubcontaProdutoService
	java:module/ParametrizacaoSubcontaProdutoService

[0m[0m14:44:20,508 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'CockpitController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/CockpitController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.CockpitController
	java:app/simcn-api/CockpitController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.CockpitController
	java:module/CockpitController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.CockpitController
	java:global/simcn-backend/simcn-api/CockpitController
	java:app/simcn-api/CockpitController
	java:module/CockpitController

[0m[0m14:44:20,508 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosLegadosController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/RelatoriosLegadosController!br.gov.caixa.bsb.simcn.rest.RelatoriosLegadosController
	java:app/simcn-api/RelatoriosLegadosController!br.gov.caixa.bsb.simcn.rest.RelatoriosLegadosController
	java:module/RelatoriosLegadosController!br.gov.caixa.bsb.simcn.rest.RelatoriosLegadosController
	java:global/simcn-backend/simcn-api/RelatoriosLegadosController
	java:app/simcn-api/RelatoriosLegadosController
	java:module/RelatoriosLegadosController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'VisaoBalanceteController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/VisaoBalanceteController!br.gov.caixa.bsb.simcn.rest.relatorios.VisaoBalanceteController
	java:app/simcn-api/VisaoBalanceteController!br.gov.caixa.bsb.simcn.rest.relatorios.VisaoBalanceteController
	java:module/VisaoBalanceteController!br.gov.caixa.bsb.simcn.rest.relatorios.VisaoBalanceteController
	java:global/simcn-backend/simcn-api/VisaoBalanceteController
	java:app/simcn-api/VisaoBalanceteController
	java:module/VisaoBalanceteController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoCosifController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ParametrizacaoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoCosifController
	java:app/simcn-api/ParametrizacaoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoCosifController
	java:module/ParametrizacaoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoCosifController
	java:global/simcn-backend/simcn-api/ParametrizacaoCosifController
	java:app/simcn-api/ParametrizacaoCosifController
	java:module/ParametrizacaoCosifController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ConciliacaoManualController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ConciliacaoManualController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoManualController
	java:app/simcn-api/ConciliacaoManualController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoManualController
	java:module/ConciliacaoManualController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoManualController
	java:global/simcn-backend/simcn-api/ConciliacaoManualController
	java:app/simcn-api/ConciliacaoManualController
	java:module/ConciliacaoManualController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'BatimentoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/BatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.BatimentoController
	java:app/simcn-api/BatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.BatimentoController
	java:module/BatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.BatimentoController
	java:global/simcn-backend/simcn-api/BatimentoController
	java:app/simcn-api/BatimentoController
	java:module/BatimentoController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'DominioController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/DominioController!br.gov.caixa.bsb.simcn.rest.dominio.DominioController
	java:app/simcn-api/DominioController!br.gov.caixa.bsb.simcn.rest.dominio.DominioController
	java:module/DominioController!br.gov.caixa.bsb.simcn.rest.dominio.DominioController
	java:global/simcn-backend/simcn-api/DominioController
	java:app/simcn-api/DominioController
	java:module/DominioController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioConciliacaoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/RelatorioConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.RelatorioConciliacaoController
	java:app/simcn-api/RelatorioConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.RelatorioConciliacaoController
	java:module/RelatorioConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.RelatorioConciliacaoController
	java:global/simcn-backend/simcn-api/RelatorioConciliacaoController
	java:app/simcn-api/RelatorioConciliacaoController
	java:module/RelatorioConciliacaoController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametrosGestorController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ParametrosGestorController!br.gov.caixa.bsb.simcn.rest.administrativo.ParametrosGestorController
	java:app/simcn-api/ParametrosGestorController!br.gov.caixa.bsb.simcn.rest.administrativo.ParametrosGestorController
	java:module/ParametrosGestorController!br.gov.caixa.bsb.simcn.rest.administrativo.ParametrosGestorController
	java:global/simcn-backend/simcn-api/ParametrosGestorController
	java:app/simcn-api/ParametrosGestorController
	java:module/ParametrosGestorController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'EstatisticaConciliadosController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/EstatisticaConciliadosController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaConciliadosController
	java:app/simcn-api/EstatisticaConciliadosController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaConciliadosController
	java:module/EstatisticaConciliadosController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaConciliadosController
	java:global/simcn-backend/simcn-api/EstatisticaConciliadosController
	java:app/simcn-api/EstatisticaConciliadosController
	java:module/EstatisticaConciliadosController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'MensagemAvisoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/MensagemAvisoController!br.gov.caixa.bsb.simcn.rest.MensagemAvisoController
	java:app/simcn-api/MensagemAvisoController!br.gov.caixa.bsb.simcn.rest.MensagemAvisoController
	java:module/MensagemAvisoController!br.gov.caixa.bsb.simcn.rest.MensagemAvisoController
	java:global/simcn-backend/simcn-api/MensagemAvisoController
	java:app/simcn-api/MensagemAvisoController
	java:module/MensagemAvisoController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/RelatoriosController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.RelatoriosController
	java:app/simcn-api/RelatoriosController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.RelatoriosController
	java:module/RelatoriosController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.RelatoriosController
	java:global/simcn-backend/simcn-api/RelatoriosController
	java:app/simcn-api/RelatoriosController
	java:module/RelatoriosController

[0m[0m14:44:20,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'FuncionalidadesController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/FuncionalidadesController!br.gov.caixa.bsb.simcn.rest.FuncionalidadesController
	java:app/simcn-api/FuncionalidadesController!br.gov.caixa.bsb.simcn.rest.FuncionalidadesController
	java:module/FuncionalidadesController!br.gov.caixa.bsb.simcn.rest.FuncionalidadesController
	java:global/simcn-backend/simcn-api/FuncionalidadesController
	java:app/simcn-api/FuncionalidadesController
	java:module/FuncionalidadesController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'DinamicoRegistrosPendentesController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/DinamicoRegistrosPendentesController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.DinamicoRegistrosPendentesController
	java:app/simcn-api/DinamicoRegistrosPendentesController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.DinamicoRegistrosPendentesController
	java:module/DinamicoRegistrosPendentesController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.DinamicoRegistrosPendentesController
	java:global/simcn-backend/simcn-api/DinamicoRegistrosPendentesController
	java:app/simcn-api/DinamicoRegistrosPendentesController
	java:module/DinamicoRegistrosPendentesController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ConciliacaoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoController
	java:app/simcn-api/ConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoController
	java:module/ConciliacaoController!br.gov.caixa.bsb.simcn.rest.conciliacao.ConciliacaoController
	java:global/simcn-backend/simcn-api/ConciliacaoController
	java:app/simcn-api/ConciliacaoController
	java:module/ConciliacaoController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'VincularRelatorioServidorController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/VincularRelatorioServidorController!br.gov.caixa.bsb.simcn.rest.VincularRelatorioServidorController
	java:app/simcn-api/VincularRelatorioServidorController!br.gov.caixa.bsb.simcn.rest.VincularRelatorioServidorController
	java:module/VincularRelatorioServidorController!br.gov.caixa.bsb.simcn.rest.VincularRelatorioServidorController
	java:global/simcn-backend/simcn-api/VincularRelatorioServidorController
	java:app/simcn-api/VincularRelatorioServidorController
	java:module/VincularRelatorioServidorController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'InformacoesOperacionaisController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/InformacoesOperacionaisController!br.gov.caixa.bsb.simcn.rest.batimento.InformacoesOperacionaisController
	java:app/simcn-api/InformacoesOperacionaisController!br.gov.caixa.bsb.simcn.rest.batimento.InformacoesOperacionaisController
	java:module/InformacoesOperacionaisController!br.gov.caixa.bsb.simcn.rest.batimento.InformacoesOperacionaisController
	java:global/simcn-backend/simcn-api/InformacoesOperacionaisController
	java:app/simcn-api/InformacoesOperacionaisController
	java:module/InformacoesOperacionaisController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'EntidadeController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/EntidadeController!br.gov.caixa.bsb.simcn.rest.EntidadeController
	java:app/simcn-api/EntidadeController!br.gov.caixa.bsb.simcn.rest.EntidadeController
	java:module/EntidadeController!br.gov.caixa.bsb.simcn.rest.EntidadeController
	java:global/simcn-backend/simcn-api/EntidadeController
	java:app/simcn-api/EntidadeController
	java:module/EntidadeController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AcompanhamentoBatimentoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/AcompanhamentoBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.AcompanhamentoBatimentoController
	java:app/simcn-api/AcompanhamentoBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.AcompanhamentoBatimentoController
	java:module/AcompanhamentoBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.AcompanhamentoBatimentoController
	java:global/simcn-backend/simcn-api/AcompanhamentoBatimentoController
	java:app/simcn-api/AcompanhamentoBatimentoController
	java:module/AcompanhamentoBatimentoController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ConfiguracoesController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ConfiguracoesController!br.gov.caixa.bsb.simcn.rest.ConfiguracoesController
	java:app/simcn-api/ConfiguracoesController!br.gov.caixa.bsb.simcn.rest.ConfiguracoesController
	java:module/ConfiguracoesController!br.gov.caixa.bsb.simcn.rest.ConfiguracoesController
	java:global/simcn-backend/simcn-api/ConfiguracoesController
	java:app/simcn-api/ConfiguracoesController
	java:module/ConfiguracoesController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioGerencialController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/RelatorioGerencialController!br.gov.caixa.bsb.simcn.rest.RelatorioGerencialController
	java:app/simcn-api/RelatorioGerencialController!br.gov.caixa.bsb.simcn.rest.RelatorioGerencialController
	java:module/RelatorioGerencialController!br.gov.caixa.bsb.simcn.rest.RelatorioGerencialController
	java:global/simcn-backend/simcn-api/RelatorioGerencialController
	java:app/simcn-api/RelatorioGerencialController
	java:module/RelatorioGerencialController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ItemConhecimentoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ItemConhecimentoController!br.gov.caixa.bsb.simcn.rest.ItemConhecimentoController
	java:app/simcn-api/ItemConhecimentoController!br.gov.caixa.bsb.simcn.rest.ItemConhecimentoController
	java:module/ItemConhecimentoController!br.gov.caixa.bsb.simcn.rest.ItemConhecimentoController
	java:global/simcn-backend/simcn-api/ItemConhecimentoController
	java:app/simcn-api/ItemConhecimentoController
	java:module/ItemConhecimentoController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametroBatimentoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ParametroBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.ParametroBatimentoController
	java:app/simcn-api/ParametroBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.ParametroBatimentoController
	java:module/ParametroBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.ParametroBatimentoController
	java:global/simcn-backend/simcn-api/ParametroBatimentoController
	java:app/simcn-api/ParametroBatimentoController
	java:module/ParametroBatimentoController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoSubcontaProdutoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/ParametrizacaoSubcontaProdutoController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoSubcontaProdutoController
	java:app/simcn-api/ParametrizacaoSubcontaProdutoController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoSubcontaProdutoController
	java:module/ParametrizacaoSubcontaProdutoController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.ParametrizacaoSubcontaProdutoController
	java:global/simcn-backend/simcn-api/ParametrizacaoSubcontaProdutoController
	java:app/simcn-api/ParametrizacaoSubcontaProdutoController
	java:module/ParametrizacaoSubcontaProdutoController

[0m[0m14:44:20,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioBatimentoController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/RelatorioBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.RelatorioBatimentoController
	java:app/simcn-api/RelatorioBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.RelatorioBatimentoController
	java:module/RelatorioBatimentoController!br.gov.caixa.bsb.simcn.rest.batimento.RelatorioBatimentoController
	java:global/simcn-backend/simcn-api/RelatorioBatimentoController
	java:app/simcn-api/RelatorioBatimentoController
	java:module/RelatorioBatimentoController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'OgpController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/OgpController!br.gov.caixa.bsb.simcn.rest.conciliacao.OgpController
	java:app/simcn-api/OgpController!br.gov.caixa.bsb.simcn.rest.conciliacao.OgpController
	java:module/OgpController!br.gov.caixa.bsb.simcn.rest.conciliacao.OgpController
	java:global/simcn-backend/simcn-api/OgpController
	java:app/simcn-api/OgpController
	java:module/OgpController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TesterController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/TesterController!br.gov.caixa.bsb.simcn.tester.TesterController
	java:app/simcn-api/TesterController!br.gov.caixa.bsb.simcn.tester.TesterController
	java:module/TesterController!br.gov.caixa.bsb.simcn.tester.TesterController
	java:global/simcn-backend/simcn-api/TesterController
	java:app/simcn-api/TesterController
	java:module/TesterController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'SaldoSubcontaController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/SaldoSubcontaController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoSubcontaController
	java:app/simcn-api/SaldoSubcontaController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoSubcontaController
	java:module/SaldoSubcontaController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoSubcontaController
	java:global/simcn-backend/simcn-api/SaldoSubcontaController
	java:app/simcn-api/SaldoSubcontaController
	java:module/SaldoSubcontaController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'SaldoCosifController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/SaldoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoCosifController
	java:app/simcn-api/SaldoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoCosifController
	java:module/SaldoCosifController!br.gov.caixa.bsb.simcn.rest.incoerencia.saldo.SaldoCosifController
	java:global/simcn-backend/simcn-api/SaldoCosifController
	java:app/simcn-api/SaldoCosifController
	java:module/SaldoCosifController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'CopiaRegistroSinafController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/CopiaRegistroSinafController!br.gov.caixa.bsb.simcn.rest.administrativo.CopiaRegistroSinafController
	java:app/simcn-api/CopiaRegistroSinafController!br.gov.caixa.bsb.simcn.rest.administrativo.CopiaRegistroSinafController
	java:module/CopiaRegistroSinafController!br.gov.caixa.bsb.simcn.rest.administrativo.CopiaRegistroSinafController
	java:global/simcn-backend/simcn-api/CopiaRegistroSinafController
	java:app/simcn-api/CopiaRegistroSinafController
	java:module/CopiaRegistroSinafController

[0m[0m14:44:20,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'EstatisticaController' in deployment unit 'subdeployment "simcn-api.war" of deployment "simcn-backend.ear"' are as follows:

	java:global/simcn-backend/simcn-api/EstatisticaController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaController
	java:app/simcn-api/EstatisticaController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaController
	java:module/EstatisticaController!br.gov.caixa.bsb.simcn.rest.relatorios.conciliacao.EstatisticaController
	java:global/simcn-backend/simcn-api/EstatisticaController
	java:app/simcn-api/EstatisticaController
	java:module/EstatisticaController

[0m[0m14:44:20,589 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 64) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m14:44:20,620 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 65) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
[0m[0m14:44:20,621 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 65) HHH000206: hibernate.properties not found
[0m[0m14:44:20,687 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m14:44:20,705 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.2)
[0m[0m14:44:20,797 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 3.1.6 (redhat)
[0m[0m14:44:20,816 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = simcn-backend.ear_oracle.jdbc.OracleDriver_11_2
[0m[0m14:44:20,816 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = simcn-backend.ear_org.h2.Driver_1_4
[0m[0m14:44:20,816 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = simcn-backend.ear
[0m[0m14:44:21,008 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[33m14:44:21,011 WARN  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService should not have a final or static method (recuperarCacheTiposIncoerenciasCosif)
[0m[33m14:44:21,011 WARN  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService should not have a final or static method (recuperarCacheTiposIncoerenciasSubconta)
[0m[0m14:44:21,087 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Second level cache enabled for simcn-backend.ear/simcn-ejb.jar#SimcnPU
[0m[33m14:44:21,118 WARN  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.simcn.rest.conciliacao.RelatorioConciliacaoController should not have a final or static method (montarFiltros)
[0m[0m14:44:21,184 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 65) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[32m14:44:21,203 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration boolean -> org.hibernate.type.BooleanType@72e2d0e8
[0m[32m14:44:21,203 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration boolean -> org.hibernate.type.BooleanType@72e2d0e8
[0m[32m14:44:21,203 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Boolean -> org.hibernate.type.BooleanType@72e2d0e8
[0m[32m14:44:21,204 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration numeric_boolean -> org.hibernate.type.NumericBooleanType@6683a352
[0m[32m14:44:21,204 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration true_false -> org.hibernate.type.TrueFalseType@7a85cc83
[0m[32m14:44:21,204 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration yes_no -> org.hibernate.type.YesNoType@79d79686
[0m[32m14:44:21,204 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration byte -> org.hibernate.type.ByteType@38051024
[0m[32m14:44:21,205 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration byte -> org.hibernate.type.ByteType@38051024
[0m[32m14:44:21,205 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Byte -> org.hibernate.type.ByteType@38051024
[0m[32m14:44:21,205 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration character -> org.hibernate.type.CharacterType@6875274d
[0m[32m14:44:21,205 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration char -> org.hibernate.type.CharacterType@6875274d
[0m[32m14:44:21,205 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Character -> org.hibernate.type.CharacterType@6875274d
[0m[32m14:44:21,206 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration short -> org.hibernate.type.ShortType@59b135df
[0m[32m14:44:21,206 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration short -> org.hibernate.type.ShortType@59b135df
[0m[32m14:44:21,206 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Short -> org.hibernate.type.ShortType@59b135df
[0m[32m14:44:21,206 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration integer -> org.hibernate.type.IntegerType@6ccbae8a
[0m[32m14:44:21,206 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration int -> org.hibernate.type.IntegerType@6ccbae8a
[0m[32m14:44:21,207 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Integer -> org.hibernate.type.IntegerType@6ccbae8a
[0m[32m14:44:21,207 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration long -> org.hibernate.type.LongType@31df7472
[0m[32m14:44:21,207 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration long -> org.hibernate.type.LongType@31df7472
[0m[32m14:44:21,207 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Long -> org.hibernate.type.LongType@31df7472
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration float -> org.hibernate.type.FloatType@41243f84
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration float -> org.hibernate.type.FloatType@41243f84
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Float -> org.hibernate.type.FloatType@41243f84
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration double -> org.hibernate.type.DoubleType@6d94e96a
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration double -> org.hibernate.type.DoubleType@6d94e96a
[0m[32m14:44:21,208 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Double -> org.hibernate.type.DoubleType@6d94e96a
[0m[32m14:44:21,209 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration big_decimal -> org.hibernate.type.BigDecimalType@7f6b780
[0m[32m14:44:21,209 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.math.BigDecimal -> org.hibernate.type.BigDecimalType@7f6b780
[0m[32m14:44:21,209 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration big_integer -> org.hibernate.type.BigIntegerType@6870ea12
[0m[32m14:44:21,209 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.math.BigInteger -> org.hibernate.type.BigIntegerType@6870ea12
[0m[32m14:44:21,210 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration string -> org.hibernate.type.StringType@76a440d5
[0m[32m14:44:21,210 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.String -> org.hibernate.type.StringType@76a440d5
[0m[32m14:44:21,210 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration nstring -> org.hibernate.type.StringNVarcharType@73cb1d6
[0m[32m14:44:21,210 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration ncharacter -> org.hibernate.type.CharacterNCharType@2c2e329b
[0m[32m14:44:21,211 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration url -> org.hibernate.type.UrlType@ea3ecfa
[0m[32m14:44:21,211 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.net.URL -> org.hibernate.type.UrlType@ea3ecfa
[0m[32m14:44:21,211 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration Duration -> org.hibernate.type.DurationType@215fec5d
[0m[32m14:44:21,211 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.Duration -> org.hibernate.type.DurationType@215fec5d
[0m[32m14:44:21,212 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration Instant -> org.hibernate.type.InstantType@35498cd2
[0m[32m14:44:21,212 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.Instant -> org.hibernate.type.InstantType@35498cd2
[0m[32m14:44:21,212 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration LocalDateTime -> org.hibernate.type.LocalDateTimeType@6f561df2
[0m[32m14:44:21,212 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.LocalDateTime -> org.hibernate.type.LocalDateTimeType@6f561df2
[0m[32m14:44:21,213 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration LocalDate -> org.hibernate.type.LocalDateType@256b09c9
[0m[32m14:44:21,213 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.LocalDate -> org.hibernate.type.LocalDateType@256b09c9
[0m[32m14:44:21,214 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration LocalTime -> org.hibernate.type.LocalTimeType@75c05138
[0m[32m14:44:21,214 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.LocalTime -> org.hibernate.type.LocalTimeType@75c05138
[0m[32m14:44:21,214 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration OffsetDateTime -> org.hibernate.type.OffsetDateTimeType@352036d7
[0m[32m14:44:21,214 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.OffsetDateTime -> org.hibernate.type.OffsetDateTimeType@352036d7
[0m[32m14:44:21,215 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration OffsetTime -> org.hibernate.type.OffsetTimeType@ede49e7
[0m[32m14:44:21,215 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.OffsetTime -> org.hibernate.type.OffsetTimeType@ede49e7
[0m[32m14:44:21,216 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration ZonedDateTime -> org.hibernate.type.ZonedDateTimeType@19dbe390
[0m[32m14:44:21,216 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.time.ZonedDateTime -> org.hibernate.type.ZonedDateTimeType@19dbe390
[0m[32m14:44:21,216 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration date -> org.hibernate.type.DateType@238494d9
[0m[32m14:44:21,216 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.Date -> org.hibernate.type.DateType@238494d9
[0m[32m14:44:21,217 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration time -> org.hibernate.type.TimeType@f33fec4
[0m[32m14:44:21,217 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.Time -> org.hibernate.type.TimeType@f33fec4
[0m[32m14:44:21,217 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration timestamp -> org.hibernate.type.TimestampType@6d402ba7
[0m[32m14:44:21,218 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.Timestamp -> org.hibernate.type.TimestampType@6d402ba7
[0m[32m14:44:21,218 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.Date -> org.hibernate.type.TimestampType@6d402ba7
[0m[32m14:44:21,218 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration dbtimestamp -> org.hibernate.type.DbTimestampType@30745fbd
[0m[32m14:44:21,219 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration calendar -> org.hibernate.type.CalendarType@2ffa990f
[0m[32m14:44:21,219 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.Calendar -> org.hibernate.type.CalendarType@2ffa990f
[0m[32m14:44:21,219 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.GregorianCalendar -> org.hibernate.type.CalendarType@2ffa990f
[0m[32m14:44:21,219 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration calendar_date -> org.hibernate.type.CalendarDateType@504efe92
[0m[32m14:44:21,219 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration locale -> org.hibernate.type.LocaleType@51d0f8f3
[0m[32m14:44:21,220 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.Locale -> org.hibernate.type.LocaleType@51d0f8f3
[0m[32m14:44:21,220 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration currency -> org.hibernate.type.CurrencyType@52b32593
[0m[32m14:44:21,220 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.Currency -> org.hibernate.type.CurrencyType@52b32593
[0m[32m14:44:21,220 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration timezone -> org.hibernate.type.TimeZoneType@39125dd5
[0m[32m14:44:21,220 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.TimeZone -> org.hibernate.type.TimeZoneType@39125dd5
[0m[32m14:44:21,221 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration class -> org.hibernate.type.ClassType@3203c715
[0m[32m14:44:21,221 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Class -> org.hibernate.type.ClassType@3203c715
[0m[32m14:44:21,221 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration uuid-binary -> org.hibernate.type.UUIDBinaryType@10f2f01
[0m[32m14:44:21,221 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.util.UUID -> org.hibernate.type.UUIDBinaryType@10f2f01
[0m[32m14:44:21,222 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration uuid-char -> org.hibernate.type.UUIDCharType@751a2636
[0m[32m14:44:21,222 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration binary -> org.hibernate.type.BinaryType@28c3eb92
[0m[32m14:44:21,222 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration byte[] -> org.hibernate.type.BinaryType@28c3eb92
[0m[32m14:44:21,280 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [B -> org.hibernate.type.BinaryType@28c3eb92
[0m[32m14:44:21,281 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration wrapper-binary -> org.hibernate.type.WrapperBinaryType@167205ee
[0m[32m14:44:21,282 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration Byte[] -> org.hibernate.type.WrapperBinaryType@167205ee
[0m[32m14:44:21,282 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [Ljava.lang.Byte; -> org.hibernate.type.WrapperBinaryType@167205ee
[0m[32m14:44:21,282 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration row_version -> org.hibernate.type.RowVersionType@7e8408f8
[0m[32m14:44:21,283 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration image -> org.hibernate.type.ImageType@454e4bfd
[0m[32m14:44:21,283 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration characters -> org.hibernate.type.CharArrayType@47cdca2b
[0m[32m14:44:21,283 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration char[] -> org.hibernate.type.CharArrayType@47cdca2b
[0m[32m14:44:21,283 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [C -> org.hibernate.type.CharArrayType@47cdca2b
[0m[32m14:44:21,284 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration wrapper-characters -> org.hibernate.type.CharacterArrayType@6ffc14a3
[0m[32m14:44:21,284 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [Ljava.lang.Character; -> org.hibernate.type.CharacterArrayType@6ffc14a3
[0m[32m14:44:21,284 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration Character[] -> org.hibernate.type.CharacterArrayType@6ffc14a3
[0m[32m14:44:21,284 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration text -> org.hibernate.type.TextType@54bfd06b
[0m[32m14:44:21,284 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration ntext -> org.hibernate.type.NTextType@597769d
[0m[32m14:44:21,285 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration blob -> org.hibernate.type.BlobType@25dfec07
[0m[32m14:44:21,285 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.Blob -> org.hibernate.type.BlobType@25dfec07
[0m[32m14:44:21,285 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration materialized_blob -> org.hibernate.type.MaterializedBlobType@15b0c237
[0m[32m14:44:21,286 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration clob -> org.hibernate.type.ClobType@22fefe7e
[0m[32m14:44:21,286 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.Clob -> org.hibernate.type.ClobType@22fefe7e
[0m[32m14:44:21,286 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration nclob -> org.hibernate.type.NClobType@27ced161
[0m[32m14:44:21,286 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.sql.NClob -> org.hibernate.type.NClobType@27ced161
[0m[32m14:44:21,287 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration materialized_clob -> org.hibernate.type.MaterializedClobType@71c32acc
[0m[32m14:44:21,287 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration materialized_nclob -> org.hibernate.type.MaterializedNClobType@5ac63ac8
[0m[32m14:44:21,290 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration serializable -> org.hibernate.type.SerializableType@762e5989
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration object -> org.hibernate.type.ObjectType@1f2c84e7
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration java.lang.Object -> org.hibernate.type.ObjectType@1f2c84e7
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_date -> org.hibernate.type.AdaptedImmutableType@26116e0c
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_time -> org.hibernate.type.AdaptedImmutableType@4dcea580
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_timestamp -> org.hibernate.type.AdaptedImmutableType@36455c06
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_dbtimestamp -> org.hibernate.type.AdaptedImmutableType@65e0362f
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_calendar -> org.hibernate.type.AdaptedImmutableType@48ac4591
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_calendar_date -> org.hibernate.type.AdaptedImmutableType@70f61ba1
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_binary -> org.hibernate.type.AdaptedImmutableType@6c4fdcd5
[0m[32m14:44:21,293 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration imm_serializable -> org.hibernate.type.AdaptedImmutableType@8face3d
[0m[33m14:44:21,302 WARN  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.simcn.tester.TesterController should not have a final or static method (getRandom)
[0m[33m14:44:21,390 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-3) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m14:44:21,763 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 65) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'simcn-backend.ear/simcn-ejb.jar#SimcnPU'
[0m[0m14:44:21,797 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 65) HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
[0m[32m14:44:21,913 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration byte[] -> org.hibernate.type.MaterializedBlobType@15b0c237
[0m[0m14:44:21,913 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) HHH000270: Type registration [byte[]] overrides previous : org.hibernate.type.BinaryType@28c3eb92
[0m[32m14:44:21,913 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [B -> org.hibernate.type.MaterializedBlobType@15b0c237
[0m[0m14:44:21,913 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) HHH000270: Type registration [[B] overrides previous : org.hibernate.type.BinaryType@28c3eb92
[0m[32m14:44:21,913 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration Byte[] -> org.hibernate.type.WrappedMaterializedBlobType@3df38498
[0m[0m14:44:21,913 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) HHH000270: Type registration [Byte[]] overrides previous : org.hibernate.type.WrapperBinaryType@167205ee
[0m[32m14:44:21,913 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration [Ljava.lang.Byte; -> org.hibernate.type.WrappedMaterializedBlobType@3df38498
[0m[0m14:44:21,913 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) HHH000270: Type registration [[Ljava.lang.Byte;] overrides previous : org.hibernate.type.WrapperBinaryType@167205ee
[0m[0m14:44:21,924 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 65) Envers integration enabled? : true
[0m[32m14:44:21,926 DEBUG [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 65) Adding type registration org.hibernate.envers.internal.entities.RevisionTypeType -> org.hibernate.type.CustomType@48466d75
[0m[32m14:44:21,932 DEBUG [org.hibernate.type.spi.TypeConfiguration$Scope] (ServerService Thread Pool -- 65) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@32195ea6] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@751441b3]
[0m[32m14:44:22,305 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,307 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,308 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,309 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoAgendamentoEventualEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,310 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoAgendamentoEventualEnum$Conversor
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,311 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,312 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,313 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.ProcessamentoSaldoContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.ProcessamentoSaldoContabilEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,314 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,315 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,316 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,317 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,318 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,319 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,320 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.MovimentacaoUnidadeEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.MovimentacaoUnidadeEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.SimNaoLancamentoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.SimNaoLancamentoEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,321 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.SituacaoLancamentoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.SituacaoLancamentoEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoEntidadeEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoEntidadeEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.PrazoConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.PrazoConciliacaoEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoDataConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoDataConciliacaoEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,322 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,323 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,324 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,325 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,326 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor
[0m[32m14:44:22,326 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,327 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,328 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.SituacaoProcessamentoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.SituacaoProcessamentoEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,329 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SinalEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SinalEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.VisaoConsolidacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.VisaoConsolidacaoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoExtracaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoExtracaoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,330 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.TipoSaldoEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,331 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,332 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.VisibilidadeParametroConciliacaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,333 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoSubcontaEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoSubcontaProdutoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,334 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.EntidadeStatusEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.EntidadeStatusEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.conciliacao.NaturezaEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.ProcessamentoSaldoContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.ProcessamentoSaldoContabilEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,335 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoAgendamentoEventualEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoAgendamentoEventualEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CriticidadeIncoerenciaEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SinalEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SinalEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.VisaoConsolidacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.VisaoConsolidacaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AbrangenciaIncoerenciaEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor
[0m[32m14:44:22,336 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.CaracteristicaSaldoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoCosifEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ReferenciaApuracaoCosifEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.AtivoInativoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoFinanceiraEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.SituacaoParametrizacaoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.Integer]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SimNaoEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.java.spi.JavaTypeDescriptorRegistry] (ServerService Thread Pool -- 65) Could not find matching scoped JavaTypeDescriptor for requested Java class [java.lang.String]; falling back to static registry
[0m[32m14:44:22,337 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterTypeAdapter] (ServerService Thread Pool -- 65) Created AttributeConverterTypeAdapter -> converted::br.gov.caixa.bsb.simcn.model.NaturezaContabilEnum$Conversor
[0m[32m14:44:22,498 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:22,499 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:22,499 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:22,547 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:22,548 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:22,549 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[33m14:44:22,569 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 65) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
[0m[33m14:44:22,569 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 65) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
[0m[33m14:44:22,569 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 65) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
[0m[33m14:44:22,570 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 65) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
[0m[0m14:44:22,590 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 65) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
[0m[0m14:44:22,599 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.default-update-timestamps-region cache from hibernate container
[0m[0m14:44:22,646 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.default-query-results-region cache from hibernate container
[0m[32m14:44:22,899 DEBUG [org.hibernate.type.spi.TypeConfiguration$Scope] (ServerService Thread Pool -- 65) Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@32195ea6] to SessionFactoryImpl [org.hibernate.internal.SessionFactoryImpl@1ff62863]
[0m[0m14:44:22,911 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoIncoerenciaCosif cache from hibernate container
[0m[0m14:44:22,922 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoIncoerenciaCosif-pending-puts cache from hibernate container
[0m[0m14:44:22,928 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoEventoProduto cache from hibernate container
[0m[0m14:44:22,930 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoEventoProduto-pending-puts cache from hibernate container
[0m[0m14:44:22,934 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.FiltroBatimento cache from hibernate container
[0m[0m14:44:22,935 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.FiltroBatimento-pending-puts cache from hibernate container
[0m[0m14:44:22,938 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.RegraConciliacao cache from hibernate container
[0m[0m14:44:22,940 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.RegraConciliacao-pending-puts cache from hibernate container
[0m[0m14:44:22,943 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaEvolucao cache from hibernate container
[0m[0m14:44:22,945 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaEvolucao-pending-puts cache from hibernate container
[0m[0m14:44:22,948 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoProduto cache from hibernate container
[0m[0m14:44:22,949 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoProduto-pending-puts cache from hibernate container
[0m[0m14:44:22,953 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoIncoerenciaSubcontaProduto cache from hibernate container
[0m[0m14:44:22,955 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoIncoerenciaSubcontaProduto-pending-puts cache from hibernate container
[0m[0m14:44:22,958 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.balancete.VisaoBalancete cache from hibernate container
[0m[0m14:44:22,960 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.balancete.VisaoBalancete-pending-puts cache from hibernate container
[0m[0m14:44:22,982 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoCategoriaUnidade cache from hibernate container
[0m[0m14:44:22,984 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoCategoriaUnidade-pending-puts cache from hibernate container
[0m[0m14:44:22,988 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoMaisDeUmBatimentoRMCC1 cache from hibernate container
[0m[0m14:44:22,989 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoMaisDeUmBatimentoRMCC1-pending-puts cache from hibernate container
[0m[0m14:44:22,993 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoUnidade cache from hibernate container
[0m[0m14:44:22,994 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoUnidade-pending-puts cache from hibernate container
[0m[0m14:44:22,997 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Entidade cache from hibernate container
[0m[0m14:44:22,999 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Entidade-pending-puts cache from hibernate container
[0m[0m14:44:23,001 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Servidor cache from hibernate container
[0m[0m14:44:23,003 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Servidor-pending-puts cache from hibernate container
[0m[0m14:44:23,005 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.IncoerenciaSaldoSubconta cache from hibernate container
[0m[0m14:44:23,007 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.IncoerenciaSaldoSubconta-pending-puts cache from hibernate container
[0m[0m14:44:23,010 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoProdutoTb cache from hibernate container
[0m[0m14:44:23,012 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoProdutoTb-pending-puts cache from hibernate container
[0m[0m14:44:23,014 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnalitico cache from hibernate container
[0m[0m14:44:23,016 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnalitico-pending-puts cache from hibernate container
[0m[0m14:44:23,019 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.FiltroCockpit cache from hibernate container
[0m[0m14:44:23,020 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.FiltroCockpit-pending-puts cache from hibernate container
[0m[0m14:44:23,023 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Cosif cache from hibernate container
[0m[0m14:44:23,026 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Cosif-pending-puts cache from hibernate container
[0m[0m14:44:23,029 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoUnidadeSemValidacao cache from hibernate container
[0m[0m14:44:23,031 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoUnidadeSemValidacao-pending-puts cache from hibernate container
[0m[0m14:44:23,033 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.IncoerenciaSaldoCosif cache from hibernate container
[0m[0m14:44:23,035 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.IncoerenciaSaldoCosif-pending-puts cache from hibernate container
[0m[0m14:44:23,037 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Funcionalidade cache from hibernate container
[0m[0m14:44:23,039 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Funcionalidade-pending-puts cache from hibernate container
[0m[0m14:44:23,041 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoMaisDeUmBatimentoRMCC2 cache from hibernate container
[0m[0m14:44:23,043 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoMaisDeUmBatimentoRMCC2-pending-puts cache from hibernate container
[0m[0m14:44:23,045 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.RotinaFinanceira cache from hibernate container
[0m[0m14:44:23,047 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.RotinaFinanceira-pending-puts cache from hibernate container
[0m[0m14:44:23,049 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Sistema cache from hibernate container
[0m[0m14:44:23,051 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Sistema-pending-puts cache from hibernate container
[0m[0m14:44:23,054 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Perfil cache from hibernate container
[0m[0m14:44:23,055 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Perfil-pending-puts cache from hibernate container
[0m[0m14:44:23,081 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.AnaliticoFinanceiro cache from hibernate container
[0m[0m14:44:23,083 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.AnaliticoFinanceiro-pending-puts cache from hibernate container
[0m[0m14:44:23,086 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EmpregadoCaixa cache from hibernate container
[0m[0m14:44:23,088 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EmpregadoCaixa-pending-puts cache from hibernate container
[0m[0m14:44:23,090 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProduto cache from hibernate container
[0m[0m14:44:23,092 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProduto-pending-puts cache from hibernate container
[0m[0m14:44:23,095 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoCosif cache from hibernate container
[0m[0m14:44:23,097 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoCosif-pending-puts cache from hibernate container
[0m[0m14:44:23,195 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.ContaContabil cache from hibernate container
[0m[0m14:44:23,197 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.ContaContabil-pending-puts cache from hibernate container
[0m[0m14:44:23,199 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.SaldoOperacionalContabil cache from hibernate container
[0m[0m14:44:23,200 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.SaldoOperacionalContabil-pending-puts cache from hibernate container
[0m[0m14:44:23,203 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Unidade cache from hibernate container
[0m[0m14:44:23,204 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Unidade-pending-puts cache from hibernate container
[0m[0m14:44:23,206 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoTipoIncoerencia cache from hibernate container
[0m[0m14:44:23,207 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoTipoIncoerencia-pending-puts cache from hibernate container
[0m[0m14:44:23,209 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoSaldoFinanceiro cache from hibernate container
[0m[0m14:44:23,211 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.EventoSaldoFinanceiro-pending-puts cache from hibernate container
[0m[0m14:44:23,213 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.BatimentoEvolucao cache from hibernate container
[0m[0m14:44:23,214 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.BatimentoEvolucao-pending-puts cache from hibernate container
[0m[0m14:44:23,217 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaNewSemValidacao cache from hibernate container
[0m[0m14:44:23,218 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaNewSemValidacao-pending-puts cache from hibernate container
[0m[0m14:44:23,220 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.TipoAcaoOperacional cache from hibernate container
[0m[0m14:44:23,221 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.TipoAcaoOperacional-pending-puts cache from hibernate container
[0m[0m14:44:23,223 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.AgrupamentoIncoerencia cache from hibernate container
[0m[0m14:44:23,226 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.AgrupamentoIncoerencia-pending-puts cache from hibernate container
[0m[0m14:44:23,229 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.SolicitacaoRelatorio cache from hibernate container
[0m[0m14:44:23,230 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.SolicitacaoRelatorio-pending-puts cache from hibernate container
[0m[0m14:44:23,232 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnaliticoSemValidacao cache from hibernate container
[0m[0m14:44:23,233 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnaliticoSemValidacao-pending-puts cache from hibernate container
[0m[0m14:44:23,235 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.RelatorioOperacionalUnidade cache from hibernate container
[0m[0m14:44:23,237 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.RelatorioOperacionalUnidade-pending-puts cache from hibernate container
[0m[0m14:44:23,239 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoConsultaMaisDeUmBatimento cache from hibernate container
[0m[0m14:44:23,240 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoConsultaMaisDeUmBatimento-pending-puts cache from hibernate container
[0m[0m14:44:23,242 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.UltimoSaldoSubcontaConsolidado cache from hibernate container
[0m[0m14:44:23,243 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.UltimoSaldoSubcontaConsolidado-pending-puts cache from hibernate container
[0m[0m14:44:23,245 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroCosif cache from hibernate container
[0m[0m14:44:23,246 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroCosif-pending-puts cache from hibernate container
[0m[0m14:44:23,281 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.ParametrizacaoConciliacao cache from hibernate container
[0m[0m14:44:23,283 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.ParametrizacaoConciliacao-pending-puts cache from hibernate container
[0m[0m14:44:23,285 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.GrupoOperacionalContabil cache from hibernate container
[0m[0m14:44:23,286 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.GrupoOperacionalContabil-pending-puts cache from hibernate container
[0m[0m14:44:23,289 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoConsulta cache from hibernate container
[0m[0m14:44:23,290 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoConsulta-pending-puts cache from hibernate container
[0m[0m14:44:23,292 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Relatorio cache from hibernate container
[0m[0m14:44:23,293 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.Relatorio-pending-puts cache from hibernate container
[0m[0m14:44:23,295 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.SubcontaProduto cache from hibernate container
[0m[0m14:44:23,296 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.SubcontaProduto-pending-puts cache from hibernate container
[0m[0m14:44:23,298 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.DiferencaSaldoContabil cache from hibernate container
[0m[0m14:44:23,299 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.DiferencaSaldoContabil-pending-puts cache from hibernate container
[0m[0m14:44:23,301 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.FuncionalidadeMenu cache from hibernate container
[0m[0m14:44:23,302 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.FuncionalidadeMenu-pending-puts cache from hibernate container
[0m[0m14:44:23,304 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaNew cache from hibernate container
[0m[0m14:44:23,305 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubcontaNew-pending-puts cache from hibernate container
[0m[0m14:44:23,307 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.Subtotal cache from hibernate container
[0m[0m14:44:23,309 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.Subtotal-pending-puts cache from hibernate container
[0m[0m14:44:23,311 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ResultadoCockpit cache from hibernate container
[0m[0m14:44:23,312 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ResultadoCockpit-pending-puts cache from hibernate container
[0m[0m14:44:23,314 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoReduzido cache from hibernate container
[0m[0m14:44:23,315 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoReduzido-pending-puts cache from hibernate container
[0m[0m14:44:23,317 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.PendenciaContabil cache from hibernate container
[0m[0m14:44:23,318 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.PendenciaContabil-pending-puts cache from hibernate container
[0m[0m14:44:23,320 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoConsulta cache from hibernate container
[0m[0m14:44:23,321 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoConsulta-pending-puts cache from hibernate container
[0m[0m14:44:23,323 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubconta cache from hibernate container
[0m[0m14:44:23,324 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoSubconta-pending-puts cache from hibernate container
[0m[0m14:44:23,326 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.MensagemAvisoPerfil cache from hibernate container
[0m[0m14:44:23,327 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.MensagemAvisoPerfil-pending-puts cache from hibernate container
[0m[0m14:44:23,392 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoCosifEvolucao cache from hibernate container
[0m[0m14:44:23,393 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoCosifEvolucao-pending-puts cache from hibernate container
[0m[0m14:44:23,395 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroCosifTipoIncoerencia cache from hibernate container
[0m[0m14:44:23,396 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroCosifTipoIncoerencia-pending-puts cache from hibernate container
[0m[0m14:44:23,398 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Produto cache from hibernate container
[0m[0m14:44:23,399 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.view.Produto-pending-puts cache from hibernate container
[0m[0m14:44:23,401 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnaliticoSubconta cache from hibernate container
[0m[0m14:44:23,402 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.SaldoAnaliticoSubconta-pending-puts cache from hibernate container
[0m[0m14:44:23,404 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoRelatorioOperacional cache from hibernate container
[0m[0m14:44:23,405 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.batimento.ParametroBatimentoRelatorioOperacional-pending-puts cache from hibernate container
[0m[0m14:44:23,407 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoAjustado cache from hibernate container
[0m[0m14:44:23,408 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started simcn.br.gov.caixa.bsb.simcn.model.incoerencia.saldo.ParametroSubcontaProdutoAjustado-pending-puts cache from hibernate container
[0m[32m14:44:24,138 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,139 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,140 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,140 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,159 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,159 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,161 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,161 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,206 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,206 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,216 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,216 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,508 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,508 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,509 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,509 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.AcaoEnum
[0m[32m14:44:24,511 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,511 DEBUG [org.hibernate.type.EnumType] (ServerService Thread Pool -- 65) Using ORDINAL-based conversion for Enum br.gov.caixa.bsb.simcn.model.incoerencia.saldo.TipoAnaliticoEnum
[0m[32m14:44:24,519 DEBUG [org.hibernate.SQL] (ServerService Thread Pool -- 65) 
    create global temporary table HT_MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE number(10,0) not null) 
        on commit delete rows
[0m[0m14:44:24,519 INFO  [stdout] (ServerService Thread Pool -- 65) Hibernate: 
[0m[0m14:44:24,519 INFO  [stdout] (ServerService Thread Pool -- 65)     create global temporary table HT_MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE number(10,0) not null) 
[0m[0m14:44:24,519 INFO  [stdout] (ServerService Thread Pool -- 65)         on commit delete rows
[0m14:44:24,533 TRACE [org.hibernate.type.spi.TypeConfiguration$Scope] (ServerService Thread Pool -- 65) Handling #sessionFactoryCreated from [org.hibernate.internal.SessionFactoryImpl@1ff62863] for TypeConfiguration
[0m[0m14:44:25,890 INFO  [br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener] (ServerService Thread Pool -- 72) Iniciando o processamento do arquivo update.sql.
[0m[0m14:44:25,908 INFO  [stdout] (ServerService Thread Pool -- 72) -- Ambiente local.
[0m[0m14:44:25,908 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB023_COSIF SET IC_TIPO_ENTIDADE = 'A' WHERE IC_TIPO_ENTIDADE IS NULL
[0m[0m14:44:25,908 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:25,933 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_PERMITE_DESDOBRAMENTO = 0 WHERE IC_PERMITE_DESDOBRAMENTO IS NULL
[0m[0m14:44:25,933 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:25,980 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_DATA_PROCESSAMENTO = 0 WHERE IC_EXIBICAO_DATA_PROCESSAMENTO IS NULL
[0m[0m14:44:25,980 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,019 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_DATA_BALANCETE = 0 WHERE IC_EXIBICAO_DATA_BALANCETE IS NULL
[0m[0m14:44:26,019 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,028 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 70) HHH000397: Using ASTQueryTranslatorFactory
[0m[0m14:44:26,052 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_DATA_EFETIVA = 0 WHERE IC_EXIBICAO_DATA_EFETIVA IS NULL
[0m[0m14:44:26,052 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,080 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_DATA_LANCAMENTO = 0 WHERE IC_EXIBICAO_DATA_LANCAMENTO IS NULL
[0m[0m14:44:26,081 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,109 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_ORIGEM = 0 WHERE IC_EXIBICAO_ORIGEM IS NULL
[0m[0m14:44:26,110 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[32m14:44:26,125 DEBUG [org.hibernate.SQL] (ServerService Thread Pool -- 70) 
    /* select
        generatedAlias0 
    from
        ParametroContabil as generatedAlias0 
    where
        generatedAlias0.nome=:param0 
    order by
        generatedAlias0.dtAtualizacao desc */ select
            parametroc0_.NU_PARAMETRO as NU_PARAMETRO1_44_,
            parametroc0_.DE_CONTEUDO_PARAMETRO as DE_CONTEUDO_PARAME2_44_,
            parametroc0_.DE_DETALHADA_PARAMETRO as DE_DETALHADA_PARAM3_44_,
            parametroc0_.DT_ATUALIZACAO as DT_ATUALIZACAO4_44_,
            parametroc0_.NO_PARAMETRO as NO_PARAMETRO5_44_,
            parametroc0_.NO_TIPO_PARAMETRO as NO_TIPO_PARAMETRO6_44_ 
        from
            MCN.MCNTB043_PARAMETRO_CONTABIL parametroc0_ 
        where
            parametroc0_.NO_PARAMETRO=? 
        order by
            parametroc0_.DT_ATUALIZACAO desc
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70) Hibernate: 
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)     /* select
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)         generatedAlias0 
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)     from
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)         ParametroContabil as generatedAlias0 
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)     where
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)         generatedAlias0.nome=:param0 
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)     order by
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)         generatedAlias0.dtAtualizacao desc */ select
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.NU_PARAMETRO as NU_PARAMETRO1_44_,
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.DE_CONTEUDO_PARAMETRO as DE_CONTEUDO_PARAME2_44_,
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.DE_DETALHADA_PARAMETRO as DE_DETALHADA_PARAM3_44_,
[0m[0m14:44:26,125 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.DT_ATUALIZACAO as DT_ATUALIZACAO4_44_,
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.NO_PARAMETRO as NO_PARAMETRO5_44_,
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.NO_TIPO_PARAMETRO as NO_TIPO_PARAMETRO6_44_ 
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)         from
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)             MCN.MCNTB043_PARAMETRO_CONTABIL parametroc0_ 
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)         where
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.NO_PARAMETRO=? 
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)         order by
[0m[0m14:44:26,126 INFO  [stdout] (ServerService Thread Pool -- 70)             parametroc0_.DT_ATUALIZACAO desc
[0m[0m14:44:26,144 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_EVENTO = 0 WHERE IC_EXIBICAO_EVENTO IS NULL
[0m[0m14:44:26,144 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,176 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_DOCUMENTO = 0 WHERE IC_EXIBICAO_DOCUMENTO IS NULL
[0m[0m14:44:26,176 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,204 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_SITUACAO_LNCMO = 0 WHERE IC_EXIBICAO_SITUACAO_LNCMO IS NULL
[0m[0m14:44:26,204 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,238 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_SISTEMA = 0 WHERE IC_EXIBICAO_SISTEMA IS NULL
[0m[0m14:44:26,238 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,269 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_ROTINA = 0 WHERE IC_EXIBICAO_ROTINA IS NULL
[0m[0m14:44:26,269 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m14:44:26,302 TRACE [org.hibernate.type.descriptor.sql.BasicBinder] (ServerService Thread Pool -- 70) binding parameter [1] as [VARCHAR] - [WEB_STORAGE_SIMCN]
[0m[0m14:44:26,307 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_AVISO_EMPENHO = 0 WHERE IC_EXIBICAO_AVISO_EMPENHO IS NULL
[0m[0m14:44:26,307 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m14:44:26,319 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NU_PARAMETRO1_44_] : [BIGINT]) - [567]
[0m14:44:26,323 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([DE_CONTEUDO_PARAME2_44_] : [VARCHAR]) - [/uploadintegracao/des/simcn/]
[0m14:44:26,323 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([DE_DETALHADA_PARAM3_44_] : [VARCHAR]) - [null]
[0m14:44:26,323 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([DT_ATUALIZACAO4_44_] : [TIMESTAMP]) - [null]
[0m14:44:26,323 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NO_PARAMETRO5_44_] : [VARCHAR]) - [WEB_STORAGE_SIMCN]
[0m14:44:26,323 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NO_TIPO_PARAMETRO6_44_] : [VARCHAR]) - [TEXTO]
[0m[32m14:44:26,333 DEBUG [org.hibernate.SQL] (ServerService Thread Pool -- 70) 
    /* select
        generatedAlias0 
    from
        TipoIncoerenciaCosif as generatedAlias0 
    where
        1=1 
    order by
        generatedAlias0.noTipoIncoerenciaCosif asc */ select
            tipoincoer0_.CO_TIPO_INCOERENCIA_COSIF as CO_TIPO_INCOERENCI1_19_,
            tipoincoer0_.IC_CRITICIDADE_CONSOLIDACAO as IC_CRITICIDADE_CON2_19_,
            tipoincoer0_.IC_CRITICIDADE_UNIDADE as IC_CRITICIDADE_UNI3_19_,
            tipoincoer0_.NO_TIPO_INCOERENCIA_COSIF as NO_TIPO_INCOERENCI4_19_,
            tipoincoer0_.SG_TIPO_INCOERENCIA_COSIF as SG_TIPO_INCOERENCI5_19_ 
        from
            MCN.MCNTB018_TIPO_INCRA_COSIF tipoincoer0_ 
        where
            1=1 
        order by
            tipoincoer0_.NO_TIPO_INCOERENCIA_COSIF asc
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70) Hibernate: 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)     /* select
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         generatedAlias0 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)     from
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         TipoIncoerenciaCosif as generatedAlias0 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)     where
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         1=1 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)     order by
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         generatedAlias0.noTipoIncoerenciaCosif asc */ select
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.CO_TIPO_INCOERENCIA_COSIF as CO_TIPO_INCOERENCI1_19_,
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.IC_CRITICIDADE_CONSOLIDACAO as IC_CRITICIDADE_CON2_19_,
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.IC_CRITICIDADE_UNIDADE as IC_CRITICIDADE_UNI3_19_,
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.NO_TIPO_INCOERENCIA_COSIF as NO_TIPO_INCOERENCI4_19_,
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.SG_TIPO_INCOERENCIA_COSIF as SG_TIPO_INCOERENCI5_19_ 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         from
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             MCN.MCNTB018_TIPO_INCRA_COSIF tipoincoer0_ 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         where
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             1=1 
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)         order by
[0m[0m14:44:26,333 INFO  [stdout] (ServerService Thread Pool -- 70)             tipoincoer0_.NO_TIPO_INCOERENCIA_COSIF asc
[0m14:44:26,337 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([CO_TIPO_INCOERENCI1_19_] : [VARCHAR]) - [SDC]
[0m14:44:26,338 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_CON2_19_] : [INTEGER]) - [1]
[0m[32m14:44:26,338 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 1 -> IFB
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_UNI3_19_] : [INTEGER]) - [2]
[0m[32m14:44:26,339 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 2 -> ALTA
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NO_TIPO_INCOERENCI4_19_] : [VARCHAR]) - [Saldo COSIF Desativado]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([SG_TIPO_INCOERENCI5_19_] : [VARCHAR]) - [SCD]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([CO_TIPO_INCOERENCI1_19_] : [VARCHAR]) - [SDZ]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_CON2_19_] : [INTEGER]) - [4]
[0m[32m14:44:26,339 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 4 -> BAIXA
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_UNI3_19_] : [INTEGER]) - [4]
[0m[32m14:44:26,339 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 4 -> BAIXA
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NO_TIPO_INCOERENCI4_19_] : [VARCHAR]) - [Saldo Diferente de Zero]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([SG_TIPO_INCOERENCI5_19_] : [VARCHAR]) - [SDZ]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([CO_TIPO_INCOERENCI1_19_] : [VARCHAR]) - [SI]
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_CON2_19_] : [INTEGER]) - [1]
[0m[32m14:44:26,339 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 1 -> IFB
[0m14:44:26,339 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([IC_CRITICIDADE_UNI3_19_] : [INTEGER]) - [2]
[0m[32m14:44:26,339 DEBUG [org.hibernate.type.descriptor.converter.AttributeConverterSqlTypeDescriptorAdapter] (ServerService Thread Pool -- 70) Converted value on extraction: 2 -> ALTA
[0m14:44:26,340 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([NO_TIPO_INCOERENCI4_19_] : [VARCHAR]) - [Saldo Invertido]
[0m[0m14:44:26,340 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_NUMERO_PROJETO = 0 WHERE IC_EXIBICAO_NUMERO_PROJETO IS NULL
[0m14:44:26,340 TRACE [org.hibernate.type.descriptor.sql.BasicExtractor] (ServerService Thread Pool -- 70) extracted value ([SG_TIPO_INCOERENCI5_19_] : [VARCHAR]) - [SI]
[0m[0m14:44:26,340 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) java.io.FileNotFoundException: /uploadintegracao/des/simcn/cacheJson/cacheCosif (No such file or directory)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.io.FileOutputStream.open0(Native Method)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:298)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:237)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:126)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at deployment.simcn-backend.ear.simcn-ejb.jar//br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService.carregarCacheTiposIncoerenciasCosif(TipoIncoerenciaService.java:67)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at deployment.simcn-backend.ear.simcn-ejb.jar//br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService.configurarCache(TipoIncoerenciaService.java:58)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at deployment.simcn-backend.ear.simcn-ejb.jar//br.gov.caixa.bsb.simcn.service.TipoIncoerenciaService.postConstruct(TipoIncoerenciaService.java:50)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
[0m[31m14:44:26,349 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld.common@7.4.11.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld.common@7.4.11.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld.common@7.4.11.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.weld.core@3.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:81)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld.common@7.4.11.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld@7.4.11.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld@7.4.11.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld@7.4.11.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
[0m[31m14:44:26,350 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.weld@7.4.11.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ejb3@7.4.11.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.as.ee@7.4.11.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at java.base/java.lang.Thread.run(Thread.java:829)
[0m[31m14:44:26,351 ERROR [stderr] (ServerService Thread Pool -- 70) 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
[0m[0m14:44:26,355 INFO  [org.hibernate.engine.internal.StatisticalLoggingSessionEventListener] (ServerService Thread Pool -- 70) Session Metrics {
    156170242 nanoseconds spent acquiring 2 JDBC connections;
    136147 nanoseconds spent releasing 2 JDBC connections;
    175700724 nanoseconds spent preparing 2 JDBC statements;
    18631591 nanoseconds spent executing 2 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    7378291 nanoseconds spent performing 3 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    1045842 nanoseconds spent executing 1 flushes (flushing a total of 4 entities and 0 collections);
    2732553 nanoseconds spent executing 2 partial-flushes (flushing a total of 1 entities and 1 collections)
}
[0m[0m14:44:26,380 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_CONTROLE_OPRCL = 0 WHERE IC_EXIBICAO_CONTROLE_OPRCL IS NULL
[0m[0m14:44:26,380 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,422 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_UNIDADE_ORIGEM = 0 WHERE IC_EXIBICAO_UNIDADE_ORIGEM IS NULL
[0m[0m14:44:26,422 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,460 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_NUMERO_CONCILIACAO = 0 WHERE IC_EXIBICAO_NUMERO_CONCILIACAO IS NULL
[0m[0m14:44:26,460 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,481 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 80) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.bsb.simcn.JAXRSConfiguration$Proxy$_$$_WeldClientProxy
[0m[0m14:44:26,488 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_HISTORICO_DLE_FLE = 0 WHERE IC_EXIBICAO_HISTORICO_DLE_FLE IS NULL
[0m[0m14:44:26,488 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,521 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_COMENTARIO_RGSTO = 0 WHERE IC_EXIBICAO_COMENTARIO_RGSTO IS NULL
[0m[0m14:44:26,521 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,550 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_EXIBICAO_CODIGO_ANALITICO = 0 WHERE IC_EXIBICAO_CODIGO_ANALITICO IS NULL
[0m[0m14:44:26,550 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,554 INFO  [org.reflections.Reflections] (ServerService Thread Pool -- 80) Reflections took 32 ms to scan 1 urls, producing 17 keys and 516 values 
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72) --WHEN MATCHED THEN UPDATE SET D.DE_CONTEUDO_PARAMETRO = O.VALOR, D.DT_ATUALIZACAO=SYSDATE
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB043_PARAMETRO_CONTABIL D USING (
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL008_ETL' NOME, '20201218120210' VALOR, COALESCE((SELECT MAX(NU_PARAMETRO) + 01 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) ID FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL008_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 02 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL007_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 03 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL007_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 04 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL006_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 05 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL006_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 06 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL  
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL009_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 07 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL009_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 08 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL010_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 09 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL010_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 10 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL011_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 11 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL011_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 12 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL  
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL005_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 13 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL005_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 14 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL004_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 15 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL004_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 16 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL003_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 17 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL003_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 18 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL002_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 19 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL002_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 20 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_ETL001_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 21 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_ETL001_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 22 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL005_WEB', '20201218121500', COALESCE((SELECT MAX(NU_PARAMETRO) + 23 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL005_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 24 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,585 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL005_WEB', '20201218121503', COALESCE((SELECT MAX(NU_PARAMETRO) + 25 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL005_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 26 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL004_WEB', '20201218121500', COALESCE((SELECT MAX(NU_PARAMETRO) + 27 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL004_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 28 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL004_WEB', '20201218121503', COALESCE((SELECT MAX(NU_PARAMETRO) + 29 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL004_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 30 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL003_WEB', '20201217143000', COALESCE((SELECT MAX(NU_PARAMETRO) + 31 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL003_ETL', '20201217121631', COALESCE((SELECT MAX(NU_PARAMETRO) + 32 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL003_WEB', '20201217152456', COALESCE((SELECT MAX(NU_PARAMETRO) + 33 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL003_ETL', '20201217142129', COALESCE((SELECT MAX(NU_PARAMETRO) + 34 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL002_WEB', '20201218120000', COALESCE((SELECT MAX(NU_PARAMETRO) + 35 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL002_ETL', '20201218113658', COALESCE((SELECT MAX(NU_PARAMETRO) + 36 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL002_WEB', '20201218120127', COALESCE((SELECT MAX(NU_PARAMETRO) + 37 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL002_ETL', '20201218114817', COALESCE((SELECT MAX(NU_PARAMETRO) + 38 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL001_WEB', '20201218121500', COALESCE((SELECT MAX(NU_PARAMETRO) + 39 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_INI_REL001_ETL', '20201218120210', COALESCE((SELECT MAX(NU_PARAMETRO) + 40 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL001_WEB', '20201218121503', COALESCE((SELECT MAX(NU_PARAMETRO) + 41 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'TS_CARGA_FIM_REL001_ETL', '20201218120224', COALESCE((SELECT MAX(NU_PARAMETRO) + 42 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 'WEB_STORAGE_SIMCN', '/upload/des/simcn/', COALESCE((SELECT MAX(NU_PARAMETRO) + 43 FROM MCN.MCNTB043_PARAMETRO_CONTABIL), 1) FROM DUAL
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NOME = D.NO_PARAMETRO)
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_PARAMETRO, D.NO_PARAMETRO, D.DE_CONTEUDO_PARAMETRO, D.DT_ATUALIZACAO) VALUES (O.ID, O.NOME, O.VALOR, SYSDATE)
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,586 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,588 INFO  [org.reflections.Reflections] (ServerService Thread Pool -- 80) Reflections took 31 ms to scan 1 urls, producing 17 keys and 516 values 
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB004_RLTRO_CCLCO_CNTBL D USING (
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 'REL001' CO_RLTRO_CCLCO_CNTBL, 'Legado > Par?metros' NO_RLTRO_CCLCO_CNTBL, TO_DATE('27/11/18', 'DD/MM/RR') DT_INCSO_RLTRO_CCLCO_CNTBL FROM DUAL
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'REL002', 'Legado > Diferen?a Operacional X Cont?bil', TO_DATE('27/11/18', 'DD/MM/RR') FROM DUAL
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'REL003', 'Legado > Invent?rio de Pend?ncias', TO_DATE('27/11/18', 'DD/MM/RR') FROM DUAL
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'REL006', 'Batimento > Relat?rio Gerencial', TO_DATE('01/11/21', 'DD/MM/RR') FROM DUAL
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.CO_RLTRO_CCLCO_CNTBL = D.CO_RLTRO_CCLCO_CNTBL)
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_RLTRO_CCLCO_CNTBL = O.NO_RLTRO_CCLCO_CNTBL, D.DT_INCSO_RLTRO_CCLCO_CNTBL = O.DT_INCSO_RLTRO_CCLCO_CNTBL
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.CO_RLTRO_CCLCO_CNTBL, D.NO_RLTRO_CCLCO_CNTBL, D.DT_INCSO_RLTRO_CCLCO_CNTBL) VALUES (O.CO_RLTRO_CCLCO_CNTBL, O.NO_RLTRO_CCLCO_CNTBL, O.DT_INCSO_RLTRO_CCLCO_CNTBL)
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,662 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB030_AGRUPAMENTO_INRNA D USING (
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 1 NU_AGRUPAMENTO_INCOERENCIA, 'Diversos - Subcontas sem segmento espec?fico' NO_AGRUPAMENTO_INCOERENCIA FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 3, 'Automa??o Banc?ria' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 4, 'Dep?sitos' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 6, 'Administrativo e Recursos Humanos' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 16, 'Loterias' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 17, 'Penhor' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 18, 'Empr?stimos e Financiamentos' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 19, 'Financeiro' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 21, 'Cobran?a e SIBAN' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 23, 'Presta??o de Servi?os' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 37, 'Fomento' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 66, 'Tributos' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 83, 'Compensa??o' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 92, 'Fundos Sociais' FROM DUAL
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NU_AGRUPAMENTO_INCOERENCIA = D.NU_AGRUPAMENTO_INCOERENCIA)
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.SG_AGRUPAMENTO_INCOERENCIA = O.NU_AGRUPAMENTO_INCOERENCIA, D.NO_AGRUPAMENTO_INCOERENCIA = O.NO_AGRUPAMENTO_INCOERENCIA
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_AGRUPAMENTO_INCOERENCIA, D.SG_AGRUPAMENTO_INCOERENCIA, D.NO_AGRUPAMENTO_INCOERENCIA) VALUES (O.NU_AGRUPAMENTO_INCOERENCIA, O.NU_AGRUPAMENTO_INCOERENCIA, O.NO_AGRUPAMENTO_INCOERENCIA)
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,698 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,722 INFO  [stdout] (ServerService Thread Pool -- 72) -- Em raz?o dos auto relacionamentos, utilizo um trecho para inserir e outro para atualizar funcionalidades.
[0m[0m14:44:26,722 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '1', 'Administrativo', '2', null FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 1)
[0m[0m14:44:26,722 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,740 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 80) WFLYUT0021: Registered web context: '/simcn-api' for server 'default-server'
[0m[0m14:44:26,753 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '38', 'Par?metros Gestor', '5', '1' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 38)
[0m[0m14:44:26,753 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,758 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '15', 'Saldos Incoerentes', '3', null FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 15)
[0m[0m14:44:26,758 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,763 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '17', 'COSIF', '1', '15' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 17)
[0m[0m14:44:26,763 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,780 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '18', 'Subconta/Produto', '2', '15' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 18)
[0m[0m14:44:26,780 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,785 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '16', 'Batimento', '4', null FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 16)
[0m[0m14:44:26,785 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,789 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '54', 'Conciliacao', '5', null FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 54)
[0m[0m14:44:26,789 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,793 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '3', 'Relat?rios', '6', null FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 3)
[0m[0m14:44:26,793 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,797 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '42', 'Saldos Incoerentes', '1', '3' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 42)
[0m[0m14:44:26,797 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,801 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '21', 'COSIF', '1', '42' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 21)
[0m[0m14:44:26,801 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,805 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '22', 'Subconta/Produto', '2', '42' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 22)
[0m[0m14:44:26,805 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,809 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '46', 'Batimento', '2', '3' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 46)
[0m[0m14:44:26,809 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,813 INFO  [stdout] (ServerService Thread Pool -- 72) INSERT INTO MCN.MCNTB009_FUNCIONALIDADE (NU_FUNCIONALIDADE, NO_FUNCIONALIDADE, NU_ORDENACAO_FUNCIONALIDADE, NU_FUNCIONALIDADE_SUPERIOR) SELECT '4', 'Legado', '3', '3' FROM DUAL WHERE NOT EXISTS (SELECT NULL FROM MCN.MCNTB009_FUNCIONALIDADE WHERE NU_FUNCIONALIDADE = 4)
[0m[0m14:44:26,813 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72) -- Em raz?o dos auto relacionamentos, utilizo um trecho para inserir e outro para atualizar funcionalidades.
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72) -- Funcionalidades que n?o fazem parte da estrutura menus, com NU_ORDENACAO_FUNCIONALIDADE igual a -1 para que sejam ignoradas nas consultas de menu
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB009_FUNCIONALIDADE D USING (
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT '14' NU_FUNCIONALIDADE, 'Quadro de Avisos' NO_FUNCIONALIDADE, '0' NU_ORDENACAO_FUNCIONALIDADE, null NU_FUNCIONALIDADE_SUPERIOR FROM DUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '53', 'In?cio', '1', null FROM DUAL -- fndCod: INICIO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '1', 'Administrativo', '2', null FROM DUAL -- fndCod: ADMINISTRATIVO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '2', 'Ajuda Funcionalidade do Sistema', '1', '1' FROM DUAL -- fndCod: AJUDA
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '11', 'Categoria Base Conhecimento', '2', '1' FROM DUAL -- fndCod'38', : CATEGORIA_CONHECIMENTO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '13', 'Quadro de Avisos', '3', '1' FROM DUAL -- fndCod: AVISOS
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '50', 'Parametrizar Relat?rio Operacional', '4', '1' FROM DUAL  -- fndCod: PARAMETRIZACAO_RELATORIO_OPERACIONAL 
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '38', 'Par?metros Gestor', '5', '1' FROM DUAL  -- fndCod: PARAMETRIZACAO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '39', 'Tipo Incoer?ncia Saldo', '1', '38' FROM DUAL  -- fndCod: PARAMETRIZACAO_INCOERENCIA
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '40', 'Categoria Unidade', '2', '38' FROM DUAL  -- fndCod: PARAMETRIZACAO_CATEGORIA_UNIDADE
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '41', 'Agrupamento', '3', '38' FROM DUAL  -- fndCod: PARAMETRIZACAO_AGRUPAMENTO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '52', 'Entidade', '4', '38' FROM DUAL  -- fndCod: PARAMETRIZACAO_ENTIDADE
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '15', 'Saldos Incoerentes', '3', null FROM DUAL -- fndCod: SALDOS_INCOERENTES
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '17', 'COSIF', '1', '15' FROM DUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '23', 'Consulta Par?metro', '1', '17' FROM DUAL -- fndCod: PARAMETRO_COSIF
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '24', 'Detalhe Par?metro', '2', '17' FROM DUAL -- fndCod: VISUALIZAR_PARAMETRO_COSIF
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '25', 'Hist?rico de Saldo', '3', '17' FROM DUAL -- fndCod: INCOERENCIA_COSIF
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '26', 'Parametriza??o em Lote', '4', '17' FROM DUAL -- fndCod: MANTER_PARAMETRO_COSIF_LOTE
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '18', 'Subconta/Produto', '2', '15' FROM DUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '27', 'Acompanhamento Personalizado', '1', '18' FROM DUAL -- fndCod: COCKPIT_INCOERENCIAS
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '28', 'Consulta Par?metro', '2', '18' FROM DUAL -- fndCod: PARAMETRO_SUBCONTA
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '29', 'Detalhe Par?metro', '3', '18' FROM DUAL -- fndCod: VISUALIZAR_PARAMETRO_SUBCONTA
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '30', 'Hist?rico de Saldo', '4', '18' FROM DUAL -- fndCod: INCOERENCIA_SUBCONTA
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '31', 'Parametriza??o em Lote', '5', '18' FROM DUAL -- fndCod: MANTER_PARAMETRO_SUBCONTA_LOTE
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '16', 'Batimento', '4', null FROM DUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '43', 'Acompanhamento Personalizado', '1', '16' FROM DUAL -- fndCod: ACOMPANHAMENTO_BATIMENTO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '19', 'Consulta Par?metro', '2', '16' FROM DUAL -- fndCod: PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '20', 'Detalhe Par?metro', '3', '16' FROM DUAL -- fndCod: VISUALIZAR_PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '44', 'Hist?rico de Saldos', '4', '16' FROM DUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '45', 'Saldos Relat?rio Operacional', '5', '16' FROM DUAL -- fndCod: INFORMACOES_OPERACIONAIS  
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '54', 'Conciliacao', '5', null FROM DUAL -- fndCod: CONCILIACAO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   	UNION ALL SELECT '55', 'Manual', '1', '54' FROM DUAL -- fndCod: CONCILIACAO_MANUAL
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   	UNION ALL SELECT '56', 'Hist?rico', '2', '54' FROM DUAL -- fndCod: CONCILIACAO_HISTORICO
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '3', 'Relat?rios', '6', null FROM DUAL -- fndCod: RELATORIOS
[0m[0m14:44:26,817 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '42', 'Saldos Incoerentes', '1', '3' FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '21', 'COSIF', '1', '42' FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '32', 'Par?metros', '1', '21' FROM DUAL -- fndCod: RELATORIO_PARAMETRO_COSIF
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '33', 'Hist?rico de Saldos', '2', '21' FROM DUAL -- fndCod: RELATORIO_HISTORICO_COSIF
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '34', 'Justificativas', '3', '21' FROM DUAL -- fndCod: RELATORIO_JUSTIFICATIVA_COSIF
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '22', 'Subconta/Produto', '2', '42' FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '35', 'Par?metros', '1', '22' FROM DUAL -- fndCod: RELATORIO_PARAMETRO_SUBCONTA
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '36', 'Hist?rico de Saldos', '2', '22' FROM DUAL -- fndCod: RELATORIO_HISTORICO_SUBCONTA
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)         UNION ALL SELECT '37', 'Justificativas', '3', '22' FROM DUAL -- fndCod: RELATORIO_JUSTIFICATIVA_SUBCONTA
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '46', 'Batimento', '2', '3' FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '47', 'Par?metros', '1', '46' FROM DUAL -- fndCod: RELATORIO_BATIMENTO_PARAMETROS
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '48', 'Hist?rico de Saldos', '2', '46' FROM DUAL -- fndCod: RELATORIO_BATIMENTO_SALDOS
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '49', 'Justificativas', '3', '46' FROM DUAL -- fndCod: RELATORIO_BATIMENTO_JUSTIFICATIVAS
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '51', 'Relat?rio Gerencial', '4', '46' FROM DUAL -- fndCod: RELATORIO_GERENCIAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)     UNION ALL SELECT '4', 'Legado', '3', '3' FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '5', 'Par?metro', '1', '4' FROM DUAL -- fndCod: PARAMETROS_LEGADO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '6', 'Diferen?a Operacional X Cont?bil', '2', '4' FROM DUAL -- fndCod: DIFERENCA_OPERACIONAL_CONTABIL_LEGADO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '7', 'Invent?rio Pend?ncias', '3', '4' FROM DUAL -- fndCod: INVENTARIO_PENDENCIAS_LEGADO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '8', 'Diferen?a Saldo Cont?bil SIMCN x SICTB', '4', '4' FROM DUAL -- fndCod: BATIMENTO_SICTB_LEGADO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)       UNION ALL SELECT '9', 'Diferen?a Saldo Cont?bil Anal?tico SIMCN x SICTB', '5', '4' FROM DUAL -- fndCod: BATIMENTO_SICTB_ANALITICO_LEGADO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '12', 'Base de Conhecimento', '7', null FROM DUAL -- fndCod: CONHECIMENTO
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '10', 'Ajuda', '8', null FROM DUAL -- fndCod: PUB_AJUDA
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '75', 'HISTORICO_PARAMETRO_COSIF', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '57', 'MANTER_PARAMETRO_COSIF', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '58', 'HISTORICO_PARAMETRO_SUBCONTA', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '59', 'MANTER_PARAMETRO_SUBCONTA', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '60', 'MANTER_PARAMETRIZACAO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '61', 'ALTERAR_PARAMETRIZACAO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '62', 'INCLUIR_PARAMETRIZACAO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '63', 'LOTE_PARAMETRIZACAO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '64', 'INCLUIR_BATIMENTO_LOTE', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '65', 'LOTE_PARAMETRIZACAO_ESPECIFICO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '66', 'MANTER_INFORMACOES_OPERACIONAIS', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '67', 'MANTER_ACOMPANHAMENTO_BATIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '68', 'MANTER_AVISO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '69', 'VISUALIZAR_AJUDA', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '70', 'MANTER_AJUDA', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '71', 'MANTER_CONHECIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '72', 'VISUALIZAR_CONHECIMENTO', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '73', 'MANTER_RELATORIO_OPERACIONAL', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT '74', 'PARAMETRIZAR_ENVIO_SIGDB', '-1', null FROM DUAL
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NU_FUNCIONALIDADE = D.NU_FUNCIONALIDADE)
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_FUNCIONALIDADE = O.NO_FUNCIONALIDADE, D.NU_ORDENACAO_FUNCIONALIDADE = O.NU_ORDENACAO_FUNCIONALIDADE, D.NU_FUNCIONALIDADE_SUPERIOR = O.NU_FUNCIONALIDADE_SUPERIOR
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_FUNCIONALIDADE, D.NO_FUNCIONALIDADE, D.NU_ORDENACAO_FUNCIONALIDADE, D.NU_FUNCIONALIDADE_SUPERIOR) VALUES (O.NU_FUNCIONALIDADE, O.NO_FUNCIONALIDADE, O.NU_ORDENACAO_FUNCIONALIDADE, O.NU_FUNCIONALIDADE_SUPERIOR)
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,818 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB053_PERFIL D USING (
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 'MCN01' CO_PERFIL, 'Usu?rios gestores' NO_PERFIL FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 'Usu?rios da ?rea de contabilidade' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 'Usu?rios da ?rea de retaguarda' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 'Visitantes' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 'Gestor Operacional' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 'Auditor' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 'Auxiliar de contabilidade' FROM DUAL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.CO_PERFIL = D.CO_PERFIL)
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.CO_PERFIL, D.NO_PERFIL) VALUES (O.CO_PERFIL, O.NO_PERFIL)
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_PERFIL = O.NO_PERFIL
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,866 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --HISTORICO_PARAMETRO_COSIF
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_PARAMETRO_COSIF
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --HISTORICO_PARAMETRO_SUBCONTA
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_PARAMETRO_SUBCONTA
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --ALTERAR_PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --INCLUIR_PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --LOTE_PARAMETRIZACAO_BATIMENTO
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --INCLUIR_BATIMENTO_LOTE
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --LOTE_PARAMETRIZACAO_ESPECIFICO_BATIMENTO
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_INFORMACOES_OPERACIONAIS
[0m[0m14:44:26,908 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_ACOMPANHAMENTO_BATIMENTO
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_AVISO
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --VISUALIZAR_AJUDA
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_AJUDA
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_CONHECIMENTO
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --VISUALIZAR_CONHECIMENTO
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --MANTER_RELATORIO_OPERACIONAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) --PARAMETRIZAR_ENVIO_SIGDB
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB052_FUNCIONALIDADE_PERFIL D USING (
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 'MCN01' CO_PERFIL, 02 NU_FUNCIONALIDADE, 1 IC_FUNCIONALIDADE_VISIVEL, 0 REMOVER FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 05, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 06, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 07, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 08, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 08, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 09, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 09, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 10, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 10, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 10, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 10, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 10, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 11, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 12, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 12, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 12, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 13, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 14, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 14, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 19, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 20, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 23, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 24, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 25, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 26, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 26, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 26, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 27, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 27, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 27, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 28, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 29, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,909 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 30, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 31, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 31, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 31, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 32, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 33, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 34, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 35, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 36, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 37, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 39, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 40, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 41, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 43, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 44, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 45, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 46, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 46, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 46, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 47, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 48, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 49, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 50, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 51, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 51, 1, 1 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 55, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 56, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 75, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 75, 1, 0 FROM DUAL
[0m[0m14:44:26,910 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 75, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 57, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 57, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 57, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 58, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 58, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 58, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 59, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 59, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 59, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 60, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 60, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 61, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 61, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 62, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 62, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 63, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 63, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 64, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 64, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 65, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 65, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 66, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 66, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 66, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 67, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 68, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN04', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN06', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN07', 69, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 70, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 70, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 71, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 71, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 72, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 72, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN03', 72, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 73, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN02', 73, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN05', 73, 1, 1 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'MCN01', 74, 1, 0 FROM DUAL
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.CO_PERFIL = D.CO_PERFIL AND O.NU_FUNCIONALIDADE = D.NU_FUNCIONALIDADE)
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.IC_FUNCIONALIDADE_VISIVEL = D.IC_FUNCIONALIDADE_VISIVEL 
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) DELETE WHERE (O.REMOVER = 1)
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.CO_PERFIL, D.NU_FUNCIONALIDADE, D.IC_FUNCIONALIDADE_VISIVEL) VALUES (O.CO_PERFIL, O.NU_FUNCIONALIDADE, O.IC_FUNCIONALIDADE_VISIVEL) WHERE O.REMOVER != 1
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:26,911 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,153 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB011_CATEGORIA_ITEM_CNHCO D USING (
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 0 NU_CATEGORIA_ITEM_CONHECIMENTO, 'Geral' NO_CATEGORIA_ITEM_CONHECIMENTO FROM DUAL
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NU_CATEGORIA_ITEM_CONHECIMENTO = D.NU_CATEGORIA_ITEM_CONHECIMENTO)
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_CATEGORIA_ITEM_CONHECIMENTO = O.NO_CATEGORIA_ITEM_CONHECIMENTO
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_CATEGORIA_ITEM_CONHECIMENTO, D.NO_CATEGORIA_ITEM_CONHECIMENTO) VALUES (O.NU_CATEGORIA_ITEM_CONHECIMENTO, O.NO_CATEGORIA_ITEM_CONHECIMENTO)
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,154 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB016_TIPO_ACAO_OPERACIONAL D USING (
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 0 NU_TIPO_ACAO, 'Desconhecida' NO_TIPO_ACAO FROM DUAL
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 1, 'Inclus?o' FROM DUAL
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 2, 'Altera??o' FROM DUAL
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 3, 'Exclus?o' FROM DUAL
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NU_TIPO_ACAO = D.NU_TIPO_ACAO)
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_TIPO_ACAO = O.NO_TIPO_ACAO
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_TIPO_ACAO, D.NO_TIPO_ACAO) VALUES (O.NU_TIPO_ACAO, O.NO_TIPO_ACAO)
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,176 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB018_TIPO_INCRA_COSIF D USING (
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 'SDZ' CO_TIPO_INCOERENCIA_COSIF, 'SDZ' SG_TIPO_INCOERENCIA_COSIF, 'Saldo Diferente de Zero' NO_TIPO_INCOERENCIA_COSIF, 1 IC_CRITICIDADE_UNIDADE, 1 IC_CRITICIDADE_CONSOLIDACAO FROM DUAL
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SI', 'SI', 'Saldo Invertido', 2, 2 FROM DUAL
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SDC', 'SDC', 'Saldo COSIF Desativado', 2, 2 FROM DUAL
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.CO_TIPO_INCOERENCIA_COSIF = D.CO_TIPO_INCOERENCIA_COSIF)
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_TIPO_INCOERENCIA_COSIF = O.NO_TIPO_INCOERENCIA_COSIF, D.SG_TIPO_INCOERENCIA_COSIF = COALESCE(D.SG_TIPO_INCOERENCIA_COSIF, O.SG_TIPO_INCOERENCIA_COSIF)
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.CO_TIPO_INCOERENCIA_COSIF, D.SG_TIPO_INCOERENCIA_COSIF, D.NO_TIPO_INCOERENCIA_COSIF, D.IC_CRITICIDADE_UNIDADE, D.IC_CRITICIDADE_CONSOLIDACAO) VALUES (O.CO_TIPO_INCOERENCIA_COSIF, O.SG_TIPO_INCOERENCIA_COSIF, O.NO_TIPO_INCOERENCIA_COSIF, O.IC_CRITICIDADE_UNIDADE, O.IC_CRITICIDADE_CONSOLIDACAO)
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,202 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,237 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB019_CRITICIDADE_COSIF P SET IC_CRITICIDADE_UNIDADE = COALESCE((SELECT S.IC_CRITICIDADE_UNIDADE FROM MCN.MCNTB018_TIPO_INCRA_COSIF S WHERE S.CO_TIPO_INCOERENCIA_COSIF = P.CO_TIPO_INCOERENCIA_COSIF), 1) WHERE IC_CRITICIDADE_UNIDADE IS NULL
[0m[0m14:44:27,237 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,250 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB019_CRITICIDADE_COSIF P SET IC_CRITICIDADE_CONSOLIDACAO = COALESCE((SELECT S.IC_CRITICIDADE_CONSOLIDACAO FROM MCN.MCNTB018_TIPO_INCRA_COSIF S WHERE S.CO_TIPO_INCOERENCIA_COSIF = P.CO_TIPO_INCOERENCIA_COSIF), 1) WHERE IC_CRITICIDADE_CONSOLIDACAO IS NULL
[0m[0m14:44:27,250 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB021_TPO_INCRA_SBCNA_PRDTO D USING (
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	SELECT 'SDZ' CO_TIPO_INCRA_SBCNA_PRDTO, 'SDZ' SG_TIPO_INCRA_SBCNA_PRDTO, 'Saldo Diferente de Zero' NO_TIPO_INCRA_SBCNA_PRDTO, 1 IC_CRITICIDADE_UNIDADE, 1 IC_CRITICIDADE_CONSOLIDACAO FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SI', 'SI', 'Saldo Invertido', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SS', 'SS', 'Subconta possui saldo', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'CI', 'CI', 'COSIF invertido', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'US', 'US', 'Categoria de unidade n?o admite saldo', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'UD', 'UD', 'Utiliza??o em unidade desativada', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'UC', 'UC', 'Utiliza??o em unidade de custos', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SD', 'SD', 'Saldo em subconta desativada', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SCI', 'SCI', 'Saldo Credor Incoerente', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 	UNION ALL SELECT 'SDI', 'SDI', 'Saldo Devedor Incoerente', 2, 2 FROM DUAL
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.CO_TIPO_INCRA_SBCNA_PRDTO = D.CO_TIPO_INCRA_SBCNA_PRDTO)
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_TIPO_INCRA_SBCNA_PRDTO = O.NO_TIPO_INCRA_SBCNA_PRDTO, D.SG_TIPO_INCRA_SBCNA_PRDTO = COALESCE(D.SG_TIPO_INCRA_SBCNA_PRDTO, O.SG_TIPO_INCRA_SBCNA_PRDTO)
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.CO_TIPO_INCRA_SBCNA_PRDTO, D.SG_TIPO_INCRA_SBCNA_PRDTO, D.NO_TIPO_INCRA_SBCNA_PRDTO, D.IC_CRITICIDADE_UNIDADE, D.IC_CRITICIDADE_CONSOLIDACAO) VALUES (O.CO_TIPO_INCRA_SBCNA_PRDTO, O.SG_TIPO_INCRA_SBCNA_PRDTO, O.NO_TIPO_INCRA_SBCNA_PRDTO, O.IC_CRITICIDADE_UNIDADE, O.IC_CRITICIDADE_CONSOLIDACAO)
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,255 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72) MERGE INTO MCN.MCNTB055_ENTIDADE_BNCRA_CCLCO D USING (
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   SELECT 1 NU_ENTIDADE, 'FUNDO DE APOIO AO DESENVOLVIMENTO SOCIAL' NO_ENTIDADE, 'FAS' NO_ABREVIADO_ENTDE, 2 IC_PROCESSAMENTO_CONCILIACAO FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 2, 'FUNDO DE COMPENSACAO DE VARIACAO SALARIAL', 'FCVS', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 3, 'PROGRAMA DE CREDITO EDUCATIVO', 'PCE', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 4, 'FUNDO DE GARANTIA POR TEMPO DE SERVICO', 'FGTS', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 5, 'PROGRAMA DE INTEGRACAO SOCIAL', 'PIS', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 6, 'FUNDO DE DESENVOLVIMENTO SOCIAL', 'FDS', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 8, 'SEGURO HABITACIONAL', 'SH', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 9, 'FUNDO PARA PAG PRESTACOES EM CASO PERDA DE RENDA', 'FIEL', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 10, 'FUNDO DE EQUILIBRIO DA SINISTRALIDADE', 'FES', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 11, 'FUNDO CAIXA IBOVESPA EM TITULOS E VAL MOBILIARIOS', 'FAC IBOVESPA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 12, 'FUNDO DE ARRENDAMENTO RESIDENCIAL', 'FAR', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 13, 'LOTERIAS', 'LOTERIAS', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 14, 'FUNDO CAIXA DE APLICACOES EM COTAS V DE FIF', 'FAC COTAS V', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 15, 'FUNDO DE AMPARO AO TRABALHADOR', 'FAT', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 16, 'EMPRESA GESTORA DE ATIVOS', 'EMGEA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 17, 'SECRETARIA DO TESOURO NACIONAL', 'STN', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 18, 'ORLA - PARTICIPA??ES E INVESTIMENTOS S/A', 'ORLA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 20, 'SAUDE-CAIXA', 'SAUDE-CAIXA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 21, 'CART ADMINISTRADA GOV EST RIO JANEIRO - CONTA A', 'CARTEIRA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 22, 'CART ADMINISTRADA GOV EST. RIO JANEIRO - CONTA B', 'CARTEIRA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 23, 'CAIXA PREV 60', 'FIF PREV 60', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 24, 'FUNDO CAIXA FAC PRE DE APLICACAO EM COTAS DE FIF', 'FAC PRE', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 25, 'FUNDO CAIXA FAC PERSONAL', 'FAC PERSONAL', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 26, 'FUNDO CAIXA DE APLICACOES EM COTAS VII DE FIF', 'FAC COTAS VII', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 30, 'FUNDO CAIXA FIF IDEAL', 'FIF IDEAL', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 31, 'SECRETARIA DE ADMINISTRA??O FEDRAL - UNI?O', 'UNI?O/SAF', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 32, 'COMP. DESENV. DOS VALES DO S. FRANCISCO E PARA?BA', 'CODEVASF', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 33, 'DEPARTAMENTO NACIONAL DE ESTRADA DE RODAGEM', 'DNER', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 34, 'EMPRESA DE CORREIOS E TELEGRAFOS', 'ECT', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 35, 'INSTITUTO NAC. DE ALIMENTA??O E NUTRI??O', 'INAN', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 36, 'EMPRESA BRASILEIRA DE TELECOMUNICA??ES', 'EMBRATEL', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 37, 'INSTITUTO BRAS. MEIO AMBIENTE REC. REN. NATURAIS', 'IBAMA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 38, 'INST. NAC. DE COLONIZA??O E REFORMA AGR?RIA', 'INCRA', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 39, 'EMP. BRAS. DE INFRA-ESTRUTURA AEROPORTU?RIA', 'INFRAERO', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 40, 'FUNDO CAIXA AZUL DE INVESTIMENTO FINANCEIRO', 'FAC AZUL', 2 FROM DUAL
[0m[0m14:44:27,282 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 41, 'INSTITUTO NACIONAL DE SEGURO SOCIAL', 'INSS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 42, 'RADIO NACIONAL', 'RADIOBRAS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 43, 'HATITASUL CREDITOS IMOBILI?RIOS SA', 'HABITASUL', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 27, 'FUNDO CAPACITACAO EMIGRANTE', 'FDO CAPAC EMIGRANT', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 7, 'CAIXA PARTICIPACOES S/A', 'CAIXA PAR', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 19, 'CAIXA BANCO DE INVESTIMENTOS S/A', 'CAIXA BI', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 28, 'FUNDO GARANTIDOR DA HABITACAO POPULAR', 'FG HAB', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 29, 'FUNDO DE COMPENSACAO AMBIENTAL ? ICMBIO', 'FCA - ICMBIO', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 44, 'REDE FERROVI?RIA FEDERAL SA', 'RFFSA', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 45, 'FUNDO CAIXA FIF SOBERANO INVESTIMENTO FINANCEIRO', 'FIF SOBERANO', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 46, 'SUPERINTENDENCIA DO DESEN. DO NORDESTE', 'SUDENE', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 47, 'DEP. NACIONAL DE OBRAS CONTRA A SECA', 'DNOCS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 48, 'EMP. BRASILEIRA DE PLANEJAMENTO DE TRANSPORTE', 'GEIPOT', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 49, 'FUNDO CAIXA DE APLICACOES EM COTAS VIII DE FIF', 'FIF VIII', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 50, 'CAIXA ECONOMICA FEDERAL', 'CAIXA', 0 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 51, 'FUNDO CAIXA DE INVESTIMENTO FINANCEIRO PRATICO', 'FAC PRATICO', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 52, 'INST. NACIONAL E PROPRIEDADE INDUSTRIAL', 'INPI', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 53, 'SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS', 'SUFRAMA', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 54, 'BANCO CENTRAL DO BRASIL', 'GACEN', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 55, 'FUNDO CAIXA SENIOR DE INVESTIMENTO FINANCEIRO', 'FAC SENIOR', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 56, 'INSTITUTO DE RESSEGUROS DO BRASIL', 'IRB', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 57, 'CONSORCIO DE MONTAGEM INDUSTRIAL', 'COMIND', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 59, 'FUNDO CAIXA DE APLICACOES EM COTAS IX DE FIF', 'FIF COTAS IX', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 60, 'FUNDO CAIXA FIF DI DE INVESTIMENTO FINANCEIRO', 'FIF DI', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 61, 'SECRETARIA PATRIMONIO DA UNI?O', 'SPU', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 62, 'COMPANHIA HIDREL?TRICA DO S. FRANCISCO', 'CHESF', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 63, 'COMPANHIA BRASILEIRA DE SECURITIZA??O', 'CIBRASEC', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 64, 'CAIXA SEGUROS', 'CAIXA SEGUROS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 65, 'TELEBRAS', 'TELEBRAS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 66, 'MINIST?RIO DA EDUCA??O E CULTURA', 'MEC', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 67, 'FUNDO GARANTIA SAFRA', 'FGS', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 75, 'CARTEIRA ADMINISTRADA GOVERNO DO EST MINAS GERAIS', 'CARTEIRA MG', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 76, 'CAIXA FAC X', 'FAC X', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 80, 'FUNDO CAIXA MASTER DE INVESTIMENTO FINANCEIRO', 'FAC MASTER', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 85, 'CARTEIRA ADMINISTRADA RESERVA TECNICA DA PREVHAB', 'CARTEIRA PREVHAB', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 86, 'FUNDO CAIXA FAC FUNDACOES', 'FAC FUNDA??ES', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 90, 'FUNDO CAIXA FAC DE INVEST FINANCEIRO EXECUTIVO', 'FAC EXECUTIVO', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 94, 'FUNDO CAIXA DE APLICACOES EM COTAS XII DE FIF', 'FIF COTAS XII', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 95, 'FUNDO CAIXA DE APLICACOES EM COTAS XIII DE FIF', 'FIF COTAS XIII', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 98, 'FUNDO CAIXA FAC INVESTIDOR', 'FAC INVESTIDOR', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 103, 'FUNDO CAIXA FAC PREMIO 60', 'FAC PREMIO 60', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 110, 'SAUDE-CAIXA', 'SAUDE-CAIXA', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 111, 'CAIXA FIF INSTITUCIONAL I', 'FIF INSTITUCIONAL I', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 114, 'FUNDO CAIXA FIF IRF-M DE INVESTIMENTO FINANCEIRO', 'FIF IRF-M', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 116, 'FUNDO CAIXA FIF SENIOR III DE INVEST FINANCEIRO', 'FIF SENIOR III', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 125, 'FUNDO CAIXA FIF SENIOR IV DE INVEST FINANCEIRO', 'FIF SENIOR IV', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 68, 'SECRETARIA DE AQUICULTURA E PESCA - SEAP', 'PROFROTA', 2 FROM DUAL
[0m[0m14:44:27,283 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 126, 'FUNDO CAIXA DE APLICACOES EM COTAS XV DE FIF', 'FIF COTAS XV', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 130, 'FUNDO CAIXA FAC ATUARIAL DE APLIC EM COTAS DE FIF', 'FAC ATUARIAL', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 131, 'FUNDO CAIXA FIF PATRIMONIO DE INVEST FINANCEIRO', 'FIF PATRIMONIAL', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 133, 'FUNDO CAIXA FIF INST III DE INVEST FINANCEIRO', 'FIF INST III', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 136, 'CART ADM GOV EST RIO GRANDE DO SUL - GARANTIA', 'CARTEIRA RS-GARANTIA', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 137, 'CART ADM GOV DO EST RIO GRANDE SUL - BLOQUEIO', 'CARTEIRA RS-BLOQUEIO', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 138, 'FUNDO CAIXA FIF INST IV DE INVEST FINANCEIRO', 'FIF INST. IV', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 145, 'FUNDO CAIXA FAC MULTICARTEIRA RV 30', 'FAC MULTIL RV 30', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 148, 'FUNDO CAIXA FIF INST VII DE INVEST FINANCEIRO', 'FIF INST VII', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 149, 'FUNDO CAIXA INVEST. EM TIT VAL. MOB. PETROBRAS', 'FAC PETROBRAS', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 155, 'CAIXA FUNDO MUTUO PRIVATIZACAO - FGTS PETROBRAS II', 'FIF PETROBRAS II', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 156, 'CAIXA FUNDO MUTUO PRIVATIZACAO- FGTS PETROBRAS III', 'FIF PETROBRAS III', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 157, 'CAIXA FUNDO MUTUO PRIVATIZACAO - FGTS PETROBRAS IV', 'FIF PETROGRAS IV', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 160, 'CART ADM GOV ESTADO AM/CONTING PASSIVAS-BEA', 'CARTEIRA AM - BEA', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 161, 'CART ADMI GOV ESTADO PIAUI/CONTING PASSIVAS-BEP', 'CARTEIRA PI - BEP', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 162, 'CART ADM GOV EST DO PIAUI/CONTING PASSIVAS-BEP/PDV', 'CARTEIRA PI -BEP/PDV', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 165, 'FUNDO DE INVEST. FINANCEIRO CAIXA BOA VIAGEM - PE', 'FIF BOA VIAGEM PE', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 168, 'FUNDO PREINVEST CAIXA DE INV. FINANC. - RENDA FIXA', 'FIF RENDA FIXA', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 169, 'FUNDO PREINVEST CAIXA INV. FINANC - COMPOSTO RV15', 'FIF COMPOSTO RV15', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 170, 'FUNDO PREINVEST CAIXA INV. FINANC. - COMPOSTO RV30', 'FIF COMPOSTO RV30', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 173, 'CART ADM GOV DO EST DE GOIAS - CONTING PASSIVAS', 'CARTEIRA GO-CONTING', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 177, 'CAIXA FIF INSTITUCIONAL X', 'FIF INST. X', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 183, 'FUNDO CAIXA FIF PORT PREFIXADO INVEST. FINANCEIRO', 'FIF PORT. PREFIXADO', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 185, 'FUNDO CAIXA FIF INSTL XXXII DE INVEST FINANCEIRO', 'FIF INST. XXXII', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 187, 'FUNDO CAIXA FIF INST XVIII INVEST. FINANCEIRO', 'FIF INST. XVIII', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 189, 'FUNDO CAIXA FIF INST XX INVEST. FINANCEIRO', 'FIF INST. XX', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 192, 'FUNDO CAIXA FIF INST XIX DE INVEST FINANCEIRO', 'FIF INST XIX', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 196, 'FUNDO CAIXA FIF SENIOR DI INVEST FINANCEIRO', 'FIF SENIOR DI', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 200, 'FUNDO CAIXA DE APLICACOES EM COTAS XXV DE FIF', 'FIF COTAS XXV', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 5394, 'ade de Balan?o Contabil Entid', 'ade', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 58, 'FUNDO DE GARANTIA PARA CONSTRUCAO NAVAL', 'FGCN', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 74, 'FUNDO DE COMPENSACOES AMBIENTAIS', 'FCA', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 81, 'IFRS', 'IFRS', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 77, 'FUNDO GARANTIDOR DE PARCERIAS PUBLICO-PRIVADAS', 'FUNGEP-F GAR PAR P P', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 300, 'CAIXAPAR - BR GAAP', 'CAIXAPAR-BR GAAP', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 99, 'CAIXA CARTOES HOLDING', 'CARTOES HOLDING', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 69, 'FUNDO COMPENSACOES AMBIENTAIS MUNICIPAIS', 'FCA - MUNICIPAIS', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 82, 'CAIXAPAR-BR GAAP', 'CAIXAPAR-BR GAAP', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 83, 'CAIXA FISCO', 'CAIXA FISCO', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 79, 'FUNDO EST GAR PROJ PARC PUB-PRIV EST AMAZONAS', 'FGPPP-ESTAD AMAZONAS', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 71, 'CAIXAPAR-BR GAAP', 'CAIXAPAR-BR GAAP', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 78, 'FUNDO GARANT PARC PUB-PRIV SERV SAN BASICO MACAE', 'FGPSB - MACAE', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72)   UNION ALL SELECT 70, 'FUNDO COMPENSACOES AMBIENTAIS ESTADUAIS', 'FCA - ESTADUAL', 2 FROM DUAL
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72) ) O ON (O.NU_ENTIDADE = D.NU_ENTIDADE)
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN MATCHED THEN UPDATE SET D.NO_ENTIDADE = O.NO_ENTIDADE, D.NO_ABREVIADO_ENTDE = O.NO_ABREVIADO_ENTDE
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72) WHEN NOT MATCHED THEN INSERT (D.NU_ENTIDADE, D.NO_ENTIDADE, D.NO_ABREVIADO_ENTDE, D.IC_PROCESSAMENTO_CONCILIACAO) VALUES (O.NU_ENTIDADE, O.NO_ENTIDADE, O.NO_ABREVIADO_ENTDE, O.IC_PROCESSAMENTO_CONCILIACAO)
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,284 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,380 INFO  [stdout] (ServerService Thread Pool -- 72) UPDATE MCN.MCNTB042_RLCO_SUBCONTA_PRODUTO SET NU_ENTIDADE = 50 WHERE NU_ENTIDADE IS NULL
[0m[0m14:44:27,380 INFO  [stdout] (ServerService Thread Pool -- 72) 
[0m[0m14:44:27,434 INFO  [stdout] (ServerService Thread Pool -- 72) -- Garanto o reajuste das refer?ncias de apura??o de par?metros por subconta produto e batimento, agora que passaram a existir somente 2 tipos: di?ria ou mensal.
[0m[0m14:44:27,434 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB020_PRMTO_SBCNA_PRDTO SET IC_REFERENCIA_APURACAO = 1 WHERE IC_REFERENCIA_APURACAO <> 5;
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB039_PARAMETRIZACAO_BTMNO SET IC_REFERENCIA_APURACAO = 1 WHERE IC_REFERENCIA_APURACAO <> 5;
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) -- Garanto o preenchimento do novo indicador de fechamento mensal de saldos por subconta produto e batimento.
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB027_SALDO_INCRE_SUBCONTA SET IC_FECHAMENTO_MENSAL = 2;
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB027_SALDO_INCRE_SUBCONTA SET IC_FECHAMENTO_MENSAL = 1 WHERE DT_BALANCETE_SALDO_SUBCONTA IN(SELECT MAX(DT_BALANCETE_SALDO_SUBCONTA) FROM MCN.MCNTB027_SALDO_INCRE_SUBCONTA WHERE DT_BALANCETE_SALDO_SUBCONTA < TRUNC(SYSDATE, 'MONTH') GROUP BY TRUNC(DT_BALANCETE_SALDO_SUBCONTA, 'MONTH'));
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB041_BATIMENTO SET IC_FECHAMENTO_MENSAL = 2;
[0m[0m14:44:27,435 INFO  [stdout] (ServerService Thread Pool -- 72) --UPDATE MCN.MCNTB041_BATIMENTO SET IC_FECHAMENTO_MENSAL = 1 WHERE DT_BALANCETE IN(SELECT MAX(DT_BALANCETE) FROM MCN.MCNTB041_BATIMENTO WHERE DT_BALANCETE < TRUNC(SYSDATE, 'MONTH') GROUP BY TRUNC(DT_BALANCETE, 'MONTH'));
[0m[0m14:44:27,439 INFO  [br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener] (ServerService Thread Pool -- 72) Processamento do arquivo update.sql finalizado.
[0m[0m14:44:27,439 INFO  [br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener] (ServerService Thread Pool -- 72) ALE - verificar pasta de cacert - Trust store location: /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
[0m[0m14:44:27,439 INFO  [br.gov.caixa.bsb.simcn.schedule.SimcnStartupListener] (ServerService Thread Pool -- 72) ALE - verificar pasta upload - SIMCN STORAGE: /simcn
[0m[0m14:44:27,471 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 38) WFLYSRV0010: Deployed "simcn-backend.ear" (runtime-name : "simcn-backend.ear")
[0m[0m14:44:27,502 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m14:44:27,505 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started in 16275ms - Started 1438 of 1586 services (329 services are lazy, passive or on-demand)
[0m[0m14:44:27,507 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
[0m[0m14:44:27,507 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
[0m[0m14:44:27,507 INFO  [com.arjuna.ats.jbossatx] (Controller Boot Thread) ARJUNA032035: Resuming transaction recovery manager
[0m
