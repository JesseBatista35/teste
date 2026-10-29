Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIBEC-arquivos
Search








All pipelines

SIBEC

SIBEC-arquivos
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
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIBEC-ARQUIVOS-DES (51)
Grupo de variáveis de SIBEC-ARQUIVOS-DES
Scopes: EC DES
PATH_DESTINO
/sibec3
PATH_NFS
/fs_sibec_des_nprd
SERVER_NFS
nprdnfs01.ad.caixa
SIZE_VOLUME
50Gi
VAULT_LOCATION
/usr/src/app/secrets_files/SIBEC_DES/
_ENV.AMBIENTE
des
_ENV.API_MP_REST_SCOPE
javax.inject.singleton
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_CORS_ORIGINS
"https://sibec-estatico-des.apps.nprd.caixa, https://sibec-estatico-internet-des.apps.nprd.caixa, http://localhost:4200"
_ENV.QUARKUS_DATASOURCE_DB-KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-SIZE
40
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0:currentSchema=DESBEC;"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SBECDR01_DB2}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SBECDR01"
_ENV.QUARKUS_HIBERNATE-ORM_DIALECT
org.hibernate.dialect.db2dialect
_ENV.QUARKUS_HIBERNATE-ORM_LOG_BIND-PARAMETERS
true
_ENV.QUARKUS_HIBERNATE-ORM_LOG_SQL
true
_ENV.QUARKUS_HIBERNATE-ORM_PACKAGES
br.gov.caixa.sibec.api.domain.model
_ENV.QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_PATHS
/api/*
_ENV.QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_POLICY
authenticated
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_CORS_EXPOSED-HEADERS
content-disposition
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_APPLICATION-TYPE
service
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
"https://login.des.caixa/auth/realms/intranet"
_ENV.QUARKUS_OIDC_CLIENT_ID
"cli-ser-bec"
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERBEC_SSO_INTRA}'
_ENV.QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
"https://logindes.caixa.gov.br/auth/realms/internet"
_ENV.QUARKUS_OIDC_INTERNET_CLIENT_ID
"cli-ser-bec"
_ENV.QUARKUS_OIDC_INTERNET_CREDENTIALS_SECRET
'${CLISERBEC_SSO_INTER}'
_ENV.QUARKUS_OIDC_ROLES_SOURCE
accesstoken
_ENV.QUARKUS_OIDC_TOKEN_AUTO-REFRESH-INTERVAL
18000
_ENV.QUARKUS_RESTEASY_PATH
/api
_ENV.QUARKUS_SMALLRYE-HEALTH_LIVENESS-PATH
/live
_ENV.QUARKUS_SMALLRYE-HEALTH_READINESS-PATH
/ready
_ENV.QUARKUS_SMALLRYE-HEALTH_ROOT-PATH
/check
_ENV.QUARKUS_SMALLRYE-METRICS_JAXRS_ENABLED
true
_ENV.QUARKUS_SMALLRYE-METRICS_PATH
/nsgd/metrics
_ENV.QUARKUS_SMALLRYE-OPENAPI_PATH
/swagger
_ENV.QUARKUS_TRANSACTION-MANAGER_DEFAULT-TRANSACTION-TIMEOUT
pt60m
_ENV.SIBEC_API_KEY
l7b3130779847d474ea81fc1d64ac7e865
_ENV.SIBEC_MICRO
"https://sibec-micro-des-esteiras.nprd2.caixa/api"
_ENV.filestore.ambiente.relatorio
BECD
_ENV.filestore.ambiente.relatorio.perfil
BEC07
_ENV.filestore.ambiente.relatorioCID
CIDD
_ENV.filestore.path.envio
/upload/envio
_ENV.filestore.path.estruturaPastas
"Judicial,Folha,Relatorio,Qualificacao,Manutencao,Habilitacao,Outros,Diversos,upload,upload/envio,upload/original,upload/retorno,upload/calendario"
_ENV.filestore.path.original
/upload/original
_ENV.filestore.path.retorno
/upload/retorno
_ENV.filestore.path.servidor
/sibec3
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIBEC-ARQUIVOS-BT-VAULT-DES (1)
WO0000078511973
Scopes: EC DES
BT_SECRETS_LIST
SIBEC_DES/SBECDR01_DB2,SIBEC_DES/CLISERBEC_SSO_INTRA,SIBEC_DES/CLISERBEC_SSO_INTER,SIBEC_DES/SIBEC_APIKEY
SIBEC-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
1ce83d68-29d8-4dbc-987c-63df8dc3c7bf
BT_CLIENT_SECRET
********
SIBEC-ARQUIVOS-TQS (51)
Grupo de variáveis de SIBEC-ARQUIVOS-TQS
Scopes: EC TQS
PATH_DESTINO
/sibec3
PATH_NFS
/fs_sibec_des_nprd
SERVER_NFS
nprdnfs01.ad.caixa
SIZE_VOLUME
50Gi
VAULT_LOCATION
/usr/src/app/secrets_files/SIBEC_TQS/
_ENV.AMBIENTE
tqs
_ENV.API_MP_REST_SCOPE
javax.inject.singleton
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_CORS_ORIGINS
"https://sibec-estatico-tqs.apps.nprd.caixa, https://sibec-estatico-internet-tqs.apps.nprd.caixa"
_ENV.QUARKUS_DATASOURCE_DB-KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-SIZE
40
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentSchema=TQSBEC;"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SBECTR01_DB2}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SBECTR01"
_ENV.QUARKUS_HIBERNATE-ORM_DIALECT
org.hibernate.dialect.db2dialect
_ENV.QUARKUS_HIBERNATE-ORM_LOG_BIND-PARAMETERS
true
_ENV.QUARKUS_HIBERNATE-ORM_LOG_SQL
true
_ENV.QUARKUS_HIBERNATE-ORM_PACKAGES
br.gov.caixa.sibec.api.domain.model
_ENV.QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_PATHS
/api/*
_ENV.QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_POLICY
authenticated
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_CORS_EXPOSED-HEADERS
content-disposition
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_APPLICATION-TYPE
service
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
"https://login.tqs.caixa/auth/realms/intranet"
_ENV.QUARKUS_OIDC_CLIENT_ID
"cli-ser-bec"
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERBEC_SSO_INTRA}'
_ENV.QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
"https://logintqs.caixa.gov.br/auth/realms/internet"
_ENV.QUARKUS_OIDC_INTERNET_CLIENT_ID
"cli-ser-bec"
_ENV.QUARKUS_OIDC_INTERNET_CREDENTIALS_SECRET
'${CLISERBEC_SSO_INTER}'
_ENV.QUARKUS_OIDC_ROLES_SOURCE
accesstoken
_ENV.QUARKUS_OIDC_TOKEN_AUTO-REFRESH-INTERVAL
18000
_ENV.QUARKUS_RESTEASY_PATH
/api
_ENV.QUARKUS_SMALLRYE-HEALTH_LIVENESS-PATH
/live
_ENV.QUARKUS_SMALLRYE-HEALTH_READINESS-PATH
/ready
_ENV.QUARKUS_SMALLRYE-HEALTH_ROOT-PATH
/check
_ENV.QUARKUS_SMALLRYE-METRICS_JAXRS_ENABLED
true
_ENV.QUARKUS_SMALLRYE-METRICS_PATH
/nsgd/metrics
_ENV.QUARKUS_SMALLRYE-OPENAPI_PATH
/swagger
_ENV.QUARKUS_TRANSACTION-MANAGER_DEFAULT-TRANSACTION-TIMEOUT
pt60m
_ENV.SIBEC_API_KEY
l7b3130779847d474ea81fc1d64ac7e865
_ENV.SIBEC_MICRO
https://sibec-micro-des-esteiras.nprd2.caixa/api
_ENV.filestore.ambiente.relatorio
BECT
_ENV.filestore.ambiente.relatorio.perfil
BEC07
_ENV.filestore.ambiente.relatorioCID
CIDT
_ENV.filestore.path.envio
/upload/envio
_ENV.filestore.path.estruturaPastas
"Judicial,Folha,Relatorio,Qualificacao,Manutencao,Habilitacao,Outros,Diversos,upload,upload/envio,upload/original,upload/retorno,upload/calendario"
_ENV.filestore.path.original
/upload/original
_ENV.filestore.path.retorno
/upload/retorno
_ENV.filestore.path.servidor
/sibec
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIBEC-ARQUIVOS-BT-VAULT-TQS (1)
Scopes: EC TQS
SIBEC-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
SIBEC-ARQUIVOS-HMP (51)
Grupo de variáveis de SIBEC-ARQUIVOS-HMP ( TAS000046751914 ).
Scopes: EC HMP
SIBEC-ARQUIVOS-BT-VAULT-HMP (3)
TAS000046751917
Scopes: EC HMP
SIBEC-BT-VAULT-SECRET-HMP (2)
RTSK00004332
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIBEC-ARQUIVOS-PRD (1)
Grupo de variáveis de SIBEC-ARQUIVOS-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2

Row 2

Row 2

31 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Row 2

Row 2

Showing filters 1 through 2

