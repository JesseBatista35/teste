apiVersion: v1
data:
  ASPNETCORE_ENVIRONMENT: Development
  AllowedHost: '*'
  AmbienteExeceucao: des
  ApiKey: ''
  ApiSso: https://login.des.caixa
  ApimIntranet: https://api.des.caixa:8443
  IntranetIssuer: https://login.des.caixa/auth/realms/intranet
  Kestrel__Endpoints__MyHttpEndpoint__Url: https://*:8080
  Logging__LogLevel__Default: Information
  Logging__LogLevel__Microsoft: Warning
  SinshClientId: cli-ser-nsh
  SinshClientSecret: ''
kind: ConfigMap
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"v1","data":{"ASPNETCORE_ENVIRONMENT":"Development","AllowedHost":"*","AmbienteExeceucao":"des","ApiKey":"","ApiSso":"https://login.des.caixa","ApimIntranet":"https://api.des.caixa:8443","IntranetIssuer":"https://login.des.caixa/auth/realms/intranet","Kestrel__Endpoints__MyHttpEndpoint__Url":"https://*:8080","Logging__LogLevel__Default":"Information","Logging__LogLevel__Microsoft":"Warning","SinshClientId":"cli-ser-nsh","SinshClientSecret":""},"kind":"ConfigMap","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"sinsh-backend-simulador-pj-des","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"sinsh-backend-simulador-pj-des","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"sinsh-backend-simulador-pj","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"cm-sinsh-backend-simulador-pj","namespace":"sinsh-backend-simulador-pj"}}
  creationTimestamp: '2026-07-07T20:29:46Z'
  labels:
    app.kubernetes.io/instance: sinsh-backend-simulador-pj-des
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: sinsh-backend-simulador-pj-des
    app.kubernetes.io/version: 1.16.0
    backstage.io/kubernetes-id: sinsh-backend-simulador-pj
    helm.sh/chart: caixa-base-chart-1.0.0
  name: cm-sinsh-backend-simulador-pj
  namespace: sinsh-backend-simulador-pj
  resourceVersion: '261891469'
  uid: 57e76758-8145-4620-8545-d3f30df2aadd
