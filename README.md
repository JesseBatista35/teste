Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
Search








All pipelines

SIGPD

SIGPD-backend
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
ANSIBLE_JBOSS_VM_V2 (6)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
Compartilhamentos (4)
Scopes: Release
SIGPD-BACKEND-DES (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC DES
AMBIENTE
des
APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=1db83fd9-8b2f-4a25-89d8-8cf25fa9321a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIGPD-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
DB_OCI_CONNECTION_URL
jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV
DB_OCI_DRIVER
oracle
DB_OCI_DRIVER_CLASS
oracle.jdbc.OracleDriver
DB_OCI_JNDI_NAME
java:/jdbc/OracleSigpdDS
DB_OCI_MODULE
com.oracle.ojdbc6
DB_OCI_PASSWORD
${VAULT::SIGPD::DB_OCI_PASSWORD::1}
DB_OCI_POOL_NAME
jdbc/OracleSigpdDS
DB_OCI_USER_NAME
SGPDBD02
DEBUG
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
DEVOPS_TEST
OK
ENVIRONMENT
DES
GPD_SSO_CLIENT_SECRET
${VAULT::SIGPD::GPD_SSO_CLIENT_SECRET::1}
HOSTNAME_FILAMQ
10.116.95.99
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
JVM_PATH_TRUSTSTORE
/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MQ_FILA_BASE_QUEUE_ENTRIES
SIGPD.REQ.SRVCO_LOG
MQ_FILA_BASE_QUEUE_NAME
SIGPD.REQ.SRVCO_LOG
MQ_FILA_CHANNEL
SIGPD.SVRCONN
MQ_FILA_HOSTNAME
10.116.95.99
MQ_FILA_PASSWORD
${VAULT::SIGPD::MQ_FILA_PASSWORD::1}
MQ_FILA_PORT
1414
MQ_FILA_QUEUE_MANAGER
XMQD1
MQ_FILA_TARGET_CLIENT
MQ
MQ_FILA_USERNAME
SGPDDB01
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGPD_DES
NFS_MOUNT_POINT_VM
/sigpd
SIAPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIAPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIAPD_WEB_API_V1_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v1/
SIAPD_WEB_API_V2_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v2/
SICLI_WEB_API_V1_BASEURL
https://api.des.caixa:8443/cadastro/v1/
SICLI_WEB_API_V2_BASEURL
http://api.des.caixa:8080/cadastro/v2/
SIGPD_APIKEY
${VAULT::SIGPD::SIGPD_APIKEY::1}
SIGPD_LOTE_PROCESSAMENTO_BASEDIR
/SIGPD_LOTE_PROCESSAMENTO/
SIGPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIGPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIICO_PRIVADO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-privadas/v1/
SIICO_PUBLICO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v1/
SMTP_HOST
smtptest.correiolivre.caixa
SMTP_PASS
${VAULT::SIGPD::SMTP_PASS::1}
SMTP_PORT
25
SMTP_USR
sgpdbd01
SSO_AUTH_URL_INTERNET
https://logindes.caixa.gov.br/auth
SSO_AUTH_URL_INTRANET
https://login.des.caixa/auth
SSO_BASE_URL_INTERNET
https://logindes.caixa.gov.br
SSO_BASE_URL_INTRANET
https://login.des.caixa
SSO_BEARER_ONLY_INTERNET
TRUE
SSO_BEARER_ONLY_INTRANET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTERNET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTRANET
TRUE
SSO_PUBLIC_CLIENT_INTERNET
TRUE
SSO_PUBLIC_CLIENT_INTRANET
TRUE
SSO_REALM_NAME_INTERNET
internet
SSO_REALM_NAME_INTRANET
intranet
SSO_RESOURCE_NAME_INTERNET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTERNET::1}
SSO_RESOURCE_NAME_INTRANET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTRANET::1}
SSO_SECRET_INTERNET
${VAULT::SIGPD::SSO_SECRET_INTERNET::1}
SSO_SECRET_INTRANET
${VAULT::SIGPD::SSO_SECRET_INTRANET::1}
SSO_SECURE_DEPLOYMENT_NAME
sigpd-api.war
SSO_TYPE_OF_SSL_REQUIRED_INTERNET
EXTERNAL
SSO_TYPE_OF_SSL_REQUIRED_INTRANET
EXTERNAL
SSO_WEB_API_TOKEN_SERVICE_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
SSO_WEB_API_TOKEN_SERVICE_INTRANET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VAULT_ENC_FILE_DIR
/opt/jboss/jboss-eap/modules/security/
VAULT_ITERATION_COUNT
33
VAULT_KEYSTORE_ALIAS
jboss
VAULT_KEYSTORE_PASSWORD
MASK-2mSDTeSjJwj.t3Ogt9K0li
VAULT_KEYSTORE_URL
/opt/jboss/jboss-eap/modules/security/vaultcaixa.keystore
VAULT_SALT
F3d3r4d0
SIGPD-BACKEND-TQS (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC TQS
AMBIENTE
tqs
APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=1db83fd9-8b2f-4a25-89d8-8cf25fa9321a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIGPD-TQS
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
DB_OCI_CONNECTION_URL
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/prim_T01NGSRV
DB_OCI_DRIVER
oracle
DB_OCI_DRIVER_CLASS
oracle.jdbc.OracleDriver
DB_OCI_JNDI_NAME
java:/jdbc/OracleSigpdDS
DB_OCI_MODULE
com.oracle.ojdbc6
DB_OCI_PASSWORD
${VAULT::SIGPD::DB_OCI_PASSWORD::1}
DB_OCI_POOL_NAME
jdbc/OracleSigpdDS
DB_OCI_USER_NAME
sgpdbt01
DEBUG
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
DEVOPS_TEST
OK
ENVIRONMENT
TQS
GPD_SSO_CLIENT_SECRET
${VAULT::SIGPD::GPD_SSO_CLIENT_SECRET::1}
HOSTNAME_FILAMQ
10.116.95.100
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
JVM_PATH_TRUSTSTORE
/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MQ_FILA_BASE_QUEUE_ENTRIES
SIGPD.REQ.SRVCO_LOG
MQ_FILA_BASE_QUEUE_NAME
********
MQ_FILA_CHANNEL
SIGPD.SVRCONN
MQ_FILA_HOSTNAME
10.116.95.100
MQ_FILA_PASSWORD
${VAULT::SIGPD::MQ_FILA_PASSWORD::1}
MQ_FILA_PORT
1416
MQ_FILA_QUEUE_MANAGER
XMQD2
MQ_FILA_TARGET_CLIENT
MQ
MQ_FILA_USERNAME
SGPDBT01
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGPD_DES
NFS_MOUNT_POINT_VM
/sigpd
SIAPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIAPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIAPD_WEB_API_V1_BASEURL
https://siapd2.esteiras.tqs.caixa/siapd-api/v1/
SIAPD_WEB_API_V2_BASEURL
https://siapd2.esteiras.tqs.caixa/siapd-api/v2/
SICLI_WEB_API_V1_BASEURL
https://api.des.caixa:8443/cadastro/v1/
SICLI_WEB_API_V2_BASEURL
https://api.des.caixa:8443/cadastro/v2/
SIGPD_APIKEY
${VAULT::SIGPD::SIGPD_APIKEY::1}
SIGPD_LOTE_PROCESSAMENTO_BASEDIR
/SIGPD_LOTE_PROCESSAMENTO/
SIGPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIGPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIICO_PRIVADO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-privadas/v1/
SIICO_PUBLICO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v1/
SMTP_HOST
smtptest.correiolivre.caixa
SMTP_PASS
${VAULT::SIGPD::SMTP_PASS::1}
SMTP_PORT
25
SMTP_USR
sgpdbd01
SSO_AUTH_URL_INTERNET
https://logindes.caixa.gov.br/auth
SSO_AUTH_URL_INTRANET
https://login.des.caixa/auth
SSO_BASE_URL_INTERNET
https://logindes.caixa.gov.br
SSO_BASE_URL_INTRANET
https://login.des.caixa
SSO_BEARER_ONLY_INTERNET
TRUE
SSO_BEARER_ONLY_INTRANET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTERNET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTRANET
TRUE
SSO_PUBLIC_CLIENT_INTERNET
TRUE
SSO_PUBLIC_CLIENT_INTRANET
TRUE
SSO_REALM_NAME_INTERNET
internet
SSO_REALM_NAME_INTRANET
intranet
SSO_RESOURCE_NAME_INTERNET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTERNET::1}
SSO_RESOURCE_NAME_INTRANET
cli-ser-gpd
SSO_SECRET_INTERNET
${VAULT::SIGPD::SSO_SECRET_INTERNET::1}
SSO_SECRET_INTRANET
f4f01d0a-cb60-44f4-be66-bc4bdfc2da30
SSO_SECURE_DEPLOYMENT_NAME
sigpd-api.war
SSO_TYPE_OF_SSL_REQUIRED_INTERNET
EXTERNAL
SSO_TYPE_OF_SSL_REQUIRED_INTRANET
EXTERNAL
SSO_WEB_API_TOKEN_SERVICE_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
SSO_WEB_API_TOKEN_SERVICE_INTRANET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VAULT_ENC_FILE_DIR
/opt/jboss/jboss-eap/modules/security/
VAULT_ITERATION_COUNT
33
VAULT_KEYSTORE_ALIAS
jboss
VAULT_KEYSTORE_PASSWORD
MASK-2mSDTeSjJwj.t3Ogt9K0li
VAULT_KEYSTORE_URL
/opt/jboss/jboss-eap/modules/security/vaultcaixa.keystore
VAULT_SALT
F3d3r4d0
SIGPD-BACKEND-HMP (42)
Grupo de variáveis de Homologação
Scopes: EC HMP
SIGPD-BACKEND-PRD (73)
Grupo de variáveis de Produção
Scopes: EC PRD
|Manage variable groups
Row 2

EC TQSDeploy release

Row 2

Row 2

Showing filters 1 through 2





Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
Search








All pipelines

SIGPD

SIGPD-backend
Predefined variables
Filter by keywords
Scope


BUILD_VERSION
$(Build.BuildNumber)
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
http_context_additional
http_context_default
sigpd-api/v1/health-check/live
http_sso
no
quantidade_vm
1
quantidade_vm
2
sistema_ambiente
des
sistema_ambiente
tqs
sistema_ambiente
hmp
sistema_ambiente
prd

sistema_nome
sigpd-backend
TemplateRelease
RHEL-7.7-v01_JBoss-7.1-v01
URL_APM_SERVER
https://apm-server-devops.produtos.caixa
URL_DEPLOY
nexus.com
USE_WMQ
no
VERSAO
$(Build.BuildNumber)
Row 2

EC TQSDeploy release

Row 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2


