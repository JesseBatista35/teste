apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siidx-ferramenta-fakemail-edo-siidx-des
  labels: 
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  QUARKUS_SMALLRYE_OPENAPI_ENABLED: true
  QUARKUS_SWAGGER_UI_ENABLED: true
