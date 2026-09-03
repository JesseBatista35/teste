[root@srjdeapllx075 /]# ps -ef | grep jboss
spssodr1  34465      1  0 16:38 ?        00:00:00 /bin/sh /opt/open/sso/7.3.0/bin/standalone.sh -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000
spssodr1  34593  34465 99 16:38 ?        00:00:05 java -D[Standalone] -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms12288m -Xmx12288m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -XX:MaxGCPauseMillis=500 -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost=proxydes.caixa -DhttpRecaptchaProxyPort=80 -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost -javaagent:/opt/ca/introscope/10.1.0.15/wily/Agent.jar -Dcom.wily.introscope.agentProfile=/opt/ca/introscope/10.1.0.15/wily/core/config/IntroscopeAgent.jboss.profile -Djboss.modules.system.pkgs=com.wily,com.wily.* -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.1.1.jar -Dorg.jboss.boot.log.file=/opt/open/sso/7.3.0/standalone/log/server.log -Dlogging.configuration=file:/opt/open/sso/7.3.0/standalone/configuration/logging.properties -jar /opt/open/sso/7.3.0/jboss-modules.jar -mp /opt/open/sso/7.3.0/modules org.jboss.as.standalone -Djboss.home.dir=/opt/open/sso/7.3.0 -Djboss.server.base.dir=/opt/open/sso/7.3.0/standalone -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000
root      34659  33549  0 16:38 pts/2    00:00:00 grep --color=auto jboss
[root@srjdeapllx075 /]#
[root@srjdeapllx075 /]#
[root@srjdeapllx075 /]# tail -f /opt/open/sso/7.3.0/standalone/log/server.log



deu certo me ajdua co ma nota para fechar a w.o
