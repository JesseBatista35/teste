no repositoroio:

sisph-mfe-jnd-central-servicos-infranprd/tqs




Files
Go to file
t
T
templates content loaded
des
templates
akvs-sisph-mfe-jnd-central-servicos-des-caixa.yaml
cm-sisph-mfe-jnd-central-servicos.yaml
.helmignore
Chart.yaml
README.md
values.yaml
hmp
tqs
templates
akvs-sisph-mfe-jnd-central-servicos-tqs-caixa.yaml
cm-sisph-mfe-jnd-central-servicos.yaml
.helmignore
Chart.yaml
README.md
values.yaml
tst


comparando os aruqivos:


o values.yaml do des ta assim:


caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sisph/mfe-jnd-central-servicos/sisph-mfe-jnd-central-servicos
    tag: "27373907196"
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
        - "sisph-mfe-jnd-central-servicos.apl.des.private.azure"
      - port:
         number: 443
         name: https-custom
         protocol: HTTPS
        tls:
         mode: SIMPLE
         credentialName: akvs-sisph-mfe-jnd-central-servicos-des-caixa
        hosts:
         - sisph-mfe-jnd-central-servicos.des.caixa
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
    - name: cm-sisph-mfe-jnd-central-servicos

    
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
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sisph-mfe-jnd-central-servicos@azurekeyvault




o de tqs ta assim:

caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sisph/mfe-jnd-central-servicos/sisph-mfe-jnd-central-servicos
    tag: "27373907196"
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
        - "sisph-mfe-jnd-central-servicos.apl.tqs.private.azure"
      - port:
         number: 443
         name: https-custom
         protocol: HTTPS
        tls:
         mode: SIMPLE
         credentialName: akvs-sisph-mfe-jnd-central-servicos-tqs-caixa
        hosts:
         - sisph-mfe-jnd-central-servicos.tqs.caixa
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
  - name: cm-sisph-mfe-jnd-central-servicos
  tolerations:
  - key: "kubernetes.azure.com/scalesetpriority"
    effect: "NoSchedule"
    operator: "Equal"
    value: "spot"
  - key: "nuvem.caixa/nodepoolname"
    effect: "NoSchedule"
    operator: "Equal"
    value: ""


#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sisph-mfe-jnd-central-servicos@azurekeyvault

  env:
  - name: '{{values'
    value: akvs-{{values@azurekeyvault
  - name: sisph-mfe-jnd-central-servicos-tqs-caixa
    value: akvs-sisph-mfe-jnd-central-servicos-tqs-caixa@azurekeyvault

