sigex-frontend-painel-presi-infranprd/des
/values.yaml


caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigex/frontend-painel-presi/sigex-frontend-painel-presi
    tag: "33635248318"
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
          - sigex-frontend-painel-presi.apl.des.private.azure
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-gestao-controladoria-des-caixa-ssl-certificate
        hosts:
          - gestao.controladoria.des.caixa
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
        path: /healthz.html     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /healthz.html    
        port: 8080


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sigex-frontend-painel-presi
    
  volumes:
    - name: volume-env-js
      configMap:
        name: cm-sigex-frontend-painel-presi

  volumeMounts:
    - name: volume-env-js
      mountPath: /usr/share/nginx/html/assets/environment
    
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

  env:
    - name: EXCEL_TOKEN
      value: akvs-excel-budget-token-gestao-nprd-secret


sigex-frontend-painel-presi-infranprd/des/templates
/akvs-excel-budget-token-gestao-nprd.yaml



des/templates/akvs-excel-budget-token-gestao-nprd.yaml

apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-excel-budget-token-gestao-nprd-secret
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-gestao-nprd
    object:
      name: excel-budget-token-gestao-nprd
      type: secret 



