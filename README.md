repo:caixagithub/DevSecOps-Solutions ubuntu-latest
repo:caixagithub/DevSecOps-Actions ubuntu-latest
org:caixagithub path:.github/workflows /generic-s3-pipelines|buildGradle|akv\.yml|gsc-integration-generic-pipeline/



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · repo:caixagithub/DevSecOps-Solutions ubuntu-latest
Filter by
Advanced
10 files
 (252 ms)
10 files
in
caixagithub/DevSecOps-Solutions(press backspace or delete to remove)


.github/workflows/akv.yml
YAML
·
1
 (1)
        type: string
jobs:
  retrieve-secrets:
    runs-on: ubuntu-latest
    steps:
      - name: 'Checkout repository'
        uses: actions/checkout@v4


.github/workflows/techdocs-pipelines.yaml
YAML
·
1
 (1)
jobs:
 publish-techdocs-site:
   runs-on: ubuntu-latest
   env:
     TECHDOCS_STG_CONTAINER_NAME: ${{ vars.STG_TECHDOCS_CONTAINER_ORG }}
     TECHDOCS_STG_ACC_NAME: ${{ vars.STG_TECHDOCS_ACC_NAME_ORG }}


.github/workflows/java-libs-pipelines-multimodules.yaml
YAML
·
1
 (1)
    runs-on: arc-runner-set-default-nprod #ubuntu-latest


.github/workflows/java-libs-pipelines.yaml
YAML
·
1
 (1)
jobs:
  Build_Deploy_Package:
    if: ${{ github.ref_name == 'main' || github.ref_name == 'develop' }}
    runs-on: ubuntu-latest
    env:
      GITHUB_USER: ${{ github.actor }}


.github/workflows/dockerfile-validation-pipelines.yaml
YAML
·
1
 (1)
jobs:
  validate-dockerfile:
    name: Dockerfile validation
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v4


.github/workflows/generic-s3-pipelines.yaml
YAML
·
1
 (1)
  DEPLOY:
    needs: [VALIDATION, BUILD]
    runs-on: ubuntu-latest
    env:
      DOCKER_TLS_VERIFY: ""
      DOCKER_CERT_PATH: ""


.github/workflows/dotnet-azureapps-pipelines.yaml
YAML
·
1
 (1)
jobs:
  Prepare_ENV:
    runs-on: ubuntu-latest
    outputs:
      valid_envs: ${{ steps.validate_envs.outputs.VALID_DEPLOY_ENVIRONMENTS }}
    environment: ${{ matrix.environment }}


.github/workflows/gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
    runs-on: ubuntu-latest


.github/workflows/codeql-pipelines.yaml
YAML
·
2
 (2)
    runs-on: ubuntu-latest
…matrix.language == 'java' || matrix.language == 'java-kotlin') && 'arc-runner-set-default-nprod' || 'ubuntu-latest') }}


.github/workflows/arc-runner-aws-test-run.yaml
YAML
·
1
 (1)
    name: Test Summary
    needs: [test-runner]
    if: always()
    runs-on: ubuntu-latest
    steps:
      - name: Resumo dos Testes
        run: |



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · repo:caixagithub/DevSecOps-Actions ubuntu-latest
Filter by
Languages
Paths
Advanced
10 files
 (150 ms)
10 files
in
caixagithub/DevSecOps-Actions(press backspace or delete to remove)


README.md
Markdown
·
6
 (6)
  security-scan:
    runs-on: ubuntu-latest
    steps:
  setup:
    runs-on: ubuntu-latest
    outputs:
Show 4 more matches


.github/workflows/versioning.yml
YAML
·
1
 (1)
jobs:
  TAG_ON_MERGE:
    if: github.event.pull_request.merged == true
    runs-on: ubuntu-latest
    steps:
      - name: Checkout code


.github/workflows/buildGradle.yml
YAML
·
1
 (1)
jobs:
  build-gradle:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout code


