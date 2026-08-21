apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sirmc-sqlserver-transacao
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-crm-nprd
    object:
      name: shared-sqlserver-transacao-usuario
      type: secret


      GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sirmc-api-registro-interacoes-clientes-infranprd
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
templates content loaded
des
templates
akvs-shared-applicationinsights-connectionstring.yaml.yaml
akvs-sirmc-api-registro-interacoes-clientes-certificate.yaml
akvs-sirmc-sqlserver-transacao-password.yaml
akvs-sirmc-sqlserver-transacao.yml
cm-sirmc-api-registro-interacoes-clientes.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
tqs
README.md
sirmc-api-registro-interacoes-clientes-infranprd/des/templates
/akvs-sirmc-sqlserver-transacao.yml
