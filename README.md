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
SIFOF-api-aplicacao
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
sifof

SIFOF-api-aplicacao
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIFOF-API-APLICACAO-DES (22)
Grupo de variáveis de SIFOF-API-APLICACAO-DES
Scopes: EC DES
PATH_DESTINO
/sifof
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
50Gi
VAULT_LOCATION
********
_ENV.API_KEY
'${SIFOF_BT_APIKEY}'
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.IMPORTACAO.STAGING.BASE_PATH
/sifof/des/importacao
_ENV.IMPORTACAO.STAGING.FAILED
/sifof/des/importacao/failed
_ENV.IMPORTACAO.STAGING.PENDING
/sifof/des/importacao/pending
_ENV.IMPORTACAO.STAGING.PROCESSED
/sifof/des/importacao/processed
_ENV.IMPORTACAO.STAGING.PROCESSING
/sifof/des/importacao/processing
_ENV.IMPORTACAO.UPLOAD.MAX_FILE_SIZE
52428800
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/ORAD05BC"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SFOFDS01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SFOFDS01
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
'${CLISERFOF_SSO_INTRA}'
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
#{VAULT_LOCATION}#
SIFOF-BT-VAULT-DES (1)
WO0000080223599
Scopes: EC DES
SIFOF-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIFOF-API-APLICACAO-TQS (22)
Grupo de variáveis de SIFOF-API-APLICACAO-TQS

Scopes: EC TQS
PATH_DESTINO
/sifof
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
50Gi
VAULT_LOCATION
********
_ENV.API_KEY
'${SIFOF_BT_APIKEY}'
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.IMPORTACAO.STAGING.BASE_PATH
/sifof/tqs/importacao
_ENV.IMPORTACAO.STAGING.FAILED
/sifof/tqs/importacao/failed
_ENV.IMPORTACAO.STAGING.PENDING
/sifof/tqs/importacao/pending
_ENV.IMPORTACAO.STAGING.PROCESSED
/sifof/tqs/importacao/processed
_ENV.IMPORTACAO.STAGING.PROCESSING
/sifof/tqs/importacao/processing
_ENV.IMPORTACAO.UPLOAD.MAX_FILE_SIZE
52428800
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@cnpexdadvm02clu11.extra.caixa.gov.br:1521/ORAT05BC"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SFOFTS01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SFOFTS01
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
'${CLISERFOF_SSO_INTRA}'
_SECRET.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
#{VAULT_LOCATION}#
SIFOF-BT-VAULT-TQS (1)
WO0000080226786
Scopes: EC TQS
BT_SECRETS_LIST
SIFOF_TQS/CLISERFOF_SSO_INTRA,SIFOF_TQS/SIFOF_BT_APIKEY,SIFOF_TQS/SFOFTS01_ORACLE
SIFOF-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
BT_CLIENT_ID
a066a482-f4e9-4f2f-a62b-cccd5c8ca6dc
BT_CLIENT_SECRET
********
SIFOF-API-APLICACAO-HMP (1)
Grupo de variáveis de SIFOF-API-APLICACAO-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIFOF-API-APLICACAO-PRD (22)
Grupo de variáveis de SIFOF-API-APLICACAO-PRD
Scopes: EC PRD
SIFOF-BT-VAULT-SECRET-PRD (2)
Grupo de variáveis SIFOF-BT-VAULT-SECRET-PRD
Scopes: EC PRD
SIFOF-BT-VAULT-PRD (1)
Grupo de variáveis SIFOF-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

EC TQSDeploy release

Expanded

Row 3

Collapsed

Showing 26 deployments

Showing 26 deployments

Showing filters 1 through 2

Collapsed

Expanded

Expanded

Collapsed

3 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 2

Row 8

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

