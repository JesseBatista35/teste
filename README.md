
-sh-4.2$ find /deployments -name ".jks" -o -name ".p12" -o -name "*.pkcs12" 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /deployments/ ls -la /opt/ ls -la /app/ find / -name "truststore" 2>/dev/null | head -20
-sh-4.2$
-sh-4.2$
-sh-4.2$


na retornou nada


cara olha isso:

na taks de tks o downlod secure file é esse:
caixa-truststore-cedesbr_azurepush_atualizado2024.jks


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
SISPL-consulta-transacao-OCP4
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
SISPL

SISPL-consulta-transacao-OCP4
Download secure file
Task version
1.*
Display name
Download secure file
Secure File
caixa-truststore-cedesbr_azurepush_atualizado2024.jks
Retry Count
8
Socket Timeout
Control Options
Output Variables
Row 2. Clickable

Showing 1 filtered items.

Get started and run this pipeline for the first time!

Expanded

Collapsed

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2

Showing 15 deployments

Row 2

EC TQSDeploy release

Showing filters 1 through 2



porem na variable group ta assim:


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
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

Library

SISPL-CONSULTA-TRANSACAO-TQS

Variable group
Properties
Variable group name
SISPL-CONSULTA-TRANSACAO-TQS
Description
Grupo de variáveis de SISPL-CONSULTA-TRANSACAO-TQS


Variables
_ENV_DIAS_EXPURGO
3
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV_QUARKUS_DATASOURCE_DB_KIND
db2
_ENV_QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT
5
_ENV_QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL
1M
_ENV_QUARKUS_DATASOURCE_JDBC_DRIVER
com.ibm.db2.jcc.DB2Driver
_ENV_QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE
15
_ENV_QUARKUS_DATASOURCE_JDBC_MAX_SIZE
60
_ENV_QUARKUS_DATASOURCE_JDBC_MIN_SIZE
5
_ENV_QUARKUS_DATASOURCE_JDBC_NEW_CONNECTION_SQL
"SELECT 1 FROM SYSIBM.SYSDUMMY1 WITH UR"
_ENV_QUARKUS_DATASOURCE_JDBC_URL
jdbc:db2://10.192.224.102:5031/CSD4
_ENV_QUARKUS_DATASOURCE_METRICS_ENABLED
true
_ENV_QUARKUS_DATASOURCE_PASSWORD
'${SSPLTB01_DB2}'
_ENV_QUARKUS_DATASOURCE_USERNAME
SSPLTB01
_ENV_QUARKUS_LOG_LEVEL
DEBUG
_ENV_QUARKUS_OIDC_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV_QUARKUS_OIDC_CLIENT_CONNECTION_TIMEOUT
5000
_ENV_QUARKUS_OIDC_ROLES_ROLE_CLAIM_PATH
realm_access/roles
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
VAULT_LOCATION
/usr/src/app/secrets_files/SISPL_TQS/



acho que ta errado ali
