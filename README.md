caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigec/opf/sigec-opf
    tag: "26597911912"
    pullPolicy: Always

#-----#
# HPA #
#-----#
  replicaCount: 2

  autoscaling:
    enabled: true
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
          - sigec-opf.apl.des.private.azure
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-sigec-opf-api-des-caixa-certificate # Nome do secret do certificado
        hosts:
          - sigec-opf-api.des.caixa
    prefix:
      - /
    targetPort: 80

    #-------------#
#  RESOURCES  #
#-------------#

  resources:
    requests:
      cpu: 250m
      memory: 768Mi
    limits:
      cpu: 750m
      memory: 1536Mi


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
        path: /sigec-opf-api/actuator/health/liveness     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /sigec-opf-api/actuator/health/readiness   
        port: 8080


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sigec-opf

    
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"
  #  - key: "nuvem.caixa/nodepoolname"
  #    effect: "NoSchedule"
  #    operator: "Equal"
  #    value: "crc"


      


#-------------# 
#   SECRETS   # 
#-------------# 

  env:
  - name: SPRING__DATASOURCE__PASSWORD
    value: akvs-jdbc-sql-authentication2@azurekeyvault
  - name: API_KEY
    value: akvs-api-sigec-opf@azurekeyvault
  - name: apim-key # Mudar para o valor que a aplicação utiliza
    value: akvs-api-des-caixa@azurekeyvault
  - name: login_key # Mudar para o valor que a aplicação utiliza
    value: akvs-login-des-caixa@azurekeyvault  
