

-sh-4.2$ oc get dc sicmo-internet-des -n sicmo-des -o yaml | grep -A4 'name: SQL_SERVER_PASSWORD'
        - name: SQL_SERVER_PASSWORD
          valueFrom:
            secretKeyRef:
              key: SQL_SERVER_PASSWORD
              name: sicmo-internet-des
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
SICMO-backend-internet
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
sicmo

SICMO-backend-internet
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
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SICMO-INTERNET-DES (24)
Grupo de variáveis de SICMO-INTERNET-DES

Scopes: EC DES
PATH_DESTINO
sicmo
PATH_NFS
/fs_sicmo
POSTGRESQL_SIASO_CONNECTION_PASSWORD
********
SERVER_NFS
hypernprd12.ad.caixa
SIZE_VOLUME
10Gi
SQL_SERVER_PASSWORD
********
_ENV.CLIENT_ID
cli-web-cmo
_ENV.GED_URL
https://siecm.des.caixa/siecm-web/
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.KEYCLOAK_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth
_ENV.KEYCLOAK_REALM
internet
_ENV.KEYCLOAK_SERVICO_CLIENT_ID
cli-ser-cmo
_ENV.LOG_LEVEL
DEBUG
_ENV.PASSWORD_TRUSTSTORE
changeit
_ENV.POSTGRESQL_SIASO_CONNECTION_URL
"jdbc:postgresql://cbrrptqslx196.intra.caixa.gov.br:5175/ASODB001?currentSchema=asosm001"
_ENV.POSTGRESQL_SIASO_CONNECTION_USERNAME
sasobd01
_ENV.REALM
intranet
_ENV.SQL_SERVER_CONNECTION_URL
"jdbc:sqlserver://10.116.164.15:20108;databaseName=cmodb001"
_ENV.SQL_SERVER_USERNAME
SCMOBD01
_ENV.SSL_REQUIRED
none
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SICMO_DES/
_SECRET.KEYCLOAK_SERVICO_CLIENT_SECRET
'${CLISERCMO_SSO_INTER}'
_SECRET.POSTGRESQL_SIASO_CONNECTION_PASSWORD
'${SASOBD01_POSTGRES}'
_SECRET.SQL_SERVER_PASSWORD
'${SCMOBD01_MSSQL}'
SICMO-BT-VAULT-DES (3)
Scopes: EC DES
SICMO-INTERNET-TQS (1)
Grupo de variáveis de SICMO-INTERNET-TQS
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
SICMO-INTERNET-PRD (17)
Grupo de variáveis de SICMO-backend-DES
Scopes: EC PRD
SICMO-INTERNET-BT-VAULT-PRD (3)
SICMO-INTERNET-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Row 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2

Row 5

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

