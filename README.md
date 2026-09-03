sigex-frontend-painel-presi-gestao/.github/workflows
/call-gsc-integration-generic-pipeline.yaml


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


sigex-frontend-painel-presi-gestao-infranprd/des/templates
/cm-sigex-frontend-painel-presi-gestao.yaml



      apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sigex-frontend-painel-presi-gestao
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"


sigex-frontend-painel-presi-gestao-infranprd/des/templates
/akvs-sigex-frontend-painel-presi-gestao.yaml


apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sigex-frontend-painel-presi-gestao
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: <NOME_DO_KEYVAULT>
    object:
      name: sigex-frontend-painel-presi-gestao
      type: secret
  output: 
    secret:
      name: akvs-sigex-frontend-painel-presi-gestao
      type: kubernetes.io/tls




      Filtrar por namespace
kubernetes
default
OK
ClusterIP
10.245.0.1
443/TCP
377 dias
kube-dns
kube-system
OK
ClusterIP
10.245.0.10
53/UDP,53/TCP
377 dias
metrics-server
kube-system
OK
ClusterIP
10.245.2.232
443/TCP
377 dias
gatekeeper-webhook-service
gatekeeper-system
OK
ClusterIP
10.245.1.248
443/TCP
377 dias
azure-policy-webhook-service
kube-system
OK
ClusterIP
10.245.1.233
443/TCP
377 dias
ama-metrics-ksm
kube-system
OK
ClusterIP
10.245.0.169
8080/TCP
377 dias
ama-metrics-operator-targets
kube-system
OK
ClusterIP
10.245.0.136
80/TCP,443/TCP
377 dias
network-observability
kube-system
OK
ClusterIP
10.245.1.29
10093/TCP
377 dias
aks-istio-ingressgateway-external
aks-istio-ingress
OK
LoadBalancer
10.245.3.148
4.228.121.77
15021:31171/TCP,80:30649/TCP,443:32192/TCP
377 dias
aks-istio-ingressgateway-internal
aks-istio-ingress
OK
LoadBalancer
10.245.0.205
10.245.188.6
15021:31999/TCP,80:31227/TCP,443:31973/TCP
377 dias
externaldns-external-dns
external-dns
OK
ClusterIP
10.245.3.17
7979/TCP
331 dias
akv2k8s-controller
akv2k8s
OK
ClusterIP
10.245.0.210
9000/TCP
331 dias
akv2k8s-envinjector
akv2k8s
OK
ClusterIP
10.245.1.94
443/TCP,80/TCP,9443/TCP
331 dias
sigex-frontend-painel-presi-des
sigex-frontend-painel-presi
OK
ClusterIP
10.245.3.204
80/TCP
310 dias
sigex-api-painel-presi-des
sigex-api-painel-presi
OK
ClusterIP
10.245.3.53
80/TCP
259 dias
sigex-frontend-painel-presi-v2-des
sigex-frontend-painel-presi-v2
OK
ClusterIP
10.245.3.229
80/TCP
205 dias
istiod-asm-1-29
aks-istio-system
OK
ClusterIP
10.245.3.152
15010/TCP,15012/TCP,443/TCP,15014/TCP
92 dias
sigex-frontend-painel-presi-gestao-des
sigex-frontend-painel-presi-gestao
OK
ClusterIP
10.245.2.144
80/TCP
17 horas


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
  
