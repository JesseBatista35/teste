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
SIGSJ-destinacao
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
SIGSJ

SIGSJ-destinacao
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (88)
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
SIGSJ-destinacao-des (11)

Scopes: EC DES
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIGSJ-DESTINACAO-DES
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.SIGSJ_HSM_ALIAS_CERTIFICADO
assinatura.sigsj.destinacao.jwt.nprd.caixa
_ENV.SIGSJ_HSM_ALIAS_CHAVE
assinatura.sigsj.destinacao.jwt.nprd.caixa
_ENV.SIGSJ_HSM_ENABLED
true
_ENV.SIGSJ_HSM_ENDERECO
hsmdes.extra.caixa.gov.br
_ENV.SIGSJ_HSM_SENHA
********
_ENV.SIGSJ_HSM_USUARIO
SGSJDH01
_ENV.SIGSJ_JWS_ISSUER
https://sigsj-destinacao-des.apps.nprd.caixa
_ENV.SIGSJ_JWS_KID
sigsj-destinacao-nprd-1
_ENV.SIGSJ_QUEUE_DESTINAR_PIX_LEVANTAMENTO
SIGSJ.REQ.DESTINAR_PIX_LEVANTAMENTO
SIGSJ-comum-des (46)
Scopes: EC DES
JKS_PASS
changeit
PASS_CICSWS
********
PASS_DB2
********
PASS_ORACLE
"N/A"
SECRET_SSO_INTRA
********
SSO
'${CLISERGSJ_SSO_INTER}'
SSO_INTRA
'${CLISERGSJ_SSO_INTRA}'
VAULT_LOCATION
/usr/src/app/secrets_files/SIGSJ_DES/
_ENV.API_MANAGER_APIKEY
l7c05aa788cab746389ebdb746d30215bc
_ENV.API_PARCEIROS_APIKEY
4448bef18951433797b816153128e6ab
_ENV.CICSWS_URL
"https://cicsweb.des.caixa:2587"
_ENV.CICSWS_USERNAME
SGSJSD01
_ENV.DATASOURCE_MAX_POOL_SIZE
5
_ENV.DATASOURCE_MIN_POOL_SIZE
1
_ENV.DB_ALIAS
orad01bc
_ENV.DB_URL
"cnpexdadvm01-scan8.extra.caixa.gov.br"
_ENV.DB_USER
SGSJDS01
_ENV.HOST-VPN-TRIBUNAL
172.28.144.217
_ENV.HOST-VPN-TRIBUNAL_PORTA
8000
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa"
_ENV.NO_PROXY
".caixa,.caixa.gov.br,apim-parceiros-sandbox.azure-api.net"
_ENV.QUARKUS_API_MANAGER_URL
"https://api.des.caixa:8443/"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.192.225.76:2905/DBD0"
_ENV.QUARKUS_DATASOURCE_USERNAME
SGSJDS01
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL_INTRA
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
ad144649-5b73-42f5-978b-c84c6b8cd16d
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET_INTRA
26529535-b805-4274-a7f8-203a97ae1571
_ENV.QUARKUS_RETURN_STACKTRACE
true
_ENV.SIGSJ_QUEUE_RESET_INTERVAL
"0 */30 * * * ?"
_ENV.SIGSJ_WMQ_CHANNEL
SIGSJ.SVRCONN
_ENV.SIGSJ_WMQ_HOSTNAME
ibmspdes.caixa
_ENV.SIGSJ_WMQ_PORT
1420
_ENV.SIGSJ_WMQ_QUEUEMANAGER
QSDA
_ENV.SIGSJ_WMQ_USER
SGSJSD01
_ENV.SIGSJ_WMQ_USERNAME
SGSJSD02
_ENV.SIMTR_URL
"http://simtr-api-intranet-des-esteiras.simtr-des.svc:8080/"
_ENV.SSO_CLIENT_ID
cli-ser-gsj
_ENV.URL_PROXY
http://proxydes.caixa:80
_SECRET.CICSWS_PASSWORD
#{PASS_CICSWS}#
_SECRET.ORACLE_PASSWORD
'${SGSJSD01_ORACLE}'
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASS_DB2}#
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
#{JKS_PASS}#
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
#{VAULT_LOCATION}#
SIGSJ-insights-des (5)
Variáveis comuns para os módulos do SIGSJ-Quarkus para configuração de Insights
Scopes: EC DES
SIGSJ-DESTINACAO-BT-VAULT-DES (1)
Scopes: EC DES
BT_SECRET_LIST
SGSJDH01_HSM
SIGSJ-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
BT_CLIENT_SECRET
SIGSJ-destinacao-tqs (3)
Scopes: EC TQS
SIGSJ-comum-tqs (37)
Scopes: EC TQS
SIGSJ-destinacao-hmp (1)
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIGSJ-destinacao-PRD (3)
Scopes: EC PRD
SIGSJ-comum-prd (32)
Scopes: EC PRD
SIGSJ-insights-prd (6)
Variáveis comuns para os módulos do SIGSJ-Quarkus para configuração de Insights
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

Collapsed

Expanded

Row 2

Row 2

Row 2

7 pipelines found

Select a release pipeline to view its releases

64 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

List item selected

List item selected

Showing filters 1 through 2

