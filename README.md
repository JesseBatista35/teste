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
SILIC-v2-backend
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
SILIC

SILIC-v2-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP,EC TQS_2
SILIC-v2-backend-des (62)
Scopes: EC DES
SILIC-V2-BT-VAULT-DES (3)
SILIC-V2-BT-VAULT-DES WO0000080292412
Scopes: EC DES
SILIC-v2-backend-tqs (61)
Scopes: EC TQS,EC TQS_2
SILIC-V2-BT-VAULT-TQS (3)
SILIC-V2-BT-VAULT-TQS WO0000080292412
Scopes: EC TQS,EC TQS_2
SILIC-v2-backend-tqs_2 (62)
WO0000081073164
Scopes: EC TQS_2
APIKEY
********
CLIENT_CREDENTIALS_SECRET
********
ECMD_PASS
SAP_ODATA_PASSWORD
********
SAP_PI_PASSWORD
********
SENHA_BD_SAP_SISRH
********
SENHA_DB
********
_ENV.AMBIENTE
tqs2
_ENV.API_CAIXA_URL
https://api.des.caixa:8443
_ENV.API_GED_URL
https://siecm.des.caixa/siecm-web/ECM
_ENV.API_SAP_SISRH_USERNAME
SRFOBH01
_ENV.API_SAP_URL
https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
_ENV.API_SICLG_URL
https://des.siclg.caixa/rest
_ENV.API_SILIC_URL
https://silic-v2-frontend-tqs2-tqs.apps.nprd.caixa/silic
_ENV.APPLICATION_SERVER_IP
10.116.221.152
_ENV.DB_SAP_SISRH_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
_ENV.DB_SAP_SISRH_USERNAME
SLICPGED
_ENV.DB_SCHEMA_SILIC
lichfx
_ENV.DB_SILIC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng
_ENV.DB_SILIC_USERNAME
SLICTB01
_ENV.ECMD_USER
SLICECMD
_ENV.EMAIL_ENVIAR
false
_ENV.EMAIL_GECOT
gecot@caixa.gov.br
_ENV.EMAIL_HOST
smtptest.correiolivre.caixa
_ENV.EMAIL_PORT
25
_ENV.EMAIL_REMETENTE
gecot06@caixa.gov.br
_ENV.EMAIL_SSL
false
_ENV.EMAIL_SUCOT
sucot@caixa.gov.br
_ENV.JDBC_MAX_SIZE
20
_ENV.JDBC_MIN_SIZE
5
_ENV.JVM_ARGS_XMS
-Xms512m
_ENV.JVM_ARGS_XMX
-Xmx512m
_ENV.LOTE_ATESTE_MANUAL_IDGED
6088109C-0000-C21E-88FC-D21A6F659AE8
_ENV.LOTE_ATESTE_MODELO_IDGED
3087109C-0000-CD16-8B25-32A643E23498
_ENV.LOTE_FORNECEDOR_RELEVANTE_MANUAL_IDGED
9092589C-0000-CB16-93B7-4F3F53EEC0F7
_ENV.LOTE_FORNECEDOR_RELEVANTE_MODELO_IDGED
30C3589C-0000-C51B-92DB-BBA7F7263FDC
_ENV.LOTE_ORCAMENTO_MANUAL_IDGED
30670B9D-0000-C21E-A8F3-256277F8BB39
_ENV.LOTE_ORCAMENTO_MODELO_IDGED
8089109C-0000-C411-9FD2-DCB73985FE4B
_ENV.LOTE_PLANOAQUISICAO_MANUAL_IDGED
9055109C-0000-CA13-A86B-C3E1D2402D6F
_ENV.LOTE_PLANOAQUISICAO_MODELO_IDGED
F0F30F9C-0000-C314-A119-2B3FF9D69138
_ENV.MANUAL_SILIC_IDGED
50F75F9E-0000-C31D-96F9-1E44368A93D1
_ENV.POOL_CORE_THREADS
20
_ENV.POOL_MAX_THREADS
50
_ENV.PORTAL_TRANSPARENCIA_API_KEY
chave-api-dados
_ENV.PORTAL_TRANSPARENCIA_API_URL
https://api.portaldatransparencia.gov.br
_ENV.QUARKUS_HTTP_CORS_ORIGINS
https://silic-v2-frontend-tqs2-tqs.apps.nprd.caixa
_ENV.QUARKUS_PROFILE
tqs
_ENV.SAP_USER
SILICBH01
_ENV.SHOW_SQL
true
_ENV.SHOW_SQL_LOG_LEVEL
INFO
_ENV.SILIC_AUTH_CLIENT_ID
cli-ser-lic
_ENV.SILIC_AUTH_URL
https://login.des.caixa/auth/realms/intranet
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+ParallelRefProcEnabled -XX:+ExitOnOutOfMemoryError -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Xlog:gc*,safepoint:stdout:time,level,tags -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=55 "
_SECRET.API_CAIXA_KEY
#{APIKEY}#
_SECRET.API_SAP_SISRH_PASSWORD
********
_SECRET.BD_SAP_SISRH_PASSWORD
#{SENHA_BD_SAP_SISRH}#
_SECRET.DB_SILIC_PASSWORD
#{SENHA_DB}#
_SECRET.ECMD_PASSWORD
#{ECMD_PASS}#
_SECRET.PORTAL_TRANSPARENCIA_API_VALUE
********
_SECRET.SAP_ODATA_PASSWORD
#{SAP_ODATA_PASSWORD}#
_SECRET.SAP_PI_PASSWORD
#{SAP_PI_PASSWORD}#
_SECRET.SILIC_AUTH_CLIENT_SECRET
#{CLIENT_CREDENTIALS_SECRET}#
OKD-4-APL (12)
Scopes: EC PRD
SILIC-v2-backend-prd (54)
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

