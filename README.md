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
SIISO-bcadastro-backend
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
SIISO

SIISO-bcadastro-backend
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
SIISO-BCADASTRO-BACKEND-DES (15)
Grupo de variáveis de SIISO-BCADASTRO-BACKEND-DES

Scopes: EC DES
PASSDB
********
PATH_DESTINO
/siiso
PATH_NFS
/fs_siiso
SERVER_NFS
nprdnfs01.ad.caixa
SIZE_VOLUME
20Gi
_ENV.CRON_EXPR
"0 * * * * ?"
_ENV.QUARKUS_DATASOURCE_DB_KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
com.ibm.db2.jcc.DB2Driver
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0:currentSchema=DESISO;"
_ENV.QUARKUS_DATASOURCE_USERNAME
SISODR01
_ENV.QUARKUS_HIBERNATE_ORM_DIALECT
org.hibernate.dialect.DB2Dialect
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SCHEMA
DESISO
_ENV.SSO_CLIENT_ID
cli-ser-iso
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASSDB}#
SIISO-BCADASTRO-BACKEND-TQS (1)
Grupo de variáveis de SIISO-BCADASTRO-BACKEND-TQS
Scopes: EC TQS
SIISO-BCADASTRO-BACKEND-HMP (1)
Grupo de variáveis de SIISO-BCADASTRO-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIISO-BCADASTRO-BACKEND-PRD (1)
Grupo de variáveis de SIISO-BCADASTRO-BACKEND-PRD
Scopes: EC PRD
|Manage variable groups
Showing 5 deployments

Showing 5 deployments

Showing 6 deployments

Row 2

Showing 6 deployments

Row 2

Row 2

Row 2. Clickable

Showing 4 filtered items.

Get started and run this pipeline for the first time!

Expanded

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2





corrigims mais queboru




2026-10-30T13:28:28.5020111Z ##[section]Starting: Verificando se o Volume foi configurado corretamente.
2026-10-30T13:28:28.5025759Z ==============================================================================
2026-10-30T13:28:28.5025867Z Task         : Bash
2026-10-30T13:28:28.5025959Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T13:28:28.5026022Z Version      : 3.227.0
2026-10-30T13:28:28.5026587Z Author       : Microsoft Corporation
2026-10-30T13:28:28.5026696Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T13:28:28.5026771Z ==============================================================================
2026-10-30T13:28:28.6467529Z Generating script.
2026-10-30T13:28:28.6480560Z ========================== Starting Command Output ===========================
2026-10-30T13:28:28.6488096Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6b5e6d06-ad09-468c-9e68-e27b0c48c5c7.sh
2026-10-30T13:28:28.7344717Z Ocorreu alguma falha no processo de configuração
2026-10-30T13:28:28.7370454Z ##[error]Bash exited with code '1'.
2026-10-30T13:28:28.7405586Z ##[section]Finishing: Verificando se o Volume foi configurado corretamente.



2026-10-30T13:28:28.7673997Z ##[section]Starting: Logs da Aplicação
2026-10-30T13:28:28.7677357Z ==============================================================================
2026-10-30T13:28:28.7677436Z Task         : Bash
2026-10-30T13:28:28.7677512Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T13:28:28.7677574Z Version      : 3.227.0
2026-10-30T13:28:28.7677616Z Author       : Microsoft Corporation
2026-10-30T13:28:28.7677698Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T13:28:28.7677770Z ==============================================================================
2026-10-30T13:28:28.9119801Z Generating script.
2026-10-30T13:28:28.9133360Z ========================== Starting Command Output ===========================
2026-10-30T13:28:28.9140268Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b5f592be-c848-428e-a445-b593810330de.sh
2026-10-30T13:28:28.9195848Z + shopt -s expand_aliases
2026-10-30T13:28:28.9196170Z + [[ -n okd4_nprd ]]
2026-10-30T13:28:28.9196436Z + [[ okd4_nprd =~ ocp ]]
2026-10-30T13:28:28.9196937Z + [[ -n okd4_nprd ]]
2026-10-30T13:28:28.9197152Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-30T13:28:28.9197423Z + app=siiso-bcadastro-backend-des
2026-10-30T13:28:28.9197623Z + oc version
2026-10-30T13:28:28.9865052Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-30T13:28:28.9865307Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-30T13:28:28.9865526Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-30T13:28:28.9901947Z ++ oc get pod -l name=siiso-bcadastro-backend-des -n siiso-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-30T13:28:28.9903533Z ++ tac
2026-10-30T13:28:28.9903703Z ++ grep -v '^$'
2026-10-30T13:28:28.9904741Z ++ head -n1
2026-10-30T13:28:29.0648777Z + last_pod=
2026-10-30T13:28:29.0677724Z ##[error]Bash exited with code '1'.
2026-10-30T13:28:29.0716710Z ##[section]Finishing: Logs da Aplicação

