mais ele nem ta cirando aqui no argo

Applications
 siacx-chatcaixa-frontend-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (a53fa40)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #39 from caixagithub/update-image-siacx-chatc
LAST SYNC 

 Sync OK
to a53fa40
Succeeded 4 days ago (Fri Jun 19 2026 12:39:56 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #39 from caixagithub/update-image-siacx-chatc
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
siacx-chatcaixa-frontend-des-5fb549c966-76qfh
Pod
-
siacx-chatcaixa-frontend
17 hours ago   06/22/26
 Healthy  
ReplicaSet
rs
siacx-chatcaixa-frontend-des-5fb549c966
apps/ReplicaSet
-
siacx-chatcaixa-frontend
4 days ago   06/19/26
 Healthy  
ReplicaSet
rs
siacx-chatcaixa-frontend-des-79db459785
apps/ReplicaSet
-
siacx-chatcaixa-frontend
6 days ago   06/17/26
 Healthy  
ReplicaSet
rs
siacx-chatcaixa-frontend-des-657bb47d74
apps/ReplicaSet
-
siacx-chatcaixa-frontend
21 days ago   06/02/26
 Healthy  
ReplicaSet
rs
siacx-chatcaixa-frontend-des-768f7784b4
apps/ReplicaSet
-
siacx-chatcaixa-frontend
22 days ago   06/01/26
 Healthy  
Endpoints
ep
siacx-chatcaixa-frontend-des
Endpoints
-
siacx-chatcaixa-frontend
9 months ago   10/07/25
Secret
secret
akv2k8s-siacx-chatcaixa-frontend-des
Secret
-
siacx-chatcaixa-frontend
9 months ago   10/07/25
Service
svc
siacx-chatcaixa-frontend-des
Service
-
siacx-chatcaixa-frontend
9 months ago   10/07/25
 Healthy   Synced
Deployment
deploy
siacx-chatcaixa-frontend-des
apps/Deployment
-
siacx-chatcaixa-frontend
9 months ago   10/07/25
 Healthy   Synced
ConfigMap
cm
cm-siacx-chatcaixa-frontend
ConfigMap
-
siacx-chatcaixa-frontend
9 months ago   10/07/25



GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
gitops
Repository navigation
Code
Issues
Pull requests
8
 (8)
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
Files
siacx-chat
des content loaded
apps
06052026-teste-ativar-ambiente
aplicacao-teste/plt
coe-java-api/des
demo-sd195-backend-04052026-teste-jornada-dep
demo-sd603-sd603-frontend
devsecops-webhooks
sample-quarkus-aks/des
siaad-teste-140042026
siaad-teste-prd-pipelineagil-20260401-03
siaad-teste-prd-pipelineagil-20260401-04
siaad-us86163-output-new-repo-1
siaad-us86163-output-new-repo-2
siaad-us86163-output-playbook-1
siaas-lib-teste-qualquer-21
siabm-cadastro-kit-bio-api/des
siabm-doc-teste-de-criacao
siabm-matcher-facial/des
siabm-teste-60
siacc-demo
siaci-api-manual
siaci-componentes-net/des
siaci-frontend-manual
siaci-lib-mainframe
siacx-backend-bd-neo4j-grafos-conhecimento
siacx-backend-chatcaixa-agents365/des
siacx-backend-curadoria
siacx-chatcaixa-frontend
siacx-chatcaixa-mcp-server
des
config.yaml
hmp
tqs
tst
siacx-chatcaixa-orquestrador
siacx-frontend-curadoria
siacx-motor-indexacao
siacx-plataforma-apis
siacx-plataforma-backend
siacx-plataforma-frontend
siacx-sonar-mcp-server




app:
  name: siacx-chatcaixa-mcp-server-des
project:
  name: des
labels:
  appName: siacx-chatcaixa-mcp-server
  environment: des
source:
  repo: "https://github.com/caixagithub/siacx-chatcaixa-mcp-server-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/siacx-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-siacx-nprd
    namespace: siacx-chatcaixa-mcp-server






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

run-name: __.

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
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false



      GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siacx-chatcaixa-mcp-server-infranprd
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
templates content loaded
des
templates
akvs-aiser-siacx-des-api-key.yml
akvs-ass-siacx-des-admin-key.yml
akvs-siacx-chatcaixa-mcp-server.yaml
cm-siacx-chatcaixa-mcp-server.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
tst


caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicacao
    repository: acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server
    tag: "27973734275"
    pullPolicy: Always

#-----#
# HPA #
#-----#
  replicaCount: 1

  autoscaling:
    enabled: disabled
    minReplicas: 1
    maxReplicas: 3
    targetCPUUtilizationPercentage: 85
    targetMemoryUtilizationPercentage: 85

#-----------------#
# ROLLING UPDATE STRATEGY #
#-----------------#

  strategy:
    maxSurge: 25%
    maxUnavailable: 50%


#-----------#
#  SERVICE  #
#-----------#
  
  service:
    type: "ClusterIP"
    ports:
      - name: "port"
        protocol: TCP
        port: 80
        targetPort: 8080

#---------#
# INGRESS #
#---------#
  ingress:

    - name: custom
      enabled: true
      className: "azure-application-gateway"
      annotations:
        appgw.ingress.kubernetes.io/backend-path-prefix: "/"
        appgw.ingress.kubernetes.io/backend-protocol: "http"
        appgw.ingress.kubernetes.io/request-timeout: "60"
        appgw.ingress.kubernetes.io/ssl-redirect: "true"
        appgw.ingress.kubernetes.io/connection-draining: "true"
        appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
        appgw.ingress.kubernetes.io/use-private-ip: "true"
        appgw.ingress.kubernetes.io/appgw-ssl-certificate: "api-chat-mcp-server-des-caixa"
      rules:
        - host: "api.chat-mcp-server.des.caixa"
          paths:
            - path: "/"
              targetPort: 80

    - name: internal
      enabled: true
      className: "azure-application-gateway"
      annotations:
        appgw.ingress.kubernetes.io/backend-path-prefix: "/"
        appgw.ingress.kubernetes.io/backend-protocol: "http"
        appgw.ingress.kubernetes.io/request-timeout: "60"
        appgw.ingress.kubernetes.io/ssl-redirect: "false"
        appgw.ingress.kubernetes.io/connection-draining: "true"
        appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
        appgw.ingress.kubernetes.io/use-private-ip: "true"
      rules:
        # variavel do nome do projeto
        - host: "siacx-chatcaixa-mcp-server.apl.des.private.azure"
          paths:
            - path: "/"
              targetPort: 80
  
#-------------#
#  RESOURCES  #
#-------------#

  resources:
    requests:
      cpu: 250m
      memory: 256Mi
    limits:
      cpu: 500m
      memory: 512Mi


#----------#
#  PROBES  #
#----------#

  probes:
    enabled: true  
    useDefaults: false  
    livenessProbe: 
      initialDelaySeconds: 30
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /healthz
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /healthz
        port: 8080


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-siacx-chatcaixa-mcp-server


#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"
    # - key: "nuvem.caixa/nodepoolname"
    #   effect: "NoSchedule"
    #   operator: "Equal"
    #   value: "workloads"

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
  env:
    - name: AZURE_AI_SERVICES_KEY
      value: akvs-aiser-siacx-des-api-key@azurekeyvault

    - name: COGNITIVE_SEARCH_API_KEY
      value: akvs-ass-siacx-des-admin-key@azurekeyvault


      apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-aiser-siacx-des-api-key
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-siacx-des
    object:
      name: SIACX-BACKEND-ENV-DES--AISER-SIACX-DES-API-KEY
      type: secret



      apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siacx-chatcaixa-mcp-server
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  AZURE_AI_SERVICES_ENDPOINT: "https://aiser-siacx-des.cognitiveservices.azure.com/"
  AZURE_OPENAI_API_VERSION: "2024-12-01-preview"
  AZURE_OPENAI_EMBEDDINGS_DEPLOYMENT_NAME: "text-embedding-3-large"
  COGNITIVE_SEARCH_ENDPOINT: "https://ass-siacx-des.search.windows.net"
  COGNITIVE_SEARCH_INDEX_NAME: "siacx-index-chatcaixa-graph"
  SCORE_THRESHOLD: "2.09"
  HOST: "0.0.0.0"
  PORT: "8080"



  no microsof azure o aks-siacx-nprd não está cirado


  
Total de clusters:
108 clusters
1 frotas
·
0 namespaces gerenciados
Navegar pelos inícios rápidos
Gerencie, dimensione e execute operações em clusters do AKS ou AKS Automático sem esforço em um só lugar para aproveitar implantações mais simplificadas e seguras. Crie facilmente novos clusters, adicione-os a uma Frota, exiba o uso e os estados de energia e solucione problemas proativamente. Saiba mais

aks-siacx-nprd







Nenhum Serviços do Kubernetes corresponde aos seus filtros
Use o Serviço do Kubernetes do Azure para criar e gerenciar clusters do Kubernetes. O Azure manipulará as operações de cluster, incluindo criação, dimensionamento e atualização, liberando os desenvolvedores para concentrar-se em seus aplicativos. Para começar, crie um cluster com o Serviço de Kubernetes do Azure.
Saiba mais
0 resultados encontrados
Mostrando 1 - 0 de 0. Contagem de exibição:
