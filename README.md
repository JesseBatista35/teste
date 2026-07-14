Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms96m -Xmx900m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siabm-autenticacao-api -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siabm-autenticacao-api-des -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND -Djava.net.useSystemProxies=false 

=========================================================================

2026-07-14 10:29:08.412 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-07-14 10:29:08.490 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siabm-autenticacao-api on Java 1.8.0_301 (Oracle Corporation) Linux 6.1.18-200.fc37.x86_64
2026-07-14 10:29:08.495 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
[0m10:29:10,710 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m10:29:11,588 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m10:29:11,875 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m10:29:12,373 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m10:29:12,580 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m10:29:13,670 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-07-14 10:29:13.592 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
[0m[0m10:29:15,377 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m10:29:15,880 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 11) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m10:29:17,279 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:29:17,571 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 22) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:29:17,574 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 37) WFLYCTL0028: Attribute 'location' in the resource at address '/subsystem=elytron/credential-store=DSKeystore' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:29:18,574 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-07-14 10:29:18.574 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
[0m[0m10:29:18,600 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 10) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/b5/eb9637f2b0a07d72376b56109600e0055fa792/content
[0m[0m10:29:18,681 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m10:29:18,773 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.8.9.Final-redhat-00001
[0m[0m10:29:18,780 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[0m10:29:18,980 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
[0m[0m10:29:19,084 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m10:29:19,086 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m10:29:19,178 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
[0m[33m10:29:19,169 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m10:29:19,171 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
[0m[0m10:29:19,285 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
[0m[0m10:29:19,288 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m10:29:19,174 INFO  [org.jboss.as.connector] (MSC service thread 1-5) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m10:29:19,376 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
[0m[0m10:29:19,576 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m10:29:19,570 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m10:29:19,670 INFO  [org.jboss.as.security] (MSC service thread 1-5) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m10:29:19,674 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m10:29:19,785 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m10:29:19,869 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-8) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m10:29:19,882 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
[0m[0m10:29:20,174 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m10:29:20,278 INFO  [org.jboss.remoting] (MSC service thread 1-6) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m10:29:20,383 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[33m10:29:20,973 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-8) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m10:29:21,281 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m10:29:21,575 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
[0m[0m10:29:21,576 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
[0m[0m10:29:21,779 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m10:29:21,976 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Started server default-server.
[0m[0m10:29:21,977 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
[0m[0m10:29:21,979 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
[0m[0m10:29:22,378 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m10:29:22,382 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
[0m[0m10:29:22,698 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m10:29:22,874 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-7) WFLYIIOP0009: CORBA ORB Service started
[0m[0m10:29:22,879 INFO  [org.jboss.as.patching] (MSC service thread 1-6) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[33m10:29:22,984 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m10:29:23,074 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-7) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m10:29:23,170 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "siabm-autenticacao-api.war" (runtime-name: "siabm-autenticacao-api.war")
[0m[0m10:29:23,269 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m10:29:23,287 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Bound data source [java:jboss/jdbc/SIABM04]
[0m[0m10:29:23,871 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[33m10:29:32,175 WARN  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'bean-discovery-mode' is not allowed to appear in element 'beans'.
[0m[33m10:29:32,176 WARN  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'version' is not allowed to appear in element 'beans'.
[0m[0m10:29:32,192 INFO  [org.jboss.as.jpa] (MSC service thread 1-7) WFLYJPA0002: Read persistence.xml for SIABM04_DESENV
[0m[0m10:29:32,974 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
[0m[33m10:29:33,772 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
[0m[33m10:29:33,773 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 20.00MB, but the OS only allocated 212.99KB
[0m[33m10:29:33,773 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
[0m[33m10:29:33,773 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 25.00MB, but the OS only allocated 212.99KB
[0m[0m10:29:33,889 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment siabm-autenticacao-api.war
[0m[0m10:29:34,184 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m10:29:34,382 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoCpfServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:module/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl
	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl
	java:module/SituacaoCpfServiceImpl

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenHelper' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:app/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:module/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:global/siabm-autenticacao-api/TokenHelper
	java:app/siabm-autenticacao-api/TokenHelper
	java:module/TokenHelper

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SIICOClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:app/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:module/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:global/siabm-autenticacao-api/SIICOClient
	java:app/siabm-autenticacao-api/SIICOClient
	java:module/SIICOClient

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:app/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:module/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:global/siabm-autenticacao-api/TokenManagerSSO
	java:app/siabm-autenticacao-api/TokenManagerSSO
	java:module/TokenManagerSSO

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:module/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
	java:module/PessoaBiometriaDedoServiceImpl

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrigemServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:module/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl
	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl
	java:module/CanalOrigemServiceImpl

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:module/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl
	java:module/AutenticacaoServiceImpl

[0m[0m10:29:34,383 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ConsultaAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:module/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
	java:module/ConsultaAutenticacaoServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:module/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl
	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl
	java:module/PessoaBiometriaServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:module/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl
	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl
	java:module/RegistroTransacaoServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialNuvemImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:module/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
	java:module/AutenticacaoFacialNuvemImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PreAutorizacaoAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:module/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
	java:module/PreAutorizacaoAutenticacaoServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HsmServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:app/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:module/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:global/siabm-autenticacao-api/HsmServiceImpl
	java:app/siabm-autenticacao-api/HsmServiceImpl
	java:module/HsmServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'JcaCryptoService' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:app/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:module/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:global/siabm-autenticacao-api/JcaCryptoService
	java:app/siabm-autenticacao-api/JcaCryptoService
	java:module/JcaCryptoService

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrdemDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:module/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
	java:module/CanalOrdemDedoServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:app/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:module/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:global/siabm-autenticacao-api/TimerTokenSSO
	java:app/siabm-autenticacao-api/TimerTokenSSO
	java:module/TimerTokenSSO

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoOrdemTemplateServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:module/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
	java:module/HistoricoOrdemTemplateServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaRepository' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:app/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:module/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:global/siabm-autenticacao-api/InstituicaoExternaRepository
	java:app/siabm-autenticacao-api/InstituicaoExternaRepository
	java:module/InstituicaoExternaRepository

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSistemaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:module/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl
	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl
	java:module/MensagemSistemaServiceImpl

[0m[0m10:29:34,384 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaTipoBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:module/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
	java:module/PessoaTipoBiometriaServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogServicoCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:module/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl
	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl
	java:module/LogServicoCanalServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroFuncionalCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:module/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
	java:module/ParametroFuncionalCanalServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemScoreServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:module/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl
	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl
	java:module/OrdemScoreServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ABISClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:app/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:module/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:global/siabm-autenticacao-api/ABISClient
	java:app/siabm-autenticacao-api/ABISClient
	java:module/ABISClient

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoNumeroClassificacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:module/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
	java:module/ValidacaoNumeroClassificacaoServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'BiometriaFaceServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:module/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl
	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl
	java:module/BiometriaFaceServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleTentativasServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:module/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl
	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl
	java:module/ControleTentativasServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:module/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl
	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl
	java:module/InstituicaoExternaServiceImpl

[0m[0m10:29:34,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:module/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl
	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl
	java:module/AutenticacaoFacialImpl

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:app/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:module/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:global/siabm-autenticacao-api/TimerTokenT4SSO
	java:app/siabm-autenticacao-api/TimerTokenT4SSO
	java:module/TimerTokenT4SSO

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RequisicaoTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:module/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
	java:module/RequisicaoTransacaoServiceImpl

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PermissaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:app/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:module/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:global/siabm-autenticacao-api/PermissaoServiceImpl
	java:app/siabm-autenticacao-api/PermissaoServiceImpl
	java:module/PermissaoServiceImpl

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:app/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:module/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:global/siabm-autenticacao-api/TokenManagerT4SSO
	java:app/siabm-autenticacao-api/TokenManagerT4SSO
	java:module/TokenManagerT4SSO

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroCanalBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:module/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
	java:module/ParametroCanalBiometriaServiceImpl

[0m[0m10:29:34,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoOperacaoSemCartaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:module/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
	java:module/ValidacaoOperacaoSemCartaoServiceImpl

[0m[33m10:29:35,073 WARN  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.autenticacao.preautorizacao.services.impl.PreAutorizacaoAutenticacaoServiceImpl should not have a final or static method (toEntity)
[0m[0m10:29:35,385 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
[0m[33m10:29:35,775 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-7) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m10:29:35,876 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
[0m[0m10:29:35,983 INFO  [org.jboss.weld.Version] (MSC service thread 1-7) WELD-000900: 3.1.6 (redhat)
[0m[0m10:29:36,271 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = siabm-autenticacao-api.war_oracle.jdbc.OracleDriver_11_1
[0m[0m10:29:36,782 INFO  [org.jgroups.protocols.pbcast.GMS] (ServerService Thread Pool -- 79) siabm-autenticacao-api-sandbox-des-14-584bj: no members discovered after 3003 ms: creating cluster as coordinator
[0m[0m10:29:38,290 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 80) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
[0m[0m10:29:38,480 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m10:29:38,480 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 81) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
[0m[0m10:29:38,480 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 82) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m10:29:38,480 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 80) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m10:29:38,787 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000078: Starting JGroups channel ejb
[0m[0m10:29:38,787 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000078: Starting JGroups channel ejb
[0m[0m10:29:38,787 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000078: Starting JGroups channel ejb
[0m[0m10:29:38,787 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000078: Starting JGroups channel ejb
[0m[0m10:29:38,793 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-14-584bj|0] (1) [siabm-autenticacao-api-sandbox-des-14-584bj]
[0m[0m10:29:38,793 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-14-584bj|0] (1) [siabm-autenticacao-api-sandbox-des-14-584bj]
[0m[0m10:29:38,793 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-14-584bj|0] (1) [siabm-autenticacao-api-sandbox-des-14-584bj]
[0m[0m10:29:38,793 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-14-584bj|0] (1) [siabm-autenticacao-api-sandbox-des-14-584bj]
[0m[0m10:29:38,807 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-14-584bj, physical addresses are [127.0.0.1:55200]
[0m[0m10:29:38,807 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-14-584bj, physical addresses are [127.0.0.1:55200]
[0m[0m10:29:38,807 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-14-584bj, physical addresses are [127.0.0.1:55200]
[0m[0m10:29:38,807 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-14-584bj, physical addresses are [127.0.0.1:55200]
[0m[0m10:29:38,979 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 79) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
[0m[0m10:29:38,991 INFO  [org.infinispan.CONFIG] (MSC service thread 1-8) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m10:29:38,991 INFO  [org.infinispan.CONFIG] (MSC service thread 1-8) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m10:29:39,075 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 79) HHH000204: Processing PersistenceUnitInfo [
	name: SIABM04_DESENV
	...]
[0m[0m10:29:39,382 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 79) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
[0m[0m10:29:39,383 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 79) HHH000206: hibernate.properties not found
[0m[0m10:29:39,686 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 79) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[0m10:29:39,805 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 82) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[0m10:29:40,228 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 79) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
[0m[0m10:29:42,686 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 79) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
[0m[0m10:29:43,278 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 79) Envers integration enabled? : true
[0m[0m10:29:43,477 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:29:43.477 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:29:43,477 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:29:43.477 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 0 seconds (+/-10%)
[0m[0m10:29:45,879 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 79) HHH000397: Using ASTQueryTranslatorFactory
[0m[33m10:29:49,842 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 79) RESTEASY002150: resteasy.scan is no longer supported.  Use a servlet 3.0 container and the ResteasyServletInitializer
[0m[0m10:29:50,584 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 79) WFLYUT0021: Registered web context: '/siabm-autenticacao-api' for server 'default-server'
[0m[0m10:29:50,979 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 45) WFLYSRV0010: Deployed "siabm-autenticacao-api.war" (runtime-name : "siabm-autenticacao-api.war")
[0m[0m10:29:51,277 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m10:29:51,285 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started in 41409ms - Started 1096 of 1317 services (454 services are lazy, passive or on-demand)
[0m[0m10:29:51,287 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
[0m[0m10:29:51,287 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
[0m[0m10:29:53,081 INFO  [br.gov.caixa.common] (EJB default - 2) [requestNewToken] Nova data de expira??o do token: 2026-07-14T10:34:23.078
[0m[0m10:29:53,243 INFO  [br.gov.caixa.siabm.autenticacao.mtx] (EJB default - 3) [requestNewTokenT4] Nova data de expira??o do token: 2026-07-14T10:34:23.243
[0m[0m10:30:13,421 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:30:13.421 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:30:13,422 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:30:13.422 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 1 seconds (+/-10%)
[0m[0m10:30:43,422 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:30:43.422 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:30:43,422 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:30:43.422 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 4 seconds (+/-10%)
[0m[0m10:31:13,420 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:31:13.420 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:31:13,420 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:31:13.420 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 9 seconds (+/-10%)
[0m[0m10:31:43,424 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:31:43.424 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:31:43,424 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:31:43.424 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 16 seconds (+/-10%)
[0m[0m10:32:13,420 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:32:13.420 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:32:13,420 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:32:13.420 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 25 seconds (+/-10%)
[0m[0m10:32:43,419 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:32:43.419 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m10:32:43,419 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-14 10:32:43.419 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
[0m
