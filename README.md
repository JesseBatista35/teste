Eu estou tendo o seguinte erro ao fazer o deploy do projeto SIGEC-com-frontend para o ambiente DES, existe algo que eu possa fazer para corrigí-lo?

2026-09-30T17:26:09.2556230Z ##[section]Starting: Verificando Status do Deployment
2026-09-30T17:26:09.2560908Z ==============================================================================
2026-09-30T17:26:09.2561040Z Task         : Bash
2026-09-30T17:26:09.2561129Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T17:26:09.2561223Z Version      : 3.227.0
2026-09-30T17:26:09.2561300Z Author       : Microsoft Corporation
2026-09-30T17:26:09.2561376Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T17:26:09.2561482Z ==============================================================================
2026-09-30T17:26:09.3938883Z Generating script.
2026-09-30T17:26:09.3951945Z ========================== Starting Command Output ===========================
2026-09-30T17:26:09.3958473Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d6d13e4b-3fe4-4fe9-af0f-b25565fbd578.sh
2026-09-30T17:26:09.5848361Z Waiting for rollout to finish: 0 out of 5 new replicas have been updated...
2026-09-30T17:26:12.5421246Z Waiting for rollout to finish: 0 out of 5 new replicas have been updated...
2026-09-30T17:26:12.8858683Z Waiting for rollout to finish: 2 out of 5 new replicas have been updated...
2026-09-30T17:26:14.6283472Z Waiting for rollout to finish: 2 out of 5 new replicas have been updated...
2026-09-30T17:26:14.7877805Z Waiting for rollout to finish: 2 out of 5 new replicas have been updated...
2026-09-30T17:26:15.7943143Z Waiting for rollout to finish: 2 out of 5 new replicas have been updated...
2026-09-30T17:26:16.1468079Z Waiting for rollout to finish: 3 out of 5 new replicas have been updated...
2026-09-30T17:32:16.7656473Z ##[error]The task has timed out.
2026-09-30T17:32:16.7657985Z ##[section]Finishing: Verificando Status do Deployment

Os pods antigos não são encerrados e os novos não são criados

2026-09-30T17:32:16.7676467Z ##[section]Starting: Logs da Aplicação
2026-09-30T17:32:16.7679403Z ==============================================================================
2026-09-30T17:32:16.7679480Z Task         : Bash
2026-09-30T17:32:16.7679698Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T17:32:16.7679761Z Version      : 3.227.0
2026-09-30T17:32:16.7679804Z Author       : Microsoft Corporation
2026-09-30T17:32:16.7679860Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T17:32:16.7679945Z ==============================================================================
2026-09-30T17:32:17.0683019Z Generating script.
2026-09-30T17:32:17.0683878Z ========================== Starting Command Output ===========================
2026-09-30T17:32:17.0685225Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d3f8858e-a9a1-4f06-b49d-2a64d4ba0ad9.sh
2026-09-30T17:32:17.0685415Z + shopt -s expand_aliases
2026-09-30T17:32:17.0685545Z + [[ -n okd4_nprd ]]
2026-09-30T17:32:17.0685702Z + [[ okd4_nprd =~ ocp ]]
2026-09-30T17:32:17.0685832Z + [[ -n okd4_nprd ]]
2026-09-30T17:32:17.0685940Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-30T17:32:17.0686094Z + app=sigec-com-frontend-des
2026-09-30T17:32:17.0686188Z + oc version
2026-09-30T17:32:17.0686349Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-30T17:32:17.0686529Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-30T17:32:17.0686700Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-30T17:32:17.0687336Z ++ oc get pod -l name=sigec-com-frontend-des -n sigec-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-30T17:32:17.0687491Z ++ tac
2026-09-30T17:32:17.0687614Z ++ grep -v '^$'
2026-09-30T17:32:17.0687700Z ++ head -n1
2026-09-30T17:32:17.1020677Z + last_pod=sigec-com-frontend-des-15-8fsjx
2026-09-30T17:32:17.1021045Z + echo 'Logs do POD: sigec-com-frontend-des-15-8fsjx'
2026-09-30T17:32:17.1021265Z + oc logs sigec-com-frontend-des-15-8fsjx -c sigec-com-frontend-des -n sigec-des
2026-09-30T17:32:17.1021470Z Logs do POD: sigec-com-frontend-des-15-8fsjx
2026-09-30T17:32:17.1837321Z 2026/09/30 14:31:46 [error] 17#0: *1 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1837818Z [30/Sep/2026:14:31:46 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789506.239 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1838183Z 2026/09/30 14:31:56 [error] 17#0: *3 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1838541Z [30/Sep/2026:14:31:56 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789516.239 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1838870Z 2026/09/30 14:31:56 [error] 17#0: *2 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1839218Z [30/Sep/2026:14:31:56 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789516.239 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1839650Z 2026/09/30 14:32:06 [error] 17#0: *5 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1839994Z [30/Sep/2026:14:32:06 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789526.238 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1840327Z 2026/09/30 14:32:06 [error] 17#0: *4 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1840656Z [30/Sep/2026:14:32:06 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789526.238 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1841341Z 2026/09/30 14:32:06 [error] 17#0: *6 directory index of "/opt/app-root/src/" is forbidden, client: 25.2.40.1, server: _, request: "GET / HTTP/1.1", host: "25.2.41.4:8080"
2026-09-30T17:32:17.1841670Z [30/Sep/2026:14:32:06 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1790789526.239 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-30T17:32:17.1925491Z ##[section]Finishing: Logs da Aplicação



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
SIGEC-com-frontend
/
SIGEC-com-frontend-1.0.0-SNAPSHOT(12)
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
SIGEC-com-frontend

SIGEC-com-frontend-1.0.0-SNAPSHOT(12)
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
Usuario-Azure-DevOps (12)
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: Release
OKD-4-APL (12)
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SIGEC-COM-FRONTEND-DES (4)
Grupo de variáveis de SIGEC-COM-FRONTEND-DES
Scopes: EC DES
HTTP_SERVICE_API
https://google.com
INIT
Criado via api
_ENV.URL_API
_ENV.URL_SSO
SIGEC-COM-FRONTEND-TQS (4)
Grupo de variáveis de SIGEC-COM-FRONTEND-TQS
Scopes: EC TQS
SIGEC-COM-FRONTEND-HMP (1)
Grupo de variáveis de SIGEC-COM-FRONTEND-HMP
Scopes: EC HMP
SIGEC-COM-FRONTEND-PRD (1)
Grupo de variáveis de SIGEC-COM-FRONTEND-PRD
Scopes: EC PRD
Expanded

Collapsed

Collapsed

Expanded

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2


