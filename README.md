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



     ---- 
     
     values.yaml


     caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sibko/frontend-gerenciador-financeiro/sibko-frontend-gerenciador-financeiro
    tag: "27828530715"
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
        - "sibko-frontend-gerenciador-financeiro.apl.des-nprd.private.azure"
      prefix:
        - /
      targetPort: 80
    - name: external
      enabled: true
      servers:
        - port:
            number: 443
            name: https-custom
            protocol: HTTPS
          tls:
            mode: SIMPLE
            credentialName: akvs-gerenciador-financeiro-sibko-des-caixa-gov-br-ssl-certificate
          hosts:
            - gerenciador.financeiro.sibko.des.caixa.gov.br
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
        path: /healthz/live   
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /healthz/ready   
        port: 8080


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sibko-frontend-gerenciador-financeiro
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "nuvem.caixa/nodepoolname"
      effect: "NoSchedule"
      operator: "Equal"
      value: "websitesibko"
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
#      value: akvs-sibko-frontend-gerenciador-financeiro@azurekeyvault






     
