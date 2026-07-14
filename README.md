Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=120 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true

=========================================================================

[0m17:39:02,527 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
[0m[33m17:39:03,271 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m17:39:03,291 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m17:39:03,395 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) starting
[0m[0m17:39:03,477 INFO  [org.jboss.vfs] (MSC service thread 1-5) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m17:39:06,593 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:39:06,685 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 1.1.12.Final-redhat-00001
[0m[0m17:39:06,766 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 11) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:39:07,212 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 4) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/79/13f38f8c7a03ce34f6e073e973331c9aa018e5/content
[0m[0m17:39:07,282 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 4) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/e7/7d3635d02c26697526437c59a55f5b9a9a21ee/content
[0m[0m17:39:07,308 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m17:39:07,368 INFO  [org.xnio] (MSC service thread 1-7) XNIO version 3.5.6.Final-redhat-00001
[0m[0m17:39:07,384 INFO  [org.xnio.nio] (MSC service thread 1-7) XNIO NIO Implementation Version 3.5.6.Final-redhat-00001
[0m2026-07-14 17:39:07,479 INFO  [org.jboss.remoting] (MSC service thread 1-7) [CORRELATION-ID:]JBoss Remoting version 5.0.8.Final-redhat-1
2026-07-14 17:39:07,480 WARN  [org.jboss.as.logging] (Controller Boot Thread) [CORRELATION-ID:]WFLYLOG0012: Replacing handler 'FILE' during add operation. Either the handler type or the module name differs from the initial configuration.
2026-07-14 17:39:07,487 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 44) [CORRELATION-ID:]WFLYCLINF0001: Activating Infinispan subsystem.
2026-07-14 17:39:07,584 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 51) [CORRELATION-ID:]WFLYJSF0007: Activated the following JSF Implementations: [main]
2026-07-14 17:39:07,604 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 45) [CORRELATION-ID:]WFLYIIOP0001: Activating IIOP Subsystem
2026-07-14 17:39:07,595 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 62) [CORRELATION-ID:]WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-07-14 17:39:07,604 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 64) [CORRELATION-ID:]WFLYWS0002: Activating WebServices Extension
2026-07-14 17:39:07,595 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 46) [CORRELATION-ID:]WFLYRS0016: RESTEasy version 3.0.26.Final-redhat-1
2026-07-14 17:39:07,669 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 54) [CORRELATION-ID:]WFLYNAM0001: Activating Naming Subsystem
2026-07-14 17:39:07,702 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 61) [CORRELATION-ID:]WFLYSEC0002: Activating Security Subsystem
2026-07-14 17:39:07,774 INFO  [org.jboss.as.security] (MSC service thread 1-2) [CORRELATION-ID:]WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
2026-07-14 17:39:07,785 INFO  [org.jboss.as.connector] (MSC service thread 1-8) [CORRELATION-ID:]WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.12.Final-redhat-00001)
2026-07-14 17:39:08,063 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) [CORRELATION-ID:]WFLYUT0003: Undertow 1.4.18.SP11-redhat-00001 starting
2026-07-14 17:39:08,069 INFO  [org.jboss.as.naming] (MSC service thread 1-7) [CORRELATION-ID:]WFLYNAM0003: Starting Naming Service
2026-07-14 17:39:08,070 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) [CORRELATION-ID:]WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-07-14 17:39:08,579 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 38) [CORRELATION-ID:]WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
2026-07-14 17:39:08,668 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) [CORRELATION-ID:]WFLYJCA0018: Started Driver service with driver-name = oracle
2026-07-14 17:39:08,783 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 63) [CORRELATION-ID:]WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-07-14 17:39:08,876 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) [CORRELATION-ID:]WFLYUT0012: Started server default-server.
2026-07-14 17:39:08,882 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) [CORRELATION-ID:]WFLYUT0018: Host default-host starting
2026-07-14 17:39:09,174 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) [CORRELATION-ID:]WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-14 17:39:09,177 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) [CORRELATION-ID:]WFLYEJB0493: EJB subsystem suspension complete
2026-07-14 17:39:09,665 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) [CORRELATION-ID:]WFLYJCA0001: Bound data source [java:jboss/jdbc/SIMPI04]
2026-07-14 17:39:10,075 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-8) [CORRELATION-ID:]WFLYIIOP0009: CORBA ORB Service started
2026-07-14 17:39:10,273 INFO  [org.jboss.as.patching] (MSC service thread 1-4) [CORRELATION-ID:]WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-07-14 17:39:10,364 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-7) [CORRELATION-ID:]WFLYDM0111: Keystore /opt/jboss-eap-7.1/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-07-14 17:39:10,376 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) [CORRELATION-ID:]WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
2026-07-14 17:39:10,378 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) [CORRELATION-ID:]WFLYSRV0027: Starting deployment of "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-07-14 17:39:10,378 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) [CORRELATION-ID:]WFLYSRV0027: Starting deployment of "simpi-dict.ear" (runtime-name: "simpi-dict.ear")
2026-07-14 17:39:11,180 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) [CORRELATION-ID:]WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-14 17:39:11,667 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0207: Starting subdeployment (runtime-name: "simpi-dict-war.war")
2026-07-14 17:39:12,271 INFO  [org.jboss.ws.common.management] (MSC service thread 1-3) [CORRELATION-ID:]JBWS022052: Starting JBossWS 5.1.11.Final-redhat-00001 (Apache CXF 3.1.16.redhat-2) 
2026-07-14 17:39:16,969 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry commons-codec-1.13.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-ejb-770955.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jackson-databind-2.9.6.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry json-20190722.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jboss-logging-3.3.0.Final.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry swagger-jaxrs-1.5.7.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jackson-dataformat-yaml-2.4.5.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry snakeyaml-1.12.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry swagger-core-1.5.7.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry slf4j-api-1.6.3.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jackson-datatype-joda-2.4.5.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry joda-time-2.2.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry swagger-models-1.5.7.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,974 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry swagger-annotations-1.5.7.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,975 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jsr311-api-1.1.1.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,975 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry reflections-0.9.10.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,975 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry annotations-2.0.1.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,975 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry guava-18.0.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:16,975 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) [CORRELATION-ID:]WFLYSRV0059: Class Path entry jackson-jaxrs-json-provider-2.4.5.jar in /content/simpi-dict.ear/simpi-dict-war.war/WEB-INF/lib/simpi-dict-api-model-2.24.0.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-14 17:39:17,372 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-2) [CORRELATION-ID:]IJ020001: Required license terms for file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempe7ee09482b7914d7/content-6fb401152ae20216/contents/
2026-07-14 17:39:17,969 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-3) [CORRELATION-ID:]ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.11.Final-redhat-1
2026-07-14 17:39:18,468 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-2) [CORRELATION-ID:]IJ020017: Invalid archive: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempe7ee09482b7914d7/content-6fb401152ae20216/contents/
2026-07-14 17:39:18,569 INFO  [org.jboss.as.jpa] (MSC service thread 1-7) [CORRELATION-ID:]WFLYJPA0002: Read persistence.xml for OracleSimpiDS
2026-07-14 17:39:18,981 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) [CORRELATION-ID:]WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'simpi-dict.ear/simpi-dict-war.war#OracleSimpiDS'
2026-07-14 17:39:19,067 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) [CORRELATION-ID:]WFLYWELD0003: Processing weld deployment simpi-dict.ear
2026-07-14 17:39:19,081 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) [CORRELATION-ID:]WFLYCLINF0002: Started client-mappings cache from ejb container
2026-07-14 17:39:19,164 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000204: Processing PersistenceUnitInfo [
	name: OracleSimpiDS
	...]
2026-07-14 17:39:19,374 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) [CORRELATION-ID:]HV000001: Hibernate Validator 5.3.5.Final-redhat-2
2026-07-14 17:39:19,484 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000412: Hibernate Core {5.1.17.Final-redhat-00001}
2026-07-14 17:39:19,486 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000206: hibernate.properties not found
2026-07-14 17:39:19,488 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000021: Bytecode provider name : javassist
2026-07-14 17:39:19,666 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
2026-07-14 17:39:20,073 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) [CORRELATION-ID:]WFLYWELD0003: Processing weld deployment simpi-dict-war.war
2026-07-14 17:39:20,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetCidsFileByIdFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetCidsFileByIdFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetCidsFileByIdFacade
	java:app/simpi-dict-war/GetCidsFileByIdFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetCidsFileByIdFacade
	java:module/GetCidsFileByIdFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetCidsFileByIdFacade
	java:global/simpi-dict/simpi-dict-war/GetCidsFileByIdFacade
	java:app/simpi-dict-war/GetCidsFileByIdFacade
	java:module/GetCidsFileByIdFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ConsultarEstatisticasChaveFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ConsultarEstatisticasChaveFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasChaveFacade
	java:app/simpi-dict-war/ConsultarEstatisticasChaveFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasChaveFacade
	java:module/ConsultarEstatisticasChaveFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasChaveFacade
	java:global/simpi-dict/simpi-dict-war/ConsultarEstatisticasChaveFacade
	java:app/simpi-dict-war/ConsultarEstatisticasChaveFacade
	java:module/ConsultarEstatisticasChaveFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'AcknowledgeClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/AcknowledgeClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.AcknowledgeClaimFacade
	java:app/simpi-dict-war/AcknowledgeClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.AcknowledgeClaimFacade
	java:module/AcknowledgeClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.AcknowledgeClaimFacade
	java:global/simpi-dict/simpi-dict-war/AcknowledgeClaimFacade
	java:app/simpi-dict-war/AcknowledgeClaimFacade
	java:module/AcknowledgeClaimFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListRefundsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade
	java:app/simpi-dict-war/ListRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade
	java:module/ListRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade
	java:global/simpi-dict/simpi-dict-war/ListRefundsFacade
	java:app/simpi-dict-war/ListRefundsFacade
	java:module/ListRefundsFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ApiClientV2' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ApiClientV2!br.gov.caixa.mpi.dict.v2.api.ApiClientV2
	java:app/simpi-dict-war/ApiClientV2!br.gov.caixa.mpi.dict.v2.api.ApiClientV2
	java:module/ApiClientV2!br.gov.caixa.mpi.dict.v2.api.ApiClientV2
	java:global/simpi-dict/simpi-dict-war/ApiClientV2
	java:app/simpi-dict-war/ApiClientV2
	java:module/ApiClientV2

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetRefundFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.GetRefundFacade
	java:app/simpi-dict-war/GetRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.GetRefundFacade
	java:module/GetRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.GetRefundFacade
	java:global/simpi-dict/simpi-dict-war/GetRefundFacade
	java:app/simpi-dict-war/GetRefundFacade
	java:module/GetRefundFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListFundsRecoveryInfractionReportsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListFundsRecoveryInfractionReportsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryInfractionReportsFacade
	java:app/simpi-dict-war/ListFundsRecoveryInfractionReportsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryInfractionReportsFacade
	java:module/ListFundsRecoveryInfractionReportsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryInfractionReportsFacade
	java:global/simpi-dict/simpi-dict-war/ListFundsRecoveryInfractionReportsFacade
	java:app/simpi-dict-war/ListFundsRecoveryInfractionReportsFacade
	java:module/ListFundsRecoveryInfractionReportsFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CriarVinculoDictFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CriarVinculoDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade
	java:app/simpi-dict-war/CriarVinculoDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade
	java:module/CriarVinculoDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade
	java:global/simpi-dict/simpi-dict-war/CriarVinculoDictFacade
	java:app/simpi-dict-war/CriarVinculoDictFacade
	java:module/CriarVinculoDictFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetPolicyFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetPolicyFacade!br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade
	java:app/simpi-dict-war/GetPolicyFacade!br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade
	java:module/GetPolicyFacade!br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade
	java:global/simpi-dict/simpi-dict-war/GetPolicyFacade
	java:app/simpi-dict-war/GetPolicyFacade
	java:module/GetPolicyFacade

2026-07-14 17:39:20,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ConsultarEntryDictFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ConsultarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.ConsultarEntryDictFacade
	java:app/simpi-dict-war/ConsultarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.ConsultarEntryDictFacade
	java:module/ConsultarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.ConsultarEntryDictFacade
	java:global/simpi-dict/simpi-dict-war/ConsultarEntryDictFacade
	java:app/simpi-dict-war/ConsultarEntryDictFacade
	java:module/ConsultarEntryDictFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'HsmCaixaEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/HsmCaixaEjb!br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb
	java:app/simpi-dict-war/HsmCaixaEjb!br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb
	java:module/HsmCaixaEjb!br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb
	java:global/simpi-dict/simpi-dict-war/HsmCaixaEjb
	java:app/simpi-dict-war/HsmCaixaEjb
	java:module/HsmCaixaEjb

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ConsultaMarcacaoFraudeFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ConsultaMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacade
	java:app/simpi-dict-war/ConsultaMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacade
	java:module/ConsultaMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacade
	java:global/simpi-dict/simpi-dict-war/ConsultaMarcacaoFraudeFacade
	java:app/simpi-dict-war/ConsultaMarcacaoFraudeFacade
	java:module/ConsultaMarcacaoFraudeFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CreateClaimFacade
	java:app/simpi-dict-war/CreateClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CreateClaimFacade
	java:module/CreateClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CreateClaimFacade
	java:global/simpi-dict/simpi-dict-war/CreateClaimFacade
	java:app/simpi-dict-war/CreateClaimFacade
	java:module/CreateClaimFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'InfractionReportEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/InfractionReportEjb!br.gov.caixa.mpi.dict.ejb.InfractionReportEjb
	java:app/simpi-dict-war/InfractionReportEjb!br.gov.caixa.mpi.dict.ejb.InfractionReportEjb
	java:module/InfractionReportEjb!br.gov.caixa.mpi.dict.ejb.InfractionReportEjb
	java:global/simpi-dict/simpi-dict-war/InfractionReportEjb
	java:app/simpi-dict-war/InfractionReportEjb
	java:module/InfractionReportEjb

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'AcknowledgeInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/AcknowledgeInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.AcknowledgeInfractionReportFacade
	java:app/simpi-dict-war/AcknowledgeInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.AcknowledgeInfractionReportFacade
	java:module/AcknowledgeInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.AcknowledgeInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/AcknowledgeInfractionReportFacade
	java:app/simpi-dict-war/AcknowledgeInfractionReportFacade
	java:module/AcknowledgeInfractionReportFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'RequisicaoBacenDao' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/RequisicaoBacenDao!br.gov.caixa.mpi.dict.dao.RequisicaoBacenDao
	java:app/simpi-dict-war/RequisicaoBacenDao!br.gov.caixa.mpi.dict.dao.RequisicaoBacenDao
	java:module/RequisicaoBacenDao!br.gov.caixa.mpi.dict.dao.RequisicaoBacenDao
	java:global/simpi-dict/simpi-dict-war/RequisicaoBacenDao
	java:app/simpi-dict-war/RequisicaoBacenDao
	java:module/RequisicaoBacenDao

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ApiClient' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ApiClient!br.gov.caixa.mpi.dict.api.ApiClient
	java:app/simpi-dict-war/ApiClient!br.gov.caixa.mpi.dict.api.ApiClient
	java:module/ApiClient!br.gov.caixa.mpi.dict.api.ApiClient
	java:global/simpi-dict/simpi-dict-war/ApiClient
	java:app/simpi-dict-war/ApiClient
	java:module/ApiClient

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CreateInfractionReportFacade
	java:app/simpi-dict-war/CreateInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CreateInfractionReportFacade
	java:module/CreateInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CreateInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/CreateInfractionReportFacade
	java:app/simpi-dict-war/CreateInfractionReportFacade
	java:module/CreateInfractionReportFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CancelInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CancelInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CancelInfractionReportFacade
	java:app/simpi-dict-war/CancelInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CancelInfractionReportFacade
	java:module/CancelInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CancelInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/CancelInfractionReportFacade
	java:app/simpi-dict-war/CancelInfractionReportFacade
	java:module/CancelInfractionReportFacade

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ReconciliationEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ReconciliationEjb!br.gov.caixa.mpi.dict.ejb.ReconciliationEjb
	java:app/simpi-dict-war/ReconciliationEjb!br.gov.caixa.mpi.dict.ejb.ReconciliationEjb
	java:module/ReconciliationEjb!br.gov.caixa.mpi.dict.ejb.ReconciliationEjb
	java:global/simpi-dict/simpi-dict-war/ReconciliationEjb
	java:app/simpi-dict-war/ReconciliationEjb
	java:module/ReconciliationEjb

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ApiClientV2Np' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ApiClientV2Np!br.gov.caixa.mpi.dict.v2.api.ApiClientV2Np
	java:app/simpi-dict-war/ApiClientV2Np!br.gov.caixa.mpi.dict.v2.api.ApiClientV2Np
	java:module/ApiClientV2Np!br.gov.caixa.mpi.dict.v2.api.ApiClientV2Np
	java:global/simpi-dict/simpi-dict-war/ApiClientV2Np
	java:app/simpi-dict-war/ApiClientV2Np
	java:module/ApiClientV2Np

2026-07-14 17:39:20,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ClaimEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ClaimEjb!br.gov.caixa.mpi.dict.ejb.ClaimEjb
	java:app/simpi-dict-war/ClaimEjb!br.gov.caixa.mpi.dict.ejb.ClaimEjb
	java:module/ClaimEjb!br.gov.caixa.mpi.dict.ejb.ClaimEjb
	java:global/simpi-dict/simpi-dict-war/ClaimEjb
	java:app/simpi-dict-war/ClaimEjb
	java:module/ClaimEjb

2026-07-14 17:39:20,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade
	java:app/simpi-dict-war/GetInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade
	java:module/GetInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/GetInfractionReportFacade
	java:app/simpi-dict-war/GetInfractionReportFacade
	java:module/GetInfractionReportFacade

2026-07-14 17:39:20,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListCidsEventsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListCidsEventsFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.ListCidsEventsFacade
	java:app/simpi-dict-war/ListCidsEventsFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.ListCidsEventsFacade
	java:module/ListCidsEventsFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.ListCidsEventsFacade
	java:global/simpi-dict/simpi-dict-war/ListCidsEventsFacade
	java:app/simpi-dict-war/ListCidsEventsFacade
	java:module/ListCidsEventsFacade