.github/chaintools/nodejs/nodejs_prepare/action.yaml
YAML
·
1
 (1)
jobs:
  use-node:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout repository
        uses: actions/checkout@v2


.github/workflows/zap-generate-full-rules.yaml
OASv3-yaml
·
1
 (1)
jobs:
  generate:
    runs-on: ubuntu-latest
    permissions:
      contents: write


.github/chaintools/helm/helm_replacetokens/action.yaml
YAML
·
1
 (1)
jobs:
  copy-helm-files:
    runs-on: ubuntu-latest
    defaults:
      run:
        working-directory: ${{ github.event.repository.name }}


.github/chaintools/helm/helm_copy_artifacts/action.yaml
YAML
·
1
 (1)
jobs:
  copy-helm-files:
    runs-on: ubuntu-latest
    defaults:
      run:
        working-directory: ${{ github.event.repository.name }}


.github/mobile/android/buildGradle.yml
YAML
·
1
 (1)
jobs:
  build-gradle:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout code


.github/chaintools/helm/helm_scan/action.yaml
YAML
·
1
 (1)
jobs:
  helm-lint-checkov:
    runs-on: ubuntu-latest
    defaults:
      run:
        working-directory: ${{ github.event.repository.name }}


.github/security/codeql/action.yaml
YAML
·
1
 (1)
jobs:
  analyze:
    runs-on: ubuntu-latest
    strategy:
      fail-fast: false
      matrix:



Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · org:caixagithub path:.github/workflows /generic-s3-pipelines|buildGradle|akv\.yml|gsc-integration-generic-pipeline/
Filter by
Repositories
Advanced
220 files
 (696 ms)
220 files
in
caixagithub(press backspace or delete to remove)
Files with identical content are grouped together. 


caixagithub/sisfm-teste-fors · .github/workflows/call-generic-pipelines.yaml
YAML
·
1
 (1)
  pull-requests: write
  id-token: write
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main
    secrets: inherit


caixagithub/sisfm-mfe-navbar · .github/workflows/call-generic-pipelines.yaml


caixagithub/sisfm-mfe-accessprofile · .github/workflows/call-generic-pipelines.yaml


caixagithub/sisfm-mfe-dashboard · .github/workflows/call-generic-s3-pipelines.yaml
YAML
·
2
 (2)
…aixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main  -> Template reutilizado              …
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main


caixagithub/siipc-backend-xid-orquestrador-bio-ag-worker · .github/workflows/call-gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES", "PRD"]'


caixagithub/sigcn-api-orquestrador · .github/workflows/call-gsc-pipelines.yaml
YAML
·
1
 (1)
  CI_CD:
    name: CI_CD
    needs: Validate_Input
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: ${{ needs.Validate_Input.outputs.deploy_environments }}


caixagithub/sigcn-gestao-contestacoes-backend · .github/workflows/call-gsc-pipelines.yaml


caixagithub/sidre-da-emprestimos · .github/workflows/call-generic-pipelines.yaml
YAML
·
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:


caixagithub/DevSecOps-hotfix-test · .github/workflows/call-gsc-generic-pipelines.yaml
YAML
·
1
 (1)
jobs:
  Generic-Solution:
      name: CI_DES
      uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@feat/hotfix_audit
      secrets: inherit
      with:
        DEPLOY_ENVIRONMENTS: '["DES", "TST", "SANDBOX", "HMP", "PFM", "PLT", "PRD"]'


caixagithub/sigcn-frontend-parecer-contestacao-aks · .github/workflows/call-gsc-pipelines.yaml
YAML
·
1
 (1)
  CI_CD:
    name: CI_CD
    needs: Validate_Input
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: ${{ needs.Validate_Input.outputs.deploy_environments }}


caixagithub/sigcn-frontend-contestar-unificada · .github/workflows/call-gsc-pipelines.yaml


