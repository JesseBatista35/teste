segue com ta DES

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
SIRCL-frontend
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
SIRCL

SIRCL-frontend
Cria_APP_OKD_ATUALIZA_VARIAVEIS
Task version
12.*
Display name
Cria_APP_OKD
AMBIENTE
$(AMBIENTE)
CGC_UNIDADE_DES
$(CGC_UNIDADE_DES)
CGC_UNIDADE_OPS
$(CGC_UNIDADE_OPS)
Enviroment
$(Enviroment)
is_new_app
$(is_new_app)
ISTIO_INJECTION
$(ISTIO_INJECTION)
KIND_DEPLOY
$(KIND_DEPLOY)
OCP_URL_SUFFIX
$(OCP_URL_SUFFIX)
OCP_URL_SUFFIX_PRD
$(OCP_URL_SUFFIX_PRD)
OKD_4_URL_SUFFIX
$(OKD_4_URL_SUFFIX)
OKD_4_URL_SUFFIX_APL
$(OKD_4_URL_SUFFIX_APL)
OKD_REGISTRY
$(OKD_REGISTRY)
OKD_TOKEN_REGISTRY
$(OKD_TOKEN_REGISTRY)
OKD_URL_SUFFIX
$(OKD_URL_SUFFIX)
OKD_URL_SUFFIX_APL
$(OKD_URL_SUFFIX_APL)
OKD_URL_SUFFIX_NPRDZ
$(OKD_URL_SUFFIX_NPRDZ)
OKD_USER_SERVICE_REGISTRY
$(OKD_USER_SERVICE_REGISTRY)
PASSWORD_CGC
$(PASSWORD_CGC)
PORTALIF
$(PORTALIF)
PROJETO
$(PROJETO)
REPOSITORIO
$(REPOSITORIO)
SITE
$(SITE)
TemplateRelease_OKD
$(TemplateRelease_OKD)
UNIDADE
$(UNIDADE)
USER_CGC
$(USER_CGC)
Control Options
Output Variables
Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Expanded

Collapsed

Collapsed

Showing 26 deployments

Showing 26 deployments

Row 2

EC TQSDeploy release

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Expanded

Collapsed

Expanded

Collapsed




DEU ERRO


2026-07-23T16:03:55.7868158Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-23T16:03:55.7873388Z ==============================================================================
2026-07-23T16:03:55.7873532Z Task         : Bash
2026-07-23T16:03:55.7873587Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T16:03:55.7873674Z Version      : 3.227.0
2026-07-23T16:03:55.7873740Z Author       : Microsoft Corporation
2026-07-23T16:03:55.7873806Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T16:03:55.7874058Z ==============================================================================
2026-07-23T16:03:55.9345993Z Generating script.
2026-07-23T16:03:55.9357791Z ========================== Starting Command Output ===========================
2026-07-23T16:03:55.9365180Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e1f57010-9b3e-409f-acc5-3722c014f26a.sh
2026-07-23T16:03:55.9419247Z OKD4 NPRD - des, tqs ou hmp
2026-07-23T16:03:55.9419628Z Nova APP: false
2026-07-23T16:03:56.2292003Z error: there is no need to specify a resource type as a separate argument when passing arguments in resource/name form (e.g. 'oc get resource/<resource_name>' instead of 'oc get resource resource/<resource_name>'
2026-07-23T16:03:56.2367664Z ##[error]Bash exited with code '1'.
2026-07-23T16:03:56.2385509Z ##[section]Finishing: Atualizando Variáveis de Ambiente




2026-07-23T16:03:56.2602037Z ##[section]Starting: Logs da Aplicação
2026-07-23T16:03:56.2606360Z ==============================================================================
2026-07-23T16:03:56.2606455Z Task         : Bash
2026-07-23T16:03:56.2606499Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T16:03:56.2606561Z Version      : 3.227.0
2026-07-23T16:03:56.2606612Z Author       : Microsoft Corporation
2026-07-23T16:03:56.2606661Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T16:03:56.2606742Z ==============================================================================
2026-07-23T16:03:56.3992581Z Generating script.
2026-07-23T16:03:56.4003778Z ========================== Starting Command Output ===========================
2026-07-23T16:03:56.4015375Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a44f9ce5-5354-46b9-8e6b-150d8712a4dd.sh
2026-07-23T16:03:56.4221465Z + shopt -s expand_aliases
2026-07-23T16:03:56.4221830Z + [[ -n okd4_nprd ]]
2026-07-23T16:03:56.4222350Z + [[ okd4_nprd =~ ocp ]]
2026-07-23T16:03:56.4222729Z + [[ -n okd4_nprd ]]
2026-07-23T16:03:56.4222841Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-23T16:03:56.4223001Z + app=sircl-frontend-tqs
2026-07-23T16:03:56.4223112Z + oc version
2026-07-23T16:03:56.4920460Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-23T16:03:56.4920738Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-23T16:03:56.4921036Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-23T16:03:56.4955027Z ++ oc get pod -l name=sircl-frontend-tqs -n sircl-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-23T16:03:56.4956027Z ++ tac
2026-07-23T16:03:56.4956427Z ++ grep -v '^$'
2026-07-23T16:03:56.4956533Z ++ head -n1
2026-07-23T16:03:56.5742468Z + last_pod=sircl-frontend-tqs-4-kfct5
2026-07-23T16:03:56.5742695Z + echo 'Logs do POD: sircl-frontend-tqs-4-kfct5'
2026-07-23T16:03:56.5742901Z + oc logs sircl-frontend-tqs-4-kfct5 -c sircl-frontend-tqs -n sircl-tqs
2026-07-23T16:03:56.5743111Z Logs do POD: sircl-frontend-tqs-4-kfct5
2026-07-23T16:03:56.6556823Z [23/Jul/2026:12:18:00 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1784819880.839 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
2026-07-23T16:03:56.6557374Z [23/Jul/2026:12:18:17 -0300] 25.0.12.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784819897.098 request_time 0.000 200 6331 - kube-probe/1.25 -
2026-07-23T16:03:56.6557768Z [23/Jul/2026:12:18:27 -0300] 25.0.12.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784819907.098 request_time 0.000 200 6331 - kube-probe/1.25 -
2026-07-23T16:03:56.6558106Z [23/Jul/2026:12:18:27 -0300] 25.0.12.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784819907.098 request_time 0.000 200 6331 - kube-probe/1.25 -
2026-07-23T16:03:56.6558504Z [23/Jul/2026:12:18:37 -0300] 25.0.12.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784819917.098 request_time 0.000 200 6331 - kube-probe/1.25 -
2026-07-23T16:03:56.6558844Z [23/Jul/2026:12:18:37 -0300] 25.0.12.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784819917.098 request_time 0.000 200 6331 - kube-probe/1.25 -
