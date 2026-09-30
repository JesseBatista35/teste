Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/cacerts_sinfs_intra_des_2026.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent.jar -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss/standalone/configuration/applicationinsights.json -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br

=========================================================================

2026-09-30 10:29:20.751-03:00 ERROR c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 failed to start (PID 215)
java.lang.IllegalStateException: java.lang.IllegalStateException: could not find requested configuration file: /opt/jboss/standalone/configuration/applicationinsights.json
	at com.microsoft.applicationinsights.agent.internal.init.FirstEntryPoint.init(FirstEntryPoint.java:108)
	at io.opentelemetry.javaagent.tooling.AgentStarterImpl.internalStart(AgentStarterImpl.java:87)
	at io.opentelemetry.javaagent.tooling.AgentStarterImpl.start(AgentStarterImpl.java:69)
	at io.opentelemetry.javaagent.bootstrap.AgentInitializer.initialize(AgentInitializer.java:35)
	at io.opentelemetry.javaagent.OpenTelemetryAgent.startAgent(OpenTelemetryAgent.java:57)
	at io.opentelemetry.javaagent.OpenTelemetryAgent.premain(OpenTelemetryAgent.java:45)
	at com.microsoft.applicationinsights.agent.Agent.premain(Agent.java:49)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:386)
	at sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:401)
Caused by: java.lang.IllegalStateException: could not find requested configuration file: /opt/jboss/standalone/configuration/applicationinsights.json
	at com.microsoft.applicationinsights.agent.internal.configuration.ConfigurationBuilder.loadConfigurationFile(ConfigurationBuilder.java:388)
	at com.microsoft.applicationinsights.agent.internal.configuration.ConfigurationBuilder.create(ConfigurationBuilder.java:128)
	at com.microsoft.applicationinsights.agent.internal.init.FirstEntryPoint.init(FirstEntryPoint.java:96)
	... 12 common frames omitted
