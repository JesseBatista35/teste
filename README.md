Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIATD-intranet-vm
Search








All pipelines

SIATD

SIATD-intranet-vm
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
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (15)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HOTFIX,EC HMP
sample-java-des (13)
WO0000081293906 - SISME
Scopes: EC DES,EC TQS,EC HOTFIX
JVM_HEAP_MAX
4096m
JVM_HEAP_MIN
4096m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
512M
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
SIATD-INTRANET-DES (70)
Grupo de variáveis de SIATD-INTRANET-DES

Scopes: EC DES
API_MANAGER_URL
https://api.des.caixa:8443/
APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=feb888f0-4097-485c-8cb8-74350b419b6f;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/;ApplicationId=aeb64caa-3d5c-419c-8f6b-7e77949759ca"
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIATD-intranet-vm-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
ATD_API_KEY
********
ATD_CLI_SER
cli-ser-atd
ATD_CLI_WEB
cli-web-atd
ATD_DATABASE
jdbc:oracle:thin:@//oracle-nprd-1000.caixa:1521/prim_D01NGSRV
ATD_DATABASE_PASSWORD
********
ATD_DATABASE_SCHEMA
ATD
ATD_DATABASE_USER
SATDBD03
ATD_INTER_SSO_REALM
internet
ATD_INTER_URL
https://siatd-internet-vm.esteiras.des.caixa/siatd-web
ATD_INTRA_SSO_REALM
intranet
ATD_INTRA_URL
https://siatd-intranet-vm.esteiras.des.caixa/siatd-web
ATD_LEGADO
PREECHER_ASSIM
ATD_NFS_DIR
des
ATD_NFS_HOME
/upload
ATD_SECRET_INTER
********
ATD_SECRET_INTRA
********
CLI_PASSWORD
********
CLI_PREFIX
LI
CLI_PROGRAM_NAME
CLIPS604
CLI_PROGRAM_TYPE
1
CLI_TRANS_ID
LI86
CLI_USER
SAADCLI1
CTD_BASE_URI
contexpress-server
CTD_BASE_URL
https://sictd.desenvolvimento.caixa
CTD_BOT_BASE_URI
sictd-cdn
CTD_BOT_BASE_URL
http://siatd-intranet-vm.esteiras.des.caixa/siatd-web/rs/sec/teste/sictd
CTD_DIGT_BASE_URI
contexpress-cca/externorest
CTD_DIGT_BASE_URL
https://jklnctd-sictd-digitalizar.des.caixa
CTD_TOKEN
********
DEFAULT_TRANSACTION_TIMEOUT
600
DIRETORIO_MARCADAGUA
/tmp/arquivos/markwater
DIRETORIO_MONTAGEM_ARQUIVOS_PARA_DOWNLOAD
/tmp/arquivos/sictd
DSKEYSTORE
dskeystore-des.jceks
ECM_JBOSS_IP
10.116.198.244
ECM_URL
https://siecm.des.caixa/siecm-web/ECM
IAC_BASE_URI
services/ConsultaResultadoVerificacaoWS
IAC_BASE_URL
https://siiac-ws-va-des.apps.nprd.caixa/siiac-ws-va
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MAIL_SERVER
smtptest.correiolivre.caixa
MQ_CCSID
500
MQ_CHANNEL
SIATD.SVRCONN
MQ_HOSTNAME
10.192.224.100
MQ_PASSWORD
********
MQ_PORT
1416
MQ_QUEUE_MANAGER
BRD7
MQ_USERNAME
SATDRICD
MTR_API_URL
https://simtr-api-intranet-des.apps.nprd.caixa/simtr-api/
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIATD_INTRANET
NFS_MOUNT_POINT_VM
/upload
PATH_DESTINO_SECRET
/opt/jboss-eap/standalone/configuration/dskeystore-des
PROXY_PORT
80
PROXY_TIME_OUT
600
SEG_DIR_CHAVES_RSA
chaves-rsa
SEG_GERAR_CHAVES_RSA
true
SEG_VAL_CHAVES_RSA_GERADAS
180
SHOW_SQL
false
SIATD_UPLOAD_MAX_SIZE
524288000
SIRIC_TIMEOUT_MILLIS
25000
SSO_API_URL
https://login.des.caixa/servico/rest/v1/realms/intranet/usuarios/
SSO_AUTH_INTER
https://logindes.caixa.gov.br/
SSO_AUTH_INTRA
https://login.des.caixa/
TEMPO_REMOCAO_ARQUIVOS_PARA_DOWNLOAD
120000
URL_PROXY
proxydes.caixa
SISGD-PROPERTIES-DES (3)
Scopes: EC DES
JCICS-DES (43)
Scopes: EC DES,EC TQS,EC HOTFIX,EC HMP
SIATD-INTRANET-TQS (63)
Grupo de variáveis de SIATD-INTRANET-TQS
Scopes: EC TQS
SISGD-PROPERTIES-TQS (3)
Scopes: EC TQS
SIATD-INTRANET-HOTFIX (65)
Grupo de variáveis de SIATD-INTRANET-HOTFIX
Scopes: EC HOTFIX
SISGD-PROPERTIES-HOTFIX (3)
Scopes: EC HOTFIX
sample-java-hmp (13)
WO0000081430821
Scopes: EC HMP
SISGD-PROPERTIES-HMP (3)
Scopes: EC HMP
SIATD-INTRANET-HMP (66)
Grupo de variáveis de SIATD-INTRANET-HMP
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (15)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
sample-java-prd (10)
Scopes: EC PRD CTC
SIATD-INTRANET-PRD (60)
Grupo de variáveis de SIATD-INTRANET-PRD
Scopes: EC PRD CTC
JCICS-PRD-SIATD (43)
Scopes: EC PRD CTC
|Manage variable groups
Select a release pipeline to view its releases

5 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Select a release pipeline to view its releases

3 pipelines found

5 pipelines found

Expanded

Expanded

Collapsed

Collapsed

Expanded

Collapsed

Showing filters 1 through 2

Row 2

Row 3

Row 2

Row 2

Showing 26 deployments

Showing filters 1 through 2

