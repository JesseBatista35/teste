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




      caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigos/backend-processamento-arquivos/sigos-backend-processamento-arquivos
    tag: "32857504712"
    pullPolicy: Always

#-----#
# HPA #
#-----#
  replicaCount: 1

  autoscaling:
    enabled: false
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
  istio:  
    - name: internal
      enabled: true
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "sigos-backend-processamento-arquivos.apl.tqs.private.azure"
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-sigos-backend-processamento-arquivos-tqs-caixa-certificate # Nome do secret do certificado
        hosts:
          - sigos-backend-processamento-arquivos.tqs.caixa
      prefix:
        - /
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
      initialDelaySeconds: 120
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 120
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /q/health/ready     
        port: 8080


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sigos-backend-processamento-arquivos-tqs
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"
    - key: "nuvem.caixa/nodepoolname"
      effect: "NoSchedule"
      operator: "Equal"
      value: "appmcmv"

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sigos-backend-processamento-arquivos@azurekeyvault
  env:
    - name: KEYCLOAKSECRET
      value: akvs-keycloak-secret-tqs@azurekeyvault
    - name: APIKEYCLIENTID
      value: akvs-api-key-client-id-tqs@azurekeyvault 
    - name: APIKEYCLIENTSECRET
      value: akvs-api-key-client-secret-tqs@azurekeyvault 
    - name: DBHOST 
      value: mssqlsrv-mcmv-nprd.database.windows.net 
    - name: DBPORT
      value: "1433" 
    - name: DBNAME 
      value: mssqldb-tqs-01-mcmv-nprd
    - name: DBUSER 
      value: azurelocaladmin
    - name: DBPASSWORD 
      value: akvs-mssqlsrv-sigos-tqs-key@azurekeyvault
    - name: STORAGECONNECTIONSTRING
      value: akvs-azure-storage-connection-string-tqs@azurekeyvault