[0m10:29:21,853 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
[0m[33m10:29:22,413 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m10:29:22,430 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m10:29:22,613 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) starting
[0m[0m10:29:22,694 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m10:29:25,410 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:29:25,990 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 23) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/8a/ab08c15c4efdd0a3fb71b69ab52e64dabbf1ab/content
[0m[0m10:29:26,044 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 23) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/83/0eaecbf31517173bd3dedea414dac80a104701/content
[0m[0m10:29:26,058 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 23) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/53/fd3a0887667aae7e40a3439fff2d03d93ec4c2/content
[0m[0m10:29:26,319 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 23) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/46/9669305131211faa8e2feb1daaacf0c3f70e14/content
[0m[0m10:29:26,336 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m10:29:26,400 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.5.6.Final-redhat-00001
[0m[0m10:29:26,405 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.5.6.Final-redhat-00001
[0m2026-09-30 10:29:26,511 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 39) WFLYCLINF0001: Activating Infinispan subsystem.
2026-09-30 10:29:26,512 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 45) WFLYJSF0007: Activated the following JSF Implementations: [main]
2026-09-30 10:29:26,510 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 40) WFLYRS0016: RESTEasy version 3.0.26.Final-redhat-1
2026-09-30 10:29:26,514 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 55) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-09-30 10:29:26,589 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 38) WFLYIO001: Worker 'default' has auto-configured to 64 core threads with 512 task threads based on your 32 available processors
2026-09-30 10:29:26,592 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 47) WFLYNAM0001: Activating Naming Subsystem
2026-09-30 10:29:26,592 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 57) WFLYWS0002: Activating WebServices Extension
2026-09-30 10:29:26,602 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 54) WFLYSEC0002: Activating Security Subsystem
2026-09-30 10:29:26,821 INFO  [org.jboss.as.security] (MSC service thread 1-5) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
2026-09-30 10:29:26,823 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Undertow 1.4.18.SP11-redhat-00001 starting
2026-09-30 10:29:26,999 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Starting Naming Service
2026-09-30 10:29:27,019 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.12.Final-redhat-00001)
2026-09-30 10:29:27,021 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-09-30 10:29:27,509 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.8.Final-redhat-1
2026-09-30 10:29:27,703 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Started server default-server.
2026-09-30 10:29:27,695 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 56) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-09-30 10:29:27,711 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0018: Host default-host starting
2026-09-30 10:29:28,209 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-09-30 10:29:28,596 INFO  [org.jboss.as.ejb3] (MSC service thread 1-6) WFLYEJB0493: EJB subsystem suspension complete
2026-09-30 10:29:28,793 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
2026-09-30 10:29:28,793 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
2026-09-30 10:29:29,301 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 34) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.16)
2026-09-30 10:29:29,304 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = db2
2026-09-30 10:29:30,202 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:/db2nfs]
2026-09-30 10:29:30,511 INFO  [org.jboss.as.patching] (MSC service thread 1-8) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.1.6.CP, one-off patches include: eap-716-jbeap-16502
2026-09-30 10:29:30,596 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
2026-09-30 10:29:30,604 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "applicationinsights-agent.jar" (runtime-name: "applicationinsights-agent.jar")
2026-09-30 10:29:30,605 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "mysql-connector-java.jar" (runtime-name: "mysql-connector-java.jar")
2026-09-30 10:29:30,605 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sinfs.ear" (runtime-name: "sinfs.ear")
2026-09-30 10:29:30,607 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "elastic-apm-agent.jar" (runtime-name: "elastic-apm-agent.jar")
2026-09-30 10:29:30,898 INFO  [org.jboss.ws.common.management] (MSC service thread 1-7) JBWS022052: Starting JBossWS 5.1.11.Final-redhat-00001 (Apache CXF 3.1.16.redhat-2) 
2026-09-30 10:29:37,096 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0005: Deploying non-JDBC-compliant driver class com.mysql.cj.jdbc.Driver (version 8.0)
2026-09-30 10:29:37,394 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0018: Started Driver service with driver-name = mysql-connector-java.jar
2026-09-30 10:29:38,000 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Starting subdeployment (runtime-name: "sinfs-ejb.jar")
2026-09-30 10:29:38,000 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0207: Starting subdeployment (runtime-name: "sinfs-web.war")
2026-09-30 10:29:39,699 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-5) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.11.Final-redhat-1
2026-09-30 10:29:42,395 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 61) WFLYCLINF0002: Started client-mappings cache from ejb container
2026-09-30 10:29:42,737 INFO  [org.wildfly.security] (MSC service thread 1-8) ELY00001: WildFly Elytron version 1.1.12.Final-redhat-00001
2026-09-30 10:29:42,922 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0166: The @Clustered annotation is deprecated and will be ignored.
2026-09-30 10:29:42,989 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0166: The @Clustered annotation is deprecated and will be ignored.
2026-09-30 10:29:43,906 INFO  [org.jboss.as.jpa] (MSC service thread 1-6) WFLYJPA0002: Read persistence.xml for pu-nfs
2026-09-30 10:29:44,290 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 61) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sinfs.ear/sinfs-ejb.jar#pu-nfs'
2026-09-30 10:29:44,307 WARN  [org.jboss.as.dependency.deprecated] (MSC service thread 1-4) WFLYSRV0221: Deployment "deployment.sinfs.ear.sinfs-web.war" is using a deprecated module ("org.jboss.resteasy.resteasy-jackson-provider") which may be removed in future versions without notice.
2026-09-30 10:29:44,315 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processing weld deployment sinfs.ear
2026-09-30 10:29:44,392 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 61) HHH000204: Processing PersistenceUnitInfo [
	name: pu-nfs
	...]
2026-09-30 10:29:44,606 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
2026-09-30 10:29:44,714 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 61) HHH000412: Hibernate Core {5.1.17.Final-redhat-00002}
2026-09-30 10:29:44,789 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 61) HHH000206: hibernate.properties not found
2026-09-30 10:29:44,791 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 61) HHH000021: Bytecode provider name : javassist
2026-09-30 10:29:44,890 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 61) HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
2026-09-30 10:29:44,891 WARN  [org.jboss.as.logging] (MSC service thread 1-4) WFLYLOG0010: Logging profile 'sinfs-logger' was specified for deployment 'ResourceRoot [root="/content/sinfs.ear"]' but was not found. Using system logging configuration.
2026-09-30 10:29:45,091 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processing weld deployment sinfs-ejb.jar
2026-09-30 10:29:45,098 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'SimulacaoService' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/SimulacaoService!br.gov.caixa.sinfs.rs.service.SimulacaoService
	java:app/sinfs-ejb/SimulacaoService!br.gov.caixa.sinfs.rs.service.SimulacaoService
	java:module/SimulacaoService!br.gov.caixa.sinfs.rs.service.SimulacaoService
	java:global/sinfs/sinfs-ejb/SimulacaoService
	java:app/sinfs-ejb/SimulacaoService
	java:module/SimulacaoService