2026-07-14 17:39:20,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'StatisticEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/StatisticEjb!br.gov.caixa.mpi.dict.ejb.StatisticEjb
	java:app/simpi-dict-war/StatisticEjb!br.gov.caixa.mpi.dict.ejb.StatisticEjb
	java:module/StatisticEjb!br.gov.caixa.mpi.dict.ejb.StatisticEjb
	java:global/simpi-dict/simpi-dict-war/StatisticEjb
	java:app/simpi-dict-war/StatisticEjb
	java:module/StatisticEjb

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CancelFundsRecoveryFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CancelFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CancelFundsRecoveryFacade
	java:app/simpi-dict-war/CancelFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CancelFundsRecoveryFacade
	java:module/CancelFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CancelFundsRecoveryFacade
	java:global/simpi-dict/simpi-dict-war/CancelFundsRecoveryFacade
	java:app/simpi-dict-war/CancelFundsRecoveryFacade
	java:module/CancelFundsRecoveryFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade
	java:app/simpi-dict-war/GetClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade
	java:module/GetClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade
	java:global/simpi-dict/simpi-dict-war/GetClaimFacade
	java:app/simpi-dict-war/GetClaimFacade
	java:module/GetClaimFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ConfirmClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ConfirmClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.ConfirmClaimFacade
	java:app/simpi-dict-war/ConfirmClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.ConfirmClaimFacade
	java:module/ConfirmClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.ConfirmClaimFacade
	java:global/simpi-dict/simpi-dict-war/ConfirmClaimFacade
	java:app/simpi-dict-war/ConfirmClaimFacade
	java:module/ConfirmClaimFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListFundsRecoveryRefundsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListFundsRecoveryRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryRefundsFacade
	java:app/simpi-dict-war/ListFundsRecoveryRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryRefundsFacade
	java:module/ListFundsRecoveryRefundsFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryRefundsFacade
	java:global/simpi-dict/simpi-dict-war/ListFundsRecoveryRefundsFacade
	java:app/simpi-dict-war/ListFundsRecoveryRefundsFacade
	java:module/ListFundsRecoveryRefundsFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'DeletarEntryDictFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/DeletarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.DeletarEntryDictFacade
	java:app/simpi-dict-war/DeletarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.DeletarEntryDictFacade
	java:module/DeletarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.DeletarEntryDictFacade
	java:global/simpi-dict/simpi-dict-war/DeletarEntryDictFacade
	java:app/simpi-dict-war/DeletarEntryDictFacade
	java:module/DeletarEntryDictFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'SegurancaEJB' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/SegurancaEJB!br.gov.caixa.mpi.dict.security.SegurancaEJB
	java:app/simpi-dict-war/SegurancaEJB!br.gov.caixa.mpi.dict.security.SegurancaEJB
	java:module/SegurancaEJB!br.gov.caixa.mpi.dict.security.SegurancaEJB
	java:global/simpi-dict/simpi-dict-war/SegurancaEJB
	java:app/simpi-dict-war/SegurancaEJB
	java:module/SegurancaEJB

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CancelRefundFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CancelRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CancelRefundFacade
	java:app/simpi-dict-war/CancelRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CancelRefundFacade
	java:module/CancelRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CancelRefundFacade
	java:global/simpi-dict/simpi-dict-war/CancelRefundFacade
	java:app/simpi-dict-war/CancelRefundFacade
	java:module/CancelRefundFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'RefundEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/RefundEjb!br.gov.caixa.mpi.dict.ejb.RefundEjb
	java:app/simpi-dict-war/RefundEjb!br.gov.caixa.mpi.dict.ejb.RefundEjb
	java:module/RefundEjb!br.gov.caixa.mpi.dict.ejb.RefundEjb
	java:global/simpi-dict/simpi-dict-war/RefundEjb
	java:app/simpi-dict-war/RefundEjb
	java:module/RefundEjb

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateSyncVerificationFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateSyncVerificationFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateSyncVerificationFacade
	java:app/simpi-dict-war/CreateSyncVerificationFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateSyncVerificationFacade
	java:module/CreateSyncVerificationFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateSyncVerificationFacade
	java:global/simpi-dict/simpi-dict-war/CreateSyncVerificationFacade
	java:app/simpi-dict-war/CreateSyncVerificationFacade
	java:module/CreateSyncVerificationFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateFundsRecoveryFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CreateFundsRecoveryFacade
	java:app/simpi-dict-war/CreateFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CreateFundsRecoveryFacade
	java:module/CreateFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CreateFundsRecoveryFacade
	java:global/simpi-dict/simpi-dict-war/CreateFundsRecoveryFacade
	java:app/simpi-dict-war/CreateFundsRecoveryFacade
	java:module/CreateFundsRecoveryFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetListInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetListInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade
	java:app/simpi-dict-war/GetListInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade
	java:module/GetListInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/GetListInfractionReportFacade
	java:app/simpi-dict-war/GetListInfractionReportFacade
	java:module/GetListInfractionReportFacade

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'DirectoryEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/DirectoryEjb!br.gov.caixa.mpi.dict.ejb.DirectoryEjb
	java:app/simpi-dict-war/DirectoryEjb!br.gov.caixa.mpi.dict.ejb.DirectoryEjb
	java:module/DirectoryEjb!br.gov.caixa.mpi.dict.ejb.DirectoryEjb
	java:global/simpi-dict/simpi-dict-war/DirectoryEjb
	java:app/simpi-dict-war/DirectoryEjb
	java:module/DirectoryEjb

2026-07-14 17:39:20,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListEventNotificationsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListEventNotificationsFacade!br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade
	java:app/simpi-dict-war/ListEventNotificationsFacade!br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade
	java:module/ListEventNotificationsFacade!br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade
	java:global/simpi-dict/simpi-dict-war/ListEventNotificationsFacade
	java:app/simpi-dict-war/ListEventNotificationsFacade
	java:module/ListEventNotificationsFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'PolicyEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/PolicyEjb!br.gov.caixa.mpi.dict.ejb.PolicyEjb
	java:app/simpi-dict-war/PolicyEjb!br.gov.caixa.mpi.dict.ejb.PolicyEjb
	java:module/PolicyEjb!br.gov.caixa.mpi.dict.ejb.PolicyEjb
	java:global/simpi-dict/simpi-dict-war/PolicyEjb
	java:app/simpi-dict-war/PolicyEjb
	java:module/PolicyEjb

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetClaimsFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetClaimsFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade
	java:app/simpi-dict-war/GetClaimsFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade
	java:module/GetClaimsFacade!br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade
	java:global/simpi-dict/simpi-dict-war/GetClaimsFacade
	java:app/simpi-dict-war/GetClaimsFacade
	java:module/GetClaimsFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'AtualizarEntryDictFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/AtualizarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.AtualizarEntryDictFacade
	java:app/simpi-dict-war/AtualizarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.AtualizarEntryDictFacade
	java:module/AtualizarEntryDictFacade!br.gov.caixa.mpi.dict.v2.facade.directory.AtualizarEntryDictFacade
	java:global/simpi-dict/simpi-dict-war/AtualizarEntryDictFacade
	java:app/simpi-dict-war/AtualizarEntryDictFacade
	java:module/AtualizarEntryDictFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetCheckChavesFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetCheckChavesFacade!br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade
	java:app/simpi-dict-war/GetCheckChavesFacade!br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade
	java:module/GetCheckChavesFacade!br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade
	java:global/simpi-dict/simpi-dict-war/GetCheckChavesFacade
	java:app/simpi-dict-war/GetCheckChavesFacade
	java:module/GetCheckChavesFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'KeyEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/KeyEjb!br.gov.caixa.mpi.dict.ejb.KeyEjb
	java:app/simpi-dict-war/KeyEjb!br.gov.caixa.mpi.dict.ejb.KeyEjb
	java:module/KeyEjb!br.gov.caixa.mpi.dict.ejb.KeyEjb
	java:global/simpi-dict/simpi-dict-war/KeyEjb
	java:app/simpi-dict-war/KeyEjb
	java:module/KeyEjb

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ListarMarcacoesFraudeFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ListarMarcacoesFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacade
	java:app/simpi-dict-war/ListarMarcacoesFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacade
	java:module/ListarMarcacoesFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacade
	java:global/simpi-dict/simpi-dict-war/ListarMarcacoesFraudeFacade
	java:app/simpi-dict-war/ListarMarcacoesFraudeFacade
	java:module/ListarMarcacoesFraudeFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CloseRefundFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CloseRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CloseRefundFacade
	java:app/simpi-dict-war/CloseRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CloseRefundFacade
	java:module/CloseRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CloseRefundFacade
	java:global/simpi-dict/simpi-dict-war/CloseRefundFacade
	java:app/simpi-dict-war/CloseRefundFacade
	java:module/CloseRefundFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateRefundFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CreateRefundFacade
	java:app/simpi-dict-war/CreateRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CreateRefundFacade
	java:module/CreateRefundFacade!br.gov.caixa.mpi.dict.v2.facade.refund.CreateRefundFacade
	java:global/simpi-dict/simpi-dict-war/CreateRefundFacade
	java:app/simpi-dict-war/CreateRefundFacade
	java:module/CreateRefundFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CriacaoMarcacaoFraudeFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CriacaoMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacade
	java:app/simpi-dict-war/CriacaoMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacade
	java:module/CriacaoMarcacaoFraudeFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacade
	java:global/simpi-dict/simpi-dict-war/CriacaoMarcacaoFraudeFacade
	java:app/simpi-dict-war/CriacaoMarcacaoFraudeFacade
	java:module/CriacaoMarcacaoFraudeFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CreateCidFileFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CreateCidFileFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateCidFileFacade
	java:app/simpi-dict-war/CreateCidFileFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateCidFileFacade
	java:module/CreateCidFileFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.CreateCidFileFacade
	java:global/simpi-dict/simpi-dict-war/CreateCidFileFacade
	java:app/simpi-dict-war/CreateCidFileFacade
	java:module/CreateCidFileFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'GetEntryByCidFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/GetEntryByCidFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetEntryByCidFacade
	java:app/simpi-dict-war/GetEntryByCidFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetEntryByCidFacade
	java:module/GetEntryByCidFacade!br.gov.caixa.mpi.dict.v2.facade.reconciliation.GetEntryByCidFacade
	java:global/simpi-dict/simpi-dict-war/GetEntryByCidFacade
	java:app/simpi-dict-war/GetEntryByCidFacade
	java:module/GetEntryByCidFacade

2026-07-14 17:39:20,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'BucketStatesFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/BucketStatesFacade!br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade
	java:app/simpi-dict-war/BucketStatesFacade!br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade
	java:module/BucketStatesFacade!br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade
	java:global/simpi-dict/simpi-dict-war/BucketStatesFacade
	java:app/simpi-dict-war/BucketStatesFacade
	java:module/BucketStatesFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ClientConfigNp' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ClientConfigNp!br.gov.caixa.mpi.dict.util.ClientConfigNp
	java:app/simpi-dict-war/ClientConfigNp!br.gov.caixa.mpi.dict.util.ClientConfigNp
	java:module/ClientConfigNp!br.gov.caixa.mpi.dict.util.ClientConfigNp
	java:global/simpi-dict/simpi-dict-war/ClientConfigNp
	java:app/simpi-dict-war/ClientConfigNp
	java:module/ClientConfigNp

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'RefundFundsRecoveryFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/RefundFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.RefundFundsRecoveryFacade
	java:app/simpi-dict-war/RefundFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.RefundFundsRecoveryFacade
	java:module/RefundFundsRecoveryFacade!br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.RefundFundsRecoveryFacade
	java:global/simpi-dict/simpi-dict-war/RefundFundsRecoveryFacade
	java:app/simpi-dict-war/RefundFundsRecoveryFacade
	java:module/RefundFundsRecoveryFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CloseInfractionReportFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CloseInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CloseInfractionReportFacade
	java:app/simpi-dict-war/CloseInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CloseInfractionReportFacade
	java:module/CloseInfractionReportFacade!br.gov.caixa.mpi.dict.v2.facade.infraction.CloseInfractionReportFacade
	java:global/simpi-dict/simpi-dict-war/CloseInfractionReportFacade
	java:app/simpi-dict-war/CloseInfractionReportFacade
	java:module/CloseInfractionReportFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CancelamentoFraudMarkersFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CancelamentoFraudMarkersFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacade
	java:app/simpi-dict-war/CancelamentoFraudMarkersFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacade
	java:module/CancelamentoFraudMarkersFacade!br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacade
	java:global/simpi-dict/simpi-dict-war/CancelamentoFraudMarkersFacade
	java:app/simpi-dict-war/CancelamentoFraudMarkersFacade
	java:module/CancelamentoFraudMarkersFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CancelClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CancelClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CancelClaimFacade
	java:app/simpi-dict-war/CancelClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CancelClaimFacade
	java:module/CancelClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CancelClaimFacade
	java:global/simpi-dict/simpi-dict-war/CancelClaimFacade
	java:app/simpi-dict-war/CancelClaimFacade
	java:module/CancelClaimFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'JBossProperties' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/JBossProperties!br.gov.caixa.mpi.dict.util.JBossProperties
	java:app/simpi-dict-war/JBossProperties!br.gov.caixa.mpi.dict.util.JBossProperties
	java:module/JBossProperties!br.gov.caixa.mpi.dict.util.JBossProperties
	java:global/simpi-dict/simpi-dict-war/JBossProperties
	java:app/simpi-dict-war/JBossProperties
	java:module/JBossProperties

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ElementSignEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ElementSignEjb!br.gov.caixa.mpi.dict.ejb.ElementSignEjb
	java:app/simpi-dict-war/ElementSignEjb!br.gov.caixa.mpi.dict.ejb.ElementSignEjb
	java:module/ElementSignEjb!br.gov.caixa.mpi.dict.ejb.ElementSignEjb
	java:global/simpi-dict/simpi-dict-war/ElementSignEjb
	java:app/simpi-dict-war/ElementSignEjb
	java:module/ElementSignEjb

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'PoolingSimpiDictEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/PoolingSimpiDictEjb!br.gov.caixa.mpi.dict.pooling.PoolingSimpiDictEjb
	java:app/simpi-dict-war/PoolingSimpiDictEjb!br.gov.caixa.mpi.dict.pooling.PoolingSimpiDictEjb
	java:module/PoolingSimpiDictEjb!br.gov.caixa.mpi.dict.pooling.PoolingSimpiDictEjb
	java:global/simpi-dict/simpi-dict-war/PoolingSimpiDictEjb
	java:app/simpi-dict-war/PoolingSimpiDictEjb
	java:module/PoolingSimpiDictEjb

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'ConsultarEstatisticasPessoaFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/ConsultarEstatisticasPessoaFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasPessoaFacade
	java:app/simpi-dict-war/ConsultarEstatisticasPessoaFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasPessoaFacade
	java:module/ConsultarEstatisticasPessoaFacade!br.gov.caixa.mpi.dict.v2.facade.statistics.ConsultarEstatisticasPessoaFacade
	java:global/simpi-dict/simpi-dict-war/ConsultarEstatisticasPessoaFacade
	java:app/simpi-dict-war/ConsultarEstatisticasPessoaFacade
	java:module/ConsultarEstatisticasPessoaFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'CompleteClaimFacade' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/CompleteClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CompleteClaimFacade
	java:app/simpi-dict-war/CompleteClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CompleteClaimFacade
	java:module/CompleteClaimFacade!br.gov.caixa.mpi.dict.v2.facade.claim.CompleteClaimFacade
	java:global/simpi-dict/simpi-dict-war/CompleteClaimFacade
	java:app/simpi-dict-war/CompleteClaimFacade
	java:module/CompleteClaimFacade

2026-07-14 17:39:20,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) [CORRELATION-ID:]WFLYEJB0473: JNDI bindings for session bean named 'RequisicaoBacenEjb' in deployment unit 'subdeployment "simpi-dict-war.war" of deployment "simpi-dict.ear"' are as follows:

	java:global/simpi-dict/simpi-dict-war/RequisicaoBacenEjb!br.gov.caixa.mpi.dict.ejb.RequisicaoBacenEjb
	java:app/simpi-dict-war/RequisicaoBacenEjb!br.gov.caixa.mpi.dict.ejb.RequisicaoBacenEjb
	java:module/RequisicaoBacenEjb!br.gov.caixa.mpi.dict.ejb.RequisicaoBacenEjb
	java:global/simpi-dict/simpi-dict-war/RequisicaoBacenEjb
	java:app/simpi-dict-war/RequisicaoBacenEjb
	java:module/RequisicaoBacenEjb

2026-07-14 17:39:20,480 INFO  [org.jboss.weld.Version] (MSC service thread 1-5) [CORRELATION-ID:]WELD-000900: 2.4.7 (redhat)
2026-07-14 17:39:22,273 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) [CORRELATION-ID:]WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'simpi-dict.ear/simpi-dict-war.war#OracleSimpiDS'
2026-07-14 17:39:23,242 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
2026-07-14 17:39:23,406 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000270: Type registration [byte[]] overrides previous : org.hibernate.type.BinaryType@26748186
2026-07-14 17:39:23,406 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000270: Type registration [[B] overrides previous : org.hibernate.type.BinaryType@26748186
2026-07-14 17:39:23,406 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000270: Type registration [Byte[]] overrides previous : org.hibernate.type.WrapperBinaryType@118aac75
2026-07-14 17:39:23,406 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 68) [CORRELATION-ID:]HHH000270: Type registration [[Ljava.lang.Byte;] overrides previous : org.hibernate.type.WrapperBinaryType@118aac75
2026-07-14 17:39:23,410 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 68) [CORRELATION-ID:]Envers integration enabled? : true
2026-07-14 17:39:26,180 WARN  [org.jboss.weld.Validator] (MSC service thread 1-2) [CORRELATION-ID:]WELD-001471: Interceptor method init defined on class br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb is not defined according to the specification. It should not throw java.lang.Exception, which is a checked exception.
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.init(HsmCaixaEjb.java:39)
  StackTrace
