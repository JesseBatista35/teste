2026-09-30T15:48:28.3090765Z ##[section]Starting: Verificando Status do Deployment
2026-09-30T15:48:28.3096247Z ==============================================================================
2026-09-30T15:48:28.3096349Z Task         : Bash
2026-09-30T15:48:28.3096438Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T15:48:28.3096540Z Version      : 3.227.0
2026-09-30T15:48:28.3096588Z Author       : Microsoft Corporation
2026-09-30T15:48:28.3096672Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T15:48:28.3096758Z ==============================================================================
2026-09-30T15:48:28.4694951Z Generating script.
2026-09-30T15:48:28.4705565Z ========================== Starting Command Output ===========================
2026-09-30T15:48:28.4712649Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8ced3182-35aa-4ec1-9d1d-571e47933009.sh
2026-09-30T15:48:28.7385610Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-30T15:48:29.6695566Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-30T15:48:30.3289904Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-09-30T15:54:35.8213699Z ##[error]The task has timed out.
2026-09-30T15:54:35.8215311Z ##[section]Finishing: Verificando Status do Deployment



2026-09-30T15:54:35.8234914Z ##[section]Starting: Logs da Aplicação
2026-09-30T15:54:35.8239210Z ==============================================================================
2026-09-30T15:54:35.8239318Z Task         : Bash
2026-09-30T15:54:35.8239363Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T15:54:35.8239428Z Version      : 3.227.0
2026-09-30T15:54:35.8239482Z Author       : Microsoft Corporation
2026-09-30T15:54:35.8239533Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T15:54:35.8239608Z ==============================================================================
2026-09-30T15:54:35.9509327Z Generating script.
2026-09-30T15:54:35.9520435Z ========================== Starting Command Output ===========================
2026-09-30T15:54:35.9527688Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/61fcbe60-3219-493d-9b48-d4dac8f78f03.sh
2026-09-30T15:54:35.9575512Z + shopt -s expand_aliases
2026-09-30T15:54:35.9577062Z + [[ -n okd4_nprd ]]
2026-09-30T15:54:35.9577214Z + [[ okd4_nprd =~ ocp ]]
2026-09-30T15:54:35.9577424Z + [[ -n okd4_nprd ]]
2026-09-30T15:54:35.9577549Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-30T15:54:35.9577697Z + app=sipge-webhook-tqs
2026-09-30T15:54:35.9580090Z + oc version
2026-09-30T15:54:36.0440485Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-30T15:54:36.0440731Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-30T15:54:36.0440926Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-30T15:54:36.0469889Z ++ oc get pod -l name=sipge-webhook-tqs -n sipge-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-30T15:54:36.0470090Z ++ tac
2026-09-30T15:54:36.0470654Z ++ grep -v '^$'
2026-09-30T15:54:36.0470982Z ++ head -n1
2026-09-30T15:54:36.1189849Z + last_pod=sipge-webhook-tqs-3-t56vg
2026-09-30T15:54:36.1190463Z + echo 'Logs do POD: sipge-webhook-tqs-3-t56vg'
2026-09-30T15:54:36.1190706Z + oc logs sipge-webhook-tqs-3-t56vg -c sipge-webhook-tqs -n sipge-tqs
2026-09-30T15:54:36.1190912Z Logs do POD: sipge-webhook-tqs-3-t56vg
2026-09-30T15:54:36.2010565Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-30T15:54:36.2010885Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-30T15:54:36.2011055Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-30T15:54:36.2011208Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-30T15:54:36.2011363Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-30T15:54:36.2011661Z 2026-09-30 12:51:57,425 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'io.quarkus.oidc' set below minimum logging level INFO, promoting it to INFO
2026-09-30T15:54:36.2012543Z Failed to load config value of type class java.lang.String for: login.api.sso-intra-secret
2026-09-30T15:54:36.2087122Z ##[section]Finishing: Logs da Aplicação



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
SIPGE-webhook
/
SIPGE-webhook-1.0.0.0(4)
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
SIPGE-webhook

SIPGE-webhook-1.0.0.0(4)


EC TQS
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
Scopes: EC DES,EC TQS,EC HMP
SIPGE-WEBHOOK-DES (7)
Grupo de variáveis de SIPGE-WEBHOOK-DES
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIPGE_DES/
_ENV.CLISER_ID_INTRA
cli-ser-pge
_ENV.LOGIN_API_BASE_URL
https://login.des.caixa
_ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
'${CLISERPGE_SSO_INTRA}'
_ENV.SAP_ECC_API_BASE_URL
https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
_ENV.SSO_INTRA_SECRET
'${CLISERPGE_SSO_INTRA}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIPGE-webhook-BT-VAULT-DES (1)
Scopes: EC DES
BT_SECRETS_LIST
SIPGE_DES/CLISERPGE_SSO_INTRA
SIPGE-BT-VAULT-SECRET-DES (2)
WO0000081607693 - Criação de library
Scopes: EC DES
BT_CLIENT_ID
0f501d71-12ca-4389-bde3-96ce9262c3ec
BT_CLIENT_SECRET
********
SIPGE-WEBHOOK-TQS (7)
Grupo de variáveis de SIPGE-WEBHOOK-TQS
Scopes: EC TQS
VAULT_LOCATION
/usr/src/app/secrets_files/SIPGE_TQS/
_ENV.CLISER_ID_INTRA
cli-ser-pge
_ENV.LOGIN_API_BASE_URL
https://login.des.caixa
_ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
'${CLISERPGE_SSO_INTRA}'
_ENV.SAP_ECC_API_BASE_URL
https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
_ENV.SSO_INTRA_SECRET
'${CLISERPGE_SSO_INTRA}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIPGE-webhook-BT-VAULT-TQS (1)
Scopes: EC TQS
BT_SECRETS_LIST
SIPGE_TQS/CLISERPGE_SSO_INTRA
SIPGE-BT-VAULT-SECRET-TQS (2)
WO0000081751555 - Criação de library
Scopes: EC TQS
BT_CLIENT_ID
7f3ead62-9727-41f5-8b48-b5e3c1ae29d6
BT_CLIENT_SECRET
********
SIPGE-WEBHOOK-HMP (1)
Grupo de variáveis de SIPGE-WEBHOOK-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIPGE-WEBHOOK-PRD (1)
Grupo de variáveis de SIPGE-WEBHOOK-PRD
Scopes: EC PRD
Row 2

Row 2

Select a release pipeline to view its releases

5 pipelines found

Row 4

Showing 26 deployments

Row 6

Row 2

Row 2

EC TQSDeploy release

18 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 3

Showing filters 1 through 2

