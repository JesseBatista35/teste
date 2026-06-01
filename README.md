estou com problewmas empara subir o deploy em tqs da sinp-pdq


SINEP-PDQ-DES (52)
Grupo de variáveis de SINEP-PDQ-DES
Scopes: EC DES
INIT
Criado via api
JDBC_PASSWORD
'${SINEP_USR_NEP001}'
JDBC_PASSWORD_SIICO
'${SINEP_USR_NEP001}'
SINEP_APIKEY
'${SINEP_BT_APIKEY}'
SSO_CLIENT_SECRET_SINEP
'${CLISERNEP_SSO_INTER}'
SSO_CLIENT_SECRET_SINEP_INTRANET
'${CLISERNEP_SSO_INTRA}'
SSO_PUB_KEY_SINEP
********
SSO_PUB_KEY_SINEP_INTRANET
********
VAULT_LOCATION
/usr/src/app/secrets_files/SINEP_DES
_ENV.APIM_TIMEOUT
1000
_ENV.APIM_URL
https://api.des.caixa:8443
_ENV.CORS_ORIGINS
*
_ENV.JDBC_POOL_MAX_SIZE
15
_ENV.JDBC_POOL_MAX_SIZE_SIICO
15
_ENV.JDBC_POOL_MIN_SIZE
5
_ENV.JDBC_POOL_MIN_SIZE_SIICO
5
_ENV.JDBC_URL
"jdbc:sqlserver://10.116.93.99:1433;DatabaseName=NEPDBDES"
_ENV.JDBC_URL_SIICO
"jdbc:sqlserver://10.116.93.99:1433;DatabaseName=ICO"
_ENV.JDBC_USERNAME
usr_nep_001
_ENV.JDBC_USERNAME_SIICO
usr_nep_001
_ENV.LOG_APACHE_HTTP
INFO
_ENV.LOG_APACHE_HTTP_MIN_LEVEL
INFO
_ENV.LOG_LEVEL
INFO
_ENV.LOG_MIN_LEVEL
INFO
_ENV.MQ_BASE_QUEUE_NAME
LQ.RSP.SINEP.TRILHA
_ENV.MQ_CHANNEL
BRD4.SISPL.SVRCONN
_ENV.MQ_HOST
10.192.228.145
_ENV.MQ_MAX_POOL_SIZE
6
_ENV.MQ_MIN_POOL_SIZE
6
_ENV.MQ_PORT
1416
_ENV.MQ_QUEUE_MANAGER
BRD4
_ENV.MQ_TIMEOUT
180
_ENV.MQ_TRANSPORT_TYPE
TCP
_ENV.MQ_USER
SNEPDB01
_ENV.REST_CLIENT_VERIFY_HOST
false
_ENV.SINEP_FILE_UPLOAD_EXT
txt,csv,jpeg,jpg,png,gif,mp3,wma,wav,mp4,avi,wmv,flv,mkv,pdf,zip,xls,rar,doc,docx,xlsx,jpe,jfif,dib,bmp,tiff,heic
_ENV.SINEP_FILE_UPLOAD_PATH
/var/sistemas/sinep/DES
_ENV.SSO_BASE_SINEP
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_BASE_SINEP_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_CLIENT_SINEP
cli-ser-nep
_ENV.SSO_CLIENT_SINEP_INTRANET
cli-ser-nep
_ENV.TRILHA_ATIVA
true
_ENV.TRUST_STORE_JKS_PASSWORD
changeit
_ENV.TRUST_STORE_JKS_PATH
/deployments/caixa-truststore-acteste-nprd.jks
_SECRET.JDBC_PASSWORD
#{JDBC_PASSWORD}#
_SECRET.JDBC_PASSWORD_SIICO
#{JDBC_PASSWORD_SIICO}#
_SECRET.SINEP_APIKEY
#{SINEP_APIKEY}#
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
_SECRET.SSO_CLIENT_SECRET_SINEP
#{SSO_CLIENT_SECRET_SINEP}#
_SECRET.SSO_CLIENT_SECRET_SINEP_INTRANET
#{SSO_CLIENT_SECRET_SINEP_INTRANET}#
_SECRET.SSO_PUB_KEY_SINEP
#{SSO_PUB_KEY_SINEP}#
_SECRET.SSO_PUB_KEY_SINEP_INTRANET
#{SSO_PUB_KEY_SINEP_INTRANET}#