2026-07-14 17:39:27,063 INFO  [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14 17:39:27,068 INFO  [br.gov.caixa.mpi.dict.util.ClientConfigNp] (ServerService Thread Pool -- 70) [CORRELATION-ID:]********************Inicializando constru??o do client Bacen**********************
2026-07-14 17:39:27,077 ERROR [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: null, URL SSO: https://login.des.caixa/auth/realms/intranet, Causa: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.: br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:301)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:354)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:74)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:124)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:138)
	at org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
	at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-07-14 17:39:27,089 INFO  [br.gov.caixa.mpi.dict.util.ClientConfigNp] (ServerService Thread Pool -- 70) [CORRELATION-ID:]Certificado carregado: java.security.KeyStore@22c7a9ed
2026-07-14 17:39:27,166 INFO  [br.gov.caixa.mpi.dict.util.ClientConfigNp] (ServerService Thread Pool -- 70) [CORRELATION-ID:]Certificado carregado: java.security.KeyStore@7d25b0ca
2026-07-14 17:39:28,597 INFO  [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB] Chave publica recuperada do SSO. URL: https://login.des.caixa/auth/realms/intranet, Status: 200
2026-07-14 17:39:28,607 ERROR [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: null, URL SSO: https://logindes.caixa.gov.br/auth/realms/internet, Causa: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.: br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:301)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:354)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:74)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:124)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:138)
	at org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
	at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-07-14 17:39:28,678 INFO  [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB] Chave publica recuperada do SSO. URL: https://logindes.caixa.gov.br/auth/realms/internet, Status: 200
2026-07-14 17:39:28,679 INFO  [br.gov.caixa.mpi.dict.security.SegurancaEJB] (ServerService Thread Pool -- 76) [CORRELATION-ID:][SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14 17:39:29,089 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 76) [CORRELATION-ID:]RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.mpi.dict.DICTApplication$Proxy$_$$_WeldClientProxy
2026-07-14 17:39:29,471 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 76) [CORRELATION-ID:]WFLYUT0021: Registered web context: '/simpi-dict-war' for server 'default-server'
2026-07-14 17:39:29,562 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) [CORRELATION-ID:]WFLYSRV0010: Deployed "wmq.jmsra.rar" (runtime-name : "wmq.jmsra.rar")
2026-07-14 17:39:29,562 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) [CORRELATION-ID:]WFLYSRV0010: Deployed "simpi-dict.ear" (runtime-name : "simpi-dict.ear")
2026-07-14 17:39:29,768 INFO  [org.jboss.as.server] (Controller Boot Thread) [CORRELATION-ID:]WFLYSRV0212: Resuming server
2026-07-14 17:39:29,772 WARN  [org.jboss.as.ejb3.timer] (EJB default - 2) [CORRELATION-ID:]WFLYEJB0043: A previous execution of timer [id=e9c46791-805b-448a-9232-e6c0c62f0100 timedObjectId=simpi-dict.simpi-dict-war.PoolingSimpiDictEjb auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@1a8d1e03 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Tue Jul 14 17:39:28 BRT 2026 timerState=IN_TIMEOUT info=null] is still in progress, skipping this overlapping scheduled execution at: Tue Jul 14 17:39:29 BRT 2026.
2026-07-14 17:39:29,773 WARN  [org.jboss.as.ejb3.timer] (EJB default - 3) [CORRELATION-ID:]WFLYEJB0043: A previous execution of timer [id=e9c46791-805b-448a-9232-e6c0c62f0100 timedObjectId=simpi-dict.simpi-dict-war.PoolingSimpiDictEjb auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@1a8d1e03 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Tue Jul 14 17:39:29 BRT 2026 timerState=IN_TIMEOUT info=null] is still in progress, skipping this overlapping scheduled execution at: Tue Jul 14 17:39:29 BRT 2026.
2026-07-14 17:39:29,773 INFO  [org.jboss.as] (Controller Boot Thread) [CORRELATION-ID:]WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-07-14 17:39:29,773 INFO  [org.jboss.as] (Controller Boot Thread) [CORRELATION-ID:]WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
2026-07-14 17:39:29,773 INFO  [org.jboss.as] (Controller Boot Thread) [CORRELATION-ID:]WFLYSRV0025: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) started in 27726ms - Started 1495 of 1734 services (374 services are lazy, passive or on-demand)
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][JWT-AUTH-FILTER] versao da api v2
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:29,968 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:30,064 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:39:30,065 INFO  [br.gov.caixa.mpi.dict.rest.v2.InfractionReportRest] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][SIMPI-DICT][INFRACTION-REPORT-V2] Buscar relato de infracao. InfractionReportId: ef8893bf-e0e4-4996-a1a2-b638a81b424f
2026-07-14 17:39:30,065 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:39:30,070 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][SIMPI-DICT] [InfractionReport_V2] Iniciando a consulta de um Relato no bacen: ef8893bf-e0e4-4996-a1a2-b638a81b424f
2026-07-14 17:39:30,070 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:39:30,070 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]-----> SIMPI-DICT - Total requisicao: 3
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]-----> SIMPI-DICT - Total requisicao: 3
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]-----> SIMPI-DICT - Total requisicao: 3
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]clientPool nulo !!!
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]clientPool nulo !!!
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]clientPool nulo !!!
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]********************Inicializando constru??o do client Bacen**********************
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]********************Inicializando constru??o do client Bacen**********************
2026-07-14 17:39:30,072 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]********************Inicializando constru??o do client Bacen**********************
2026-07-14 17:39:30,073 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]Certificado carregado: java.security.KeyStore@17d81158
2026-07-14 17:39:30,073 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]Certificado carregado: java.security.KeyStore@20daa68f
2026-07-14 17:39:30,073 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]Certificado carregado: java.security.KeyStore@6badcf93
2026-07-14 17:39:30,074 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]Certificado carregado: java.security.KeyStore@1998a8cc
2026-07-14 17:39:30,074 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]Certificado carregado: java.security.KeyStore@dd4c12a
2026-07-14 17:39:30,074 INFO  [br.gov.caixa.mpi.dict.util.ClientConfig] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]Certificado carregado: java.security.KeyStore@451b8f7
2026-07-14 17:39:30,164 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:30,164 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]--->InfractionReportApi#getInfractionReport(UUID,String) GET https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:30,164 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:30,772 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58]InfractionReportApi#getInfractionReport(UUID,String)
2026-07-14 17:39:30,863 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753]PolicyApi#getPolicy(String,String)
2026-07-14 17:39:30,864 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090]PolicyApi#getPolicy(String,String)
2026-07-14 17:39:31,066 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:31,066 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:31,067 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:39:31,068 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:39:31,069 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:31,262 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf]PolicyApi#getPolicy(String,String)
2026-07-14 17:39:31,267 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:30 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<GetInfractionReportResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>GEGGsZbnYtAgnyTs5UF6ujUa6k2O6s3qozVYwp0IMJk=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>OlPOBErxNIz6ADliMSUS1KX4hKgWkmnJbTiWWDRKFjFHbLmh7dPFdiqbiDMV1CnzzVdQlYStCmoW&#13;
Ckii0q4A3CTtdBeDUkt+4mRAyJtB6HKNKTPe3oInffkBdu3650/RLDw6cK+B77LH4ysy5dsHxmUG&#13;
v8/7m31Cr0SMDYCdvezqoZ+AOhfU1U8Hp9K1dnfd6p404nS7B8XTfDHpjNikz16dXq0zKq5nAKtc&#13;
p4MfpJhNVjcSKr+nDPWMP/6+9LS4ExTuFTi/mvnwjqJ2u2/PLcqi2gVmvGooVirqXgzkzSjIadBK&#13;
g1w11C+Q17FCeJ/dqvSud1ua8ZXfBICGl4/xqA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739306890036030507FB60</CorrelationId><ResponseTime>2026-07-14T20:39:30.694Z</ResponseTime><InfractionReport><TransactionId>E003603052024080817363728bce97be</TransactionId><Reason>REFUND_REQUEST</Reason><SituationType>OTHER</SituationType><ReportDetails>Teste Relato de Infracao 2.0 externo</ReportDetails><Id>ef8893bf-e0e4-4996-a1a2-b638a81b424f</Id><Status>ACKNOWLEDGED</Status><ReporterParticipant>00360305</ReporterParticipant><CounterpartyParticipant>09089356</CounterpartyParticipant><CreationTime>2024-08-08T17:39:45.163Z</CreationTime><LastModified>2024-08-08T17:39:49.137Z</LastModified></InfractionReport></GetInfractionReportResponse> Type: br.gov.caixa.mpi.dict.v2.api.model.GetInfractionReportResponse
2026-07-14 17:39:31,268 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: 
    responseTime: 2026-07-14T20:39:30.694Z
    correlationId: A202607141739306890036030507FB60
    infractionReport: class ExtendedInfractionReport {
    transactionId: E003603052024080817363728bce97be
    reason: REFUND_REQUEST
    situationType: OTHER
    contactInformation: null
    reportDetails: Teste Relato de Infracao 2.0 externo
    id: ef8893bf-e0e4-4996-a1a2-b638a81b424f
    status: ACKNOWLEDGED
    reporterParticipant: 00360305
    counterpartyParticipant: 09089356
    fraudMarkerId: null
    analysisResult: null
    analysisDetails: null
    creationTime: 2024-08-08T17:39:45.163Z
    lastModified: 2024-08-08T17:39:49.137Z
}
} Type: br.gov.caixa.mpi.dict.v2.api.model.GetInfractionReportResponse
2026-07-14 17:39:31,268 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade] (default task-1) [CORRELATION-ID:93bc4cc3-6088-424a-b9b0-3d10f8cc9c58][SIMPI-DICT] [InfractionReport_V2] retorno bacen=class ExtendedInfractionReport {
    transactionId: E003603052024080817363728bce97be
    reason: REFUND_REQUEST
    situationType: OTHER
    contactInformation: null
    reportDetails: Teste Relato de Infracao 2.0 externo
    id: ef8893bf-e0e4-4996-a1a2-b638a81b424f
    status: ACKNOWLEDGED
    reporterParticipant: 00360305
    counterpartyParticipant: 09089356
    fraudMarkerId: null
    analysisResult: null
    analysisDetails: null
    creationTime: 2024-08-08T17:39:45.163Z
    lastModified: 2024-08-08T17:39:49.137Z
}
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:30 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>UogK292MRzhj2orX4DM/fNS4OglP1i6yuOUknLuirWU=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>BITHZSOmV+QUzZhoxuSoPttY1I1F+denh2eWsnPJfV1BULBEZtOYr0vA2LHif8AuEVly/zDjRB3s&#13;
lm1wt/qUJvVpvdzUYRFdnRCs+JrZUoysJR/JA5rzjLMU49tXzjY6ZO6r7kAzkY/52plJL7VlmWny&#13;
1qsFi7sM+4p35BLzp7ciG2sL80B5lE1Ty+CHIVkksTo+3HAGUxyROlsUuMZOICSjMkIclbRPUyus&#13;
lj7v5NVLin3n4w8wavTAzCJKegmdjdaYQhKJA9bigehHPmKrvz913lMioVNcQsZ9lGpAy6q5sjOS&#13;
9OFPi+0AWXqLO0DZW+YEHWMIOgyPAlNtLm8dIA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173930689003603051E0A90</CorrelationId><ResponseTime>2026-07-14T20:39:30.802Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:30 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>+hhrG2g4uaHStuXQcCRdBgh4tv+0APWq4Pf62hjwTd8=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>J+eWnqkpwkLM2wuz36uG6/I/saEMrcPOi+1wImYjhltcrda9z84OHGg6kUdsETtVv6KaEw2f5OR2&#13;
wOe+k7RASJ3BsNQcyIR/wgytNTWkVtYdcyqJiclmWyO+nqcCmR/r6zb6xqbpQC2GgBxR7/bd1sLu&#13;
eupaZ1LODilH3lqRL4zjRs4MVP7vFhhPTlUtt8nXjJRgDZz6rIW1GlN0HrQ0uO94TzsOTxDcESMR&#13;
1fImKGwnByLoat/v2N8py+8Yn16tDUzznsnTSUYV5HLjJaBICuF0CoifSV8l5TNBYdHyCQtjfTIg&#13;
jTyuDGy9hausO77VSDgl8jldQdyA6SDmI0UgZw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A2026071417393076600360305140060</CorrelationId><ResponseTime>2026-07-14T20:39:30.803Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@2ecc45bf
    correlationId: A2026071417393076600360305140060
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:30.803Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@7e725ed0
    correlationId: A20260714173930689003603051E0A90
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:30.802Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-3) [CORRELATION-ID:79132d58-2b86-4655-bc86-2dcc421ce753][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@7e725ed0
    correlationId: A20260714173930689003603051E0A90
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:30.802Z
}
2026-07-14 17:39:31,269 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-2) [CORRELATION-ID:a24cd24b-1de9-4061-945e-1ea63ba2f090][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@2ecc45bf
    correlationId: A2026071417393076600360305140060
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:30.803Z
}
2026-07-14 17:39:31,274 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:31 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>1L7Olb2W4u5cJ+n8WXoVdKTFHAMLZZt4l2r0Mado3cM=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>BSSyzpOepRJPaojS5I4aLketGfv0YKAI5pfILOG5I4itbTaa+Aezt5+kctIKDaA4KR4TCJ9mZlkP&#13;
nGD6kCAoTXrgFh4pHiw8lu2mak09xB49TKfTDOQ16aiDHM1Bcimjc8mDWS5yYgFOhI6zcyTeWFg7&#13;
yvdXrK5GU3SNTIYsYZ5J/wkDn11tLJzO3kyfVdFBjkIm/Uo3IMUgt+bNXoF7+5gut2K+Eob63Oz1&#13;
lhjU9lSGqR7y5L4MCYWItqKx0VSvpkfUB9FaUfUjiLR5vGOQSK7r/rB/+RtrUlXpGZECibn/cSbI&#13;
o8vVgpGU6JMvWOslOsVAN2tizZwtdAOztYlVKw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173931075003603050BD2CD</CorrelationId><ResponseTime>2026-07-14T20:39:31.187Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,274 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@1f9f0621
    correlationId: A20260714173931075003603050BD2CD
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:31.187Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:31,274 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-4) [CORRELATION-ID:23660a2a-a487-4b96-823a-ef8170edcbcf][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@1f9f0621
    correlationId: A20260714173931075003603050BD2CD
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:31.187Z
}
2026-07-14 17:39:31,468 127.0.0.6 - - [14/Jul/2026:17:39:31 -0300] "GET /simpi-dict-war/api/v2/dict/infractionReport/findById/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1" 200 499 "-" "okhttp/3.6.0" application/json "default task-1 -" 499 19597
2026-07-14 17:39:31,468 127.0.0.6 - - [14/Jul/2026:17:39:31 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-3 -" 258 10195
2026-07-14 17:39:31,468 127.0.0.6 - - [14/Jul/2026:17:39:31 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-4 -" 258 456
2026-07-14 17:39:31,477 127.0.0.6 - - [14/Jul/2026:17:39:31 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-2 -" 258 19414
2026-07-14 17:39:33,251 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:33,251 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:33,251 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][SIMPI-DICT] Iniciando a listagem de politicas.
2026-07-14 17:39:33,255 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][SIMPI-DICT] Efetuando a listagem de politicas.
2026-07-14 17:39:33,256 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60]--->PolicyApi#bucketStates(String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:33,381 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60]PolicyApi#bucketStates(String)
2026-07-14 17:39:33,417 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:33 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<ListPoliciesResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>QXmfgvS3xhDAaXI04BLBk76dMQSUigoeGCYhEV7bFN4=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>j4jQSOJIjpWxKMFG1Nhhmm8sNz1I8jHxfKogU0Z7n89dt93z3T3l9FZx8Iy3oWwA3ggfiIBUhX2X&#13;
e3zJZ5mUX75aTsxLzuaaBcHgG9laygicVjryB+tTjgxtklYUSPY9Z77NzsXebq+xYi123lkYKe25&#13;
aIQffzKmYZFlG2Q0owxbxxe8FiJHGsi+XgoQ4cJrmK6s5lKyQjExQdSOoBw/xsSypxiN7kEHzIxY&#13;
aBxjcP8OogZX1v/aUqwhrH4ajsLkFK2ZI0NgRIGj+a8FwG3TnRskRe+DfTLrSNlg9OkyeHYaWZ38&#13;
KEPPn+ccwbw8kgcpEWQGptbBg9Xxx2fq8zYPFw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173933261003603052F6D53</CorrelationId><ResponseTime>2026-07-14T20:39:33.374Z</ResponseTime><Category>C</Category><Policies><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>100</AvailableTokens><Capacity>100</Capacity><RefillTokens>20</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_EVENTS_LIST</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>SYNC_VERIFICATIONS_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_WRITE</Name></Policy><Policy><AvailableTokens>17999</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_READ</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_WRITE</Name></Policy><Policy><AvailableTokens>70</AvailableTokens><Capacity>70</Capacity><RefillTokens>70</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>KEYS_CHECK</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>EVENT_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>ENTRIES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_WRITE</Name></Policy><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_READ</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_READ</Name></Policy><Policy><AvailableTokens>18</AvailableTokens><Capacity>20</Capacity><RefillTokens>6</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_LIST</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>197</AvailableTokens><Capacity>200</Capacity><RefillTokens>60</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>86400</RefillPeriodSec><Name>CIDS_FILES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CIDS_ENTRIES_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>12000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>PERSONS_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_FILES_READ</Name></Policy><Policy><AvailableTokens>72000</AvailableTokens><Capacity>72000</Capacity><RefillTokens>2400</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_WRITE</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_READ_PARTICIPANT_ANTISCAN</Name></Policy><Policy><AvailableTokens>199</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITH_ROLE</Name></Policy></Policies></ListPoliciesResponse> Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:39:33,417 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:39:33.374Z
    correlationId: A20260714173933261003603052F6D53
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 17999
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 18
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 197
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
} Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:39:33,417 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-5) [CORRELATION-ID:117c142e-e9b8-4c63-b6ee-f4d21ae6ca60][SIMPI-DICT] listagem de politicas finalizada em 162 ms. ListPoliciesResponse: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:39:33.374Z
    correlationId: A20260714173933261003603052F6D53
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 17999
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 18
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 197
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
}
2026-07-14 17:39:33,423 127.0.0.6 - - [14/Jul/2026:17:39:33 -0300] "GET /simpi-dict-war/api/v1/dict/policy HTTP/1.1" 200 7665 "-" "okhttp/3.6.0" application/json "default task-5 -" 7665 174
2026-07-14 17:39:40,194 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:40,194 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:40,194 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:40,194 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:40,195 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:40,195 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:40,195 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][JWT-AUTH-FILTER] versao da api v2
2026-07-14 17:39:40,195 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:40,206 INFO  [br.gov.caixa.mpi.dict.rest.v2.InfractionReportRest] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][SIMPI-DICT][INFRACTION-REPORT-V2] Buscar todos os relatos de infracao.
2026-07-14 17:39:40,207 INFO  [br.gov.caixa.mpi.dict.rest.v2.RefundRest] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI-DICT] Iniciando a busca das devolucoes. DevolucaoDto: org.jboss.resteasy.specimpl.UnmodifiableMultivaluedMap@1f341328
2026-07-14 17:39:40,218 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][SIMPI-DICT] [InfractionReport_V2] Solicitando Relatos no bacen 
2026-07-14 17:39:40,219 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14 17:39:40,219 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14 17:39:40,227 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14 17:39:40,263 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8]--->RefundApi#listRefunds(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1
Content-Type: application/xml
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1 (0-byte body) {Content-Type=[application/xml], Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:40,266 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9]--->InfractionReportApi#listInfractionReport(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:40,270 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5]--->ClaimApi#listClaims(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=true&ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&ModifiedBefore=2026-07-14T20:39:40Z&IsDonor=false&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=true&ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&ModifiedBefore=2026-07-14T20:39:40Z&IsDonor=false&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:40,275 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978]--->ClaimApi#listClaims(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=false&ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&ModifiedBefore=2026-07-14T20:39:40Z&IsDonor=true&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=false&ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&ModifiedBefore=2026-07-14T20:39:40Z&IsDonor=true&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:40,287 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9]InfractionReportApi#listInfractionReport(Map)
2026-07-14 17:39:40,287 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8]RefundApi#listRefunds(Map)
2026-07-14 17:39:40,294 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5]ClaimApi#listClaims(Map)
2026-07-14 17:39:40,367 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1886
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:40 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListRefundsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>bi0rgJBpmVQAH9TjkCmSfdSppGDVVQ/lUQ7i3h/hGP0=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>qXQTSSWiJSuULctXv4/dD1erN04SJqxZtRPIsWWpHU8N1QvukK2u/T2zdt6FHB/N+Wvj5V5eKQA8&#13;
IzjovFYm0vYvfftTojfDCSZ+Tu0Q/zuVP7uR7co87njXwvnXBazLx24tGPFb1BW10o/ZHqB9jTk0&#13;
SQG6r0/9iQs4NwWB/DYidD7zKjUoU3nPtg5hjpMww0OBPrITd0m8YYAiP3zayk9oGByGarSpFUxf&#13;
MMKWNvI2RVWgiHc1US/RAAsjf6ML/HSW4ces6DU2pguF0gMD4dj2lNf32pqtNoXei+Hj2955gTfl&#13;
mwKrtcWefeCVusHL9rCmszUVoccQtzx/jUfV4Q==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739402770036030510B8B7</CorrelationId><ResponseTime>2026-07-14T20:39:40.282Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListRefundsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:39:40,372 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    refunds: []
} Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:39:40,373 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 153 ms. QueryParams: {ModifiedAfter=[2026-07-14T20:34:00Z], Participant=00360305, IncludeDetails=[false], ModifiedBefore=[2026-07-14T20:39:40Z], Limit=[200], ParticipantRole=[REQUESTING]} Devolucoes: []
2026-07-14 17:39:40,373 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-6) [CORRELATION-ID:1a297a8e-cbdd-4353-a7ba-67fdb83691e8][SIMPI-DICT] [DEVOLUCOES] Foram retornadas 0 devolucoes do Bacen em que a caixa e [REQUESTING] possui mais elementos false
2026-07-14 17:39:40,376 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1906
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:40 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListInfractionReportsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>Go2VKUxCvcip7NAg9MPpPJGIaQwYN7wbiEjIRr7fyQk=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>T9hVbrPT9F+8uicf+nVchWqXKJkahqNGCK14OZc7mQgKgSa+R+T+V/umyuxWjIxU97GQy1nXQVYu&#13;
30R+x+7+c+kLi4eOob+98fTeA9puHwt9Dp9KzpInnu0MJFjUKDMzYjuNcaxUc6YHCSwhV2eJWw/7&#13;
NrO8qm8GpQKn+wwQO0vGOxeLJYBVn/VKwsz8wNx+wBKzsMZLbXmUrmltaRAMWsvs9vQaqvi7gNTs&#13;
ToTGPIi/9YKs6ywy0nysl0q2jhS8+g3YPcJCppfqKvK0wj4TBGxDG8VI8OELmPjHucZ/a2F/v/Pe&#13;
ELqfHvtCPBMMjSk1E4EecjBS2Kkke6n74su8Bw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739402760036030580C669</CorrelationId><ResponseTime>2026-07-14T20:39:40.282Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListInfractionReportsResponse> Type: br.gov.caixa.mpi.dict.v2.api.model.ListInfractionReportsResponse
2026-07-14 17:39:40,376 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: 
    responseTime: 2026-07-14T20:39:40.282Z
    correlationId: A202607141739402760036030580C669
    infractionReport: []
} Type: br.gov.caixa.mpi.dict.v2.api.model.ListInfractionReportsResponse
2026-07-14 17:39:40,376 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade] (default task-9) [CORRELATION-ID:687bf1f2-bb61-4303-a7cf-1f49189457f9][SIMPI-DICT] [InfractionReport_V2] Requisicao ao Bacen para buscar relatos realizada em 158 ms. Foram retornados 0 do bacen.  Possui mais elementos: false
2026-07-14 17:39:40,378 127.0.0.6 - - [14/Jul/2026:17:39:40 -0300] "GET /simpi-dict-war/api/v1/dict/refund?ModifiedAfter=2026-07-14T20%3A34%3A00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20%3A39%3A40Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-6 -" 34 189
2026-07-14 17:39:40,380 127.0.0.6 - - [14/Jul/2026:17:39:40 -0300] "GET /simpi-dict-war/api/v2/dict/infractionReport/infractionReports?ModifiedAfter=2026-07-14T20%3A34%3A00Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20%3A39%3A40Z&Limit=200 HTTP/1.1" 200 159 "-" "okhttp/3.6.0" application/json "default task-9 -" 159 186
2026-07-14 17:39:40,462 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978]ClaimApi#listClaims(Map)
2026-07-14 17:39:40,465 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1884
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:40 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListClaimsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>UwpExab1207Dh+vihj4wYP05iT58231jAquYPvDxfrU=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>OXT3NmLUmIxdIhvSopvcMEjsaq3MgqfDkQy35cHExDIVHLB7y7U7XLSrlwCSL5yblNy2kFiaaGoX&#13;
zs87t6U+rIqWCulzGj8zf/x+0D7dLpLsHRKGee+J/7BR7AFhnzVe6yeiKd9t5UB3Gi+B/U8rI9GH&#13;
5CAZH54AclEitulDxr8+sDnAc5L+8LQEVoLUDNGvbgQB/qvKOurK5XuhYueBYulb+Shg5yfdprn8&#13;
Hb+9vwObCCNBj061M6qPROBKQ4gSfLcRNJhC2i+lhM+9RkVyyblQ1kUWTF5QnVd14EsTUuAnPC3A&#13;
W90n90c37mZcx6rnDy2MCzRqbx1nZqJuTl4jBg==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173940285003603054F245D</CorrelationId><ResponseTime>2026-07-14T20:39:40.289Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListClaimsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:39:40,466 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    claims: []
} Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:39:40,465 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:40,466 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:40,466 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 247 ms. Foram encontradas 0  reivindicacoes. 
  Possui mais elementos: false