2026-09-30 10:29:45,098 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DominioService' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/DominioService!br.gov.caixa.sinfs.rs.service.DominioService
	java:app/sinfs-ejb/DominioService!br.gov.caixa.sinfs.rs.service.DominioService
	java:module/DominioService!br.gov.caixa.sinfs.rs.service.DominioService
	java:global/sinfs/sinfs-ejb/DominioService
	java:app/sinfs-ejb/DominioService
	java:module/DominioService

2026-09-30 10:29:45,098 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UtilBanco' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/UtilBanco!br.gov.caixa.sinfs.util.UtilBanco
	java:app/sinfs-ejb/UtilBanco!br.gov.caixa.sinfs.util.UtilBanco
	java:module/UtilBanco!br.gov.caixa.sinfs.util.UtilBanco
	java:global/sinfs/sinfs-ejb/UtilBanco
	java:app/sinfs-ejb/UtilBanco
	java:module/UtilBanco

2026-09-30 10:29:45,099 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'MetricsService' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/MetricsService!br.gov.caixa.sinfs.rs.service.analytics.MetricsService
	java:app/sinfs-ejb/MetricsService!br.gov.caixa.sinfs.rs.service.analytics.MetricsService
	java:module/MetricsService!br.gov.caixa.sinfs.rs.service.analytics.MetricsService
	java:global/sinfs/sinfs-ejb/MetricsService
	java:app/sinfs-ejb/MetricsService
	java:module/MetricsService

2026-09-30 10:29:45,099 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PushService' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/PushService!br.gov.caixa.sinfs.rs.service.PushService
	java:app/sinfs-ejb/PushService!br.gov.caixa.sinfs.rs.service.PushService
	java:module/PushService!br.gov.caixa.sinfs.rs.service.PushService
	java:global/sinfs/sinfs-ejb/PushService
	java:app/sinfs-ejb/PushService
	java:module/PushService

2026-09-30 10:29:45,099 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnalyticsService' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/AnalyticsService!br.gov.caixa.sinfs.rs.service.analytics.AnalyticsService
	java:app/sinfs-ejb/AnalyticsService!br.gov.caixa.sinfs.rs.service.analytics.AnalyticsService
	java:module/AnalyticsService!br.gov.caixa.sinfs.rs.service.analytics.AnalyticsService
	java:global/sinfs/sinfs-ejb/AnalyticsService
	java:app/sinfs-ejb/AnalyticsService
	java:module/AnalyticsService

2026-09-30 10:29:45,099 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'Requisicao' in deployment unit 'subdeployment "sinfs-ejb.jar" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-ejb/Requisicao!br.gov.caixa.sinfs.rs.requisicao.Requisicao
	java:app/sinfs-ejb/Requisicao!br.gov.caixa.sinfs.rs.requisicao.Requisicao
	java:module/Requisicao!br.gov.caixa.sinfs.rs.requisicao.Requisicao
	java:global/sinfs/sinfs-ejb/Requisicao
	java:app/sinfs-ejb/Requisicao
	java:module/Requisicao

2026-09-30 10:29:45,109 INFO  [org.jboss.keycloak] (MSC service thread 1-4) Keycloak subsystem override for deployment sinfs-web.war
2026-09-30 10:29:45,110 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processing weld deployment sinfs-web.war
2026-09-30 10:29:45,194 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'SimulacaoResource' in deployment unit 'subdeployment "sinfs-web.war" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-web/SimulacaoResource!br.gov.caixa.sinfs.rs.interfaces.SimulacaoInterface
	java:app/sinfs-web/SimulacaoResource!br.gov.caixa.sinfs.rs.interfaces.SimulacaoInterface
	java:module/SimulacaoResource!br.gov.caixa.sinfs.rs.interfaces.SimulacaoInterface
	java:global/sinfs/sinfs-web/SimulacaoResource
	java:app/sinfs-web/SimulacaoResource
	java:module/SimulacaoResource

