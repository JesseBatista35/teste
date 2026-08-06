name: Default container build Workflow
run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}
on:
  workflow_call:
    inputs:
      DEPLOY_ENVIRONMENTS:
        required: true
        type: string
      USES_PACKAGES:
        required: false
        type: boolean
      USES_NEXUS:
        required: false
        type: boolean
      CLOUD_PROVIDER:
        required: false
        type: string
        default: azure
      ORG:
        required: false
        default: caixagithub
        type: string
    secrets:
      client_id_idp_org:
        required: true
      aws_ecr_role:
        required: false
      GH_APP_ID:
        required: true
      GH_APP_PRIVATE_KEY:
        required: true
      TOKEN_GITHUB_ORG:
        required: true
    outputs:
      image_tag:
        description: 'Tag da Imagem'
        value: ${{ jobs.BUILD.outputs.image_tag }}
      image_dir:
        description: 'Diretório da Imagem'
        value: ${{ jobs.BUILD.outputs.image_dir }}
      valid_envs:
        description: 'Environments Válidos'
        value: ${{ jobs.BUILD.outputs.valid_envs }}
      system:
        description: 'Sigla do Sistema'
        value: ${{ jobs.BUILD.outputs.system }}
      module:
        description: 'Módulo do Sistema'
        value: ${{ jobs.BUILD.outputs.module }}
      registry_url:
        description: 'Url do registry'
        value: ${{ jobs.BUILD.outputs.registry_url }}
      registry_url_prd:
        description: 'Url do resgitry of prd'
        value: ${{ jobs.BUILD.outputs.registry_url_prd }}

jobs:
  BUILD:
    runs-on:
      group: Default
    outputs:
      source_digest: ${{ steps.push_image.outputs.source_digest }}
      image_tag: ${{ steps.docker_build.outputs.image_tag }}
      image_dir: ${{ steps.docker_build.outputs.image_dir }}
      registry_url: ${{ steps.docker_build.outputs.registry_url}}
      registry_url_prd: ${{ steps.docker_build.outputs.registry_url_prd}}
      valid_envs: ${{ steps.verificar.outputs.valid_envs }}
      system: ${{ steps.setting_outputs.outputs.system }}
      module: ${{ steps.setting_outputs.outputs.module }}
      nprd_envs: ${{ steps.set_nprd.outputs.nprd_envs }}

    environment: DES
    steps:
    - name: Create GitHub App token for caixagithub
      if: ${{ matrix.environment != 'PFM' }}
      id: app_token-caixagithub
      uses: actions/create-github-app-token@v2
      with:
        app-id: ${{ secrets.GH_APP_ID }}
        private-key: ${{ secrets.GH_APP_PRIVATE_KEY }}
        owner: caixagithub

    - name: Create GitHub App token for caixadepartamental
      if: ${{ matrix.environment != 'PFM' }}
      id: app_token-caixadepartamental
      uses: actions/create-github-app-token@v2
      with:
        app-id: ${{ secrets.GH_APP_ID }}
        private-key: ${{ secrets.GH_APP_PRIVATE_KEY }}
        owner: caixadepartamental

    - name: checkout
      uses: actions/checkout@v5

    - name: Load variables as configmap for caixagithub
      if: ${{ inputs.ORG == 'caixagithub' }}
      uses: caixagithub/DevSecOps-Actions/.github/util/load_variables_from_configmap@main
      with:
        environment: DES
        github_token: ${{ steps.app_token-caixagithub.outputs.token }}
        ORG: ${{ inputs.ORG }}

    - name: Load variables as configmap for caixadepartamental
      if: ${{ inputs.ORG == 'caixadepartamental' }}
      uses: caixagithub/DevSecOps-Actions/.github/util/load_variables_from_configmap@main
      with:
        environment: DES
        github_token: ${{ steps.app_token-caixadepartamental.outputs.token }}
        ORG: ${{ inputs.ORG }}

    - name: Initial Tasks
      if: ${{ inputs.CLOUD_PROVIDER == 'azure'}}
      run: |
        sudo apt-get update && sudo apt-get install tree -y
        sudo ls -ltr
        sudo pwd
        sudo tree ${{ github.workspace }}
      shell: bash

    - name: Setup Azure CLI
      if: ${{ inputs.CLOUD_PROVIDER == 'azure'}}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/azure/installAzCli@main

    - name: Formatando dados SIGLA e MODULO
      id: setting_outputs
      uses: caixagithub/DevSecOps-Actions/.github/util/setting_initial_vars@main

    - name: Docker Container Build
      id: docker_build
      uses: caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
      with:
        buildContext: ${{ github.workspace }}
        sigla: ${{ steps.setting_outputs.outputs.system }}
        modulo: ${{ steps.setting_outputs.outputs.module }}
        uses_packages: ${{ env.USES_PACKAGES || inputs.USES_PACKAGES }}
        uses_nexus: ${{ env.USES_NEXUS || inputs.USES_NEXUS }}
        client_id_runner: ${{  inputs.CLOUD_PROVIDER == 'azure' && secrets.client_id_idp_org || secrets.aws_ecr_role }}
        cloud_provider: ${{ inputs.CLOUD_PROVIDER }}
        github_token_org: ${{ secrets.TOKEN_GITHUB_ORG }}

    - name: Teste
      run: |
        echo "registry_url=$REGISTRY_URL"
        echo "image_dir=$IMAGE_DIR"
      env:
        REGISTRY_URL: ${{ steps.docker_build.outputs.registry_url}}
        IMAGE_DIR: ${{ steps.docker_build.outputs.image_dir }}
