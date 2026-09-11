removi ja as duas vamos tratar o outro erro agora

depois fazemos um novo deploy

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
SIABM-AUTENTICACAO-24HORAS-DES

Variable group
Properties
Variable group name
SIABM-AUTENTICACAO-24HORAS-DES
Description
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-DES


Variables
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(?:/actuator/health)(?:\\?.*)?$","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
'InstrumentationKey=63baa68e-6551-4fb0-99db-52f8d1efd964;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/;ApplicationId=f94af886-cd60-4c6e-b856-7185f640fe46'
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIABM-AUTENTICACAO-24HORAS-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CONEXAO_HSM_IP
hsmdes.extra.caixa.gov.br
_ENV.CONEXAO_HSM_PWD
'${SABMSD01_HSM}'
_ENV.CONEXAO_HSM_USR
SABMSD01
_ENV.DB_PASSWORD
'${SABMDS08_ORACLE}'
_ENV.DB_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=orad01bc)))
_ENV.DB_USER
sabmds08
_ENV.HSM_AES_INCLUSAO_BIOMETRICA
siabm/AES_SIABM_K_001
_ENV.HSM_AES_INCLUSAO_BIOMETRICA_V2
SABMSD01/AES_SIABM_K_002
_ENV.HSM_ENCRYPT_KEY
abm_tecban_001
_ENV.HSM_HMACKEYNAME
abm_mac_001
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
".caixa,.caixa.gov.br"
_ENV.REALM
intranet
_ENV.SIABM_SSO_CLIENT_ID
cli-ser-abm
_ENV.SIABM_SSO_CLIENT_SECRET
'${CLISERABM_SSO_INTRA}'
_ENV.URL_SSO
https://login.des.caixa/auth
_SECRET.SIABM_VAULT
#{VAULT_LOCATION}#
VAULT_LOCATION
/usr/src/app/secrets_files/SIABM_DES/
