
[p585600@caddeapllx1992 logs]$ systemctl list-units --type=service | grep -i jboss
[p585600@caddeapllx1992 logs]$ systemctl list-unit-files | grep -i jboss
jboss-eap-standalone.service               enabled         disabled
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ tail -n 150 /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -Xlog:gc*:file="/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/mqjms.log -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

137748
[p585600@caddeapllx1992 logs]$ ^C
[p585600@caddeapllx1992 logs]$ cat /opt/jboss-eap/standalone/configuration/custom.sh
# Criar diretório caso não exista
mkdir -p /opt/httpd/conf.d

# Copiar o vhost
cp -f httpd/vhost.conf /opt/httpd/conf.d/vhost.conf

# Ajustar permissões
chown root:root /opt/httpd/conf.d/vhost.conf
chmod 644 /opt/httpd/conf.d/vhost.conf[p585600@caddeapllx1992 logs]$
