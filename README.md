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
SISOU-sac-okd
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
SISOU

SISOU-sac-okd
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
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,HOTFIX,EC HMP
SISOU-SAC-OKD-DES (60)
Grupo de variáveis de SISOU-SAC-OKD-DES
Scopes: EC DES
DATASOURCE_CONNECTION_URL
jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV
DATASOURCE_JNDI_NAME
java:/jdbc/OracleSisouDS
DATASOURCE_MAX_POOL_SIZE
40
DATASOURCE_MIN_POOL_SIZE
2
DATASOURCE_PASSWORD
********
DATASOURCE_POOL_NAME
OracleSisouDS
DATASOURCE_USER_NAME
SSOUDB03
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
********
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
JVM_TRUSTSTORE
caixa-truststore-acteste-nprd-sisou-20260827.jks
KEYCLOAK_AUTH_SERVER_URL
https://login.des.caixa/auth
KEYCLOAK_BEARER_ONLY
true
KEYCLOAK_CREDENTIAL_SECRET
********
KEYCLOAK_REALM
intranet
KEYCLOAK_RESOURCE
cli-ser-sou
KEYCLOAK_SSL_REQUIRED
EXTERNAL
LEVEL_LOG
DEBUG
SECURE_DEPLOYMENT
sisou-sac-api.war
SISOU-CONSUMIDOR_GOV_CLIENT_ID
20140206000002000
SISOU-CONSUMIDOR_GOV_CLIENT_SECRET
********
SISOU-CONSUMIDOR_GOV_CODE
********
SISOU-CONSUMIDOR_GOV_CPF_AUTORIZADO
********
SISOU-CONSUMIDOR_GOV_GRANT_TYPE
client_credentials
SISOU-CONSUMIDOR_GOV_HOST
api-treinamento.consumidor.gov.br
SISOU-CONSUMIDOR_GOV_URL_API
https://api-treinamento.consumidor.gov.br/api/servico/
SISOU-CONSUMIDOR_GOV_USER_AGENT
api-consumidor
SISOU-CONSUMIDOR_GOV_VERSAO
1.0
SISOU-EMAIL_ENVIO_RECURSO_BACEN
gtrja.deati@bcb.gov.br
SISOU-INDECX_ACTION_ID_TEMPLATE
********
SISOU-INDECX_COMPANY_KEY
********
SISOU-INDECX_URL_API
https://indecx.com
SISOU-INT_API_KEY
l7f5b8a9e462a14e56a0f7feab3992f33a
SISOU-INT_B2B_CORREIOS
ssourd01
SISOU-INT_IP_SERV_GED
${env.HOSTIP:10.116.222.199}
SISOU-INT_SEN_BACEN
Senha123
SISOU-INT_URL_API_MANAGER
https://api.des.caixa:8443/
SISOU-INT_URL_GED
https://siecm.des.caixa/siecm-web/ECM
SISOU-INT_URL_RDR_BACEN
https://www9.bcb.gov.br/hml/rdrws/
SISOU-INT_URL_STA_BACEN
https://sta-h.bcb.gov.br/staws/
SISOU-INT_USU_BACEN
211047910.S-CEF06953
SISOU-RECLAME_AQUI_SECRET
a3cab9ea-a6fc-4ad3-89d0-e17a8b2bf17b
SISOU-RECLAME_AQUI_USER
3080
SISOU-REMETENTE_INT
vivavoz@caixa.gov.br
SISOU-REMETENTE_OUV
ouvidoria@caixa.gov.br
SISOU-REMETENTE_SAC
sac@caixa.gov.br
SISOU-SEC_TEMPO_MAX_IDLE
60
SISOU-SEC_TEMPO_VIDA_TOKEN
5
SISOU-SUFIXO_EMAIL_CAIXA
@corp.caixa.gov.br
SISOU-URL_API_B2B
https://resolve.b2b.des.corerj.caixa/v1/uploadinterno?
SISOU-URL_API_RECLAME_AQUI
https://app.hugme.com.br:443
SISOU-URL_FRONTEND
https://sisou-front-des.apps.nprd.caixa
SISOU-URL_RESPOSTA_IA
https://teams.microsoft.com/l/app/?source=app-header-share-entrypoint&amp;titleId=T_e4cc0d78-e8f8-d7b5-b058-bbb73b7ff73a&amp;message=
SMTP_PORT
25
SMTP_URL
smtptest.correiolivre.caixa
_ENV.KEYCLOAK_AUTH_SERVER_URL
https://login.des.caixa/auth
SISOU-SAC-OKD-TQS (59)
Grupo de variáveis de SISOU-SAC-OKD-TQS

