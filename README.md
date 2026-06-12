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
  DOCKERFILE_VALIDATION:
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/dockerfile-validation-pipelines.yaml@main

# ========================================================================================================================== #
# Environment Validation Result                                                                                              #
# ========================================================================================================================== #
# valid_deploy_environments -> Usage: ${{ jobs.VALIDATION.outputs.valid_deploy_environments }}                               #
#                           -> Description: Array of validated deploy environments                                           #
# ========================================================================================================================== #
  VALIDATION:
    needs: [DOCKERFILE_VALIDATION]
    uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-validation-job.yaml@main
    with:
      DEPLOY_ENVIRONMENTS: ${{ inputs.DEPLOY_ENVIRONMENTS }}
      SOLUTION: 'GENERIC'
    secrets: inherit


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
    needs: VALIDATION
    uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-container-build-job.yaml@main
    with:
      DEPLOY_ENVIRONMENTS: ${{ needs.VALIDATION.outputs.valid_deploy_environments }}
      USES_PACKAGES: ${{ fromJSON(inputs.USES_PACKAGES) }}
      CLOUD_PROVIDER: ${{ needs.VALIDATION.outputs.cloud_provider }}
    secrets: inherit

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
      workflows: generic
      nprd_envs: ${{ needs.VALIDATION.outputs.nprd_envs }}
      QA_TEST_JSON:  ${{ needs.VALIDATION.outputs.qa_test_json }}
    secrets:
      GH_APP_ID: ${{ secrets.GH_APP_ID }}
      GH_APP_PRIVATE_KEY: ${{ secrets.GH_APP_PRIVATE_KEY }}
      CLIENT_ID_IDP_ORG: ${{ secrets.CLIENT_ID_IDP_ORG }}
      ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}
      ARGOCD_PASSWORD_ORG: ${{ secrets.ARGOCD_PASSWORD_ORG }}
      LOAD_TEST_SUBSCRIPTION_ORG: ${{ secrets.LOAD_TEST_SUBSCRIPTION_ORG }}
