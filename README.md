Com o objetivo de identificar falha na aplicação, gentileza disponibilizar os logs do ambiente de desenvolvimento do siacc-tela branca

server.log
siacc-caddeapllx2725.log
sirot-log-caddeapllx2725.log
ceflib-log-caddeapllx2725.log

Data: 04/09/2026

Máquina:
"ip": "10.116.201.197"
"nome": "caddeapllx2725.agil.nprd.caixa.gov.br"



[p585600@cadsvitrlx100 ~]$ ssh 10.116.201.197
p585600@10.116.201.197's password:
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$ ps -ef | grep jboss
root      126798       1  0 set03 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     126801  126798  0 set03 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     126975  126801  0 set03 ?        00:01:41 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siacc-tela-branca/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=ISO-8859-1 -Dsun.jnu.encoding=ISO-8859-1 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
p585600   131922  131895  0 12:28 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$ ps -ef | grep java
jboss     126975  126801  0 set03 ?        00:01:41 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siacc-tela-branca/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=ISO-8859-1 -Dsun.jnu.encoding=ISO-8859-1 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
p585600   131924  131895  0 12:28 pts/0    00:00:00 grep --color=auto java
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$ ps -ef | grep siacc
root      126798       1  0 set03 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     126801  126798  0 set03 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     126975  126801  0 set03 ?        00:01:41 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siacc-tela-branca/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=ISO-8859-1 -Dsun.jnu.encoding=ISO-8859-1 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
p585600   131926  131895  0 12:28 pts/0    00:00:00 grep --color=auto siacc
[p585600@caddeapllx2725 ~]$ ps -ef | grep sirot
p585600   131930  131895  0 12:29 pts/0    00:00:00 grep --color=auto sirot
[p585600@caddeapllx2725 ~]$ ps -ef | grep ceflib
p585600   131932  131895  0 12:29 pts/0    00:00:00 grep --color=auto ceflib
[p585600@caddeapllx2725 ~]$ pwd
/home/p585600
[p585600@caddeapllx2725 ~]$ cd /opt/jboss-eap
[p585600@caddeapllx2725 jboss-eap]$ ls -la
total 544
drwxrwxr-x  15 jboss jboss    334 set  1 17:44 .
drwxr-xr-x.  4 root  root      36 dez 16  2025 ..
drwxrwxr-x   3 jboss jboss     27 jun 12  2023 appclient
drwxrwxr-x   4 jboss jboss   4096 set  3 19:38 bin
-rwxr-xr-x   1 jboss jboss    408 set  3 19:38 cefldap.ini
drwxr-xr-x   2 root  root      25 set  1 17:44 componentes
drwxrwxr-x   5 jboss jboss     52 jun 12  2023 docs
drwxrwxr-x   4 jboss jboss     38 jun 12  2023 domain
drwxrwxr-x   4 jboss jboss     57 jun 12  2023 .installation
drwxrwxr-x   2 jboss jboss     60 jun 12  2023 installation
-rwxrwxr-x   1 jboss jboss    419 jun 23  2021 JBossEULA.txt
-rwxrwxr-x   1 jboss jboss 508951 set 30  2024 jboss-modules.jar
-rwxrwxr-x   1 jboss jboss  26530 jun 23  2021 LICENSE.txt
drwxrwxr-x   3 jboss jboss     44 jun 12  2023 migration
drwxrwxr-x   3 jboss jboss     20 jun 12  2023 modules
drwxrwxr-x   8 jboss jboss     91 set 30  2024 standalone
drwxrwxr-x   2 jboss jboss     29 jun 12  2023 uninstaller
-rwxrwxr-x   1 jboss jboss     66 set 30  2024 version.txt
drwxrwxr-x   4 jboss jboss    158 jun 12  2023 welcome-content
drwxrwxr-x   3 jboss jboss     28 jun 12  2023 .well-known
[p585600@caddeapllx2725 jboss-eap]$
