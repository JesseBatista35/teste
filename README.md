Solicito no servidor 10.116.89.237 a remoção dentro do /opt/open/sso/7.3.0/standalone/configuration/standalone.xml da seguinte System Property
 
<property name="siset.properties.vault.keypass.rsa" value="ODjU5UBzpElfkv5vukkDeDJrNNMbA5"/>
 
 
Deverá ser feito o restart do jboss



p585600@10.116.89.237's password:
Could not chdir to home directory /export/home/p585600: No such file or directory
-bash-4.2$
-bash-4.2$
-bash-4.2$
-bash-4.2$
-bash-4.2$ ps -ef | grep jboss
p585600   33339  33111  0 16:34 pts/2    00:00:00 grep --color=auto jboss
spssodr1 118044      1  0 Aug31 ?        00:00:00 /bin/sh /opt/open/sso/7.3.0/bin/standalone.sh -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000
spssodr1 118170 118044  4 Aug31 ?        03:15:25 /opt/open/java/jdk1.8.0_121/bin/java -D[Standalone] -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms12288m -Xmx12288m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -XX:MaxGCPauseMillis=500 -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost=proxydes.caixa -DhttpRecaptchaProxyPort=80 -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost -javaagent:/opt/ca/introscope/10.1.0.15/wily/Agent.jar -Dcom.wily.introscope.agentProfile=/opt/ca/introscope/10.1.0.15/wily/core/config/IntroscopeAgent.jboss.profile -Djboss.modules.system.pkgs=com.wily,com.wily.* -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.1.1.jar -Dorg.jboss.boot.log.file=/opt/open/sso/7.3.0/standalone/log/server.log -Dlogging.configuration=file:/opt/open/sso/7.3.0/standalone/configuration/logging.properties -jar /opt/open/sso/7.3.0/jboss-modules.jar -mp /opt/open/sso/7.3.0/modules org.jboss.as.standalone -Djboss.home.dir=/opt/open/sso/7.3.0 -Djboss.server.base.dir=/opt/open/sso/7.3.0/standalone -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000
-bash-4.2$
-bash-4.2$
-bash-4.2$
