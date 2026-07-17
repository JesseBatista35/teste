Sistema: 7259APL-SIACI
Segmento: Bancário/São Paulo
Produto: Outros
Ambiente: Multiplataforma
Comunidade: Habitação
Unidade Demandante: 5088-CESOA
Telefone para contato: 49991245005
Caixa postal da unidade demandante: cesoa021@caixa.gov.br


Descrições adicionais: Referente ao repositório: siaci-api-integracao-padrao-java
Aplicação na nuvem (AZURE)

Realizamos a configuração no arquivo yaml para ambiente DES, entretanto, falha na etapa do ArgoCD_Deploy (TQS) na etapa GET KUBERNETS DESTINATION,

Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
Run set -euo pipefail
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=siaci-api-integracao-padrao-java
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.

OBS: favor utilizar cluster de DES (aks-hab-des), conforme orientação do colega do COE em anexo e conforme configuração feita para outro repositório na REQ000143579604




ja fiz aqui:


Sistema: 7259APL-SIACI
Segmento: Bancário/São Paulo
Produto: Outros
Ambiente: Multiplataforma
Comunidade: Habitação
Unidade Demandante: 5088-CESOA
Telefone para contato: 49991245005
Caixa postal da unidade demandante: cesoa021@caixa.gov.br


Descrições adicionais: Referente ao repositório: siaci-api-integracao-padrao-java
Aplicação na nuvem (AZURE)

Realizamos a configuração no arquivo yaml para ambiente DES, entretanto, falha na etapa do ArgoCD_Deploy (TQS) na etapa GET KUBERNETS DESTINATION,

Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
Run set -euo pipefail
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=siaci-api-integracao-padrao-java
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.

OBS: favor utilizar cluster de DES (aks-hab-des), conforme orientação do colega do COE em anexo e conforme configuração feita para outro repositório na REQ000143579604


siaci-api-integracao-padrao-java-infranprd/des/templates
/cm-siaci-api-integracao-padrao-java.yaml


apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siaci-api-integracao-padrao-java
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"


siaci-api-integracao-padrao-java-infranprd/des/templates
/akvs-siaci-api-integracao-padrao-java.yaml


apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siaci-api-integracao-padrao-java
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: <NOME_DO_KEYVAULT>
    object:
      name: siaci-api-integracao-padrao-java
      type: secret
  output: 
    secret:
      name: akvs-siaci-api-integracao-padrao-java
      type: kubernetes.io/tls

      

