
Argo
v2.14.21+206a6ee
Argo
Applications
Settings
User Info
Documentation
Resource filters
NAME
NAME
KINDS
KINDS
SYNC STATUS
Synced
10
OutOfSync
0
HEALTH STATUS
Progressing
0
Suspended
0
Healthy
9
Degraded
0
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sisph-bff-jnd-baixa-garantia-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (35e18ab)
Auto sync is enabled.
Author:
Arthur Augusto Alves <arthur.a.alves@caixa.gov.br> -
Comment:
Update cm-sisph-bff-jnd-baixa-garantia-des.yaml
LAST SYNC 

 Sync OK
to 35e18ab
Succeeded 3 hours ago (Tue Oct 20 2026 12:04:19 GMT-0300)
Author:
Arthur Augusto Alves <arthur.a.alves@caixa.gov.br> -
Comment:
Update cm-sisph-bff-jnd-baixa-garantia-des.yaml
APP CONDITIONS
 1 Warning
Previous123Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v
Pod
-
sisph-bff-jnd-baixa-garantia
7 hours ago   10/20/26
 Healthy  
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-56fb5579c8
apps/ReplicaSet
-
sisph-bff-jnd-baixa-garantia
a day ago   10/19/26
 Healthy  
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-5dfb6547cb
apps/ReplicaSet
-
sisph-bff-jnd-baixa-garantia
4 months ago   06/26/26
 Healthy  
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-54f5986bcd
apps/ReplicaSet
-
sisph-bff-jnd-baixa-garantia
5 months ago   06/02/26
 Healthy  
Secret
secret
akvs-sisph-bff-jnd-baixa-garantia-des-caixa
Secret
-
aks-istio-ingress
5 months ago   06/01/26
ConfigMap
cm
cm-sisph-bff-jnd-baixa-garantia-des
ConfigMap
-
sisph-bff-jnd-baixa-garantia
5 months ago   06/01/26
 Synced
Endpoints
ep
sisph-bff-jnd-baixa-garantia-des
Endpoints
-
sisph-bff-jnd-baixa-garantia
9 months ago   01/08/26
Secret
secret
akv2k8s-sisph-bff-jnd-baixa-garantia-des
Secret
-
sisph-bff-jnd-baixa-garantia
9 months ago   01/08/26
Service
svc
sisph-bff-jnd-baixa-garantia-des
Service
-
sisph-bff-jnd-baixa-garantia
9 months ago   01/08/26
 Healthy   Synced
Deployment
deploy
sisph-bff-jnd-baixa-garantia-des
apps/Deployment
-
sisph-bff-jnd-baixa-garantia
9 months ago   01/08/26
 Healthy   Synced
Previous123Next
Items per page: 10 

ConfigMapcm
cm-sisph-bff-jnd-baixa-garantia-des
 SUMMARY EVENTS
KIND
ConfigMap
NAME
cm-sisph-bff-jnd-baixa-garantia-des   
NAMESPACE
sisph-bff-jnd-baixa-garantia   
CREATED AT
06/01/2026 14:03:25 (5 months ago)
STATUS
 Synced
LINKS
Live Manifest DiffDesired Manifest
Enable Word Wrap
123456789101112131415161718192021222324252627282930313233343536
apiVersion: v1
data:
  APIM_CAIXA_URL: https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1
  ASPNETCORE_ENVIRONMENT: DES
  CONFIG_SERVER_URL: https://sisph-api-core-config.des.caixa/config/authorization
  Cors__AllowedOrigins__1: https://sisph-mfe-host-spa.des.caixa
  Cors__AllowedOrigins__2: https://sisph-mfe-jnd-baixa-garantia.des.caixa
  Cors__AllowedOrigins__3: https://sisph.des.caixa/
  DOTNET_ENVIRONMENT: DES
  Dados__Provedor: Simulado



apiVersion: v1
data:
  APIM_CAIXA_URL: https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1
  ASPNETCORE_ENVIRONMENT: DES
  CONFIG_SERVER_URL: https://sisph-api-core-config.des.caixa/config/authorization
  Cors__AllowedOrigins__1: https://sisph-mfe-host-spa.des.caixa
  Cors__AllowedOrigins__2: https://sisph-mfe-jnd-baixa-garantia.des.caixa
  Cors__AllowedOrigins__3: https://sisph.des.caixa/
  DOTNET_ENVIRONMENT: DES
  Dados__Provedor: Simulado
  DocumentoPreview__Provedor: Simulado
  ENABLE_SWAGGER: 'true'
  EventHub__Name: eh-sisph-des
  GeracaoDocumento__Provedor: Simulado
  HistoricoEntrega__Provedor: Simulado
  PROJECT_NAME: BFF.JND.BAIXA.GARANTIA
  RateLimiting__ReplenishmentPeriodSeconds: '60'
  RateLimiting__RetryAfterSeconds: '60'
  RateLimiting__TokenLimit: '120'
  RateLimiting__TokensPerPeriod: '100'
  SSO_CAIXA_REALM: intranet
  SSO_CAIXA_SER_CLIENT_ID: cli-ser-sph
  SSO_CAIXA_URL: https://login.des.caixa/auth/
  SSO_CAIXA_WEB_CLIENT_ID: cli-web-sph
