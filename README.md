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
SIINP-nucleo
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
SIINP

SIINP-nucleo
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
Scopes: EC DES,EC DES2,EC TQS,EC TQS2
SIINP-nucleo-des (109)
Scopes: EC DES
PATH_DESTINO
/siinp
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CETAD/SIINP
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
20Gi
VAULT_LOCATION
/usr/src/app/secrets_files/SIINP_DES/
_ENV.AMBIENTE
DES
_ENV.AUDITORIA_EVENTHUB_ENABLED
true
_ENV.AZURE_EVENT_HUB_NAME
eh-trilha-auditoria
_ENV.CAIXA_LDAP_SUBJECT_DN
UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER
https://login.des.caixa/auth/realms/intranet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.CAIXA_OPEN_FINANCE_CNPJ
00360305000104
_ENV.CAIXA_OPEN_FINANCE_ISPB
00360305
_ENV.CAIXA_OPEN_FINANCE_ORGANISATION_ID
c160a6f5-e5df-5067-9e97-ec6fba62fd87
_ENV.CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID
692793df-2c97-4102-9845-0ec180e50d46
_ENV.CAIXA_PIXAPI_DICT_PATH
/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
_ENV.CAIXA_SIINP_APIM_APIKEY
l7d1b52b1a66d6451db7a9a2a1784fe5a9
_ENV.CAIXA_SIINP_APIM_URL
https://api.des.caixa:8443
_ENV.CAIXA_SSO_INTRANET_CLIENT_ID
cli-ser-inp
_ENV.CAIXA_SSO_INTRANET_CLIENT_SECRET
4b746850-e224-4db3-b656-4acc71d6d74f
_ENV.CAIXA_SSO_INTRANET_TOKEN_ENDPOINT
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.CAIXA_TRUSTSTORE_PATH
/deployments/caixa-truststore-acteste-nprd.jks
_ENV.DATA_CADASTRO_CLIENTE_INICIADORA
2026-08-17
_ENV.DINAMO_HSM_HOSTNAME
hsmdes.extra.caixa.gov.br
_ENV.DINAMO_HSM_PASSWORD
'${SINPSD01_HSM}'
_ENV.DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY
inp_obsandbox_enc_
_ENV.DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY
assinatura_caixa_
_ENV.DINAMO_HSM_USER_ID
SINPSD01
_ENV.DIN_JCA_CONF_FILE
classes\Configuration.ND
_ENV.HISTFILE
/tmp/.bash_history
_ENV.HSM_DISABLE_SESSION_CACHE
0
_ENV.HSM_IP
hsmdes.extra.caixa.gov.br
_ENV.HSM_LOG_DIR
stdout
_ENV.HSM_LOG_LEVEL
0
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.HTTP_PROXY
http://proxydes.caixa:80
_ENV.IBC_REDIRECT_URI
https://siinp-nucleo-web-des.apps.nprd.caixa
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m"
_ENV.JORNADA_CACHE_TTL_SECONDS
3600
_ENV.JORNADA_URI_REDIRECT
https://siinp-nucleo-web-des.apps.nprd.caixa/authorize
_ENV.LISTA_LOGO_SERVIDORES_BLOQUEADO
ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974
_ENV.LISTA_SERVIDORES_BLOQUEADO
teste
_ENV.LISTA_SERVIDORES_PRIORITARIOS
439a9b5c-2cfb-4e57-b60b-20eea83899ca,75db457a-612d-4d62-b557-ba9d32b05216,9326f9b2-ae57-42c4-a0d9-acc4ba434696,06c19499-3412-4125-84b7-d0fbc98b5019,756b9782-d9d4-4f9b-9756-997eba0e2cbd,6a0ec228-70b7-4292-9e64-8fa731b2a730,fcef8e3a-1a48-4a43-9946-0737b029c0c5,68308291-ec0d-4398-83ce-68b6b1087e49,aaacb9cf-e8c3-402b-93b8-cf4d3e2ec497,8dd11bd5-165e-4662-9eaa-112ef0d499c0
_ENV.LISTA_SERVIDORES_PRIORITARIOS_PJ
c6b15844-e748-4408-abb6-e71fd59d71c5,75db457a-612d-4d62-b557-ba9d32b05216,7c6748a1-2be0-4593-a769-77feb406b3a0,770f6211-dbd4-4c84-b6b1-9104b4a99359,c2d48e71-07af-4442-8c7d-c82d0eb45e5f,6c8b9aed-8e24-4ad6-985f-213623a23be3,2d641a88-4441-44d9-b39a-a864d1ce8890,fde63db6-f775-44d3-ad88-406a1fb0a48d,efcd384a-81ed-4ac4-baab-e2236132ed59,649ffe9a-503d-4635-a0fd-41f4b5135b6c
_ENV.MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER
false
_ENV.MINIAPP_CONVENIO_ID
10
_ENV.MINIAPP_REDIRECT_URI
https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar
_ENV.NO_PROXY
https://data.sandbox.directory.openbankingbrasil.org.br/participants
_ENV.OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE
urn:ietf:params:oauth:client-assertion-type:jwt-bearer
_ENV.OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN
client_credentials
_ENV.OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE
ParentOrganisationReference
_ENV.OPEN_BANKING_BRASIL_SCOPE_TOKEN
directory:software
_ENV.OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE
https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks
_ENV.OPEN_BANKING_BRASIL_URI_PARTICIPANTS
https://data.sandbox.directory.openbankingbrasil.org.br/participants
_ENV.OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION
https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion
_ENV.OPEN_BANKING_BRASIL_URI_TOKEN
https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token
_ENV.OPEN_FINANCE_MTLS_CERT
/deployments/siinp_mtls_enrollment_092026.p12
_ENV.OPEN_FINANCE_MTLS_PASSWORD
'${SIINP_KEYSTORE_SANDBOX}'
_ENV.OPEN_FINANCE_TOKEN_ID_PEPER
Qk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJp
_ENV.PCM_BASEPATH_REQUEST
/siinp/request
_ENV.PCM_BASEPATH_RESPONSE
/siinp/response
_ENV.PCM_EVENTHUB_ENABLED
true
_ENV.PCM_EVENT_HUB_NAME
eh-audit-pcm
_ENV.PCM_JOURNEY_CONTEXT_TTL
1800
_ENV.POOLING_PAGAMENTO_DELAY
0
_ENV.PROXY_USER
SINPBD01
_ENV.PROXY_USER_PASSWORD
'${SINPBD01_PROXY}'
_ENV.QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS
true
_ENV.QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
50
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/PDBD001NG
_ENV.QUARKUS_DATASOURCE_METRICS_ENABLED
true
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SINPBD01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SINPBD01
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
false
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS
true
_ENV.QUARKUS_HTTP_CORS_METHODS
GET,PUT,POST,DELETE,PATCH
_ENV.QUARKUS_HTTP_CORS_ORIGINS
https://siinp-nucleo-web-des.apps.nprd.caixa,https://siinp-gestao-web-des.apps.nprd.caixa,http://localhost:4200
_ENV.QUARKUS_HTTP_TEST_PORT
8888
_ENV.QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL
DEBUG
_ENV.QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL
INFO
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_REDIS_HOSTS
redis://redis-master.redis-siinp-des.svc.cluster.local:6379
_ENV.QUARKUS_REDIS_MAX_POOL_SIZE
32
_ENV.QUARKUS_REDIS_MAX_WAITING_HANDLERS
256
_ENV.QUARKUS_REDIS_PASSWORD
'${REDIS_PASSWORD}'
_ENV.QUARKUS_REDIS_TIMEOUT
20S
_ENV.SANDBOX_URI_REDIRECT
siinp-nucleo-web-des.apps.nprd.caixa
_ENV.SCOPES_DCR
openid_payments
_ENV.THREAD_POOL
20
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIINP-BT-VAULT-DES (3)
Scopes: EC DES
SIINP-BT-VAULT-SECRET-DES (2)
Scopes: EC DES,EC DES2
SIINP-nucleo-des2 (120)

