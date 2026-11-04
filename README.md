
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ ps -ef | grep jboos
p585600   546966  546939  0 09:21 pts/1    00:00:00 grep --color=auto jboos
[p585600@caddeapllx1580 ~]$ ps -ef | grep java
jboss     208993  208818  0 out30 ?        00:17:47 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sites/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sites/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sites -c standalone-full-ha.xml
p585600   546968  546939  0 09:21 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx1580 ~]$ getnet hosts 192.168.236.173
-sh: getnet: comando não encontrado
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ nslookup 192.168.236.173
** server can't find 173.236.168.192.in-addr.arpa: NXDOMAIN

[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ ip -4 addr show
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
2: ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    altname enp11s0
    inet 10.116.197.61/19 brd 10.116.223.255 scope global noprefixroute ens192
       valid_lft forever preferred_lft forever
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ cat /etc/hosts | grep -i bkp
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
