name: Generic Projects Workflow
run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}-${{ inputs.ambiente }}
on:
  workflow_call:
    inputs:
      DEPLOY_ENVIRONMENTS:
        required: false
        type: string
        default: '["DES"]'
      IMPORT_APIM:
        required: false
        type: boolean
        default: false
      USES_PACKAGES:
        required: false
        type: boolean
        default: false

jobs:
# ========================================================================================================================== #
# Environment Validation Result                                                                                              #
# ========================================================================================================================== #
# valid_deploy_environments -> Usage: ${{ jobs.VALIDATION.outputs.valid_deploy_environments }}                               #
#                           -> Description: Array of validated deploy environments                                           #
# ========================================================================================================================== #
  VALIDATION:
    runs-on: ubuntu-latest
    environment: ${{ matrix.environment }}
    outputs:
        type: ${{ steps.topics_validation.outputs.type }}
        valid_deploy_environments: ${{ steps.validate_deploy_environments.outputs.VALID_DEPLOY_ENVIRONMENTS }}
        hotfix: ${{ fromJSON(steps.validate_deploy_environments.outputs.IS_HOTFIX).hotfix  }}
        nprd_envs: ${{ steps.set_nprd.outputs.nprd_envs }}
        QA_TEST_JSON: ${{ steps.validate_qa.outputs.qa_test_json }}
    steps:
      - name: Create GitHub App token
        id: app_token
        uses: actions/create-github-app-token@v2
        with:
          app-id: ${{ secrets.GH_APP_ID }}
          private-key: ${{ secrets.GH_APP_PRIVATE_KEY }}
          owner: caixagithub

      - name: Checkout do repositório com o script
        uses: actions/checkout@v5
        with:
          repository: caixagithub/DevSecOps-Actions
          path: devsecops-actions
          token: ${{ steps.app_token.outputs.token }}

      - name: Configurar Python
        uses: actions/setup-python@v4
        with:
          python-version: '3.11'

      - name: Cache pip dependencies
        uses: actions/cache@v4
        with:
          path: ~/.cache/pip
          key: ${{ runner.os }}-pip-${{ hashFiles('**/requirements.txt') }}
          restore-keys: |
            ${{ runner.os }}-pip-

      - name: Validar ambientes
        id: validate_deploy_environments
        env:
          DEPLOY_ENVIRONMENTS: ${{ inputs.DEPLOY_ENVIRONMENTS }}
          BRANCH: ${{ github.ref_name }}
          SOLUTION: 'gsc-integration-generic-pipeline'
          TOKEN_GITHUB_ORG: ${{ steps.app_token.outputs.token }}
        run: python devsecops-actions/src/validations/validate-deploy-env.py
        shell: bash

      - name: Validar ambientes de testes automatizados
        id: validate_qa
        uses: caixagithub/DevSecOps-Actions/.github/util/validate_qa_test@main
        with:
          github_token_org: ${{ steps.app_token.outputs.token }}

      - name: Verificação de Segurança GHAS dependabot
        id: dependabot_check
        if: ${{ !fromJSON(steps.validate_deploy_environments.outputs.IS_HOTFIX).hotfix && github.actor != 'devhub-connect-emu-des[bot]' && github.actor != 'devhub-connect-emu[bot]' }}
        uses: caixagithub/DevSecOps-Actions/.github/util/ghas-security-check/dependabot@main
        with:
          github_token: ${{ steps.app_token.outputs.token }}
          repository: ${{ github.repository }}
          dependabot_severity: ${{ vars.GHAS_SEVERIDADE_SEG_ALL_ORG_PIPES_AGIL }}

      - name: Verificação de Segurança GHAS code scanning
        id: code_scanning_check
        if: ${{ !fromJSON(steps.validate_deploy_environments.outputs.IS_HOTFIX).hotfix && github.actor != 'devhub-connect-emu-des[bot]' && github.actor != 'devhub-connect-emu[bot]' }}
        uses: caixagithub/DevSecOps-Actions/.github/util/ghas-security-check/code-scanning@main
        with:
          github_token: ${{ steps.app_token.outputs.token }}
          repository: ${{ github.repository }}
          codeql_severity: ${{ vars.GHAS_SEVERIDADE_SEG_ALL_ORG_PIPES_AGIL }}
          github_branch: ${{ github.ref }}

      - name: Verificação de Segurança GHAS secret scanning
        id: secret_scanning_check
        if: ${{ !fromJSON(steps.validate_deploy_environments.outputs.IS_HOTFIX).hotfix }}
        uses: caixagithub/DevSecOps-Actions/.github/util/ghas-security-check/secret-scanning@main
        with:
          github_token: ${{ steps.app_token.outputs.token }}
          repository: ${{ github.repository }}
          codeql_severity: ${{ vars.GHAS_SEVERIDADE_SEG_ALL_ORG_PIPES_AGIL }}

      - name: Extraindo Tipos de Repositorios
        id: topics_validation
        if: ${{ !fromJSON(steps.validate_deploy_environments.outputs.IS_HOTFIX).hotfix && github.actor != 'devhub-connect-emu-des[bot]' && github.actor != 'devhub-connect-emu[bot]' }}
        env:
          REPOSITORY_TO_VALIDATE: ${{ github.repository }}
          TOKEN_GITHUB_ORG: ${{ steps.app_token.outputs.token }}
        shell: bash
        run: |
          python devsecops-actions/src/validations/validate-topics.py

      - name: Validar Resultados
        id: validate_results
        env:
          DEPENDABOT_CHECK: ${{ steps.dependabot_check.outputs.validation_response }}
          CODE_SCANNING_CHECK: ${{ steps.code_scanning_check.outputs.validation_response }}
          TOPICS_VALIDATION: ${{ steps.topics_validation.outputs.validation_response }}
          SECRET_SCANNING_CHECK: ${{ steps.secret_scanning_check.outputs.validation_response }}
          DEPLOY_ENVS_VALIDATION: ${{ steps.validate_deploy_environments.outputs.validation_response }}
        run: python devsecops-actions/src/validations/validate-steps-logs.py
        shell: bash

      - name: Definir NPRD (lista fixa) como JSON
        id: set_nprd
        run: |
          # Lista fixa em JSON de array
          echo 'nprd_envs=["DES","TST","TQS","SANDBOX","HMP"]' >> "$GITHUB_OUTPUT"

  DOCKERFILE_VALIDATION:
    needs: VALIDATION
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/dockerfile-validation-pipelines.yaml@main
# ========================================================================================================================== #
# Build Job Outputs                                                                                                          #
# ========================================================================================================================== #
# image_tag              -> Usage: ${{ jobs.BUILD.outputs.image_tag }}                                                       #
#                        -> Description: Tag of the built image                                                              #
#                                                                                                                            #
# image_dir              -> Usage: ${{ jobs.BUILD.outputs.image_dir }}                                                       #
#                        -> Description: Directory path where the image is stored                                            #
#                                                                                                                            #
# valid_envs             -> Usage: ${{ jobs.BUILD.outputs.valid_envs }}                                                      #
#                        -> Description: Array of validated environments                                                     #
#                                                                                                                            #
# system                 -> Usage: ${{ jobs.BUILD.outputs.system }}                                                          #
#                        -> Description: Acronym of the system                                                               #
#                                                                                                                            #
# module                 -> Usage: ${{ jobs.BUILD.outputs.module }}                                                          #
#                        -> Description: Module name of the system                                                           #
# ========================================================================================================================== #

  BUILD:
    needs: [VALIDATION, DOCKERFILE_VALIDATION]
    uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-container-build-job.yaml@main
    with:
      DEPLOY_ENVIRONMENTS: ${{ needs.VALIDATION.outputs.valid_deploy_environments }}
      USES_PACKAGES: ${{ fromJSON(inputs.USES_PACKAGES) }}
      USES_NEXUS: false
    secrets:
      GH_APP_ID: ${{ secrets.GH_APP_ID }}
      GH_APP_PRIVATE_KEY: ${{ secrets.GH_APP_PRIVATE_KEY }}
      TOKEN_GITHUB_ORG: ${{ secrets.TOKEN_GITHUB_ORG }}
      client_id_idp_org: ${{ secrets.CLIENT_ID_IDP_ORG }}

  ArgoCD_Deploy:
    needs: [BUILD, VALIDATION]
    uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-argo-cd-deploy-job.yaml@main
    with:
      environments: ${{ toJSON(fromJSON(needs.VALIDATION.outputs.valid_deploy_environments || '["__empty__"]')) }}
      image_tag: ${{ needs.BUILD.outputs.image_tag }}
      image_dir:  ${{ needs.BUILD.outputs.image_dir }}
      registry_url: ${{ needs.BUILD.outputs.registry_url }}
      registry_url_prd: ${{ needs.BUILD.outputs.registry_url_prd }}
      ANSIBLE_USER_ORG: ${{ vars.ANSIBLE_USER_ORG }}
      ARGOCD_SERVER_ORG: ${{ vars.ARGOCD_SERVER_ORG }}
      ARGOCD_USERNAME_ORG: ${{ vars.ARGOCD_USERNAME_ORG }}
      system: ${{ needs.BUILD.outputs.system }}
      module: ${{ needs.BUILD.outputs.module }}
      valid_deploy_environments: ${{ needs.VALIDATION.outputs.valid_deploy_environments }}
      IMPORT_APIM: ${{ inputs.IMPORT_APIM }}
      workflows: gsc
      nprd_envs: ${{ needs.VALIDATION.outputs.nprd_envs }}
      QA_TEST_JSON:  ${{ needs.VALIDATION.outputs.qa_test_json }}
      NEXUS_USER: ${{ vars.NEXUS_USER_ORG }}
    secrets:
      GH_APP_ID: ${{ secrets.GH_APP_ID }}
      GH_APP_PRIVATE_KEY: ${{ secrets.GH_APP_PRIVATE_KEY }}
      CLIENT_ID_IDP_ORG: ${{ secrets.CLIENT_ID_IDP_ORG }}
      ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}
      ARGOCD_PASSWORD_ORG: ${{ secrets.ARGOCD_PASSWORD_ORG }}
      PASS_RTC: ${{ secrets.PASS_RTC }}
      PASS_ITSM: ${{ secrets.PASS_ITSM }}
      LOAD_TEST_SUBSCRIPTION_ORG: ${{ secrets.LOAD_TEST_SUBSCRIPTION_ORG }}
      NEXUS_PASSWORD: ${{ secrets.NEXUS_PASSWORD_ORG }}
