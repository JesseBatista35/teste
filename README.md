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

run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}

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
  CI_DES:
    if: github.ref_name == 'develop'
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false

  CI_PRD:
    if: github.ref_name == 'main'
    name: CI_PRD
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES","PRD"]'
      IMPORT_APIM: false      



apiVersion: backstage.io/v1alpha1
kind: Component
metadata:
  name: siopi-backend-jornada-pj
  description: Módulo backend da Jornada PJ
  annotations:
    argocd/app-selector: 'appName=siopi-backend-jornada-pj'
    backstage.io/kubernetes-id: siopi-backend-jornada-pj
    github.com/project-slug: caixagithub/siopi-backend-jornada-pj
    backstage.io/source-location: url:https://github.com/caixagithub/siopi-backend-jornada-pj
    backstage.io/techdocs-ref: url:https://github.com/caixagithub/siopi-backend-jornada-pj/tree/main
    backstage.io/managed-by-location: url:github.com/caixagithub/siopi-backend-jornada-pj
    sonarqube.org/project-key: sonarqube-produtos4/siopi-backend-jornada-pj
    feedback/type: 'MAIL'
    feedback/email-to: 'cxnde04@corp.caixa.gov.br'
spec:
  type: service
  lifecycle: estavel
  owner: group:default/g_az_box_bpnnm
  system: SIOPI


  GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siopi-backend-jornada-pj
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
1
 (1)
Insights
Settings
Files
Go to file
t
T
docs content loaded
.github/workflows
call-docs-pipelines.yaml
call-generic-pipelines.yaml
call-generic-qa-pipelines.yaml
call-generic-sec-pipelines.yaml
validate-commit-in-develop.yaml
docs
content
API_RESTful_-_Definicoes_e_Orientacoes10.pdf
docfx.json
toc.yml
src
tests
SiopiBackendJornadaPJ.Application.Test
UseCases
SiopiBackendJornadaPJ.Application.Test.csproj
SiopiBackendJornadaPJ.Domain.Test
Builders
Entities
Fixtures
ValueObjects
SiopiBackendJornadaPJ.Domain.Test.csproj
.dockerignore
.gitignore
Dockerfile
README.md
SiopiBackendJornadaPJ.sln
catalog-info.yaml
coverage.runsettings
mkdocs.yaml
siopi-backend-jornada-pj/.github/workflows
/call-generic-pipelines.yaml
f699848_caixa
f699848_caixa
feat: remover PFM
