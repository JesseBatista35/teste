caixagithub
sibko-frontend-gerenciador-financeiro
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
16
 (16)
Insights
Settings
Files
Go to file
t
T
.github/workflows
call-generic-pipelines.yaml
call-generic-qa-pipelines.yaml
call-generic-sec-pipelines.yaml
docs
public
src
.dockerignore
.editorconfig
.gitignore
.hintrc
.npmrc
.prettierignore
.prettierrc
Dockerfile
README.md
angular.json
catalog-info.yaml
mkdocs.yaml
package.json
tsconfig.app.json
tsconfig.json
tsconfig.spec.json
sibko-frontend-gerenciador-financeiro/.github/workflows
/call-generic-pipelines.yaml




# ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW CI/CD v1.0                 #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de integração contínua (CI) e entrega contínua (CD), #
# promovendo segurança, padronização e eficiência no ciclo de desenvolvimento.  #
# Todas as alterações devem ser realizadas por meio do Fusionx                  #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: CI/CD Workflow Generic

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: __.

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'


# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: write        -> Permite escrever nos arquivos do repositório                                                       #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
# issues: write          -> Permite criar/editar issues                                                                        #
# pull-requests: write   -> Permite criar/editar pull requests                                                                 #
# pull-requests: write   -> Permite gerar token oidc do github                                                                 #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #

permissions:
  contents: write
  security-events: write
  packages: read
  actions: read
  issues: write
  pull-requests: write
  id-token: write

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# IMPORT_APIM: false                                                                  -> Desativa importação automática de APIs no Azure API Management. #
#                                                                                     -> Possíveis valores: true ou false                                #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false





caixagithub
sibko-frontend-gerenciador-financeiro-infranprd
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
akvs-gerenciador-financeiro-sibko-des-caixa-gov-br-ssl-certificate.yaml
cm-sibko-frontend-gerenciador-financeiro.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
tst
README.md
sibko-frontend-gerenciador-financeiro-infranprd/des/templates
/cm-sibko-frontend-gerenciador-financeiro.yaml







      apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sibko-frontend-gerenciador-financeiro
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"



apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-gerenciador-financeiro-sibko-des-caixa-gov-br-ssl-certificate
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-edo-nprd
    object:
      name: c-edo-sibko-gerenciador-financeiro-sibko-des-caixa-gov-br
      type: certificate
  output: 
    secret:
      name: akvs-gerenciador-financeiro-sibko-des-caixa-gov-br-ssl-certificate
      type: kubernetes.io/tls  

  
