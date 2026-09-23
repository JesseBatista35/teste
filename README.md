sisph-api-auditoria-infranprd/des
/values.yaml



caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sisph/api-auditoria/sisph-api-auditoria
    tag: "33678367320"
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
  #       - host: "sisph-api-auditoria.apl.prd.private.azure"
  #         paths:
  #           - path: "/"
  #             targetPort: 80 
              
  #   - name: custom
  #     enabled: true
  #     className: "azure-application-gateway"
  #     annotations:
  #       appgw.ingress.kubernetes.io/backend-path-prefix: "/"
  #       appgw.ingress.kubernetes.io/backend-protocol: "https"
  #       appgw.ingress.kubernetes.io/request-timeout: "60"
  #       appgw.ingress.kubernetes.io/ssl-redirect: "true"
  #       appgw.ingress.kubernetes.io/connection-draining: "true"
  #       appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
  #       appgw.ingress.kubernetes.io/use-private-ip: "true"
  #       appgw.ingress.kubernetes.io/appgw-ssl-certificate: "sisph-api-auditoria-des-caixa"
  #     rules:
  #       - host: "sisph-api-auditoria.des.caixa"
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
        - sisph-api-auditoria.apl.des.private.azure
      - port:
         number: 443
         name: https-custom
         protocol: HTTPS
        tls:
         mode: SIMPLE
         credentialName: akvs-sisph-api-auditoria-des-caixa-certificate
        hosts:
         - sisph-api-auditoria.des.caixa
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


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sisph-api-auditoria

    
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

#  secretRefs:
  env:
    # CosmosDB Connection String
    - name: CosmosDb__ConnectionString
      value: akvs-sisph-kv-cosmodb-conn-string@azurekeyvault
    
    # EventHub Connection String
    - name: EventHub__ConnectionString
      value: akvs-sisph-kv-eventhub-conn-string@azurekeyvault
    
    # Blob Storage Connection String (para checkpoint do EventHub)
    - name: BlobStorage__ConnectionString
      value: akvs-sisph-des-blobstorage-connection-string@azurekeyvault

    # Application insights Connection String
    - name: ApplicationInsights__ConnectionString
      value: akvs-sisph-apm-appinsights-conn-string@azurekeyvault
