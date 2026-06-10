apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siiga-frontend-mfe-gestao-canais
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-pla-nprd
    object:
      name: siiga-frontend-gestao-canais-tqs-caixa
      type: certificate
  output:
    secret:
      name: akvs-siiga-frontend-gestao-canais-tqs-caixa-ssl-certificate
      type: kubernetes.io/tls 
