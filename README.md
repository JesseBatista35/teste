chart.yaml


apiVersion: v2
name: caixa-base-chart
description: A Helm chart for Kubernetes

type: application

version: 1.0.0

appVersion: "1.16.0"

dependencies:
   - name: caixa-base-chart
     version: 1.1.9
     repository: oci://acrportalidpprd.azurecr.io/helm



     caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj
    tag: "29035105232"
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
        - "sinsh-backend-simulador-pj.apl.des-nprd.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sinsh-backend-simulador-pj-certificate # Nome do secret do certificado
      #  hosts:
      #    - sinsh-backend-simulador-pj.des-nprd.caixa
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


sinsh-backend-simulador-pj-infranprd/des
/values.yaml



#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sinsh-backend-simulador-pj
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
      value: "appshab"

#-------------# 
#   SECRETS   # 
#-------------# 

  secretRefs:
  env:
    # - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
    #   value: akvs-sinsh-backend-simulador-pj@azurekeyvault
      name: ApiKey
      value: akvs-apikey@azurekeyvault
      name: SinshClientSecret
      value: akvs-clientid-intrasecret@azurekeyvault
