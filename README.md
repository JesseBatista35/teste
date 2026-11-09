Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISMN-gecci-okd4
Search








All pipelines

SISMN

SISMN-gecci-okd4
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
SISMN-GECCI-DES (38)
Grupo de variáveis de SISMN-GECCI-DES WO0000072503730 - Configuração NFS ISILON path-pdf: ${APL_NORMAS_PATH_PDF:/opt/normas/Publicado/Pdf} path-doc: ${APL_NORMAS_PATH_DOC:/opt/normas/Publicado/Doc} path-modelo: ${APL_NORMAS_PATH_MODELO:/opt/normas/Publicado/Modelo}

Scopes: EC DES
CLI_SER_SMN_SECRET
********
SMN_APIKEY
********
SYSBASEDB01_DBPASS
********
_ENV.APL_AGENDAMENTO_LOCKFILE_IDLE
2400
_ENV.APL_AUTH_SERVICO_CLIENT_ID
cli-ser-smn
_ENV.APL_AUTH_SERVICO_URL
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.APL_EMAIL_CONFIG_LINK
https://sismn-web-des.apps.nprd.caixa/
_ENV.APL_EMAIL_CONFIG_SMTP_HOST
sistemas.correiolivre.caixa
_ENV.APL_EMAIL_CONFIG_SMTP_PASSWORD
********
_ENV.APL_EMAIL_CONFIG_SMTP_PORT
25
_ENV.APL_EMAIL_CONFIG_SMTP_SENDER
sismn@corp.caixa.gov.br
_ENV.APL_EMAIL_CONFIG_SMTP_USER
s739047
_ENV.APL_EMAIL_DATA_SEARCH_ENABLED
true
_ENV.APL_INTEGRACAO_APIM_HOST
https://api.des.caixa:8443
_ENV.APL_LOG_DIAS
7
_ENV.APL_LOG_OPERACAO_NU_SITE
1
_ENV.APL_MANUTENCAO_GRUPOS
","
_ENV.APL_NORMAS_FILE_PERMISSION
777
_ENV.APL_NORMAS_PATH_INDEX
/opt/normas/indexacao
_ENV.APL_NORMAS_PATH_RAW
/opt/normas/Compart/Pdf
_ENV.APL_NORMAS_PATH_ROOT
/opt/normas/Compart/
_ENV.APL_NORMAS_PUBLICADO_DOC
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_MODELO
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_PDF
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_REVOGADO_DOC
/opt/normas/Compart/Doc/Revogado
_ENV.APL_NORMAS_REVOGADO_PDF
/opt/normas/Compart/Pdf/Revogado
_ENV.APL_NORMAS_VIGENTE_DOC
/opt/normas/Compart/Doc/Vigente
_ENV.APL_NORMAS_VIGENTE_MODELO
/opt/normas/Compart/Modelos
_ENV.APL_NORMAS_VIGENTE_PDF
/opt/normas/Compart/Pdf/Vigente
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SYBDES13
_ENV.QUARKUS_DATASOURCE_USERNAME
SSMNBD04
_ENV.QUARKUS_HTTP_CORS_ORIGINS
*
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_SECRET.APL_AUTH_SERVICO_CLIENT_SECRET
#{CLI_SER_SMN_SECRET}#
_SECRET.APL_INTEGRACAO_SIICO_APIKEY
#{SMN_APIKEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SYSBASEDB01_DBPASS}#
SISMN-gecct-BT-VAULT-DES (3)
SISMN-gecct-BT-VAULT-DES
Scopes: EC DES
SISMN-GECCI-TQS (36)
Grupo de variáveis de SISMN-GECCI-TQS
Scopes: EC TQS
CLI_SER_SMN_SECRET
********
SMN_APIKEY
********
SYSBASEDB01_DBPASS
********
_ENV.APL_AGENDAMENTO_LOCKFILE_IDLE
2400
_ENV.APL_AUTH_SERVICO_CLIENT_ID
cli-ser-smn
_ENV.APL_EMAIL_CONFIG_LINK
https://sismn-web-tqs.apps.nprd.caixa/
_ENV.APL_EMAIL_CONFIG_SMTP_HOST
smtptest.correiolivre.caixa
_ENV.APL_EMAIL_CONFIG_SMTP_PASSWORD
HyTe5827
_ENV.APL_EMAIL_CONFIG_SMTP_PORT
25
_ENV.APL_EMAIL_CONFIG_SMTP_SENDER
sismn@corp.caixa.gov.br
_ENV.APL_EMAIL_CONFIG_SMTP_USER
s739047
_ENV.APL_EMAIL_DATA_SEARCH_ENABLED
true
_ENV.APL_INTEGRACAO_APIM_HOST
https://api.des.caixa:8443
_ENV.APL_LOG_DIAS
7
_ENV.APL_MANUTENCAO_GRUPOS
","
_ENV.APL_NORMAS_FILE_PERMISSION
704
_ENV.APL_NORMAS_PATH_INDEX
/opt/normas/indexacao
_ENV.APL_NORMAS_PATH_RAW
/opt/normas/Compart/Pdf
_ENV.APL_NORMAS_PATH_ROOT
/opt/normas/Compart/
_ENV.APL_NORMAS_PUBLICADO_DOC
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_MODELO
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_PDF
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_REVOGADO_DOC
/opt/normas/Compart/Doc/Revogado
_ENV.APL_NORMAS_REVOGADO_PDF
/opt/normas/Compart/Pdf/Revogado
_ENV.APL_NORMAS_VIGENTE_DOC
/opt/normas/Compart/Doc/Vigente
_ENV.APL_NORMAS_VIGENTE_MODELO
/opt/normas/Compart/Modelos
_ENV.APL_NORMAS_VIGENTE_PDF
/opt/normas/Compart/Pdf/Vigente
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:sqlserver://AGSQLDES100.extra.caixa.gov.br:22100;databaseName=master;integratedSecurity=true;authenticationScheme=ntlm;encrypt=true;trustServerCertificate=true;sendTimeAsDateTime=false;
_ENV.QUARKUS_DATASOURCE_USERNAME
f710695
_ENV.QUARKUS_HTTP_CORS_ORIGINS
*
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_SECRET.APL_AUTH_SERVICO_CLIENT_SECRET
#{CLI_SER_SMN_SECRET}#
_SECRET.APL_INTEGRACAO_SIICO_APIKEY
#{SMN_APIKEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SYSBASEDB01_DBPASS}#
SISMN-GECCI-HMP (1)
Grupo de variáveis de SISMN-GECCI-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SISMN-GECCI-PRD (43)
Grupo de variáveis de SISMN-GECCI-PRD
Scopes: EC PRD
|Manage variable groups
Splitter expanded

Expanded

Showing 2 items.

Showing 6757 items.

Showing 1 items.

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Cannot edit in read-only editor



COMPRA EM des funciona ne