Expanded

Collapsed

8 pipelines found

Select a release pipeline to view its releases

7 pipelines found

Row 7

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Expanded

Collapsed

2 pipelines found

Row 3

Showing filters 1 through 2

Showing filters 1 through 2

2 pipelines found

Row 2

Showing filters 1 through 2

2026-09-01T20:02:41.5512455Z QUARKUS_HTTP_CORS_ORIGINS=https://silic-v2-frontend-tqs.apps.nprd.caixa, 1 of 1 found for 'quarkus_http', at 51:30



mp pkd elça ta chegando errada


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
Services
Routes
Ingresses
NetworkPolicies
Storage
Builds
Observe
Compute
User Management
Administration

Project: silic-tqs
DeploymentConfigs
DeploymentConfig details
DeploymentConfig
DC
silic-v2-backend-tqs2-tqs

Actions
Details
YAML
ReplicationControllers
Pods
Environment
Events
Container:

Container
C
silic-v2-backend-tqs2-tqs
Single values (env)
NameValue
TZ
America/Sao_Paulo
AMBIENTE
tqs
API_CAIXA_URL
https://api.des.caixa:8443
API_GED_URL
https://siecm.des.caixa/siecm-web/ECM
API_SAP_SISRH_USERNAME
SRFOBH01
API_SAP_URL
https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
API_SICLG_URL
https://des.siclg.caixa/rest
API_SILIC_URL
https://silic-v2-frontend-tqs.apps.nprd.caixa/silic
APPLICATION_SERVER_IP
10.116.221.152
DB_SAP_SISRH_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
DB_SAP_SISRH_USERNAME
SLICPGED
DB_SCHEMA_SILIC
lichfx
DB_SILIC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/orat82ng
DB_SILIC_USERNAME
SLICTB01
ECMD_USER
SLICECMD
EMAIL_ENVIAR
TRUE
EMAIL_GECOT
gecot@caixa.gov.br
EMAIL_HOST
smtptest.correiolivre.caixa
EMAIL_PORT
25
EMAIL_REMETENTE
gecot06@caixa.gov.br
EMAIL_SSL
false
EMAIL_SUCOT
sucot05@caixa.gov.br
JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+ParallelRefProcEnabled -XX:+ExitOnOutOfMemoryError -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Xlog:gc*,safepoint:stdout:time,level,tags -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=55 
JDBC_MAX_SIZE
20
JDBC_MIN_SIZE
5
JVM_ARGS_XMS
-Xms512m
JVM_ARGS_XMX
-Xmx512m
LOTE_ATESTE_MANUAL_IDGED
6088109C-0000-C21E-88FC-D21A6F659AE8
LOTE_ATESTE_MODELO_IDGED
3087109C-0000-CD16-8B25-32A643E23498
LOTE_FORNECEDOR_RELEVANTE_MANUAL_IDGED
9092589C-0000-CB16-93B7-4F3F53EEC0F7
LOTE_FORNECEDOR_RELEVANTE_MODELO_IDGED
30C3589C-0000-C51B-92DB-BBA7F7263FDC
LOTE_ORCAMENTO_MANUAL_IDGED
30670B9D-0000-C21E-A8F3-256277F8BB39
LOTE_ORCAMENTO_MODELO_IDGED
8089109C-0000-C411-9FD2-DCB73985FE4B
LOTE_PLANOAQUISICAO_MANUAL_IDGED
9055109C-0000-CA13-A86B-C3E1D2402D6F
LOTE_PLANOAQUISICAO_MODELO_IDGED
F0F30F9C-0000-C314-A119-2B3FF9D69138
MANUAL_SILIC_IDGED
50F75F9E-0000-C31D-96F9-1E44368A93D1
POOL_CORE_THREADS
20
POOL_MAX_THREADS
50
PORTAL_TRANSPARENCIA_API_KEY
chave-api-dados
PORTAL_TRANSPARENCIA_API_URL
https://api.portaldatransparencia.gov.br
QUARKUS_HTTP_CORS_ORIGINS
https://silic-v2-frontend-tqs.apps.nprd.caixa
QUARKUS_PROFILE
tqs
SAP_USER
SILICBH01
SHOW_SQL
false
SHOW_SQL_LOG_LEVEL
INFO
SILIC_AUTH_CLIENT_ID
cli-ser-lic
SILIC_AUTH_URL
https://login.des.caixa/auth/realms/intranet
API_CAIXA_KEY

