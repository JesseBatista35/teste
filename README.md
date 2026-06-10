apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siiga-frontend-mfe-gestao-canais
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"
