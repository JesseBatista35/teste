Estamos realizando o deploy em NPRD do repo https://github.com/caixagithub/sisva-transacional-frontend, porém o build está falhando com log "Unsupported cloud_provider".

Favor ajustar o GitOps para o deploy no recurso aks-aixa-des.

Em caso de dúvidas, favor contactar c141132 no Teams.


eu fiz o ajuste

app:
  name: sisva-frontend-transacional-frontend-des
project:
  name: des
labels:
  appName: sisva-frontend-transacional-frontend
  environment: des
source:
  repo: "https://github.com/caixagithub/sisva-frontend-transacional-frontend-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sisva-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-aixa-des
    namespace: sisva-frontend-transacional-frontend


    ==========================================


    porem aidna ta dano o mesmo erro

    Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisva-transacional-frontend
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/sisva-transacional-frontend_main_29512232770.6 #6
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 1 hour ago in 49s
Search logs
8s
0s
1s
12s
0s
0s
0s
18s
Creating a new builder instance
  /usr/bin/docker buildx create --name builder-a7d901fe-cf27-4966-90a0-c1f0f1e0e02d --driver docker-container --buildkitd-flags --allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host --use
  builder-a7d901fe-cf27-4966-90a0-c1f0f1e0e02d
Booting builder
Inspect builder
  {
    "nodes": [
      {
        "name": "builder-a7d901fe-cf27-4966-90a0-c1f0f1e0e02d0",
        "endpoint": "unix:///var/run/docker.sock",
        "status": "running",
        "buildkitd-flags": "--allow-insecure-entitlement security.insecure --allow-insecure-entitlement network.host",
        "buildkit": "v0.30.0",
        "platforms": "linux/amd64,linux/amd64/v2,linux/amd64/v3,linux/amd64/v4,linux/arm64,linux/riscv64,linux/ppc64le,linux/s390x,linux/386,linux/mips64le,linux/mips64,linux/loong64,linux/arm/v7,linux/arm/v6",
        "features": {
          "Automatically load images to the Docker Engine image store": true,
          "Cache export": true,
          "Direct push": true,
          "Docker exporter": true,
          "Multi-platform build": true,
          "OCI exporter": true
        },
        "labels": {
          "org.mobyproject.buildkit.worker.executor": "oci",
          "org.mobyproject.buildkit.worker.hostname": "53865ae070a1",
          "org.mobyproject.buildkit.worker.network": "host",
          "org.mobyproject.buildkit.worker.oci.process-mode": "sandbox",
          "org.mobyproject.buildkit.worker.selinux.enabled": "false",
          "org.mobyproject.buildkit.worker.snapshotter": "overlayfs"
        },
        "gcPolicy": [
          {
            "all": false,
            "filter": [
              "type==source.local",
              "type==exec.cachemount",
              "type==source.git.checkout"
            ],
            "keepDuration": "48h0m0s",
            "maxUsedSpace": "488.3MiB"
          },
          {
            "all": false,
            "keepDuration": "1440h0m0s",
            "reservedSpace": "9.313GiB",
            "maxUsedSpace": "93.13GiB",
            "minFreeSpace": "23.28GiB"
          },
          {
            "all": false,
            "reservedSpace": "9.313GiB",
            "maxUsedSpace": "93.13GiB",
            "minFreeSpace": "23.28GiB"
          },
          {
            "all": true,
            "reservedSpace": "9.313GiB",
            "maxUsedSpace": "93.13GiB",
            "minFreeSpace": "23.28GiB"
          }
        ]
      }
    ],
    "name": "builder-a7d901fe-cf27-4966-90a0-c1f0f1e0e02d",
    "driver": "docker-container",
    "lastActivity": "2026-07-16T15:42:15.000Z"
  }
BuildKit version
  builder-a7d901fe-cf27-4966-90a0-c1f0f1e0e02d0: v0.30.0
