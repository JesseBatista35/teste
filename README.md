# ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DO WORKFLOW DE APIM v1.0               #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza o processo de importação de uma API para o APIM da Azure.      #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: APIM Workflow

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: APIM_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: Generic-Solution                                                              -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-apim.yaml@main      -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# APIM_TYPE: "BASIC"                                                                  -> Habilita a configuração básica de políticas no APIM             #
#                                                                                     -> Possíveis valores: "BASIC" ou "FULL".                           #
#                                                                                     -> Todas as variáveis precisam estar configuradas no Github.       #
#                                                                                     -> A versão FULL permite configurar as seguintes variáveis:        #
#                                                                                     -> APIM_VERSIONAPI                                                 #
#                                                                                     -> APIM_displaynameAPI                                             #
#                                                                                     -> APIM_PATH                                                       #
#                                                                                     -> APIM_SWAGGERPATH                                                #
#                                                                                     -> APIM_TAGSAPI                                                    #
#                                                                                     -> APIM_POLICIESALLOPERATIONSPATH                                  #
#                                                                                     -> APIM_POLICIESBYENDPOINTPATH                                     #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
   Generic-Solution:
      name: API Management
      uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-apim.yaml@main
      secrets: inherit
      with:
        DEPLOY_ENVIRONMENTS: '["DES", "PRD"]'
        APIM_TYPE: "BASIC"




sirmc-api-emailmarketing-rastreamento-infranprd/des
/values.yaml






        caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sirmc/api-emailmarketing-rastreamento/sirmc-api-emailmarketing-rastreamento
    tag: "30355230575"
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
            - sirmc-api-emailmarketing-rastreamento.apl.des.private.azure
        - port:
            number: 443
            name: https-custom
            protocol: HTTPS
          tls:
            mode: SIMPLE
            credentialName: akvs-sirmc-api-emailmarketing-rastreamento-des-caixa-certificate
          hosts:
            - rastreador.des.caixa
      prefix:
        - /
      targetPort: 80
  
#-------------#
#  RESOURCES  #
#-------------#

  resources:
    requests:
      cpu: 500m
      memory: 512Mi
    limits:
      cpu: 1000m
      memory: 1024Mi


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
    - name: cm-sirmc-api-emailmarketing-rastreamento

    
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
      value: "sitesirmc"


#-------------# 
#   SECRETS   # 
#-------------# 

  secretRefs:
  env:
    - name: ApplicationInsights__ConnectionString
      value: akvs-applicationinsightsconnectionstring@azurekeyvault
    - name: ConnectionStrings__EventHub
      value: akvs-emailmarketingeventhubconnectionstring@azurekeyvault
    - name: ConnectionStrings__Redis
      value: akvs-redisconnectionstring@azurekeyvault
    - name: Database__Password
      value: akvs-sqlserverscrmbp01password@azurekeyvault



apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-applicationinsightsconnectionstring
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: shared-applicationinsights-connectionstring
      type: secret





      apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-emailmarketingeventhubconnectionstring
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: app-emailmarketing-eventhub-connectionstring
      type: secret


apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-redisconnectionstring
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: shared-redis-connectionstring
      type: secret



      apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sirmc-api-emailmarketing-rastreamento-des-caixa-certificate
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: rastreador-des-caixa
      type: certificate
  output: 
    secret:
      name: akvs-sirmc-api-emailmarketing-rastreamento-des-caixa-certificate
      type: kubernetes.io/tls
      
      apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sqlserverscrmbp01password
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: nprd-sirmc-sqlserver-scrmbp01-password
      type: secret    


apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sirmc-api-emailmarketing-rastreamento
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
    ASPNETCORE_ENVIRONMENT: "Development"
    DOTNET_ENVIRONMENT: "Development"
    EventHubName: eh-eventos-click
    TrackingURL: https://rastreador.des.caixa/
    Database__Username: SCRMBP01
    Database__Server: mssqlsrv-sicrm-des.database.windows.net
    Database__DbName: mssqldb-01-sirmc-des
    EventHubName: eh-eventos-click
    PaginaErroCodigoInvalido: https://gestaopreferencias.des.caixa/link-invalido
    PaginaErroSistemaIndisponivel: https://gestaopreferencias.des.caixa/sistema-indisponivel


o cluster é esse:  aks-crm-nprd.


acho que ta errado ali

    
      
