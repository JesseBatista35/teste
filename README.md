Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/sinafweb_2-caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sinaf -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sinaf-web-des -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Dsun.reflect.inflationThreshold=0 -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br\|10.252.176.64

=========================================================================

[0m17:10:43,795 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
[0m[33m17:10:44,089 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m17:10:44,103 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m17:10:44,333 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) starting
[0m[0m17:10:44,423 INFO  [org.jboss.vfs] (MSC service thread 1-4) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m17:10:46,331 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:10:46,346 INFO  [org.wildfly.security] (ServerService Thread Pool -- 22) ELY00001: WildFly Elytron version 1.1.12.Final-redhat-00001
[0m[0m17:10:46,394 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 21) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:10:46,892 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 18) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/31/5c5fb7a92762acbe20193943b870e0853785d2/content
[0m[0m17:10:46,908 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m17:10:46,918 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.5.6.Final-redhat-00001
[0m[0m17:10:46,923 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.5.6.Final-redhat-00001
[0m[0m17:10:46,952 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.8.Final-redhat-1
[0m[33m17:10:46,960 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 59) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m17:10:46,981 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 61) WFLYWS0002: Activating WebServices Extension
[0m[0m17:10:46,983 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 58) WFLYSEC0002: Activating Security Subsystem
[0m[0m17:10:46,983 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 44) WFLYRS0016: RESTEasy version 3.0.26.Final-redhat-1
[0m[0m17:10:46,991 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 51) WFLYNAM0001: Activating Naming Subsystem
[0m[0m17:10:46,992 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 43) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m17:10:47,001 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 42) WFLYIO001: Worker 'default' has auto-configured to 64 core threads with 512 task threads based on your 32 available processors
[0m[0m17:10:47,033 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
[0m[0m17:10:47,090 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 49) WFLYJSF0007: Activated the following JSF Implementations: [main]
[0m[0m17:10:47,091 INFO  [org.jboss.as.connector] (MSC service thread 1-7) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.12.Final-redhat-00001)
[0m[0m17:10:47,110 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0003: Undertow 1.4.18.SP11-redhat-00001 starting
[0m[0m17:10:47,189 INFO  [org.jboss.as.naming] (MSC service thread 1-5) WFLYNAM0003: Starting Naming Service
[0m[0m17:10:47,197 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Bound mail session [java:jboss/mail/caixamail]
[0m[0m17:10:47,680 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
[0m[0m17:10:47,716 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
[0m[0m17:10:48,121 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 60) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m17:10:48,202 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
[0m[0m17:10:48,206 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m17:10:48,219 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Started server default-server.
[0m[0m17:10:48,280 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0018: Host default-host starting
[0m[0m17:10:48,290 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m17:10:48,292 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[0m17:10:48,299 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0005: Deploying non-JDBC-compliant driver class com.sybase.jdbc4.jdbc.SybDriver (version 7.0)
[0m[0m17:10:48,299 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0018: Started Driver service with driver-name = sybase
[0m[0m17:10:48,398 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.27)
[0m[0m17:10:48,399 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0018: Started Driver service with driver-name = DB2JDBCDriver
[0m[0m17:10:48,490 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m17:10:48,799 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: EJB subsystem suspension complete
[0m[0m17:10:48,999 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 37) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 6.4)
[0m[0m17:10:49,000 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = sqlserver
[0m[0m17:10:49,094 INFO  [org.jboss.as.patching] (MSC service thread 1-7) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.1.6.CP, one-off patches include: eap-716-jbeap-16502
[0m[0m17:10:49,105 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-6) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
[0m[33m17:10:49,108 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-3) WFLYDM0111: Keystore /opt/jboss-eap-7.1/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m17:10:49,184 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "sinaf-web.ear" (runtime-name: "sinaf-web.ear")
[0m[0m17:10:49,202 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0098: Bound non-transactional data source: java:/jdbc/DB2SinafDS
[0m[0m17:10:49,282 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m17:10:49,331 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.1.11.Final-redhat-00001 (Apache CXF 3.1.16.redhat-2) 
[0m[33m17:10:53,290 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry toolbox.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,290 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bcmail-jdk14-138.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,290 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bcprov-jdk14-138.jar in /content/sinaf-web.ear/lib/itext.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry lib/ in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bcmail-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bcprov-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bctsp-jdk16-1.46.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry brynet-api-1.0.7.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry gson-2.2.4.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry commons-lang-2.4.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry ehcache-2.8.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry slf4j-api-1.6.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-baseio-2.0.3.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-bc-reduzida-fw-1.2.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-cache-1.0.0.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-logger-1.0.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-se-base-cliente-ws-1.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-se-base-ws-uteis-1.5.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-se-carimbador-cliente-ws-1.2.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-se-gerenciador-politicas-cliente-ws-1.0.8.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-se-validador-certificado-cliente-ws-1.2.10.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-signer-base-2.0.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-signer-cms-2.0.2.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-signer-pdf-completo-2.0.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-x509-1.5.2.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,301 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-x509-repositorio-api-1.5.3.3.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-avancado-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-base-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-base-impl-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-cades-base-comuns-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-cades-wssoap-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-pades-base-comuns-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-assinador-pades-wssoap-2.2.6.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-base-comuns-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry cliente-servico-base-impl-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry comuns-excecoes-bundle-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-base-cliente-1.1.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-cades-cliente-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-cades-cliente-ws-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-pades-cliente-ws-1.1.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-xades-cliente-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,302 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fw-assinador-xades-cliente-ws-1.6.0.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry bry-pdfbox-2.0.7.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry activation-1.1.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry javax.inject-1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jsr181-api-1.0-MR1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry javax.mail-1.5.1.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry validation-api-1.1.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry hibernate-jpa-2.1-api-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-annotations-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-batch-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-ejb-api_3.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-el-api_3.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-concurrency-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jsf-api_2.2_spec-2.2.5.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-interceptors-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-json-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-j2eemgmt-api_1.1_spec-1.0.1.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,303 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-connector-api_1.7_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-rmi-api_1.0_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jacc-api_1.5_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jaspi-api_1.1_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jms-api_2.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-servlet-api_3.1_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jsp-api_2.3_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jstl-api_1.2_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-transaction-api_1.2_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jaxrs-api-3.0.6.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-websocket-api_1.0_spec-1.0.0.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jaxb-api_2.2_spec-1.0.4.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-saaj-api_1.3_spec-1.0.3.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:10:53,304 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jboss-jaxws-api_2.2_spec-2.0.2.Final.jar in /content/sinaf-web.ear/lib/sinaf-assinador.jar  does not point to a valid jar for a Class-Path reference.
[0m[0m17:10:53,320 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0207: Starting subdeployment (runtime-name: "sinaf-ejb.jar")
[0m[0m17:10:53,320 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Starting subdeployment (runtime-name: "sinaf3-web.war")
[0m[33m17:10:54,084 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0166: The @Clustered annotation is deprecated and will be ignored.
[0m[0m17:10:54,189 INFO  [org.jboss.as.jpa] (MSC service thread 1-8) WFLYJPA0002: Read persistence.xml for db2SinafDS
[0m[0m17:10:54,689 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 64) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sinaf-web.ear/sinaf-ejb.jar#db2SinafDS'
[0m[0m17:10:54,925 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 64) HHH000204: Processing PersistenceUnitInfo [
	name: db2SinafDS
	...]
[0m[0m17:10:54,925 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processing weld deployment sinaf-web.ear
[0m[0m17:10:55,014 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-3) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
[0m[0m17:10:55,088 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 64) HHH000412: Hibernate Core {5.1.17.Final-redhat-00002}
[0m[0m17:10:55,090 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 64) HHH000206: hibernate.properties not found
[0m[0m17:10:55,091 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 64) HHH000021: Bytecode provider name : javassist
[0m[0m17:10:55,119 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 64) HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
[0m[0m17:10:56,089 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-7) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.11.Final-redhat-1
[0m[0m17:10:56,497 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment sinaf3-web.war
[0m[0m17:10:56,498 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sinaf3-web.war
[0m[0m17:10:56,614 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processing weld deployment sinaf-ejb.jar
[0m[0m17:10:56,685 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DadosAbertosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:app/sinaf-ejb/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:module/DadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.DadosAbertosRepository
	java:global/sinaf-web/sinaf-ejb/DadosAbertosRepository
	java:app/sinaf-ejb/DadosAbertosRepository
	java:module/DadosAbertosRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoPrazoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:app/sinaf-ejb/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:module/EventoProdutoPrazoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoPrazoRepository
	java:global/sinaf-web/sinaf-ejb/EventoProdutoPrazoRepository
	java:app/sinaf-ejb/EventoProdutoPrazoRepository
	java:module/EventoProdutoPrazoRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:app/sinaf-ejb/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:module/UsuarioServiceImpl!br.gov.caixa.bsb.sinaf.service.UsuarioService
	java:global/sinaf-web/sinaf-ejb/UsuarioServiceImpl
	java:app/sinaf-ejb/UsuarioServiceImpl
	java:module/UsuarioServiceImpl

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoBatchRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:app/sinaf-ejb/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:module/AcaoDocumentoBatchRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoBatchRepository
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoBatchRepository
	java:app/sinaf-ejb/AcaoDocumentoBatchRepository
	java:module/AcaoDocumentoBatchRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:app/sinaf-ejb/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:module/ArquivoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoDocumentoService
	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoServiceImpl
	java:app/sinaf-ejb/ArquivoDocumentoServiceImpl
	java:module/ArquivoDocumentoServiceImpl

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidRespProcessoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:app/sinaf-ejb/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:module/ParametroUnidRespProcessoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidRespProcessoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidRespProcessoRepository
	java:app/sinaf-ejb/ParametroUnidRespProcessoRepository
	java:module/ParametroUnidRespProcessoRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'CarteiraServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:app/sinaf-ejb/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:module/CarteiraServiceImpl!br.gov.caixa.bsb.sinaf.service.CarteiraService
	java:global/sinaf-web/sinaf-ejb/CarteiraServiceImpl
	java:app/sinaf-ejb/CarteiraServiceImpl
	java:module/CarteiraServiceImpl

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroInstControleEventoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:app/sinaf-ejb/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:module/ParametroInstControleEventoRepository!br.gov.caixa.bsb.sinaf.data.ParametroInstControleEventoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroInstControleEventoRepository
	java:app/sinaf-ejb/ParametroInstControleEventoRepository
	java:module/ParametroInstControleEventoRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FuncionalidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:app/sinaf-ejb/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:module/FuncionalidadeRepository!br.gov.caixa.bsb.sinaf.data.FuncionalidadeRepository
	java:global/sinaf-web/sinaf-ejb/FuncionalidadeRepository
	java:app/sinaf-ejb/FuncionalidadeRepository
	java:module/FuncionalidadeRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnexoDocumentoLancamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:app/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:module/AnexoDocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoDocumentoLancamentoService
	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl
	java:app/sinaf-ejb/AnexoDocumentoLancamentoServiceImpl
	java:module/AnexoDocumentoLancamentoServiceImpl

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AcaoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:app/sinaf-ejb/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:module/AcaoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AcaoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorRepository
	java:app/sinaf-ejb/AcaoLancamentoGestorRepository
	java:module/AcaoLancamentoGestorRepository

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoUnidadeAutorizadoraServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:app/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:module/ParametroServicoUnidadeAutorizadoraServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoUnidadeAutorizadoraService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl
	java:app/sinaf-ejb/ParametroServicoUnidadeAutorizadoraServiceImpl
	java:module/ParametroServicoUnidadeAutorizadoraServiceImpl

[0m[0m17:10:56,686 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'CalendarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:app/sinaf-ejb/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:module/CalendarioRepository!br.gov.caixa.bsb.sinaf.data.CalendarioRepository
	java:global/sinaf-web/sinaf-ejb/CalendarioRepository
	java:app/sinaf-ejb/CalendarioRepository
	java:module/CalendarioRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FleService' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:app/sinaf-ejb/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:module/FleService!br.gov.caixa.bsb.sinaf.service.documento.FleService
	java:global/sinaf-web/sinaf-ejb/FleService
	java:app/sinaf-ejb/FleService
	java:module/FleService

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'CalendarioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:app/sinaf-ejb/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:module/CalendarioServiceImpl!br.gov.caixa.bsb.sinaf.service.CalendarioService
	java:global/sinaf-web/sinaf-ejb/CalendarioServiceImpl
	java:app/sinaf-ejb/CalendarioServiceImpl
	java:module/CalendarioServiceImpl

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'TipoPerfilUsuarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:app/sinaf-ejb/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:module/TipoPerfilUsuarioRepository!br.gov.caixa.bsb.sinaf.data.TipoPerfilUsuarioRepository
	java:global/sinaf-web/sinaf-ejb/TipoPerfilUsuarioRepository
	java:app/sinaf-ejb/TipoPerfilUsuarioRepository
	java:module/TipoPerfilUsuarioRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:app/sinaf-ejb/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:module/DocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoRepository
	java:app/sinaf-ejb/DocumentoLancamentoRepository
	java:module/DocumentoLancamentoRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RoteiroRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:app/sinaf-ejb/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:module/RoteiroRepository!br.gov.caixa.bsb.sinaf.data.RoteiroRepository
	java:global/sinaf-web/sinaf-ejb/RoteiroRepository
	java:app/sinaf-ejb/RoteiroRepository
	java:module/RoteiroRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RotinaBatchServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:app/sinaf-ejb/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:module/RotinaBatchServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaBatchService
	java:global/sinaf-web/sinaf-ejb/RotinaBatchServiceImpl
	java:app/sinaf-ejb/RotinaBatchServiceImpl
	java:module/RotinaBatchServiceImpl

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:app/sinaf-ejb/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:module/ExpurgoRepository!br.gov.caixa.bsb.sinaf.data.ExpurgoRepository
	java:global/sinaf-web/sinaf-ejb/ExpurgoRepository
	java:app/sinaf-ejb/ExpurgoRepository
	java:module/ExpurgoRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnaliticoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:app/sinaf-ejb/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:module/AnaliticoRepository!br.gov.caixa.bsb.sinaf.data.AnaliticoRepository
	java:global/sinaf-web/sinaf-ejb/AnaliticoRepository
	java:app/sinaf-ejb/AnaliticoRepository
	java:module/AnaliticoRepository

[0m[0m17:10:56,692 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnexoDocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:app/sinaf-ejb/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:module/AnexoDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/AnexoDocumentoLancamentoRepository
	java:app/sinaf-ejb/AnexoDocumentoLancamentoRepository
	java:module/AnexoDocumentoLancamentoRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:app/sinaf-ejb/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:module/ArquivoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoDocumentoRepository
	java:app/sinaf-ejb/ArquivoDocumentoRepository
	java:module/ArquivoDocumentoRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ObjetoCusteioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:app/sinaf-ejb/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:module/ObjetoCusteioRepository!br.gov.caixa.bsb.sinaf.data.ObjetoCusteioRepository
	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioRepository
	java:app/sinaf-ejb/ObjetoCusteioRepository
	java:module/ObjetoCusteioRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioNAVRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:app/sinaf-ejb/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:module/UsuarioNAVRepository!br.gov.caixa.bsb.sinaf.data.UsuarioNAVRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioNAVRepository
	java:app/sinaf-ejb/UsuarioNAVRepository
	java:module/UsuarioNAVRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'CargaAutomaticaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:app/sinaf-ejb/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:module/CargaAutomaticaServiceImpl!br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl
	java:global/sinaf-web/sinaf-ejb/CargaAutomaticaServiceImpl
	java:app/sinaf-ejb/CargaAutomaticaServiceImpl
	java:module/CargaAutomaticaServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EntidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:app/sinaf-ejb/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:module/EntidadeRepository!br.gov.caixa.bsb.sinaf.data.EntidadeRepository
	java:global/sinaf-web/sinaf-ejb/EntidadeRepository
	java:app/sinaf-ejb/EntidadeRepository
	java:module/EntidadeRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:app/sinaf-ejb/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:module/ParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoServiceImpl
	java:app/sinaf-ejb/ParametroServicoServiceImpl
	java:module/ParametroServicoServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AssinaturaDigitalServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:app/sinaf-ejb/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:module/AssinaturaDigitalServiceImpl!br.gov.caixa.bsb.sinaf.service.AssinaturaDigitalService
	java:global/sinaf-web/sinaf-ejb/AssinaturaDigitalServiceImpl
	java:app/sinaf-ejb/AssinaturaDigitalServiceImpl
	java:module/AssinaturaDigitalServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'MensagemEmailServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:app/sinaf-ejb/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:module/MensagemEmailServiceImpl!br.gov.caixa.bsb.sinaf.service.MensagemEmailService
	java:global/sinaf-web/sinaf-ejb/MensagemEmailServiceImpl
	java:app/sinaf-ejb/MensagemEmailServiceImpl
	java:module/MensagemEmailServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:app/sinaf-ejb/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:module/AcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.AcaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoRepository
	java:app/sinaf-ejb/AcaoDocumentoRepository
	java:module/AcaoDocumentoRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'LancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:app/sinaf-ejb/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:module/LancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.LancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/LancamentoGestorServiceImpl
	java:app/sinaf-ejb/LancamentoGestorServiceImpl
	java:module/LancamentoGestorServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnexoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:app/sinaf-ejb/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:module/AnexoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.AnexoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorRepository
	java:app/sinaf-ejb/AnexoLancamentoGestorRepository
	java:module/AnexoLancamentoGestorRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoControleFechamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:app/sinaf-ejb/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:module/ParametroServicoControleFechamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoControleFechamentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoRepository
	java:app/sinaf-ejb/ParametroServicoControleFechamentoRepository
	java:module/ParametroServicoControleFechamentoRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:app/sinaf-ejb/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:module/UsuarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioRepository
	java:app/sinaf-ejb/UsuarioRepository
	java:module/UsuarioRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RegistroConselhoContabilidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:app/sinaf-ejb/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:module/RegistroConselhoContabilidadeRepository!br.gov.caixa.bsb.sinaf.data.RegistroConselhoContabilidadeRepository
	java:global/sinaf-web/sinaf-ejb/RegistroConselhoContabilidadeRepository
	java:app/sinaf-ejb/RegistroConselhoContabilidadeRepository
	java:module/RegistroConselhoContabilidadeRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:app/sinaf-ejb/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:module/ExpurgoServiceImpl!br.gov.caixa.bsb.sinaf.service.ExpurgoService
	java:global/sinaf-web/sinaf-ejb/ExpurgoServiceImpl
	java:app/sinaf-ejb/ExpurgoServiceImpl
	java:module/ExpurgoServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnaliticoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:app/sinaf-ejb/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:module/AnaliticoServiceImpl!br.gov.caixa.bsb.sinaf.service.AnaliticoService
	java:global/sinaf-web/sinaf-ejb/AnaliticoServiceImpl
	java:app/sinaf-ejb/AnaliticoServiceImpl
	java:module/AnaliticoServiceImpl

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioListaProprietarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:app/sinaf-ejb/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:module/UsuarioListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.UsuarioListaProprietarioRepository
	java:global/sinaf-web/sinaf-ejb/UsuarioListaProprietarioRepository
	java:app/sinaf-ejb/UsuarioListaProprietarioRepository
	java:module/UsuarioListaProprietarioRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EventoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:app/sinaf-ejb/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:module/EventoRepository!br.gov.caixa.bsb.sinaf.data.EventoRepository
	java:global/sinaf-web/sinaf-ejb/EventoRepository
	java:app/sinaf-ejb/EventoRepository
	java:module/EventoRepository

[0m[0m17:10:56,693 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:app/sinaf-ejb/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:module/FatoOperacionalProdutoRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalProdutoRepository
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalProdutoRepository
	java:app/sinaf-ejb/FatoOperacionalProdutoRepository
	java:module/FatoOperacionalProdutoRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:app/sinaf-ejb/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:module/FatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.FatoOperacionalRepository
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalRepository
	java:app/sinaf-ejb/FatoOperacionalRepository
	java:module/FatoOperacionalRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidadeElaboracaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:module/ParametroUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoRepository
	java:module/ParametroUnidadeElaboracaoRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ObjetoCusteioServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:app/sinaf-ejb/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:module/ObjetoCusteioServiceImpl!br.gov.caixa.bsb.sinaf.service.ObjetoCusteioService
	java:global/sinaf-web/sinaf-ejb/ObjetoCusteioServiceImpl
	java:app/sinaf-ejb/ObjetoCusteioServiceImpl
	java:module/ObjetoCusteioServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FechamentoMesServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:app/sinaf-ejb/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:module/FechamentoMesServiceImpl!br.gov.caixa.bsb.sinaf.service.FechamentoMesService
	java:global/sinaf-web/sinaf-ejb/FechamentoMesServiceImpl
	java:app/sinaf-ejb/FechamentoMesServiceImpl
	java:module/FechamentoMesServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:app/sinaf-ejb/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:module/UnidadeRepository!br.gov.caixa.bsb.sinaf.data.UnidadeRepository
	java:global/sinaf-web/sinaf-ejb/UnidadeRepository
	java:app/sinaf-ejb/UnidadeRepository
	java:module/UnidadeRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'InformacaoSistemaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:app/sinaf-ejb/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:module/InformacaoSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.InformacaoSistemaService
	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaServiceImpl
	java:app/sinaf-ejb/InformacaoSistemaServiceImpl
	java:module/InformacaoSistemaServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ListaProprietarioRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:app/sinaf-ejb/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:module/ListaProprietarioRepository!br.gov.caixa.bsb.sinaf.data.ListaProprietarioRepository
	java:global/sinaf-web/sinaf-ejb/ListaProprietarioRepository
	java:app/sinaf-ejb/ListaProprietarioRepository
	java:module/ListaProprietarioRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoBatchRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:app/sinaf-ejb/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:module/DocumentoLancamentoBatchRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoBatchRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoBatchRepository
	java:app/sinaf-ejb/DocumentoLancamentoBatchRepository
	java:module/DocumentoLancamentoBatchRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:app/sinaf-ejb/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:module/ProdutoRepository!br.gov.caixa.bsb.sinaf.data.ProdutoRepository
	java:global/sinaf-web/sinaf-ejb/ProdutoRepository
	java:app/sinaf-ejb/ProdutoRepository
	java:module/ProdutoRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AcaoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:app/sinaf-ejb/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:module/AcaoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/AcaoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/AcaoLancamentoGestorServiceImpl
	java:module/AcaoLancamentoGestorServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DadosProcessamentoLoteBean' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:app/sinaf-ejb/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:module/DadosProcessamentoLoteBean!br.gov.caixa.bsb.sinaf.service.impl.DadosProcessamentoLoteBean
	java:global/sinaf-web/sinaf-ejb/DadosProcessamentoLoteBean
	java:app/sinaf-ejb/DadosProcessamentoLoteBean
	java:module/DadosProcessamentoLoteBean

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoDataLimiteParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:app/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:module/HistoricoDataLimiteParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.HistoricoDataLimiteParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository
	java:app/sinaf-ejb/HistoricoDataLimiteParametroServicoRepository
	java:module/HistoricoDataLimiteParametroServicoRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FatoOperacionalServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:app/sinaf-ejb/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:module/FatoOperacionalServiceImpl!br.gov.caixa.bsb.sinaf.service.FatoOperacionalService
	java:global/sinaf-web/sinaf-ejb/FatoOperacionalServiceImpl
	java:app/sinaf-ejb/FatoOperacionalServiceImpl
	java:module/FatoOperacionalServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoFatoOperacionalRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:app/sinaf-ejb/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:module/ParametrizacaoFatoOperacionalRepository!br.gov.caixa.bsb.sinaf.data.ParametrizacaoFatoOperacionalRepository
	java:global/sinaf-web/sinaf-ejb/ParametrizacaoFatoOperacionalRepository
	java:app/sinaf-ejb/ParametrizacaoFatoOperacionalRepository
	java:module/ParametrizacaoFatoOperacionalRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoLayoutParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:app/sinaf-ejb/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:module/ArquivoLayoutParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoLayoutParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoLayoutParametroServicoRepository
	java:app/sinaf-ejb/ArquivoLayoutParametroServicoRepository
	java:module/ArquivoLayoutParametroServicoRepository

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AcaoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:app/sinaf-ejb/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:module/AcaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AcaoDocumentoService
	java:global/sinaf-web/sinaf-ejb/AcaoDocumentoServiceImpl
	java:app/sinaf-ejb/AcaoDocumentoServiceImpl
	java:module/AcaoDocumentoServiceImpl

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ValidadorSegurancaToken' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:app/sinaf-ejb/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:module/ValidadorSegurancaToken!br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken
	java:global/sinaf-web/sinaf-ejb/ValidadorSegurancaToken
	java:app/sinaf-ejb/ValidadorSegurancaToken
	java:module/ValidadorSegurancaToken

[0m[0m17:10:56,694 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroUnidadeElaboracaoPreviaEspecialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:module/ParametroUnidadeElaboracaoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:global/sinaf-web/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:app/sinaf-ejb/ParametroUnidadeElaboracaoPreviaEspecialRepository
	java:module/ParametroUnidadeElaboracaoPreviaEspecialRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PeriodoResponsabilidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:app/sinaf-ejb/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:module/PeriodoResponsabilidadeRepository!br.gov.caixa.bsb.sinaf.data.PeriodoResponsabilidadeRepository
	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeRepository
	java:app/sinaf-ejb/PeriodoResponsabilidadeRepository
	java:module/PeriodoResponsabilidadeRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EmailUnidadeRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:app/sinaf-ejb/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:module/EmailUnidadeRepository!br.gov.caixa.bsb.sinaf.data.EmailUnidadeRepository
	java:global/sinaf-web/sinaf-ejb/EmailUnidadeRepository
	java:app/sinaf-ejb/EmailUnidadeRepository
	java:module/EmailUnidadeRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoControleFechamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:app/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:module/ParametroServicoControleFechamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoControleFechamentoService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl
	java:app/sinaf-ejb/ParametroServicoControleFechamentoServiceImpl
	java:module/ParametroServicoControleFechamentoServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ComunicacaoEletronicaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:app/sinaf-ejb/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:module/ComunicacaoEletronicaRepository!br.gov.caixa.bsb.sinaf.data.ComunicacaoEletronicaRepository
	java:global/sinaf-web/sinaf-ejb/ComunicacaoEletronicaRepository
	java:app/sinaf-ejb/ComunicacaoEletronicaRepository
	java:module/ComunicacaoEletronicaRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'SIECMServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:app/sinaf-ejb/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:module/SIECMServiceImpl!br.gov.caixa.bsb.sinaf.service.SIECMService
	java:global/sinaf-web/sinaf-ejb/SIECMServiceImpl
	java:app/sinaf-ejb/SIECMServiceImpl
	java:module/SIECMServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDadosAbertosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:app/sinaf-ejb/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:module/AutorizacaoDadosAbertosRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDadosAbertosRepository
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDadosAbertosRepository
	java:app/sinaf-ejb/AutorizacaoDadosAbertosRepository
	java:module/AutorizacaoDadosAbertosRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoAuditoriaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:app/sinaf-ejb/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:module/ParametroServicoAuditoriaRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoAuditoriaRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaRepository
	java:app/sinaf-ejb/ParametroServicoAuditoriaRepository
	java:module/ParametroServicoAuditoriaRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoLoteRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:app/sinaf-ejb/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:module/DocumentoLancamentoLoteRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoLoteRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoLoteRepository
	java:app/sinaf-ejb/DocumentoLancamentoLoteRepository
	java:module/DocumentoLancamentoLoteRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroPreencherServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:app/sinaf-ejb/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:module/ParametroPreencherServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroPreencherServicoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroPreencherServicoRepository
	java:app/sinaf-ejb/ParametroPreencherServicoRepository
	java:module/ParametroPreencherServicoRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoImportadoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:app/sinaf-ejb/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:module/ArquivoImportadoRepository!br.gov.caixa.bsb.sinaf.data.ArquivoImportadoRepository
	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoRepository
	java:app/sinaf-ejb/ArquivoImportadoRepository
	java:module/ArquivoImportadoRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:app/sinaf-ejb/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:module/DocumentoLancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.DocumentoLancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorRepository
	java:app/sinaf-ejb/DocumentoLancamentoGestorRepository
	java:module/DocumentoLancamentoGestorRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EstadoDocumentoContabilRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:app/sinaf-ejb/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:module/EstadoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.EstadoDocumentoContabilRepository
	java:global/sinaf-web/sinaf-ejb/EstadoDocumentoContabilRepository
	java:app/sinaf-ejb/EstadoDocumentoContabilRepository
	java:module/EstadoDocumentoContabilRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'MensagemTelaInicialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:app/sinaf-ejb/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:module/MensagemTelaInicialRepository!br.gov.caixa.bsb.sinaf.data.MensagemTelaInicialRepository
	java:global/sinaf-web/sinaf-ejb/MensagemTelaInicialRepository
	java:app/sinaf-ejb/MensagemTelaInicialRepository
	java:module/MensagemTelaInicialRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDocumentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:app/sinaf-ejb/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:module/AutorizacaoDocumentoServiceImpl!br.gov.caixa.bsb.sinaf.service.AutorizacaoDocumentoService
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoServiceImpl
	java:app/sinaf-ejb/AutorizacaoDocumentoServiceImpl
	java:module/AutorizacaoDocumentoServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ProcessoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:app/sinaf-ejb/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:module/ProcessoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProcessoService
	java:global/sinaf-web/sinaf-ejb/ProcessoServiceImpl
	java:app/sinaf-ejb/ProcessoServiceImpl
	java:module/ProcessoServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:app/sinaf-ejb/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:module/EventoProdutoRepository!br.gov.caixa.bsb.sinaf.data.EventoProdutoRepository
	java:global/sinaf-web/sinaf-ejb/EventoProdutoRepository
	java:app/sinaf-ejb/EventoProdutoRepository
	java:module/EventoProdutoRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:app/sinaf-ejb/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:module/DocumentoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/DocumentoLancamentoGestorServiceImpl
	java:module/DocumentoLancamentoGestorServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ProcessoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:app/sinaf-ejb/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:module/ProcessoRepository!br.gov.caixa.bsb.sinaf.data.ProcessoRepository
	java:global/sinaf-web/sinaf-ejb/ProcessoRepository
	java:app/sinaf-ejb/ProcessoRepository
	java:module/ProcessoRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EventoProdutoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:app/sinaf-ejb/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:module/EventoProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoProdutoService
	java:global/sinaf-web/sinaf-ejb/EventoProdutoServiceImpl
	java:app/sinaf-ejb/EventoProdutoServiceImpl
	java:module/EventoProdutoServiceImpl

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroOrigemLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:app/sinaf-ejb/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:module/ParametroOrigemLancamentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroOrigemLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroOrigemLancamentoRepository
	java:app/sinaf-ejb/ParametroOrigemLancamentoRepository
	java:module/ParametroOrigemLancamentoRepository

[0m[0m17:10:56,695 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PermissaoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:app/sinaf-ejb/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:module/PermissaoServiceImpl!br.gov.caixa.bsb.sinaf.service.PermissaoService
	java:global/sinaf-web/sinaf-ejb/PermissaoServiceImpl
	java:app/sinaf-ejb/PermissaoServiceImpl
	java:module/PermissaoServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'SaldoCtbAutorizacaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:app/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:module/SaldoCtbAutorizacaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.SaldoCtbAutorizacaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository
	java:app/sinaf-ejb/SaldoCtbAutorizacaoDocumentoRepository
	java:module/SaldoCtbAutorizacaoDocumentoRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'TipoUnidadeResponsavelRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:app/sinaf-ejb/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:module/TipoUnidadeResponsavelRepository!br.gov.caixa.bsb.sinaf.data.TipoUnidadeResponsavelRepository
	java:global/sinaf-web/sinaf-ejb/TipoUnidadeResponsavelRepository
	java:app/sinaf-ejb/TipoUnidadeResponsavelRepository
	java:module/TipoUnidadeResponsavelRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PeriodoResponsabilidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:app/sinaf-ejb/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:module/PeriodoResponsabilidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.PeriodoResponsabilidadeService
	java:global/sinaf-web/sinaf-ejb/PeriodoResponsabilidadeServiceImpl
	java:app/sinaf-ejb/PeriodoResponsabilidadeServiceImpl
	java:module/PeriodoResponsabilidadeServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:app/sinaf-ejb/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:module/ProdutoServiceImpl!br.gov.caixa.bsb.sinaf.service.ProdutoService
	java:global/sinaf-web/sinaf-ejb/ProdutoServiceImpl
	java:app/sinaf-ejb/ProdutoServiceImpl
	java:module/ProdutoServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'CarteiraRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:app/sinaf-ejb/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:module/CarteiraRepository!br.gov.caixa.bsb.sinaf.data.CarteiraRepository
	java:global/sinaf-web/sinaf-ejb/CarteiraRepository
	java:app/sinaf-ejb/CarteiraRepository
	java:module/CarteiraRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EventoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:app/sinaf-ejb/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:module/EventoServiceImpl!br.gov.caixa.bsb.sinaf.service.EventoService
	java:global/sinaf-web/sinaf-ejb/EventoServiceImpl
	java:app/sinaf-ejb/EventoServiceImpl
	java:module/EventoServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PublicKeysStorage' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:app/sinaf-ejb/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:module/PublicKeysStorage!br.gov.caixa.bsb.sinaf.service.impl.PublicKeysStorage
	java:global/sinaf-web/sinaf-ejb/PublicKeysStorage
	java:app/sinaf-ejb/PublicKeysStorage
	java:module/PublicKeysStorage

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:app/sinaf-ejb/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:module/UnidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.UnidadeService
	java:global/sinaf-web/sinaf-ejb/UnidadeServiceImpl
	java:app/sinaf-ejb/UnidadeServiceImpl
	java:module/UnidadeServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'LancamentoGestorRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:app/sinaf-ejb/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:module/LancamentoGestorRepository!br.gov.caixa.bsb.sinaf.data.LancamentoGestorRepository
	java:global/sinaf-web/sinaf-ejb/LancamentoGestorRepository
	java:app/sinaf-ejb/LancamentoGestorRepository
	java:module/LancamentoGestorRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RotinaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:app/sinaf-ejb/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:module/RotinaRepository!br.gov.caixa.bsb.sinaf.data.RotinaRepository
	java:global/sinaf-web/sinaf-ejb/RotinaRepository
	java:app/sinaf-ejb/RotinaRepository
	java:module/RotinaRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoLancamentoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:app/sinaf-ejb/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:module/DocumentoLancamentoServiceImpl!br.gov.caixa.bsb.sinaf.service.DocumentoLancamentoService
	java:global/sinaf-web/sinaf-ejb/DocumentoLancamentoServiceImpl
	java:app/sinaf-ejb/DocumentoLancamentoServiceImpl
	java:module/DocumentoLancamentoServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:app/sinaf-ejb/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:module/RelatoriosServiceImpl!br.gov.caixa.bsb.sinaf.service.RelatoriosService
	java:global/sinaf-web/sinaf-ejb/RelatoriosServiceImpl
	java:app/sinaf-ejb/RelatoriosServiceImpl
	java:module/RelatoriosServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AnexoLancamentoGestorServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:app/sinaf-ejb/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:module/AnexoLancamentoGestorServiceImpl!br.gov.caixa.bsb.sinaf.service.AnexoLancamentoGestorService
	java:global/sinaf-web/sinaf-ejb/AnexoLancamentoGestorServiceImpl
	java:app/sinaf-ejb/AnexoLancamentoGestorServiceImpl
	java:module/AnexoLancamentoGestorServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'EntidadeServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:app/sinaf-ejb/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:module/EntidadeServiceImpl!br.gov.caixa.bsb.sinaf.service.EntidadeService
	java:global/sinaf-web/sinaf-ejb/EntidadeServiceImpl
	java:app/sinaf-ejb/EntidadeServiceImpl
	java:module/EntidadeServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DadosAbertosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:app/sinaf-ejb/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:module/DadosAbertosServiceImpl!br.gov.caixa.bsb.sinaf.service.DadosAbertosService
	java:global/sinaf-web/sinaf-ejb/DadosAbertosServiceImpl
	java:app/sinaf-ejb/DadosAbertosServiceImpl
	java:module/DadosAbertosServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'AutorizacaoDocumentoContabilRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:app/sinaf-ejb/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:module/AutorizacaoDocumentoContabilRepository!br.gov.caixa.bsb.sinaf.data.AutorizacaoDocumentoContabilRepository
	java:global/sinaf-web/sinaf-ejb/AutorizacaoDocumentoContabilRepository
	java:app/sinaf-ejb/AutorizacaoDocumentoContabilRepository
	java:module/AutorizacaoDocumentoContabilRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoImportadoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:app/sinaf-ejb/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:module/ArquivoImportadoServiceImpl!br.gov.caixa.bsb.sinaf.service.ArquivoImportadoService
	java:global/sinaf-web/sinaf-ejb/ArquivoImportadoServiceImpl
	java:app/sinaf-ejb/ArquivoImportadoServiceImpl
	java:module/ArquivoImportadoServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'FechamentoMesRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:app/sinaf-ejb/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:module/FechamentoMesRepository!br.gov.caixa.bsb.sinaf.data.FechamentoMesRepository
	java:global/sinaf-web/sinaf-ejb/FechamentoMesRepository
	java:app/sinaf-ejb/FechamentoMesRepository
	java:module/FechamentoMesRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'DisparoAutomaticoMessageriaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:app/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:module/DisparoAutomaticoMessageriaServiceImpl!br.gov.caixa.bsb.sinaf.service.DisparoAutomaticoMessageriaService
	java:global/sinaf-web/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl
	java:app/sinaf-ejb/DisparoAutomaticoMessageriaServiceImpl
	java:module/DisparoAutomaticoMessageriaServiceImpl

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:app/sinaf-ejb/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:module/RelatoriosRepository!br.gov.caixa.bsb.sinaf.data.RelatoriosRepository
	java:global/sinaf-web/sinaf-ejb/RelatoriosRepository
	java:app/sinaf-ejb/RelatoriosRepository
	java:module/RelatoriosRepository

[0m[0m17:10:56,696 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoAuditoriaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:app/sinaf-ejb/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:module/ParametroServicoAuditoriaServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametroServicoAuditoriaService
	java:global/sinaf-web/sinaf-ejb/ParametroServicoAuditoriaServiceImpl
	java:app/sinaf-ejb/ParametroServicoAuditoriaServiceImpl
	java:module/ParametroServicoAuditoriaServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ProcessamentoPreviaEspecialRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:app/sinaf-ejb/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:module/ProcessamentoPreviaEspecialRepository!br.gov.caixa.bsb.sinaf.data.ProcessamentoPreviaEspecialRepository
	java:global/sinaf-web/sinaf-ejb/ProcessamentoPreviaEspecialRepository
	java:app/sinaf-ejb/ProcessamentoPreviaEspecialRepository
	java:module/ProcessamentoPreviaEspecialRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeResponsavelAutorizacaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:module/UnidadeResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository
	java:global/sinaf-web/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/UnidadeResponsavelAutorizacaoRepository
	java:module/UnidadeResponsavelAutorizacaoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroRotinaUnidadeElaboracaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:module/ParametroRotinaUnidadeElaboracaoRepository!br.gov.caixa.bsb.sinaf.data.ParametroRotinaUnidadeElaboracaoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository
	java:app/sinaf-ejb/ParametroRotinaUnidadeElaboracaoRepository
	java:module/ParametroRotinaUnidadeElaboracaoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServicoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:app/sinaf-ejb/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:module/ParametroServicoRepository!br.gov.caixa.bsb.sinaf.data.ParametroServicoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroServicoRepository
	java:app/sinaf-ejb/ParametroServicoRepository
	java:module/ParametroServicoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroProcessoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:app/sinaf-ejb/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:module/ParametroProcessoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.ParametroProcessoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/ParametroProcessoDocumentoRepository
	java:app/sinaf-ejb/ParametroProcessoDocumentoRepository
	java:module/ParametroProcessoDocumentoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'InformacaoSistemaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:app/sinaf-ejb/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:module/InformacaoSistemaRepository!br.gov.caixa.bsb.sinaf.data.InformacaoSistemaRepository
	java:global/sinaf-web/sinaf-ejb/InformacaoSistemaRepository
	java:app/sinaf-ejb/InformacaoSistemaRepository
	java:module/InformacaoSistemaRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RoteiroServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:app/sinaf-ejb/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:module/RoteiroServiceImpl!br.gov.caixa.bsb.sinaf.service.RoteiroService
	java:global/sinaf-web/sinaf-ejb/RoteiroServiceImpl
	java:app/sinaf-ejb/RoteiroServiceImpl
	java:module/RoteiroServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'LedServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:app/sinaf-ejb/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:module/LedServiceImpl!br.gov.caixa.bsb.sinaf.service.LedService
	java:global/sinaf-web/sinaf-ejb/LedServiceImpl
	java:app/sinaf-ejb/LedServiceImpl
	java:module/LedServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoContainer' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:app/sinaf-ejb/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:module/ArquivoContainer!br.gov.caixa.bsb.sinaf.service.impl.ArquivoContainer
	java:global/sinaf-web/sinaf-ejb/ArquivoContainer
	java:app/sinaf-ejb/ArquivoContainer
	java:module/ArquivoContainer

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'TipoAcaoDocumentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:app/sinaf-ejb/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:module/TipoAcaoDocumentoRepository!br.gov.caixa.bsb.sinaf.data.TipoAcaoDocumentoRepository
	java:global/sinaf-web/sinaf-ejb/TipoAcaoDocumentoRepository
	java:app/sinaf-ejb/TipoAcaoDocumentoRepository
	java:module/TipoAcaoDocumentoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'RotinaSistemaServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:app/sinaf-ejb/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:module/RotinaSistemaServiceImpl!br.gov.caixa.bsb.sinaf.service.RotinaSistemaService
	java:global/sinaf-web/sinaf-ejb/RotinaSistemaServiceImpl
	java:app/sinaf-ejb/RotinaSistemaServiceImpl
	java:module/RotinaSistemaServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametroRegimeAlcadaRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:app/sinaf-ejb/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:module/ParametroRegimeAlcadaRepository!br.gov.caixa.bsb.sinaf.data.ParametroRegimeAlcadaRepository
	java:global/sinaf-web/sinaf-ejb/ParametroRegimeAlcadaRepository
	java:app/sinaf-ejb/ParametroRegimeAlcadaRepository
	java:module/ParametroRegimeAlcadaRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'PesquisaDocumentoLancamentoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:app/sinaf-ejb/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:module/PesquisaDocumentoLancamentoRepository!br.gov.caixa.bsb.sinaf.data.PesquisaDocumentoLancamentoRepository
	java:global/sinaf-web/sinaf-ejb/PesquisaDocumentoLancamentoRepository
	java:app/sinaf-ejb/PesquisaDocumentoLancamentoRepository
	java:module/PesquisaDocumentoLancamentoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'GrupoResponsavelAutorizacaoRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:module/GrupoResponsavelAutorizacaoRepository!br.gov.caixa.bsb.sinaf.data.GrupoResponsavelAutorizacaoRepository
	java:global/sinaf-web/sinaf-ejb/GrupoResponsavelAutorizacaoRepository
	java:app/sinaf-ejb/GrupoResponsavelAutorizacaoRepository
	java:module/GrupoResponsavelAutorizacaoRepository

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'historicoDataLimiteParametroServicoServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:app/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:module/historicoDataLimiteParametroServicoServiceImpl!br.gov.caixa.bsb.sinaf.service.HistoricoDataLimiteParametroServicoService
	java:global/sinaf-web/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl
	java:app/sinaf-ejb/historicoDataLimiteParametroServicoServiceImpl
	java:module/historicoDataLimiteParametroServicoServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'ParametrosServiceImpl' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:app/sinaf-ejb/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:module/ParametrosServiceImpl!br.gov.caixa.bsb.sinaf.service.ParametrosService
	java:global/sinaf-web/sinaf-ejb/ParametrosServiceImpl
	java:app/sinaf-ejb/ParametrosServiceImpl
	java:module/ParametrosServiceImpl

[0m[0m17:10:56,697 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'LedRepository' in deployment unit 'subdeployment "sinaf-ejb.jar" of deployment "sinaf-web.ear"' are as follows:

	java:global/sinaf-web/sinaf-ejb/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:app/sinaf-ejb/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:module/LedRepository!br.gov.caixa.bsb.sinaf.data.LedRepository
	java:global/sinaf-web/sinaf-ejb/LedRepository
	java:app/sinaf-ejb/LedRepository
	java:module/LedRepository

[0m[0m17:10:57,190 INFO  [org.jboss.weld.Version] (MSC service thread 1-6) WELD-000900: 2.4.7 (redhat)
[0m[0m17:10:57,599 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started client-mappings cache from ejb container
[0m[0m17:10:59,289 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started default-server cache from web container
[0m[0m17:10:59,301 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0002: Started sinaf-web.ear.sinaf3-web.war cache from web container
[0m[0m17:11:00,111 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 64) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sinaf-web.ear/sinaf-ejb.jar#db2SinafDS'
[0m[0m17:11:01,423 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 64) HHH000400: Using dialect: br.gov.caixa.bsb.sinaf.dialect.DB2400FixedDialect
[0m[0m17:11:01,591 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 64) Envers integration enabled? : true
[0m[33m17:11:02,702 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 64) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sinaf.model.ParametroGeralDocumentoProdutoPK
[0m[33m17:11:02,702 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 64) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sinaf.model.ParametroGeralDocumentoProdutoPK
[0m[33m17:11:02,705 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 64) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sinaf.model.ParametroServicoUnidadeAutorizadoraPK
[0m[33m17:11:02,705 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 64) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sinaf.model.ParametroServicoUnidadeAutorizadoraPK
[0m[0m17:11:03,507 INFO  [org.hibernate.tuple.PojoInstantiator] (ServerService Thread Pool -- 64) HHH000182: No default (no-argument) constructor for class: br.gov.caixa.bsb.sinaf.model.TipoMensagemErroDocumento (class must be instantiated by Interceptor)
[0m[0m17:11:04,285 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 64) HHH000397: Using ASTQueryTranslatorFactory
[0m[33m17:11:04,506 WARN  [org.hibernate.dialect.function.TemplateRenderer] (ServerService Thread Pool -- 64) HHH000174: Function template anticipated 4 arguments, but 1 arguments encountered
[0m[33m17:11:04,655 WARN  [org.hibernate.dialect.function.TemplateRenderer] (ServerService Thread Pool -- 64) HHH000174: Function template anticipated 4 arguments, but 1 arguments encountered
[0m[0m17:11:09,490 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Iniciando servi?o de carga autom?tica de registros.
[0m[0m17:11:09,491 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> endpoint: https://sifwc.des.coredf.caixa
[0m[0m17:11:09,496 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> trustStore: /opt/jboss/standalone/configuration/sinaf-des.jks
[0m[0m17:11:09,496 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> trustStorePassword: vavb0dISit33j9
[0m[0m17:11:09,496 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> keyStore: /opt/jboss/standalone/configuration/sinaf-des.jks
[0m[0m17:11:09,497 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> keyStorePassword: vavb0dISit33j9
[0m[0m17:11:09,497 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB502_ESTADO_DCMTO_CONTABIL.
[0m[0m17:11:09,696 INFO  [io.undertow.websockets.jsr] (ServerService Thread Pool -- 120) UT026003: Adding annotated server endpoint class br.gov.caixa.bsb.sinaf.util.NotificacaoProcessamentoWS for path /WebSocketEndPoint/{nuMatricula}
[0m[0m17:11:09,927 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 120) Initializing Mojarra 2.2.13.SP6  for context '/sinaf3-web'
[0m[0m17:11:10,201 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB507_TIPO_UNDDE_RSPNL.
[0m[0m17:11:10,217 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB513_TIPO_ACAO_DCMTO_CNTBL.
[0m[0m17:11:11,391 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Atualizando nome do tipo de a??o 59 - De "Autorizar Lan?amento Gestor" para "Autorizar Lan?amento Gestor "
[0m[0m17:11:11,493 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB517_TIPO_PERFIL_USUARIO.
[0m[0m17:11:11,716 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB519_TPO_GRUPO_RSPNL_ATRZO.
[0m[0m17:11:11,782 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB527_INFORMACAO_SISTEMA.
[0m[0m17:11:11,904 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB530_PRCNO_PREVIA_ESPECIAL.
[0m[0m17:11:11,991 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Verificando tabela NAFTB552_FUNCIONALIDADE.
[0m[0m17:11:12,011 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Desligando log apache PDFBox: org.apache.pdfbox
[0m[0m17:11:12,011 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Atualizando chave publica
[0m[0m17:11:12,389 INFO  [br.gov.caixa.bsb.sinaf.service.impl.ValidadorSegurancaToken] (ServerService Thread Pool -- 111) -> Chave publica do servidor: https://login.des.caixa/auth/ atualizada com sucesso.
[0m[0m17:11:12,389 INFO  [br.gov.caixa.bsb.sinaf.service.impl.CargaAutomaticaServiceImpl] (ServerService Thread Pool -- 111) -> Finalizando servi?o de carga autom?tica.
[0m[33m17:11:12,669 WARN  [io.undertow.servlet] (ServerService Thread Pool -- 120) UT015020: Path /rs/* is secured for some HTTP methods, however it is not secured for [TRACE, HEAD, DELETE, CONNECT]
[0m[0m17:11:13,686 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 120) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.bsb.sinaf.rest.ApplicationConfig$Proxy$_$$_WeldClientProxy
[0m[33m17:11:13,786 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 120) RESTEASY002155: Provider class org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider is already registered.  2nd registration is being ignored.
[0m[33m17:11:13,799 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 120) RESTEASY002155: Provider class io.swagger.jaxrs.listing.SwaggerSerializers is already registered.  2nd registration is being ignored.
[0m[0m17:11:14,136 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 120) WFLYUT0021: Registered web context: '/sinaf3-web' for server 'default-server'
[0m[0m17:11:14,181 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 38) WFLYSRV0010: Deployed "sinaf-web.ear" (runtime-name : "sinaf-web.ear")
[0m[0m17:11:14,384 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m17:11:14,388 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
[0m[0m17:11:14,388 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
[0m[0m17:11:14,388 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) started in 31003ms - Started 4613 of 4811 services (365 services are lazy, passive or on-demand)
[0m[0m17:11:21,483 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-2) pesquisarListaDocumento
[0m[0m17:11:21,505 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-2) -> Iniciando busca do usuario C891,494
[0m[0m17:11:21,520 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UnidadeServiceImpl] (default task-2) -> Iniciando consulta de Unidade Ativa
[0m[0m17:11:21,522 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-2) -> Query recuperar unidade numero 7,824
[0m[0m17:11:21,535 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-2) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:21,540 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-2) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:21,582 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-2) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:27,933 INFO  [br.gov.caixa.bsb.sinaf.rest.UnidadeRS] (default task-3) recuperarUnidadeConsultaDocumento
[0m[0m17:11:27,993 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-4) pesquisarListaDocumento
[0m[0m17:11:27,994 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-4) -> Iniciando busca do usuario C891,494
[0m[0m17:11:27,994 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-4) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:27,995 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-4) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:28,001 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-4) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:28,041 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-5) recuperarQuantidadeDocumentosNaPesquisa
[0m[0m17:11:28,042 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-5) -> Iniciando busca do usuario C891,494
[0m[0m17:11:28,042 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-5) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:28,042 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-5) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:28,066 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-5) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:28,071 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido excluir o documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m17:11:28,096 INFO  [br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository] (default task-4) -> Query recuperar Parametro Unidade Elaboracao Origem com Filtro
[0m[0m17:11:28,105 INFO  [br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository] (default task-4) -> Finalizando recuperar Parametro Unidade Elaboracao Origem com Filtro
[0m[0m17:11:28,106 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m17:11:28,106 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido finalizar o documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite a sua finaliza??o.
[0m[0m17:11:28,115 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository] (default task-4) -> Query recuperar lista de unidades respons?veis por documento DLE.2.2.2026.4.674.
[0m[0m17:11:28,125 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository] (default task-4) -> Finalizando recuperar lista de unidades respons?veis.
[0m[0m17:11:28,125 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido autorizacao do gestor no documento DLE.2.2.2026.4.674 pelo motivo: O usu?rio n?o est? lotado na unidade respons?vel pela autoriza??o do documento.
[0m[0m17:11:28,126 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido o estorno do documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m17:11:28,138 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido excluir o documento DLE.2.2.2026.4.673 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m17:11:28,142 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m17:11:28,142 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido finalizar o documento DLE.2.2.2026.4.673 pelo motivo: A situa??o do documento n?o permite a sua finaliza??o.
[0m[0m17:11:28,145 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido autorizacao do gestor no documento DLE.2.2.2026.4.673 pelo motivo: O usu?rio que finalizou o documento n?o tem permiss?o para  autoriz?-lo.
[0m[0m17:11:28,146 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido o estorno do documento DLE.2.2.2026.4.673 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m17:11:28,154 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido excluir o documento DLE.2.2.2026.4.672 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m17:11:28,167 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m17:11:28,167 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido finalizar o documento DLE.2.2.2026.4.672 pelo motivo: A situa??o do documento n?o permite a sua finaliza??o.
[0m[0m17:11:28,172 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido autorizacao do gestor no documento DLE.2.2.2026.4.672 pelo motivo: O usu?rio que finalizou o documento n?o tem permiss?o para  autoriz?-lo.
[0m[0m17:11:28,172 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido o estorno do documento DLE.2.2.2026.4.672 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m17:11:28,196 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido excluir o documento DLE.2.2.2026.4.671 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m17:11:28,200 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m17:11:28,200 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido finalizar o documento DLE.2.2.2026.4.671 pelo motivo: A situa??o do documento n?o permite a sua finaliza??o.
[0m[0m17:11:28,204 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido autorizacao do gestor no documento DLE.2.2.2026.4.671 pelo motivo: O usu?rio que finalizou o documento n?o tem permiss?o para  autoriz?-lo.
[0m[0m17:11:28,204 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-4) -> N?o ? permitido o estorno do documento DLE.2.2.2026.4.671 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m17:11:30,155 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-6) Detalhando recuperarDocumentoDetalhamento
[0m[0m17:11:30,156 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Iniciando busca do usuario C891,494
[0m[0m17:11:30,156 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:30,156 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-6) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:30,161 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-6) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:30,188 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-6) -> N?o ? permitido excluir o documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite a exclus?o.
[0m[0m17:11:30,199 INFO  [br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository] (default task-6) -> Query recuperar Parametro Unidade Elaboracao Origem com Filtro
[0m[0m17:11:30,203 INFO  [br.gov.caixa.bsb.sinaf.data.ParametroUnidadeElaboracaoRepository] (default task-6) -> Finalizando recuperar Parametro Unidade Elaboracao Origem com Filtro
[0m[0m17:11:30,203 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-6) -> permiteExibirFinalizarDocumento INICIO 
[0m[0m17:11:30,203 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-6) -> N?o ? permitido finalizar o documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite a sua finaliza??o.
[0m[0m17:11:30,211 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository] (default task-6) -> Query recuperar lista de unidades respons?veis por documento DLE.2.2.2026.4.674.
[0m[0m17:11:30,215 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeResponsavelAutorizacaoRepository] (default task-6) -> Finalizando recuperar lista de unidades respons?veis.
[0m[0m17:11:30,215 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-6) -> N?o ? permitido autorizacao do gestor no documento DLE.2.2.2026.4.674 pelo motivo: O usu?rio n?o est? lotado na unidade respons?vel pela autoriza??o do documento.
[0m[0m17:11:30,220 INFO  [br.gov.caixa.bsb.sinaf.service.impl.PermissaoServiceImpl] (default task-6) -> N?o ? permitido o estorno do documento DLE.2.2.2026.4.674 pelo motivo: A situa??o do documento n?o permite estorno.
[0m[0m17:11:30,243 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Iniciando busca do usuario C891,494
[0m[0m17:11:30,243 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:30,253 INFO  [br.gov.caixa.bsb.sinaf.data.RotinaRepository] (default task-6) -> Query recuperar Rotina Por Id
[0m[0m17:11:30,261 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Iniciando busca do usuario C891,494
[0m[0m17:11:30,261 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-6) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:32,520 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-7) -> Iniciando busca do usuario C891,494
[0m[0m17:11:32,520 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-7) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:32,520 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-7) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:32,525 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-7) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:32,530 INFO  [br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository] (default task-7) -> Query recuperar arquivos anexos
[0m[0m17:11:32,532 INFO  [br.gov.caixa.bsb.sinaf.data.AnexoDocumentoLancamentoRepository] (default task-7) -> Finalizando recuperar arquivos anexos
[0m[0m17:11:32,619 INFO  [br.gov.caixa.bsb.sinaf.rest.DocumentoLancamentoRS] (default task-9) recuperarHistorico
[0m[33m17:11:32,676 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (default task-10) RESTEASY002142: Multiple resource methods match request "GET /usuario/". Selecting one. Matching methods: [public javax.ws.rs.core.Response br.gov.caixa.bsb.sinaf.rest.UsuarioRS.recuperarUsuarioAutenticado(), public javax.ws.rs.core.Response br.gov.caixa.bsb.sinaf.rest.UsuarioRS.recuperarUsuarioLogado()]
[0m[0m17:11:32,684 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-10) -> Iniciando busca do usuario C891,494
[0m[0m17:11:32,684 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-10) -> Usuario C891,494 recuperado com sucesso 
[0m[0m17:11:32,684 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-10) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:32,699 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-10) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:32,700 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-10) -> Query recuperar de unidade vinculada ao usu?rio 891494
[0m[0m17:11:32,707 INFO  [br.gov.caixa.bsb.sinaf.data.UnidadeRepository] (default task-10) -> Finalizando recuperar de unidade vinculada ao usu?rio.
[0m[0m17:11:32,709 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-11) -> Iniciando busca do usuario C891,494
[0m[0m17:11:32,709 INFO  [br.gov.caixa.bsb.sinaf.service.impl.UsuarioServiceImpl] (default task-11) -> Usuario C891,494 recuperado com sucesso 
[0m