caixagithub/sigcn-contestacao-backend · .github/workflows/call-gsc-pipelines.yaml


caixagithub/DevSecOps-Solutions-New-Flow-Test · .github/workflows/gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
        env:
          DEPLOY_ENVIRONMENTS: ${{ inputs.DEPLOY_ENVIRONMENTS }}
          BRANCH: ${{ github.ref_name }}
          SOLUTION: 'gsc-integration-generic-pipeline'
          TOKEN_GITHUB_ORG: ${{ steps.app_token.outputs.token }}
        run: python devsecops-actions/src/validations/validate-deploy-env.py
        shell: bash


caixagithub/sigcn-raf-worker · .github/workflows/call-generic-pipelines-prd.yaml
YAML
·
3
 (3)
    name: CI_CD_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    name: CI_CD_TQS
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
Show 1 more match


caixagithub/sirmc-api-campanhas · .github/workflows/call-generic-pipelines.yaml
YAML
·
1
 (1)
jobs:
   Generic-Solution:
      name: CI_DES
      uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
      secrets: inherit        
      with:
        DEPLOY_ENVIRONMENTS: '["DES","TQS","PRD"]'


caixagithub/DevSecOps-Solutions · .github/workflows/gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
        env:
          DEPLOY_ENVIRONMENTS: ${{ inputs.DEPLOY_ENVIRONMENTS }}
          BRANCH: ${{ github.ref_name }}
          SOLUTION: 'gsc-integration-generic-pipeline'
          TOKEN_GITHUB_ORG: ${{ steps.app_token.outputs.token }}
        run: python devsecops-actions/src/validations/validate-deploy-env.py
        shell: bash


caixagithub/sigcn-med-backend · .github/workflows/call-generic-pipelines-prd.yaml
YAML
·
3
 (3)
    name: CI_CD_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    name: CI_CD_TQS
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
Show 1 more match


caixagithub/sigcn-med-worker · .github/workflows/call-generic-pipelines-prd.yaml


caixagithub/sigcn-med-frontend-aks · .github/workflows/call-generic-pipelines-prd.yaml


caixagithub/siipc-xid-habitualidade-worker · .github/workflows/call-generic-pipelines.yaml
YAML
·
2
 (2)
…thub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main -> Template reutilizado         …
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main


caixagithub/siipc-backend-onboarding-cs-biometria-worker · .github/workflows/call-gsc-integration-generic-pipeline.yaml
YAML
·
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES", "PRD"]'


caixagithub/siipc-frontend-xid-habitualidade-dashboard-aks · .github/workflows/call-gsc-pipelines.yaml
YAML
·
1
 (1)
  CI_CD:
    name: CI_CD
    needs: Validate_Input
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: ${{ needs.Validate_Input.outputs.deploy_environments }}


caixagithub/sidre-da-investimentos · .github/workflows/call-generic-pipelines.yaml
YAML
·
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES", "SANDBOX","PRD"]'


caixagithub/sisfm-mfe-landing · .github/workflows/call-generic-s3-pipelines.yaml
YAML
·
2
 (2)
…aixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main  -> Template reutilizado              …
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main


caixagithub/sigcn-med-backend · .github/workflows/call-generic-pipelines-des-tqs.yaml
YAML
·
1
 (1)
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main


caixagithub/sigcn-med-worker · .github/workflows/call-generic-pipelines-des-tqs.yaml


caixagithub/sigcn-med-frontend-aks · .github/workflows/call-generic-pipelines-des-tqs.yaml


caixagithub/siipc-onboarding-worker-notificacao · .github/workflows/call-gsc-integration-generic-pipeline.yaml‎
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES", "PRD"]'


caixagithub/siaad-teste-pipeline-agil-1 · .github/workflows/call-gsc-integration-generic-pipeline.yamlaffolder-skeletons/dotnet-model-caixa-skeleton
1
 (1)
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/gsc-integration-generic-pipeline.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