kind: ConfigMap
metadata:
  labels:
    app.kubernetes.io/instance: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/version: 1.16.0
    backstage.io/kubernetes-id: sisph-bff-jnd-baixa-garantia
    helm.sh/chart: caixa-base-chart-1.0.0
  name: cm-sisph-bff-jnd-baixa-garantia-des
  namespace: sisph-bff-jnd-baixa-garantia



apiVersion: v1
data:
  APIM_CAIXA_URL: https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1
  ASPNETCORE_ENVIRONMENT: DES
  CONFIG_SERVER_URL: https://sisph-api-core-config.des.caixa/config/authorization
  Cors__AllowedOrigins__1: https://sisph-mfe-host-spa.des.caixa
  Cors__AllowedOrigins__2: https://sisph-mfe-jnd-baixa-garantia.des.caixa
  Cors__AllowedOrigins__3: https://sisph.des.caixa/
  DOTNET_ENVIRONMENT: DES
  Dados__Provedor: Simulado
  DocumentoPreview__Provedor: Simulado
  ENABLE_SWAGGER: 'true'
  EventHub__Name: eh-sisph-des
  GeracaoDocumento__Provedor: Simulado
  HistoricoEntrega__Provedor: Simulado
  PROJECT_NAME: BFF.JND.BAIXA.GARANTIA
  RateLimiting__ReplenishmentPeriodSeconds: '60'
  RateLimiting__RetryAfterSeconds: '60'
  RateLimiting__TokenLimit: '120'
  RateLimiting__TokensPerPeriod: '100'
  SSO_CAIXA_REALM: intranet
  SSO_CAIXA_SER_CLIENT_ID: cli-ser-sph
  SSO_CAIXA_URL: https://login.des.caixa/auth/
  SSO_CAIXA_WEB_CLIENT_ID: cli-web-sph
kind: ConfigMap
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"v1","data":{"APIM_CAIXA_URL":"https://api.des.caixa:8443/habitacao/pos-venda/administracao/v1","ASPNETCORE_ENVIRONMENT":"DES","CONFIG_SERVER_URL":"https://sisph-api-core-config.des.caixa/config/authorization","Cors__AllowedOrigins__1":"https://sisph-mfe-host-spa.des.caixa","Cors__AllowedOrigins__2":"https://sisph-mfe-jnd-baixa-garantia.des.caixa","Cors__AllowedOrigins__3":"https://sisph.des.caixa/","DOTNET_ENVIRONMENT":"DES","Dados__Provedor":"Simulado","DocumentoPreview__Provedor":"Simulado","ENABLE_SWAGGER":"true","EventHub__Name":"eh-sisph-des","GeracaoDocumento__Provedor":"Simulado","HistoricoEntrega__Provedor":"Simulado","PROJECT_NAME":"BFF.JND.BAIXA.GARANTIA","RateLimiting__ReplenishmentPeriodSeconds":"60","RateLimiting__RetryAfterSeconds":"60","RateLimiting__TokenLimit":"120","RateLimiting__TokensPerPeriod":"100","SSO_CAIXA_REALM":"intranet","SSO_CAIXA_SER_CLIENT_ID":"cli-ser-sph","SSO_CAIXA_URL":"https://login.des.caixa/auth/","SSO_CAIXA_WEB_CLIENT_ID":"cli-web-sph"},"kind":"ConfigMap","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"sisph-bff-jnd-baixa-garantia-des","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"sisph-bff-jnd-baixa-garantia-des","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"sisph-bff-jnd-baixa-garantia","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"cm-sisph-bff-jnd-baixa-garantia-des","namespace":"sisph-bff-jnd-baixa-garantia"}}
  creationTimestamp: '2026-06-01T17:03:25Z'
  labels:
    app.kubernetes.io/instance: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: sisph-bff-jnd-baixa-garantia-des
    app.kubernetes.io/version: 1.16.0
    backstage.io/kubernetes-id: sisph-bff-jnd-baixa-garantia
    helm.sh/chart: caixa-base-chart-1.0.0
  name: cm-sisph-bff-jnd-baixa-garantia-des
  namespace: sisph-bff-jnd-baixa-garantia
  resourceVersion: '337343336'
  uid: fe8ab6d3-3f68-449a-9ae3-f3dac4318e4b
