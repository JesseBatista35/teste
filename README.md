
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# ps -ef | grep java
root      57090  56483  0 15:09 pts/1    00:00:00 grep --color=auto java
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# su - spssodr1
Last login: Fri Sep 11 11:55:30 -03 2026 on pts/1
[spssodr1@crjtqapllx036 ~]$ cd /opt/open/sso/7.3.0/bin
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start2.log 2>&1 &
[1] 57395
[spssodr1@crjtqapllx036 bin]$ tail -f /tmp/jboss_start2.log
  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/open/sso/7.3.0

  JAVA: /opt/open/java/jdk1.8.0_121/bin/java

  JAVA_OPTS:  -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms32768m -Xmx32768m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost="proxydes.caixa" -DhttpRecaptchaProxyPort="80" -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost="proxydes.caixa" -Dhttps.proxyPort="80" -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br|localhost" -Dhttp.proxyHost="proxydes.caixa" -Dhttp.proxyPort="80" -Dftp.proxyHost="proxydes.caixa" -Dftp.proxyPort="80" -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.3.1.jar

=========================================================================