Scopes: EC TQS
DATASOURCE_CONNECTION_URL
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/prim_T01NGSRV
DATASOURCE_JNDI_NAME
java:/jdbc/OracleSisouDS
DATASOURCE_MAX_POOL_SIZE
40
DATASOURCE_MIN_POOL_SIZE
2
DATASOURCE_PASSWORD
********
DATASOURCE_POOL_NAME
OracleSisouDS
DATASOURCE_USER_NAME
SSOUTB03
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
********
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
JVM_TRUSTSTORE
caixa-truststore-acteste-nprd-sisou-20260825.jks
KEYCLOAK_AUTH_SERVER_URL
https://login.des.caixa/auth
KEYCLOAK_BEARER_ONLY
true
KEYCLOAK_CREDENTIAL_SECRET
********
KEYCLOAK_REALM
intranet
KEYCLOAK_RESOURCE
cli-ser-sou
KEYCLOAK_SSL_REQUIRED
EXTERNAL
LEVEL_LOG
DEBUG
SECURE_DEPLOYMENT
sisou-sac-api.war
SISOU-CONSUMIDOR_GOV_CLIENT_ID
20140206000002000
SISOU-CONSUMIDOR_GOV_CLIENT_SECRET
********
SISOU-CONSUMIDOR_GOV_CODE
********
SISOU-CONSUMIDOR_GOV_CPF_AUTORIZADO
********
SISOU-CONSUMIDOR_GOV_GRANT_TYPE
client_credentials
SISOU-CONSUMIDOR_GOV_HOST
api-treinamento.consumidor.gov.br
SISOU-CONSUMIDOR_GOV_URL_API
https://api-treinamento.consumidor.gov.br/api/servico/
SISOU-CONSUMIDOR_GOV_USER_AGENT
api-consumidor
SISOU-CONSUMIDOR_GOV_VERSAO
1.0
SISOU-EMAIL_ENVIO_RECURSO_BACEN
gtrja.deati@bcb.gov.br
SISOU-INDECX_ACTION_ID_TEMPLATE
********
SISOU-INDECX_COMPANY_KEY
********
SISOU-INDECX_URL_API
https://indecx.com
SISOU-INT_API_KEY
********
SISOU-INT_B2B_CORREIOS
ssourd01
SISOU-INT_IP_SERV_GED
${env.HOSTIP:10.116.222.251}
SISOU-INT_SEN_BACEN
Senha123
SISOU-INT_URL_API_MANAGER
https://api.des.caixa:8443/
SISOU-INT_URL_GED
https://siecm.des.caixa/siecm-web/ECM
SISOU-INT_URL_RDR_BACEN
https://www9.bcb.gov.br/hml/rdrws/
SISOU-INT_URL_STA_BACEN
https://sta-h.bcb.gov.br/staws/
SISOU-INT_USU_BACEN
211047910.S-CEF06954
SISOU-RECLAME_AQUI_SECRET
a3cab9ea-a6fc-4ad3-89d0-e17a8b2bf17b
SISOU-RECLAME_AQUI_USER
3080
SISOU-REMETENTE_INT
vivavoz@caixa.gov.br
SISOU-REMETENTE_OUV
ouvidoria@caixa.gov.br
SISOU-REMETENTE_SAC
sac@caixa.gov.br
SISOU-SEC_TEMPO_MAX_IDLE
60
SISOU-SEC_TEMPO_VIDA_TOKEN
5
SISOU-SUFIXO_EMAIL_CAIXA
@corp.caixa.gov.br
SISOU-URL_API_B2B
http://resolve.b2b.tqs.corerj.caixa/v1/uploadinterno?
SISOU-URL_API_RECLAME_AQUI
https://app.hugme.com.br:443
SISOU-URL_FRONTEND
https://sisou-front-tqs.apps.nprd.caixa
SISOU-URL_RESPOSTA_IA
https://teams.microsoft.com/l/app/?source=app-header-share-entrypoint&amp;titleId=T_e4cc0d78-e8f8-d7b5-b058-bbb73b7ff73a&amp;message=
SMTP_PORT
25
SMTP_URL
smtptest.correiolivre.caixa
SISOU-SAC-OKD-HOTFIX (56)
Grupo de variáveis de SISOU-SAC-OKD-HOTFIX
Scopes: HOTFIX
SISOU-SAC-OKD-HMP (1)
Grupo de variáveis de SISOU-SAC-OKD-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SISOU-SAC-OKD-PRD (55)
Grupo de variáveis de SISOU-SAC-OKD-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

Collapsed

3 results found

Expanded

Collapsed

Expanded

Collapsed

152 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Row 7

Showing filters 1 through 2

18 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Showing filters 1 through 2