SINEP-PDQ-BT-VAULT-DES (3)
Grupo de variáveis de SINEP-PDQ-BT-VAULT-DES

Scopes: EC DES
BT_CLIENT_ID
d9113f7f-2eab-4247-af24-eeead154e3dc
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SINEP_DES/CLISERNEP_SSO_INTER,SINEP_DES/CLISERNEP_SSO_INTRA,SINEP_DES/SINEP_BT_APIKEY,SINEP_DES/SINEP_USR_NEP001



INIT
Criado via api
JDBC_PASSWORD
'${SINEP_USR_NEP001}'
JDBC_PASSWORD_SIICO
'${SINEP_USR_NEP001}'
SINEP_APIKEY
'${SINEP_BT_APIKEY}'
SSO_CLIENT_SECRET_SINEP
'${CLISERNEP_SSO_INTER}'
SSO_CLIENT_SECRET_SINEP_INTRANET
'${CLISERNEP_SSO_INTRA}'
SSO_PUB_KEY_SINEP
********
SSO_PUB_KEY_SINEP_INTRANET
********
VAULT_LOCATION
/usr/src/app/secrets_files/SINEP_DES
_ENV.APIM_TIMEOUT
1000
_ENV.APIM_URL
https://api.des.caixa:8443
_ENV.CORS_ORIGINS
*
_ENV.JDBC_POOL_MAX_SIZE
15
_ENV.JDBC_POOL_MAX_SIZE_SIICO
15
_ENV.JDBC_POOL_MIN_SIZE
5
_ENV.JDBC_POOL_MIN_SIZE_SIICO
5
_ENV.JDBC_URL
"jdbc:sqlserver://10.116.93.99:1433;DatabaseName=NEPDBTQS"
_ENV.JDBC_URL_SIICO
"jdbc:sqlserver://10.116.93.99:1433;DatabaseName=ICO"
_ENV.JDBC_USERNAME
usr_nep_001
_ENV.JDBC_USERNAME_SIICO
usr_nep_001
_ENV.LOG_APACHE_HTTP
INFO
_ENV.LOG_APACHE_HTTP_MIN_LEVEL
INFO
_ENV.LOG_LEVEL
INFO
_ENV.LOG_MIN_LEVEL
INFO
_ENV.MQ_BASE_QUEUE_NAME
LQ.RSP.SINEP.TRILHA
_ENV.MQ_CHANNEL
BRD3.SVRCONN.SILCE
_ENV.MQ_HOST
10.192.224.100
_ENV.MQ_MAX_POOL_SIZE
6
_ENV.MQ_MIN_POOL_SIZE
6
_ENV.MQ_PORT
1415
_ENV.MQ_QUEUE_MANAGER
BRD3
_ENV.MQ_TIMEOUT
180
_ENV.MQ_TRANSPORT_TYPE
TCP
_ENV.MQ_USER
SNEPDB01
_ENV.REST_CLIENT_VERIFY_HOST
false
_ENV.SINEP_FILE_UPLOAD_EXT
txt,csv,jpeg,jpg,png,gif,mp3,wma,wav,mp4,avi,wmv,flv,mkv,pdf,zip,xls,rar,doc,docx,xlsx,jpe,jfif,dib,bmp,tiff,heic
_ENV.SINEP_FILE_UPLOAD_PATH
/var/sistemas/sinep/TQS
_ENV.SSO_BASE_SINEP
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_BASE_SINEP_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_CLIENT_SINEP
cli-ser-nep
_ENV.SSO_CLIENT_SINEP_INTRANET
cli-ser-nep
_ENV.TRILHA_ATIVA
true
_ENV.TRUST_STORE_JKS_PASSWORD
changeit
_ENV.TRUST_STORE_JKS_PATH
/deployments/caixa-truststore-acteste-nprd.jks
_SECRET.JDBC_PASSWORD
#{JDBC_PASSWORD}#
_SECRET.JDBC_PASSWORD_SIICO
#{JDBC_PASSWORD_SIICO}#
_SECRET.SINEP_APIKEY
#{SINEP_APIKEY}#
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
_SECRET.SSO_CLIENT_SECRET_SINEP
#{SSO_CLIENT_SECRET_SINEP}#
_SECRET.SSO_CLIENT_SECRET_SINEP_INTRANET
#{SSO_CLIENT_SECRET_SINEP_INTRANET}#
_SECRET.SSO_PUB_KEY_SINEP
#{SSO_PUB_KEY_SINEP}#
_SECRET.SSO_PUB_KEY_SINEP_INTRANET
#{SSO_PUB_KEY_SINEP_INTRANET}#


