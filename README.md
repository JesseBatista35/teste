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
caixagithub
sisph-api-auditoria-infranprd
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
des
templates
akvs-all-secrets.yml
akvs-sisph-api-auditoria-des-caixa-certificate.yaml
cm-sisph-api-auditoria.yaml
.helmignore
Chart.yaml
README.md
values.yaml
hmp
tqs
tst
sisph-api-auditoria-infranprd/des/templates
/akvs-sisph-api-auditoria-des-caixa-certificate.yaml
