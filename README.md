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
SIPBS-revendedor-batch
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
SIPBS

SIPBS-revendedor-batch
Predefined variables
Usuario-Azure-DevOps (12)
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
Scopes: EC DES,EC TQS,EC HMP
sample-java-des (13)
Scopes: EC DES,EC TQS
SIPBS-REVENDEDOR-BATCH-DES (58)
Grupo de variáveis de SIPBS-REVENDEDOR-BATCH-DES
Scopes: EC DES
APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
APPLICATIONINSIGHTS_ROLE_NAME
SIPBS-REVENDEDOR-BATCH-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
5
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
BATIMENTO_PENDENCIA_INPUT_FILE_PATH
revendedor/pendencias/batimento/entrada
BATIMENTO_PENDENCIA_OUTPUT_FILE_PATH
revendedor/pendencias/batimento/saida
CARGA_ARQUIVO_FILE_PATH
CB_SIPBS_NFS/PX_ANP_SFTP/DOWNLOAD
CARGA_ARQUIVO_RETRY_LIMIT
3
FISERV_API_API_KEY
X0GW3QGOYFn4r7DHcVC8KuatUnNs6MGB
FISERV_API_CLIENT_ID
bwa
FISERV_API_INSTITUTION_NUMBER
00000007
FISERV_API_MESSAGE_SIGNATURE
EKkyQycIIbbUzrt1RwC+obzQq2OoPnArjdbtauR5JzM=
FISERV_API_PASSWORD
2acs00vZuGTJDsHMin17zcJ@
FISERV_API_SECRET
N93nmFmoY0NzSMC5
FISERV_API_SERVICE_CONTRACT_ID
149
FISERV_API_TOKEN_URL
https://cat.api.firstdata.com/sba/token
FISERV_API_URL
https://cat.api.firstdata.com/bwa/brfts/rest/gpt
FISERV_API_USERNAME
ist_caixa_sipbs
INTRANET_OIDC_TOKEN_URI
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
INTRANET_SSO_CLIENT_ID
cli-ser-pbs
INTRANET_SSO_CLIENT_SECRET
********
JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/opt/batch/securefiles/caixa-trust-SIPBS-revend-batch-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -Xms1024m -Xmx2048m -Djavax.net.ssl.keyAlias=caixa2023 -Djavax.net.ssl.keyStoreAlias=caixa2023 -Dhttp.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br" -Dhttp.proxySet=true
LOGGING_LEVEL
INFO
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW
NFS_MOUNT_POINT_ISILON
/sipbs
NFS_MOUNT_POINT_VM
/b2b
NO_PROXY
*.caixa,*.caixa.gov.br,.produtos4.caixa,.apps.produtos4.caixa,10.0.0.0/8,10.122.154.249:9000
NSGD_API_URL
https://api.des.caixa:8443/conta-deposito/v1
PRODUTOS
1536,1699
PROXY_PORT
80
QUANTIDADE_THREADS
1
RAZAO_MAX_DESABILITACAO
10
REDIS_PROXY_CLIENT_ID
cli-ser-pbs
REDIS_PROXY_CLIENT_SECRET
********
REDIS_PROXY_DURATION_DAYS
10
REDIS_PROXY_TOKEN_URI
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
REDIS_PROXY_URL
https://sipbs-pagamento-worker-des.apps.nprd.caixa
RESOLVE_PENDENCIA_INPUT_FILE_PATH
revendedor/pendencias/resolve/entrada
RESOLVE_PENDENCIA_OUTPUT_FILE_PATH
revendedor/pendencias/resolve/saida
SERVER_PORT_BATIMENTO_PENDENCIAS
8094
SERVER_PORT_CARGA_ARQUIVO
8093
SERVER_PORT_RESOLVE_PENDENCIAS
8095
SERVER_PORT_VERIFICA_ABERTURA_CONTAS_PJ
8096
SIPBS_DATASOURCE_JDBCURL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0:currentSchema=DESPBS;"
SIPBS_DATASOURCE_PASSWORD
********
SIPBS_DATASOURCE_USERNAME
spbsdr01
SPRING_DATASOURCE_JDBCURL
"jdbc:sqlserver://10.116.100.127:1433;databaseName=PBSDB001;encrypt=false;"
SPRING_DATASOURCE_PASSWORD
********
SPRING_DATASOURCE_USERNAME
SPBSDR01
TOKEN_API_KEY
********
TOKEN_SSO_CLIENT
cli-ser-pbs
TOKEN_SSO_SECRET
********
URL_ACCESS_TOKEN
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VERIFICA_ABERTURA_CONTAS_PJ_FILE_PATH
CB_SIPBS_NFS/PX_ANP_SFTP/DOWNLOAD
SIPBS-REVENDEDOR-BATCH-TQS (56)
Grupo de variáveis de SIPBS-REVENDEDOR-BATCH-TQS

