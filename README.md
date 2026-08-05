
[root@caddeapllx1441 p585600]# ps -ef | grep jboss
root     29721     1  0 13:37 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisme -c standalone-full-ha.xml
jboss    29724 29721  0 13:37 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisme -c standalone-full-ha.xml
jboss    29884 29724  7 13:37 ?        00:01:45 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sisme/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sisme/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisme -c standalone-full-ha.xml
root     31255 10993  0 13:59 pts/0    00:00:00 grep --color=auto jboss
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]# grep -n "MetaspaceSize" /opt/jboss-eap/bin/standalone.conf
50:   JAVA_OPTS="-Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true"
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]# tail -50 /logs/jboss/jboss-eap/standalone/sisme/server.log | grep -i "OutOfMemory"
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#


me ajuda a ajustar isso 



SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (7)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
Compartilhamentos (4)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
sample-java-des (13)
Scopes: EC DES
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
256m
JVM_METASPACE_MIN
96M
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sample
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CESTI/SAMPLE_DES
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
50Gi
SSO_URL_INTERNET
https://login.des.caixa.gov.br
SSO_URL_INTRANET
https://login.des.caixa
TESTE_TRUST
caixa-truststore-acteste-nprd.jks
VERSAO
$(Build.BuildNumber)
SISME-DES (87)


achei aqui na varaivel onde manda o valor nesse caso pe sol alterar ali né?
