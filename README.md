
<img width="1886" height="903" alt="image" src="https://github.com/user-attachments/assets/bc6167dd-c99c-4587-a44d-b2f95606d9f8" />

acei esse cara aqui


# ========================================================================================== #
#            CAIXA DEVSECOPS - BUILD DA DOCUMENTAÇÃO DO MKDOCKS v1.0                         #
# ========================================================================================== #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.                   #
# Ele automatiza o build da documentação da aplicação no padrão mkdocs que,  posteriormente, #
# será exibido no FusionX.                                                                   #
# ========================================================================================== #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: CI/CD Workflow

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #

run-name: __.

# ====================================================================================================================== #
# Eventos que disparam o workflow                                                                                        #
# ====================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                   #
# push              -> Executa automaticamente em push, de acordo com os filtros                                         #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração       #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                            #
# pull_request      -> Executa automaticamente em pull_requests, de acordo com os filtros                                #
#                                                                                                                        #
# Documentação de referência                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                #
# ====================================================================================================================== #

on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'
  pull_request:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'

# ================================================================================================================================================= #
# Definição dos jobs que serão executados                                                                                                           #
# ================================================================================================================================================= #
# name: CI_DES                                                                             -> Nome do job, aparece na interface do GitHub Actions   #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/mkdocs-pipelines.yaml@main       -> Template reutilizado                                  #
# secrets: inherit                                                                         -> Herda os segredos definidos no repositório principal  #
#                                                                                                                                                   #
# Documentação de referência                                                                                                                        #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                      #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                      #
# ================================================================================================================================================= #

jobs:
   Docs-Solution:
      name: CI_DES
      uses: caixagithub/DevSecOps-Solutions/.github/workflows/techdocs-pipelines.yaml@main
      secrets: inherit
