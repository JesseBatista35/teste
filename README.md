Estou com erro na etapa de GET POD LOGS de falha de sincronismo:
"Script executado com sucesso!
Pod utilizado: siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m
Falha na sincronização"
run: https://github.com/caixagithub/siopi-backend-construcao-civil-pj/actions/runs/33010824411/job/98317596119




10m 3s
1s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Formate ARGO REPOSITORY
0s
Coletando logs dos pods
0s
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siopi-backend-construcao-civil-pj-des/resource-tree?appNamespace=openshift-gitops"
  Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siopi-backend-construcao-civil-pj-des/resource-tree?appNamespace=openshift-gitops
  Resource-tree obtido com sucesso
  Filtrando pods e encontrando o mais recente...
  Pod mais recente encontrado: siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m
  URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siopi-backend-construcao-civil-pj-des/logs?appNamespace=openshift-gitops&container=siopi-backend-construcao-civil-pj-des&namespace=siopi-backend-construcao-civil-pj&follow=false&podName=siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m&tailLines=1000&sinceSeconds=0
  Logs obtidos com sucesso
  Logs do pod siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m:
  ================================================
  Exibindo os Logs:
  
  ================================================
  Script executado com sucesso!
  Pod utilizado: siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m
  Falha na sincronização
  Error: Process completed with exit code 1.



Argo
v2.14.21+206a6ee
Argo
Applications
Settings
User Info
Documentation
Resource filters
NAME
NAME
KINDS
KINDS
SYNC STATUS
Synced
6
OutOfSync
0
HEALTH STATUS
Progressing
4
Suspended
0
Healthy
1
Degraded
1
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 siopi-backend-construcao-civil-pj-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (c94b432)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siopi-backen
LAST SYNC 

 Sync OK
to c94b432
Succeeded 18 hours ago (Wed Aug 26 2026 17:37:39 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siopi-backen
APP CONDITIONS
 1 Warning
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m
Pod
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Progressing  
ReplicaSet
rs
siopi-backend-construcao-civil-pj-des-69b6865b55
apps/ReplicaSet
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Progressing  
ConfigMap
cm
cm-siopi-backend-construcao-civil-pj
ConfigMap
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Synced
Endpoints
ep
siopi-backend-construcao-civil-pj-des
Endpoints
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
Pod
pod
siopi-backend-construcao-civil-pj-des-7dfc597d7f-qc2bw
Pod
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Progressing  
Secret
secret
akv2k8s-siopi-backend-construcao-civil-pj-des
Secret
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
Service
svc
siopi-backend-construcao-civil-pj-des
Service
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Healthy   Synced
Deployment
deploy
siopi-backend-construcao-civil-pj-des
apps/Deployment
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Degraded   Synced
ReplicaSet
rs
siopi-backend-construcao-civil-pj-des-7dfc597d7f
apps/ReplicaSet
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
 Progressing  
EndpointSlice
endpointslice
siopi-backend-construcao-civil-pj-des-bfggv
discovery.k8s.io/EndpointSlice
-
siopi-backend-construcao-civil-pj
18 hours ago   08/26/26
Previous12Next
Items per page: 10 

Podpod
siopi-backend-construcao-civil-pj-des-69b6865b55-4cn9m
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
NotTriggerScaleUp
pod didn't trigger scale-up: 9 node(s) had untolerated taint(s), 1 max node group size reached
5442
17h ago
Yesterday at 5:37 PM
2m ago
Today at 11:19 AM
FailedScheduling
0/17 nodes are available: 17 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/17 nodes are available: 17 Preemption is not helpful for scheduling.
11m ago
Today at 11:09 AM
11m ago
Today at 11:09 AM
FailedScheduling
0/17 nodes are available: 17 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/17 nodes are available: 17 Preemption is not helpful for scheduling.
17m ago
Today at 11:04 AM
17m ago
Today at 11:04 AM
NotTriggerScaleUp
pod didn't trigger scale-up: 1 max node group size reached, 9 node(s) had untolerated taint(s)
767
17h ago
Yesterday at 5:39 PM
27m ago
Today at 10:54 AM
NotTriggerScaleUp
pod didn't trigger scale-up: 1 not ready for scale-up, 8 node(s) had untolerated taint(s), 1 max node group size reached
7
14h ago
Yesterday at 8:41 PM
32m ago
Today at 10:49 AM
FailedScheduling
0/17 nodes are available: 17 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/17 nodes are available: 17 Preemption is not helpful for scheduling.
1h ago
Today at 9:48 AM
1h ago
Today at 9:48 AM

siopi-backend-construcao-civil-pj-infranprd/des/templates
/akvs-siopi-backend-construcao-civil-pj.yaml




apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siopi-backend-construcao-civil-pj
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: <NOME_DO_KEYVAULT>
    object:
      name: siopi-backend-construcao-civil-pj
      type: secret
  output: 
    secret:
      name: akvs-siopi-backend-construcao-civil-pj
      type: kubernetes.io/tls


siopi-backend-construcao-civil-pj/.github/workflows
/call-generic-pipelines.yaml



siopi-backend-construcao-civil-pj/.github/workflows
/call-generic-pipelines.yaml



# ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW CI/CD v1.0                 #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de integração contínua (CI) e entrega contínua (CD), #
# promovendo segurança, padronização e eficiência no ciclo de desenvolvimento.  #
# Todas as alterações devem ser realizadas por meio do Fusionx                  #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: CI/CD Workflow Generic

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'


# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: write        -> Permite escrever nos arquivos do repositório                                                       #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
# issues: write          -> Permite criar/editar issues                                                                        #
# pull-requests: write   -> Permite criar/editar pull requests                                                                 #
# pull-requests: write   -> Permite gerar token oidc do github                                                                 #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #

permissions:
  contents: write
  security-events: write
  packages: read
  actions: read
  issues: write
  pull-requests: write
  id-token: write

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# IMPORT_APIM: false                                                                  -> Desativa importação automática de APIs no Azure API Management. #
#                                                                                     -> Possíveis valores: true ou false                                #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  CI_DES:
    if: github.ref_name == 'develop'
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false

  CI_PRD:
    if: github.ref_name == 'main'
    name: CI_PRD
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES","PRD"]'
      IMPORT_APIM: false      
      



# ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW CI/CD v1.0                 #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de integração contínua (CI) e entrega contínua (CD), #
# promovendo segurança, padronização e eficiência no ciclo de desenvolvimento.  #
# Todas as alterações devem ser realizadas por meio do Fusionx                  #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: CI/CD Workflow Generic

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'


# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: write        -> Permite escrever nos arquivos do repositório                                                       #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
# issues: write          -> Permite criar/editar issues                                                                        #
# pull-requests: write   -> Permite criar/editar pull requests                                                                 #
# pull-requests: write   -> Permite gerar token oidc do github                                                                 #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #

permissions:
  contents: write
  security-events: write
  packages: read
  actions: read
  issues: write
  pull-requests: write
  id-token: write

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# IMPORT_APIM: false                                                                  -> Desativa importação automática de APIs no Azure API Management. #
#                                                                                     -> Possíveis valores: true ou false                                #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  CI_DES:
    if: github.ref_name == 'develop'
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false

  CI_PRD:
    if: github.ref_name == 'main'
    name: CI_PRD
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES","PRD"]'
      IMPORT_APIM: false      