2026-07-14 17:39:40,466 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-8) [CORRELATION-ID:28131bb5-e588-4f0e-bf63-2356a88de3e5][SIMPI-DICT] [Claims]  QueryParams: {Status=[OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED], IsClaimer=[true], ModifiedAfter=[2026-07-14T20:34:00Z], Participant=00360305, ModifiedBefore=[2026-07-14T20:39:40Z], IsDonor=[false], Limit=[200]}
 Reivindicacoes: []
2026-07-14 17:39:40,466 INFO  [br.gov.caixa.mpi.dict.rest.v2.RefundRest] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI-DICT] Iniciando a busca das devolucoes. DevolucaoDto: org.jboss.resteasy.specimpl.UnmodifiableMultivaluedMap@5d04bca8
2026-07-14 17:39:40,467 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14 17:39:40,468 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216]--->RefundApi#listRefunds(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1
Content-Type: application/xml
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:39:40Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1 (0-byte body) {Content-Type=[application/xml], Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:40,471 127.0.0.6 - - [14/Jul/2026:17:39:40 -0300] "GET /simpi-dict-war/api/v1/dict/claim/claims?IsClaimer=true&Status=OPEN%2CWAITING_RESOLUTION%2CCONFIRMED%2CCOMPLETED%2CCANCELLED&ModifiedAfter=2026-07-14T20%3A34%3A00Z&ModifiedBefore=2026-07-14T20%3A39%3A40Z&IsDonor=false&Limit=200 HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-8 -" 34 276
2026-07-14 17:39:40,477 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1884
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:40 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListClaimsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>C7R/RdT/YbgCY02J4/EMX10ZLOHvbgJrCxC2yESjMxY=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>tdpJfYQ47CIusuNUkhZegdP+3Y5Nh+PlW6my7m7TUUoRnUfgQEnmnC87bQG+SNS0NKzvIaoMzNwj&#13;
Tjdh8jFMACAsAKcj/tu5wDo6oriDVqIYeXrip+KiqCDn+Ylb//MEuu/PEVxyHcII9PgtHHgSkVn4&#13;
ngCD9CGAfNFA/ELVNg5TXvjDGh6JgcYvdFkZzZ/ZgMUSOAccUhW4BHq/iUof0XgVcvRaJONamEso&#13;
Km5b8CeTc+NbQKkXenwOQtMGY2y8PjooE26v8rMwnnGIx3d33qzuGZ4Ybkwfk51k7Ef77bDxoFw7&#13;
fMkHaCy7NzWQge56Hy9pfVMIhN++4NthsLzU+w==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739403850036030531276C</CorrelationId><ResponseTime>2026-07-14T20:39:40.389Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListClaimsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:39:40,477 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    claims: []
} Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:39:40,477 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 250 ms. Foram encontradas 0  reivindicacoes. 
  Possui mais elementos: false
2026-07-14 17:39:40,477 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-7) [CORRELATION-ID:e6832615-4c35-4ce2-91a1-de6dbe6a4978][SIMPI-DICT] [Claims]  QueryParams: {Status=[OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED], IsClaimer=[false], ModifiedAfter=[2026-07-14T20:34:00Z], Participant=00360305, ModifiedBefore=[2026-07-14T20:39:40Z], IsDonor=[true], Limit=[200]}
 Reivindicacoes: []
2026-07-14 17:39:40,479 127.0.0.6 - - [14/Jul/2026:17:39:40 -0300] "GET /simpi-dict-war/api/v1/dict/claim/claims?IsClaimer=false&Status=OPEN%2CWAITING_RESOLUTION%2CCONFIRMED%2CCOMPLETED%2CCANCELLED&ModifiedAfter=2026-07-14T20%3A34%3A00Z&ModifiedBefore=2026-07-14T20%3A39%3A40Z&IsDonor=true&Limit=200 HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-7 -" 34 288
2026-07-14 17:39:40,485 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216]RefundApi#listRefunds(Map)
2026-07-14 17:39:40,566 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1886
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:40 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListRefundsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>1AUu7QdhS+fKhEnSQYqLmjggVVfLL8TYaCiXeE9OH9I=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>GIDOpLIxDtkhLKVNlWyyhm84WRalPR6rGlYKAIe+Y8rPcCIR2fpoDFZ/A0dGhKW7+KYN4b2QwDii&#13;
xUzTT99Jp6ykzZ9mj8BiPZwVimwSjtjFDXmdB3Hc3X6PDeHk2MMWKSOrhyTq7vN+bTv/f0pmD0CF&#13;
TNRbG8GEw3Dr1dH1l/teyCoZeehR2hMtQBeEVz8jyYGUyvF5pOIEoQpsCPIqtQAjV+CcVWOqz5aV&#13;
2NDl3a+5GUcySGIl/p7Qwv8+A6cMHxnaJWq4UjgP7ehJFRd2nlHerZRYyguZyzIGTxqzOFwXmA1S&#13;
sHnAU/VB6x76gOCuZYKTPDThFzR/QyUZK6jUFQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173940474003603053A3DDD</CorrelationId><ResponseTime>2026-07-14T20:39:40.478Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListRefundsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:39:40,566 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    refunds: []
} Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:39:40,566 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 99 ms. QueryParams: {ModifiedAfter=[2026-07-14T20:34:00Z], Participant=00360305, IncludeDetails=[false], ModifiedBefore=[2026-07-14T20:39:40Z], Limit=[200], ParticipantRole=[CONTESTED]} Devolucoes: []
2026-07-14 17:39:40,566 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-10) [CORRELATION-ID:85258f9e-e01e-4970-ab6d-3dd82c4a3216][SIMPI-DICT] [DEVOLUCOES] Foram retornadas 0 devolucoes do Bacen em que a caixa e [CONTESTED] possui mais elementos false
2026-07-14 17:39:40,567 127.0.0.6 - - [14/Jul/2026:17:39:40 -0300] "GET /simpi-dict-war/api/v1/dict/refund?ModifiedAfter=2026-07-14T20%3A34%3A00Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20%3A39%3A40Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-10 -" 34 104
2026-07-14 17:39:42,007 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:42,008 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:42,008 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:39:42,010 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:39:42,011 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:42,137 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b]PolicyApi#getPolicy(String,String)
2026-07-14 17:39:42,140 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:42 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>mlt8ei/i+kDelUGebrp2FBpATKh0KvxNaQmuYoyJSpE=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>Kj++bkDd3II4gza0um3M5Ye8ALL4jQB0BQGMaxBas9EruRZo3933G+P0L08mS+W71lR3rbrBVM1k&#13;
KXr+ZmqnGt3J6EDkwZdzI9qBcLfWD0AFI6nDma+tEAkaqvasK6pK8M9p4+j9x4jCs3+EpbqWZ4k+&#13;
EKGTsg5qXbKR7sTVz50lLbbF6vM/LkjtvgcdYnL6UZc6OqTG/1Va/TzOecCp2kYOs97lZKrJ2lHu&#13;
ofZLzLuOCPm3TUaYY9nKJ85TVxILBA+B5HEztbn1ny9BY9cI2HaTYXl4eIG5rtT2tDmIHtIOtgw5&#13;
M6TNANuxQbIMpQ2VHjeFkFY02E5OyTSDKLZsNw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714173942018003603051373F4</CorrelationId><ResponseTime>2026-07-14T20:39:42.130Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:42,141 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@54f792cb
    correlationId: A20260714173942018003603051373F4
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:42.130Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:42,141 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-11) [CORRELATION-ID:60c27953-b2b3-4731-8a6e-5f0a700d667b][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@54f792cb
    correlationId: A20260714173942018003603051373F4
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:42.130Z
}
2026-07-14 17:39:42,142 127.0.0.6 - - [14/Jul/2026:17:39:42 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-11 -" 258 136
2026-07-14 17:39:48,869 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][JWT-AUTH-FILTER] versao da api v2
2026-07-14 17:39:48,869 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:48,870 INFO  [br.gov.caixa.mpi.dict.rest.v2.InfractionReportRest] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][SIMPI-DICT][INFRACTION-REPORT-V2] Buscar relato de infracao. InfractionReportId: ef8893bf-e0e4-4996-a1a2-b638a81b424f
2026-07-14 17:39:48,876 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][SIMPI-DICT] [InfractionReport_V2] Iniciando a consulta de um Relato no bacen: ef8893bf-e0e4-4996-a1a2-b638a81b424f
2026-07-14 17:39:48,878 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a]--->InfractionReportApi#getInfractionReport(UUID,String) GET https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:48,891 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a]InfractionReportApi#getInfractionReport(UUID,String)
2026-07-14 17:39:48,895 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:48 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<GetInfractionReportResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>i1QBIWsBw/kUmhQnBtFjYfuVtLAhVkAKI8QptG6XSvs=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>v9/gGi9Zu3ECaXxJ+tuSe4NPWBxx2iDz7J1gbqDH15938DoGDwGGSh6Kz75AwGqJ9naY9ht2U+H1&#13;
aXahSnMJrmqh23FCvZumGqJKXeokVSblfsVuroiylQv1VV2MqM5ITGtytejSBT17pYM1G8VR5fbx&#13;
N8bb9VU6G7xII049D+suG7WP3M2F1F3UR68n/VEqALXk5zhAdmyy9qQJjG8FEzndydogbgCHFUEu&#13;
pxfAyyzKvio/n4T4VqTxDh1HyMNpXkS8ADB87B4GQB+M9g3j0tiYQSK28JkOev0XyvkEYrPjwwHj&#13;
tbdJ32mNQ0akHLFZdpbeeNCXy5uNh67H//7gTg==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739488820036030512E81F</CorrelationId><ResponseTime>2026-07-14T20:39:48.886Z</ResponseTime><InfractionReport><TransactionId>E003603052024080817363728bce97be</TransactionId><Reason>REFUND_REQUEST</Reason><SituationType>OTHER</SituationType><ReportDetails>Teste Relato de Infracao 2.0 externo</ReportDetails><Id>ef8893bf-e0e4-4996-a1a2-b638a81b424f</Id><Status>ACKNOWLEDGED</Status><ReporterParticipant>00360305</ReporterParticipant><CounterpartyParticipant>09089356</CounterpartyParticipant><CreationTime>2024-08-08T17:39:45.163Z</CreationTime><LastModified>2024-08-08T17:39:49.137Z</LastModified></InfractionReport></GetInfractionReportResponse> Type: br.gov.caixa.mpi.dict.v2.api.model.GetInfractionReportResponse
2026-07-14 17:39:48,895 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: 
    responseTime: 2026-07-14T20:39:48.886Z
    correlationId: A202607141739488820036030512E81F
    infractionReport: class ExtendedInfractionReport {
    transactionId: E003603052024080817363728bce97be
    reason: REFUND_REQUEST
    situationType: OTHER
    contactInformation: null
    reportDetails: Teste Relato de Infracao 2.0 externo
    id: ef8893bf-e0e4-4996-a1a2-b638a81b424f
    status: ACKNOWLEDGED
    reporterParticipant: 00360305
    counterpartyParticipant: 09089356
    fraudMarkerId: null
    analysisResult: null
    analysisDetails: null
    creationTime: 2024-08-08T17:39:45.163Z
    lastModified: 2024-08-08T17:39:49.137Z
}
} Type: br.gov.caixa.mpi.dict.v2.api.model.GetInfractionReportResponse
2026-07-14 17:39:48,895 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetInfractionReportFacade] (default task-12) [CORRELATION-ID:76b50485-81a5-4975-9706-714e7992690a][SIMPI-DICT] [InfractionReport_V2] retorno bacen=class ExtendedInfractionReport {
    transactionId: E003603052024080817363728bce97be
    reason: REFUND_REQUEST
    situationType: OTHER
    contactInformation: null
    reportDetails: Teste Relato de Infracao 2.0 externo
    id: ef8893bf-e0e4-4996-a1a2-b638a81b424f
    status: ACKNOWLEDGED
    reporterParticipant: 00360305
    counterpartyParticipant: 09089356
    fraudMarkerId: null
    analysisResult: null
    analysisDetails: null
    creationTime: 2024-08-08T17:39:45.163Z
    lastModified: 2024-08-08T17:39:49.137Z
}
2026-07-14 17:39:48,896 127.0.0.6 - - [14/Jul/2026:17:39:48 -0300] "GET /simpi-dict-war/api/v2/dict/infractionReport/findById/ef8893bf-e0e4-4996-a1a2-b638a81b424f HTTP/1.1" 200 499 "-" "okhttp/3.6.0" application/json "default task-12 -" 499 29
2026-07-14 17:39:49,601 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-13) [CORRELATION-ID:33396f8e-763c-4018-a8ad-82b332641e15][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:49,602 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-13) [CORRELATION-ID:33396f8e-763c-4018-a8ad-82b332641e15][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:49,688 ERROR [org.jboss.as.ejb3.invocation] (default task-13) [CORRELATION-ID:33396f8e-763c-4018-a8ad-82b332641e15]WFLYEJB0034: EJB Invocation failed on component HsmCaixaEjb for method public java.lang.String br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.assinarXml(java.lang.String) throws java.lang.Exception: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:313)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:238)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$$$view11.assinarXml(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$Proxy$_$$_Weld$EnterpriseProxy$.assinarXml(Unknown Source)
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:22)
	at feign.SynchronousMethodHandler.targetRequest(SynchronousMethodHandler.java:158)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:88)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy133.createEntry(Unknown Source)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(CriarVinculoDictFacade.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$$$view8.executar(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$Proxy$_$$_Weld$EnterpriseProxy$.executar(Unknown Source)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest.criarVinculoDict(DirectoryRest.java:43)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest$Proxy$_$$_WeldClientProxy.criarVinculoDict(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:65)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:330)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:163)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:64)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:61)
	at org.jboss.as.ejb3.pool.AbstractPool.create(AbstractPool.java:56)
	at org.jboss.as.ejb3.pool.strictmax.StrictMaxPool.get(StrictMaxPool.java:124)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 174 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.notSupported(LifecycleCMTTxInterceptor.java:110)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:70)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	... 185 more
Caused by: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:37)
	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.<init>(KeystoreHolder.java:25)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.<init>(BaseHsmManager.java:39)
	at br.gov.caixa.mpi.dict.ejb.hsm.SignerManager.<init>(SignerManager.java:17)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.init(HsmCaixaEjb.java:44)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 198 more
Caused by: java.lang.RuntimeException: Missing configuration file.
	at br.com.trueaccess.provider.netdfence.NDSession.initializeSession(NDSession.java:63)
	at br.com.trueaccess.provider.netdfence.NDSession.<init>(NDSession.java:41)
	at br.com.trueaccess.provider.netdfence.KeyStore.SyncKeyStoreList(KeyStore.java:1025)
	at br.com.trueaccess.provider.netdfence.KeyStore.engineLoad(KeyStore.java:649)
	at java.security.KeyStore.load(KeyStore.java:1445)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:33)
	... 226 more

2026-07-14 17:39:49,763 ERROR [br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign] (default task-13) [CORRELATION-ID:33396f8e-763c-4018-a8ad-82b332641e15][SIMPI-DICT] Erro RequestInterceptorFeign: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-07-14 17:39:49,764 ERROR [org.jboss.as.ejb3.invocation] (default task-13) [CORRELATION-ID:33396f8e-763c-4018-a8ad-82b332641e15]WFLYEJB0034: EJB Invocation failed on component CriarVinculoDictFacade for method public br.gov.caixa.mpi.dict.api.dto.v2.ChaveDto br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(br.gov.caixa.mpi.dict.api.dto.v2.ChaveDto): javax.ejb.EJBException: br.gov.caixa.dict.comum.exceptions.DictException: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$$$view8.executar(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$Proxy$_$$_Weld$EnterpriseProxy$.executar(Unknown Source)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest.criarVinculoDict(DirectoryRest.java:43)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest$Proxy$_$$_WeldClientProxy.criarVinculoDict(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:65)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:330)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: br.gov.caixa.dict.comum.exceptions.DictException: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:25)
	at feign.SynchronousMethodHandler.targetRequest(SynchronousMethodHandler.java:158)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:88)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy133.createEntry(Unknown Source)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(CriarVinculoDictFacade.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	... 98 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:313)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:238)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$$$view11.assinarXml(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$Proxy$_$$_Weld$EnterpriseProxy$.assinarXml(Unknown Source)
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:22)
	... 131 more
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:163)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:64)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:61)
	at org.jboss.as.ejb3.pool.AbstractPool.create(AbstractPool.java:56)
	at org.jboss.as.ejb3.pool.strictmax.StrictMaxPool.get(StrictMaxPool.java:124)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 174 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.notSupported(LifecycleCMTTxInterceptor.java:110)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:70)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	... 185 more
Caused by: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:37)
	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.<init>(KeystoreHolder.java:25)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.<init>(BaseHsmManager.java:39)
	at br.gov.caixa.mpi.dict.ejb.hsm.SignerManager.<init>(SignerManager.java:17)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.init(HsmCaixaEjb.java:44)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 198 more
Caused by: java.lang.RuntimeException: Missing configuration file.
	at br.com.trueaccess.provider.netdfence.NDSession.initializeSession(NDSession.java:63)
	at br.com.trueaccess.provider.netdfence.NDSession.<init>(NDSession.java:41)
	at br.com.trueaccess.provider.netdfence.KeyStore.SyncKeyStoreList(KeyStore.java:1025)
	at br.com.trueaccess.provider.netdfence.KeyStore.engineLoad(KeyStore.java:649)
	at java.security.KeyStore.load(KeyStore.java:1445)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:33)
	... 226 more

