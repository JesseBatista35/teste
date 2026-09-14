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
SIINP-nucleo-des2

Variable group
Properties
Variable group name
SIINP-nucleo-des2
Description



Variables
_ENV.AMBIENTE
DES2
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
_ENV.CAIXA_PIXAPI_DICT_APIKEY
l76138e827bd9d4f87aea4ff7f54a5607c
_ENV.CAIXA_PIXAPI_DICT_CLIENT_ID
cli-ser-spi
_ENV.CAIXA_PIXAPI_DICT_CLIENT_SECRET
1938b188-42c7-4889-bf3a-7d95e4432fe9
_ENV.CAIXA_PIXAPI_DICT_PATH
/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
_ENV.CAIXA_PIXAPI_DICT_URL
https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/
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
"-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks"
_ENV.JORNADA_CACHE_TTL_SECONDS
3600
_ENV.JORNADA_URI_REDIRECT
https://siinp-nucleo-web-des2-des.apps.nprd.caixa/authorize
_ENV.LISTA_CONVENIOS_SKIP_SWEEPING
3752,10
_ENV.LISTA_LOGO_SERVIDORES_BLOQUEADO
ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974
_ENV.LISTA_SERVIDORES_BLOQUEADO
e7d013d6-c15f-49ba-acc9-aa8935abcaef
_ENV.LISTA_SERVIDORES_PRIORITARIOS
c8f0bf49-4744-4933-8960-7add6e590841,54593889-eaad-4dee-9402-fc7dc8c68783,97592125-061f-4acc-88c8-89c8fff82da2,e967d551-6fc8-4830-84a1-e9c880a54433,44b193ac-a348-4b6e-acd9-9a3a57bb4ca4,f81fc570-05bf-40dd-a424-bede4862fc16,fcaea5b5-efb6-492c-aca2-7e8b5ecc1641,b2aaf82f-f4e2-4f62-8d77-91f510a682e1,07b7bd3a-fb8d-43a9-b17f-712356007bde,a9ba8dad-d695-4acc-b8e0-69caefaf2e17,ee5afa7b-e384-433c-94b6-565b54063c24
_ENV.LISTA_SERVIDORES_PRIORITARIOS_PJ
c8f0bf49-4744-4933-8960-7add6e590841,0b94e4d7-84e6-4e10-af75-ac9d771f83f6,8f36b58a-9d2f-4abc-b36e-b48911386533,14df0edf-4534-46ce-a6d6-13da150a2fd6,554cec86-497c-4743-9bf5-f904b757d552,a3707304-97e7-4f02-a05c-c25d7059a147,414d34f0-9269-401f-a160-abf51141da3d,dfc5669d-d089-4bf9-8b70-9e053e763dbe,eacc5ebb-6afe-4492-ab8c-eaee19c9b1ff
_ENV.MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER
false
_ENV.MINIAPP_CONVENIO_ID
10
_ENV.MINIAPP_REDIRECT_URI
https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar
_ENV.NO_PROXY
*.caixa
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
'${siinp_keystore_sandbox}'
_ENV.PCM_BASEPATH_REQUEST
/siinp/request
_ENV.PCM_BASEPATH_RESPONSE
/siinp/response
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
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE
86400S
_ENV.QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE
43200S
_ENV.QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE
43200S


em  des2 passa tudo

