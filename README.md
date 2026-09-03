0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/health@main
Logging image tag
0s
Aguardando processo de SYNC finalizar
0s
Run for i in {1..30}; do
  jq: parse error: Invalid numeric literal at line 1, column 4
  Error: Process completed with exit code 5.



/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: can not modify /etc/nginx/conf.d/default.conf (read-only file system?)
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up


pplication conditions
OrphanedResourceWarning
Application has 1 orphaned resources
17 hours ago (Wed Sep 02 2026 17:18:29 GMT-0300

sigex-frontend-painel-presi-gestao-infranprd/des
/values.yaml




caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigex/frontend-painel-presi-gestao/sigex-frontend-painel-presi-gestao
    tag: "33550508812"
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
        - "sigex-frontend-painel-presi-gestao.apl.des-nprd.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sigex-frontend-painel-presi-gestao-certificate # Nome do secret do certificado
      #  hosts:
      #    - sigex-frontend-painel-presi-gestao.des-nprd.caixa
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
    enabled: false
    useDefaults: false  
    livenessProbe: 
      initialDelaySeconds: 30
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /     
        port: 8080
#-------------#
#  CONFIGMAP  #
#-------------#
  configMapRefs:
    - name: cm-sigex-frontend-painel-presi-gestao
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
      value: "sitegestao"
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sigex-frontend-painel-presi-gestao@azurekeyvault


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigex-frontend-painel-presi-gestao
Repository navigation
Code
Issues
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
17
 (17)
Insights
Settings
Files
Go to file
t
T
src content loaded
.github/workflows
call-generic-qa-pipelines.yaml
call-generic-sec-pipelines.yaml
call-gsc-integration-generic-pipeline.yaml
doc
docs
mkdocs.yaml
src
app
environments
index.html
main.ts
styles.css
Dockerfile
README.md
angular.json
catalog-info.yaml
package.json
tsconfig.app.json
tsconfig.json
tsconfig.spec.json
sigex-frontend-painel-presi-gestao
/doc/
author
Automation Bot
PR automático
16d2d70
 · 
last week
Name	Last commit message	Last commit date
..
docs
PR automático
last week
mkdocs.yaml
PR automático
last week
 
src content loaded



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
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false
