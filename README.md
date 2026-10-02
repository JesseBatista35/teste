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
SICOW-imp-okd
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
sicow

SICOW-imp-okd
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
SICOW-PORTAL-OKD-DES (57)
Grupo de variáveis de SICOW-PORTAL-OKD-DES
Scopes: EC DES
INIT
Criado via api
JKS_FILE
/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks
JVM_HEAP_MAX
1024m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MAIL_EXPRESSO_HOST
smtptest.correiolivre.caixa
MAIL_EXPRESSO_PORT
25
PASTA_NFS
/sicow
PATH_DESTINO
/sicow
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CESTI/SICOW
SERVER_NFS
nfsctcnprd.ctc.caixa
SICOWCONRES_WAR
https://sicow-conres-okd-des.apps.nprd.caixa/sicow-conres
SICOWIMP_WAR
https://sicow-imp-okd-des.apps.nprd.caixa/sicow-imp-okd
SICOWLG_WAR
https://sicow-lg-okd-des.apps.nprd.caixa/sicowlg
SICOWMTE_WAR
https://sicow-mte-okd-des.apps.nprd.caixa/sicow-mte-okd
SICOWNIA_WAR
https://sicow-nia-okd-des.apps.nprd.caixa/sicow-nia-okd
SICOWPENHOR_WAR
https://sicow-penhor-okd-des.apps.nprd.caixa/sicowpenhor
SICOWPORTALURL
https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef
SICOWSEG_WAR
https://sicow-seg-okd-des.apps.nprd.caixa/sicowseg
SICOW_DS
jdbc:postgresql://10.116.92.41:5116/cowdb001?autoReconnect=true
SICOW_DS_MAX_POLL_SIZE
10
SICOW_DS_MIN_POLL_SIZE
5
SICOW_DS_PASSWORD
${VAULT::SICOW::SCOWDB01::1}
SICOW_DS_USER
scowdb01
SICOW_SICLI_WS_APIKEY
l7415d496745d74a079735c47ef0f3b4be
SICOW_SICLI_WS_SISTEMA
SICOW
SICOW_SICLI_WS_TOKEN_CLIENT_ID
cli-ser-cow
SICOW_SICLI_WS_TOKEN_CLIENT_SECRET
********
SICOW_SICLI_WS_TOKEN_GRANT_TYPE
client_credentials
SICOW_SICLI_WS_TOKEN_URL
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
SICOW_SICLI_WS_URL
https://api.des.caixa:8443/cadastro/v1/clientes
SICOW_SIISO_WS_API_KEY
********
SICOW_SIISO_WS_CLIENT_URL
https://api.des.caixa:8443/cadastro-receita/v4/pessoas-fisicas
SICOW_SIISO_WS_TOKEN_CLIENT_GRANT_TYPE
client_credentials
SICOW_SIISO_WS_TOKEN_CLIENT_ID
cli-ser-cow
SICOW_SIISO_WS_TOKEN_CLIENT_SECRET
********
SICOW_SIISO_WS_TOKEN_URL
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
SIICO_DS
jdbc:postgresql://sctdedadlx0026.df.caixa:51491/posprd01?autoReconnect=true
SIICO_DS_MAX_POLL_SIZE
25
SIICO_DS_MIN_POLL_SIZE
5
SIICO_DS_PASSWORD
********
SIICO_DS_USER
postgres
SIUSR_END_POINT
http://hmp.autentica.proinfo.caixa/siusr-service/SiusrService/SiusrWS
SIZE_VOLUME
50Gi
SUCOI_EXPORT_DIA_MES
9
SUCOI_EXPORT_HORA
12
SUCOI_EXPORT_MINUTO
20
URL_PROXY
proxydes.caixa
USER_TIMEZONE
America/Buenos_Aires
VAULT_ITERATION_COUNT
44
VAULT_KEYSTORE_ALIAS
SecurityKey
VAULT_KEYSTORE_FILE
vault-sicow-des.keystore
VAULT_KEYSTORE_PASSWORD
MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ
VAULT_SALT
87654321
SICOW-IMP-OKD-DES (9)
Grupo de variáveis de SICOW-IMP-OKD-DES

Scopes: EC DES
JKS_ARQUIVO
/opt/jboss-eap-7.4/standalone/configuration/caixa-truststore-acteste-nprd.jks
PATH_DESTINO_CERT_JKS
/opt/jboss-eap-7.4/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=1db83fd9-8b2f-4a25-89d8-8cf25fa9321a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=c5e99b28-6b5d-43e8-889e-f5b829bcd4a2"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SICOW-IMP-OKD-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks"
SICOW-PORTAL-OKD-TQS (268)
Grupo de variáveis de SICOW-PORTAL-OKD-TQS
Scopes: EC TQS
SICOW-IMP-OKD-TQS (3)
Grupo de variáveis de SICOW-IMP-OKD-TQS
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
|Manage variable groups
5 pipelines found

Row 5

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 50 filtered items.

Collapsed

Expanded

Expanded

Collapsed

1 pipelines found

Expanded

Collapsed

Row 2

Showing filters 1 through 2



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
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

SICOW

SICOW-imp-okd

Tasks

Variables

Triggers

Options

History
Predefined variables
nome_imagem
jboss-eap
SITE
okd4_nprd
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.definitionId
5267
system.teamProject
Caixa
tag_imagem
7.4.11-openjdk-8
version.app
1.0.0-SNAPSHOT

Row 2

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 50 filtered items.

Collapsed

Expanded

Expanded

Collapsed

1 pipelines found

Expanded

Collapsed

Row 2

Showing filters 1 through 2

Row 4. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 50 filtered items.

Showing 25 filtered items.



eSTOA TODOS NO MESMO PADRAÕ
