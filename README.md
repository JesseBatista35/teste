
fiz o seu ajute e nao deu certo


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIEXC-web-aplicacao
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SIEXC

SIEXC-web-aplicacao
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (7)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (15)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SIEXC-web-aplicacao-des (27)

Scopes: EC DES
DB_HOST
10.116.92.41
DB_HOST_ORA
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/ORAD71NG
DB_NAME
excdb002
DB_PASS
pwsexcbd02
DB_PASS_ORA
pswexc01$
DB_PORT
5104
DB_USER
sexcbd02
DB_USER_ORA
SEXCBD01
JVM_HEAP_MAX
2548m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
1024m
JVM_METASPACE_MIN
256m
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
NFS_ENDPOINT_ISILON_2
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF
NFS_ENDPOINT_ISILON_3
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC
NFS_ENDPOINT_VM
10.116.88.160:/export/sigdb/sicql
NFS_ENDPOINT_VM_2
10.116.88.160:/export/sigdb/sitec
NFS_ENDPOINT_VM_3
10.116.88.160:/export/sicql_bovespa
NFS_ENDPOINT_VM_4
10.116.88.160:/export/upload_prd
NFS_MOUNT_POINT_ISILON
/integracoes/SIEXC
NFS_MOUNT_POINT_ISILON_2
/integracoes/SIISF
NFS_MOUNT_POINT_ISILON_3
/integracoes/SIAPC
NFS_MOUNT_POINT_ISILON_VM
/opt/sigdb
NFS_MOUNT_POINT_VM_2
/opt/sigdb/sitec
NFS_MOUNT_POINT_VM_3
/opt/jboss/bovespa
NFS_MOUNT_POINT_VM_4
/upload
URL_GESTOR
https://siexc-web-aplicacao.esteiras.des.caixa/swifter-webapp
SIEXC-web-aplicacao-tqs (19)
Scopes: EC TQS
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (15)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Row 4

Row 2

Showing filters 1 through 2


esto logado no jbos me auda a saber se esse nfs ja esta configurado mesmo


[p585600@caddeapllx2193 monitoracao]$ ps -ef | grep jboss
root      578967       1  0 jul16 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
jboss     578970  578967  0 jul16 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
jboss     579200  578970  0 jul16 ?        00:55:13 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms4G -Xmx4G -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=1G -Djava.net.preferIPv4Stack=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT -Dsinqia.azure.tenantId=Teste_tenantId -Dsinqia.azure.clientId=Teste_clientId -Dsinqia.azure.clientSecret=Teste_clientSecret -Dsinqia.azure.redirectUriSignIn=Teste_redirectUriSignIn -Dsinqia.azure.authorityUrl=Teste_authorityUrl -Dsinqia.azure.proxyUrl=Teste_proxyUrl -Dsinqia.azure.proxyPort=Teste_proxyPort -Dsinqia.azure.scope=openid,profile,email,offline_access -Xms4G -Xmx4G -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=1G -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Dcom.ibm.msg.client.commonservices.log.outputName=/opt/jboss-eap/standalone/log/mqjms.log -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
p585600   669191  663492  0 14:50 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2193 monitoracao]$




