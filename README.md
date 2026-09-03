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



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigex-frontend-painel-presi-infranprd
Repository navigation
Code
Issues
Pull requests
2
 (2)
Actions
Projects
Wiki
Security and quality
1
 (1)
Insights
Settings
Files
Go to file
t
T
templates content loaded
des
templates
akvs-excel-budget-token-gestao-nprd.yaml
akvs-gestao-controladoria-des-caixa.yaml
cm-sigex-frontend-painel-presi.yaml
.helmignore
Chart.yaml
README.md
values.yaml
sigex-frontend-painel-presi-infranprd/des/templates
/cm-sigex-frontend-painel-presi.yaml
c068438_caixa
c068438_caixa
Update cm-sigex-frontend-painel-presi.yaml
9f60bc8
 · 
2 months ago

Code

Blame
25 lines (25 loc) · 1.09 KB
apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sigex-frontend-painel-presi
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  env.js: |
    window.__env = {
      apiLocalUrl: false,
      tableauBaseUrl: "https://informacoes.caixa",
      apiBaseUrl: "https://api.gestao.controladoria.des.caixa",
      excelToken: "${EXCEL_TOKEN}",      
      azureAuth: {
        clientId: "942c0e7d-f5a1-40ca-924b-219616639ad4",
        authority: "https://login.microsoftonline.com/ab9bba98-684a-43fb-add8-9c2bebede229/v2.0",
        redirectUri: "https://gestao.controladoria.des.caixa/auth",
        postLogoutRedirectUri: "https://gestao.controladoria.des.caixa/",
        apiScopes: ["api://8d0a9c51-01fb-4ecf-9ee0-660b7374fd7e/user"],
      },
      appInsights: {
        connectionString: "InstrumentationKey=9d6920f9-9b75-4cdc-a362-3c9ed8248ec1;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=24c1dcf2-d834-4054-a4db-f215efac20eb",
        roleName: "SIGEX-APP-NPRD",
      },
    };
Copied!
      
