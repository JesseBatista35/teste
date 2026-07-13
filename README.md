
-sh-4.2$ ps -ef | grep jboss
root      6361     1  0 13:56 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siamc-dev-internet -c standalone-full-ha.xml
jboss     6364  6361  0 13:56 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siamc-dev-internet -c standalone-full-ha.xml
jboss     6586  6364  0 13:56 ?        00:00:31 java -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/siamc-dev-internet/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager,sun.security.ec -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.redhat.fips=false -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/com.sun.net.ssl.internal.ssl=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siamc-dev-internet -c standalone-full-ha.xml
p585600  16756 16557  0 15:48 pts/1    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo $JBOSS_HOME

-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -maxdepth 4 -iname "standalone.xml" 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -n 500 $JBOSS_HOME/standalone/log/server.log | grep -i -A 30 "siamc"
tail: não foi possível abrir “/standalone/log/server.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$ ls -la $JBOSS_HOME/standalone/deployments/ | grep siamc
ls: não é possível acessar /standalone/deployments/: Arquivo ou diretório não encontrado
-sh-4.2$ cat $JBOSS_HOME/standalone/deployments/siamc-ear.ear.failed 2>/dev/null
-sh-4.2$ grep -iE "ERROR|Failed to start|MSC0" $JBOSS_HOME/standalone/log/server.log | tail -40
grep: /standalone/log/server.log: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$

