
-sh-4.2$ ps aux | grep -i jboss
root      6463  0.0  0.0 146516  1580 ?        S    14:29   0:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss     6466  0.0  0.0 113384  1576 ?        Ss   14:29   0:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss     6602  2.8 13.4 4020924 1073784 ?     Sl   14:29   0:23 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  11902  0.0  0.0 112828   992 pts/0    S+   14:43   0:00 grep --color=auto -i jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo systemclt list-units --all | grep -iE "jboss|wildfly|eap"
sudo: systemclt: comando não encontrado
-sh-4.2$ ls -lah /opt/jboss-eap/standalone/log/
total 0
drwxr-xr-x 2 root  root  23 Mai 22 10:16 .
drwxrwxr-x 8 jboss jboss 91 Mai 22 10:16 ..
-rw-r--r-- 1 root  root   0 Mai 22 10:16 audit.log
-sh-4.2$ ls -lah /opt/jboss-eap/standalone/deployments//
total 70M
drwxrwxr-x 2 jboss jboss  260 Mai 25 14:30 .
drwxrwxr-x 8 jboss jboss   91 Mai 22 10:16 ..
-rw-r--r-- 1 jboss jboss  36M Mai 22 10:16 applicationinsights-agent.jar
-rw-r--r-- 1 jboss jboss   29 Mai 22 10:16 applicationinsights-agent.jar.deployed
-rw-r--r-- 1 jboss jboss  66K Mai 22 10:15 framework.jar
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:15 framework.jar.deployed
-rwxrwxr-x 1 jboss jboss 8,7K Jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss  22M Mai 22 10:16 SICMU-ear.ear
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:16 SICMU-ear.ear.deployed
-rw-r--r-- 1 jboss jboss  12M Mai 22 10:15 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:15 wmq.jmsra.rar.deployed
-sh-4.2$ ls -lah /opt/jboss-eap/standalone/deployments/
total 70M
drwxrwxr-x 2 jboss jboss  260 Mai 25 14:30 .
drwxrwxr-x 8 jboss jboss   91 Mai 22 10:16 ..
-rw-r--r-- 1 jboss jboss  36M Mai 22 10:16 applicationinsights-agent.jar
-rw-r--r-- 1 jboss jboss   29 Mai 22 10:16 applicationinsights-agent.jar.deployed
-rw-r--r-- 1 jboss jboss  66K Mai 22 10:15 framework.jar
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:15 framework.jar.deployed
-rwxrwxr-x 1 jboss jboss 8,7K Jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss  22M Mai 22 10:16 SICMU-ear.ear
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:16 SICMU-ear.ear.deployed
-rw-r--r-- 1 jboss jboss  12M Mai 22 10:15 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss   13 Mai 22 10:15 wmq.jmsra.rar.deployed
-sh-4.2$