2026-07-14 17:39:49,773 127.0.0.6 - - [14/Jul/2026:17:39:49 -0300] "POST /simpi-dict-war/api/v1/dict/entry/post/ HTTP/1.1" 500 508 "-" "okhttp/3.6.0" application/json "default task-13 -" 508 176
2026-07-14 17:39:50,063 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:50,063 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:50,064 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][SIMPI-DICT] Iniciando a listagem de politicas.
2026-07-14 17:39:50,065 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][SIMPI-DICT] Efetuando a listagem de politicas.
2026-07-14 17:39:50,065 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14]--->PolicyApi#bucketStates(String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:50,188 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14]PolicyApi#bucketStates(String)
2026-07-14 17:39:50,192 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:50 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<ListPoliciesResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>gBJt9a+h3GX/zIXe+HvLH1xFrauUWFV0pJLWPP+gCG0=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>SLJ9e7NUsvcHS9e7siBAVGdIQzO+ZUwxi5wWvbZDB4FZjl+AP7n59Qt51ODV5qZmixmuINgnKyeB&#13;
CyPjaHCelF6gCFEMsCCLlWJwh/GpFe7ngJy8nyeRD5Y/lEm+5v0+k9QFPbfXCwvehTPsW4uY9PdS&#13;
q4jquKtqAR9wBm7dpOgZYwKnQ9IfJHE155DG0VBUkRMyOR0JhJmO2CkIBdmZS4t4kwN/LUiK39gZ&#13;
jaZphf/FKODNHXWjBcDiGVK5BSz9iCqUpPLoadZel6P+cmcbZeioNb3cXON2yLwqIUE6BxdrzTzK&#13;
Cfqybu7ZSRBtp5XeWaKaMs2tRNd2m6zvirCKyQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A2026071417395006900360305160091</CorrelationId><ResponseTime>2026-07-14T20:39:50.181Z</ResponseTime><Category>C</Category><Policies><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>100</AvailableTokens><Capacity>100</Capacity><RefillTokens>20</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_EVENTS_LIST</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>SYNC_VERIFICATIONS_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_WRITE</Name></Policy><Policy><AvailableTokens>17999</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_READ</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_WRITE</Name></Policy><Policy><AvailableTokens>70</AvailableTokens><Capacity>70</Capacity><RefillTokens>70</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>KEYS_CHECK</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>EVENT_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>ENTRIES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_WRITE</Name></Policy><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_READ</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_READ</Name></Policy><Policy><AvailableTokens>19</AvailableTokens><Capacity>20</Capacity><RefillTokens>6</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_LIST</Name></Policy><Policy><AvailableTokens>199</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>49</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>196</AvailableTokens><Capacity>200</Capacity><RefillTokens>60</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>86400</RefillPeriodSec><Name>CIDS_FILES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CIDS_ENTRIES_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>12000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>PERSONS_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_FILES_READ</Name></Policy><Policy><AvailableTokens>72000</AvailableTokens><Capacity>72000</Capacity><RefillTokens>2400</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_WRITE</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_READ_PARTICIPANT_ANTISCAN</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITH_ROLE</Name></Policy></Policies></ListPoliciesResponse> Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:39:50,193 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:39:50.181Z
    correlationId: A2026071417395006900360305160091
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 17999
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 19
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 49
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 196
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
} Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:39:50,193 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-14) [CORRELATION-ID:190db3e8-119f-4eca-aca7-6a705433dc14][SIMPI-DICT] listagem de politicas finalizada em 128 ms. ListPoliciesResponse: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:39:50.181Z
    correlationId: A2026071417395006900360305160091
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 17999
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 19
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 49
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 196
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
}
2026-07-14 17:39:50,195 127.0.0.6 - - [14/Jul/2026:17:39:50 -0300] "GET /simpi-dict-war/api/v1/dict/policy HTTP/1.1" 200 7665 "-" "okhttp/3.6.0" application/json "default task-14 -" 7665 181
2026-07-14 17:39:52,006 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:39:52,007 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:52,007 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:39:52,008 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:39:52,009 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:39:52,010 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][JWT-AUTH-FILTER] versao da api v2
2026-07-14 17:39:52,010 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:39:52,013 INFO  [br.gov.caixa.mpi.dict.rest.v2.EventNotificationRest] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][SIMPI-DICT][EVENT-NOTIFICATIONS] Inicia busca das notificacoes de eventos. Parametros: org.jboss.resteasy.specimpl.UnmodifiableMultivaluedMap@7a394696
2026-07-14 17:39:52,015 INFO  [br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][SIMPI-DICT][EVENT-NOTIFICATIONS] Inicia busca de notificacao de eventos no bacen : {}
2026-07-14 17:39:52,017 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8]--->EventNotificationApi#listEventNotification(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/event-notifications?Participant=00360305 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/event-notifications?Participant=00360305 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:39:52,033 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8]EventNotificationApi#listEventNotification(Map)
2026-07-14 17:39:52,054 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:52 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<ListEventNotificationsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>BcfWPcY5WH+XQfYcNWqWmOhc2vENGRfL5gHEjIAZFz4=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>kkoAtK3UUWgVlllQjM4bcZQEWZLuiwozSvSNp9YXYNIhlfvnVjIGCUfX2OruGKTGKutR3wVek/f0&#13;
CL1uySzpAwcpNMhRHmrwYIucOQHjZ+f0x3MOeOAowSiPb4ldkLuoxkVwXpgIpmDiEkYrwNBoTF+A&#13;
Q/vN+ZD9pWeZuB3KGAObLeHJWSfmWFBKhb9TxVfv7lqlH2U6kc/1I78DOSB8S2+tLIDzCv2qc9oQ&#13;
ghvQ7Me6fzFq+tO1EXda5F4eY13yL4z3mkHuUl42fmlHgU55s4e797GaODJaVYQ+UyKYWuca3fJp&#13;
DnhA/pgDzi6Ow9EX8mXR9QJx5mR1qHRA+/TMlQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A2026071417395202100360305B6FD5E</CorrelationId><ResponseTime>2026-07-14T20:39:52.026Z</ResponseTime><HasMoreElements>false</HasMoreElements><EventNotifications><EventNotification><Id>231358</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>954828de-3ab3-4637-87d9-a162f1126306</EntityId><Timestamp>2026-07-06T14:22:53.994Z</Timestamp></EventNotification><EventNotification><Id>231397</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>3a4cc9bf-7d58-436a-8ef1-b0d838e6713c</EntityId><Timestamp>2026-07-06T17:46:31.284Z</Timestamp></EventNotification><EventNotification><Id>231680</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8da76f94-e84b-4122-bbc2-f648ac11b6f9</EntityId><Timestamp>2026-07-07T18:08:25.550Z</Timestamp></EventNotification><EventNotification><Id>231681</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>190eef65-d7c0-43d8-a9a2-ce2827b70b70</EntityId><Timestamp>2026-07-07T18:09:09.958Z</Timestamp></EventNotification><EventNotification><Id>231684</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>190eef65-d7c0-43d8-a9a2-ce2827b70b70</EntityId><Timestamp>2026-07-07T18:15:22.601Z</Timestamp></EventNotification><EventNotification><Id>231685</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8da76f94-e84b-4122-bbc2-f648ac11b6f9</EntityId><Timestamp>2026-07-07T18:15:27.791Z</Timestamp></EventNotification><EventNotification><Id>231690</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>9d85c455-d320-4677-8a2c-ff5c575b0a57</EntityId><Timestamp>2026-07-07T18:36:54.606Z</Timestamp></EventNotification><EventNotification><Id>231691</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>aa2bff76-ab87-4081-8ac4-b95fb65e4958</EntityId><Timestamp>2026-07-07T18:37:21.205Z</Timestamp></EventNotification><EventNotification><Id>231697</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>9d85c455-d320-4677-8a2c-ff5c575b0a57</EntityId><Timestamp>2026-07-07T18:45:38.228Z</Timestamp></EventNotification><EventNotification><Id>231704</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>c979458a-c99e-4e89-a109-69b1d9f773e7</EntityId><Timestamp>2026-07-07T18:52:02.677Z</Timestamp></EventNotification><EventNotification><Id>231710</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>c979458a-c99e-4e89-a109-69b1d9f773e7</EntityId><Timestamp>2026-07-07T19:00:37.862Z</Timestamp></EventNotification><EventNotification><Id>231739</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>c188c7e6-5366-48f8-8ff4-f5d94cda1bba</EntityId><Timestamp>2026-07-07T19:45:44.630Z</Timestamp></EventNotification><EventNotification><Id>231740</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>50de9690-6f46-46ee-98a3-8b11dab78f9c</EntityId><Timestamp>2026-07-07T19:45:45.156Z</Timestamp></EventNotification><EventNotification><Id>231750</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6</EntityId><Timestamp>2026-07-07T20:05:36.152Z</Timestamp></EventNotification><EventNotification><Id>231773</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6</EntityId><Timestamp>2026-07-07T20:25:10.498Z</Timestamp></EventNotification><EventNotification><Id>233477</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>a723d7d7-cb2b-4408-bf4f-c47c28f90c4f</EntityId><Timestamp>2026-07-08T15:09:54.476Z</Timestamp></EventNotification><EventNotification><Id>233523</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>a723d7d7-cb2b-4408-bf4f-c47c28f90c4f</EntityId><Timestamp>2026-07-08T15:14:21.721Z</Timestamp></EventNotification><EventNotification><Id>233684</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>32e2e42b-9538-423f-b210-a34942e1f66c</EntityId><Timestamp>2026-07-08T15:31:01.848Z</Timestamp></EventNotification><EventNotification><Id>233730</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>300ef929-85c9-4349-a3cf-8355cb08f82c</EntityId><Timestamp>2026-07-08T15:36:09.320Z</Timestamp></EventNotification><EventNotification><Id>234064</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>825079a4-346c-4904-a50d-e2443950f807</EntityId><Timestamp>2026-07-08T16:12:29.441Z</Timestamp></EventNotification><EventNotification><Id>234236</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>fcdf787d-1742-49f2-9ee8-b3d8085d482b</EntityId><Timestamp>2026-07-08T16:31:24.822Z</Timestamp></EventNotification><EventNotification><Id>235132</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5a57f133-8272-490b-9785-31b51736e2f6</EntityId><Timestamp>2026-07-08T18:07:59.796Z</Timestamp></EventNotification><EventNotification><Id>235191</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>b0e23f57-59a4-4063-b9a3-f856e99e39a0</EntityId><Timestamp>2026-07-08T18:14:00.924Z</Timestamp></EventNotification><EventNotification><Id>235242</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>e5ca0df6-ceb3-4a7a-b9d9-d15fde20c3fa</EntityId><Timestamp>2026-07-08T18:19:02.429Z</Timestamp></EventNotification><EventNotification><Id>235440</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>3088446c-3228-433b-ad6f-266e8a5f4040</EntityId><Timestamp>2026-07-08T18:39:46.932Z</Timestamp></EventNotification><EventNotification><Id>235583</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>ad639185-4cd8-4704-8a43-a038f557750e</EntityId><Timestamp>2026-07-08T18:54:53.102Z</Timestamp></EventNotification><EventNotification><Id>236471</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>7430ca66-180b-4274-909f-576407971798</EntityId><Timestamp>2026-07-08T20:30:57.835Z</Timestamp></EventNotification><EventNotification><Id>246097</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>45814653-5d8b-40a1-a261-69c5f704dd6c</EntityId><Timestamp>2026-07-09T14:15:29.970Z</Timestamp></EventNotification><EventNotification><Id>246143</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5591bfea-eb8d-4acb-8118-648cfd34a7d5</EntityId><Timestamp>2026-07-09T14:20:10.477Z</Timestamp></EventNotification><EventNotification><Id>246145</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8668daf7-5fbf-42ed-860b-b91f907b37bb</EntityId><Timestamp>2026-07-09T14:20:44.993Z</Timestamp></EventNotification><EventNotification><Id>246662</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>b65b6d60-6ba8-446a-a824-f698e3a286ac</EntityId><Timestamp>2026-07-09T15:17:20.651Z</Timestamp></EventNotification><EventNotification><Id>246663</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>9ba3e024-2c2a-4fc4-80b7-bf0bb024e917</EntityId><Timestamp>2026-07-09T15:17:45.524Z</Timestamp></EventNotification><EventNotification><Id>246808</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>b3cb200c-a162-446a-b607-da62019555ec</EntityId><Timestamp>2026-07-09T15:34:01.330Z</Timestamp></EventNotification><EventNotification><Id>246893</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>16da765f-1ef0-401b-996f-44704937ed55</EntityId><Timestamp>2026-07-09T15:42:32.325Z</Timestamp></EventNotification><EventNotification><Id>247713</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>9ba3e024-2c2a-4fc4-80b7-bf0bb024e917</EntityId><Timestamp>2026-07-09T17:33:01.263Z</Timestamp></EventNotification><EventNotification><Id>247714</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>9ba3e024-2c2a-4fc4-80b7-bf0bb024e917</EntityId><Timestamp>2026-07-09T17:42:11.786Z</Timestamp></EventNotification><EventNotification><Id>247731</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5a9f3c72-cd5d-4f03-bde4-055a394e4561</EntityId><Timestamp>2026-07-09T19:02:38.947Z</Timestamp></EventNotification><EventNotification><Id>247750</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>a279bc49-7b46-44a9-ab05-b7efd51ca59b</EntityId><Timestamp>2026-07-09T20:07:23.916Z</Timestamp></EventNotification><EventNotification><Id>247805</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>3178ab80-d4f5-4bc4-83bd-447c347e5392</EntityId><Timestamp>2026-07-10T15:21:28.425Z</Timestamp></EventNotification><EventNotification><Id>247819</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>71f7203c-56e5-49b4-bd03-0f950a6a7689</EntityId><Timestamp>2026-07-10T17:09:39.454Z</Timestamp></EventNotification><EventNotification><Id>247822</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>10af474f-cf4e-4eac-81b2-591664e5bfb8</EntityId><Timestamp>2026-07-10T17:17:48.494Z</Timestamp></EventNotification><EventNotification><Id>247826</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>36155e48-d472-4217-a2e8-97406d251e39</EntityId><Timestamp>2026-07-10T17:30:15.565Z</Timestamp></EventNotification><EventNotification><Id>247827</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>36155e48-d472-4217-a2e8-97406d251e39</EntityId><Timestamp>2026-07-10T17:33:19.763Z</Timestamp></EventNotification><EventNotification><Id>247830</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>956a0e14-4a3a-4bbc-be17-2585f68f20e5</EntityId><Timestamp>2026-07-10T17:38:09.823Z</Timestamp></EventNotification><EventNotification><Id>247857</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>36155e48-d472-4217-a2e8-97406d251e39</EntityId><Timestamp>2026-07-10T19:33:44.396Z</Timestamp></EventNotification><EventNotification><Id>247870</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>956a0e14-4a3a-4bbc-be17-2585f68f20e5</EntityId><Timestamp>2026-07-10T19:50:38.751Z</Timestamp></EventNotification><EventNotification><Id>248015</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1c4e8a40-12d4-452e-99ea-59682d61297e</EntityId><Timestamp>2026-07-13T13:24:12.336Z</Timestamp></EventNotification><EventNotification><Id>248019</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1c4e8a40-12d4-452e-99ea-59682d61297e</EntityId><Timestamp>2026-07-13T13:28:59.448Z</Timestamp></EventNotification><EventNotification><Id>248034</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>127a0cf7-b023-4526-a5aa-c12eb418fef3</EntityId><Timestamp>2026-07-13T13:49:52.408Z</Timestamp></EventNotification><EventNotification><Id>248036</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1c4e8a40-12d4-452e-99ea-59682d61297e</EntityId><Timestamp>2026-07-13T13:50:15.077Z</Timestamp></EventNotification><EventNotification><Id>248037</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>127a0cf7-b023-4526-a5aa-c12eb418fef3</EntityId><Timestamp>2026-07-13T13:51:00.915Z</Timestamp></EventNotification><EventNotification><Id>248045</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>e80906c3-00c4-4736-9b3e-6f38a88f7404</EntityId><Timestamp>2026-07-13T14:12:54.032Z</Timestamp></EventNotification><EventNotification><Id>248047</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>e80906c3-00c4-4736-9b3e-6f38a88f7404</EntityId><Timestamp>2026-07-13T14:17:58.355Z</Timestamp></EventNotification><EventNotification><Id>248049</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>e80906c3-00c4-4736-9b3e-6f38a88f7404</EntityId><Timestamp>2026-07-13T14:21:47.665Z</Timestamp></EventNotification><EventNotification><Id>248076</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>61ada33c-de9b-4749-bb56-459a669f3dc4</EntityId><Timestamp>2026-07-13T15:44:00.618Z</Timestamp></EventNotification><EventNotification><Id>248086</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8d3b2d30-3f6c-43ec-9323-3b35ce67ea90</EntityId><Timestamp>2026-07-13T17:01:11.654Z</Timestamp></EventNotification><EventNotification><Id>248087</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8d3b2d30-3f6c-43ec-9323-3b35ce67ea90</EntityId><Timestamp>2026-07-13T17:03:33.039Z</Timestamp></EventNotification><EventNotification><Id>248088</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5f84ed17-2add-4982-bacc-5ccb5da0da70</EntityId><Timestamp>2026-07-13T17:08:58.730Z</Timestamp></EventNotification><EventNotification><Id>248089</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>8d3b2d30-3f6c-43ec-9323-3b35ce67ea90</EntityId><Timestamp>2026-07-13T17:09:16.049Z</Timestamp></EventNotification><EventNotification><Id>248090</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5f84ed17-2add-4982-bacc-5ccb5da0da70</EntityId><Timestamp>2026-07-13T17:10:00.816Z</Timestamp></EventNotification><EventNotification><Id>248145</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>e4b3af80-c780-4156-8f17-7e110c7e8976</EntityId><Timestamp>2026-07-13T18:22:03.744Z</Timestamp></EventNotification><EventNotification><Id>248150</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5f84ed17-2add-4982-bacc-5ccb5da0da70</EntityId><Timestamp>2026-07-13T18:25:14.032Z</Timestamp></EventNotification><EventNotification><Id>248154</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>bf883ccb-5e9a-4fd7-ab8b-850d93eae307</EntityId><Timestamp>2026-07-13T18:30:48.451Z</Timestamp></EventNotification><EventNotification><Id>248162</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>bf883ccb-5e9a-4fd7-ab8b-850d93eae307</EntityId><Timestamp>2026-07-13T18:39:00.399Z</Timestamp></EventNotification><EventNotification><Id>248210</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1402f365-5724-4fdb-b22e-967155389ee8</EntityId><Timestamp>2026-07-13T21:20:17.941Z</Timestamp></EventNotification><EventNotification><Id>248211</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>bf883ccb-5e9a-4fd7-ab8b-850d93eae307</EntityId><Timestamp>2026-07-13T21:23:21.945Z</Timestamp></EventNotification><EventNotification><Id>248214</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1402f365-5724-4fdb-b22e-967155389ee8</EntityId><Timestamp>2026-07-13T22:00:14.802Z</Timestamp></EventNotification><EventNotification><Id>248242</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>127a0cf7-b023-4526-a5aa-c12eb418fef3</EntityId><Timestamp>2026-07-14T13:39:01.934Z</Timestamp></EventNotification><EventNotification><Id>248249</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>0c1724a0-f8e6-4014-99ef-c91a66043705</EntityId><Timestamp>2026-07-14T13:56:04.425Z</Timestamp></EventNotification><EventNotification><Id>248250</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>0c1724a0-f8e6-4014-99ef-c91a66043705</EntityId><Timestamp>2026-07-14T14:05:52.171Z</Timestamp></EventNotification><EventNotification><Id>248255</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6</EntityId><Timestamp>2026-07-14T14:13:50.910Z</Timestamp></EventNotification><EventNotification><Id>248256</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>0c1724a0-f8e6-4014-99ef-c91a66043705</EntityId><Timestamp>2026-07-14T14:14:03.053Z</Timestamp></EventNotification><EventNotification><Id>248259</Id><Event>FUNDS_RECOVERY_COMPLETED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6</EntityId><Timestamp>2026-07-14T14:21:04.653Z</Timestamp></EventNotification><EventNotification><Id>248323</Id><Event>FUNDS_RECOVERY_ANALYSED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1f2cd721-579c-48c2-ae5d-77c631af153a</EntityId><Timestamp>2026-07-14T18:48:23.420Z</Timestamp></EventNotification><EventNotification><Id>248325</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>1f2cd721-579c-48c2-ae5d-77c631af153a</EntityId><Timestamp>2026-07-14T19:02:23.343Z</Timestamp></EventNotification><EventNotification><Id>248328</Id><Event>FUNDS_RECOVERY_CANCELLED</Event><Participant>00360305</Participant><EntityType>FUNDS_RECOVERY</EntityType><EntityId>42b68cd5-c0a2-476e-be84-4d11ea7ace0f</EntityId><Timestamp>2026-07-14T19:21:48.819Z</Timestamp></EventNotification></EventNotifications></ListEventNotificationsResponse> Type: br.gov.caixa.mpi.dict.v2.api.model.ListEventNotificationsResponse
2026-07-14 17:39:52,055 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: ListEventNotificationsResponse(signature=[ds:Signature: null], responseTime=2026-07-14T20:39:52.026Z, correlationId=A2026071417395202100360305B6FD5E, hasMoreElements=false, nextCursor=null, eventNotification=[EventNotification(id=231358, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=954828de-3ab3-4637-87d9-a162f1126306, timestamp=2026-07-06T14:22:53.994Z), EventNotification(id=231397, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=3a4cc9bf-7d58-436a-8ef1-b0d838e6713c, timestamp=2026-07-06T17:46:31.284Z), EventNotification(id=231680, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=8da76f94-e84b-4122-bbc2-f648ac11b6f9, timestamp=2026-07-07T18:08:25.550Z), EventNotification(id=231681, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=190eef65-d7c0-43d8-a9a2-ce2827b70b70, timestamp=2026-07-07T18:09:09.958Z), EventNotification(id=231684, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=190eef65-d7c0-43d8-a9a2-ce2827b70b70, timestamp=2026-07-07T18:15:22.601Z), EventNotification(id=231685, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8da76f94-e84b-4122-bbc2-f648ac11b6f9, timestamp=2026-07-07T18:15:27.791Z), EventNotification(id=231690, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=9d85c455-d320-4677-8a2c-ff5c575b0a57, timestamp=2026-07-07T18:36:54.606Z), EventNotification(id=231691, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=aa2bff76-ab87-4081-8ac4-b95fb65e4958, timestamp=2026-07-07T18:37:21.205Z), EventNotification(id=231697, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=9d85c455-d320-4677-8a2c-ff5c575b0a57, timestamp=2026-07-07T18:45:38.228Z), EventNotification(id=231704, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=c979458a-c99e-4e89-a109-69b1d9f773e7, timestamp=2026-07-07T18:52:02.677Z), EventNotification(id=231710, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=c979458a-c99e-4e89-a109-69b1d9f773e7, timestamp=2026-07-07T19:00:37.862Z), EventNotification(id=231739, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=c188c7e6-5366-48f8-8ff4-f5d94cda1bba, timestamp=2026-07-07T19:45:44.630Z), EventNotification(id=231740, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=50de9690-6f46-46ee-98a3-8b11dab78f9c, timestamp=2026-07-07T19:45:45.156Z), EventNotification(id=231750, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6, timestamp=2026-07-07T20:05:36.152Z), EventNotification(id=231773, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6, timestamp=2026-07-07T20:25:10.498Z), EventNotification(id=233477, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=a723d7d7-cb2b-4408-bf4f-c47c28f90c4f, timestamp=2026-07-08T15:09:54.476Z), EventNotification(id=233523, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=a723d7d7-cb2b-4408-bf4f-c47c28f90c4f, timestamp=2026-07-08T15:14:21.721Z), EventNotification(id=233684, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=32e2e42b-9538-423f-b210-a34942e1f66c, timestamp=2026-07-08T15:31:01.848Z), EventNotification(id=233730, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=300ef929-85c9-4349-a3cf-8355cb08f82c, timestamp=2026-07-08T15:36:09.320Z), EventNotification(id=234064, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=825079a4-346c-4904-a50d-e2443950f807, timestamp=2026-07-08T16:12:29.441Z), EventNotification(id=234236, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=fcdf787d-1742-49f2-9ee8-b3d8085d482b, timestamp=2026-07-08T16:31:24.822Z), EventNotification(id=235132, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5a57f133-8272-490b-9785-31b51736e2f6, timestamp=2026-07-08T18:07:59.796Z), EventNotification(id=235191, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b0e23f57-59a4-4063-b9a3-f856e99e39a0, timestamp=2026-07-08T18:14:00.924Z), EventNotification(id=235242, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=e5ca0df6-ceb3-4a7a-b9d9-d15fde20c3fa, timestamp=2026-07-08T18:19:02.429Z), EventNotification(id=235440, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=3088446c-3228-433b-ad6f-266e8a5f4040, timestamp=2026-07-08T18:39:46.932Z), EventNotification(id=235583, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=ad639185-4cd8-4704-8a43-a038f557750e, timestamp=2026-07-08T18:54:53.102Z), EventNotification(id=236471, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=7430ca66-180b-4274-909f-576407971798, timestamp=2026-07-08T20:30:57.835Z), EventNotification(id=246097, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=45814653-5d8b-40a1-a261-69c5f704dd6c, timestamp=2026-07-09T14:15:29.970Z), EventNotification(id=246143, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5591bfea-eb8d-4acb-8118-648cfd34a7d5, timestamp=2026-07-09T14:20:10.477Z), EventNotification(id=246145, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8668daf7-5fbf-42ed-860b-b91f907b37bb, timestamp=2026-07-09T14:20:44.993Z), EventNotification(id=246662, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b65b6d60-6ba8-446a-a824-f698e3a286ac, timestamp=2026-07-09T15:17:20.651Z), EventNotification(id=246663, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T15:17:45.524Z), EventNotification(id=246808, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b3cb200c-a162-446a-b607-da62019555ec, timestamp=2026-07-09T15:34:01.330Z), EventNotification(id=246893, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=16da765f-1ef0-401b-996f-44704937ed55, timestamp=2026-07-09T15:42:32.325Z), EventNotification(id=247713, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T17:33:01.263Z), EventNotification(id=247714, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T17:42:11.786Z), EventNotification(id=247731, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5a9f3c72-cd5d-4f03-bde4-055a394e4561, timestamp=2026-07-09T19:02:38.947Z), EventNotification(id=247750, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=a279bc49-7b46-44a9-ab05-b7efd51ca59b, timestamp=2026-07-09T20:07:23.916Z), EventNotification(id=247805, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=3178ab80-d4f5-4bc4-83bd-447c347e5392, timestamp=2026-07-10T15:21:28.425Z), EventNotification(id=247819, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=71f7203c-56e5-49b4-bd03-0f950a6a7689, timestamp=2026-07-10T17:09:39.454Z), EventNotification(id=247822, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=10af474f-cf4e-4eac-81b2-591664e5bfb8, timestamp=2026-07-10T17:17:48.494Z), EventNotification(id=247826, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T17:30:15.565Z), EventNotification(id=247827, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T17:33:19.763Z), EventNotification(id=247830, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=956a0e14-4a3a-4bbc-be17-2585f68f20e5, timestamp=2026-07-10T17:38:09.823Z), EventNotification(id=247857, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T19:33:44.396Z), EventNotification(id=247870, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=956a0e14-4a3a-4bbc-be17-2585f68f20e5, timestamp=2026-07-10T19:50:38.751Z), EventNotification(id=248015, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:24:12.336Z), EventNotification(id=248019, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:28:59.448Z), EventNotification(id=248034, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-13T13:49:52.408Z), EventNotification(id=248036, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:50:15.077Z), EventNotification(id=248037, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-13T13:51:00.915Z), EventNotification(id=248045, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:12:54.032Z), EventNotification(id=248047, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:17:58.355Z), EventNotification(id=248049, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:21:47.665Z), EventNotification(id=248076, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=61ada33c-de9b-4749-bb56-459a669f3dc4, timestamp=2026-07-13T15:44:00.618Z), EventNotification(id=248086, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:01:11.654Z), EventNotification(id=248087, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:03:33.039Z), EventNotification(id=248088, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T17:08:58.730Z), EventNotification(id=248089, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:09:16.049Z), EventNotification(id=248090, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T17:10:00.816Z), EventNotification(id=248145, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=e4b3af80-c780-4156-8f17-7e110c7e8976, timestamp=2026-07-13T18:22:03.744Z), EventNotification(id=248150, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T18:25:14.032Z), EventNotification(id=248154, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T18:30:48.451Z), EventNotification(id=248162, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T18:39:00.399Z), EventNotification(id=248210, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1402f365-5724-4fdb-b22e-967155389ee8, timestamp=2026-07-13T21:20:17.941Z), EventNotification(id=248211, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T21:23:21.945Z), EventNotification(id=248214, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1402f365-5724-4fdb-b22e-967155389ee8, timestamp=2026-07-13T22:00:14.802Z), EventNotification(id=248242, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-14T13:39:01.934Z), EventNotification(id=248249, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T13:56:04.425Z), EventNotification(id=248250, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T14:05:52.171Z), EventNotification(id=248255, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6, timestamp=2026-07-14T14:13:50.910Z), EventNotification(id=248256, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T14:14:03.053Z), EventNotification(id=248259, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6, timestamp=2026-07-14T14:21:04.653Z), EventNotification(id=248323, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1f2cd721-579c-48c2-ae5d-77c631af153a, timestamp=2026-07-14T18:48:23.420Z), EventNotification(id=248325, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1f2cd721-579c-48c2-ae5d-77c631af153a, timestamp=2026-07-14T19:02:23.343Z), EventNotification(id=248328, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=42b68cd5-c0a2-476e-be84-4d11ea7ace0f, timestamp=2026-07-14T19:21:48.819Z)]) Type: br.gov.caixa.mpi.dict.v2.api.model.ListEventNotificationsResponse
2026-07-14 17:39:52,056 INFO  [br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade] (default task-16) [CORRELATION-ID:533a3cb6-6752-485f-a218-f7ac2ee05af8][SIMPI-DICT][EVENT-NOTIFICATIONS] Resposta bacen: ListEventNotificationsResponse(signature=[ds:Signature: null], responseTime=2026-07-14T20:39:52.026Z, correlationId=A2026071417395202100360305B6FD5E, hasMoreElements=false, nextCursor=null, eventNotification=[EventNotification(id=231358, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=954828de-3ab3-4637-87d9-a162f1126306, timestamp=2026-07-06T14:22:53.994Z), EventNotification(id=231397, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=3a4cc9bf-7d58-436a-8ef1-b0d838e6713c, timestamp=2026-07-06T17:46:31.284Z), EventNotification(id=231680, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=8da76f94-e84b-4122-bbc2-f648ac11b6f9, timestamp=2026-07-07T18:08:25.550Z), EventNotification(id=231681, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=190eef65-d7c0-43d8-a9a2-ce2827b70b70, timestamp=2026-07-07T18:09:09.958Z), EventNotification(id=231684, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=190eef65-d7c0-43d8-a9a2-ce2827b70b70, timestamp=2026-07-07T18:15:22.601Z), EventNotification(id=231685, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8da76f94-e84b-4122-bbc2-f648ac11b6f9, timestamp=2026-07-07T18:15:27.791Z), EventNotification(id=231690, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=9d85c455-d320-4677-8a2c-ff5c575b0a57, timestamp=2026-07-07T18:36:54.606Z), EventNotification(id=231691, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=aa2bff76-ab87-4081-8ac4-b95fb65e4958, timestamp=2026-07-07T18:37:21.205Z), EventNotification(id=231697, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=9d85c455-d320-4677-8a2c-ff5c575b0a57, timestamp=2026-07-07T18:45:38.228Z), EventNotification(id=231704, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=c979458a-c99e-4e89-a109-69b1d9f773e7, timestamp=2026-07-07T18:52:02.677Z), EventNotification(id=231710, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=c979458a-c99e-4e89-a109-69b1d9f773e7, timestamp=2026-07-07T19:00:37.862Z), EventNotification(id=231739, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=c188c7e6-5366-48f8-8ff4-f5d94cda1bba, timestamp=2026-07-07T19:45:44.630Z), EventNotification(id=231740, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=50de9690-6f46-46ee-98a3-8b11dab78f9c, timestamp=2026-07-07T19:45:45.156Z), EventNotification(id=231750, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6, timestamp=2026-07-07T20:05:36.152Z), EventNotification(id=231773, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=fdf34404-e92a-4ff8-a5e0-f9e670bfcaf6, timestamp=2026-07-07T20:25:10.498Z), EventNotification(id=233477, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=a723d7d7-cb2b-4408-bf4f-c47c28f90c4f, timestamp=2026-07-08T15:09:54.476Z), EventNotification(id=233523, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=a723d7d7-cb2b-4408-bf4f-c47c28f90c4f, timestamp=2026-07-08T15:14:21.721Z), EventNotification(id=233684, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=32e2e42b-9538-423f-b210-a34942e1f66c, timestamp=2026-07-08T15:31:01.848Z), EventNotification(id=233730, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=300ef929-85c9-4349-a3cf-8355cb08f82c, timestamp=2026-07-08T15:36:09.320Z), EventNotification(id=234064, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=825079a4-346c-4904-a50d-e2443950f807, timestamp=2026-07-08T16:12:29.441Z), EventNotification(id=234236, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=fcdf787d-1742-49f2-9ee8-b3d8085d482b, timestamp=2026-07-08T16:31:24.822Z), EventNotification(id=235132, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5a57f133-8272-490b-9785-31b51736e2f6, timestamp=2026-07-08T18:07:59.796Z), EventNotification(id=235191, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b0e23f57-59a4-4063-b9a3-f856e99e39a0, timestamp=2026-07-08T18:14:00.924Z), EventNotification(id=235242, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=e5ca0df6-ceb3-4a7a-b9d9-d15fde20c3fa, timestamp=2026-07-08T18:19:02.429Z), EventNotification(id=235440, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=3088446c-3228-433b-ad6f-266e8a5f4040, timestamp=2026-07-08T18:39:46.932Z), EventNotification(id=235583, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=ad639185-4cd8-4704-8a43-a038f557750e, timestamp=2026-07-08T18:54:53.102Z), EventNotification(id=236471, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=7430ca66-180b-4274-909f-576407971798, timestamp=2026-07-08T20:30:57.835Z), EventNotification(id=246097, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=45814653-5d8b-40a1-a261-69c5f704dd6c, timestamp=2026-07-09T14:15:29.970Z), EventNotification(id=246143, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5591bfea-eb8d-4acb-8118-648cfd34a7d5, timestamp=2026-07-09T14:20:10.477Z), EventNotification(id=246145, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8668daf7-5fbf-42ed-860b-b91f907b37bb, timestamp=2026-07-09T14:20:44.993Z), EventNotification(id=246662, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b65b6d60-6ba8-446a-a824-f698e3a286ac, timestamp=2026-07-09T15:17:20.651Z), EventNotification(id=246663, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T15:17:45.524Z), EventNotification(id=246808, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=b3cb200c-a162-446a-b607-da62019555ec, timestamp=2026-07-09T15:34:01.330Z), EventNotification(id=246893, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=16da765f-1ef0-401b-996f-44704937ed55, timestamp=2026-07-09T15:42:32.325Z), EventNotification(id=247713, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T17:33:01.263Z), EventNotification(id=247714, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=9ba3e024-2c2a-4fc4-80b7-bf0bb024e917, timestamp=2026-07-09T17:42:11.786Z), EventNotification(id=247731, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5a9f3c72-cd5d-4f03-bde4-055a394e4561, timestamp=2026-07-09T19:02:38.947Z), EventNotification(id=247750, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=a279bc49-7b46-44a9-ab05-b7efd51ca59b, timestamp=2026-07-09T20:07:23.916Z), EventNotification(id=247805, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=3178ab80-d4f5-4bc4-83bd-447c347e5392, timestamp=2026-07-10T15:21:28.425Z), EventNotification(id=247819, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=71f7203c-56e5-49b4-bd03-0f950a6a7689, timestamp=2026-07-10T17:09:39.454Z), EventNotification(id=247822, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=10af474f-cf4e-4eac-81b2-591664e5bfb8, timestamp=2026-07-10T17:17:48.494Z), EventNotification(id=247826, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T17:30:15.565Z), EventNotification(id=247827, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T17:33:19.763Z), EventNotification(id=247830, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=956a0e14-4a3a-4bbc-be17-2585f68f20e5, timestamp=2026-07-10T17:38:09.823Z), EventNotification(id=247857, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=36155e48-d472-4217-a2e8-97406d251e39, timestamp=2026-07-10T19:33:44.396Z), EventNotification(id=247870, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=956a0e14-4a3a-4bbc-be17-2585f68f20e5, timestamp=2026-07-10T19:50:38.751Z), EventNotification(id=248015, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:24:12.336Z), EventNotification(id=248019, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:28:59.448Z), EventNotification(id=248034, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-13T13:49:52.408Z), EventNotification(id=248036, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1c4e8a40-12d4-452e-99ea-59682d61297e, timestamp=2026-07-13T13:50:15.077Z), EventNotification(id=248037, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-13T13:51:00.915Z), EventNotification(id=248045, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:12:54.032Z), EventNotification(id=248047, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:17:58.355Z), EventNotification(id=248049, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=e80906c3-00c4-4736-9b3e-6f38a88f7404, timestamp=2026-07-13T14:21:47.665Z), EventNotification(id=248076, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=61ada33c-de9b-4749-bb56-459a669f3dc4, timestamp=2026-07-13T15:44:00.618Z), EventNotification(id=248086, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:01:11.654Z), EventNotification(id=248087, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:03:33.039Z), EventNotification(id=248088, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T17:08:58.730Z), EventNotification(id=248089, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=8d3b2d30-3f6c-43ec-9323-3b35ce67ea90, timestamp=2026-07-13T17:09:16.049Z), EventNotification(id=248090, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T17:10:00.816Z), EventNotification(id=248145, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=e4b3af80-c780-4156-8f17-7e110c7e8976, timestamp=2026-07-13T18:22:03.744Z), EventNotification(id=248150, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=5f84ed17-2add-4982-bacc-5ccb5da0da70, timestamp=2026-07-13T18:25:14.032Z), EventNotification(id=248154, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T18:30:48.451Z), EventNotification(id=248162, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T18:39:00.399Z), EventNotification(id=248210, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1402f365-5724-4fdb-b22e-967155389ee8, timestamp=2026-07-13T21:20:17.941Z), EventNotification(id=248211, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=bf883ccb-5e9a-4fd7-ab8b-850d93eae307, timestamp=2026-07-13T21:23:21.945Z), EventNotification(id=248214, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1402f365-5724-4fdb-b22e-967155389ee8, timestamp=2026-07-13T22:00:14.802Z), EventNotification(id=248242, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=127a0cf7-b023-4526-a5aa-c12eb418fef3, timestamp=2026-07-14T13:39:01.934Z), EventNotification(id=248249, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T13:56:04.425Z), EventNotification(id=248250, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T14:05:52.171Z), EventNotification(id=248255, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6, timestamp=2026-07-14T14:13:50.910Z), EventNotification(id=248256, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=0c1724a0-f8e6-4014-99ef-c91a66043705, timestamp=2026-07-14T14:14:03.053Z), EventNotification(id=248259, event=FUNDS_RECOVERY_COMPLETED, entityType=FUNDS_RECOVERY, entityId=5b68cb8f-5ff0-42e5-bd8a-e32ab5bae9d6, timestamp=2026-07-14T14:21:04.653Z), EventNotification(id=248323, event=FUNDS_RECOVERY_ANALYSED, entityType=FUNDS_RECOVERY, entityId=1f2cd721-579c-48c2-ae5d-77c631af153a, timestamp=2026-07-14T18:48:23.420Z), EventNotification(id=248325, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=1f2cd721-579c-48c2-ae5d-77c631af153a, timestamp=2026-07-14T19:02:23.343Z), EventNotification(id=248328, event=FUNDS_RECOVERY_CANCELLED, entityType=FUNDS_RECOVERY, entityId=42b68cd5-c0a2-476e-be84-4d11ea7ace0f, timestamp=2026-07-14T19:21:48.819Z)])
2026-07-14 17:39:52,064 127.0.0.6 - - [14/Jul/2026:17:39:52 -0300] "GET /simpi-dict-war/api/v2/dict/event-notifications HTTP/1.1" 200 12810 "-" "Quarkus REST Client" application/json "default task-16 -" 12810 57
2026-07-14 17:39:52,131 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa]PolicyApi#getPolicy(String,String)
2026-07-14 17:39:52,134 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:39:52 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>H0NVcmNOFyRrTDQLJX9kpcI90QsSH8RzU4191tQZFC8=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>GUW5fVTHsTlWn9mG/gq1fZgrl+8uvobDWho9gJJniPCthHEdymmBdQZLOP18burYMGCqYmYXxvlM&#13;
2EWGB4ILprliMeLDsdzOVZ0Sgu9yl+kn3F+9u3gZ0q5lXY5AiYmKxKn/HGXxABjxzYYV73xYvARJ&#13;
Tv87K5qvDu/rJwfM2GlN4vYyIVn9FP7GKts29q9I79ZzvtHNNcPbOBFVfHo1/QJP1VVYRvS8suv7&#13;
jeYdnFK3G/QS+tnC52BPuZqNEjPag+QsaLHguJNt8Y3/6zQj6AQZwpaAzqcL9QDNHpSeXYNO4CYE&#13;
II6A6yB79CZI+mD2xJM/MI3iklj1yOqd/IlwYw==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141739520130036030513B694</CorrelationId><ResponseTime>2026-07-14T20:39:52.125Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:52,134 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@2c140a0b
    correlationId: A202607141739520130036030513B694
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:52.125Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:39:52,134 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-15) [CORRELATION-ID:2ad74a60-f158-4b4f-b041-6b74414292fa][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@2c140a0b
    correlationId: A202607141739520130036030513B694
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:39:52.125Z
}
2026-07-14 17:39:52,135 127.0.0.6 - - [14/Jul/2026:17:39:52 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-15 -" 258 130
2026-07-14 17:40:00,033 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,033 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,034 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][SIMPI-DICT] Iniciando a listagem de politicas.
2026-07-14 17:40:00,035 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][SIMPI-DICT] Efetuando a listagem de politicas.
2026-07-14 17:40:00,036 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49]--->PolicyApi#bucketStates(String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:40:00,085 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,085 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,085 INFO  [br.gov.caixa.mpi.dict.rest.v2.RefundRest] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI-DICT] Iniciando a busca das devolucoes. DevolucaoDto: org.jboss.resteasy.specimpl.UnmodifiableMultivaluedMap@165e49c9
2026-07-14 17:40:00,085 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,086 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,087 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14 17:40:00,087 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14 17:40:00,087 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c]--->RefundApi#listRefunds(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1
Content-Type: application/xml
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1 (0-byte body) {Content-Type=[application/xml], Accept=[application/problem+xml,application/xml]}
2026-07-14 17:40:00,090 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e]--->ClaimApi#listClaims(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=false&ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&ModifiedBefore=2026-07-14T20:40:00Z&IsDonor=true&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=false&ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&ModifiedBefore=2026-07-14T20:40:00Z&IsDonor=true&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:40:00,100 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c]RefundApi#listRefunds(Map)
2026-07-14 17:40:00,103 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1886
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListRefundsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>nv5os/ZR8HK+A9nQnKv4GovBJuOYlz8uKHxU8Tcumwg=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>VRzQ4b8cuKydLLRWXDSMz1MpfP3DeZJycpkYKAdELWO7xcw4XAscKd3cLmlYfXzF3NKPfOjWn19H&#13;
B7LSi19FBI0g0Afr898yCxPBe8Nfg2FC1LDyM/cvolLdT+Hw4m7Rv+u+j04yokSOc5Z6dg75c4iC&#13;
rKuywgsfHnQwazPoqtZSXJCJ+pPg1foPJF8JtRC6xfYrxvasoD5OlJmG2iKZNfR2iGRbQ/2nl+ON&#13;
NyVd9e1sD6x39vzptNnkv+p33HLhQ7YEdQHuzLHDHtjtqE0gFQsBZoeMLSFJdSgcnxzMFW8+4FkL&#13;
64OJLiMEmtB3khzyaRg2+0KgflaBQ9ULjJ4KsQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174000092003603050D7DEA</CorrelationId><ResponseTime>2026-07-14T20:40:00.096Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListRefundsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:40:00,103 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    refunds: []
} Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:40:00,103 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 16 ms. QueryParams: {ModifiedAfter=[2026-07-14T20:34:40Z], Participant=00360305, IncludeDetails=[false], ModifiedBefore=[2026-07-14T20:40:00Z], Limit=[200], ParticipantRole=[REQUESTING]} Devolucoes: []
2026-07-14 17:40:00,103 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-19) [CORRELATION-ID:df99d9c1-aa68-4632-a004-874f96ebed1c][SIMPI-DICT] [DEVOLUCOES] Foram retornadas 0 devolucoes do Bacen em que a caixa e [REQUESTING] possui mais elementos false
2026-07-14 17:40:00,104 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/refund?ModifiedAfter=2026-07-14T20%3A34%3A40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20%3A40%3A00Z&Limit=200&ParticipantRole=REQUESTING HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-19 -" 34 21
2026-07-14 17:40:00,123 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e]ClaimApi#listClaims(Map)
2026-07-14 17:40:00,126 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,126 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,126 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1884
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListClaimsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>a1BWkQGrI+J0dXTDtX2W1fmkKZzD9CVT6ydkyPX8aK0=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>slw/xu+AgMK7g8VLdUGs1QKQyq+Vb5Mc8rSjOf5W6mTjgokpa5/qcS3xrrFaSEcH3gjLYgK3r2CT&#13;
sbhwcgKHSRoJGkp7bzut7vTOABJKWH5ah4dCySW5V5LffaK50fJXr6n8F4Zvjs5XPhI/C1O4hUDl&#13;
XE7ICDacVlEB6MjDyLzUZnox1Wyv3+WB1W0HiBpsbpv92cVZxm4kjOGBPe+NiJ76iULW4ZMzQZpg&#13;
nQKsaGDOAZhFOUrC4fWbSxRUhxqTwWUZpBjpu/jr9t/Sm0OZGemsG3GOjUlBdbpu4dmtq0oVyEUb&#13;
M6POX5aMY1j2oqO3Nun7B+OEPjKK3G91/JeJHQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174000116003603053B1F40</CorrelationId><ResponseTime>2026-07-14T20:40:00.120Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListClaimsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:40:00,126 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    claims: []
} Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:40:00,127 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 40 ms. Foram encontradas 0  reivindicacoes. 
  Possui mais elementos: false
