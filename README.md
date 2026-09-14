2026-09-14T14:22:17.6636943Z ##[debug]Evaluating condition for step: 'Atualizando Variáveis de Ambiente'
2026-09-14T14:22:17.6637502Z ##[debug]Evaluating: succeeded()
2026-09-14T14:22:17.6637690Z ##[debug]Evaluating succeeded:
2026-09-14T14:22:17.6637990Z ##[debug]=> True
2026-09-14T14:22:17.6638199Z ##[debug]Result: True
2026-09-14T14:22:17.6638414Z ##[section]Starting: Atualizando Variáveis de Ambiente

...
2026-09-14T14:22:18.5420695Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-14T14:22:18.5422804Z ##[debug]loading SECRET_PW_ISILON
2026-09-14T14:22:18.5423857Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-14T14:22:18.5425562Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-14T14:22:18.5426925Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-14T14:22:18.5428375Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-14T14:22:18.5429105Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-14T14:22:18.5429772Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-14T14:22:18.5430321Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-14T14:22:18.5430869Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-14T14:22:18.5431441Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-14T14:22:18.5432677Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-14T14:22:18.5433215Z ##[debug]loading SECRET_AZPAT
2026-09-14T14:22:18.5433777Z ##[debug]loading SECRET_PW_ALOCAIP

...

if [[ -n ' -e AMBIENTE=DES
-e AUDITORIA_EVENTHUB_ENABLED=true
-e AZURE_EVENT_HUB_CONNECTION_STRING=********
-e AZURE_EVENT_HUB_NAME=eh-trilha-auditoria
-e CAIXA_LDAP_SUBJECT_DN=UID:692793df-2c97-4102-9845-0ec180e50d46,...
-e CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER=https://logindes.caixa.gov.br/auth/realms/internet
-e CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY=********
-e CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER=https://login.des.caixa/auth/realms/intranet
-e CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY=********
-e CAIXA_OPEN_FINANCE_CNPJ=00360305000104
-e CAIXA_OPEN_FINANCE_ISPB=00360305
-e CAIXA_OPEN_FINANCE_ORGANISATION_ID=c160a6f5-e5df-5067-9e97-ec6fba62fd87
-e CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID=692793df-2c97-4102-9845-0ec180e50d46
-e CAIXA_PIXAPI_DICT_PATH=/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
-e CAIXA_SIINP_APIM_APIKEY=********
-e CAIXA_SIINP_APIM_URL=https://api.des.caixa:8443
-e CAIXA_SSO_INTRANET_CLIENT_ID=cli-ser-inp
-e CAIXA_SSO_INTRANET_CLIENT_SECRET=********
-e CAIXA_SSO_INTRANET_TOKEN_ENDPOINT=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
-e CAIXA_TRUSTSTORE_PATH=/deployments/caixa-truststore-acteste-nprd.jks
-e DATA_CADASTRO_CLIENTE_INICIADORA=2026-08-17
-e DINAMO_HSM_HOSTNAME=hsmdes.extra.caixa.gov.br
-e DINAMO_HSM_PASSWORD=********
-e DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY=inp_obsandbox_enc_
-e DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY=assinatura_caixa_
-e DINAMO_HSM_USER_ID=SINPSD01
-e DIN_JCA_CONF_FILE=classes\Configuration.ND
-e HISTFILE=/tmp/.bash_history
-e HSM_DISABLE_SESSION_CACHE=0
-e HSM_IP=hsmdes.extra.caixa.gov.br
-e HSM_LOG_DIR=stdout
-e HSM_LOG_LEVEL=0
-e HTTP_PROXY=http://proxydes.caixa:80
-e HTTPS_PROXY=http://proxydes.caixa:80
-e IBC_REDIRECT_URI=https://siinp-nucleo-web-des.apps.nprd.caixa
-e JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m
...
-e OPEN_FINANCE_MTLS_PASSWORD=********
-e OPEN_FINANCE_TOKEN_ID_PEPER=********
...
-e PCM_EVENT_HUB_CONNECTION_STRING=********
...
-e PROXY_USER_PASSWORD=********
...
-e QUARKUS_DATASOURCE_PASSWORD=********
...
-e QUARKUS_REDIS_PASSWORD=********
...
-e SECURITY_CRYPTO_KEY=********
-e THREAD_POOL=20' ]];

...

2026-09-14T14:22:18.5562630Z Nova APP: false

2026-09-14T14:22:19.0800293Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T14:22:19.3701556Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T14:22:19.6500998Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T14:22:19.9206956Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T14:22:20.1909498Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated

(... dezenas de linhas iguais ...)

2026-09-14T14:22:45.6866932Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T14:22:46.2092642Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated

2026-09-14T14:22:46.3128884Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-09-14T14:22:46.3129385Z See 'oc set env -h' for help and examples.
2026-09-14T14:22:46.3157035Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-09-14T14:22:46.3160551Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-14T14:22:46.3167497Z ##[error]Bash exited with code '1'.
2026-09-14T14:22:46.3168299Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-09-14T14:22:46.3168582Z ##[debug]task result: Failed
2026-09-14T14:22:46.3181666Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-14T14:22:46.3195971Z ##[section]Finishing: Atualizando Variáveis de Ambiente




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
SIINP-nucleo-des

Variable group
Properties
Variable group name
SIINP-nucleo-des
Description



Variables
_ENV.AMBIENTE
DES
_ENV.AUDITORIA_EVENTHUB_ENABLED
true
_ENV.AZURE_EVENT_HUB_CONNECTION_STRING
Endpoint=sb://ehnamespace-siinp-des.servicebus.windows.net/;SharedAccessKeyName=siinp_sender;SharedAccessKey=/doz9fctDrHUXxxQH2o3/4jy7RSm+pbIL+AEhKLaU8Q=;EntityPath=eh-trilha-auditoria
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
_ENV.DIN_JCA_CONF_FILE
classes\Configuration.ND
_ENV.DINAMO_HSM_HOSTNAME
hsmdes.extra.caixa.gov.br
_ENV.DINAMO_HSM_PASSWORD
'${sinpsd01_hsm}'
_ENV.DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY
inp_obsandbox_enc_
_ENV.DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY
assinatura_caixa_
_ENV.DINAMO_HSM_USER_ID
SINPSD01
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
_ENV.HTTP_PROXY
http://proxydes.caixa:80
_ENV.HTTPS_PROXY
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
221601a9-6e70-4698-9ea3-1bb28ceb4269,439a9b5c-2cfb-4e57-b60b-20eea83899ca,9326f9b2-ae57-42c4-a0d9-acc4ba434696,06c19499-3412-4125-84b7-d0fbc98b5019,756b9782-d9d4-4f9b-9756-997eba0e2cbd,6a0ec228-70b7-4292-9e64-8fa731b2a730,d7e27a98-ef6c-4b79-b2d8-c2527eba8d84,68308291-ec0d-4398-83ce-68b6b1087e49,aaacb9cf-e8c3-402b-93b8-cf4d3e2ec497,8dd11bd5-165e-4662-9eaa-112ef0d499c0
_ENV.LISTA_SERVIDORES_PRIORITARIOS_PJ
c6b15844-e748-4408-abb6-e71fd59d71c5,75db457a-612d-4d62-b557-ba9d32b05216,7c6748a1-2be0-4593-a769-77feb406b3a0,770f6211-dbd4-4c84-b6b1-9104b4a99359,c2d48e71-07af-4442-8c7d-c82d0eb45e5f,6c8b9aed-8e24-4ad6-985f-213623a23be3,2d641a88-4441-44d9-b39a-a864d1ce8890,fde63db6-f775-44d3-ad88-406a1fb0a48d,edb215da-d1f1-47f0-b794-62a7d798ba6a,649ffe9a-503d-4635-a0fd-41f4b5135b6c
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
'${siinp_keystore_sandbox}'
_ENV.OPEN_FINANCE_TOKEN_ID_PEPER
Qk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJpQk1wQkJp
_ENV.PCM_BASEPATH_REQUEST
/siinp/request
_ENV.PCM_BASEPATH_RESPONSE
/siinp/response
_ENV.PCM_EVENT_HUB_CONNECTION_STRING
Endpoint=sb://ehnamespace-siinp-des.servicebus.windows.net/;SharedAccessKeyName=siinp_sender;SharedAccessKey=+4=;EntityPath=eh-audit-pcm
_ENV.PCM_EVENT_HUB_NAME
eh-audit-pcm
_ENV.PCM_EVENTHUB_ENABLED
true
_ENV.PCM_JOURNEY_CONTEXT_TTL
1800
_ENV.POOLING_PAGAMENTO_DELAY
0
_ENV.PROXY_USER
SINPBD01
_ENV.PROXY_USER_PASSWORD
'${sinpbd01_proxy}'
_ENV.QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE
60S
_ENV.QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE
60S