2026-09-30 10:29:45,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'LoginResource' in deployment unit 'subdeployment "sinfs-web.war" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-web/LoginResource!br.gov.caixa.sinfs.rs.interfaces.LoginInterface
	java:app/sinfs-web/LoginResource!br.gov.caixa.sinfs.rs.interfaces.LoginInterface
	java:module/LoginResource!br.gov.caixa.sinfs.rs.interfaces.LoginInterface
	java:global/sinfs/sinfs-web/LoginResource
	java:app/sinfs-web/LoginResource
	java:module/LoginResource

2026-09-30 10:29:45,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ValidadorAcessoResource' in deployment unit 'subdeployment "sinfs-web.war" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-web/ValidadorAcessoResource!br.gov.caixa.sinfs.rs.interfaces.ValidadorAcessoInterface
	java:app/sinfs-web/ValidadorAcessoResource!br.gov.caixa.sinfs.rs.interfaces.ValidadorAcessoInterface
	java:module/ValidadorAcessoResource!br.gov.caixa.sinfs.rs.interfaces.ValidadorAcessoInterface
	java:global/sinfs/sinfs-web/ValidadorAcessoResource
	java:app/sinfs-web/ValidadorAcessoResource
	java:module/ValidadorAcessoResource

2026-09-30 10:29:45,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'Identity' in deployment unit 'subdeployment "sinfs-web.war" of deployment "sinfs.ear"' are as follows:

	java:global/sinfs/sinfs-web/Identity!br.gov.caixa.sinfs.mbean.IdentityMBean
	java:app/sinfs-web/Identity!br.gov.caixa.sinfs.mbean.IdentityMBean
	java:module/Identity!br.gov.caixa.sinfs.mbean.IdentityMBean
	java:global/sinfs/sinfs-web/Identity
	java:app/sinfs-web/Identity
	java:module/Identity

