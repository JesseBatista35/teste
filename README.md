Estamos usando o NAS DELL que foi criado inicialmente para o ambiente HMP em todos ambientes, precisamos que os arquivos que se encontram na pasta 
ifs/cpwsprd01/nprd/fs_sibec sejam copiados para ifs/cpwsprd01/nprd/fs_sibec_des

E se possivel os arquivos do NFS antigo :
srjtqapllx028:/sistemas/sibec     39G   32G  5.9G  85% /sistemas/sibec

para a pasta nova 
ifs/cpwsprd01/nprd/fs_sibec_des

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
All pipelines

SIBEC

SIBEC-arquivos
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube

Scopes: Release
SONAR_URL
http://sonar.produtos.caixa
Usuario-Azure-DevOps (12)
Scopes: Release
AZPAT
********
AZUSER
s736639
BT_API_URL
https://sicsn.caixa/BeyondTrust/api/public/v3
BT_SECRETS_PATH
********
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_PASS
********
FORTIFY_USER
admin
OKD_KAFKA
api.kafka-nprd.caixa:6443
OKD_TOKEN_KAFKA
********
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
DIR_LOGS
/opt/ads-agent/esteira-logs
GRAYLOG_PASSWORD
********
GRAYLOG_USERNAME
API_CLIENT
REPOSITORY_LOGS
https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
ALOCAIP_AMBIENTE
Aplicacao
ALOCAIP_AMBIENTE_OCP
Aplicacao
ALOCAIP_AMBIENTE_OCP_LOTERIAS_PRD
Cloud
ALOCAIP_AMBIENTE_OCP_PRD
Cloud
ALOCAIP_AMBIENTE_OKD4
Aplicacao
ALOCAIP_AMBIENTE_OKD4_PRD_CTC
Cloud
ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_NPRD
Desenvolvimento
ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_PRD
Cloud
ALOCAIP_AMBIENTE_PRD_CANAIS
Cloud
ALOCAIP_AMBIENTE_PRD_DTC
Cloud
ALOCAIP_CATEGORIA
Linux
ALOCAIP_CATEGORIA_OKD4_PRD_CTC
Linux
ALOCAIP_FIM_RANGE_OCP
10.116.223.250
ALOCAIP_FIM_RANGE_OCP_LOTERIAS_PRD
10.190.64.200
ALOCAIP_FIM_RANGE_OCP_PRD
10.118.121.250
ALOCAIP_FIM_RANGE_OKD4
10.116.215.250
ALOCAIP_FIM_RANGE_OKD4_PRD_CTC
10.121.103.250
ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_NPRD
10.190.160.254
ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_PRD
10.190.255.253
ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC
10.118.97.255
ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC_OB
10.118.97.254
ALOCAIP_FIM_RANGE_PRD_CANAIS_DTC
10.220.225.255
ALOCAIP_FIM_RANGE_PRD_DTC
10.221.101.250
ALOCAIP_ID
"C&t@d02"
ALOCAIP_INICIO_RANGE_OCP
10.116.223.1
ALOCAIP_INICIO_RANGE_OCP_LOTERIAS_PRD
10.190.64.161
ALOCAIP_INICIO_RANGE_OCP_PRD
10.118.121.1
ALOCAIP_INICIO_RANGE_OKD4
10.116.209.0
ALOCAIP_INICIO_RANGE_OKD4_PRD_CTC
10.121.101.1
ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_NPRD
10.190.160.201
ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_PRD
10.190.255.245
ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC
10.118.96.100
ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC_OB
10.118.97.100
ALOCAIP_INICIO_RANGE_PRD_CANAIS_DTC
10.220.224.100
ALOCAIP_INICIO_RANGE_PRD_DTC
10.221.100.100
ALOCAIP_RED_NUM
3022
ALOCAIP_RED_NUM_OCP
4995
ALOCAIP_RED_NUM_OCP_LOTERIAS_PRD
13616
ALOCAIP_RED_NUM_OCP_PRD
6053
ALOCAIP_RED_NUM_OKD4
4995
ALOCAIP_RED_NUM_OKD4_PRD_CTC
4996
ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_NPRD
14583
ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_PRD
14582
ALOCAIP_RED_NUM_PRD
4104
ALOCAIP_RED_NUM_PRD_CANAIS_CTC
6053
ALOCAIP_RED_NUM_PRD_CANAIS_DTC
6055
ALOCAIP_RED_NUM_PRD_DTC
5199
ALOCAIP_SENHA
********
ALOCAIP_SITE
CTC
ALOCAIP_SITE_DTC
DTC
ALOCAIP_SITE_OCP
CTC
ALOCAIP_SITE_OCP_LOTERIAS_PRD
CTC
ALOCAIP_SITE_OCP_PRD
CTC
ALOCAIP_SITE_OKD4
CTC
ALOCAIP_SITE_OKD4_PRD_CTC
CTC
ALOCAIP_SITE_OPENSHIFT_LOTERIAS_NPRD
CTC
ALOCAIP_SITE_OPENSHIFT_LOTERIAS_PRD
CTC
ALOCAIP_UNIDADE
CEPTIBR
ALOCAIP_UNIDADE_OCP
CEPTI
ALOCAIP_UNIDADE_OCP_LOTERIAS_PRD
CETAD
ALOCAIP_UNIDADE_OCP_PRD
CETAD
ALOCAIP_UNIDADE_OKD4
CEPTI
ALOCAIP_UNIDADE_OKD4_PRD_CTC
CETAD
ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_NPRD
CETAD
ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_PRD
CETAD
ALOCAIP_UNIDADE_PRD_CANAIS
CETAD
ALOCAIP_UNIDADE_PRD_DTC
CETAD
ALOCAIP_VERTICAL
Desenvolvimento
ALOCAIP_VERTICAL_OCP
Desenvolvimento
ALOCAIP_VERTICAL_OCP_LOTERIAS_PRD
Cloud
ALOCAIP_VERTICAL_OCP_PRD
IBC
ALOCAIP_VERTICAL_OKD4
Desenvolvimento
ALOCAIP_VERTICAL_OKD4_PRD_CTC
Vertical_Nao_PCN
ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_NPRD
Cloud
ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_PRD
Cloud
ALOCAIP_VERTICAL_PRD_CANAIS
IBC
ALOCAIP_VERTICAL_PRD_DTC
Vertical Nao PCN
APIALOCAIP
https://api.alocaip.telecom.caixa
PASSWORD_CGC
********
PORTALIF
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa
USER_CGC
USR_CETADPOR1
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
KIND_DEPLOY
deploymentconfig
OKD_API_REGISTRY
api.produtos4.caixa:6443
OKD_REGISTRY
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_REGISTRY
********
OKD_USER_SERVICE_REGISTRY
ads-sa
ProjetoBuild
build-images-ads
TIMEOUT_DEPLOY
300
Compartilhamentos (4)
Scopes: Release
ID_ALOCAIP
C&t@d02
PW_ALOCAIP
********
PW_ISILON
********
USR_ISILON
s736651@corp.caixa.gov.br
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SIBEC-ARQUIVOS-DES (51)
Grupo de variáveis de SIBEC-ARQUIVOS-DES
Scopes: EC DES
PATH_DESTINO
/sibec
PATH_NFS
/fs_sibec_nprd
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
/sibec
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
/sibec
PATH_NFS
/fs_sibec_nprd
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
BT_CLIENT_ID
19f53be3-5f81-4d8b-a6c9-c81742e601b6
BT_CLIENT_SECRET
********
SIBEC-ARQUIVOS-HMP (51)
Grupo de variáveis de SIBEC-ARQUIVOS-HMP ( TAS000046751914 ).
Scopes: EC HMP
PATH_DESTINO
/sibec
PATH_NFS
/fs_sibec_nprd
SERVER_NFS
nprdnfs01.ad.caixa
SIZE_VOLUME
50Gi
VAULT_LOCATION
/usr/src/app/secrets_files/SIBEC_HMP/
_ENV.AMBIENTE
hmp
_ENV.API_MP_REST_SCOPE
javax.inject.singleton
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-hmp-sibec_arquivo.jks"
_ENV.QUARKUS_CORS_ORIGINS
"https://sibec-estatico-hmp.apps.nprd.caixa, https://sibec-estatico-internet-hmp.apps.nprd.caixa"
_ENV.QUARKUS_DATASOURCE_DB-KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-SIZE
40
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.112.30:448/RJHDB2DH0A:currentSchema=HMPBEC;"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SBECHR01_DB2}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SBECHR01"
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
https://login.hmp.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_ID
"cli-ser-bec"
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERBEC_SSO_INTRA}'
_ENV.QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
https://login.hmp.corp.caixa.gov.br/auth/realms/internet
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
'${SIBEC_BT_APIKEY}'
_ENV.SIBEC_MICRO
https://sibec-micro-des-esteiras.nprd2.caixa/api
_ENV.filestore.ambiente.relatorio
BECH
_ENV.filestore.ambiente.relatorio.perfil
BEC07
_ENV.filestore.ambiente.relatorioCID
CIDH
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
Finished loading items

Finished loading items

Finished loading items

Showing 2 items.

Showing 6718 items.

Showing 1 items.

Showing filters 1 through 1

5 results found

5 results found

5 results found

Expanded

Expanded

Collapsed

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Showing filters 1 through 2

<connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>, 1 of 36 found for 'CONNECT', at 170:22
