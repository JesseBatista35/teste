
-sh-4.2$
-sh-4.2$ oc exec siacc-pixautomatico-api-controle-requisicoes-tqs-69-d4nls -n siacc-tqs -c siacc-pixautomatico-api-controle-requisicoes-tqs -- ls -la /usr/src/app/secrets_files/
total 0
drwxrwxrwt. 3 root root  60 Oct  8 14:52 .
drwxr-xr-x. 3 root root  27 Oct  8 14:53 ..
drwxr-xr-x. 2 1337 root 360 Oct  8 14:52 SIACC_TQS
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o go-template='{{range $k,$v := .data}}{{$k}}{{"\n"}}{{end}}'
QUARKUS_DATASOURCE_PASSWORD
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
-sh-4.2$
-sh-4.2$
-sh-4.2$


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
SIACC-pixautomatico-api-controle-requisicoes
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
SIACC

SIACC-pixautomatico-api-controle-requisicoes
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
SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-DES (30)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-DB-SUPORTE-DES (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-SUPORTE-DES (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-BT-VAULT-DES (1)
Scopes: EC DES
SIACC-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-TQS (20)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-TQS
Scopes: EC TQS
DB_PASSWD
********
_ENV.APP_SWAGGER
true
_ENV.APP_SWAGGER_ADMIN
true
_ENV.CLIENT_TIMEOUT
10000
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_USERNAME
SACCTS01
_ENV.QUARKUS_REST_CLIENT_SIACC_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK
https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK_SWAGGER
https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa/swagger
_ENV.SIACC_CACHE_EXPIRE_AFTER_ACCESS
12H
_ENV.SIACC_CACHE_EXPIRE_AFTER_WRITE
24H
_ENV.SIACC_CACHE_INITIAL_SIZE
1000
_ENV.SIACC_CACHE_MAXIMUM-SIZE
5000
_ENV.SIACC_PRETEND_RESOURCE
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa/pretend
_ENV.SIACC_PRETEND_RESOURCE_SWAGGER
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa/pretend/swagger
_ENV.SIACC_ROUTER__PAYLOADLOCATIONREC_DELETE__ADDRESS
https://sispx-pix-automatico-payloadlocation-api-des.apps.pixnprd4.caixa
_ENV.SIACC_SISPI_QRCODE_DINAMICO
https://sispi-qrcode-api-dinamico-des.apps.pixnprd4.caixa
_ENV.SIACC_SISPX
https://sispx-api-pix-des.apps.pixnprd4.caixa
_ENV.SIACC_SWAGGER_PROXY_URL
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa/swagger/interno/{tag}
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{DB_PASSWD}#
SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS
Scopes: EC TQS
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${saccts01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SACCTS01
SIACC-PIXAUTOMATICO-SUPORTE-TQS (46)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-TQS
Scopes: EC TQS
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
********
_ENV.APIM_CONFIG_APIKEY
l73d2c2aebb40d479083fa48d018530d92
_ENV.APP_ENV
TQS
_ENV.APP_SWAGGER
true
_ENV.APP_SWAGGER_ADMIN
true
_ENV.CLIENT_TIMEOUT
5000
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_OIDC_CLIENT_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CLIENT_ID
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__TOKEN_REQUIRED_CLAIMS_AZP
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__TOKEN_REQUIRED_CLAIMS_AZP
cli-web-acc
_ENV.QUARKUS_REST_CLIENT_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_BATIMENTO_URL
https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa
_ENV.SIACC_API_CAIXA_URL
https://api.des.caixa:8443
_ENV.SIACC_API_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONTROLE_REQUISICOES_URL
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONVENIO_URL
https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa
_ENV.SIACC_API_GERENCIADOR_ARQUIVOS_URL
https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa
_ENV.SIACC_API_PAGAMENTO_URL
https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa
_ENV.SIACC_API_PARAMETROS_URL
https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa
_ENV.SIACC_API_SIMULADOR_URL
https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK_URL
https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_AUDITORIA_URL
https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_MANUTENCAO_URL
https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_REPASSE_URL
https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa
_ENV.SIACC_CACHE_EXPIRE_AFTER_ACCESS
2m
_ENV.SIACC_CACHE_EXPIRE_AFTER_WRITE
15m
_ENV.SIACC_CACHE_INITIAL_SIZE
50
_ENV.SIACC_CACHE_MAXIMUM_SIZE
500
_ENV.SIACC_FRONTEND_CENTRALIZADOR_URL
https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_PIXAUTOMATICO_URL
https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_SERVICOS_URL
https://siacc-servicos-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_GENERAL_LOG_LEVEL
DEBUG
_ENV.SIACC_LISTA_CODIGOS_VINCULOS_SOCIOS
6,8,23,32,36,48,49,87
_ENV.SIACC_LOGIN_CLIENT_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SIACC_LOG_LEVEL
DEBUG
_ENV.SIACC_SSO_INTERNET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.SIACC_SSO_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SIACC_SSO_INTRANET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.SIACC_SSO_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SICLI_CLIENT_TIMEOUT
10000
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/siacc_tqs/
_SECRET.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
#{QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET}#
SIACC-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
BT_CLIENT_ID
dec2394b-0702-4d6f-983b-3d09a18ede73
BT_CLIENT_SECRET
********
SIACC-PIXAUTOMATICO-BT-VAULT-TQS (1)

Scopes: EC TQS
BT_SECRETS_LIST
SIACC_TQS/CLISERACC_SSO,SIACC_TQS/CLISERACCPXA_SSO,SIACC_TQS/SACCDB02_MQ_BAIXA,SIACC_TQS/SACCTS01_ORACLE,SIACC_TQS/SACCSD06_MQ_ALTA,SIACC_TQS/SIACC_APIKEY,SIACC_TQS/S739019_PROXY,SIACC_TQS/WEBHOOK_KEYSTORE
SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-PRD (16)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-CONTROLE-REQUISICOES-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-SUPORTE-PRD (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-PRD
Scopes: EC PRD
SIACC-BT-VAULT-SECRET-PRD (2)
Grupo de variáveis SIACC-BT-VAULT-SECRET-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-BT-VAULT-PRD (1)
Grupo de Variáveis do SIACC-PIXAUTOMATICO-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

10 pipelines found

Row 10

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

EC TQSDeploy release

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

1 pipelines found

Row 2

Showing filters 1 through 2

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
SIACC-pixautomatico-api-simulador
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
SIACC

SIACC-pixautomatico-api-simulador
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
SIACC-PIXAUTOMATICO-API-SIMULADOR-DES (8)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-SUPORTE-DES (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-DB-SUPORTE-DES (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-DES
Scopes: EC DES
SIACC-PIXAUTOMATICO-BT-VAULT-DES (1)
Scopes: EC DES
SIACC-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS (8)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS
Scopes: EC TQS
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"/q/health/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
DEBUG
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.SIACC_RATE_LIMITER_ENABLED
true
_ENV.SIACC_RATE_LIMITER_PERIODICIDADE
1M
_ENV.SIACC_RATE_LIMITER_QTDE_REQ_PERMITIDAS
60
SIACC-PIXAUTOMATICO-SUPORTE-TQS (46)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-TQS
Scopes: EC TQS
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
********
_ENV.APIM_CONFIG_APIKEY
l73d2c2aebb40d479083fa48d018530d92
_ENV.APP_ENV
TQS
_ENV.APP_SWAGGER
true
_ENV.APP_SWAGGER_ADMIN
true
_ENV.CLIENT_TIMEOUT
5000
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_OIDC_CLIENT_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CLIENT_ID
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__TOKEN_REQUIRED_CLAIMS_AZP
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__TOKEN_REQUIRED_CLAIMS_AZP
cli-web-acc
_ENV.QUARKUS_REST_CLIENT_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_BATIMENTO_URL
https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa
_ENV.SIACC_API_CAIXA_URL
https://api.des.caixa:8443
_ENV.SIACC_API_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONTROLE_REQUISICOES_URL
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONVENIO_URL
https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa
_ENV.SIACC_API_GERENCIADOR_ARQUIVOS_URL
https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa
_ENV.SIACC_API_PAGAMENTO_URL
https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa
_ENV.SIACC_API_PARAMETROS_URL
https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa
_ENV.SIACC_API_SIMULADOR_URL
https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK_URL
https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_AUDITORIA_URL
https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_MANUTENCAO_URL
https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_REPASSE_URL
https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa
_ENV.SIACC_CACHE_EXPIRE_AFTER_ACCESS
2m
_ENV.SIACC_CACHE_EXPIRE_AFTER_WRITE
15m
_ENV.SIACC_CACHE_INITIAL_SIZE
50
_ENV.SIACC_CACHE_MAXIMUM_SIZE
500
_ENV.SIACC_FRONTEND_CENTRALIZADOR_URL
https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_PIXAUTOMATICO_URL
https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_SERVICOS_URL
https://siacc-servicos-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_GENERAL_LOG_LEVEL
DEBUG
_ENV.SIACC_LISTA_CODIGOS_VINCULOS_SOCIOS
6,8,23,32,36,48,49,87
_ENV.SIACC_LOGIN_CLIENT_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SIACC_LOG_LEVEL
DEBUG
_ENV.SIACC_SSO_INTERNET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.SIACC_SSO_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SIACC_SSO_INTRANET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.SIACC_SSO_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SICLI_CLIENT_TIMEOUT
10000
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/siacc_tqs/
_SECRET.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
#{QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET}#
SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS
Scopes: EC TQS
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${saccts01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SACCTS01
SIACC-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
BT_CLIENT_ID
dec2394b-0702-4d6f-983b-3d09a18ede73
BT_CLIENT_SECRET
********
SIACC-PIXAUTOMATICO-BT-VAULT-TQS (1)

Scopes: EC TQS
BT_SECRETS_LIST
SIACC_TQS/CLISERACC_SSO,SIACC_TQS/CLISERACCPXA_SSO,SIACC_TQS/SACCDB02_MQ_BAIXA,SIACC_TQS/SACCTS01_ORACLE,SIACC_TQS/SACCSD06_MQ_ALTA,SIACC_TQS/SIACC_APIKEY,SIACC_TQS/S739019_PROXY,SIACC_TQS/WEBHOOK_KEYSTORE
SIACC-PIXAUTOMATICO-API-SIMULADOR-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIACC-PIXAUTOMATICO-API-SIMULADOR-PRD (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-SUPORTE-PRD (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD
Scopes: EC PRD
SIACC-BT-VAULT-SECRET-PRD (2)
Grupo de variáveis SIACC-BT-VAULT-SECRET-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-BT-VAULT-PRD (1)
Grupo de Variáveis do SIACC-PIXAUTOMATICO-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Row 10

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

EC TQSDeploy release

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

1 pipelines found

Row 2

Showing filters 1 through 2

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2



