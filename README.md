[spssodr1@crjtqapllx036 bin]$ tail -f -n 0 /infra_app/logs/siset/server-crjtqapllx036.log
^C
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ tail -50 /opt/open/sso/7.3.0/standalone/log/server.log
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/open/sso/7.3.0/jboss-modules.jar -mp /opt/open/sso/7.3.0/modules org.jboss.as.standalone -Djboss.home.dir=/opt/open/sso/7.3.0 -Djboss.server.base.dir=/opt/open/sso/7.3.0/standalone -c standalone.xml -Djboss.server.name=siset_crjdeapllx053_inter_8080 -Djboss.as.management.blocking.timeout=1000
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = US
        user.dir = /opt/open/sso/7.3.0
        user.home = /export/home/spssodr1
        user.language = en
        user.name = spssodr1
        user.timezone = America/Sao_Paulo
2022-06-01 12:55:15,929 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms8192m -Xmx8192m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost=proxydes.caixa -DhttpRecaptchaProxyPort=80 -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost -Dorg.jboss.boot.log.file=/opt/open/sso/7.3.0/standalone/log/server.log -Dlogging.configuration=file:/opt/open/sso/7.3.0/standalone/configuration/logging.properties
2022-06-01 12:55:16,957 INFO  [org.wildfly.security] (ServerService Thread Pool -- 19) ELY00001: WildFly Elytron version 1.6.3.Final-redhat-00001
2022-06-01 12:55:17,625 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2022-06-01 12:55:17,629 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2022-06-01 12:55:17,680 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 26) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2022-06-01 12:55:17,793 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2022-06-01 12:55:17,797 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.6.6.Final-redhat-00001
2022-06-01 12:55:17,810 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.6.6.Final-redhat-00001
2022-06-01 12:55:17,994 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 36) WFLYCLINF0001: Activating Infinispan subsystem.
2022-06-01 12:55:18,000 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 38) WFLYRS0016: RESTEasy version 3.6.1.SP6-redhat-00001
2022-06-01 12:55:18,000 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 51) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2022-06-01 12:55:18,019 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 49) WFLYSEC0002: Activating Security Subsystem
2022-06-01 12:55:18,029 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 45) WFLYNAM0001: Activating Naming Subsystem
2022-06-01 12:55:18,054 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 37) WFLYIO001: Worker 'default' has auto-configured to 8 core threads with 64 task threads based on your 4 available processors
2022-06-01 12:55:18,064 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0003: Undertow 2.0.22.Final-redhat-00001 starting
2022-06-01 12:55:18,068 INFO  [org.jboss.remoting] (MSC service thread 1-6) JBoss Remoting version 5.0.12.Final-redhat-00001
2022-06-01 12:55:18,134 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
2022-06-01 12:55:18,203 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
2022-06-01 12:55:18,303 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.16.Final-redhat-00001)
2022-06-01 12:55:18,358 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
2022-06-01 12:55:18,363 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.driver.OracleDriver (version 11.2)
2022-06-01 12:55:18,465 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2022-06-01 12:55:18,497 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
2022-06-01 12:55:18,565 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0018: Started Driver service with driver-name = oracle
2022-06-01 12:55:18,608 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 16 (per class), which is derived from the number of CPUs on this host.
2022-06-01 12:55:18,614 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
2022-06-01 12:55:18,615 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDSinter]
2022-06-01 12:55:18,612 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 64 (per class), which is derived from thread worker pool sizing.
2022-06-01 12:55:18,615 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
2022-06-01 12:55:18,615 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-7) WFLYJCA0099: Unbound non-transactional data source: java:jboss/datasources/oraset
2022-06-01 12:55:18,616 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
2022-06-01 12:55:18,675 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2022-06-01 12:55:18,739 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/suporte' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2022-06-01 12:55:19,024 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
2022-06-01 12:55:19,098 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0018: Host default-host starting
2022-06-01 12:55:19,098 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-6) WFLYJCA0098: Bound non-transactional data source: java:jboss/datasources/oraset
2022-06-01 12:55:19,153 INFO  [org.jboss.as.patching] (MSC service thread 1-6) WFLYPAT0050: Red Hat Single Sign-On cumulative patch ID is: rh-sso-7.3.3.CP, one-off patches include: none
2022-06-01 12:55:19,237 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow HTTP listener default listening on 10.116.89.233:8080
[spssodr1@crjtqapllx036 bin]$
