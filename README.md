des/templates/akvs-sisph-api-auditoria-des-caixa-certificate.yaml
apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sisph-api-auditoria-des-caixa-certificate
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name:  kv-hab-des
    object:
      name: sisph-api-auditoria-des-caixa 
      type: certificate
  output: 
    secret:
      name: akvs-sisph-api-auditoria-des-caixa-certificate
      type: kubernetes.io/tls     