2026-09-10T20:56:50.1293485Z ##[debug]Evaluating condition for step: 'Atualizando Variáveis de Ambiente'
2026-09-10T20:56:50.1294151Z ##[debug]Evaluating: succeeded()
2026-09-10T20:56:50.1294427Z ##[debug]Evaluating succeeded:
2026-09-10T20:56:50.1294841Z ##[debug]=> True
2026-09-10T20:56:50.1295173Z ##[debug]Result: True
2026-09-10T20:56:50.1295423Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-10T20:56:50.1299224Z ==============================================================================
2026-09-10T20:56:50.1299339Z Task         : Bash
2026-09-10T20:56:50.1299400Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T20:56:50.1299510Z Version      : 3.227.0
2026-09-10T20:56:50.1299573Z Author       : Microsoft Corporation
2026-09-10T20:56:50.1299658Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T20:56:50.1299775Z ==============================================================================
2026-09-10T20:56:50.9523824Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T20:56:51.0182517Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T20:56:51.0189760Z ##[debug]loading inputs and endpoints
2026-09-10T20:56:51.0194165Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T20:56:51.0202115Z ##[debug]loading INPUT_FILEPATH
2026-09-10T20:56:51.0203873Z ##[debug]loading INPUT_SCRIPT
2026-09-10T20:56:51.0205184Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T20:56:51.0206112Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T20:56:51.0208038Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T20:56:51.0208398Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T20:56:51.0209870Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T20:56:51.0216469Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T20:56:51.0218548Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T20:56:51.0220085Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T20:56:51.0221754Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T20:56:51.0223294Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T20:56:51.0225506Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T20:56:51.0225742Z ##[debug]loading SECRET_AZPAT
2026-09-10T20:56:51.0226024Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T20:56:51.0227500Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-10T20:56:51.0227997Z ##[debug]loading SECRET_PW_ISILON
2026-09-10T20:56:51.0228419Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T20:56:51.0229004Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T20:56:51.0229655Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T20:56:51.0230232Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-10T20:56:51.0231466Z ##[debug]loaded 22
2026-09-10T20:56:51.0237614Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T20:56:51.0238027Z ##[debug]Agent.CAInfo=undefined
2026-09-10T20:56:51.0238428Z ##[debug]Agent.ClientCert=undefined
2026-09-10T20:56:51.0238813Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T20:56:51.0254408Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T20:56:51.0256310Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T20:56:51.0256775Z ##[debug]system.culture=en-US
2026-09-10T20:56:51.0266501Z ##[debug]failOnStderr=false
2026-09-10T20:56:51.0267227Z ##[debug]workingDirectory=/opt/ads-agent/_work/r17246/a
2026-09-10T20:56:51.0267682Z ##[debug]check path : /opt/ads-agent/_work/r17246/a
2026-09-10T20:56:51.0268215Z ##[debug]targetType=inline
2026-09-10T20:56:51.0268811Z ##[debug]bashEnvValue=undefined
2026-09-10T20:56:51.0287395Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail

shopt -s extglob
echo "Nova APP: false"

CONTAINER_PRINCIPAL=siinp-nucleo-des2-des  # nome do container principal da aplicação

for UNSET_VAR in $(oc set env deploymentconfig "siinp-nucleo-des2-des" -n siinp-des --list -c "$CONTAINER_PRINCIPAL" | egrep -wv '^#|TZ|INSTANCE_IP' | cut -f1 -d"=")
do 
oc set env deploymentconfig "siinp-nucleo-des2-des" -n siinp-des -c "$CONTAINER_PRINCIPAL" $UNSET_VAR- 
done

for UNSET_SECRET in $(oc set env deploymentconfig "siinp-nucleo-des2-des" -n siinp-des --list -c "$CONTAINER_PRINCIPAL" | grep 'from secret' | awk '{print $2}')
do
  if [ -n $UNSET_SECRET ]
  then
    oc set env deploymentconfig "siinp-nucleo-des2-des" -n siinp-des -c "$CONTAINER_PRINCIPAL" $UNSET_SECRET- 
  fi
done

