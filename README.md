Ambiente TQS inativo
Evidências em ane

<img width="2559" height="1439" alt="imagem+(47)" src="https://github.com/user-attachments/assets/a18bebb2-241e-4b56-a96b-3c6cba7d51cb" />




Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/sinafweb_2-caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sinaf -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sinaf-web-tqs -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Dsun.reflect.inflationThreshold=0 -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br\|10.252.176.64

=========================================================================

2026-08-06 18:32:33.681 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m18:32:35,163 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
[0m[33m18:32:35,442 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m18:32:35,467 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m18:32:35,677 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0049: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) starting
[0m[0m18:32:35,776 INFO  [org.jboss.vfs] (MSC service thread 1-6) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m18:32:37,311 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m18:32:37,323 INFO  [org.wildfly.security] (ServerService Thread Pool -- 9) ELY00001: WildFly Elytron version 1.1.12.Final-redhat-00001
[0m[0m18:32:37,353 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 24) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m18:32:37,768 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 22) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/c7/becffba4527adb7978b0a8a5726611101af32f/content
[0m[0m18:32:37,786 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m18:32:37,795 INFO  [org.xnio] (MSC service thread 1-6) XNIO version 3.5.6.Final-redhat-00001
[0m[0m18:32:37,803 INFO  [org.xnio.nio] (MSC service thread 1-6) XNIO NIO Implementation Version 3.5.6.Final-redhat-00001
[0m[33m18:32:37,974 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 59) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m18:32:37,978 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 61) WFLYWS0002: Activating WebServices Extension
[0m[0m18:32:37,984 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 51) WFLYNAM0001: Activating Naming Subsystem
[0m[0m18:32:37,987 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 58) WFLYSEC0002: Activating Security Subsystem
[0m[0m18:32:38,053 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 43) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m18:32:38,056 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 44) WFLYRS0016: RESTEasy version 3.0.26.Final-redhat-1
[0m[0m18:32:38,058 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 49) WFLYJSF0007: Activated the following JSF Implementations: [main]
[0m[0m18:32:38,070 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 42) WFLYIO001: Worker 'default' has auto-configured to 64 core threads with 512 task threads based on your 32 available processors
[0m[0m18:32:38,071 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
[0m[0m18:32:38,077 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.12.Final-redhat-00001)
[0m[0m18:32:38,271 INFO  [org.jboss.as.naming] (MSC service thread 1-8) WFLYNAM0003: Starting Naming Service
[0m[0m18:32:38,276 INFO  [org.jboss.remoting] (MSC service thread 1-3) JBoss Remoting version 5.0.8.Final-redhat-1
[0m[0m18:32:38,280 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Bound mail session [java:jboss/mail/caixamail]
[0m[0m18:32:38,455 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 1.4.18.SP11-redhat-00001 starting
[0m[0m18:32:38,970 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
[0m[0m18:32:38,970 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
[0m[0m18:32:39,077 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 60) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m18:32:39,167 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
[0m[0m18:32:39,168 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
[0m[0m18:32:39,355 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m18:32:39,664 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
[0m[0m18:32:39,667 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m18:32:39,764 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m18:32:39,765 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[0m18:32:39,863 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0005: Deploying non-JDBC-compliant driver class com.sybase.jdbc4.jdbc.SybDriver (version 7.0)
[0m[0m18:32:39,865 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = sybase
[0m[0m18:32:39,954 INFO  [org.jboss.as.ejb3] (MSC service thread 1-6) WFLYEJB0493: EJB subsystem suspension complete
[0m[0m18:32:39,958 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.27)
[0m[0m18:32:39,959 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = DB2JDBCDriver
[0m[0m18:32:40,267 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 6.4)
[0m[0m18:32:40,267 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = sqlserver
[0m[0m18:32:40,371 INFO  [org.jboss.as.patching] (MSC service thread 1-8) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.1.6.CP, one-off patches include: eap-716-jbeap-16502
[0m[33m18:32:40,378 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-3) WFLYDM0111: Keystore /opt/jboss-eap-7.1/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m18:32:40,381 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
[0m[0m18:32:40,389 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "sinaf-web.ear" (runtime-name: "sinaf-web.ear")
[0m[0m18:32:40,460 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m18:32:40,469 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0098: Bound non-transactional data source: java:/jdbc/DB2SinafDS
[0m[0m18:32:40,771 INFO  [org.jboss.ws.common.management] (MSC service thread 1-6) JBWS022052: Starting JBossWS 5.1.11.Final-redhat-00001 (Apache CXF 3.1.16.redhat-2) 
[0m[33m18:32:44,558 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry toolbox.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,559 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bcmail-jdk14-138.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,559 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bcprov-jdk14-138.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,568 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry lib/ in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,568 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bcmail-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bcprov-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bctsp-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry brynet-api-1.0.7.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry gson-2.2.4.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry commons-lang-2.4.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry ehcache-2.8.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry slf4j-api-1.6.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-baseio-2.0.3.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-bc-reduzida-fw-1.2.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-cache-1.0.0.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-logger-1.0.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-se-base-cliente-ws-1.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-se-base-ws-uteis-1.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,569 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-se-carimbador-cliente-ws-1.2.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-se-gerenciador-politicas-cliente-ws-1.0.8.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-se-validador-certificado-cliente-ws-1.2.10.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-signer-base-2.0.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-signer-cms-2.0.2.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-signer-pdf-completo-2.0.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-x509-1.5.2.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-x509-repositorio-api-1.5.3.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-avancado-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-base-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-base-impl-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-cades-base-comuns-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-cades-wssoap-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-pades-base-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-assinador-pades-wssoap-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-base-comuns-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,570 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry cliente-servico-base-impl-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry comuns-excecoes-bundle-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-base-cliente-1.1.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-cades-cliente-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-cades-cliente-ws-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-pades-cliente-ws-1.1.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-xades-cliente-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry fw-assinador-xades-cliente-ws-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry bry-pdfbox-2.0.7.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry activation-1.1.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry javax.inject-1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jsr181-api-1.0-MR1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry javax.mail-1.5.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry validation-api-1.1.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry hibernate-jpa-2.1-api-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-annotations-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,571 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-batch-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-ejb-api_3.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-el-api_3.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-concurrency-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jsf-api_2.2_spec-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-interceptors-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-json-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-j2eemgmt-api_1.1_spec-1.0.1.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-connector-api_1.7_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-rmi-api_1.0_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jacc-api_1.5_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jaspi-api_1.1_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jms-api_2.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-servlet-api_3.1_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jsp-api_2.3_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jstl-api_1.2_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-transaction-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jaxrs-api-3.0.6.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,572 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-websocket-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,573 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jaxb-api_2.2_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,573 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-saaj-api_1.3_spec-1.0.3.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m18:32:44,573 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: Class Path entry jboss-jaxws-api_2.2_spec-2.0.2.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[0m18:32:44,586 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Starting subdeployment (runtime-name: "sinaf-ejb.jar")
[0m[0m18:32:44,586 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0207: Starting subdeployment (runtime-name: "sinaf3-web.war")
[0m[33m18:32:45,353 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0166: The @Clustered annotation is deprecated and will be ignored.
[0m[0m18:32:45,460 INFO  [org.jboss.as.jpa] (MSC service thread 1-8) WFLYJPA0002: Read persistence.xml for db2SinafDS
[0m[0m18:32:45,981 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 64) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sinaf-web.ear/sinaf-ejb.jar#db2SinafDS'
[0m[0m18:32:45,995 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processing weld deployment sinaf-web.ear
[0m[0m18:32:46,016 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 64) HHH000204: Processing PersistenceUnitInfo [
	name: db2SinafDS
	...]
[0m[0m18:32:46,127 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-6) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
[0m[0m18:32:46,158 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 64) HHH000412: Hibernate Core {5.1.17.Final-redhat-00002}
[0m[0m18:32:46,159 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 64) HHH000206: hibernate.properties not found
[0m[0m18:32:46,160 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 64) HHH000021: Bytecode provider name : javassist
[0m[0m18:32:46,193 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 64) HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
[0m[0m18:32:46,960 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-2) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.11.Final-redhat-1
[0m[0m18:32:47,366 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment sinaf3-web.war
[0m[0m18:32:47,367 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sinaf3-web.war
[0m[0m18:32:47,772 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processing weld deployment sinaf-ejb.jar
[0m[0m18:32:47,782 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DadosAbertosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:app/sinaf-ejb/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:module/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:global/sinaf-web/sinaf-ejb/DadosAbertosRepository
	java:app/sinaf-ejb/DadosAbertosRepository
	java:module/DadosAbertosRepository

[0m[0m18:32:47,782 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoPrazoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:app/sinaf-ejb/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:module/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:global/sinaf-web/sinaf-ejb/EventoProdutoPrazoRepository
	java:app/sinaf-ejb/EventoProdutoPrazoRepository
	java:module/EventoProdutoPrazoRepository

[0m[0m18:32:47,782 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:app/sinaf-ejb/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:module/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:global/sinaf-web/sinaf-ejb/UsuarioServiceImpl
	java:app/sinaf-ejb/UsuarioServiceImpl
	java:module/UsuarioServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoBatchRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:app/sinaf-ejb/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:module/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoBatchRepository
	java:app/sinaf-ejb/AcaoDocumentoBatchRepository
	java:module/AcaoDocumentoBatchRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:app/sinaf-ejb/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:module/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoServiceImpl
	java:app/sinaf-ejb/ArquivoDocumentoServiceImpl
	java:module/ArquivoDocumentoServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidRespProcessoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:app/sinaf-ejb/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:module/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidRespProcessoRepository
	java:app/sinaf-ejb/ParametroUnidRespProcessoRepository
	java:module/ParametroUnidRespProcessoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'CarteiraServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:app/sinaf-ejb/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:module/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:global/sinaf-web/sinaf-ejb/CarteiraServiceImpl
	java:app/sinaf-ejb/CarteiraServiceImpl
	java:module/CarteiraServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroInstControleEventoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:app/sinaf-ejb/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:module/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroInstControleEventoRepository
	java:app/sinaf-ejb/ParametroInstControleEventoRepository
	java:module/ParametroInstControleEventoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FuncionalidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:app/sinaf-ejb/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:module/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:global/sinaf-web/sinaf-ejb/FuncionalidadeRepository
	java:app/sinaf-ejb/FuncionalidadeRepository
	java:module/FuncionalidadeRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnexoDocumentoLancamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:app/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:module/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl
	java:app/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl
	java:module/AnexoDocumentoLancamentoServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AcaoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:app/sinaf-ejb/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:module/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorRepository
	java:app/sinaf-ejb/AcaoLancamentoGestorRepository
	java:module/AcaoLancamentoGestorRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoUnidadeAutorizadoraServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:app/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:module/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl
	java:app/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl
	java:module/ParametroServicoUnidadeAutorizadoraServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'CalendarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:app/sinaf-ejb/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:module/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:global/sinaf-web/sinaf-ejb/CalendarioRepository
	java:app/sinaf-ejb/CalendarioRepository
	java:module/CalendarioRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FleService' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:app/sinaf-ejb/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:module/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:global/sinaf-web/sinaf-ejb/FleService
	java:app/sinaf-ejb/FleService
	java:module/FleService

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'CalendarioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:app/sinaf-ejb/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:module/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:global/sinaf-web/sinaf-ejb/CalendarioServiceImpl
	java:app/sinaf-ejb/CalendarioServiceImpl
	java:module/CalendarioServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'TipoPerfilUsuarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:app/sinaf-ejb/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:module/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:global/sinaf-web/sinaf-ejb/TipoPerfilUsuarioRepository
	java:app/sinaf-ejb/TipoPerfilUsuarioRepository
	java:module/TipoPerfilUsuarioRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:app/sinaf-ejb/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:module/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoRepository
	java:app/sinaf-ejb/DocumentoLancamentoRepository
	java:module/DocumentoLancamentoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RoteiroRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:app/sinaf-ejb/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:module/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:global/sinaf-web/sinaf-ejb/RoteiroRepository
	java:app/sinaf-ejb/RoteiroRepository
	java:module/RoteiroRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RotinaBatchServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:app/sinaf-ejb/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:module/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:global/sinaf-web/sinaf-ejb/RotinaBatchServiceImpl
	java:app/sinaf-ejb/RotinaBatchServiceImpl
	java:module/RotinaBatchServiceImpl

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:app/sinaf-ejb/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:module/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:global/sinaf-web/sinaf-ejb/ExpurgoRepository
	java:app/sinaf-ejb/ExpurgoRepository
	java:module/ExpurgoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnaliticoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:app/sinaf-ejb/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:module/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:global/sinaf-web/sinaf-ejb/AnaliticoRepository
	java:app/sinaf-ejb/AnaliticoRepository
	java:module/AnaliticoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoLinhaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLinhaRepository!br.gov.caixa.bsb.sinaf.data.query.DocumentoLancamentoLinhaRepository
	java:app/sinaf-ejb/DocumentoLancamentoLinhaRepository!br.gov.caixa.bsb.sinaf.data.query.DocumentoLancamentoLinhaRepository
	java:module/DocumentoLancamentoLinhaRepository!br.gov.caixa.bsb.sinaf.data.query.DocumentoLancamentoLinhaRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLinhaRepository
	java:app/sinaf-ejb/DocumentoLancamentoLinhaRepository
	java:module/DocumentoLancamentoLinhaRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnexoDocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:app/sinaf-ejb/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:module/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoRepository
	java:app/sinaf-ejb/AnexoDocumentoLancamentoRepository
	java:module/AnexoDocumentoLancamentoRepository

[0m[0m18:32:47,783 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:app/sinaf-ejb/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:module/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoRepository
	java:app/sinaf-ejb/ArquivoDocumentoRepository
	java:module/ArquivoDocumentoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ObjetoCusteioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:app/sinaf-ejb/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:module/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioRepository
	java:app/sinaf-ejb/ObjetoCusteioRepository
	java:module/ObjetoCusteioRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioNAVRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:app/sinaf-ejb/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:module/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioNAVRepository
	java:app/sinaf-ejb/UsuarioNAVRepository
	java:module/UsuarioNAVRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'CargaAutomaticaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:app/sinaf-ejb/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:module/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:global/sinaf-web/sinaf-ejb/CargaAutomaticaServiceImpl
	java:app/sinaf-ejb/CargaAutomaticaServiceImpl
	java:module/CargaAutomaticaServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EntidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:app/sinaf-ejb/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:module/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:global/sinaf-web/sinaf-ejb/EntidadeRepository
	java:app/sinaf-ejb/EntidadeRepository
	java:module/EntidadeRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:app/sinaf-ejb/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:module/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoServiceImpl
	java:app/sinaf-ejb/ParametroServicoServiceImpl
	java:module/ParametroServicoServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AssinaturaDigitalServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:app/sinaf-ejb/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:module/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:global/sinaf-web/sinaf-ejb/AssinaturaDigitalServiceImpl
	java:app/sinaf-ejb/AssinaturaDigitalServiceImpl
	java:module/AssinaturaDigitalServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'MensagemEmailServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:app/sinaf-ejb/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:module/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:global/sinaf-web/sinaf-ejb/MensagemEmailServiceImpl
	java:app/sinaf-ejb/MensagemEmailServiceImpl
	java:module/MensagemEmailServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:app/sinaf-ejb/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:module/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoRepository
	java:app/sinaf-ejb/AcaoDocumentoRepository
	java:module/AcaoDocumentoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'LancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:app/sinaf-ejb/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:module/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/LancamentoGestorServiceImpl
	java:app/sinaf-ejb/LancamentoGestorServiceImpl
	java:module/LancamentoGestorServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnexoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:app/sinaf-ejb/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:module/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorRepository
	java:app/sinaf-ejb/AnexoLancamentoGestorRepository
	java:module/AnexoLancamentoGestorRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoControleFechamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:app/sinaf-ejb/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:module/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoRepository
	java:app/sinaf-ejb/ParametroServicoControleFechamentoRepository
	java:module/ParametroServicoControleFechamentoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:app/sinaf-ejb/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:module/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioRepository
	java:app/sinaf-ejb/UsuarioRepository
	java:module/UsuarioRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RegistroConselhoContabilidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:app/sinaf-ejb/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:module/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:global/sinaf-web/sinaf-ejb/RegistroConselhoContabilidadeRepository
	java:app/sinaf-ejb/RegistroConselhoContabilidadeRepository
	java:module/RegistroConselhoContabilidadeRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:app/sinaf-ejb/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:module/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:global/sinaf-web/sinaf-ejb/ExpurgoServiceImpl
	java:app/sinaf-ejb/ExpurgoServiceImpl
	java:module/ExpurgoServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnaliticoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:app/sinaf-ejb/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:module/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:global/sinaf-web/sinaf-ejb/AnaliticoServiceImpl
	java:app/sinaf-ejb/AnaliticoServiceImpl
	java:module/AnaliticoServiceImpl

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioListaProprietarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:app/sinaf-ejb/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:module/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioListaProprietarioRepository
	java:app/sinaf-ejb/UsuarioListaProprietarioRepository
	java:module/UsuarioListaProprietarioRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EventoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:app/sinaf-ejb/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:module/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:global/sinaf-web/sinaf-ejb/EventoRepository
	java:app/sinaf-ejb/EventoRepository
	java:module/EventoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:app/sinaf-ejb/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:module/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalProdutoRepository
	java:app/sinaf-ejb/FatoOperacionalProdutoRepository
	java:module/FatoOperacionalProdutoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:app/sinaf-ejb/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:module/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalRepository
	java:app/sinaf-ejb/FatoOperacionalRepository
	java:module/FatoOperacionalRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidadeElaboracaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:module/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoRepository
	java:module/ParametroUnidadeElaboracaoRepository

[0m[0m18:32:47,784 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ObjetoCusteioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:app/sinaf-ejb/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:module/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioServiceImpl
	java:app/sinaf-ejb/ObjetoCusteioServiceImpl
	java:module/ObjetoCusteioServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FechamentoMesServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:app/sinaf-ejb/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:module/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:global/sinaf-web/sinaf-ejb/FechamentoMesServiceImpl
	java:app/sinaf-ejb/FechamentoMesServiceImpl
	java:module/FechamentoMesServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:app/sinaf-ejb/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:module/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:global/sinaf-web/sinaf-ejb/UnidadeRepository
	java:app/sinaf-ejb/UnidadeRepository
	java:module/UnidadeRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'InformacaoSistemaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:app/sinaf-ejb/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:module/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaServiceImpl
	java:app/sinaf-ejb/InformacaoSistemaServiceImpl
	java:module/InformacaoSistemaServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ListaProprietarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:app/sinaf-ejb/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:module/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:global/sinaf-web/sinaf-ejb/ListaProprietarioRepository
	java:app/sinaf-ejb/ListaProprietarioRepository
	java:module/ListaProprietarioRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoBatchRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:app/sinaf-ejb/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:module/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoBatchRepository
	java:app/sinaf-ejb/DocumentoLancamentoBatchRepository
	java:module/DocumentoLancamentoBatchRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:app/sinaf-ejb/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:module/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:global/sinaf-web/sinaf-ejb/ProdutoRepository
	java:app/sinaf-ejb/ProdutoRepository
	java:module/ProdutoRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AcaoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:app/sinaf-ejb/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:module/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/AcaoLancamentoGestorServiceImpl
	java:module/AcaoLancamentoGestorServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DadosProcessamentoLoteBean' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:app/sinaf-ejb/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:module/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:global/sinaf-web/sinaf-ejb/DadosProcessamentoLoteBean
	java:app/sinaf-ejb/DadosProcessamentoLoteBean
	java:module/DadosProcessamentoLoteBean

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoDataLimiteParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:app/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:module/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository
	java:app/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository
	java:module/HistoricoDataLimiteParametroServicoRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:app/sinaf-ejb/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:module/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalServiceImpl
	java:app/sinaf-ejb/FatoOperacionalServiceImpl
	java:module/FatoOperacionalServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoFatoOperacionalRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:app/sinaf-ejb/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:module/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:global/sinaf-web/sinaf-ejb/ParametrizacaoFatoOperacionalRepository
	java:app/sinaf-ejb/ParametrizacaoFatoOperacionalRepository
	java:module/ParametrizacaoFatoOperacionalRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoLayoutParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:app/sinaf-ejb/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:module/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoLayoutParametroServicoRepository
	java:app/sinaf-ejb/ArquivoLayoutParametroServicoRepository
	java:module/ArquivoLayoutParametroServicoRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:app/sinaf-ejb/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:module/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoServiceImpl
	java:app/sinaf-ejb/AcaoDocumentoServiceImpl
	java:module/AcaoDocumentoServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ValidadorSegurancaToken' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:app/sinaf-ejb/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:module/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:global/sinaf-web/sinaf-ejb/ValidadorSegurancaToken
	java:app/sinaf-ejb/ValidadorSegurancaToken
	java:module/ValidadorSegurancaToken

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidadeElaboracaoPreviaEspecialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:module/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:module/ParametroUnidadeElaboracaoPreviaEspecialRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PeriodoResponsabilidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:app/sinaf-ejb/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:module/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeRepository
	java:app/sinaf-ejb/PeriodoResponsabilidadeRepository
	java:module/PeriodoResponsabilidadeRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EmailUnidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:app/sinaf-ejb/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:module/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:global/sinaf-web/sinaf-ejb/EmailUnidadeRepository
	java:app/sinaf-ejb/EmailUnidadeRepository
	java:module/EmailUnidadeRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoControleFechamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:app/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:module/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl
	java:app/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl
	java:module/ParametroServicoControleFechamentoServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ComunicacaoEletronicaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:app/sinaf-ejb/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:module/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:global/sinaf-web/sinaf-ejb/ComunicacaoEletronicaRepository
	java:app/sinaf-ejb/ComunicacaoEletronicaRepository
	java:module/ComunicacaoEletronicaRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'SIECMServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:app/sinaf-ejb/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:module/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:global/sinaf-web/sinaf-ejb/SIECMServiceImpl
	java:app/sinaf-ejb/SIECMServiceImpl
	java:module/SIECMServiceImpl

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDadosAbertosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:app/sinaf-ejb/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:module/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDadosAbertosRepository
	java:app/sinaf-ejb/AutorizacaoDadosAbertosRepository
	java:module/AutorizacaoDadosAbertosRepository

[0m[0m18:32:47,785 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoAuditoriaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:app/sinaf-ejb/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:module/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaRepository
	java:app/sinaf-ejb/ParametroServicoAuditoriaRepository
	java:module/ParametroServicoAuditoriaRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoLoteRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:app/sinaf-ejb/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:module/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLoteRepository
	java:app/sinaf-ejb/DocumentoLancamentoLoteRepository
	java:module/DocumentoLancamentoLoteRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroPreencherServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:app/sinaf-ejb/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:module/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroPreencherServicoRepository
	java:app/sinaf-ejb/ParametroPreencherServicoRepository
	java:module/ParametroPreencherServicoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoImportadoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:app/sinaf-ejb/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:module/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoRepository
	java:app/sinaf-ejb/ArquivoImportadoRepository
	java:module/ArquivoImportadoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:app/sinaf-ejb/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:module/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorRepository
	java:app/sinaf-ejb/DocumentoLancamentoGestorRepository
	java:module/DocumentoLancamentoGestorRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EstadoDocumentoContabilRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:app/sinaf-ejb/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:module/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:global/sinaf-web/sinaf-ejb/EstadoDocumentoContabilRepository
	java:app/sinaf-ejb/EstadoDocumentoContabilRepository
	java:module/EstadoDocumentoContabilRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'MensagemTelaInicialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:app/sinaf-ejb/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:module/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:global/sinaf-web/sinaf-ejb/MensagemTelaInicialRepository
	java:app/sinaf-ejb/MensagemTelaInicialRepository
	java:module/MensagemTelaInicialRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:app/sinaf-ejb/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:module/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoServiceImpl
	java:app/sinaf-ejb/AutorizacaoDocumentoServiceImpl
	java:module/AutorizacaoDocumentoServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ProcessoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:app/sinaf-ejb/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:module/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:global/sinaf-web/sinaf-ejb/ProcessoServiceImpl
	java:app/sinaf-ejb/ProcessoServiceImpl
	java:module/ProcessoServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:app/sinaf-ejb/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:module/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:global/sinaf-web/sinaf-ejb/EventoProdutoRepository
	java:app/sinaf-ejb/EventoProdutoRepository
	java:module/EventoProdutoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:app/sinaf-ejb/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:module/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/DocumentoLancamentoGestorServiceImpl
	java:module/DocumentoLancamentoGestorServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ProcessoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:app/sinaf-ejb/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:module/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:global/sinaf-web/sinaf-ejb/ProcessoRepository
	java:app/sinaf-ejb/ProcessoRepository
	java:module/ProcessoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:app/sinaf-ejb/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:module/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:global/sinaf-web/sinaf-ejb/EventoProdutoServiceImpl
	java:app/sinaf-ejb/EventoProdutoServiceImpl
	java:module/EventoProdutoServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroOrigemLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:app/sinaf-ejb/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:module/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroOrigemLancamentoRepository
	java:app/sinaf-ejb/ParametroOrigemLancamentoRepository
	java:module/ParametroOrigemLancamentoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PermissaoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:app/sinaf-ejb/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:module/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:global/sinaf-web/sinaf-ejb/PermissaoServiceImpl
	java:app/sinaf-ejb/PermissaoServiceImpl
	java:module/PermissaoServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'SaldoCtbAutorizacaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:app/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:module/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository
	java:app/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository
	java:module/SaldoCtbAutorizacaoDocumentoRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'TipoUnidadeResponsavelRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:app/sinaf-ejb/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:module/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:global/sinaf-web/sinaf-ejb/TipoUnidadeResponsavelRepository
	java:app/sinaf-ejb/TipoUnidadeResponsavelRepository
	java:module/TipoUnidadeResponsavelRepository

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PeriodoResponsabilidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:app/sinaf-ejb/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:module/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeServiceImpl
	java:app/sinaf-ejb/PeriodoResponsabilidadeServiceImpl
	java:module/PeriodoResponsabilidadeServiceImpl

[0m[0m18:32:47,786 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:app/sinaf-ejb/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:module/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:global/sinaf-web/sinaf-ejb/ProdutoServiceImpl
	java:app/sinaf-ejb/ProdutoServiceImpl
	java:module/ProdutoServiceImpl

[0m[0m18:32:47,850 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'CarteiraRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:app/sinaf-ejb/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:module/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:global/sinaf-web/sinaf-ejb/CarteiraRepository
	java:app/sinaf-ejb/CarteiraRepository
	java:module/CarteiraRepository

[0m[0m18:32:47,850 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EventoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:app/sinaf-ejb/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:module/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:global/sinaf-web/sinaf-ejb/EventoServiceImpl
	java:app/sinaf-ejb/EventoServiceImpl
	java:module/EventoServiceImpl

[0m[0m18:32:47,850 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PublicKeysStorage' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:app/sinaf-ejb/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:module/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:global/sinaf-web/sinaf-ejb/PublicKeysStorage
	java:app/sinaf-ejb/PublicKeysStorage
	java:module/PublicKeysStorage

[0m[0m18:32:47,850 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:app/sinaf-ejb/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:module/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:global/sinaf-web/sinaf-ejb/UnidadeServiceImpl
	java:app/sinaf-ejb/UnidadeServiceImpl
	java:module/UnidadeServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'LancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:app/sinaf-ejb/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:module/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/LancamentoGestorRepository
	java:app/sinaf-ejb/LancamentoGestorRepository
	java:module/LancamentoGestorRepository

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RotinaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:app/sinaf-ejb/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:module/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:global/sinaf-web/sinaf-ejb/RotinaRepository
	java:app/sinaf-ejb/RotinaRepository
	java:module/RotinaRepository

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:app/sinaf-ejb/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:module/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoServiceImpl
	java:app/sinaf-ejb/DocumentoLancamentoServiceImpl
	java:module/DocumentoLancamentoServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:app/sinaf-ejb/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:module/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:global/sinaf-web/sinaf-ejb/RelatoriosServiceImpl
	java:app/sinaf-ejb/RelatoriosServiceImpl
	java:module/RelatoriosServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AnexoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:app/sinaf-ejb/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:module/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/AnexoLancamentoGestorServiceImpl
	java:module/AnexoLancamentoGestorServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'EntidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:app/sinaf-ejb/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:module/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:global/sinaf-web/sinaf-ejb/EntidadeServiceImpl
	java:app/sinaf-ejb/EntidadeServiceImpl
	java:module/EntidadeServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DadosAbertosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:app/sinaf-ejb/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:module/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:global/sinaf-web/sinaf-ejb/DadosAbertosServiceImpl
	java:app/sinaf-ejb/DadosAbertosServiceImpl
	java:module/DadosAbertosServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDocumentoContabilRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:app/sinaf-ejb/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:module/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoContabilRepository
	java:app/sinaf-ejb/AutorizacaoDocumentoContabilRepository
	java:module/AutorizacaoDocumentoContabilRepository

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoImportadoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:app/sinaf-ejb/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:module/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoServiceImpl
	java:app/sinaf-ejb/ArquivoImportadoServiceImpl
	java:module/ArquivoImportadoServiceImpl

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'FechamentoMesRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:app/sinaf-ejb/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:module/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:global/sinaf-web/sinaf-ejb/FechamentoMesRepository
	java:app/sinaf-ejb/FechamentoMesRepository
	java:module/FechamentoMesRepository

[0m[0m18:32:47,856 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'DisparoAutomaticoMessageriaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:app/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:module/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:global/sinaf-web/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl
	java:app/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl
	java:module/DisparoAutomaticoMessageriaServiceImpl

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:app/sinaf-ejb/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:module/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:global/sinaf-web/sinaf-ejb/RelatoriosRepository
	java:app/sinaf-ejb/RelatoriosRepository
	java:module/RelatoriosRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoAuditoriaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:app/sinaf-ejb/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:module/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaServiceImpl
	java:app/sinaf-ejb/ParametroServicoAuditoriaServiceImpl
	java:module/ParametroServicoAuditoriaServiceImpl

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ProcessamentoPreviaEspecialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:app/sinaf-ejb/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:module/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:global/sinaf-web/sinaf-ejb/ProcessamentoPreviaEspecialRepository
	java:app/sinaf-ejb/ProcessamentoPreviaEspecialRepository
	java:module/ProcessamentoPreviaEspecialRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeResponsavelAutorizacaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:module/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:global/sinaf-web/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository
	java:module/UnidadeResponsavelAutorizacaoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroRotinaUnidadeElaboracaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:module/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository
	java:module/ParametroRotinaUnidadeElaboracaoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:app/sinaf-ejb/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:module/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoRepository
	java:app/sinaf-ejb/ParametroServicoRepository
	java:module/ParametroServicoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroProcessoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:app/sinaf-ejb/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:module/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroProcessoDocumentoRepository
	java:app/sinaf-ejb/ParametroProcessoDocumentoRepository
	java:module/ParametroProcessoDocumentoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'InformacaoSistemaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:app/sinaf-ejb/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:module/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaRepository
	java:app/sinaf-ejb/InformacaoSistemaRepository
	java:module/InformacaoSistemaRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RoteiroServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:app/sinaf-ejb/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:module/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:global/sinaf-web/sinaf-ejb/RoteiroServiceImpl
	java:app/sinaf-ejb/RoteiroServiceImpl
	java:module/RoteiroServiceImpl

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'LedServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:app/sinaf-ejb/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:module/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:global/sinaf-web/sinaf-ejb/LedServiceImpl
	java:app/sinaf-ejb/LedServiceImpl
	java:module/LedServiceImpl

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoContainer' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:app/sinaf-ejb/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:module/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:global/sinaf-web/sinaf-ejb/ArquivoContainer
	java:app/sinaf-ejb/ArquivoContainer
	java:module/ArquivoContainer

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'TipoAcaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:app/sinaf-ejb/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:module/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/TipoAcaoDocumentoRepository
	java:app/sinaf-ejb/TipoAcaoDocumentoRepository
	java:module/TipoAcaoDocumentoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'RotinaSistemaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:app/sinaf-ejb/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:module/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:global/sinaf-web/sinaf-ejb/RotinaSistemaServiceImpl
	java:app/sinaf-ejb/RotinaSistemaServiceImpl
	java:module/RotinaSistemaServiceImpl

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametroRegimeAlcadaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:app/sinaf-ejb/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:module/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:global/sinaf-web/sinaf-ejb/ParametroRegimeAlcadaRepository
	java:app/sinaf-ejb/ParametroRegimeAlcadaRepository
	java:module/ParametroRegimeAlcadaRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PesquisaDocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:app/sinaf-ejb/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:module/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/PesquisaDocumentoLancamentoRepository
	java:app/sinaf-ejb/PesquisaDocumentoLancamentoRepository
	java:module/PesquisaDocumentoLancamentoRepository

[0m[0m18:32:47,857 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'GrupoResponsavelAutorizacaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:module/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:global/sinaf-web/sinaf-ejb/GrupoResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/GrupoResponsavelAutorizacaoRepository
	java:module/GrupoResponsavelAutorizacaoRepository

[0m[0m18:32:47,858 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'historicoDataLimiteParametroServicoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:app/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:module/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:global/sinaf-web/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl
	java:app/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl
	java:module/historicoDataLimiteParametroServicoServiceImpl

[0m[0m18:32:47,858 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'ParametrosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:app/sinaf-ejb/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:module/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:global/sinaf-web/sinaf-ejb/ParametrosServiceImpl
	java:app/sinaf-ejb/ParametrosServiceImpl
	java:module/ParametrosServiceImpl

[0m[0m18:32:47,858 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'LedRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:app/sinaf-ejb/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:module/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:global/sinaf-web/sinaf-ejb/LedRepository
	java:app/sinaf-ejb/LedRepository
	java:module/LedRepository

[0m[0m18:32:48,055 INFO  [org.jboss.weld.Version] (MSC service thread 1-4) WELD-000900: 2.4.7 (redhat)
[0m[0m18:32:48,158 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started client-mappings cache from ejb container
[0m[0m18:32:49,354 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0002: Started default-server cache from web container
[0m[0m18:32:49,363 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started sinaf-web.ear.sinaf3-web.war cache from web container
[0m[0m18:32:50,459 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 65) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sinaf-web.ear/sinaf-ejb.jar#db2SinafDS'
[0m[0m18:32:51,860 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 65) HHH000400: Using dialect: br.gov.caixa.bsb.sinaf.dialect.DB2400FixedDialect
[0m[0m18:32:51,965 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 65) Envers integration enabled? : true
[0m[33m18:32:53,066 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 65) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sinaf.model.ParametroGeralDocumentoProdutoPK
[0m[33m18:32:53,066 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 65) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sinaf.model.ParametroGeralDocumentoProdutoPK
[0m[33m18:32:53,069 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 65) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sinaf.model.ParametroServicoUnidadeAutorizadoraPK
[0m[33m18:32:53,069 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 65) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sinaf.model.ParametroServicoUnidadeAutorizadoraPK
[0m[0m18:32:53,780 INFO  [org.hibernate.tuple.PojoInstantiator] (ServerService Thread Pool -- 65) HHH000182: No default (no-argument) constructor for class: br.gov.caixa.bsb.sinaf.model.TipoMensagemErroDocumento (class must be instantiated by Interceptor)
[0m[0m18:32:54,362 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 65) HHH000397: Using ASTQueryTranslatorFactory
[0m[33m18:32:54,655 WARN  [org.hibernate.dialect.function.TemplateRenderer] (ServerService Thread Pool -- 65) HHH000174: Function template anticipated 4 arguments, but 1 arguments encountered
[0m[33m18:32:54,697 WARN  [org.hibernate.dialect.function.TemplateRenderer] (ServerService Thread Pool -- 65) HHH000174: Function template anticipated 4 arguments, but 1 arguments encountered
[0m[0m18:32:59,985 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Iniciando servi?o de carga autom?tica de registros.
[0m[0m18:32:59,986 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> endpoint: https://sifwc.tqs.coredf.caixa
[0m[0m18:33:00,060 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> trustStore: /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
[0m[0m18:33:00,060 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> trustStorePassword: changeit
[0m[0m18:33:00,060 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> keyStore: /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
[0m[0m18:33:00,060 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> keyStorePassword: changeit
[0m[0m18:33:00,060 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB502_ESTADO_DCMTO_CONTABIL.
[0m[0m18:33:00,383 INFO  [io.undertow.websockets.jsr] (ServerService Thread Pool -- 129) UT026003: Adding annotated server endpoint class br.gov.caixa.bsb.sinaf.util.NotificacaoProcessamentoWS for path /WebSocketEndPoint/{nuMatricula}
[0m[0m18:33:00,606 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB507_TIPO_UNDDE_RSPNL.
[0m[0m18:33:00,683 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB513_TIPO_ACAO_DCMTO_CNTBL.
[0m[0m18:33:00,688 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 129) Initializing Mojarra 2.2.13.SP6  for context '/sinaf3-web'
[0m[0m18:33:01,464 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Atualizando nome do tipo de a??o 59 - De "Autorizar Lan?amento Gestor" para "Autorizar Lan?amento Gestor "
[0m[0m18:33:01,476 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB517_TIPO_PERFIL_USUARIO.
[0m[0m18:33:01,663 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB519_TPO_GRUPO_RSPNL_ATRZO.
[0m[0m18:33:01,679 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB527_INFORMACAO_SISTEMA.
[0m[0m18:33:01,962 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB530_PRCNO_PREVIA_ESPECIAL.
[0m[0m18:33:02,157 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Verificando tabela NAFTB552_FUNCIONALIDADE.
[0m[0m18:33:02,254 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Desligando log apache PDFBox: org.apache.pdfbox
[0m[0m18:33:02,254 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 93) -> Atualizando chave publica
[0m[31m18:33:02,670 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 93) WFLYEJB0034: EJB Invocation failed on component ValidadorSegurancaToken for method public void br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.atualizarPublicKeys(): javax.ejb.EJBTransactionRolledbackException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleInCallerTx(CMTTxInterceptor.java:160)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:257)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:334)
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
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken$$$view59.atualizarPublicKeys(Unknown Source)
	at br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl.atualizarChavePublica(CargaAutomaticaServiceImpl.java:730)
	at br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl.inicializar(CargaAutomaticaServiceImpl.java:141)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:78)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:125)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.ManagedReferenceFieldInjectionInterceptorFactory$ManagedReferenceFieldInjectionInterceptor.processInvocation(ManagedReferenceFieldInjectionInterceptorFactory.java:107)
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
Caused by: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.requestPublicKeyByIssuer(ValidadorSegurancaToken.java:198)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.atualizarPublicKeys(ValidadorSegurancaToken.java:178)
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
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
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
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:255)
	... 88 more

[0m[31m18:33:02,677 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 93) MSC000001: Failed to start service jboss.deployment.subunit."sinaf-web.ear"."sinaf-ejb.jar".component.CargaAutomaticaServiceImpl.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sinaf-web.ear"."sinaf-ejb.jar".component.CargaAutomaticaServiceImpl.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
	at org.jboss.threads.JBossThread.run(JBossThread.java:320)
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:163)
	at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:134)
	at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:124)
	at org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:138)
	at org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
	... 6 more
Caused by: javax.ejb.EJBTransactionRolledbackException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleInCallerTx(CMTTxInterceptor.java:160)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:257)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:334)
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
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken$$$view59.atualizarPublicKeys(Unknown Source)
	at br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl.atualizarChavePublica(CargaAutomaticaServiceImpl.java:730)
	at br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl.inicializar(CargaAutomaticaServiceImpl.java:141)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:78)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:125)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:111)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.component.ManagedReferenceFieldInjectionInterceptorFactory$ManagedReferenceFieldInjectionInterceptor.processInvocation(ManagedReferenceFieldInjectionInterceptorFactory.java:107)
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
	... 11 more
Caused by: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.requestPublicKeyByIssuer(ValidadorSegurancaToken.java:198)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.atualizarPublicKeys(ValidadorSegurancaToken.java:178)
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
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
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
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:255)
	... 88 more

[0m[33m18:33:03,004 WARN  [io.undertow.servlet] (ServerService Thread Pool -- 129) UT015020: Path /rs/* is secured for some HTTP methods, however it is not secured for [TRACE, HEAD, DELETE, CONNECT]
[0m[0m18:33:03,968 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 129) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.bsb.sinaf.rest.ApplicationConfig$Proxy$_$$_WeldClientProxy
[0m[33m18:33:04,062 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 129) RESTEASY002155: Provider class org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider is already registered.  2nd registration is being ignored.
[0m[33m18:33:04,073 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 129) RESTEASY002155: Provider class io.swagger.jaxrs.listing.SwaggerSerializers is already registered.  2nd registration is being ignored.
[0m[0m18:33:04,401 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 129) WFLYUT0021: Registered web context: '/sinaf3-web' for server 'default-server'
[0m[31m18:33:04,464 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sinaf-web.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.deployment.subunit.\"sinaf-web.ear\".\"sinaf-ejb.jar\".component.CargaAutomaticaServiceImpl.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: javax.ejb.EJBTransactionRolledbackException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML 2.0//EN\">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

    Caused by: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML 2.0//EN\">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>
"}}
[0m[0m18:33:04,471 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 38) WFLYSRV0010: Deployed "sinaf-web.ear" (runtime-name : "sinaf-web.ear")
[0m[0m18:33:04,483 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0186:   Services which failed to start:      service jboss.deployment.subunit."sinaf-web.ear"."sinaf-ejb.jar".component.CargaAutomaticaServiceImpl.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance

[0m[0m18:33:04,584 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m18:33:04,587 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
[0m[0m18:33:04,588 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
[0m[31m18:33:04,588 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) started (with errors) in 30124ms - Started 4640 of 4842 services (4 services failed or missing dependencies, 365 services are lazy, passive or on-demand)
[0m[0m18:37:33,747 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 18:37:33.747 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m18:42:33,817 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 18:42:33.817 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m18:47:33,890 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 18:47:33.890 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m18:52:34,034 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 18:52:34.034 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m18:57:34,093 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 18:57:34.093 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:02:34,157 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:02:34.157 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:07:34,218 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:07:34.218 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:12:34,278 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:12:34.278 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:17:34,341 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:17:34.341 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:22:34,399 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:22:34.399 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:27:34,465 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:27:34.465 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:32:34,527 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:32:34.527 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:37:34,610 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:37:34.610 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:42:34,668 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:42:34.668 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:47:34,726 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:47:34.726 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:52:34,794 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:52:34.794 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m19:57:34,853 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 19:57:34.853 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:02:34,915 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:02:34.915 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:07:34,976 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:07:34.976 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:12:35,034 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:12:35.034 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:17:35,093 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:17:35.093 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:22:35,150 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:22:35.150 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:27:35,214 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:27:35.214 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:32:35,277 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:32:35.277 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:37:35,343 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:37:35.342 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:42:35,402 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:42:35.402 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:47:35,461 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:47:35.461 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:52:35,524 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:52:35.524 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m20:57:35,577 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 20:57:35.577 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:02:35,715 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:02:35.715 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:07:35,776 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:07:35.775 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:12:35,836 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:12:35.836 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:17:35,896 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:17:35.896 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:22:35,958 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:22:35.957 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:27:36,015 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:27:36.015 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:32:36,072 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:32:36.072 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:37:36,130 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:37:36.130 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:42:36,189 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:42:36.189 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:47:36,252 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:47:36.252 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:52:36,314 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:52:36.314 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m21:57:36,374 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 21:57:36.374 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:02:36,440 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:02:36.440 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:07:36,507 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:07:36.507 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:12:36,573 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:12:36.573 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:17:36,628 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:17:36.627 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:22:36,689 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:22:36.689 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:27:36,752 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:27:36.752 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:32:36,818 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:32:36.818 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:37:36,871 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:37:36.871 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:42:36,944 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:42:36.944 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:47:37,000 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:47:37.000 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:52:37,059 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:52:37.059 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m22:57:37,124 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 22:57:37.123 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:02:37,194 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:02:37.194 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:07:37,262 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:07:37.262 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:12:37,322 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:12:37.321 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:17:37,379 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:17:37.378 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:22:37,448 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:22:37.448 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:27:37,520 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:27:37.520 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:32:37,580 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:32:37.580 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:37:37,641 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:37:37.641 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:42:37,703 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:42:37.703 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:47:37,764 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:47:37.764 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:52:37,823 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:52:37.823 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m23:57:37,889 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-06 23:57:37.889 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:00:00,008 INFO  [br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken] (EJB default - 1) -> Atualizando storage de chaves publicas.
[0m[31m00:00:00,071 ERROR [org.jboss.as.ejb3.timer] (EJB default - 1) WFLYEJB0020: Error invoking timeout for timer: [id=d9356961-70a9-450a-bc1a-c2c8c3460092 timedObjectId=sinaf-web.sinaf-ejb.ValidadorSegurancaToken auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@6f67cc27 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Sat Aug 08 00:00:00 BRT 2026 timerState=IN_TIMEOUT info=null]: javax.ejb.EJBException: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.TimerCMTTxInterceptor.handleExceptionInOurTx(TimerCMTTxInterceptor.java:53)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
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
	at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:99)
	at org.jboss.as.ejb3.timerservice.CalendarTimerTask.invokeBeanMethod(CalendarTimerTask.java:64)
	at org.jboss.as.ejb3.timerservice.CalendarTimerTask.callTimeout(CalendarTimerTask.java:53)
	at org.jboss.as.ejb3.timerservice.TimerTask.run(TimerTask.java:160)
	at org.jboss.as.ejb3.timerservice.TimerServiceImpl$Task$1.run(TimerServiceImpl.java:1220)
	at org.wildfly.extension.requestcontroller.RequestController$QueuedTask$1.run(RequestController.java:497)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
	at org.jboss.threads.JBossThread.run(JBossThread.java:320)
Caused by: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.requestPublicKeyByIssuer(ValidadorSegurancaToken.java:198)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.atualizarPublicKeys(ValidadorSegurancaToken.java:178)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.scheduleUpdatePublicKey(ValidadorSegurancaToken.java:168)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:103)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
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
	... 32 more

[0m[0m00:00:00,072 INFO  [org.jboss.as.ejb3.timer] (EJB default - 1) WFLYEJB0021: Timer: [id=d9356961-70a9-450a-bc1a-c2c8c3460092 timedObjectId=sinaf-web.sinaf-ejb.ValidadorSegurancaToken auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@6f67cc27 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Sat Aug 08 00:00:00 BRT 2026 timerState=IN_TIMEOUT info=null] will be retried
[0m[0m00:00:00,072 INFO  [org.jboss.as.ejb3.timer] (EJB default - 1) WFLYEJB0023: Retrying timeout for timer: [id=d9356961-70a9-450a-bc1a-c2c8c3460092 timedObjectId=sinaf-web.sinaf-ejb.ValidadorSegurancaToken auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@6f67cc27 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Sat Aug 08 00:00:00 BRT 2026 timerState=IN_TIMEOUT info=null]
[0m[0m00:00:00,076 INFO  [br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken] (EJB default - 1) -> Atualizando storage de chaves publicas.
[0m[31m00:00:00,122 ERROR [org.jboss.as.ejb3.timer] (EJB default - 1) WFLYEJB0022: Error during retrying timeout for timer: [id=d9356961-70a9-450a-bc1a-c2c8c3460092 timedObjectId=sinaf-web.sinaf-ejb.ValidadorSegurancaToken auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@6f67cc27 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Sat Aug 08 00:00:00 BRT 2026 timerState=RETRY_TIMEOUT info=null]: javax.ejb.EJBException: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.TimerCMTTxInterceptor.handleExceptionInOurTx(TimerCMTTxInterceptor.java:53)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:73)
	at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
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
	at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:99)
	at org.jboss.as.ejb3.timerservice.CalendarTimerTask.invokeBeanMethod(CalendarTimerTask.java:64)
	at org.jboss.as.ejb3.timerservice.CalendarTimerTask.callTimeout(CalendarTimerTask.java:53)
	at org.jboss.as.ejb3.timerservice.TimerTask.retryTimeout(TimerTask.java:234)
	at org.jboss.as.ejb3.timerservice.TimerTask.run(TimerTask.java:168)
	at org.jboss.as.ejb3.timerservice.TimerServiceImpl$Task$1.run(TimerServiceImpl.java:1220)
	at org.wildfly.extension.requestcontroller.RequestController$QueuedTask$1.run(RequestController.java:497)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
	at org.jboss.threads.JBossThread.run(JBossThread.java:320)
Caused by: br.gov.caixa.bsb.sinaf.exception.SINAFException: *** ERRO AO ATUALIZAR PUBLIC KEY *** -->Erro ao chamar o SSO: <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>503 Service Unavailable</title>
</head><body>
<h1>Service Unavailable</h1>
<p>The server is temporarily unable to service your
request due to maintenance downtime or capacity
problems. Please try again later.</p>
</body></html>

	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.requestPublicKeyByIssuer(ValidadorSegurancaToken.java:198)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.atualizarPublicKeys(ValidadorSegurancaToken.java:178)
	at br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken.scheduleUpdatePublicKey(ValidadorSegurancaToken.java:168)
	at sun.reflect.GeneratedMethodAccessor602.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:103)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
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
	... 33 more

[0m[0m00:02:37,949 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:02:37.949 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:07:38,007 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:07:38.007 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:12:38,077 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:12:38.076 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:17:38,139 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:17:38.139 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:22:38,204 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:22:38.204 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:27:38,268 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:27:38.268 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:32:38,335 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:32:38.335 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:37:38,400 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:37:38.400 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:42:38,464 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:42:38.464 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:47:38,527 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:47:38.527 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:52:38,587 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:52:38.586 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m00:57:38,664 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 00:57:38.664 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:02:38,725 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:02:38.725 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:07:38,783 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:07:38.783 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:12:38,847 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:12:38.847 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:17:38,906 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:17:38.905 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:22:38,968 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:22:38.968 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:27:39,032 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:27:39.032 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:32:39,097 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:32:39.097 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:37:39,166 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:37:39.166 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:42:39,235 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:42:39.235 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:47:39,289 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:47:39.289 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:52:39,348 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:52:39.348 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m01:57:39,410 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 01:57:39.410 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:02:39,475 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:02:39.475 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:07:39,534 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:07:39.534 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:12:39,832 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:12:39.832 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:17:39,901 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:17:39.901 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:22:39,965 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:22:39.965 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:27:40,027 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:27:40.027 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:32:40,104 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:32:40.104 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:37:40,160 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:37:40.160 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:42:40,219 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:42:40.218 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:47:40,290 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:47:40.290 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:52:40,353 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:52:40.353 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m02:57:40,423 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 02:57:40.423 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:02:40,491 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:02:40.491 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:07:40,576 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:07:40.576 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:12:40,641 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:12:40.641 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:17:40,707 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:17:40.707 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:22:40,781 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:22:40.781 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:27:40,837 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:27:40.837 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:32:40,893 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:32:40.893 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:37:40,950 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:37:40.950 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:42:41,010 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:42:41.010 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:47:41,068 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:47:41.068 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:52:41,124 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:52:41.124 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m03:57:41,182 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 03:57:41.182 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:02:41,242 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:02:41.242 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:07:41,301 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:07:41.300 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:12:41,360 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:12:41.360 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:17:41,423 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:17:41.423 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:22:41,486 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:22:41.486 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:27:41,548 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:27:41.548 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:32:41,621 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:32:41.621 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:37:41,686 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:37:41.685 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:42:41,746 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:42:41.746 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:47:41,814 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:47:41.813 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:52:41,874 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:52:41.874 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m04:57:41,935 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 04:57:41.934 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:02:41,996 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:02:41.996 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:07:42,054 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:07:42.054 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:12:42,117 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:12:42.116 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:17:42,192 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:17:42.191 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:22:42,251 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:22:42.251 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:27:42,308 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:27:42.308 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:32:42,377 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:32:42.377 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:37:42,440 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:37:42.440 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:42:42,500 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:42:42.500 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:47:42,563 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:47:42.563 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:52:42,622 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:52:42.622 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m05:57:42,689 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 05:57:42.688 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:02:42,752 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:02:42.752 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:07:42,812 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:07:42.812 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:12:42,897 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:12:42.897 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:17:42,957 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:17:42.957 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:22:43,017 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:22:43.017 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:27:43,079 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:27:43.079 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:32:43,136 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:32:43.136 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:37:43,191 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:37:43.190 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:42:43,246 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:42:43.246 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:47:43,303 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:47:43.303 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:52:43,364 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:52:43.364 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m06:57:43,422 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 06:57:43.422 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:02:43,515 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:02:43.515 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:07:43,578 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:07:43.578 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:12:43,638 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:12:43.638 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:17:43,699 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:17:43.699 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:22:43,759 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:22:43.759 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:27:43,821 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:27:43.821 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:32:43,883 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:32:43.883 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:37:43,945 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:37:43.945 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:42:44,002 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:42:44.002 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:47:44,061 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:47:44.061 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:52:44,119 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:52:44.119 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m07:57:44,181 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 07:57:44.181 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:02:44,243 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:02:44.242 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:07:44,305 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:07:44.305 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:12:44,363 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:12:44.363 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:17:44,423 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:17:44.423 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:22:44,482 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:22:44.482 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:27:44,551 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:27:44.550 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:32:44,618 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:32:44.618 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:37:44,674 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:37:44.674 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:42:44,734 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:42:44.734 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:47:44,792 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:47:44.792 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:52:44,856 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:52:44.856 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m08:57:44,911 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 08:57:44.911 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:02:44,988 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:02:44.988 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:07:45,051 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:07:45.051 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:12:45,110 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:12:45.109 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:17:45,169 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:17:45.169 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:22:45,242 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:22:45.242 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:27:45,338 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:27:45.338 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:32:45,396 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:32:45.396 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:37:45,461 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:37:45.461 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:42:45,521 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:42:45.521 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:47:45,589 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:47:45.589 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:52:45,657 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:52:45.656 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m09:57:45,714 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 09:57:45.714 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:02:45,777 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:02:45.777 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:07:45,842 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:07:45.842 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:12:45,906 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:12:45.906 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:17:45,974 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:17:45.974 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:22:46,041 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:22:46.041 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:27:46,100 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:27:46.100 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:32:46,156 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:32:46.156 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:37:46,226 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:37:46.226 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:42:46,293 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:42:46.293 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:47:46,355 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:47:46.355 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:52:46,424 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:52:46.424 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m10:57:46,485 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 10:57:46.485 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:02:46,545 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:02:46.544 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:07:46,608 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:07:46.608 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:12:46,673 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:12:46.673 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:17:46,745 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:17:46.745 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:22:46,807 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:22:46.807 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:27:46,871 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:27:46.871 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:32:46,936 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:32:46.936 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:37:47,001 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:37:47.001 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:42:47,061 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:42:47.061 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:47:47,120 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:47:47.120 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:52:47,179 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:52:47.178 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m11:57:47,245 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 11:57:47.244 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:02:47,304 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:02:47.304 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:07:47,368 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:07:47.368 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:12:47,441 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:12:47.441 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:17:47,503 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:17:47.503 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:22:47,561 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:22:47.561 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:27:48,313 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:27:48.313 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:32:48,369 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:32:48.369 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:37:48,429 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:37:48.429 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:42:48,493 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:42:48.493 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:47:48,562 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:47:48.562 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:52:48,623 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:52:48.623 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m12:57:48,685 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 12:57:48.685 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:02:48,762 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:02:48.762 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:07:48,836 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:07:48.836 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:12:48,895 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:12:48.895 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:17:48,963 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:17:48.963 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:22:49,049 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:22:49.049 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:27:49,125 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:27:49.125 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:32:49,184 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:32:49.183 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:37:49,250 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:37:49.250 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:42:49,307 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:42:49.307 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:47:49,379 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:47:49.379 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:52:49,441 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:52:49.441 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m13:57:49,502 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 13:57:49.502 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:02:49,566 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:02:49.566 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:07:49,632 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:07:49.632 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:12:49,891 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:12:49.890 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:17:50,000 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:17:50.000 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:22:50,065 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:22:50.065 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:27:50,129 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:27:50.129 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:32:50,192 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:32:50.192 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:37:50,267 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:37:50.267 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:42:50,333 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:42:50.333 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:47:50,396 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:47:50.396 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:52:50,456 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:52:50.455 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m14:57:50,519 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 14:57:50.518 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:02:50,587 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:02:50.587 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:07:50,650 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:07:50.650 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:12:50,718 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:12:50.718 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:17:50,823 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:17:50.823 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:22:50,895 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:22:50.895 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:27:50,959 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:27:50.959 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:32:51,033 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:32:51.033 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:37:51,097 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:37:51.097 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:42:51,176 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:42:51.176 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:47:51,242 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:47:51.242 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:52:51,303 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:52:51.302 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m15:57:51,374 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 15:57:51.374 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m16:02:51,457 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 16:02:51.457 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m16:07:51,523 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 16:07:51.523 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m16:12:51,581 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 16:12:51.581 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m16:15:46,503 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-46) Detalhando recuperarDocumentoLancamentoPorId
[0m[0m16:15:46,508 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-46) -> Iniciando busca do usuario C892,850
[0m[33m16:15:46,554 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-52) RESTEASY002142: Multiple resource methods match request "GET /usuario/". Selecting one. Matching methods: [public javax.ws.rs.core.Response br.gov.caixa.bsb.sinaf.rest.UsuarioRS.recuperarUsuarioAutenticado(), public javax.ws.rs.core.Response br.gov.caixa.bsb.sinaf.rest.UsuarioRS.recuperarUsuarioLogado()]
[0m[0m16:15:46,651 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-52) -> Iniciando busca do usuario C892,850
[0m[0m16:15:46,662 INFO  [br.gov.caixa.bsb.sinaf.rest.UnidadeRS] (default task-53) recuperarUnidadeUsuario
[0m[0m16:15:46,662 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UnidadeServiceImpl] (default task-46) -> Iniciando consulta de Unidade Ativa
[0m[0m16:15:46,663 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-53) -> Iniciando busca do usuario C892,850
[0m[0m16:15:46,664 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-46) -> Query recuperar unidade numero 7,688
[0m[0m16:15:46,679 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UnidadeServiceImpl] (default task-53) -> Iniciando consulta de Unidade Ativa
[0m[0m16:15:46,680 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-53) -> Query recuperar unidade numero 7,688
[0m[0m16:15:46,795 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-54) -> Iniciando busca do usuario C892,850
[0m[0m16:15:46,803 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UnidadeServiceImpl] (default task-54) -> Iniciando consulta de Unidade Ativa
[0m[0m16:15:46,803 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-54) -> Query recuperar unidade numero 7,688
[0m[0m16:15:47,004 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UnidadeServiceImpl] (default task-52) -> Iniciando consulta de Unidade Ativa
[0m[0m16:15:47,038 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-46) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:15:47,038 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-54) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:15:47,038 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-53) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:15:47,038 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-52) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:15:47,046 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-52) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:47,047 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-53) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:47,046 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-54) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:47,047 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-46) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:47,082 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-46) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,082 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-52) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,082 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-53) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,084 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-52) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:47,085 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-54) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,092 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-52) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,093 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-53) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:47,175 INFO  [br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository] (default task-54) -> Query recuperar Mensagem Tela Inicial por Perfil do Usuario
[0m[0m16:15:47,256 INFO  [br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository] (default task-54) -> Finalizando query recuperar Mensagem Tela Inicial por Perfil do Usuario
[0m[0m16:15:47,373 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-46) -> N?o ? permitido excluir o documento FLE.2.2.2026.5.20 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m16:15:47,373 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-46) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m16:15:47,373 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-46) -> N?o ? permitido autorizacao do gestor no documento FLE.2.2.2026.5.20 pelo motivo: A situa??o do documento n?o permite a autoriza??o pelo Gestor da Unidade.
[0m[0m16:15:47,377 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-46) -> N?o ? permitido o estorno do documento FLE.2.2.2026.5.20 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m16:15:47,377 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-46) -> N?o ? permitido anexos complementares do documento FLE.2.2.2026.5.20 pelo motivo: O usu?rio n?o pode incluir anexos complementares para documentos em elabora??o ou devolvidos para complemento.
[0m[0m16:15:47,391 INFO  [br.gov.caixa.bsb.sinaf.data.RotinaRepository] (default task-46) -> Query recuperar Rotina Por Id
[0m[0m16:15:49,081 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-60) recuperarHistorico
[0m[0m16:15:49,081 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-58) -> Iniciando busca do usuario C892,850
[0m[0m16:15:49,082 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-58) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:15:49,083 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-58) -> Query recuperar de unidade vinculada ao usu?rio 892850
[0m[0m16:15:49,088 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-58) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m16:15:49,092 INFO  [br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository] (default task-58) -> Query recuperar arquivos anexos
[0m[0m16:15:49,095 INFO  [br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository] (default task-58) -> Finalizando recuperar arquivos anexos
[0m[0m16:15:49,122 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-61) -> Iniciando busca do usuario C892,850
[0m[0m16:15:49,123 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-61) -> Usuario C892,850 recuperado com sucesso 
[0m[0m16:17:51,640 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 16:17:51.640 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m[0m16:22:51,701 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-08-07 16:22:51.701 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m


