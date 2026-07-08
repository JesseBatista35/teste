<img width="1897" height="926" alt="image" src="https://github.com/user-attachments/assets/933b8fce-dad3-4230-a569-d31aef6d663a" />

ees é do sisag - acredito que temos que verificar


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
SISAG-autorizacao-backend
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
SISAG

SISAG-autorizacao-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
DIR_LOGS
/opt/ads-agent/esteira-logs
GRAYLOG_PASSWORD
********
GRAYLOG_USERNAME
API_CLIENT
REPOSITORY_LOGS
https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
Compartilhamentos (4)
Scopes: Release
ID_ALOCAIP
C&t@d02
PW_ALOCAIP
********
PW_ISILON
********
USR_ISILON
s736651@corp.caixa.gov.br
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
KIND_DEPLOY
deploymentconfig
OKD_API_REGISTRY
api.produtos4.caixa:6443
OKD_REGISTRY
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_REGISTRY
********
OKD_USER_SERVICE_REGISTRY
ads-sa
ProjetoBuild
build-images-ads
TIMEOUT_DEPLOY
300
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP,EC TQS2
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SISAG-autorizacao-backend-des (3)
Scopes: EC DES
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISAG-AUTORIZACAO-BACKEND-DES
_ENV.JAVA_OPTIONS_APPEND
"-Xms1024m -Xmx1024m"
_ENV.NOTIFICACAO_API
https://sisag-notificacao-api-des.apps.nprd.caixa
SISAG-COMMON-DES (62)
WO0000078987201
Scopes: EC DES
SISAG-BT-VAULT-DES (3)
WO0000078987201
Scopes: EC DES
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES,EC TQS2
SISAG-autorizacao-backend-tqs (6)
Scopes: EC TQS
ORACLE_PASS
********
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISAG-AUTORIZACAO-BACKEND-TQS
_ENV.NOTIFICACAO_API
https://sisag-notificacao-api-tqs.apps.nprd.caixa
_ENV.ORACLE_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01clu08.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=CDBD02BCPDB001)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=3))))
_ENV.ORACLE_USER
SSAGDS07
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
SISAG-AUTORIZADOR-NOTIFICACAO-BACKEND-TQS (7)
Grupo de variáveis de SISAG-AUTORIZADOR-NOTIFICACAO-BACKEND-TQS
Scopes: EC TQS
ORACLE_PASS
********
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISAG-AUTORIZADOR-NOTIFICACAO-BACKEND-TQS
_ENV.CHAVE_SISTEMA
ChaveDefaultDesenvolvimento
_ENV.JAVA_OPTIONS_APPEND
"-Xms1024m -Xmx1024m"
_ENV.ORACLE_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01clu08.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=CDBD02BCPDB001)(FAILOVER_MODE=(TYPE=SELECT)(Mjdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01clu08.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=CDBD02BCPDB001)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=3))))ETHOD=BASIC)(RETRIES=3)(DELAY=3))))
_ENV.ORACLE_USER
SSAGDS07
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
ADAPTER_VARIABLES - SIACM Cartões (7)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC TQS,EC TQS2
AdapterGroupId
br.gov.caixa.cartoescaixa
GitName
devops.caixa/projetos/Caixa/_git/SIACM-Adapters
GitUrl
https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/git/repositories/011d3bd8-96ad-48ff-af7e-e42cfe933e3d
GitUser
f617016
SonarProjectKey
SIACM:ADAPTERS
SonarProjectName
SIACM:ADAPTERS
system.debug
true
ADAPTER_VARIABLES - SICTM SIBOT CaixaTem (8)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC TQS,EC TQS2
AdapterGroupId
br.gov.caixa.tem
GitName
devops.caixa/projetos/Caixa/_git/SICTM-SIBOT-Adapters
GitUrl
https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/git/repositories/4995ce4c-6c96-43a5-967c-c1a0430da38c
GitUser
f617016
LockBranch
true
SonarProjectKey
SICTM:ADAPTERS
SonarProjectName
SICTM:ADAPTERS
system.debug
true
SISAG-COMMON-TQS (62)
WO0000078987201

