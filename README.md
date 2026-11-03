caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/vitec/sda8c-frontend-hub-ciaussp-frontend-2026/vitec-sda8c-frontend-hub-ciaussp-frontend-2026
    tag: "40890595504"
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
        - "vitec-sda8c-frontend-hub-ciaussp-frontend-2026.apl.des.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-vitec-sda8c-frontend-hub-ciaussp-frontend-2026-certificate # Nome do secret do certificado
      #  hosts:
      #    - vitec-sda8c-frontend-hub-ciaussp-frontend-2026.des.caixa
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
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
#-------------#
#  CONFIGMAP  #
#-------------#
  configMapRefs:
    - name: cm-vitec-sda8c-frontend-hub-ciaussp-frontend-2026
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
      value: "appsvitec"
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-vitec-sda8c-frontend-hub-ciaussp-frontend-2026@azurekeyvault