Run set -euo pipefail
  set -euo pipefail
  
  # Normalize image path (lowercase)
  REPO_PATH="$(echo "sisva/transacional-frontend/sisva-transacional-frontend" | tr '[:upper:]' '[:lower:]')"
  echo "image_dir=$REPO_PATH" >> "$GITHUB_OUTPUT"
  if [[ "" == "azure" ]]; then
    echo "Connecting to Azure Container Registry..."
    USERNAME="00000000-0000-0000-0000-000000000000"
  
    az login --identity --client-id "***" --output none
  
    TOKEN="$(az acr login \
0s
3s
0s
0s
1s
0s



==========================

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
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false




      # ============================================================================= #
#        CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW TESTES ESTATICOS v1.0           #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza o processo de análise estática do código através do Sonar,     #
# promovendo estabilidade e escalabilidade de forma mais segura e robusta.      #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: QA - Análise Estática de Código

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #
run-name: QUALIDADE-${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# pull_request      -> Executa automaticamente em pull_requests, de acordo com os filtros                                    #
# types             -> Filtro de execução. O workflow, no evento pull_request, será executado apenas nos estados aberto,     #
#                   -> sincronizado e reaberto                                                                               #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:
  pull_request:
    types:
      - opened
      - synchronize
      - reopened
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/quality-assurance.yml@main  -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  Solution-QA:
    name: QA
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/quality-assurance.yml@main
    secrets: inherit



# ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DO WORKFLOW DE SEGURANÇA v1.0          #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de segurança e gera insumos que auxiliam a equipe.   #
# O CodeQL atua em três vertentes:                                              #
# - Análise DAST do código                                                      #
# - Análise de vazamento de senhas                                              #
# - Análise de vulnerabilidates das dependências                                #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: Call CodeQL workflow Seguranca

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: Seguranca-${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
# pull_request      -> Executa automaticamente em pull_requests, de acordo com os filtros                                    #
# schedule          -> Executa o workflow automaticamente no horário definido pelo cron.                                     #
# cron              -> Define o horário de execução para toda a segunda 1:00 am UTC.                                         #
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
  pull_request:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'
  schedule:
    - cron: "0 1 * * 1"

# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: read         -> Permite ler os arquivos do repositório                                                             #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #

permissions:
  contents: read
  security-events: write
  actions: read
  packages: read

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CodeQL                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@main  -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# with: DINAMICALLY_CREATE_SETTINGS_XML: false ou true                                -> Habilita ou desabilita criação de settings.xml do maven via     #
#                                                                                        pipeline, necessário para repositórios Adapter com Java.        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  CodeQL:
    name: CodeQL
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/codeql-pipelines.yaml@main
    secrets: inherit

    
values.yaml


caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: registry/repo-app  ## Atualizados pela pipeline
    tag: "1.0.0" ## Atualizados pela pipeline
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
        targetPort: 80

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
        appgw.ingress.kubernetes.io/appgw-ssl-certificate: "sisva-transacional-des-caixa"
      rules:
        - host: "sisva-transacional.des.caixa"
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
        - host: "sisva-transacional-frontend.apl.des.private.azure"
          paths:
            - path: "/"
              targetPort: 80 

  istio:  
    - name: internal
      enabled: false
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "sisva-transacional-frontend.apl.des.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sisva-transacional-des-caixa-ssl-certificate
      #  hosts:
      #    - sisva-transacional.des.caixa
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
      initialDelaySeconds: 30
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /
        port: 80
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /
        port: 80


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sisva-transacional-frontend
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sisva-transacional-frontend@azurekeyvault

#-------------# 
#   VOLUME    # 
#-------------# 
# Volumes para configuração de ambiente
  volumes:
    - name: config-volume
      configMap:
          name: cm-sisva-transacional-frontend
          items:
            - key: config.js
              path: config.js

  volumeMounts:
    - name: config-volume
      mountPath: /usr/share/nginx/html/config.js
      subPath: config.js
      readOnly: true