SINEP-PDQ-BT-VAULT-TQS (3)
Grupo de variáveis de SINEP-PDQ-BT-VAULT-TQS

Scopes: EC TQS
BT_CLIENT_ID
d9113f7f-2eab-4247-af24-eeead154e3dc
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SINEP_DES/CLISERNEP_SSO_INTER,SINEP_DES/CLISERNEP_SSO_INTRA,SINEP_DES/SINEP_BT_APIKEY,SINEP_DES/SINEP_USR_NEP001



configuraçao do beyundtrus,, me ajuda a comprara as variaves em DES esta funciaondo o pod subir em tqs o pode da isso:


P
sinep-pdq-tqs-17-qv6xc
Init:Error

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Log stream ended.

Container
C
secrets-agent-sidecar

Current log
Search

Wrap lines
|
Raw
|
Download
|
10 lines
2026-06-01 20:05:31,091 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) APP VERSION: 2.1.0
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Starting Execution...3dd4a55c-5df5-11f1-91c4-0a5819022d22
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) You are using: <,> as List delimiter
2026-06-01 20:05:31,091 WARNING (3dd4a55c-5df5-11f1-91c4-0a5819022d22) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Certificate was not configured
2026-06-01 20:05:31,094 DEBUG (3dd4a55c-5df5-11f1-91c4-0a5819022d22) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-06-01 20:05:31,094 WARNING (3dd4a55c-5df5-11f1-91c4-0a5819022d22) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-06-01 20:05:31,151 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-06-01 20:05:31,190 ERROR (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Please check credentials (API key/client credentials), error "Failed to authenticate due to one or more authentication rules."



Project: sinep-tqs
Pods
Pod details
Pod
P
sinep-pdq-tqs-17-qv6xc
Init:Error

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Log stream ended.

Container
C
sinep-pdq-tqs

Current log
Search

Wrap lines
|
Raw
|
Download
|
10 lines
2026-06-01 20:05:31,091 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) APP VERSION: 2.1.0
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Starting Execution...3dd4a55c-5df5-11f1-91c4-0a5819022d22
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) You are using: <,> as List delimiter
2026-06-01 20:05:31,091 WARNING (3dd4a55c-5df5-11f1-91c4-0a5819022d22) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-06-01 20:05:31,091 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Certificate was not configured
2026-06-01 20:05:31,094 DEBUG (3dd4a55c-5df5-11f1-91c4-0a5819022d22) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-06-01 20:05:31,094 WARNING (3dd4a55c-5df5-11f1-91c4-0a5819022d22) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-06-01 20:05:31,151 INFO (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-06-01 20:05:31,190 ERROR (3dd4a55c-5df5-11f1-91c4-0a5819022d22) Please check credentials (API key/client credentials), error "Failed to authenticate due to one or more authentication rules."
