OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sisag-des
Pods
Pod details
Pod
P
sisag-notificacao-api-des-95-4ndlc
Init:Error

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Log stream ended.

Container
C
secrets-check

Current log
Search

Wrap lines
|
Raw
|
Download
|
24 lines
--- Resultados da Comparacao ---
ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:
SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS
ERRO: Verificacao nao foi bem-sucedida.
ERRO: Diagnostico. Arquivos vazios encontrados.
ERRO: Diagnostico. IP do POD.
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
inet 127.0.0.1/8 scope host lo
valid_lft forever preferred_lft forever
inet6 ::1/128 scope host
valid_lft forever preferred_lft forever
3: eth0@if28941: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1450 qdisc noqueue state UP group default
link/ether 0a:58:19:00:29:3a brd ff:ff:ff:ff:ff:ff link-netnsid 0
inet 25.0.41.58/23 brd 25.0.41.255 scope global eth0
valid_lft forever preferred_lft forever
inet6 fe80::b85e:efff:fe77:6b01/64 scope link
valid_lft forever preferred_lft forever






--- Resultados da Comparacao ---
ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:
SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS

ERRO: Verificacao nao foi bem-sucedida.

ERRO: Diagnostico. Arquivos vazios encontrados.



ERRO: Diagnostico. IP do POD.
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
3: eth0@if28941: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1450 qdisc noqueue state UP group default 
    link/ether 0a:58:19:00:29:3a brd ff:ff:ff:ff:ff:ff link-netnsid 0
    inet 25.0.41.58/23 brd 25.0.41.255 scope global eth0
       valid_lft forever preferred_lft forever
    inet6 fe80::b85e:efff:fe77:6b01/64 scope link 
       valid_lft forever preferred_lft forever



fiz um start rolat e o problema ta aqui


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
SISAG-notificacao-api
/
SISAG-notificacao-api-1.1.0.0(7)
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
SISAG-notificacao-api

SISAG-notificacao-api-1.1.0.0(7)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
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
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISAG-NOTIFICACAO-API-DES (13)
Grupo de variáveis de SISAG-NOTIFICACAO-API-DES
Scopes: EC DES
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISAG-NOTIFICACAO-API-DES
_ENV.BOT_TEAMS_URL
https://app-sisag-teams-des.azurewebsites.net
_ENV.HOST_AUTORIZACAO
https://sipnc-host-microfront-des.apps.nprd.caixa
_ENV.PATH_AUTORIZACAO
sisag-autorizacao-des
_ENV.SISAG_TEAMS_IMAGENS_BASE_URL
https://imagem-sisag-teams.des.caixa.gov.br
_ENV.SISAG_TEAMS_IMAGENS_CONTAINER
imagemsisagteams
_ENV.SISAG_TEAMS_IMAGENS_SAS
'${SISAG_TEAMS_IMAGENS_SAS}'
_ENV.TIPOS_AGENCIA
8,60
_ENV.TIPOS_SEV
42
_ENV.TIPOS_SR
42
_ENV.TIPOS_SUV
22
_ENV.UNIDADES_GRUPO47
5063
_ENV.UNIDADES_GRUPO48
7771
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES
ADAPTER_VARIABLES - SIACM Cartões (7)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES
SISAG-COMMON-DES (60)
WO0000078987201
Scopes: EC DES
CHAVE_SISTEMA
********
VAULT_LOCATION
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_CONECTOR_SIROT_URL
https://sisag-conector-sirot-api-des.apps.nprd.caixa
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
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
'${SSAGDS07_ORACLE}'
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01clu08.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=CDBD02BCPDB001)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=3))))
_ENV.ORACLE_USER
SSAGDS07
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
jdbc:postgresql://10.116.92.180:5432/SAGDB001
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
_SECRET.CHAVE_SISTEMA
#{CHAVE_SISTEMA}#
_SECRET.SISAG_VAULT
#{VAULT_LOCATION}#
SISAG-BT-VAULT-DES (1)
WO0000078987201
Scopes: EC DES
BT_SECRETS_LIST
SISAG_DES/CLISERSAG_SSO_INTER,SISAG_DES/CLISERSAG_SSO_INTRA,SISAG_DES/SISAG_BT_APIKEY,SISAG_DES/SAGUSR01_POSTGRES,SISAG_DES/SSAGDS07_ORACLE,SISAG_DES/SSAGMQBD_MQ,SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS
SISAG-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
60b10180-5a47-43b7-b11f-7d96248af836
BT_CLIENT_SECRET
********
SISAG-NOTIFICACAO-API-TQS (17)
Grupo de variáveis de SISAG-NOTIFICACAO-API-TQS
Scopes: EC TQS
SISAG-BT-VAULT-TQS (1)
WO0000078987201
Scopes: EC TQS
SISAG-COMMON-TQS (60)
WO0000078987201
Scopes: EC TQS
SISAG-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
SISAG-NOTIFICACAO-API-HMP (1)
Grupo de variáveis de SISAG-NOTIFICACAO-API-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD,EC PRD2
SISAG-NOTIFICACAO-API-PRD (10)
Grupo de variáveis de SISAG-NOTIFICACAO-API-PRD
Scopes: EC PRD
SISAG-BT-VAULT-PRD (3)
SISAG-BT-VAULT-PRD
Scopes: EC PRD
SISAG-COMMON-PRD (55)
SISAG-COMMON-PRD
Scopes: EC PRD
SISAG-NOTIFICACAO-API-PRD2 (10)
Grupo de variáveis de SISAG-NOTIFICACAO-API-PRD2
Scopes: EC PRD2
SISAG-COMMON-PRD2 (54)
SISAG-COMMON-PRD2
Scopes: EC PRD2
SISAG-BT-VAULT-PRD2 (3)
SISAG-BT-VAULT-PRD2
Scopes: EC PRD2
Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

15 pipelines found

Select a release pipeline to view its releases

5 pipelines found

Row 6

Row 6

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2

