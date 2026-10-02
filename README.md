OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
Workloads
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
Storage
Builds
Observe
Compute
User Management
Administration

Project: sicql-des
Pods
Pod details
Pod
P
sicql-mapsfeeder-des-1-j5g47
CrashLoopBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 9 events
Older events are not stored.
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:15
Generated from kubelet on ceadecldlx052.nprd.caixa
5 times in the last 1 minute
Back-off restarting failed container
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:14
Generated from kubelet on ceadecldlx052.nprd.caixa
3 times in the last 3 minutes
Created container sicql-mapsfeeder-des
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:14
Generated from kubelet on ceadecldlx052.nprd.caixa
3 times in the last 3 minutes
Started container sicql-mapsfeeder-des
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:14
Generated from kubelet on ceadecldlx052.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13" in 55.649991ms (55.664156ms including waiting)
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:14
Generated from kubelet on ceadecldlx052.nprd.caixa
3 times in the last 3 minutes
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13"
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:13
Generated from kubelet on ceadecldlx052.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13" in 56.481588ms (56.491113ms including waiting)
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:12
Generated from kubelet on ceadecldlx052.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapsfeeder:lts-19.7.13" in 4.903857818s (4.903870906s including waiting)
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:12
Generated from multus
Add eth0 [25.3.24.45/23] from openshift-sdn
PodPsicql-mapsfeeder-des-1-j5g47
NamespaceNSsicql-des
2 de out. de 2026, 17:12
Generated from default-scheduler
Successfully assigned sicql-des/sicql-mapsfeeder-des-1-j5g47 to ceadecldlx052.nprd.caixa


