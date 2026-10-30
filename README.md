if [ -z "$DOWNLOADSECUREFILE_SECUREFILEPATH" ]; then
download_path=`echo $DOWNLOADSECUREFILE1_SECUREFILEPATH`
else
download_path=`echo $DOWNLOADSECUREFILE_SECUREFILEPATH`
fi
env
JKS_FILE=`basename $download_path`
JKS_FILE_PATH=`echo $download_path`
echo $download_path
echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=JKS_FILE_PATH]$JKS_FILE_PATH"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$JKS_FILE_PATH"



<img width="1749" height="891" alt="image" src="https://github.com/user-attachments/assets/1b70cbbb-8a71-458d-81de-0673df338dc6" />


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
SIHDG-jboss8
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
SIHDG

SIHDG-jboss8
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIHDG-JBOSS8-DES (44)
Grupo de variáveis de SIHDG-JBOSS8-DES
Scopes: EC DES
DATASOURCE_CONNECTION_URL
jdbc:sqlserver://10.116.93.91:1433;DatabaseName=HDGDB001;encrypt=true;trustServerCertificate=true
DATASOURCE_PASSWORD
********
DATASOURCE_USER_NAME
sihdguser
JKS_FILE
caixa-truststore-acteste-nprd.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
NFS_PATH
/fs_sihdg
NFS_PATH_SINAF
/fs_sihdg_sinaf
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sihdg_des_pwc
PATH_DESTINO_SINAF
/sihdg_des
PATH_NFS
/fs_sihdg
SERVER_NFS
hypernprd56.ad.caixa
SERVER_NFS_SINAF
nprdnfs01.ad.caixa
SIHDG-DB_INTERNO
true
SIHDG-SEC_TEMPO_VIDA_TOKEN
5
SIHDG-classificacao.informacao
#INTERNO.CONFIDENCIAL
SIHDG-derivativo.avaliacao.remetente
GEGAP
SIHDG-mail.avaliacao.derivativo
GEOMI@MAIL.CAIXA
SIHDG-mail.endereco
gitecbr05@caixa.gov.br
SIHDG-mail.ordem.alteracao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.cancelamento
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.execucao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.insercao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.invalidacao
GEOMI@MAIL.CAIXA
SIHDG-mail.registro.efetividade
GEANF@MAIL.CAIXA,GEMOC@MAIL.CAIXA
SIHDG-mail.smtp.host
smtptest.correiolivre.caixa
SIHDG-mail.smtp.port
25
SIHDG-ordem.alteracao.remetente
GEGAP
SIHDG-ordem.cancelamento.remetente
GEGAP
SIHDG-ordem.execucao.remetente
GETES
SIHDG-ordem.insercao.remetente
GEGAP
SIHDG-ordem.invalidacao.remetente
GESEN
SIHDG-path.arquivo.sinaf
/sihdg_des/Arquivos_SINAF/
SIZE_VOLUME
50Gi
SIZE_VOLUME_SINAF
50Gi
SSO_REALM
intranet
SSO_REQUIRED
none
SSO_RESOURCE
cli-web-hdg
SSO_URL
https://login.des.caixa/auth
_ENV.JAVA_OPTS_APPEND
"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true"
_ENV.SEC_URL_SERV_AUTH
https://login.des.caixa/auth
SIHDG-JBOSS8-TQS (46)