if [[ -n ' -e AMBIENTE=DES2 -e CAIXA_LDAP_SUBJECT_DN=UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR -e CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER=https://logindes.caixa.gov.br/auth/realms/internet -e CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB -e CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER=https://login.des.caixa/auth/realms/intranet -e CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB -e CAIXA_OPEN_FINANCE_CNPJ=00360305000104 -e CAIXA_OPEN_FINANCE_ISPB=00360305 -e CAIXA_OPEN_FINANCE_ORGANISATION_ID=c160a6f5-e5df-5067-9e97-ec6fba62fd87 -e CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID=692793df-2c97-4102-9845-0ec180e50d46 -e CAIXA_PIXAPI_DICT_APIKEY=l76138e827bd9d4f87aea4ff7f54a5607c -e CAIXA_PIXAPI_DICT_CLIENT_ID=cli-ser-spi -e CAIXA_PIXAPI_DICT_CLIENT_SECRET=1938b188-42c7-4889-bf3a-7d95e4432fe9 -e CAIXA_PIXAPI_DICT_PATH=/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/ -e CAIXA_PIXAPI_DICT_URL=https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/ -e CAIXA_SIINP_APIM_APIKEY=l7d1b52b1a66d6451db7a9a2a1784fe5a9 -e CAIXA_SIINP_APIM_URL=https://api.des.caixa:8443 -e CAIXA_SSO_INTRANET_CLIENT_ID=cli-ser-inp -e CAIXA_SSO_INTRANET_CLIENT_SECRET=4b746850-e224-4db3-b656-4acc71d6d74f -e CAIXA_SSO_INTRANET_TOKEN_ENDPOINT=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -e CAIXA_TRUSTSTORE_PATH=/deployments/caixa-truststore-acteste-nprd.jks -e DINAMO_HSM_HOSTNAME=hsmdes.extra.caixa.gov.br -e DINAMO_HSM_PASSWORD='${sinpsd01_hsm}' -e DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY=inp_obsandbox_enc_ -e DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY=assinatura_caixa_ -e DINAMO_HSM_USER_ID=SINPSD01 -e DIN_JCA_CONF_FILE=classes\Configuration.ND -e HISTFILE=/tmp/.bash_history -e HSM_LOG_DIR=stdout -e HSM_LOG_LEVEL=0 -e HTTP_PROXY=http://proxydes.caixa:80 -e HTTPS_PROXY=http://proxydes.caixa:80 -e IBC_REDIRECT_URI=https://siinp-nucleo-web-des.apps.nprd.caixa -e JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks" -e JORNADA_CACHE_TTL_SECONDS=3600 -e JORNADA_URI_REDIRECT=https://siinp-nucleo-web-des2-des.apps.nprd.caixa/authorize -e LISTA_CONVENIOS_SKIP_SWEEPING=3752,10 -e LISTA_LOGO_SERVIDORES_BLOQUEADO=ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974 -e LISTA_SERVIDORES_BLOQUEADO=e7d013d6-c15f-49ba-acc9-aa8935abcaef -e LISTA_SERVIDORES_PRIORITARIOS=c8f0bf49-4744-4933-8960-7add6e590841,54593889-eaad-4dee-9402-fc7dc8c68783,97592125-061f-4acc-88c8-89c8fff82da2,e967d551-6fc8-4830-84a1-e9c880a54433,44b193ac-a348-4b6e-acd9-9a3a57bb4ca4,f81fc570-05bf-40dd-a424-bede4862fc16,fcaea5b5-efb6-492c-aca2-7e8b5ecc1641,b2aaf82f-f4e2-4f62-8d77-91f510a682e1,07b7bd3a-fb8d-43a9-b17f-712356007bde,a9ba8dad-d695-4acc-b8e0-69caefaf2e17,ee5afa7b-e384-433c-94b6-565b54063c24 -e LISTA_SERVIDORES_PRIORITARIOS_PJ=c8f0bf49-4744-4933-8960-7add6e590841,0b94e4d7-84e6-4e10-af75-ac9d771f83f6,8f36b58a-9d2f-4abc-b36e-b48911386533,14df0edf-4534-46ce-a6d6-13da150a2fd6,554cec86-497c-4743-9bf5-f904b757d552,a3707304-97e7-4f02-a05c-c25d7059a147,414d34f0-9269-401f-a160-abf51141da3d,dfc5669d-d089-4bf9-8b70-9e053e763dbe,eacc5ebb-6afe-4492-ab8c-eaee19c9b1ff -e MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER=false -e MINIAPP_CONVENIO_ID=10 -e MINIAPP_REDIRECT_URI=https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar -e NO_PROXY=*.caixa -e OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE=urn:ietf:params:oauth:client-assertion-type:jwt-bearer -e OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN=client_credentials -e OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE=ParentOrganisationReference -e OPEN_BANKING_BRASIL_SCOPE_TOKEN=directory:software -e OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE=https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks -e OPEN_BANKING_BRASIL_URI_PARTICIPANTS=https://data.sandbox.directory.openbankingbrasil.org.br/participants -e OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION=https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion -e OPEN_BANKING_BRASIL_URI_TOKEN=https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token -e OPEN_FINANCE_MTLS_CERT=/deployments/siinp_mtls_sandbox_of_072026.p12 -e OPEN_FINANCE_MTLS_PASSWORD='${siinp_keystore_sandbox}' -e PCM_BASEPATH_REQUEST=/siinp/request -e PCM_BASEPATH_RESPONSE=/siinp/response -e PROXY_USER_PASSWORD='${sinpbd01_proxy}' -e PROXY_USER=SINPBD01 -e QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE=86400S -e QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE=86400S -e QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS=true -e QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE=5 -e QUARKUS_DATASOURCE_JDBC_MAX_SIZE=50 -e QUARKUS_DATASOURCE_JDBC_MIN_SIZE=5 -e QUARKUS_DATASOURCE_JDBC_URL=jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/PDBD001NG -e QUARKUS_DATASOURCE_METRICS_ENABLED=true -e QUARKUS_DATASOURCE_PASSWORD='${sinpbd01_oracle}' -e QUARKUS_DATASOURCE_USERNAME=SINPBD01 -e QUARKUS_HIBERNATE_ORM_LOG_SQL=false -e QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS=true -e QUARKUS_HTTP_CORS_METHODS=GET,PUT,POST,DELETE,PATCH -e QUARKUS_HTTP_CORS_ORIGINS=https://siinp-nucleo-web-des2-des.apps.nprd.caixa,https://siinp-gestao-web-des2-des.apps.nprd.caixa -e QUARKUS_HTTP_CORS=true -e QUARKUS_HTTP_TEST_PORT=8888 -e QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL=DEBUG -e QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL=INFO -e QUARKUS_LOG_LEVEL=INFO -e QUARKUS_REDIS_HOSTS=redis://redis-master.redis-siinp-des.svc.cluster.local:6379 -e QUARKUS_REDIS_MAX_POOL_SIZE=32 -e QUARKUS_REDIS_MAX_WAITING_HANDLERS=256 -e QUARKUS_REDIS_PASSWORD='${redis_password}' -e QUARKUS_REDIS_TIMEOUT=20S -e SANDBOX_URI_REDIRECT=siinp-nucleo-web-des2-des.apps.nprd.caixa -e SCOPES_DCR=openid_payments -e SECURITY_CRYPTO_KEY=OI8OTCQC8nJPq9vi9psPgSScWu/6RbezD1o2KzlHETg= -e THREAD_POOL=20' ]]; then 
   oc set env  -e AMBIENTE=DES2 -e CAIXA_LDAP_SUBJECT_DN=UID:692793df-2c97-4102-9845-0ec180e50d46,jurisdictionCountryName:BR,businessCategory:Private_Organization,CN:CAIXA_ECONOMICA_FEDERAL,serialNumber:00360305000104,OU:c160a6f5-e5df-5067-9e97-ec6fba62fd87,O:CAIXA_ECONOMICA_FEDERAL,L:BRASILIA,ST:DF,C:BR -e CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER=https://logindes.caixa.gov.br/auth/realms/internet -e CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB -e CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER=https://login.des.caixa/auth/realms/intranet -e CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB -e CAIXA_OPEN_FINANCE_CNPJ=00360305000104 -e CAIXA_OPEN_FINANCE_ISPB=00360305 -e CAIXA_OPEN_FINANCE_ORGANISATION_ID=c160a6f5-e5df-5067-9e97-ec6fba62fd87 -e CAIXA_OPEN_FINANCE_SOFTWARE_STATEMENT_ID=692793df-2c97-4102-9845-0ec180e50d46 -e CAIXA_PIXAPI_DICT_APIKEY=l76138e827bd9d4f87aea4ff7f54a5607c -e CAIXA_PIXAPI_DICT_CLIENT_ID=cli-ser-spi -e CAIXA_PIXAPI_DICT_CLIENT_SECRET=1938b188-42c7-4889-bf3a-7d95e4432fe9 -e CAIXA_PIXAPI_DICT_PATH=/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/ -e CAIXA_PIXAPI_DICT_URL=https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict/v1/chaves/ -e CAIXA_SIINP_APIM_APIKEY=l7d1b52b1a66d6451db7a9a2a1784fe5a9 -e CAIXA_SIINP_APIM_URL=https://api.des.caixa:8443 -e CAIXA_SSO_INTRANET_CLIENT_ID=cli-ser-inp -e CAIXA_SSO_INTRANET_CLIENT_SECRET=4b746850-e224-4db3-b656-4acc71d6d74f -e CAIXA_SSO_INTRANET_TOKEN_ENDPOINT=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -e CAIXA_TRUSTSTORE_PATH=/deployments/caixa-truststore-acteste-nprd.jks -e DINAMO_HSM_HOSTNAME=hsmdes.extra.caixa.gov.br -e DINAMO_HSM_PASSWORD='${sinpsd01_hsm}' -e DINAMO_HSM_PREFIXO_ENCRYPTION_PRIVATE_KEY=inp_obsandbox_enc_ -e DINAMO_HSM_PREFIXO_SIGNATURE_PRIVATE_KEY=assinatura_caixa_ -e DINAMO_HSM_USER_ID=SINPSD01 -e DIN_JCA_CONF_FILE=classes\Configuration.ND -e HISTFILE=/tmp/.bash_history -e HSM_LOG_DIR=stdout -e HSM_LOG_LEVEL=0 -e HTTP_PROXY=http://proxydes.caixa:80 -e HTTPS_PROXY=http://proxydes.caixa:80 -e IBC_REDIRECT_URI=https://siinp-nucleo-web-des.apps.nprd.caixa -e JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks" -e JORNADA_CACHE_TTL_SECONDS=3600 -e JORNADA_URI_REDIRECT=https://siinp-nucleo-web-des2-des.apps.nprd.caixa/authorize -e LISTA_CONVENIOS_SKIP_SWEEPING=3752,10 -e LISTA_LOGO_SERVIDORES_BLOQUEADO=ffb7aac7-b6a8-4091-a0f4-6cf17865ff46,6976323f-fe2a-4ac5-a5d6-db3016b70278,18ce9615-81de-4aaa-8671-e8a95d570fb8,25b646d8-e8b5-439c-8901-c4aacccd6ed4,6e3b6f08-23c5-4284-ae5e-e6428e317a86,eca0b435-cb2d-45d9-b35a-7e22968b3a68,d3490ea1-f043-4942-ba79-29906e2bfa1b,b7a7ecd2-a93a-4715-b281-e79b0a388143,9d9ff069-de05-4749-bb54-f0b6d4592337,a56e9c89-012a-4197-b0e3-ff37a1b07031,22edf759-2e70-4ed3-a720-6baf7e5dafd4,4095c8fe-55d9-4596-a62a-c3bcc04a85db,10b4f3da-e04e-4904-9988-e93c8f141ab1,e7d013d6-c15f-49ba-acc9-aa8935abcaef,ffba6a4b-b8c0-43fe-a802-4cc65f47c7fa,3c4a5cda-712b-42df-8389-e9912cc6a6d5,10c49138-4774-41b2-9d1d-26b1026a4974 -e LISTA_SERVIDORES_BLOQUEADO=e7d013d6-c15f-49ba-acc9-aa8935abcaef -e LISTA_SERVIDORES_PRIORITARIOS=c8f0bf49-4744-4933-8960-7add6e590841,54593889-eaad-4dee-9402-fc7dc8c68783,97592125-061f-4acc-88c8-89c8fff82da2,e967d551-6fc8-4830-84a1-e9c880a54433,44b193ac-a348-4b6e-acd9-9a3a57bb4ca4,f81fc570-05bf-40dd-a424-bede4862fc16,fcaea5b5-efb6-492c-aca2-7e8b5ecc1641,b2aaf82f-f4e2-4f62-8d77-91f510a682e1,07b7bd3a-fb8d-43a9-b17f-712356007bde,a9ba8dad-d695-4acc-b8e0-69caefaf2e17,ee5afa7b-e384-433c-94b6-565b54063c24 -e LISTA_SERVIDORES_PRIORITARIOS_PJ=c8f0bf49-4744-4933-8960-7add6e590841,0b94e4d7-84e6-4e10-af75-ac9d771f83f6,8f36b58a-9d2f-4abc-b36e-b48911386533,14df0edf-4534-46ce-a6d6-13da150a2fd6,554cec86-497c-4743-9bf5-f904b757d552,a3707304-97e7-4f02-a05c-c25d7059a147,414d34f0-9269-401f-a160-abf51141da3d,dfc5669d-d089-4bf9-8b70-9e053e763dbe,eacc5ebb-6afe-4492-ab8c-eaee19c9b1ff -e MICROPROFILE_REST_CLIENT_DISABLE_DEFAULT_MAPPER=false -e MINIAPP_CONVENIO_ID=10 -e MINIAPP_REDIRECT_URI=https://stgsuperappdes.z15.web.core.windows.net/open-finance/iniciadora-autorizar -e NO_PROXY=*.caixa -e OPEN_BANKING_BRASIL_CLIENT_ASSERTION_TYPE=urn:ietf:params:oauth:client-assertion-type:jwt-bearer -e OPEN_BANKING_BRASIL_GRANT_TYPE_TOKEN=client_credentials -e OPEN_BANKING_BRASIL_PARENT_ORGANISATION_REFERENCE=ParentOrganisationReference -e OPEN_BANKING_BRASIL_SCOPE_TOKEN=directory:software -e OPEN_BANKING_BRASIL_URI_BANK_KEYSTORE=https://keystore.sandbox.directory.openbankingbrasil.org.br/%s/application.jwks -e OPEN_BANKING_BRASIL_URI_PARTICIPANTS=https://data.sandbox.directory.openbankingbrasil.org.br/participants -e OPEN_BANKING_BRASIL_URI_SOFTWARE_STATEMENT_ASSERTION=https://matls-api.sandbox.directory.openbankingbrasil.org.br/organisations/%s/softwarestatements/%s/assertion -e OPEN_BANKING_BRASIL_URI_TOKEN=https://matls-auth.sandbox.directory.openbankingbrasil.org.br/token -e OPEN_FINANCE_MTLS_CERT=/deployments/siinp_mtls_sandbox_of_072026.p12 -e OPEN_FINANCE_MTLS_PASSWORD='${siinp_keystore_sandbox}' -e PCM_BASEPATH_REQUEST=/siinp/request -e PCM_BASEPATH_RESPONSE=/siinp/response -e PROXY_USER_PASSWORD='${sinpbd01_proxy}' -e PROXY_USER=SINPBD01 -e QUARKUS_CACHE_CAFFEINE__CREATE_AND_SAVE_DCR_IF_NOT_EXISTS__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__DCR_BY_ID__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__FIND_BY_COSERVIDOR_AUTORIZACAO__EXPIRE_AFTER_WRITE=60S -e QUARKUS_CACHE_CAFFEINE__HTTP_CLIENT_CACHE__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__KID_OF_JWKS__EXPIRE_AFTER_WRITE=86400S -e QUARKUS_CACHE_CAFFEINE__LABEL_RECENTE_HSM_DINAMO__EXPIRE_AFTER_WRITE=86400S -e QUARKUS_CACHE_CAFFEINE__OPENID_CONFIGURATION__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_BY_ID__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANT_CACHE_FILTERED_BY_ID__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_FILTERED_ORDERED__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PARTICIPANTS_CACHE_ORDERED__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__PRIVATE_KEY_HSM_DINAMO__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_CACHE_CAFFEINE__VALID_BANK_AUTHORIZATION_SERVER__EXPIRE_AFTER_WRITE=43200S -e QUARKUS_DATASOURCE_JDBC_ENABLE_METRICS=true -e QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE=5 -e QUARKUS_DATASOURCE_JDBC_MAX_SIZE=50 -e QUARKUS_DATASOURCE_JDBC_MIN_SIZE=5 -e QUARKUS_DATASOURCE_JDBC_URL=jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/PDBD001NG -e QUARKUS_DATASOURCE_METRICS_ENABLED=true -e QUARKUS_DATASOURCE_PASSWORD='${sinpbd01_oracle}' -e QUARKUS_DATASOURCE_USERNAME=SINPBD01 -e QUARKUS_HIBERNATE_ORM_LOG_SQL=false -e QUARKUS_HTTP_CORS_ACCESS_CONTROL_ALLOW_CREDENTIALS=true -e QUARKUS_HTTP_CORS_METHODS=GET,PUT,POST,DELETE,PATCH -e QUARKUS_HTTP_CORS_ORIGINS=https://siinp-nucleo-web-des2-des.apps.nprd.caixa,https://siinp-gestao-web-des2-des.apps.nprd.caixa -e QUARKUS_HTTP_CORS=true -e QUARKUS_HTTP_TEST_PORT=8888 -e QUARKUS_LOG_CATEGORY__BR_GOV_CAIXA__LEVEL=DEBUG -e QUARKUS_LOG_CATEGORY__ORG_APACHE_HTTP__LEVEL=INFO -e QUARKUS_LOG_LEVEL=INFO -e QUARKUS_REDIS_HOSTS=redis://redis-master.redis-siinp-des.svc.cluster.local:6379 -e QUARKUS_REDIS_MAX_POOL_SIZE=32 -e QUARKUS_REDIS_MAX_WAITING_HANDLERS=256 -e QUARKUS_REDIS_PASSWORD='${redis_password}' -e QUARKUS_REDIS_TIMEOUT=20S -e SANDBOX_URI_REDIRECT=siinp-nucleo-web-des2-des.apps.nprd.caixa -e SCOPES_DCR=openid_payments -e SECURITY_CRYPTO_KEY=OI8OTCQC8nJPq9vi9psPgSScWu/6RbezD1o2KzlHETg= -e THREAD_POOL=20 deploymentconfig "siinp-nucleo-des2-des" -c "$CONTAINER_PRINCIPAL" --overwrite=true -n siinp-des