Security mode LDAP
Missing required environment variable for LDAP: LDAP_BIND_DN.
Missing required environment variable for LDAP: LDAP_BIND_PASSWORD.
database: postgresql
No custom JAVA_OPTS defined, building by parameters.
Resulting JBOSS_JAVA_SIZING=-XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m
No product license found, ignoring.
Executing module specific pre-initialization.
[0m17:14:35,217 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 2.0.0.Final
[0m[0m17:14:35,333 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.13.Final
[0m[0m17:14:35,340 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final
[0m[0m17:14:35,536 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) starting
[0m[0m17:14:37,857 INFO  [org.wildfly.security] (ServerService Thread Pool -- 27) ELY00001: WildFly Elytron version 1.18.1.Final
[0m[33m17:14:40,121 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-5) WFLYELY00023: KeyStore file '/opt/wildfly/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m17:14:40,126 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/wildfly/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m17:14:40,220 INFO  [org.jboss.as.patching] (MSC service thread 1-5) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
[0m[0m17:14:40,620 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m17:14:40,632 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) started in 5408ms - Started 50 of 73 services (24 services are lazy, passive or on-demand)
[0mThe batch executed successfully
[0m17:14:41,531 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) stopped in 193ms
[0m[0m17:14:43,637 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 2.0.0.Final
[0m[0m17:14:43,750 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.13.Final
[0m[0m17:14:43,756 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final
[0m[0m17:14:43,953 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) starting
[0m[0m17:14:46,151 INFO  [org.wildfly.security] (ServerService Thread Pool -- 27) ELY00001: WildFly Elytron version 1.18.1.Final
[0m[33m17:14:48,426 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY00023: KeyStore file '/opt/wildfly/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m17:14:48,437 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/wildfly/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m17:14:48,519 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
[0m[0m17:14:48,747 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m17:14:48,815 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) started in 5100ms - Started 50 of 73 services (24 services are lazy, passive or on-demand)
[0mThe batch executed successfully
[0m17:14:49,151 INFO  [org.jboss.as] (MSC service thread 1-5) WFLYSRV0050: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) stopped in 23ms
[0mNo Debug log packages found. Ignoring
[0m17:14:51,134 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 2.0.0.Final
[0m[0m17:14:51,325 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.13.Final
[0m[0m17:14:51,331 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final
[0m[0m17:14:51,528 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) starting
[0m[0m17:14:54,143 INFO  [org.wildfly.security] (ServerService Thread Pool -- 27) ELY00001: WildFly Elytron version 1.18.1.Final
[0m[33m17:14:56,745 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY00023: KeyStore file '/opt/wildfly/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m17:14:56,749 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-8) WFLYELY01084: KeyStore /opt/wildfly/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m17:14:56,819 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
[0m[0m17:14:57,227 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m17:14:57,228 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) started in 6006ms - Started 50 of 73 services (24 services are lazy, passive or on-demand)
[0mWARNING: redeployment is required on deployment [feeder.war]
[0m17:14:57,532 INFO  [org.jboss.as.repository] (CLI command executor) WFLYDR0001: Content added at location /opt/wildfly/standalone/data/content/8b/dcce8ce3f995816e10a53274bfcccff7a64329/content
[0mThe batch executed successfully
[0m17:14:57,750 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) stopped in 112ms
[0m=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/wildfly

  JAVA: /usr/java/openjdk-8/bin/java

  JAVA_OPTS:  -server -XX:+UseG1GC -XX:+UseGCOverheadLimit -XX:-OmitStackTraceInFastThrow -XX:+UseStringDeduplication -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/maps/data -Duser.timezone=America/Fortaleza -Djava.awt.headless=true -Xmx1g -XX:MaxMetaspaceSize=256m -XX:ReservedCodeCacheSize=128m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true 

=========================================================================

[0m17:14:58,646 INFO  [org.jboss.modules] (main) JBoss Modules version 2.0.0.Final
[0m[0m17:14:59,917 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final
[0m[0m17:14:59,924 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final
[0m[0m17:15:00,322 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: WildFly Full 26.0.0.Final (WildFly Core 18.0.0.Final) starting
[0m[0m17:15:03,144 INFO  [org.wildfly.security] (ServerService Thread Pool -- 27) ELY00001: WildFly Elytron version 1.18.1.Final
[0m[0m17:15:05,545 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 18) WFLYDR0001: Content added at location /opt/wildfly/standalone/data/content/19/54477ae623860a608b950c37c3af4c3d25886b/content
[0m[0m17:15:06,240 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 18) WFLYDR0001: Content added at location /opt/wildfly/standalone/data/content/25/f9d762db9b61b791c70d474d06ca2e55be2122/content
[0m[0m17:15:06,254 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m17:15:06,266 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.5.Final
[0m[0m17:15:06,317 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.5.Final
[0m[0m17:15:06,420 INFO  [org.jboss.remoting] (MSC service thread 1-6) JBoss Remoting version 5.0.23.Final
[0m[0m17:15:06,525 INFO  [org.wildfly.extension.microprofile.config.smallrye] (ServerService Thread Pool -- 64) WFLYCONF0001: Activating MicroProfile Config Subsystem
[0m[33m17:15:06,530 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m17:15:06,531 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 52) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
[0m[0m17:15:06,532 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m17:15:06,533 INFO  [org.wildfly.extension.microprofile.jwt.smallrye] (ServerService Thread Pool -- 65) WFLYJWT0001: Activating MicroProfile JWT Subsystem
[0m[0m17:15:06,529 INFO  [org.wildfly.extension.microprofile.opentracing] (ServerService Thread Pool -- 66) WFLYTRACEXT0001: Activating MicroProfile OpenTracing Subsystem
[0m[0m17:15:06,527 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m17:15:06,536 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 67) WFLYNAM0001: Activating Naming Subsystem
[0m[0m17:15:06,538 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 53) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m17:15:06,533 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 4.7.4.Final
[0m[0m17:15:06,544 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
[0m[0m17:15:06,656 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m17:15:06,718 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 63) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m17:15:06,732 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.3)
[0m[0m17:15:06,723 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 61) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m17:15:06,822 INFO  [org.jboss.as.naming] (MSC service thread 1-6) WFLYNAM0003: Starting Naming Service
[0m[0m17:15:06,922 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-7) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m17:15:06,927 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0003: Undertow 2.2.14.Final starting
[0m[31m17:15:07,116 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 71) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "resource-adapters"),
    ("resource-adapter" => "activemq-rar"),
    ("config-properties" => "ServerUrl")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_URL}'"
[0m[0m17:15:07,121 INFO  [org.jboss.as.connector] (MSC service thread 1-8) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.3.Final)
[0m[31m17:15:07,121 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 71) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "resource-adapters"),
    ("resource-adapter" => "activemq-rar"),
    ("config-properties" => "UserName")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_USERNAME}'"
[0m[31m17:15:07,122 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 71) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "resource-adapters"),
    ("resource-adapter" => "activemq-rar"),
    ("config-properties" => "Password")
]) - failure description: "WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_PASSWORD}'"
[0m[0m17:15:07,324 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m17:15:07,325 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[33m17:15:07,626 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-8) WFLYELY00023: KeyStore file '/opt/wildfly/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[0m17:15:07,830 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 18.3)
[0m[33m17:15:07,831 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/wildfly/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m17:15:07,831 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m17:15:08,134 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0012: Started server default-server.
[0m[0m17:15:08,216 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/wildfly/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m17:15:08,236 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
[0m[0m17:15:08,238 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
[0m[0m17:15:08,248 INFO  [org.jboss.as.ejb3] (MSC service thread 1-6) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
[0m[0m17:15:08,315 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
[0m[0m17:15:08,417 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m17:15:08,925 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m17:15:09,019 INFO  [org.jboss.as.patching] (MSC service thread 1-8) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
[0m[0m17:15:09,027 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/wildfly/standalone/deployments
[0m[0m17:15:09,032 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "feeder.war" (runtime-name: "feeder.war")
[0m[0m17:15:09,037 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "activemq.rar" (runtime-name: "activemq.rar")
[0m[0m17:15:09,129 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m17:15:09,317 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.4.4.Final (Apache CXF 3.4.5) 
[0m[0m17:15:09,327 INFO  [org.jboss.as.connector.subsystems.datasources.AbstractDataSourceService$AS7DataSourceDeployer] (MSC service thread 1-3) IJ020018: Enabling <validate-on-match> for java:jboss/datasources/odinDS
[0m[0m17:15:09,423 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0001: Bound data source [java:jboss/datasources/odinDS]
[0m[0m17:15:19,832 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-8) IJ020001: Required license terms for file:/opt/wildfly/standalone/tmp/vfs/temp/temp4a81ddb1a82bacad/content-b79bc773f6159c76/contents/
[0m[33m17:15:20,330 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-8) IJ020017: Invalid archive: activemq.rar
[0m[33m17:15:20,331 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-8) Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for AdminObject.
Code: Class: org.apache.activemq.pool.XaPooledConnectionFactory Property: tmFromJndi Type: boolean

[0m[0m17:15:20,430 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020001: Required license terms for file:/opt/wildfly/standalone/tmp/vfs/temp/temp4a81ddb1a82bacad/content-b79bc773f6159c76/contents/
[0m[0m17:15:20,528 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0007: Registered connection factory java:jboss/DefaultJMSConnectionFactory
[0m[33m17:15:20,530 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020016: Missing <recovery> element. XA recovery disabled for: java:jboss/DefaultJMSConnectionFactory
[0m[0m17:15:20,531 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0006: Registered admin object at java:jboss/activemq/queue/PegasusDigester
[0m[0m17:15:20,532 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0006: Registered admin object at java:jboss/activemq/queue/PegasusPassivoDigester
[0m[0m17:15:20,533 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0006: Registered admin object at java:jboss/activemq/queue/FeederToPrecificador
[0m[33m17:15:21,035 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020017: Invalid archive: activemq.rar
[0m[33m17:15:21,035 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for AdminObject.
Code: Class: org.apache.activemq.pool.XaPooledConnectionFactory Property: tmFromJndi Type: boolean

[0m[0m17:15:21,036 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020002: Deployed: file:/opt/wildfly/standalone/tmp/vfs/temp/temp4a81ddb1a82bacad/content-b79bc773f6159c76/contents/
[0m[0m17:15:21,116 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0002: Bound Jakarta Connectors AdminObject [java:jboss/activemq/queue/PegasusDigester]
[0m[0m17:15:21,116 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Bound Jakarta Connectors AdminObject [java:jboss/activemq/queue/FeederToPrecificador]
[0m[0m17:15:21,116 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-5) WFLYJCA0002: Bound Jakarta Connectors AdminObject [java:jboss/activemq/queue/PegasusPassivoDigester]
[0m[0m17:15:21,117 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Bound Jakarta Connectors ConnectionFactory [java:jboss/DefaultJMSConnectionFactory]
[0m[0m17:15:21,929 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000128: Infinispan version: Infinispan 'Taedonggang' 12.1.7.Final
[0m[0m17:15:22,125 INFO  [org.infinispan.CONFIG] (MSC service thread 1-7) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m17:15:22,127 INFO  [org.infinispan.CONFIG] (MSC service thread 1-7) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m17:15:22,420 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m17:15:22,548 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000025: wakeUpInterval is <= 0, not starting expired purge thread
[0m[0m17:15:22,629 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 79) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m