Scopes: EC DES2
SIINP-BT-VAULT-DES2 (3)
Scopes: EC DES2
SIINP-BT-VAULT-TQS (1)
Scopes: EC TQS,EC TQS2
SIINP-nucleo-tqs (111)

Scopes: EC TQS
PATH_DESTINO
/siinp
PATH_NFS
/ifs/CADSVISISD4/SERVIDORES/CETAD/SIINP
SERVER_NFS
nfsctcnprd.ctc.caixa
SIZE_VOLUME
20Gi
VAULT_LOCATION
/usr/src/app/secrets_files/siinp_tqs/
_ENV.AMBIENTE
TQS
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=589c8f57-f18b-412c-ba31-79db9a5182d2;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=e49df5bc-89ba-414d-b99f-fdae3487af63"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIINP-NUCLEO-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_LDAP_SUBJECT_DN
UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER
https://login2des.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER
https://login.des.caixa/auth/realms/intranet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.CAIXA_OPEN_FINANCE_CNPJ
00360305000104
_ENV.CAIXA_OPEN_FINANCE_ISPB
00360305
_ENV.CAIXA_OPEN_FINANCE_ORGANISATION_ID
c160a6f5-e5df-5067-9e97-ec6fba62fd87
_ENV.CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID
692793df-2c97-4102-9845-0ec180e50d46
_ENV.CAIXA_PIXAPI_DICT_PATH
/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
_ENV.CAIXA_SIINP_APIM_APIKEY
l7d1b52b1a66d6451db7a9a2a1784fe5a9
_ENV.CAIXA_SIINP_APIM_URL
https://api.des.caixa:8443
_ENV.CAIXA_SSO_INTRANET_CLIENT_ID
cli-ser-inp
_ENV.CAIXA_SSO_INTRANET_CLIENT_SECRET
4b746850-e224-4db3-b656-4acc71d6d74f
_ENV.CAIXA_SSO_INTRANET_TOKEN_ENDPOINT
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.CAIXA_TRUSTSTORE_PATH
/deployments/caixa-truststore-acteste-nprd.jks
_ENV.DATA_CADASTRO_CLIENTE_INICIADORA
2026-08-25
_ENV.DINAMO_HSM_HOSTNAME
hsmdes.extra.caixa.gov.br
_ENV.DINAMO_HSM_PASSWORD
'${SINPSD01_HSM}'
_ENV.DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY
inp_obsandbox_enc_
_ENV.DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY
assinatura_caixa_
_ENV.DINAMO_HSM_USER_ID
SINPSD01
_ENV.DIN_JCA_CONF_FILE
classes\Configuration.ND
_ENV.HISTFILE
/tmp/.bash_history
_ENV.HSM_DISABLE_SESSION_CACHE
1
_ENV.HSM_IP
hsmdes.extra.caixa.gov.br
_ENV.HSM_LOG_DIR
stdout
_ENV.HSM_LOG_LEVEL
0
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.HTTP_PROXY
http://proxydes.caixa:80
_ENV.IBC_REDIRECT_URI
https://siinp-nucleo-web-tqs.apps.nprd.caixa
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks"
_ENV.JORNADA_CACHE_TTL_SECONDS
3600
_ENV.JORNADA_URI_REDIRECT
https://siinp-nucleo-web-tqs.apps.nprd.caixa/authorize
_ENV.LISTA_CONVENIOS_SKIP_SWEEPING
10
_ENV.LISTA_LOGO_SERVIDORES_BLOQUEADO
ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974
_ENV.LISTA_SERVIDORES_BLOQUEADO
e7d013d6-c15f-49ba-acc9-aa8935abcaef
_ENV.LISTA_SERVIDORES_PRIORITARIOS
439a9b5c-2cfb-4e57-b60b-20eea83899ca,75db457a-612d-4d62-b557-ba9d32b05216,9326f9b2-ae57-42c4-a0d9-acc4ba434696,06c19499-3412-4125-84b7-d0fbc98b5019,756b9782-d9d4-4f9b-9756-997eba0e2cbd,6a0ec228-70b7-4292-9e64-8fa731b2a730,fcef8e3a-1a48-4a43-9946-0737b029c0c5,68308291-ec0d-4398-83ce-68b6b1087e49,aaacb9cf-e8c3-402b-93b8-cf4d3e2ec497,8dd11bd5-165e-4662-9eaa-112ef0d499c0
_ENV.LISTA_SERVIDORES_PRIORITARIOS_PJ
c6b15844-e748-4408-abb6-e71fd59d71c5,75db457a-612d-4d62-b557-ba9d32b05216,7c6748a1-2be0-4593-a769-77feb406b3a0,770f6211-dbd4-4c84-b6b1-9104b4a99359,c2d48e71-07af-4442-8c7d-c82d0eb45e5f,6c8b9aed-8e24-4ad6-985f-213623a23be3,2d641a88-4441-44d9-b39a-a864d1ce8890,fde63db6-f775-44d3-ad88-406a1fb0a48d,efcd384a-81ed-4ac4-baab-e2236132ed59,649ffe9a-503d-4635-a0fd-41f4b5135b6c
_ENV.MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER
false
_ENV.MINIAPP_CONVENIO_ID
10
_ENV.MINIAPP_REDIRECT_URI
https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar
_ENV.NO_PROXY
https://data.sandbox.directory.openbankingbrasil.org.br/participants
_ENV.OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE
urn:ietf:params:oauth:client-assertion-type:jwt-bearer
_ENV.OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN
client_credentials
_ENV.OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE
ParentOrganisationReference
_ENV.OPEN_BANKING_BRASIL_SCOPE_TOKEN
directory:software
_ENV.OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE
https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks
_ENV.OPEN_BANKING_BRASIL_URI_PARTICIPANTS
https://data.sandbox.directory.openbankingbrasil.org.br/participants
_ENV.OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION
https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion
_ENV.OPEN_BANKING_BRASIL_URI_TOKEN
https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token
_ENV.OPEN_FINANCE_MTLS_CERT
/deployments/siinp_mtls_sandbox_of_072026.p12
_ENV.OPEN_FINANCE_MTLS_PASSWORD
'${SIINP_KEYSTORE_SANDBOX}'
_ENV.PCM_BASEPATH_REQUEST
/siinp/request
_ENV.PCM_BASEPATH_RESPONSE
/siinp/response
_ENV.POOLING_PAGAMENTO_DELAY
0
_ENV.PROXY_USER
SINPBD01
_ENV.PROXY_USER_PASSWORD
'${SINPBD01_PROXY}'
_ENV.QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE
300S
_ENV.QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE
10S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE
10S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE
10S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE
10S
_ENV.QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS
true
_ENV.QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
50
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/CDBT08NGPDB002
_ENV.QUARKUS_DATASOURCE_METRICS_ENABLED
true
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SINPBT01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SINPBT01
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
false
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS
true
_ENV.QUARKUS_HTTP_CORS_METHODS
GET,PUT,POST,DELETE,PATCH
_ENV.QUARKUS_HTTP_CORS_ORIGINS
https://siinp-nucleo-web-tqs.apps.nprd.caixa,https://siinp-gestao-web-tqs.apps.nprd.caixa,https://integra.iniciadora.caixa.gov.br
_ENV.QUARKUS_HTTP_TEST_PORT
8888
_ENV.QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL
DEBUG
_ENV.QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL
INFO
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_REDIS_HOSTS
redis://redis-master.redis-siinp-tqs.svc.cluster.local:6379
_ENV.QUARKUS_REDIS_MAX_POOL_SIZE
32
_ENV.QUARKUS_REDIS_MAX_WAITING_HANDLERS
256
_ENV.QUARKUS_REDIS_PASSWORD
'${REDIS_PASSWORD}'
_ENV.QUARKUS_REDIS_TIMEOUT
20S
_ENV.SANDBOX_URI_REDIRECT
siinp-nucleo-web-tqs.apps.nprd.caixa
_ENV.SCOPES_DCR
openid_payments
_ENV.THREAD_POOL
20
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIINP-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS,EC TQS2
NEXUS_VARIABLES (19)
Variáveis disponíveis para todas as builds.
Scopes: QA-APITEST
SIINP-nucleo-QA-AUTOAPI (7)
Variaveis para execução da automação de testes de API nas releases da Aplicação
Scopes: QA-APITEST
SIINP-nucleo-tqs2 (104)
Scopes: EC TQS2
OKD-4-APL (12)
Scopes: EC PRD
SIINP-nucleo-prd (108)
CRQ000001005264 - Atualização variável: _ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY
Scopes: EC PRD
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC PRD
SIINP-BT-VAULT-PRD (3)
Scopes: EC PRD
|Manage variable groups
Expanded

