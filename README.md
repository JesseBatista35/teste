
-sh-4.2$ nslookup 10.166.198.210
** server can't find 210.198.166.10.in-addr.arpa.: NXDOMAIN

-sh-4.2$ getnet hosts 10.116.198.210
-sh: getnet: comando não encontrado
-sh-4.2$ curl -v --connect-timeout 5 http://10.116.198.210:8080
* About to connect() to 10.116.198.210 port 8080 (#0)
*   Trying 10.116.198.210...
* Não há rota para o host
* Failed connect to 10.116.198.210:8080; Não há rota para o host
* Closing connection 0
curl: (7) Failed connect to 10.116.198.210:8080; Não há rota para o host
-sh-4.2$ ^C
-sh-4.2$ ps -ef | grep jboos
p585600   7940  7711  0 09:23 pts/0    00:00:00 grep --color=auto jboos
-sh-4.2$ ps -ef | grep java
p585600   7944  7711  0 09:23 pts/0    00:00:00 grep --color=auto java
jboss    14975 14835  0 Jul29 ?        00:05:44 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sisaq-web/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sisaq-web/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -c standalone-full-ha.xml
