2026-08-28T11:46:51.9201359Z ##[section]Starting: Verificando Status do Deployment
2026-08-28T11:46:51.9205713Z ==============================================================================
2026-08-28T11:46:51.9205820Z Task         : Bash
2026-08-28T11:46:51.9205864Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T11:46:51.9205961Z Version      : 3.227.0
2026-08-28T11:46:51.9206006Z Author       : Microsoft Corporation
2026-08-28T11:46:51.9206058Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T11:46:51.9206164Z ==============================================================================
2026-08-28T11:46:52.0781261Z Generating script.
2026-08-28T11:46:52.0797631Z ========================== Starting Command Output ===========================
2026-08-28T11:46:52.0860978Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3ba1ede0-7aef-450a-b144-12d805a003b3.sh
2026-08-28T11:46:52.1917896Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T11:46:54.0006214Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T11:46:54.0558249Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-28T11:52:59.4324745Z ##[error]The task has timed out.
2026-08-28T11:52:59.4326131Z ##[section]Finishing: Verificando Status do Deployment



2026-08-28T11:52:59.4351501Z ##[section]Starting: Logs da Aplicação
2026-08-28T11:52:59.4355871Z ==============================================================================
2026-08-28T11:52:59.4355960Z Task         : Bash
2026-08-28T11:52:59.4356006Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T11:52:59.4356104Z Version      : 3.227.0
2026-08-28T11:52:59.4356151Z Author       : Microsoft Corporation
2026-08-28T11:52:59.4356202Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T11:52:59.4356310Z ==============================================================================
2026-08-28T11:52:59.5922505Z Generating script.
2026-08-28T11:52:59.5930448Z ========================== Starting Command Output ===========================
2026-08-28T11:52:59.5937619Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5c41c6a4-9733-4197-8cf8-55ba98255c3a.sh
2026-08-28T11:52:59.5991659Z + shopt -s expand_aliases
2026-08-28T11:52:59.5991964Z + [[ -n okd4_nprd ]]
2026-08-28T11:52:59.5992296Z + [[ okd4_nprd =~ ocp ]]
2026-08-28T11:52:59.5992580Z + [[ -n okd4_nprd ]]
2026-08-28T11:52:59.5992742Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-28T11:52:59.5995371Z + app=sifap-centralizadora-backend-intranet-tqs
2026-08-28T11:52:59.5995608Z + oc version
2026-08-28T11:52:59.6743839Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-28T11:52:59.6744558Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-28T11:52:59.6745092Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-28T11:52:59.6783306Z ++ oc get pod -l name=sifap-centralizadora-backend-intranet-tqs -n sifap-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-28T11:52:59.6784559Z ++ tac
2026-08-28T11:52:59.6785988Z ++ grep -v '^$'
2026-08-28T11:52:59.6786340Z ++ head -n1
2026-08-28T11:52:59.7794478Z + last_pod=sifap-centralizadora-backend-intranet-tqs-48-lrw9r
2026-08-28T11:52:59.7794851Z + echo 'Logs do POD: sifap-centralizadora-backend-intranet-tqs-48-lrw9r'
2026-08-28T11:52:59.7795167Z + oc logs sifap-centralizadora-backend-intranet-tqs-48-lrw9r -c sifap-centralizadora-backend-intranet-tqs -n sifap-tqs
2026-08-28T11:52:59.7795445Z Logs do POD: sifap-centralizadora-backend-intranet-tqs-48-lrw9r
2026-08-28T11:52:59.8795899Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-28T11:52:59.8796722Z Error occurred during initialization of VM
2026-08-28T11:52:59.8796989Z agent library failed Agent_OnLoad: instrument
2026-08-28T11:52:59.8797582Z Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar
2026-08-28T11:52:59.8882658Z ##[section]Finishing: Logs da Aplicação





exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Error occurred during initialization of VM
agent library failed Agent_OnLoad: instrument
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar




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
SIFAP-centralizadora-backend-intranet
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
SIFAP

SIFAP-centralizadora-backend-intranet
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
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES (28)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
Scopes: EC DES
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.API_MANAGER_SIICO_INFO_PRIVADAS
https://api.des.caixa:8443/informacoes-corporativas-privadas
_ENV.API_MANAGER_SIICO_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas
_ENV.API_MANAGER_SIMTR_URL
https://api.des.caixa:8443/simtr
_ENV.API_OIDC_CLIENT
cli-ser-fap
_ENV.API_OIDC_REALM
intranet
_ENV.API_OIDC_URL_HOST
https://login.des.caixa/auth
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
10
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.116.92.87:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true"
_ENV.QUARKUS_DATASOURCE_USERNAME
SFAPDR01
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_ORIGINS
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.QUARKUS_PORT
8080
_ENV.SIISO_URL
https://api.des.caixa:8443/cadastro-receita
_ENV.TRUST_ALL
false
_SECRET.API_OIDC_TOKEN_CLIENT_SECRET
#{SECRET_API_OIDC_TOKEN_CLIENT_SECRET}#
_SECRET.API_kEY
#{SECRET_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES (2)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES
Scopes: EC DES
SIFAP-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS
Scopes: EC TQS
INIT
Criado via api
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-tqs.apps.nprd.caixa
_ENV.API_MANAGER_SIICO_INFO_PRIVADAS
https://api.des.caixa:8443/informacoes-corporativas-privadas
_ENV.API_MANAGER_SIICO_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas
_ENV.API_MANAGER_SIMTR_URL
https://api.des.caixa:8443/simtr
_ENV.API_OIDC_CLIENT
cli-ser-fap
_ENV.API_OIDC_REALM
intranet
_ENV.API_OIDC_URL_HOST
https://login.des.caixa/auth
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.JAVA_OPTIONS_DISABLED
"-Djavax.net.debug=ssl,handshake"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.116.28.45:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true"
_ENV.QUARKUS_DATASOURCE_USERNAME
SFAPTR02
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_ORIGINS
https://sifap-centralizadora-frontend-intranet-tqs.apps.nprd.caixa
_ENV.QUARKUS_PORT
8080
_ENV.SIISO_URL
https://api.des.caixa:8443/cadastro-receita
_ENV.TRUST_ALL
false
_SECRET.API_OIDC_TOKEN_CLIENT_SECRET
#{SECRET_API_OIDC_TOKEN_CLIENT_SECRET}#
_SECRET.API_kEY
#{SECRET_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP TAS000048313297
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD
Scopes: EC PRD
|Manage variable groups
Showing 13 deployments

EC TQSDeploy release

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

2 pipelines found

Row 3

Row 3

Row 3

Row 3

Row 3

1 pipelines found

Row 2

Row 3

Row 2

DES

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2




