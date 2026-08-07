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
SIGSJ-frontend-okd4-11
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
SIGSJ

SIGSJ-frontend-okd4-11
Predefined variables
Filter by keywords
Scope


AMBIENTE
des
AMBIENTE
tqs

AMBIENTE
hmp
AMBIENTE
prd
AMBIENTE_BUILD
build-images-ads
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
fortify_disable
false
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
prd
SISTEMANOME
sigsj-frontend-11
SITE
okd4_nprd
SITE
okd4_nprd
SITE
okd4_nprd
SITE
okd4_prd
TemplateRelease_OKD
openshift/angular-caixa-release
UNIDADE
BR
URL_CUSTOMIZADA
novodepositojudicial.caixa.gov.br
Row 2

Showing filters 1 through 2


<img width="1606" height="884" alt="image" src="https://github.com/user-attachments/assets/f7f3c9a4-bbd9-424d-9f41-e2dde749198d" />


ja troquei e o erro continua

2026-08-07T12:50:25.1706302Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-08-07T12:50:25.1709381Z ==============================================================================
2026-08-07T12:50:25.1709469Z Task         : Bash
2026-08-07T12:50:25.1709511Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T12:50:25.1709571Z Version      : 3.227.0
2026-08-07T12:50:25.1709622Z Author       : Microsoft Corporation
2026-08-07T12:50:25.1709670Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T12:50:25.1709735Z ==============================================================================
2026-08-07T12:50:26.0470772Z Generating script.
2026-08-07T12:50:26.0478751Z Script contents:
2026-08-07T12:50:26.0479525Z oc create configmap nginx-conf-d-sigsj-frontend-11  --from-file="/opt/ads-agent/_work/r12889/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf" -n sigsj-des
2026-08-07T12:50:26.0483654Z ========================== Starting Command Output ===========================
2026-08-07T12:50:26.0490805Z [command]/bin/bash /opt/ads-agent/_work/_temp/01c24e8f-d334-408c-a959-0d2c5efb4108.sh
2026-08-07T12:50:26.1186777Z error: error reading /opt/ads-agent/_work/r12889/a/_SIGSJ-frontend-11-config/sigsj-nginx.conf: no such file or directory
2026-08-07T12:50:26.1245047Z ##[error]Bash exited with code '1'.
2026-08-07T12:50:26.1253660Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d


2026-08-07T12:50:26.1450553Z ##[section]Starting: Logs da Aplicação
2026-08-07T12:50:26.1453466Z ==============================================================================
2026-08-07T12:50:26.1453544Z Task         : Bash
2026-08-07T12:50:26.1453596Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T12:50:26.1453656Z Version      : 3.227.0
2026-08-07T12:50:26.1453698Z Author       : Microsoft Corporation
2026-08-07T12:50:26.1453763Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T12:50:26.1453832Z ==============================================================================
2026-08-07T12:50:27.0745493Z Generating script.
2026-08-07T12:50:27.0755856Z ========================== Starting Command Output ===========================
2026-08-07T12:50:27.0763204Z [command]/bin/bash /opt/ads-agent/_work/_temp/0354b53a-d281-4080-9144-0059ff3da2ba.sh
2026-08-07T12:50:27.0810647Z + shopt -s expand_aliases
2026-08-07T12:50:27.0811977Z + [[ -n okd4_nprd ]]
2026-08-07T12:50:27.0812181Z + [[ okd4_nprd =~ ocp ]]
2026-08-07T12:50:27.0812315Z + [[ -n okd4_nprd ]]
2026-08-07T12:50:27.0812421Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-07T12:50:27.0812574Z + app=sigsj-frontend-11-des
2026-08-07T12:50:27.0812669Z + oc version
2026-08-07T12:50:27.1601023Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-08-07T12:50:27.1601202Z Kustomize Version: v4.5.7
2026-08-07T12:50:27.1601392Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-07T12:50:27.1601582Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-07T12:50:27.1627658Z ++ oc get pod -l name=sigsj-frontend-11-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-07T12:50:27.1630460Z ++ tac
2026-08-07T12:50:27.1630723Z ++ grep -v '^$'
2026-08-07T12:50:27.1630823Z ++ head -n1
2026-08-07T12:50:27.2539168Z + last_pod=
2026-08-07T12:50:27.2570349Z ##[error]Bash exited with code '1'.
2026-08-07T12:50:27.2588722Z ##[section]Finishing: Logs da Aplicação


acho que isso é no okd. entrei aqui e  vi que tem o deploymentconfig do 

sigsj-frontend-11-des


so que olha o configmaps

OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sigsj-des
ConfigMaps

Name
Search by name...
/

Name

Size

Created
ConfigMap
CM
nginx-conf-d-sigsj-frontend-sandbox
1	
27 de fev. de 2026, 09:33

ConfigMap
CM
nginx-conf-d-sigsj-plataforma-microfront
1	
8 de jun. de 2026, 10:40

ConfigMap
CM
openshift-service-ca.crt
1	
16 de nov. de 2023, 10:55

ConfigMap
CM
sigsj-alvara-des-script-bt-check
1	
22 de dez. de 2025, 10:49

ConfigMap
CM
sigsj-alvara-sandbox-des-script-bt-check
1	
8 de jan. de 2026, 11:50

ConfigMap
CM
sigsj-backend-area-cliente-des-script-bt-check
1	
8 de jan. de 2026, 17:13

ConfigMap
CM
sigsj-backend-area-gestora-des-script-bt-check
1	
22 de dez. de 2025, 14:20

ConfigMap
CM
sigsj-backend-privado-des-script-bt-check
1	
26 de jan. de 2026, 13:58

ConfigMap
CM
sigsj-backend-publico-des-script-bt-check
1	
31 de dez. de 2025, 10:33

ConfigMap
CM
sigsj-backend-publico-rc-des-script-bt-check
1	
25 de jun. de 2026, 21:06

ConfigMap
CM
sigsj-convivencia-des-script-bt-check
1	
26 de dez. de 2025, 11:37

ConfigMap
CM
sigsj-deposito-des-script-bt-check
1	
22 de dez. de 2025, 09:15

ConfigMap
CM
sigsj-deposito-rc-des-script-bt-check
1	
26 de jun. de 2026, 14:23

ConfigMap
CM
sigsj-deposito-sandbox-des-script-bt-check
1	
7 de jan. de 2026, 11:07

ConfigMap
CM
sigsj-destinacao-des-script-bt-check
1	
15 de jan. de 2026, 11:25

ConfigMap
CM
sigsj-notificacao-des-script-bt-check
1	
30 de dez. de 2025, 14:24

ConfigMap
CM
sigsj-saldo-des-script-bt-check
1	
27 de out. de 2025, 14:37

ConfigMap
CM
sigsj-saldo-sandbox-des-script-bt-check
1	
19 de fev. de 2026, 12:31