Secret
S
silic-v2-backend-tqs2-tqs

API_CAIXA_KEY
BD_SAP_SISRH_PASSWORD

Secret
S
silic-v2-backend-tqs2-tqs

BD_SAP_SISRH_PASSWORD
DB_SILIC_PASSWORD

Secret
S
silic-v2-backend-tqs2-tqs

DB_SILIC_PASSWORD
ECMD_PASSWORD

Secret
S
silic-v2-backend-tqs2-tqs

ECMD_PASSWORD
SAP_ODATA_PASSWORD

Secret
S
silic-v2-backend-tqs2-tqs

SAP_ODATA_PASSWORD
SAP_PI_PASSWORD

Secret
S
silic-v2-backend-tqs2-tqs

SAP_PI_PASSWORD
SILIC_AUTH_CLIENT_SECRET

Secret
S
silic-v2-backend-tqs2-tqs

SILIC_AUTH_CLIENT_SECRET
All values from existing ConfigMaps or Secrets (envFrom)
ConfigMap/SecretPrefix (optional)

Select a resource




2026-09-01T20:02:40.5019253Z ##[section]Starting: Exportando Variáveis de Ambiente "_ENV."
2026-09-01T20:02:40.5022252Z ==============================================================================
2026-09-01T20:02:40.5022335Z Task         : Bash
2026-09-01T20:02:40.5022383Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T20:02:40.5022462Z Version      : 3.227.0
2026-09-01T20:02:40.5022511Z Author       : Microsoft Corporation
2026-09-01T20:02:40.5022577Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T20:02:40.5022653Z ==============================================================================
2026-09-01T20:02:41.5397363Z Generating script.
2026-09-01T20:02:41.5407731Z ========================== Starting Command Output ===========================
2026-09-01T20:02:41.5416252Z [command]/bin/bash /opt/ads-agent/_work/_temp/3e5df20f-bd11-499c-86b0-0ff5e35df562.sh
2026-09-01T20:02:41.5503652Z AMBIENTE=tqs
2026-09-01T20:02:41.5504170Z API_CAIXA_URL=https://api.des.caixa:8443
2026-09-01T20:02:41.5504888Z API_GED_URL=https://siecm.des.caixa/siecm-web/ECM
2026-09-01T20:02:41.5505086Z API_SAP_SISRH_USERNAME=SRFOBH01
2026-09-01T20:02:41.5505255Z API_SAP_URL=https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
2026-09-01T20:02:41.5505421Z API_SICLG_URL=https://des.siclg.caixa/rest
2026-09-01T20:02:41.5505646Z API_SILIC_URL=https://silic-v2-frontend-tqs.apps.nprd.caixa/silic
2026-09-01T20:02:41.5505809Z APPLICATION_SERVER_IP=10.116.221.152
2026-09-01T20:02:41.5506132Z DB_SAP_SISRH_URL=jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
2026-09-01T20:02:41.5506327Z DB_SAP_SISRH_USERNAME=SLICPGED
2026-09-01T20:02:41.5506476Z DB_SCHEMA_SILIC=lichfx
2026-09-01T20:02:41.5506713Z DB_SILIC_URL=jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/orat82ng
2026-09-01T20:02:41.5506899Z DB_SILIC_USERNAME=SLICTB01
2026-09-01T20:02:41.5507054Z ECMD_USER=SLICECMD
2026-09-01T20:02:41.5507179Z EMAIL_ENVIAR=TRUE
2026-09-01T20:02:41.5507306Z EMAIL_GECOT=gecot@caixa.gov.br
2026-09-01T20:02:41.5507453Z EMAIL_HOST=smtptest.correiolivre.caixa
2026-09-01T20:02:41.5507592Z EMAIL_PORT=25
2026-09-01T20:02:41.5507716Z EMAIL_REMETENTE=gecot06@caixa.gov.br
2026-09-01T20:02:41.5507864Z EMAIL_SSL=false
2026-09-01T20:02:41.5507990Z EMAIL_SUCOT=sucot05@caixa.gov.br
2026-09-01T20:02:41.5508535Z JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+ParallelRefProcEnabled -XX:+ExitOnOutOfMemoryError -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -Xlog:gc*,safepoint:stdout:time,level,tags -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=55 "
2026-09-01T20:02:41.5508870Z JDBC_MAX_SIZE=20
2026-09-01T20:02:41.5508987Z JDBC_MIN_SIZE=5
2026-09-01T20:02:41.5509147Z JVM_ARGS_XMS=-Xms512m
2026-09-01T20:02:41.5509298Z JVM_ARGS_XMX=-Xmx512m
2026-09-01T20:02:41.5509661Z LOTE_ATESTE_MANUAL_IDGED=6088109C-0000-C21E-88FC-D21A6F659AE8
2026-09-01T20:02:41.5509899Z LOTE_ATESTE_MODELO_IDGED=3087109C-0000-CD16-8B25-32A643E23498
2026-09-01T20:02:41.5510147Z LOTE_FORNECEDOR_RELEVANTE_MANUAL_IDGED=9092589C-0000-CB16-93B7-4F3F53EEC0F7
2026-09-01T20:02:41.5510403Z LOTE_FORNECEDOR_RELEVANTE_MODELO_IDGED=30C3589C-0000-C51B-92DB-BBA7F7263FDC
2026-09-01T20:02:41.5510643Z LOTE_ORCAMENTO_MANUAL_IDGED=30670B9D-0000-C21E-A8F3-256277F8BB39
2026-09-01T20:02:41.5510874Z LOTE_ORCAMENTO_MODELO_IDGED=8089109C-0000-C411-9FD2-DCB73985FE4B
2026-09-01T20:02:41.5511117Z LOTE_PLANOAQUISICAO_MANUAL_IDGED=9055109C-0000-CA13-A86B-C3E1D2402D6F
2026-09-01T20:02:41.5511362Z LOTE_PLANOAQUISICAO_MODELO_IDGED=F0F30F9C-0000-C314-A119-2B3FF9D69138
2026-09-01T20:02:41.5511581Z MANUAL_SILIC_IDGED=50F75F9E-0000-C31D-96F9-1E44368A93D1
2026-09-01T20:02:41.5511723Z POOL_CORE_THREADS=20
2026-09-01T20:02:41.5511853Z POOL_MAX_THREADS=50
2026-09-01T20:02:41.5512038Z PORTAL_TRANSPARENCIA_API_KEY=chave-api-dados
2026-09-01T20:02:41.5512215Z PORTAL_TRANSPARENCIA_API_URL=https://api.portaldatransparencia.gov.br
2026-09-01T20:02:41.5512455Z QUARKUS_HTTP_CORS_ORIGINS=https://silic-v2-frontend-tqs.apps.nprd.caixa
2026-09-01T20:02:41.5512664Z QUARKUS_PROFILE=tqs
2026-09-01T20:02:41.5512785Z SAP_USER=SILICBH01
2026-09-01T20:02:41.5513242Z SHOW_SQL=false
2026-09-01T20:02:41.5514152Z SHOW_SQL_LOG_LEVEL=INFO
2026-09-01T20:02:41.5514769Z SILIC_AUTH_CLIENT_ID=cli-ser-lic
2026-09-01T20:02:41.5515397Z SILIC_AUTH_URL=https://login.des.caixa/auth/realms/intranet
2026-09-01T20:02:41.5568039Z ##[section]Finishing: Exportando Variáveis de Ambiente "_ENV."