2026-07-14 17:40:00,127 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-18) [CORRELATION-ID:b1ab5120-6fc1-4d6c-aa19-18ccc457178e][SIMPI-DICT] [Claims]  QueryParams: {Status=[OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED], IsClaimer=[false], ModifiedAfter=[2026-07-14T20:34:40Z], Participant=00360305, ModifiedBefore=[2026-07-14T20:40:00Z], IsDonor=[true], Limit=[200]}
 Reivindicacoes: []
2026-07-14 17:40:00,128 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/claim/claims?IsClaimer=false&Status=OPEN%2CWAITING_RESOLUTION%2CCONFIRMED%2CCOMPLETED%2CCANCELLED&ModifiedAfter=2026-07-14T20%3A34%3A40Z&ModifiedBefore=2026-07-14T20%3A40%3A00Z&IsDonor=true&Limit=200 HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-18 -" 34 44
2026-07-14 17:40:00,132 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14 17:40:00,132 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,132 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,133 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc]--->ClaimApi#listClaims(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=true&ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&ModifiedBefore=2026-07-14T20:40:00Z&IsDonor=false&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/claims/?Status=OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED&IsClaimer=true&ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&ModifiedBefore=2026-07-14T20:40:00Z&IsDonor=false&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:40:00,133 INFO  [br.gov.caixa.mpi.dict.rest.v2.RefundRest] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI-DICT] Iniciando a busca das devolucoes. DevolucaoDto: org.jboss.resteasy.specimpl.UnmodifiableMultivaluedMap@33148b84
2026-07-14 17:40:00,154 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49]PolicyApi#bucketStates(String)
2026-07-14 17:40:00,162 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14 17:40:00,163 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b]--->RefundApi#listRefunds(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1
Content-Type: application/xml
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/refunds/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1 (0-byte body) {Content-Type=[application/xml], Accept=[application/problem+xml,application/xml]}
2026-07-14 17:40:00,169 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
transfer-encoding: chunked
vary: origin,access-control-request-method,access-control-request-headers,accept-encoding

<ListPoliciesResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>7B6wuuTIYP86Mnw6+lefFmXPFZ3Fxot22Hccimz6JCA=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>skrc9olH4Qq2iy58CSc1fLSxkxjbHyrpzNzZl3CDNBbgfRGM18B+2H63B6BwO8ST8Wvjmlyf3kLF&#13;
K6TB7WqLtr9T+apuNDE6yta117cVCVBVI31g2lV6XFovNrHEZbcFOw+SBdX4msGfNiw5aCr7UgaA&#13;
bf6C8w6RYUyjaF9KLrcep1n8KbrSxJuiWARt76T0dH/f0XLBIxyvKSaylQhWB1kDN5OOSxyltsYB&#13;
hKmnAP3bT5Wk6F5XR8uYbAv+bq/BRAXiJ8mQvujluEg+txoXIbsGmQbzaK4D7SZ20OXZ6pMxMiGb&#13;
AYqTzQR3Sg1fwDkTOPsUrxJMrhnoKDtm5Uon4w==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174000039003603050A904A</CorrelationId><ResponseTime>2026-07-14T20:40:00.151Z</ResponseTime><Category>C</Category><Policies><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>100</AvailableTokens><Capacity>100</Capacity><RefillTokens>20</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_EVENTS_LIST</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>SYNC_VERIFICATIONS_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_WRITE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>INFRACTION_REPORTS_READ</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_WRITE</Name></Policy><Policy><AvailableTokens>70</AvailableTokens><Capacity>70</Capacity><RefillTokens>70</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>KEYS_CHECK</Name></Policy><Policy><AvailableTokens>199</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>EVENT_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>ENTRIES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_WRITE</Name></Policy><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>100</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CLAIMS_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_LIST</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>1200</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_READ</Name></Policy><Policy><AvailableTokens>18000</AvailableTokens><Capacity>18000</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>FRAUD_MARKERS_READ</Name></Policy><Policy><AvailableTokens>18</AvailableTokens><Capacity>20</Capacity><RefillTokens>6</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_LIST</Name></Policy><Policy><AvailableTokens>199</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CLAIMS_LIST_WITH_ROLE</Name></Policy><Policy><AvailableTokens>49</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>INFRACTION_REPORTS_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>195</AvailableTokens><Capacity>200</Capacity><RefillTokens>60</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>POLICIES_READ</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>86400</RefillPeriodSec><Name>CIDS_FILES_WRITE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>200</RefillTokens><RefillPeriodSec>10</RefillPeriodSec><Name>CIDS_ENTRIES_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITHOUT_ROLE</Name></Policy><Policy><AvailableTokens>36000</AvailableTokens><Capacity>36000</Capacity><RefillTokens>12000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>PERSONS_STATISTICS_READ</Name></Policy><Policy><AvailableTokens>50</AvailableTokens><Capacity>50</Capacity><RefillTokens>10</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>CIDS_FILES_READ</Name></Policy><Policy><AvailableTokens>72000</AvailableTokens><Capacity>72000</Capacity><RefillTokens>2400</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUNDS_WRITE</Name></Policy><Policy><AvailableTokens>30000</AvailableTokens><Capacity>30000</Capacity><RefillTokens>15000</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_READ_PARTICIPANT_ANTISCAN</Name></Policy><Policy><AvailableTokens>200</AvailableTokens><Capacity>200</Capacity><RefillTokens>40</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>REFUND_LIST_WITH_ROLE</Name></Policy></Policies></ListPoliciesResponse> Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:40:00,170 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:40:00.151Z
    correlationId: A20260714174000039003603050A904A
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 18
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 49
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 195
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
} Type: br.gov.caixa.mpi.dict.api.model.ListPoliciesResponse
2026-07-14 17:40:00,170 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.BucketStatesFacade] (default task-17) [CORRELATION-ID:74ab71f4-6c75-466c-99d5-9e9b4cb9bf49][SIMPI-DICT] listagem de politicas finalizada em 135 ms. ListPoliciesResponse: class ListPoliciesResponse {
    signature: [ds:Signature: null]
    responseTime: 2026-07-14T20:40:00.151Z
    correlationId: A20260714174000039003603050A904A
    category: C
    policies: [class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 100
        capacity: 100
        refillTokens: 20
        refillPeriodSec: 60
        name: CIDS_EVENTS_LIST
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: SYNC_VERIFICATIONS_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_WRITE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: INFRACTION_REPORTS_READ
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_STATISTICS_READ
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CLAIMS_WRITE
    }, class Policy {
        availableTokens: 70
        capacity: 70
        refillTokens: 70
        refillPeriodSec: 60
        name: KEYS_CHECK
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: EVENT_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: ENTRIES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: FRAUD_MARKERS_WRITE
    }, class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 100
        refillPeriodSec: 10
        name: CLAIMS_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_LIST
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 1200
        refillPeriodSec: 60
        name: REFUNDS_READ
    }, class Policy {
        availableTokens: 18000
        capacity: 18000
        refillTokens: 600
        refillPeriodSec: 60
        name: FRAUD_MARKERS_READ
    }, class Policy {
        availableTokens: 18
        capacity: 20
        refillTokens: 6
        refillPeriodSec: 60
        name: POLICIES_LIST
    }, class Policy {
        availableTokens: 199
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: CLAIMS_LIST_WITH_ROLE
    }, class Policy {
        availableTokens: 49
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: INFRACTION_REPORTS_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 195
        capacity: 200
        refillTokens: 60
        refillPeriodSec: 60
        name: POLICIES_READ
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 86400
        name: CIDS_FILES_WRITE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 200
        refillPeriodSec: 10
        name: CIDS_ENTRIES_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: REFUND_LIST_WITHOUT_ROLE
    }, class Policy {
        availableTokens: 36000
        capacity: 36000
        refillTokens: 12000
        refillPeriodSec: 60
        name: PERSONS_STATISTICS_READ
    }, class Policy {
        availableTokens: 50
        capacity: 50
        refillTokens: 10
        refillPeriodSec: 60
        name: CIDS_FILES_READ
    }, class Policy {
        availableTokens: 72000
        capacity: 72000
        refillTokens: 2400
        refillPeriodSec: 60
        name: REFUNDS_WRITE
    }, class Policy {
        availableTokens: 30000
        capacity: 30000
        refillTokens: 15000
        refillPeriodSec: 60
        name: ENTRIES_READ_PARTICIPANT_ANTISCAN
    }, class Policy {
        availableTokens: 200
        capacity: 200
        refillTokens: 40
        refillPeriodSec: 60
        name: REFUND_LIST_WITH_ROLE
    }]
}
2026-07-14 17:40:00,173 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/policy HTTP/1.1" 200 7665 "-" "okhttp/3.6.0" application/json "default task-17 -" 7665 141
2026-07-14 17:40:00,174 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc]ClaimApi#listClaims(Map)
2026-07-14 17:40:00,177 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1884
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListClaimsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>wPuq+HrkeppTV2oHZvKMYykxDwxVo7MbTEuiC+w3j+w=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>etFS+HG48u6KcrIGQtNMlNnyzLGSQUgGvNRrIZbUAejk3X4ZJSfiGFZVJUTDqun2cvXzFKyAFi9Y&#13;
3R8z71hloFUVaD90yu7oFAu+Sn0XOChn7hBMAKcLYUwQVgmj17mjZ9IfK4Gf7oQSsvTlnuVgLZXG&#13;
UOl3K8sbYaFvAI2MoMQG2TjXdw/IwqCfmUndYZSDzywZmfDF4MN004QbDvvy+r8nuF8G+rk2ba3c&#13;
NPIwfU1Pw4/usZjogj5WkBWZ0Fs0Di3e5T1jMM8lGQCHcub9KX80+BaMbKTooRv3tjD0qR7tJwdV&#13;
tcMRFYfzd6oTPtX3CkFY3buECnylPsbb/6Ei9g==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174000166003603050710D6</CorrelationId><ResponseTime>2026-07-14T20:40:00.170Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListClaimsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:40:00,177 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    claims: []
} Type: br.gov.caixa.mpi.dict.api.model.ListClaimsResponse
2026-07-14 17:40:00,177 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 45 ms. Foram encontradas 0  reivindicacoes. 
  Possui mais elementos: false
2026-07-14 17:40:00,178 INFO  [br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimsFacade] (default task-20) [CORRELATION-ID:d87f0b85-c736-4d0b-ad6b-d9163ae5bacc][SIMPI-DICT] [Claims]  QueryParams: {Status=[OPEN,WAITING_RESOLUTION,CONFIRMED,COMPLETED,CANCELLED], IsClaimer=[true], ModifiedAfter=[2026-07-14T20:34:40Z], Participant=00360305, ModifiedBefore=[2026-07-14T20:40:00Z], IsDonor=[false], Limit=[200]}
 Reivindicacoes: []
2026-07-14 17:40:00,178 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/claim/claims?IsClaimer=true&Status=OPEN%2CWAITING_RESOLUTION%2CCONFIRMED%2CCOMPLETED%2CCANCELLED&ModifiedAfter=2026-07-14T20%3A34%3A40Z&ModifiedBefore=2026-07-14T20%3A40%3A00Z&IsDonor=false&Limit=200 HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-20 -" 34 53
2026-07-14 17:40:00,179 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b]RefundApi#listRefunds(Map)
2026-07-14 17:40:00,182 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1886
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListRefundsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>33OwZ2aucmR5CmuTTNmgM26cfl1gMcWptd44ZrdrKuM=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>GvPKD0ngVFKhTjcfscMreLWMsSx5kR9ikjpacHF8R3PdJkYL337NSwq3vW9pwtpN3Vwe3JSsAKPx&#13;
yC5n86i5GOE0f8eDjxwm4OESzV4lK6gS9XJ+kpXQ0eMF11L7rSyZRmxsRS+SZUX7yMZms5NylaW8&#13;
jb3rJw34ZQJ01OlnGHAL+Sx1NX5pnQum51g+DPD1MOu6E3u1Kugyo+55MxWWQ8qJkZHueiUa1KNp&#13;
wlpZ176U/I5jcxY4R2t5fyhDgX6c8vmrW0cUHY3QpjAE5E4lCB81AR37YGT5MYmf2rAEf/VVTtGg&#13;
+xd7WSMK0otwWwZr5QYPKXSwsCFXRGbZ+0UIYQ==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A202607141740001700036030553010D</CorrelationId><ResponseTime>2026-07-14T20:40:00.174Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListRefundsResponse> Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:40:00,182 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class ListClaimsResponse {
    signature: [ds:Signature: null]
    hasMoreElements: false
    refunds: []
} Type: br.gov.caixa.mpi.dict.api.model.ListRefundsResponse
2026-07-14 17:40:00,182 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 20 ms. QueryParams: {ModifiedAfter=[2026-07-14T20:34:40Z], Participant=00360305, IncludeDetails=[false], ModifiedBefore=[2026-07-14T20:40:00Z], Limit=[200], ParticipantRole=[CONTESTED]} Devolucoes: []
2026-07-14 17:40:00,183 INFO  [br.gov.caixa.mpi.dict.v2.facade.refund.ListRefundsFacade] (default task-21) [CORRELATION-ID:331bd815-ab97-4b40-a8b6-37cb47152b7b][SIMPI-DICT] [DEVOLUCOES] Foram retornadas 0 devolucoes do Bacen em que a caixa e [CONTESTED] possui mais elementos false
2026-07-14 17:40:00,183 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/refund?ModifiedAfter=2026-07-14T20%3A34%3A40Z&Participant=00360305&IncludeDetails=false&ModifiedBefore=2026-07-14T20%3A40%3A00Z&Limit=200&ParticipantRole=CONTESTED HTTP/1.1" 200 34 "-" "okhttp/3.6.0" application/json "default task-21 -" 34 53
2026-07-14 17:40:00,326 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][JWT-AUTH-FILTER] versao da api v2
2026-07-14 17:40:00,326 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,327 INFO  [br.gov.caixa.mpi.dict.rest.v2.InfractionReportRest] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][SIMPI-DICT][INFRACTION-REPORT-V2] Buscar todos os relatos de infracao.
2026-07-14 17:40:00,328 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][SIMPI-DICT] [InfractionReport_V2] Solicitando Relatos no bacen 
2026-07-14 17:40:00,328 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30]--->InfractionReportApi#listInfractionReport(Map) GET https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200 HTTP/1.1
Accept: application/problem+xml,application/xml
 https://dict-h.pi.rsfn.net.br/api/v2/infraction-reports/?ModifiedAfter=2026-07-14T20:34:40Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20:40:00Z&Limit=200 HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml]}
