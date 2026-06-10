apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siiga-frontend-mfe-gestao-canais-des
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-pla-nprd
    object:
      name: siiga-frontend-gestao-canais-des-caixa
      type: certificate
  output:
    secret:
      name: akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
      type: kubernetes.io/tls 
