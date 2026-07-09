  achei

  sinsh-backend-simulador-pj-infranprd/des/templates /cm-sinsh-backend-simulador-pj.yaml



apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sinsh-backend-simulador-pj
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  ASPNETCORE_ENVIRONMENT: "Development"
  Logging__LogLevel__Default: "Information"
  Logging__LogLevel__Microsoft: "Warning"
  AllowedHost: "*"
  Kestrel__Endpoints__MyHttpEndpoint__Url: "http://*:8080"
  AmbienteExeceucao: "des"
  SinshClientId: "cli-ser-nsh"
  SinshClientSecret: ""
  ApiKey: ""
  ApiSso: "https://login.des.caixa"
  IntranetIssuer: "https://login.des.caixa/auth/realms/intranet"
  ApimIntranet: "https://api.des.caixa:8443"





  