2026-07-14 17:40:00,338 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30]InfractionReportApi#listInfractionReport(Map)
2026-07-14 17:40:00,365 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1906
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<ListInfractionReportsResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>YawfTUGL7ZjTV+woe8wSMZUhWbink+CZmhIH9fz5fM8=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>B1/dBGyuvElZmbtt6wmV5LYocSpeZh1ZDC0d7u0LlZQNLs7a679PP+izqAd6Lceqnl/epOtMCtz1&#13;
dbjbsTbsIEaVWqVYUFoESJWBLs2BAX+umZ5qqf74EFZ6pHwZuzONWGtaRWvp1P/saZ8YmSIIllWU&#13;
VbUHhDf2nv8ggYhbcS0KB/fRM4EeyvZqJ7lhVPYgeVGh4PK4ARcgFHqFkf6tVv3pAOVR/Ck7fE6q&#13;
OAdwoyNk3wqTxGPwkMr+6Gh36SsNARXD/2IlY6mhGi6QFsYbi2fAVKOgNnA8c3tCaiwLyJ4KfSM/&#13;
egEogb9k7UK4MLV8/bLWR9k3iVRnLMl5Gx310Q==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174000331003603053DE539</CorrelationId><ResponseTime>2026-07-14T20:40:00.335Z</ResponseTime><HasMoreElements>false</HasMoreElements></ListInfractionReportsResponse> Type: br.gov.caixa.mpi.dict.v2.api.model.ListInfractionReportsResponse
2026-07-14 17:40:00,365 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: 
    responseTime: 2026-07-14T20:40:00.335Z
    correlationId: A20260714174000331003603053DE539
    infractionReport: []
} Type: br.gov.caixa.mpi.dict.v2.api.model.ListInfractionReportsResponse
2026-07-14 17:40:00,365 INFO  [br.gov.caixa.mpi.dict.v2.facade.infraction.GetListInfractionReportFacade] (default task-22) [CORRELATION-ID:bc3893bc-9377-44f6-9578-e40d27318d30][SIMPI-DICT] [InfractionReport_V2] Requisicao ao Bacen para buscar relatos realizada em 37 ms. Foram retornados 0 do bacen.  Possui mais elementos: false
2026-07-14 17:40:00,366 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v2/dict/infractionReport/infractionReports?ModifiedAfter=2026-07-14T20%3A34%3A40Z&Participant=00360305&IncludeDetails=true&ModifiedBefore=2026-07-14T20%3A40%3A00Z&Limit=200 HTTP/1.1" 200 159 "-" "okhttp/3.6.0" application/json "default task-22 -" 159 41
2026-07-14 17:40:00,462 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:00,462 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:00,466 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef]--->ClaimApi#getClaim(UUID,String) GET https://dict-h.pi.rsfn.net.br/api/v2/claims/acd62e21-9563-4ac9-a28e-8452a43c4afb HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/claims/acd62e21-9563-4ac9-a28e-8452a43c4afb HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:40:00,476 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef]ClaimApi#getClaim(UUID,String)
2026-07-14 17:40:00,476 INFO  [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][SIMPI-DICT] Logando decode methodKey: ClaimApi#getClaim(UUID,String) Response: HTTP/1.1 404 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1963
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<problem xmlns="urn:ietf:rfc:7807"><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>PxuQNkyLETpu23tQ1Aq9YKh3DhbCCTAX1C+ALfV1vNo=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ZNle3VmzbzE0TpgRzfm68/L1LcCMjG3JUS9KgKWb/ZGKJU8xD1l9g0M9RW87Jqfaow/FAsyVi7YY&#13;
5jrthj1WjQR9mN1ZX0ChmnueWp20505FsszJDTyp2ObD8CoxS6u1H/PYhDydeQEZVBuH3ahh+95e&#13;
T2kNrek7pRZ9pc6ck3d++3VpSvDID5zwtNfaWMbFWPwqBDTX3jRrY4v1tcD9QNkSvrRhUebJ59wY&#13;
ZuYwC3zpx43uq3ePDSqoiP4k2wW9T88c3YSqIWyAiZlmSGESwy5v5xUKC484dweGoffZ3yN2dzD2&#13;
PEShbW4e6nXT/R4xnpD5Vr+E4nm4ipoE9tVsmA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><type>https://dict.pi.rsfn.net.br/api/v2/error/NotFound</type><title>Not Found</title><status>404</status><detail>Claim associated with given id does not exist</detail><correlationId>A202607141740004690036030542F61C</correlationId></problem>
2026-07-14 17:40:00,476 INFO  [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][SIMPI-DICT] Tratar Erro bacen: <problem xmlns="urn:ietf:rfc:7807"><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>PxuQNkyLETpu23tQ1Aq9YKh3DhbCCTAX1C+ALfV1vNo=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ZNle3VmzbzE0TpgRzfm68/L1LcCMjG3JUS9KgKWb/ZGKJU8xD1l9g0M9RW87Jqfaow/FAsyVi7YY&#13;
5jrthj1WjQR9mN1ZX0ChmnueWp20505FsszJDTyp2ObD8CoxS6u1H/PYhDydeQEZVBuH3ahh+95e&#13;
T2kNrek7pRZ9pc6ck3d++3VpSvDID5zwtNfaWMbFWPwqBDTX3jRrY4v1tcD9QNkSvrRhUebJ59wY&#13;
ZuYwC3zpx43uq3ePDSqoiP4k2wW9T88c3YSqIWyAiZlmSGESwy5v5xUKC484dweGoffZ3yN2dzD2&#13;
PEShbW4e6nXT/R4xnpD5Vr+E4nm4ipoE9tVsmA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><type>https://dict.pi.rsfn.net.br/api/v2/error/NotFound</type><title>Not Found</title><status>404</status><detail>Claim associated with given id does not exist</detail><correlationId>A202607141740004690036030542F61C</correlationId></problem> response: HTTP/1.1 404 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 1963
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:00 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<problem xmlns="urn:ietf:rfc:7807"><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>PxuQNkyLETpu23tQ1Aq9YKh3DhbCCTAX1C+ALfV1vNo=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ZNle3VmzbzE0TpgRzfm68/L1LcCMjG3JUS9KgKWb/ZGKJU8xD1l9g0M9RW87Jqfaow/FAsyVi7YY&#13;
5jrthj1WjQR9mN1ZX0ChmnueWp20505FsszJDTyp2ObD8CoxS6u1H/PYhDydeQEZVBuH3ahh+95e&#13;
T2kNrek7pRZ9pc6ck3d++3VpSvDID5zwtNfaWMbFWPwqBDTX3jRrY4v1tcD9QNkSvrRhUebJ59wY&#13;
ZuYwC3zpx43uq3ePDSqoiP4k2wW9T88c3YSqIWyAiZlmSGESwy5v5xUKC484dweGoffZ3yN2dzD2&#13;
PEShbW4e6nXT/R4xnpD5Vr+E4nm4ipoE9tVsmA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><type>https://dict.pi.rsfn.net.br/api/v2/error/NotFound</type><title>Not Found</title><status>404</status><detail>Claim associated with given id does not exist</detail><correlationId>A202607141740004690036030542F61C</correlationId></problem>
2026-07-14 17:40:00,476 INFO  [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][SIMPI-DICT] XML do bacen -> Property: detail jsonResponse: <problem xmlns="urn:ietf:rfc:7807"><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>PxuQNkyLETpu23tQ1Aq9YKh3DhbCCTAX1C+ALfV1vNo=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ZNle3VmzbzE0TpgRzfm68/L1LcCMjG3JUS9KgKWb/ZGKJU8xD1l9g0M9RW87Jqfaow/FAsyVi7YY&#13;
5jrthj1WjQR9mN1ZX0ChmnueWp20505FsszJDTyp2ObD8CoxS6u1H/PYhDydeQEZVBuH3ahh+95e&#13;
T2kNrek7pRZ9pc6ck3d++3VpSvDID5zwtNfaWMbFWPwqBDTX3jRrY4v1tcD9QNkSvrRhUebJ59wY&#13;
ZuYwC3zpx43uq3ePDSqoiP4k2wW9T88c3YSqIWyAiZlmSGESwy5v5xUKC484dweGoffZ3yN2dzD2&#13;
PEShbW4e6nXT/R4xnpD5Vr+E4nm4ipoE9tVsmA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><type>https://dict.pi.rsfn.net.br/api/v2/error/NotFound</type><title>Not Found</title><status>404</status><detail>Claim associated with given id does not exist</detail><correlationId>A202607141740004690036030542F61C</correlationId></problem>
2026-07-14 17:40:00,476 INFO  [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][SIMPI-DICT] XML do bacen -> Property: type jsonResponse: <problem xmlns="urn:ietf:rfc:7807"><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>PxuQNkyLETpu23tQ1Aq9YKh3DhbCCTAX1C+ALfV1vNo=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ZNle3VmzbzE0TpgRzfm68/L1LcCMjG3JUS9KgKWb/ZGKJU8xD1l9g0M9RW87Jqfaow/FAsyVi7YY&#13;
5jrthj1WjQR9mN1ZX0ChmnueWp20505FsszJDTyp2ObD8CoxS6u1H/PYhDydeQEZVBuH3ahh+95e&#13;
T2kNrek7pRZ9pc6ck3d++3VpSvDID5zwtNfaWMbFWPwqBDTX3jRrY4v1tcD9QNkSvrRhUebJ59wY&#13;
ZuYwC3zpx43uq3ePDSqoiP4k2wW9T88c3YSqIWyAiZlmSGESwy5v5xUKC484dweGoffZ3yN2dzD2&#13;
PEShbW4e6nXT/R4xnpD5Vr+E4nm4ipoE9tVsmA==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><type>https://dict.pi.rsfn.net.br/api/v2/error/NotFound</type><title>Not Found</title><status>404</status><detail>Claim associated with given id does not exist</detail><correlationId>A202607141740004690036030542F61C</correlationId></problem>
2026-07-14 17:40:00,477 INFO  [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][RETORNO_BACEN] Retorno requisicao. Http Status 404 Causa NotFound Detalhe do erro Entidade n?o encontrada. 
2026-07-14 17:40:00,477 ERROR [br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef][SIMPI-DICT] ErrorDecoderFeignMPI: HTTP 404 Not Found
2026-07-14 17:40:00,478 ERROR [org.jboss.as.ejb3.invocation] (default task-23) [CORRELATION-ID:a8aedaef-7789-4594-be37-a1e556eb12ef]WFLYEJB0034: EJB Invocation failed on component GetClaimFacade for method public br.gov.caixa.mpi.dict.api.dto.ReivindicacaoDto br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade.executar(java.lang.String,java.lang.String): javax.ejb.EJBException: br.gov.caixa.dict.comum.exceptions.DictException: br.gov.caixa.dict.comum.exceptions.NegocioException: HTTP 404 Not Found
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade$$$view27.executar(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade$Proxy$_$$_Weld$EnterpriseProxy$.executar(Unknown Source)
	at br.gov.caixa.mpi.dict.rest.v2.ClaimRest.getClaim(ClaimRest.java:90)
	at br.gov.caixa.mpi.dict.rest.v2.ClaimRest$Proxy$_$$_WeldClientProxy.getClaim(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:65)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:330)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: br.gov.caixa.dict.comum.exceptions.DictException: br.gov.caixa.dict.comum.exceptions.NegocioException: HTTP 404 Not Found
	at br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI.decode(ErrorDecoderFeignMPI.java:129)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:138)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy130.getClaim(Unknown Source)
	at br.gov.caixa.mpi.dict.v2.facade.claim.GetClaimFacade.executar(GetClaimFacade.java:17)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	... 98 more
Caused by: br.gov.caixa.dict.comum.exceptions.NegocioException: HTTP 404 Not Found
	at br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI.decode(ErrorDecoderFeignMPI.java:122)
	... 130 more

2026-07-14 17:40:00,481 127.0.0.6 - - [14/Jul/2026:17:40:00 -0300] "GET /simpi-dict-war/api/v1/dict/claim/acd62e21-9563-4ac9-a28e-8452a43c4afb/00360305 HTTP/1.1" 404 120 "-" "okhttp/3.6.0" application/json "default task-23 -" 120 50
2026-07-14 17:40:02,004 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:02,005 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:02,005 INFO  [br.gov.caixa.mpi.dict.rest.v2.PolicyRest] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][SIMPI-DICT] Iniciando a consulta de politica limitacao: ENTRIES_UPDATE
2026-07-14 17:40:02,006 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][SIMPI-DICT] Chamando bacen consultar [ENTRIES_UPDATE] politica limita??o
2026-07-14 17:40:02,006 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d]--->PolicyApi#getPolicy(String,String) GET https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1
Accept: application/problem+xml,application/xml
PI-RequestingParticipant: 00360305
 https://dict-h.pi.rsfn.net.br/api/v2/policies/ENTRIES_UPDATE HTTP/1.1 (0-byte body) {Accept=[application/problem+xml,application/xml], PI-RequestingParticipant=[00360305]}
2026-07-14 17:40:02,125 INFO  [br.gov.caixa.mpi.dict.feign.LoggerFeign] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d]PolicyApi#getPolicy(String,String)
2026-07-14 17:40:02,127 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][SIMPI][DICT][KEY-CHECK] Utilizando o customDecoder para passar o parametro max-age. Response: HTTP/1.1 200 
cache-control: no-store
connection: Keep-Alive, keep-alive
content-length: 2039
content-type: application/problem+xml
date: Tue, 14 Jul 2026 20:40:02 GMT
keep-alive: timeout=15
vary: Origin
vary: Access-Control-Request-Method
vary: Access-Control-Request-Headers

<GetPolicyResponse><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/><ds:Reference URI="#key-info-id"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>9pfalmIPQU+yzBQz44eokRrroHun/p+DqYVE6X9BA+E=</ds:DigestValue></ds:Reference><ds:Reference URI=""><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/><ds:DigestValue>206XzBuuGrBX10o+C6EwtnpJ9uNSHt26azK8xNBnWQI=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>SlUzTEaIkelPsTGOgDobNxAYO1oPCNd2XMxnQoyQLWxD+qWWMloNVd5QpUOjJDHzJzIQeYN/CZpk&#13;
/OgmD/SCf7AdDQCsnDh4uLxFmAdNpR95sVppcrt+fLiwhlRfkaqN46A5KNu5QoYZt6fdcNB8kZsj&#13;
M/N4ZHmS8OrpKgiyc1fVJFDYNO6jvq0TfplrAPBIHew7fyEHcV6L1SmuPQ1LZayNke95KW3gCMaS&#13;
bT4hmXuHH9ED/MMjlLb/NV2OTeVEVUxG0pZyBBh5iNJWDY+KEYZVGYusUTh6OwpJaqKqTl8mRBcw&#13;
BTlLr5YFWOS20U4+eAKfVvCh8wW9MYE4dh4p7w==</ds:SignatureValue><ds:KeyInfo Id="key-info-id"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>CN=Autoridade Certificadora do SERPRO Final SSL, OU=Servico Federal de Processamento de Dados - SERPRO, OU=CSPB-1, O=ICP-Brasil, C=BR</ds:X509IssuerName><ds:X509SerialNumber>65477780675500508951378797386</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></ds:KeyInfo></ds:Signature><CorrelationId>A20260714174002009003603050CB066</CorrelationId><ResponseTime>2026-07-14T20:40:02.121Z</ResponseTime><Category>C</Category><Policy><AvailableTokens>600</AvailableTokens><Capacity>600</Capacity><RefillTokens>600</RefillTokens><RefillPeriodSec>60</RefillPeriodSec><Name>ENTRIES_UPDATE</Name></Policy></GetPolicyResponse> Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:40:02,127 INFO  [br.gov.caixa.mpi.dict.api.CustomDecoder] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][SIMPI][DICT][KEY-CHECK] Retorno depois do customDecoder do max-age. Retorno: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@4d0c56bd
    correlationId: A20260714174002009003603050CB066
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:40:02.121Z
} Type: br.gov.caixa.mpi.dict.api.model.GetPolicyResponse
2026-07-14 17:40:02,127 INFO  [br.gov.caixa.mpi.dict.v2.facade.policy.GetPolicyFacade] (default task-24) [CORRELATION-ID:2e74bbce-3ea4-4c7e-8456-1aa23476e03d][SIMPI-DICT] Retorno bacen consultar [ENTRIES_UPDATE] politica limita??o: class GetInfractionReportResponse {
    signature: br.gov.caixa.mpi.dict.api.model.Signature@4d0c56bd
    correlationId: A20260714174002009003603050CB066
    category: C
    policy: class Policy {
        availableTokens: 600
        capacity: 600
        refillTokens: 600
        refillPeriodSec: 60
        name: ENTRIES_UPDATE
    }
    responseTime: 2026-07-14T20:40:02.121Z
}
2026-07-14 17:40:02,129 127.0.0.6 - - [14/Jul/2026:17:40:02 -0300] "GET /simpi-dict-war/api/v1/dict/policy/ENTRIES_UPDATE HTTP/1.1" 200 258 "-" "Quarkus REST Client" application/json "default task-24 -" 258 125
2026-07-14 17:40:03,797 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-25) [CORRELATION-ID:58bdb59e-1ef7-404d-9eae-a97c592392b2][JWT-AUTH-FILTER] versao da api v1
2026-07-14 17:40:03,798 INFO  [br.gov.caixa.mpi.dict.security.JwtAuthFilter] (default task-25) [CORRELATION-ID:58bdb59e-1ef7-404d-9eae-a97c592392b2][JWT-AUTH-FILTER] Bypass token...
2026-07-14 17:40:03,808 ERROR [org.jboss.as.ejb3.invocation] (default task-25) [CORRELATION-ID:58bdb59e-1ef7-404d-9eae-a97c592392b2]WFLYEJB0034: EJB Invocation failed on component HsmCaixaEjb for method public java.lang.String br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.assinarXml(java.lang.String) throws java.lang.Exception: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:313)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:238)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$$$view11.assinarXml(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$Proxy$_$$_Weld$EnterpriseProxy$.assinarXml(Unknown Source)
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:22)
	at feign.SynchronousMethodHandler.targetRequest(SynchronousMethodHandler.java:158)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:88)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy133.createEntry(Unknown Source)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(CriarVinculoDictFacade.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$$$view8.executar(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$Proxy$_$$_Weld$EnterpriseProxy$.executar(Unknown Source)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest.criarVinculoDict(DirectoryRest.java:43)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest$Proxy$_$$_WeldClientProxy.criarVinculoDict(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:65)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:330)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:163)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:64)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:61)
	at org.jboss.as.ejb3.pool.AbstractPool.create(AbstractPool.java:56)
	at org.jboss.as.ejb3.pool.strictmax.StrictMaxPool.get(StrictMaxPool.java:124)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 174 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.notSupported(LifecycleCMTTxInterceptor.java:110)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:70)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	... 185 more
Caused by: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:37)
	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.<init>(KeystoreHolder.java:25)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.<init>(BaseHsmManager.java:39)
	at br.gov.caixa.mpi.dict.ejb.hsm.SignerManager.<init>(SignerManager.java:17)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.init(HsmCaixaEjb.java:44)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 198 more
Caused by: java.lang.RuntimeException: Missing configuration file.
	at br.com.trueaccess.provider.netdfence.NDSession.initializeSession(NDSession.java:63)
	at br.com.trueaccess.provider.netdfence.NDSession.<init>(NDSession.java:41)
	at br.com.trueaccess.provider.netdfence.KeyStore.SyncKeyStoreList(KeyStore.java:1025)
	at br.com.trueaccess.provider.netdfence.KeyStore.engineLoad(KeyStore.java:649)
	at java.security.KeyStore.load(KeyStore.java:1445)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:33)
	... 226 more

2026-07-14 17:40:03,810 ERROR [br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign] (default task-25) [CORRELATION-ID:58bdb59e-1ef7-404d-9eae-a97c592392b2][SIMPI-DICT] Erro RequestInterceptorFeign: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-07-14 17:40:03,810 ERROR [org.jboss.as.ejb3.invocation] (default task-25) [CORRELATION-ID:58bdb59e-1ef7-404d-9eae-a97c592392b2]WFLYEJB0034: EJB Invocation failed on component CriarVinculoDictFacade for method public br.gov.caixa.mpi.dict.api.dto.v2.ChaveDto br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(br.gov.caixa.mpi.dict.api.dto.v2.ChaveDto): javax.ejb.EJBException: br.gov.caixa.dict.comum.exceptions.DictException: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$$$view8.executar(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade$Proxy$_$$_Weld$EnterpriseProxy$.executar(Unknown Source)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest.criarVinculoDict(DirectoryRest.java:43)
	at br.gov.caixa.mpi.dict.rest.v2.DirectoryRest$Proxy$_$$_WeldClientProxy.criarVinculoDict(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:65)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1501)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:330)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: br.gov.caixa.dict.comum.exceptions.DictException: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:25)
	at feign.SynchronousMethodHandler.targetRequest(SynchronousMethodHandler.java:158)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:88)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy133.createEntry(Unknown Source)
	at br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacade.executar(CriarVinculoDictFacade.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	... 98 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:313)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:238)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$$$view11.assinarXml(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb$Proxy$_$$_Weld$EnterpriseProxy$.assinarXml(Unknown Source)
	at br.gov.caixa.mpi.dict.feign.RequestInterceptorFeign.apply(RequestInterceptorFeign.java:22)
	... 131 more
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:163)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:64)
	at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:61)
	at org.jboss.as.ejb3.pool.AbstractPool.create(AbstractPool.java:56)
	at org.jboss.as.ejb3.pool.strictmax.StrictMaxPool.get(StrictMaxPool.java:124)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 174 more
Caused by: javax.ejb.EJBException: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInNoTx(CMTTxInterceptor.java:214)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:266)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.notSupported(LifecycleCMTTxInterceptor.java:110)
	at org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:70)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:161)
	... 185 more
Caused by: java.lang.IllegalStateException: Falha ao carregar KeyStoreTACCON via HSM: Missing configuration file.
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:37)
	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.<init>(KeystoreHolder.java:25)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.<init>(BaseHsmManager.java:39)
	at br.gov.caixa.mpi.dict.ejb.hsm.SignerManager.<init>(SignerManager.java:17)
	at br.gov.caixa.mpi.dict.ejb.HsmCaixaEjb.init(HsmCaixaEjb.java:44)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:122)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:105)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264)
	... 198 more
Caused by: java.lang.RuntimeException: Missing configuration file.
	at br.com.trueaccess.provider.netdfence.NDSession.initializeSession(NDSession.java:63)
	at br.com.trueaccess.provider.netdfence.NDSession.<init>(NDSession.java:41)
	at br.com.trueaccess.provider.netdfence.KeyStore.SyncKeyStoreList(KeyStore.java:1025)
	at br.com.trueaccess.provider.netdfence.KeyStore.engineLoad(KeyStore.java:649)
	at java.security.KeyStore.load(KeyStore.java:1445)
	at br.gov.caixa.mpi.dict.ejb.hsm.BaseHsmManager.lambda$new$0(BaseHsmManager.java:33)
	... 226 more

2026-07-14 17:40:03,812 127.0.0.6 - - [14/Jul/2026:17:40:03 -0300] "POST /simpi-dict-war/api/v1/dict/entry/post/ HTTP/1.1" 500 508 "-" "okhttp/3.6.0" application/json "default task-25 -" 508 15