Scopes: EC TQS
DATASOURCE_CONNECTION_URL
jdbc:sqlserver://10.116.29.201:31153;DatabaseName=HDGDB001;encrypt=true;trustServerCertificate=true
DATASOURCE_PASSWORD
********
DATASOURCE_USER_NAME
SHDGTB01
JKS_FILE
caixa-truststore-acteste-nprd.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
NFS_PATH
/fs_sihdg_tqs
NFS_SERVER
hypernprd12.ad.caixa
NFS_STORAGE_SIZE_VOLUME
20Gi
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sihdg_tqs
PATH_DESTINO_PWC
/sihdg_powercenter
PATH_NFS
/fs_sihdg_tqs
PATH_NFS_PWC
/fs_sihdg_powercenter
SERVER_NFS
hypernprd12.ad.caixa
SERVER_NFS_PWC
hypernprd12.ad.caixa
SIHDG-DB_INTERNO
true
SIHDG-SEC_TEMPO_VIDA_TOKEN
5
SIHDG-classificacao.informacao
#INTERNO.CONFIDENCIAL
SIHDG-derivativo.avaliacao.remetente
GEGAP
SIHDG-mail.avaliacao.derivativo
GEOMI@MAIL.CAIXA
SIHDG-mail.endereco
gitecbr05@caixa.gov.br
SIHDG-mail.ordem.alteracao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.cancelamento
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.execucao
GEANF@MAIL.CAIXA
SIHDG-mail.ordem.insercao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.invalidacao
GEANF@MAIL.CAIXA
SIHDG-mail.registro.efetividade
GEANF@MAIL.CAIXA,GEMOC@MAIL.CAIXA
SIHDG-mail.smtp.host
smtptest.correiolivre.caixa
SIHDG-mail.smtp.port
25
SIHDG-ordem.alteracao.remetente
GEGAP
SIHDG-ordem.cancelamento.remetente
GEGAP
SIHDG-ordem.execucao.remetente
GETES
SIHDG-ordem.insercao.remetente
GEGAP
SIHDG-ordem.invalidacao.remetente
GESEN
SIHDG-path.arquivo.sinaf
/sihdg_tqs/Arquivos_SINAF/
SIZE_VOLUME
20Gi
SIZE_VOLUME_PWC
50Gi
SSO_REALM
intranet
SSO_REQUIRED
none
SSO_RESOURCE
cli-web-hdg
SSO_URL
https://login.tqs.caixa/auth
_ENV.JAVA_OPTS_APPEND
"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true"
_ENV.SEC_URL_SERV_AUTH
https://login.tqs.caixa/auth
SIHDG-JBOSS8-HMP (39)
Grupo de variáveis de SIHDG-JBOSS8-HMP
Scopes: EC HMP
DATASOURCE_CONNECTION_URL
jdbc:sqlserver://scthmdadnt0042.corp.caixa.gov.br:1433;DatabaseName=HDGDB001
DATASOURCE_PASSWORD
********
DATASOURCE_USER_NAME
shdghb02
JKS_FILE
caixa-truststore-acteste-nprd.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
NFS_PATH
/ifs/CADSVISISD4/SERVIDORES/CETAD/SIHDG
NFS_SERVER
nfsctcnprd.ctc.caixa
NFS_STORAGE_SIZE_VOLUME
10Gi
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sihdg
SIHDG-DB_INTERNO
true
SIHDG-SEC_TEMPO_VIDA_TOKEN
5
SIHDG-classificacao.informacao
#INTERNO.CONFIDENCIAL
SIHDG-derivativo.avaliacao.remetente
GEGAP
SIHDG-mail.avaliacao.derivativo
GEOMI@MAIL.CAIXA
SIHDG-mail.endereco
gitecbr05@caixa.gov.br
SIHDG-mail.ordem.alteracao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.cancelamento
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.execucao
GEANF@MAIL.CAIXA
SIHDG-mail.ordem.insercao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.invalidacao
GEANF@MAIL.CAIXA
SIHDG-mail.registro.efetividade
GEANF@MAIL.CAIXA,GEMOC@MAIL.CAIXA
SIHDG-mail.smtp.host
smtptest.correiolivre.caixa
SIHDG-mail.smtp.port
25
SIHDG-ordem.alteracao.remetente
GEGAP
SIHDG-ordem.cancelamento.remetente
GEGAP
SIHDG-ordem.execucao.remetente
GETES
SIHDG-ordem.insercao.remetente
GEGAP
SIHDG-ordem.invalidacao.remetente
GESEN
SIHDG-path.arquivo.sinaf
/sihdg/Arquivos_SINAF/
SSO_REALM
intranet
SSO_REQUIRED
none
SSO_RESOURCE
cli-web-hdg
SSO_URL
https://login.hmp.caixa/auth
_ENV.JAVA_OPTS_APPEND
"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true"
_ENV.SEC_URL_SERV_AUTH
https://login.hmp.caixa/auth
OKD-4-APL (12)
Scopes: EC PRD
SIHDG-JBOSS8-PRD (1)
Grupo de variáveis de SIHDG-JBOSS8-PRD
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2

Showing 26 deployments

EC HMPDeploy release

Approving

Approved

Approving

Approved

Row 2

Row 2

Row 2

Row 2

Expanded

Collapsed

Showing filters 1 through 2