Scopes: EC TQS
APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
APPLICATIONINSIGHTS_ROLE_NAME
SIPBS-REVENDEDOR-BATCH-TQS
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
5
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
BATIMENTO_PENDENCIA_INPUT_FILE_PATH
revendedor/pendencias/batimento/entrada
BATIMENTO_PENDENCIA_OUTPUT_FILE_PATH
revendedor/pendencias/batimento/saida
CARGA_ARQUIVO_FILE_PATH
CB_SIPBS_NFS/PX_ANP_SFTP/DOWNLOAD
CARGA_ARQUIVO_RETRY_LIMIT
3
FISERV_API_API_KEY
X0GW3QGOYFn4r7DHcVC8KuatUnNs6MGB
FISERV_API_CLIENT_ID
bwa
FISERV_API_INSTITUTION_NUMBER
00000007
FISERV_API_MESSAGE_SIGNATURE
EKkyQycIIbbUzrt1RwC+obzQq2OoPnArjdbtauR5JzM=
FISERV_API_PASSWORD
2acs00vZuGTJDsHMin17zcJ@
FISERV_API_SECRET
N93nmFmoY0NzSMC5
FISERV_API_SERVICE_CONTRACT_ID
149
FISERV_API_TOKEN_URL
https://cat.api.firstdata.com/sba/token
FISERV_API_URL
https://cat.api.firstdata.com/bwa/brfts/rest/gpt
FISERV_API_USERNAME
ist_caixa_sipbs
INTRANET_OIDC_TOKEN_URI
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
INTRANET_SSO_CLIENT_ID
cli-ser-pbs
INTRANET_SSO_CLIENT_SECRET
********
JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/opt/batch/securefiles/caixa-trust-SIPBS-revend-batch-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -Xms1024m -Xmx2048m -Djavax.net.ssl.keyAlias=caixa2023 -Djavax.net.ssl.keyStoreAlias=caixa2023 -Dhttp.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br" -Dhttp.proxySet=true
LOGGING_LEVEL
INFO
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW
NFS_MOUNT_POINT_ISILON
/sipbs
NFS_MOUNT_POINT_VM
/b2b
NO_PROXY
*.caixa,*.caixa.gov.br,.produtos4.caixa,.apps.produtos4.caixa,10.0.0.0/8,10.122.154.249:9000
NSGD_API_URL
https://api.des.caixa:8443/conta-deposito/v1
PROXY_PORT
80
QUANTIDADE_THREADS
1
RAZAO_MAX_DESABILITACAO
5
REDIS_PROXY_CLIENT_ID
cli-ser-pbs
REDIS_PROXY_CLIENT_SECRET
********
REDIS_PROXY_TOKEN_URI
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
REDIS_PROXY_URL
https://sipbs-pagamento-worker-des.apps.nprd.caixa
RESOLVE_PENDENCIA_INPUT_FILE_PATH
revendedor/pendencias/resolve/entrada
RESOLVE_PENDENCIA_OUTPUT_FILE_PATH
revendedor/pendencias/resolve/saida
SERVER_PORT_BATIMENTO_PENDENCIAS
8094
SERVER_PORT_CARGA_ARQUIVO
8093
SERVER_PORT_RESOLVE_PENDENCIAS
8095
SERVER_PORT_VERIFICA_ABERTURA_CONTAS_PJ
8096
SIPBS_DATASOURCE_JDBCURL
"jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentSchema=TQSPBS;"
SIPBS_DATASOURCE_PASSWORD
********
SIPBS_DATASOURCE_USERNAME
SPBSTR01
SPRING_DATASOURCE_JDBCURL
"jdbc:sqlserver://10.116.29.228:1433;databaseName=PBSDB001;encrypt=false;"
SPRING_DATASOURCE_PASSWORD
********
SPRING_DATASOURCE_USERNAME
SPBSTR01
TOKEN_API_KEY
********
TOKEN_SSO_CLIENT
cli-ser-pbs
TOKEN_SSO_SECRET
********
URL_ACCESS_TOKEN
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VERIFICA_ABERTURA_CONTAS_PJ_FILE_PATH
CB_SIPBS_NFS/PX_ANP_SFTP/DOWNLOAD
sample-java-hmp (13)
Scopes: EC HMP
SIPBS-REVENDEDOR-BATCH-HMP (56)
Grupo de variáveis de SIPBS-REVENDEDOR-BATCH-HMP TAS000047453671 #################### BATIMENTO_PENDENCIA_INPUT_FILE_PATH=revendedor/pendencias/batimento/entrada BATIMENTO_PENDENCIA_OUTPUT_FILE_PATH=revendedor/pendencias/batimento/saida SERVER_PORT_BATIMENTO_PENDENCIAS=8094 SERVER_PORT_RESOLVE_PENDENCIAS=8095 RESOLVE_PENDENCIA_INPUT_FILE_PATH=revendedor/pendencias/resolve/entrada RESOLVE_PENDENCIA_OUTPUT_FILE_PATH=revendedor/pendencias/resolve/saida NSGD_API_URL=https://api.des.caixa:8443/conta-deposito/v1 URL_ACCESS_TOKEN=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token TOKEN_SSO_SECRET= token intranet TOKEN_SSO_CLIENT=cli-ser-pbs TOKEN_API_KEY= api key do sipbs QUANTIDADE_THREADS=1 SERVER_PORT_VERIFICA_ABERTURA_CONTAS_PJ=8096 VERIFICA_ABERTURA_CONTAS_PJ_FILE_PATH=CB_SIPBS_NFS/PX_ANP_SFTP/DOWNLOAD
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (15)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
sample-java-prd (10)
Scopes: EC PRD CTC,EC PRD DTC
SIPBS-REVENDEDOR-BATCH-PRD (56)
Grupo de variáveis de SIPBS-REVENDEDOR-BATCH-PRD - CRQ000001234935
Scopes: EC PRD CTC,EC PRD DTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Row 2

Row 2

EC TQSDeploy release

Row 2

Row 2

Row 2

Row 3

Row 2

Row 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

