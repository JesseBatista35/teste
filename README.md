ual o tipo de serviço?*:	Levantar Informações do Ambiente
Informar o ambiente:*:	DES
Nome do serviço ou sistema:*:	SISAQ DES
SERVIDOR:                    caddeapllx1908.agil.nprd.caixa.gov.br
IP:                                 10.116.198.172
Descrição da solicitação:*:	Preciso que seja solicitado o log do DES de DEVOPS.
Contextualização da necessidade::	LOG de hoje do SISAQ DEVOPS DES. Qualquer dúvida estou a disposição.
Informar formas de contato:*:	teams c148698 Raquel ; c068732 Carlos; c111772 Sara



Warning: Permanently added '10.116.198.172' (ED25519) to the list of known hosts.
p585600@10.116.198.172's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
root     16879     1  0 11:14 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -c standalone-full-ha.xml
jboss    16882 16879  0 11:14 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -c standalone-full-ha.xml
jboss    17022 16882  0 11:14 ?        00:01:34 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sisaq-web/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sisaq-web/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisaq-web -c standalone-full-ha.xml
p585600  28960 28910  0 14:55 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$

