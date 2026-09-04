Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
SIMPF-frontend
Repository navigation
Code
Issues
Pull requests
36
 (36)
Actions
Projects
Wiki
Security and quality
251
 (251)
Insights
Settings
Comparing changes
Choose two branches to see what’s changed or to start a new pull request. If you need to, you can also  or learn more about diff comparisons.
...
 Able to merge. These branches can be automatically merged.
Discuss and review the changes in this comparison with others. Learn about pull requests
 2 commits
 1 file changed
 1 contributor
Commits on Aug 11, 2026
Add files via upload

@c160737_caixa
c160737_caixa authored 3 weeks ago
Merge pull request #130 from caixagithub/c160737_caixa-patch-3 

@c160737_caixa
c160737_caixa authored 3 weeks ago
 Showing  with 61 additions and 0 deletions.
 61 changes: 61 additions & 0 deletions61  
.github/workflows/call-generic-qa-pipelines.yaml
Original file line number	Diff line number	Diff line change
@@ -0,0 +1,61 @@
# ============================================================================= #
#        CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW TESTES ESTATICOS v1.0           #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza o processo de análise estática do código através do Sonar,     #
# promovendo estabilidade e escalabilidade de forma mais segura e robusta.      #
# ============================================================================= #

# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #

name: QA - Análise Estática de Código

# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #
run-name: QUALIDADE-__.

# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# pull_request      -> Executa automaticamente em pull_requests, de acordo com os filtros                                    #
# types             -> Filtro de execução. O workflow, no evento pull_request, será executado apenas nos estados aberto,     #
#                   -> sincronizado e reaberto                                                                               #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #

on:
  workflow_dispatch:
  pull_request:
    types:
      - opened
      - synchronize
      - reopened
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'

# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/quality-assurance.yml@main  -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #

jobs:
  Solution-QA:
    name: QA
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/quality-assurance.yml@main
    secrets: inherit
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information
