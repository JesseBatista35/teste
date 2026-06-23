calma tem essa estrutura aqui.


caixagithub
siacx-chatcaixa-mcp-server-infranprd
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
templates content loaded
des
templates
akvs-aiser-siacx-des-api-key.yml
akvs-ass-siacx-des-admin-key.yml
akvs-siacx-chatcaixa-mcp-server.yaml
cm-siacx-chatcaixa-mcp-server.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
templates
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml

o  siacx-chatcaixa-mcp-server-infranprd


TA ASSIM?: 

apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-api-chat-mcp-server-des-caixa
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-siacx-des
    object:
      name: api-chat-mcp-server-des-caixa
      type: secret
  output: 
    secret:
      name: api-chat-mcp-server-des-caixa
      type: kubernetes.io/tls