Row 3

Collapsed

Row 2

Row 2

Select a release pipeline to view its releases

79 pipelines found

Select a release pipeline to view its releases

14 pipelines found

Select a release pipeline to view its releases

14 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

2 pipelines found

Row 2

Row 3

Row 2

Showing filters 1 through 2

2026-11-11T22:45:47.1784500Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-11-11T22:45:47.1785127Z ##[debug]Evaluating: always()
2026-11-11T22:45:47.1785341Z ##[debug]Evaluating always:
2026-11-11T22:45:47.1786129Z ##[debug]=> True
2026-11-11T22:45:47.1786375Z ##[debug]Result: True
2026-11-11T22:45:47.1786581Z ##[section]Starting: Logs da Aplicação
2026-11-11T22:45:47.1790105Z ==============================================================================
2026-11-11T22:45:47.1790182Z Task         : Bash
2026-11-11T22:45:47.1790233Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T22:45:47.1790304Z Version      : 3.227.0
2026-11-11T22:45:47.1790346Z Author       : Microsoft Corporation
2026-11-11T22:45:47.1790401Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T22:45:47.1790542Z ==============================================================================
2026-11-11T22:45:47.2283320Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-11-11T22:45:47.2991688Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T22:45:47.2999543Z ##[debug]loading inputs and endpoints
2026-11-11T22:45:47.3004605Z ##[debug]loading INPUT_TARGETTYPE
2026-11-11T22:45:47.3012586Z ##[debug]loading INPUT_FILEPATH
2026-11-11T22:45:47.3013569Z ##[debug]loading INPUT_SCRIPT
2026-11-11T22:45:47.3014333Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-11-11T22:45:47.3014916Z ##[debug]loading INPUT_FAILONSTDERR
2026-11-11T22:45:47.3017317Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-11-11T22:45:47.3018158Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-11-11T22:45:47.3018669Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-11-11T22:45:47.3025258Z ##[debug]loading SECRET_AZPAT
2026-11-11T22:45:47.3026962Z ##[debug]loading SECRET_PASSWORD_CGC
2026-11-11T22:45:47.3028572Z ##[debug]loading SECRET_TOKEN_CRQ
2026-11-11T22:45:47.3030166Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-11-11T22:45:47.3031640Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-11-11T22:45:47.3033175Z ##[debug]loading SECRET_PW_ALOCAIP
2026-11-11T22:45:47.3033787Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-11-11T22:45:47.3034523Z ##[debug]loading SECRET_PW_ISILON
2026-11-11T22:45:47.3035020Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-11-11T22:45:47.3035571Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-11-11T22:45:47.3036137Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-11-11T22:45:47.3037305Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-11-11T22:45:47.3037840Z ##[debug]loading SECRET_FORTIFY_PASS
2026-11-11T22:45:47.3038431Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-11-11T22:45:47.3039715Z ##[debug]loaded 22
2026-11-11T22:45:47.3045808Z ##[debug]Agent.ProxyUrl=undefined
2026-11-11T22:45:47.3046521Z ##[debug]Agent.CAInfo=undefined
2026-11-11T22:45:47.3046903Z ##[debug]Agent.ClientCert=undefined
2026-11-11T22:45:47.3047142Z ##[debug]Agent.SkipCertValidation=True
2026-11-11T22:45:47.3061589Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T22:45:47.3063259Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T22:45:47.3063897Z ##[debug]system.culture=en-US
2026-11-11T22:45:47.3072698Z ##[debug]failOnStderr=false
2026-11-11T22:45:47.3073506Z ##[debug]workingDirectory=/opt/ads-agent/_work/r19491/a
2026-11-11T22:45:47.3074140Z ##[debug]check path : /opt/ads-agent/_work/r19491/a
2026-11-11T22:45:47.3074386Z ##[debug]targetType=inline
2026-11-11T22:45:47.3076328Z ##[debug]bashEnvValue=undefined
2026-11-11T22:45:47.3076879Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="siinp-nucleo-tqs"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="siinp-nucleo-tqs"
else
  app="siinp-nucleo-tqs-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n siinp-tqs -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n siinp-tqs