2026-09-30 10:29:45,394 INFO  [org.jboss.weld.Version] (MSC service thread 1-4) WELD-000900: 2.4.7 (redhat)
2026-09-30 10:29:46,720 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 61) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sinfs.ear/sinfs-ejb.jar#pu-nfs'
2026-09-30 10:29:47,252 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 61) IJ000407: No lazy enlistment available for db2nfs
2026-09-30 10:29:47,269 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 61) HHH000400: Using dialect: br.gov.caixa.sinfs.util.DB2ZOSDialect
2026-09-30 10:29:47,337 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 61) Envers integration enabled? : true
2026-09-30 10:29:48,125 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 61) HHH000397: Using ASTQueryTranslatorFactory
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) Identity()
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) code: 557
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) id: SINFS
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) name: SINFS
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) description: Sistema N?cleo de Informa??es Compartilhadas de Fundos e Seguros
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) version: 1.0
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) context: /sinfs
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) icon: fa-circle-o-notch
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) extraInfo: lastchange:'11/05/2018 16:32:56',menu:true,contact:'l@f.com'
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) date: 11-05-2018 16:36
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) framework: ANGULAR003v400
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) user: l@f.com
2026-09-30 10:29:51,203 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) owner: Caixa Econ?mica Federal
2026-09-30 10:29:51,204 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) authCode: 6459
2026-09-30 10:29:51,204 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) authDate: Fri Oct 02 10:29:51 BRT 2026
2026-09-30 10:29:51,204 ERROR [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) javax.management.InstanceNotFoundException: br.gov.caixa.app:deployment=sinfs-ear.ear
2026-09-30 10:29:51,205 INFO  [br.gov.caixa.sinfs.mbean.Identity] (ServerService Thread Pool -- 68) MBean registered: br.gov.caixa.app:deployment=sinfs-ear.ear
2026-09-30 10:29:52,209 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 68) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.sinfs.rs.resource.JaxRsActivator$Proxy$_$$_WeldClientProxy
2026-09-30 10:29:52,293 INFO  [br.gov.caixa.sisit.App] (ServerService Thread Pool -- 68) alternateService=null/sisit
2026-09-30 10:29:52,390 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 68) WFLYUT0021: Registered web context: '/sinfs' for server 'default-server'
2026-09-30 10:29:52,400 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 35) WFLYSRV0010: Deployed "sinfs.ear" (runtime-name : "sinfs.ear")
2026-09-30 10:29:52,400 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 35) WFLYSRV0010: Deployed "mysql-connector-java.jar" (runtime-name : "mysql-connector-java.jar")
2026-09-30 10:29:52,400 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 35) WFLYSRV0010: Deployed "elastic-apm-agent.jar" (runtime-name : "elastic-apm-agent.jar")
2026-09-30 10:29:52,400 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 35) WFLYSRV0010: Deployed "applicationinsights-agent.jar" (runtime-name : "applicationinsights-agent.jar")
2026-09-30 10:29:52,604 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-09-30 10:29:52,607 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-09-30 10:29:52,607 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
2026-09-30 10:29:52,607 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) started in 31810ms - Started 874 of 1140 services (401 services are lazy, passive or on-demand)
2026-09-30 10:48:03,868 INFO  [br.gov.caixa.sisit.App] (default task-218) alternateService=null/sisit
2026-09-30 10:48:03,871 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-218) Resquest Went intercepted !!!!!!
2026-09-30 10:48:03,902 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-218) Responsex went intercepted !!!!!!
2026-09-30 10:48:03,918 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-219) Resquest Went intercepted !!!!!!
2026-09-30 10:48:03,918 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-219) Responsex went intercepted !!!!!!
2026-09-30 10:48:08,724 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-224) Resquest Went intercepted !!!!!!
2026-09-30 10:48:08,725 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-224) Responsex went intercepted !!!!!!
2026-09-30 10:48:08,729 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-225) Resquest Went intercepted !!!!!!
2026-09-30 10:48:08,730 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-225) Responsex went intercepted !!!!!!
2026-09-30 10:48:08,743 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-226) Resquest Went intercepted !!!!!!
2026-09-30 10:48:08,952 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-226) SQL Warning Code: 4223, SQLState: null
2026-09-30 10:48:08,953 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-226) Origination unknown: [10228][11541][4.16.53] Security exceptions occurred while loading driver. ERRORCODE=4223, SQLSTATE=null
2026-09-30 10:48:08,957 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-226) Responsex went intercepted !!!!!!
2026-09-30 10:48:09,014 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-227) Resquest Went intercepted !!!!!!
2026-09-30 10:48:09,026 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-227) Responsex went intercepted !!!!!!
2026-09-30 10:48:11,042 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-228) Resquest Went intercepted !!!!!!
2026-09-30 10:48:11,043 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-228) Responsex went intercepted !!!!!!
2026-09-30 10:48:11,043 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-229) Resquest Went intercepted !!!!!!
2026-09-30 10:48:15,132 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-229) Chamando servi?o de pesquisar simulacao
2026-09-30 10:48:15,133 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-229) CALL NFS.NFSSPJMU_COMBO_MUNICIPIOS(?,?,?,?,?)
2026-09-30 10:48:15,133 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-229) CALL NFS.NFSSPJGJ_GERA_JSON(?,?,?,?,?,?)
2026-09-30 10:48:15,133 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-229) Codigo Retorno:0
2026-09-30 10:48:15,133 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-229) Mensagem Retorno: [CONTRATO E ALTERACOES RECUPERADOS NA BASE DE DADOS.                                                                             ]
2026-09-30 10:48:15,149 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-229) Responsex went intercepted !!!!!!
2026-09-30 10:48:15,295 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-230) Resquest Went intercepted !!!!!!
2026-09-30 10:48:15,307 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-231) Resquest Went intercepted !!!!!!
2026-09-30 10:48:15,308 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-231) Responsex went intercepted !!!!!!
2026-09-30 10:48:16,202 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-230) Chamando servi?o de pesquisar municipio por UF
2026-09-30 10:48:16,202 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-230) CALL NFS.NFSSPJMU_COMBO_MUNICIPIOS
2026-09-30 10:48:16,202 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-230) Codigo Retorno:0
2026-09-30 10:48:16,202 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-230) Mensagem Retorno: [COMBOBOX DOS CODIGOS DE MUNICIPIO GERADO                                                                                        ]
2026-09-30 10:48:16,204 INFO  [br.gov.caixa.sinfs.rs.service.SimulacaoService] (default task-230) Servico pesquisar Municipio por UF selecionado service executado.
2026-09-30 10:48:16,207 INFO  [br.gov.caixa.sinfs.rs.interceptors.AutenticationInterceptor] (default task-230) Responsex went intercepted !!!!!!
