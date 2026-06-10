caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/siiga/frontend-mfe-gestao-canais/siiga-frontend-mfe-gestao-canais
    tag: "27235095192"
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
  # ingress:
  #   - name: internal
  #     enabled: true
  #     className: "azure-application-gateway"
  #     annotations:
  #       appgw.ingress.kubernetes.io/backend-path-prefix: "/"
  #       appgw.ingress.kubernetes.io/backend-protocol: "http"
  #       appgw.ingress.kubernetes.io/request-timeout: "60"
  #       appgw.ingress.kubernetes.io/ssl-redirect: "false"
  #       appgw.ingress.kubernetes.io/connection-draining: "true"
  #       appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
  #       appgw.ingress.kubernetes.io/use-private-ip: "true"
  #     rules:
  #       # variavel do nome do projeto
  #       - host: "siiga-frontend-mfe-gestao-canais.apl.des.private.azure"
  #         paths:
  #           - path: "/"
  #             targetPort: 80 

  istio:
    - name: internal
      enabled: true
      servers:
        - port:
            number: 80
            name: http-default
            protocol: HTTP
          hosts:
            - "siiga-frontend-mfe-gestao-canais.apl.des.private.azure"
        - port:
            number: 443
            name: https-custom
            protocol: HTTPS
          tls:
            mode: SIMPLE
            credentialName: akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
          hosts:
            - "siiga-frontend-gestao-canais.des.caixa"
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
    - name: cm-siiga-frontend-mfe-gestao-canais

    
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
      value: "appssiiga"


#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-siiga-frontend-mfe-gestao-canais@azurekeyvault