fi
2026-09-10T20:56:51.0302119Z Generating script.
2026-09-10T20:56:51.0302573Z ##[debug]which 'bash'
2026-09-10T20:56:51.0302952Z ##[debug]found: '/bin/bash'
2026-09-10T20:56:51.0303305Z ##[debug]Agent.Version=3.225.2
2026-09-10T20:56:51.0303707Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T20:56:51.0304130Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T20:56:51.0304441Z ========================== Starting Command Output ===========================
2026-09-10T20:56:51.0304775Z ##[debug]which '/bin/bash'
2026-09-10T20:56:51.0305263Z ##[debug]found: '/bin/bash'
2026-09-10T20:56:51.0305702Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/d66850ae-b4a8-423a-a614-1cad665aeefb.sh
2026-09-10T20:56:51.0306100Z ##[debug]exec tool: /bin/bash
2026-09-10T20:56:51.0306321Z ##[debug]arguments:
2026-09-10T20:56:51.0306579Z ##[debug]   /opt/ads-agent/_work/_temp/d66850ae-b4a8-423a-a614-1cad665aeefb.sh
2026-09-10T20:56:51.0307064Z [command]/bin/bash /opt/ads-agent/_work/_temp/d66850ae-b4a8-423a-a614-1cad665aeefb.sh
2026-09-10T20:56:51.0365980Z Nova APP: false
2026-09-10T20:56:51.6398782Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:51.9266644Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:52.2802233Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:52.5648278Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:52.8638609Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:53.1681720Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:53.4663850Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:53.7483458Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:54.0350799Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:54.3374276Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:54.6403521Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:54.9326966Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:55.2251524Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:55.5327016Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:55.8397077Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:56.1346162Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:56.4435834Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:56.7381772Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:57.0352221Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:57.3850966Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:57.6821117Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:57.9711617Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:58.2702294Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:58.5872791Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:58.8982982Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:59.2070929Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:59.4911305Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:56:59.7898362Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:00.0788101Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:00.3686551Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:00.6497975Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:00.9356409Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:01.2242754Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:01.5420460Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:01.8620249Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:02.1467619Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:02.4421112Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:02.7305310Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:03.0876924Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:03.3746864Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:03.6581128Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:03.9813281Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:04.2675775Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:04.5487637Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:04.8311890Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:05.1181899Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:05.4086462Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:05.6915839Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:05.9724861Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:06.2784507Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:06.5873210Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:06.8668081Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:07.1481867Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:07.4331443Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:07.7075767Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:07.9891774Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:08.2689775Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:08.5494615Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:08.8584526Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:09.1356131Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:09.4202224Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:09.7098957Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:10.0379895Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:10.3245571Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:10.6260283Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:10.9085761Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:11.2029183Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:11.4807234Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:11.7626335Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:12.0371222Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:12.3189430Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:12.5929939Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:12.8866422Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:13.1810205Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:13.4765725Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:13.7674975Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:14.0594374Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:14.3467136Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:14.6286007Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:14.9215679Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:15.2055618Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:15.4838025Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:15.7870760Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:16.0644659Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:16.3434310Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:16.6224007Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:16.9009084Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:17.1826229Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:17.4579649Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:17.7338021Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:18.0161543Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:18.2922580Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:18.5774367Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:18.8583672Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:19.1468751Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:19.4209220Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:19.7192628Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:19.9989508Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:20.2864129Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:20.8553118Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:21.1637926Z deploymentconfig.apps.openshift.io/siinp-nucleo-des2-des updated
2026-09-10T20:57:21.1707338Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-09-10T20:57:21.1707909Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-10T20:57:21.1723346Z ##[debug]task result: Succeeded
2026-09-10T20:57:21.1724423Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-10T20:57:21.1736966Z ##[section]Finishing: Atualizando Variáveis de Ambiente

