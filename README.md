/opt/jboss/bin/standalone.conf: line 43: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/jre-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=2048m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sisam -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sisam-backend-internet-tqs -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Jul 10, 2026 4:09:49 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-10 16:09:50.439 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[0m16:09:51,350 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.2.Final-redhat-00001
[0m[0m16:09:51,750 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m16:09:51,758 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m16:09:51,959 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.0.GA (WildFly Core 15.0.2.Final-redhat-00001) starting
[0m[0m16:09:52,115 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m16:09:53,616 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.3.Final-redhat-00001
[0m[0m16:09:55,247 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 35) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/fb/62f492ef5e47aa9eaefd43bfe8c4c4902dca5e/content
[0m[0m16:09:55,537 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[0m16:09:55,543 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m16:09:55,552 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.4.Final-redhat-00001
[0m[0m16:09:55,619 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.4.Final-redhat-00001
[0m[0m16:09:55,631 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m16:09:55,717 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m16:09:55,717 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m16:09:55,717 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.1.Final-redhat-00001
[0m[0m16:09:55,718 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m16:09:55,720 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
[0m[0m16:09:55,720 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 67) WFLYNAM0001: Activating Naming Subsystem
[0m[0m16:09:55,724 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m16:09:55,725 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m16:09:55,816 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 66) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m16:09:55,817 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
[0m[0m16:09:56,174 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.20.SP1-redhat-00001
[0m[0m16:09:56,320 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.4.30.Final-redhat-00001)
[0m[0m16:09:56,417 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 6.4)
[0m[0m16:09:56,420 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.5.Final-redhat-00001 starting
[0m[0m16:09:56,420 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[31m16:09:56,426 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 44) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "datasources"),
    ("xa-data-source" => "sisam-sqlserver-xa")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${VAULT::SISAM-BACKEND-INTERNET-DES::SISAM_DATASOURCE_PASSWORD::1}'"
[0m[0m16:09:56,521 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m16:09:56,521 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m16:09:56,524 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sqlserver
[0m[0m16:09:56,647 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m16:09:56,722 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[33m16:09:56,823 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m2026-07-10 16:09:57,118 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
2026-07-10 16:09:57,125 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.4.14.CP, one-off patches include: none
2026-07-10 16:09:57,129 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-1) WFLYIIOP0009: CORBA ORB Service started
2026-07-10 16:09:57,131 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
2026-07-10 16:09:57,139 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
2026-07-10 16:09:57,217 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sisam-backend-internet.war" (runtime-name: "sisam-backend-internet.war")
2026-07-10 16:09:57,226 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
2026-07-10 16:09:57,227 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
2026-07-10 16:09:57,231 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-07-10 16:09:57,236 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-10 16:09:57,324 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-10 16:09:57,336 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-07-10 16:09:57,642 INFO  [org.jboss.ws.common.management] (MSC service thread 1-1) JBWS022052: Starting JBossWS 5.4.2.Final-redhat-00001 (Apache CXF 3.3.9.redhat-00001) 
2026-07-10 16:10:03,119 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for SISAM_INTERNET_PU
2026-07-10 16:10:03,620 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Second level cache enabled for sisam-backend-internet.war#SISAM_INTERNET_PU
2026-07-10 16:10:03,926 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sisam-backend-internet.war
2026-07-10 16:10:04,027 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 78) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
2026-07-10 16:10:04,027 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 78) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 20.00MB, but the OS only allocated 212.99KB
2026-07-10 16:10:04,027 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 78) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
2026-07-10 16:10:04,028 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 78) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 25.00MB, but the OS only allocated 212.99KB
2026-07-10 16:10:04,145 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.22.Final-redhat-00002
2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AdministracaoDadosFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/AdministracaoDadosFacade!br.gov.caixa.sisam.internet.control.facade.AdministracaoDadosFacade
	java:app/sisam-bell/AdministracaoDadosFacade!br.gov.caixa.sisam.internet.control.facade.AdministracaoDadosFacade
	java:module/AdministracaoDadosFacade!br.gov.caixa.sisam.internet.control.facade.AdministracaoDadosFacade
	java:global/sisam-bell/AdministracaoDadosFacade
	java:app/sisam-bell/AdministracaoDadosFacade
	java:module/AdministracaoDadosFacade

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GeneroSocialService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/GeneroSocialService!br.gov.caixa.sisam.commons.service.GeneroSocialService
	java:app/sisam-bell/GeneroSocialService!br.gov.caixa.sisam.commons.service.GeneroSocialService
	java:module/GeneroSocialService!br.gov.caixa.sisam.commons.service.GeneroSocialService
	java:global/sisam-bell/GeneroSocialService
	java:app/sisam-bell/GeneroSocialService
	java:module/GeneroSocialService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'FaixaEtariaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/FaixaEtariaService!br.gov.caixa.sisam.commons.service.FaixaEtariaService
	java:app/sisam-bell/FaixaEtariaService!br.gov.caixa.sisam.commons.service.FaixaEtariaService
	java:module/FaixaEtariaService!br.gov.caixa.sisam.commons.service.FaixaEtariaService
	java:global/sisam-bell/FaixaEtariaService
	java:app/sisam-bell/FaixaEtariaService
	java:module/FaixaEtariaService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeCaixaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/UnidadeCaixaService!br.gov.caixa.sisam.commons.service.UnidadeCaixaService
	java:app/sisam-bell/UnidadeCaixaService!br.gov.caixa.sisam.commons.service.UnidadeCaixaService
	java:module/UnidadeCaixaService!br.gov.caixa.sisam.commons.service.UnidadeCaixaService
	java:global/sisam-bell/UnidadeCaixaService
	java:app/sisam-bell/UnidadeCaixaService
	java:module/UnidadeCaixaService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'EstadoNegocioService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/EstadoNegocioService!br.gov.caixa.sisam.commons.service.EstadoNegocioService
	java:app/sisam-bell/EstadoNegocioService!br.gov.caixa.sisam.commons.service.EstadoNegocioService
	java:module/EstadoNegocioService!br.gov.caixa.sisam.commons.service.EstadoNegocioService
	java:global/sisam-bell/EstadoNegocioService
	java:app/sisam-bell/EstadoNegocioService
	java:module/EstadoNegocioService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TermoAceiteService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/TermoAceiteService!br.gov.caixa.sisam.internet.control.service.TermoAceiteService
	java:app/sisam-bell/TermoAceiteService!br.gov.caixa.sisam.internet.control.service.TermoAceiteService
	java:module/TermoAceiteService!br.gov.caixa.sisam.internet.control.service.TermoAceiteService
	java:global/sisam-bell/TermoAceiteService
	java:app/sisam-bell/TermoAceiteService
	java:module/TermoAceiteService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/PessoaService!br.gov.caixa.sisam.commons.service.PessoaService
	java:app/sisam-bell/PessoaService!br.gov.caixa.sisam.commons.service.PessoaService
	java:module/PessoaService!br.gov.caixa.sisam.commons.service.PessoaService
	java:global/sisam-bell/PessoaService
	java:app/sisam-bell/PessoaService
	java:module/PessoaService

2026-07-10 16:10:04,344 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PropostaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/PropostaService!br.gov.caixa.sisam.internet.control.service.PropostaService
	java:app/sisam-bell/PropostaService!br.gov.caixa.sisam.internet.control.service.PropostaService
	java:module/PropostaService!br.gov.caixa.sisam.internet.control.service.PropostaService
	java:global/sisam-bell/PropostaService
	java:app/sisam-bell/PropostaService
	java:module/PropostaService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CategoriaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/CategoriaService!br.gov.caixa.sisam.commons.service.CategoriaService
	java:app/sisam-bell/CategoriaService!br.gov.caixa.sisam.commons.service.CategoriaService
	java:module/CategoriaService!br.gov.caixa.sisam.commons.service.CategoriaService
	java:global/sisam-bell/CategoriaService
	java:app/sisam-bell/CategoriaService
	java:module/CategoriaService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TermoAceiteFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/TermoAceiteFacade!br.gov.caixa.sisam.internet.control.facade.TermoAceiteFacade
	java:app/sisam-bell/TermoAceiteFacade!br.gov.caixa.sisam.internet.control.facade.TermoAceiteFacade
	java:module/TermoAceiteFacade!br.gov.caixa.sisam.internet.control.facade.TermoAceiteFacade
	java:global/sisam-bell/TermoAceiteFacade
	java:app/sisam-bell/TermoAceiteFacade
	java:module/TermoAceiteFacade

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PropostaFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/PropostaFacade!br.gov.caixa.sisam.internet.control.facade.PropostaFacade
	java:app/sisam-bell/PropostaFacade!br.gov.caixa.sisam.internet.control.facade.PropostaFacade
	java:module/PropostaFacade!br.gov.caixa.sisam.internet.control.facade.PropostaFacade
	java:global/sisam-bell/PropostaFacade
	java:app/sisam-bell/PropostaFacade
	java:module/PropostaFacade

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PatrocinioFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/PatrocinioFacade!br.gov.caixa.sisam.internet.control.facade.PatrocinioFacade
	java:app/sisam-bell/PatrocinioFacade!br.gov.caixa.sisam.internet.control.facade.PatrocinioFacade
	java:module/PatrocinioFacade!br.gov.caixa.sisam.internet.control.facade.PatrocinioFacade
	java:global/sisam-bell/PatrocinioFacade
	java:app/sisam-bell/PatrocinioFacade
	java:module/PatrocinioFacade

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogAuditoriaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/LogAuditoriaService!br.gov.caixa.sisam.commons.service.auditoria.LogAuditoriaService
	java:app/sisam-bell/LogAuditoriaService!br.gov.caixa.sisam.commons.service.auditoria.LogAuditoriaService
	java:module/LogAuditoriaService!br.gov.caixa.sisam.commons.service.auditoria.LogAuditoriaService
	java:global/sisam-bell/LogAuditoriaService
	java:app/sisam-bell/LogAuditoriaService
	java:module/LogAuditoriaService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProponenteService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/ProponenteService!br.gov.caixa.sisam.internet.control.service.ProponenteService
	java:app/sisam-bell/ProponenteService!br.gov.caixa.sisam.internet.control.service.ProponenteService
	java:module/ProponenteService!br.gov.caixa.sisam.internet.control.service.ProponenteService
	java:global/sisam-bell/ProponenteService
	java:app/sisam-bell/ProponenteService
	java:module/ProponenteService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ApiManagerFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/ApiManagerFacade!br.gov.caixa.sisam.internet.control.facade.ApiManagerFacade
	java:app/sisam-bell/ApiManagerFacade!br.gov.caixa.sisam.internet.control.facade.ApiManagerFacade
	java:module/ApiManagerFacade!br.gov.caixa.sisam.internet.control.facade.ApiManagerFacade
	java:global/sisam-bell/ApiManagerFacade
	java:app/sisam-bell/ApiManagerFacade
	java:module/ApiManagerFacade

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TipoPatrocinioService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/TipoPatrocinioService!br.gov.caixa.sisam.commons.service.TipoPatrocinioService
	java:app/sisam-bell/TipoPatrocinioService!br.gov.caixa.sisam.commons.service.TipoPatrocinioService
	java:module/TipoPatrocinioService!br.gov.caixa.sisam.commons.service.TipoPatrocinioService
	java:global/sisam-bell/TipoPatrocinioService
	java:app/sisam-bell/TipoPatrocinioService
	java:module/TipoPatrocinioService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ClasseSocialService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/ClasseSocialService!br.gov.caixa.sisam.commons.service.ClasseSocialService
	java:app/sisam-bell/ClasseSocialService!br.gov.caixa.sisam.commons.service.ClasseSocialService
	java:module/ClasseSocialService!br.gov.caixa.sisam.commons.service.ClasseSocialService
	java:global/sisam-bell/ClasseSocialService
	java:app/sisam-bell/ClasseSocialService
	java:module/ClasseSocialService

2026-07-10 16:10:04,345 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/OcorrenciaService!br.gov.caixa.sisam.internet.control.service.OcorrenciaService
	java:app/sisam-bell/OcorrenciaService!br.gov.caixa.sisam.internet.control.service.OcorrenciaService
	java:module/OcorrenciaService!br.gov.caixa.sisam.internet.control.service.OcorrenciaService
	java:global/sisam-bell/OcorrenciaService
	java:app/sisam-bell/OcorrenciaService
	java:module/OcorrenciaService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MunicipioService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/MunicipioService!br.gov.caixa.sisam.commons.service.MunicipioService
	java:app/sisam-bell/MunicipioService!br.gov.caixa.sisam.commons.service.MunicipioService
	java:module/MunicipioService!br.gov.caixa.sisam.commons.service.MunicipioService
	java:global/sisam-bell/MunicipioService
	java:app/sisam-bell/MunicipioService
	java:module/MunicipioService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'DatabaseService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/DatabaseService!br.gov.caixa.sisam.commons.service.db.DatabaseService
	java:app/sisam-bell/DatabaseService!br.gov.caixa.sisam.commons.service.db.DatabaseService
	java:module/DatabaseService!br.gov.caixa.sisam.commons.service.db.DatabaseService
	java:global/sisam-bell/DatabaseService
	java:app/sisam-bell/DatabaseService
	java:module/DatabaseService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PortalDivulgacaoService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/PortalDivulgacaoService!br.gov.caixa.sisam.commons.service.PortalDivulgacaoService
	java:app/sisam-bell/PortalDivulgacaoService!br.gov.caixa.sisam.commons.service.PortalDivulgacaoService
	java:module/PortalDivulgacaoService!br.gov.caixa.sisam.commons.service.PortalDivulgacaoService
	java:global/sisam-bell/PortalDivulgacaoService
	java:app/sisam-bell/PortalDivulgacaoService
	java:module/PortalDivulgacaoService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContrapartidaService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/ContrapartidaService!br.gov.caixa.sisam.commons.service.ContrapartidaService
	java:app/sisam-bell/ContrapartidaService!br.gov.caixa.sisam.commons.service.ContrapartidaService
	java:module/ContrapartidaService!br.gov.caixa.sisam.commons.service.ContrapartidaService
	java:global/sisam-bell/ContrapartidaService
	java:app/sisam-bell/ContrapartidaService
	java:module/ContrapartidaService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'EmpregadoService' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/EmpregadoService!br.gov.caixa.sisam.commons.service.EmpregadoService
	java:app/sisam-bell/EmpregadoService!br.gov.caixa.sisam.commons.service.EmpregadoService
	java:module/EmpregadoService!br.gov.caixa.sisam.commons.service.EmpregadoService
	java:global/sisam-bell/EmpregadoService
	java:app/sisam-bell/EmpregadoService
	java:module/EmpregadoService

2026-07-10 16:10:04,346 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProponenteFacade' in deployment unit 'deployment "sisam-backend-internet.war"' are as follows:

	java:global/sisam-bell/ProponenteFacade!br.gov.caixa.sisam.internet.control.facade.ProponenteFacade
	java:app/sisam-bell/ProponenteFacade!br.gov.caixa.sisam.internet.control.facade.ProponenteFacade
	java:module/ProponenteFacade!br.gov.caixa.sisam.internet.control.facade.ProponenteFacade
	java:global/sisam-bell/ProponenteFacade
	java:app/sisam-bell/ProponenteFacade
	java:module/ProponenteFacade

2026-07-10 16:10:04,927 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for sisam-backend-internet.war#SISAM_INTERNET_PU
2026-07-10 16:10:05,019 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-1) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
2026-07-10 16:10:05,032 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 12.4)
2026-07-10 16:10:05,051 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 3.1.6 (redhat)
2026-07-10 16:10:05,154 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sisam-backend-internet.war_com.microsoft.sqlserver.jdbc.SQLServerDriver_12_4
2026-07-10 16:10:07,034 INFO  [org.jgroups.protocols.pbcast.GMS] (ServerService Thread Pool -- 78) sisam-backend-internet-tqs-7-4f826: no members discovered after 3002 ms: creating cluster as coordinator
2026-07-10 16:10:08,134 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 81) ISPN000128: Infinispan version: Red Hat Data Grid 'Infinispan 11.0.9.Final-redhat-00001' 8.1.1.GA
2026-07-10 16:10:08,333 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 81) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-10 16:10:08,333 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 80) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-10 16:10:08,333 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 78) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-10 16:10:08,333 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 82) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
2026-07-10 16:10:08,719 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000078: Starting JGroups channel ejb
2026-07-10 16:10:08,719 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000078: Starting JGroups channel ejb
2026-07-10 16:10:08,719 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000078: Starting JGroups channel ejb
2026-07-10 16:10:08,719 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 78) ISPN000078: Starting JGroups channel ejb
2026-07-10 16:10:08,721 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000094: Received new cluster view for channel ejb: [sisam-backend-internet-tqs-7-4f826|0] (1) [sisam-backend-internet-tqs-7-4f826]
2026-07-10 16:10:08,721 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000094: Received new cluster view for channel ejb: [sisam-backend-internet-tqs-7-4f826|0] (1) [sisam-backend-internet-tqs-7-4f826]
2026-07-10 16:10:08,721 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000094: Received new cluster view for channel ejb: [sisam-backend-internet-tqs-7-4f826|0] (1) [sisam-backend-internet-tqs-7-4f826]
2026-07-10 16:10:08,721 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 78) ISPN000094: Received new cluster view for channel ejb: [sisam-backend-internet-tqs-7-4f826|0] (1) [sisam-backend-internet-tqs-7-4f826]
2026-07-10 16:10:08,726 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000079: Channel ejb local address is sisam-backend-internet-tqs-7-4f826, physical addresses are [127.0.0.1:55200]
2026-07-10 16:10:08,727 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000079: Channel ejb local address is sisam-backend-internet-tqs-7-4f826, physical addresses are [127.0.0.1:55200]
2026-07-10 16:10:08,726 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000079: Channel ejb local address is sisam-backend-internet-tqs-7-4f826, physical addresses are [127.0.0.1:55200]
2026-07-10 16:10:08,726 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 78) ISPN000079: Channel ejb local address is sisam-backend-internet-tqs-7-4f826, physical addresses are [127.0.0.1:55200]
2026-07-10 16:10:08,822 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-07-10 16:10:08,822 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-07-10 16:10:09,220 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 78) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
2026-07-10 16:10:09,316 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sisam-backend-internet.war")]) - failure description: {
    "WFLYCTL0412: Required services that are not installed:" => ["jboss.naming.context.java.datasources.sqlserver.sisam-xa"],
    "WFLYCTL0180: Services with missing/unavailable dependencies" => [
        "jboss.persistenceunit.\"sisam-backend-internet.war#SISAM_INTERNET_PU\" is missing [jboss.naming.context.java.datasources.sqlserver.sisam-xa]",
        "jboss.persistenceunit.\"sisam-backend-internet.war#SISAM_INTERNET_PU\".__FIRST_PHASE__ is missing [jboss.naming.context.java.datasources.sqlserver.sisam-xa]",
        "jboss.naming.context.java.module.sisam-bell.sisam-bell.env.\"br.gov.caixa.sisam.commons.service.db.DatabaseService\".dataSource is missing [jboss.naming.context.java.datasources.sqlserver.sisam-xa]"
    ]
}
2026-07-10 16:10:09,344 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "datasources"),
    ("xa-data-source" => "sisam-sqlserver-xa")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${VAULT::SISAM-BACKEND-INTERNET-DES::SISAM_DATASOURCE_PASSWORD::1}'"
2026-07-10 16:10:09,350 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 45) WFLYSRV0010: Deployed "sisam-backend-internet.war" (runtime-name : "sisam-backend-internet.war")
2026-07-10 16:10:09,417 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0184:    New missing/unsatisfied dependencies:
      service jboss.naming.context.java.datasources.sqlserver.sisam-xa (missing) dependents: [service jboss.persistenceunit."sisam-backend-internet.war#SISAM_INTERNET_PU", service jboss.persistenceunit."sisam-backend-internet.war#SISAM_INTERNET_PU".__FIRST_PHASE__, service jboss.naming.context.java.module.sisam-bell.sisam-bell.env."br.gov.caixa.sisam.commons.service.db.DatabaseService".dataSource] 
WFLYCTL0448: 91 additional services are down due to their dependencies being missing or failed
2026-07-10 16:10:09,515 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-07-10 16:10:09,517 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.0.GA (WildFly Core 15.0.2.Final-redhat-00001) started (with errors) in 18575ms - Started 801 of 1120 services (95 services failed or missing dependencies, 446 services are lazy, passive or on-demand)
2026-07-10 16:10:09,519 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-07-10 16:10:09,519 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