2026-11-11T22:45:47.3085040Z Generating script.
2026-11-11T22:45:47.3086874Z ##[debug]which 'bash'
2026-11-11T22:45:47.3091914Z ##[debug]found: '/bin/bash'
2026-11-11T22:45:47.3092270Z ##[debug]Agent.Version=3.225.2
2026-11-11T22:45:47.3092660Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T22:45:47.3092913Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-11-11T22:45:47.3095097Z ========================== Starting Command Output ===========================
2026-11-11T22:45:47.3095971Z ##[debug]which '/bin/bash'
2026-11-11T22:45:47.3096702Z ##[debug]found: '/bin/bash'
2026-11-11T22:45:47.3106416Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/609e9935-7bf6-4575-a14d-8a834bf2784f.sh
2026-11-11T22:45:47.3106972Z ##[debug]exec tool: /bin/bash
2026-11-11T22:45:47.3107238Z ##[debug]arguments:
2026-11-11T22:45:47.3107490Z ##[debug]   /opt/ads-agent/_work/_temp/609e9935-7bf6-4575-a14d-8a834bf2784f.sh
2026-11-11T22:45:47.3108036Z [command]/bin/bash /opt/ads-agent/_work/_temp/609e9935-7bf6-4575-a14d-8a834bf2784f.sh
2026-11-11T22:45:47.3169801Z + shopt -s expand_aliases
2026-11-11T22:45:47.3170382Z + [[ -n okd4_nprd ]]
2026-11-11T22:45:47.3170541Z + [[ okd4_nprd =~ ocp ]]
2026-11-11T22:45:47.3170683Z + [[ -n okd4_nprd ]]
2026-11-11T22:45:47.3170807Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-11-11T22:45:47.3170956Z + app=siinp-nucleo-tqs
2026-11-11T22:45:47.3171066Z + oc version
2026-11-11T22:45:47.4823264Z oc v3.11.0+0cbc58b
2026-11-11T22:45:47.4823499Z kubernetes v1.11.0+d4cacc0
2026-11-11T22:45:47.4823807Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-11-11T22:45:47.4949810Z 
2026-11-11T22:45:47.4950256Z Server https://api.nprd.caixa:6443
2026-11-11T22:45:47.4950649Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-11-11T22:45:47.4996016Z ++ oc get pod -l name=siinp-nucleo-tqs -n siinp-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-11T22:45:47.4996547Z ++ tac
2026-11-11T22:45:47.4997177Z ++ grep -v '^$'
2026-11-11T22:45:47.4997320Z ++ head -n1
2026-11-11T22:45:47.8486983Z + last_pod=siinp-nucleo-tqs-651-w6hhb
2026-11-11T22:45:47.8487811Z + echo 'Logs do POD: siinp-nucleo-tqs-651-w6hhb'
2026-11-11T22:45:47.8488067Z + oc logs siinp-nucleo-tqs-651-w6hhb -c siinp-nucleo-tqs -n siinp-tqs
2026-11-11T22:45:47.8488354Z Logs do POD: siinp-nucleo-tqs-651-w6hhb
2026-11-11T22:45:48.2367657Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=https://data.sandbox.directory.openbankingbrasil.org.br/participants -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-11-11T22:45:48.2368092Z __  ____  __  _____   ___  __ ____  ______ 
2026-11-11T22:45:48.2368265Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-11-11T22:45:48.2368437Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-11-11T22:45:48.2368595Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-11-11T22:45:48.2368958Z 2026-11-11 19:43:10,754 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.charset" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-11T22:45:48.2369751Z 2026-11-11 19:43:10,756 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.index-page.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-11T22:45:48.2370220Z 2026-11-11 19:43:10,756 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-11T22:45:48.2370785Z 2026-11-11 19:43:10,757 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.force" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-11-11T22:45:48.2371210Z 2026-11-11 19:43:12,799 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: oracle
2026-11-11T22:45:48.2371556Z 2026-11-11 19:43:12,988 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: Socket read interrupted, Authentication lapse 0 ms.
2026-11-11T22:45:48.2372088Z Failed to load config value of type class java.lang.String for: dinamo.hsm.passwordFailed to load config value of type class java.lang.String for: SECURITY_CRYPTO_KEYFailed to load config value of type class java.lang.String for: PROXY_USER_PASSWORDFailed to load config value of type class java.lang.String for: open-finance.mtls.password
2026-11-11T22:45:48.2414289Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-11-11T22:45:48.2420762Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-11-11T22:45:48.2426344Z ##[debug]task result: Succeeded
2026-11-11T22:45:48.2427677Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-11-11T22:45:48.2460107Z ##[section]Finishing: Logs da Aplicação
