<img width="1369" height="568" alt="image" src="https://github.com/user-attachments/assets/6983ff3a-d09d-482c-ba81-d8468f7bce1d" />


TA AQUI FOI SALVA SIM

Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISGF-backend-okd4
Search








All pipelines

SISGF

SISGF-backend-okd4
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
SISGF-backend-des (50)
Scopes: EC DES
JKS_PASS
changeit
VAULT_LOCATION
/usr/src/app/secrets_files/SISGF_DES/
_ENV.API_KEY
'${SISGF_APIKEY}'
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISGF-backend-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CORS_ORIGINS
"https://sisgf-frontend-des.apps.nprd.caixa"
_ENV.DB2_SIICO_PASSWORD
'${SSGFRD01_DB2}'
_ENV.DB2_SIICO_SCHEMA
DESICO
_ENV.DB2_SIICO_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0"
_ENV.DB2_SIICO_USERNAME
"ssgfrd01"
_ENV.EMAIL_DESTINATARIOS
"jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br"
_ENV.EMAIL_FROM
"sisgf.teste@caixa.gov.br"
_ENV.EMAIL_SMTP_PORT
25
_ENV.EMAIL_SMTP_URL
"smtptest.correiolivre.caixa"
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.NO_PROXY
.caixa,.caixa.gov.br
_ENV.QUARKUS_DATASOURCE_DB_KIND
"other"
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
"oracle.jdbc.driver.OracleDriver"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
"40"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@10.116.101.7:1521/orad01sc"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SSGFRD02_ORA}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SSGFRD02"
_ENV.QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
"SGF"
_ENV.QUARKUS_HIBERNATE_ORB_DIALECT
"org.hibernate.dialect.Oracle10gDialect"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
"false"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
"false"
_ENV.QUARKUS_HIBERNATE_ORM_PACKAGES
"br.gov.caixa.sisgf.api.domain.model"
_ENV.QUARKUS_LOG_LEVEL
"INFO"
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERSGF_SSO_INTRA}'
_ENV.SFTP_CLIENT_SECRET
'${SSGFDR01_SFTP}'
_ENV.SFTP_CLIENT_USER
ssgfdr01
_ENV.SFTP_PATH_DIR_LIST
"/SINAF,/SIPAS,/sipas"
_ENV.SFTP_PATH_ENTRADA
/sistemas/sisgf/arquivos/entrada/relatorios
_ENV.SFTP_SERVER_IP
10.116.89.226
_ENV.SFTP_SERVER_PORT
22
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas/
_ENV.SIICO_API_PUBLICA_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/
_ENV.SINAF_API_EVENTO_URL
https://api.des.caixa:8443/sinaf-api-evento/
_ENV.SISGF_API_URL
https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
_ENV.SISGF_BATCH_UNIDADES_URL
https://sisgf-batch-des.apps.nprd.caixa
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
'${JKS_PASS}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISGF-BACKEND-BT-VAULT-DES (1)
WO0000080005919
Scopes: EC DES
SISGF-BT-VAULT-SECRET-DES (2)
WO0000080990757
Scopes: EC DES
SISGF-backend-tqs (34)
Scopes: EC TQS
SISGF-BT-VAULT-SECRET-TQS (2)
WO0000081066792
Scopes: EC TQS
SISGF-BACKEND-BT-VAULT-TQS (1)
WO0000081129210
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
SISGF-backend-prd (37)
Scopes: EC PRD
SISGF-BACKEND-BT-VAULT-PRD (1)
CHG00003979
Scopes: EC PRD
SISGF-BT-VAULT-SECRET-PRD (2)
CHG00003979
Scopes: EC PRD
|Manage variable groups
Row 2

Row 2

Showing filters 1 through 2

Showing 26 deployments

Expanded

Row 3

Collapsed

Row 2

Row 2

Showing filters 1 through 2




