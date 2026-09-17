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
SID01-lancamentos-financeiros-OKD4
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
SID01

SID01-lancamentos-financeiros-OKD4
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
SID01-lancamentos-financeiros-OKD4 (19)

Scopes: EC DES
PASS_BASIC_AUTH
********
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=af499966-a437-4fed-9f90-b415f82a8004;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SID01-lancamentos-financeiros-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
33
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
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
_ENV.CICSWEB_ROOT_ENDPOINT_HTTP
https://cicsweb.des.caixa:2584
_ENV.CICSWEB_ROOT_ENDPOINT_HTTPS
https://cicsweb.des.caixa:32587
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar"
_ENV.NO_PROXY
".caixa,.caixa.gov.br,10.0.0.0/8"
_ENV.USER_BASIC_AUTH
SNSGSD01
_SECRET.PASS_BASIC_AUTH
#{PASS_BASIC_AUTH}#
SID01-lancamentos-financeiros-TQS (19)

Scopes: EC TQS
PASS_BASIC_AUTH
********
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=af499966-a437-4fed-9f90-b415f82a8004;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SID01-lancamentos-financeiros-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
33
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER
https://login2tqs.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01H0wQ9sOd2rmZV11mGIOoAN/Yklz6SuL+eeXJsnak/osL3xkTszTQ+S/8iZScXpmOj5eM3QbncD9yF0/DHEWrS7DzBetrWnlpa53HocW9u+FEcVgtxofKlAz0rcVyOxl4YuKSElDmo0C0qFgLIaiXPKSnGiB5GmBegvK3nBo95/IPUKUxLUJzpOU7/7nkIVlUrHEx68dcWWsZtpRzrblSOIP/P6DX0sCtr0afSGypE8FbFaSw4CnvLpPzHfDWhqW8J8Z1cY6qX9aF8cV5955EOf/QW6LQAK7QZiD3pnOPnnVvRduUtQRfM7C4rT++TmmPhlTmaXeIsrcsZqI8Q5+wIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER
https://logintqs.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnUpqUUzfo9cWEFMy4ycmT1VqSSuvOvVxEbKl8xxyHkJNDEnXJB9Yia5kPYfCcUZrqzbqr06aKYCNITdo4i2UWb/bI4JxN78Uv2rm9v+x/DoEbLGJIq+eq/cezfTnxWdLctCgCKduchr4pSJkw9CTEbyMF/EjcKbwP3l4iKzQ9WKOmYSH3JxKwTQahLnVsGSryEQhJsjM6ixJWdlGe2WonaAzQigEOpb6e79pae1H5QKGNzRIrucPW5ABIK8sZKPeQNZE2+OtajuQckORS5f3w2PsbSfCh+kW81rMnyuxX+0iy6wz6hcJUQVsA60HkIl/hZ90U4DMrD7BwMTDB+5E/wIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER
https://login.tqs.caixa/auth/realms/intranet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnA3K4+m+xZE7pqA4HgFMhpXztxWUwwhDZ1GlWQwqLGOwAj0EjzvhinZ8GG+qAClOSdrMCFbVrMELkvmfK8x/5Xrd70poUkq3x2gUUrJGNkuoxlYI9NKtsbEzRxxroVZVPRbJzrnRv2/kTFFE6SxTOfd0ZGbuV7CIuIAD42RsLvyjZALK9sM+eHJG+W0zb+L5+zfHP2g6y1/Ykf72mXnTKLgMAMGr1eEyVyBF1dOnsH/AOovm6w4Y5IDgnd1aWDN0ywfH9WsIq0ork7Kb/76IjNlS7+BhV2rnlFnvNm4pji6Ft3tkKMd0Gpx+6lHzWMk2kjb5pA5uDGq3lzFhtYqcnQIDAQAB
_ENV.CICSWEB_ROOT_ENDPOINT_HTTP
https://cicsweb.tqs.caixa:2584
_ENV.CICSWEB_ROOT_ENDPOINT_HTTPS
https://cicsweb.tqs.caixa:2587
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar"
_ENV.NO_PROXY
".caixa,.caixa.gov.br,10.0.0.0/8"
_ENV.USER_BASIC_AUTH
SNSGSQ01
_SECRET.PASS_BASIC_AUTH
#{PASS_BASIC_AUTH}#
OKD-4-APL (12)
Scopes: EC PRD
SID01-lancamentos-financeiros-prd (19)
Scopes: EC PRD
|Manage variable groups
Collapsed

Expanded

Collapsed

Collapsed

3 results found

Expanded

Collapsed

Expanded

Collapsed

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

152 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Row 7

Showing filters 1 through 2





exite alguma diferença, porqu em des estao dizendo que funcina