Scopes: EC TQS,EC TQS2
CHAVE_SISTEMA
********
VAULT_LOCATION
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_CONECTOR_SIROT_URL
https://sisag-conector-sirot-api-tqs.apps.nprd.caixa
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_SIABE_URL
https://siabe-demonstrativo-inss-des.apps.nprd.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.GRANT_TYPE
client_credentials
_ENV.JAVA_OPTIONS
"-Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8"
_ENV.LOG_LEVEL
INFO
_ENV.LOG_LEVEL_SISAG
INFO
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
10
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_PASS
'${SSAGTS07_ORACLE}'
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_URL
jdbc:oracle:thin:@CNPEXDADVM02CLU11.EXTRA.CAIXA.GOV.BR:1521/CDBT01BCPDB001
_ENV.ORACLE_USER
SSAGTS07
_ENV.POSTGRES_CONNECTIONTIMEOUT
30000
_ENV.POSTGRES_IDLETIMEOUT
900000
_ENV.POSTGRES_KEEPALIVETIME
0
_ENV.POSTGRES_MAXIMUMPOOLSIZE
25
_ENV.POSTGRES_MAXLIFETIME
1800000
_ENV.POSTGRES_MINIMUMIDLE
3
_ENV.POSTGRES_PASS
'${SAGUSR01_POSTGRES}'
_ENV.POSTGRES_SHOW_SQL
false
_ENV.POSTGRES_URL
jdbc:postgresql://10.116.92.180:5435/SAGDB003
_ENV.POSTGRES_USER
sagusr01
_ENV.REST_CONNECTION_TIMEOUT
5000
_ENV.REST_READ_TIMEOUT
5000
_ENV.SIAAF_MQ_CHANNEL
SISAG.SVRCONN
_ENV.SIAAF_MQ_HOST
cbrdeapllx059.extra.caixa.gov.br
_ENV.SIAAF_MQ_PASS
'${SSAGMQBD_MQ}'
_ENV.SIAAF_MQ_PORT
1414
_ENV.SIAAF_MQ_QUEUE_MANAGER
XMQD1
_ENV.SIAAF_MQ_REQ_ENVIO_TEV
SIAAF.REQ.SISAG.ENVIO_TEV
_ENV.SIAAF_MQ_USER
SSAGMQBD
_ENV.SIECM_URL
https://siecm.des.caixa
_ENV.SIROT_BIT_100_REDE_RECEPTORA
00000000104
_ENV.SIROT_BIT_33_REDE_TRANSMISSORA
00000009754
_ENV.SIROT_BIT_3_CODIGO_DE_PROCESSAMENTO
023010
_ENV.SIROT_BIT_48_AREA_FABRICANTE
FOTON
_ENV.SIROT_BIT_63_ATENDIMENTO
0
_ENV.SIROT_BIT_63_CODIGO_RESPOSTA
0000
_ENV.SIROT_BIT_63_CONTROLE_CAIXA
000000000000000000
_ENV.SIROT_BIT_63_VERSAO
003
_ENV.SIROT_TIPO_MENSAGEM
0300
_ENV.SISAG_API_KEY
'${SISAG_BT_APIKEY}'
_ENV.SISAG_CLIENT_ID
cli-ser-sag
_ENV.SISAG_CLIENT_SECRET
'${CLISERSAG_SSO_INTRA}'
_ENV.SPRING_PROFILES_ACTIVE
production
_ENV.SSO_ISSUER
https://login.des.caixa/auth/realms/intranet
_ENV.VALORLIMITEPAGINSS
20000
_SECRET.CHAVE_SISTEMA
#{CHAVE_SISTEMA}#
_SECRET.SISAG_VAULT
#{VAULT_LOCATION}#
SISAG-BT-VAULT-TQS (3)
WO0000078987201
Scopes: EC TQS,EC TQS2
OKD-4-APL (12)
Scopes: EC PRD,EC PRD2
SISAG-autorizacao-backend-prd (3)
Scopes: EC PRD
SISAG-BT-VAULT-PRD (3)
SISAG-BT-VAULT-PRD
Scopes: EC PRD
SISAG-COMMON-PRD (40)
SISAG-COMMON-PRD
Scopes: EC PRD
SISAG-autorizacao-backend-prd2 (3)
Scopes: EC PRD2
SISAG-COMMON-PRD2 (55)
SISAG-COMMON-PRD2
Scopes: EC PRD2
SISAG-BT-VAULT-PRD2 (3)
SISAG-BT-VAULT-PRD2
Scopes: EC PRD2
SISAG-autorizacao-backend-tqs2 (4)
Scopes: EC TQS2
|Manage variable groups
Expanded

Showing 2 items.

Collapsed

Collapsed

Expanded

Collapsed

Expanded

47 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

47 pipelines found

Row 3

Showing filters 1 through 2

