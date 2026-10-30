Resolver erro na release de criação do NFS, módulo siiso-bcadastro-backend-des do SICLIno OKD, conforme detalhamento na REQ.


2026-10-30T13:20:31.4660105Z ##[section]Starting: Criando Persistente Volume
2026-10-30T13:20:31.4663801Z ==============================================================================
2026-10-30T13:20:31.4663884Z Task         : Bash
2026-10-30T13:20:31.4663930Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T13:20:31.4664029Z Version      : 3.227.0
2026-10-30T13:20:31.4664073Z Author       : Microsoft Corporation
2026-10-30T13:20:31.4664125Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T13:20:31.4664235Z ==============================================================================
2026-10-30T13:20:31.6313391Z Generating script.
2026-10-30T13:20:31.6324620Z ========================== Starting Command Output ===========================
2026-10-30T13:20:31.6331764Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/836330af-134e-418f-807a-aadfb063c004.sh
2026-10-30T13:20:31.7129337Z Error from server (NotFound): persistentvolumes "siiso-bcadastro-backend-data-des" not found
2026-10-30T13:20:31.7905534Z The PersistentVolume "siiso-bcadastro-backend-data-des" is invalid: 
2026-10-30T13:20:31.7905868Z * spec.capacity[storage]: Invalid value: "0": must be greater than zero
2026-10-30T13:20:31.7906035Z * spec.nfs.server: Required value
2026-10-30T13:20:31.7906182Z * spec.nfs.path: Required value
2026-10-30T13:20:31.7906337Z * spec.nfs.path: Invalid value: "": must be an absolute path
2026-10-30T13:20:31.7973420Z ##[error]Bash exited with code '1'.
2026-10-30T13:20:31.8009731Z ##[section]Finishing: Criando Persistente Volume


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
/
SIISO-bcadastro-backend-20261029.1739-1.0.0-SNAPSHOT(4)
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
SIISO-bcadastro-backend

SIISO-bcadastro-backend-20261029.1739-1.0.0-SNAPSHOT(4)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
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
SIISO-BCADASTRO-BACKEND-DES (15)
Grupo de variáveis de SIISO-BCADASTRO-BACKEND-DES
Scopes: EC DES
PASSDB
********
_ENV.CRON_EXPR
"0 * * * * ?"
_ENV.NFS_DESTINO
/siiso
_ENV.NFS_PATH
/fs_siiso
_ENV.NFS_SERVER
nprdnfs01.ad.caixa
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
_ENV.SIZE_VOLUME
20G
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

