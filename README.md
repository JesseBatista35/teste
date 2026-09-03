name: Default ArgoCD Deploy Workflow
run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}
on:
  workflow_call:
    inputs:
      environments:
        required: true
        type: string
        description: 'Environment kind'
      type:
        required: false
        type: string
        description: 'Repository type'
      IMPORT_APIM:
        required: false
        type: boolean
        default: false
      ANSIBLE_USER_ORG:
        required: true
        type: string
        description: 'Ansible User'
      ARGOCD_SERVER_ORG:
        required: true
        type: string
        description: 'Server ORG ARGOCD'
      ARGOCD_USERNAME_ORG:
        required: true
        type: string
        description: 'ArgoCD Username'
      image_tag:
        required: true
        type: string
        description: 'Azure Container Registry image tag'
      image_dir:
        required: true
        type: string
        description: 'Azure Container Registry image non production directory'
      image_dir_prd:
        required: false
        type: string
        description: 'Azure Container Registry image production directory'
      repo_name:
        required: false
        type: string
        description: 'Lower case repository name'
      system:
        required: true
        type: string
        description: 'Lower case repository system'
      module:
        required: true
        type: string
        description: 'Lower case repository module'
      repo_infranprd:
        required: false
        type: string
        description: 'Non production infrastructure repository'
      repo_infraprd:
        required: false
        type: string
        description: 'Production infrastructure repository'
      quality_assurance_repo:
        required: false
        type: string
        description: 'Test data repository name'
      valid_deploy_environments:
        required: true
        type: string
        description: 'Valid environments to deploy'
      USER_ITSM:
        required: false
        type: string
        description: 'ITMS User'
      USER_RTC:
        required: false
        type: string
        description: 'RTC User'
      TEMPLATE_MUDANCA:
        required: false
        type: string
        description: 'Change template'
      NAME_TECH:
        required: false
        type: string
        description: 'Tech lead name'
      FONE_TECH:
        required: false
        type: string
        description: 'Tech lead number'
      NAME_GESTOR:
        required: false
        type: string
        description: 'Manager name'
      FONE_GESTOR:
        required: false
        type: string
        description: 'Manager number'
      workflows:
        required: true
        type: string
        description: 'Solution kind'
      registry_url:
        description: 'Full non production registry URL (ex: myregistry.azurecr.io)'
        required: false
        type: string
      registry_url_prd:
        description: 'Full production registry URL (ex: myregistry.azurecr.io)'
        required: false
        type: string
      kubernetes_platform:
        description: 'Kubernets platform (openshift ou aks)'
        required: false
        type: string
        default: 'aks'
      github_org:
        description: 'Organization name'
        type: string
        required: false
        default: 'caixagithub'
      cloud_provider:
        description: 'Cloud provider name'
        type: string
        required: false
        default: 'azure'
      nprd_envs:
        description: 'Non production environments list'
        type: string
        required: false
      QA_TEST_JSON:
        description: 'Validated json with application configured QA automated tests'
        type: string
        required: false
      NEXUS_USER:
        type: string
        required: false
    secrets:
      GH_APP_ID:
        required: true
      GH_APP_PRIVATE_KEY:
        required: true
      CLIENT_ID_IDP_ORG:
        required: true
      ANSIBLE_PASSWORD_ORG:
        required: true
      ARGOCD_PASSWORD_ORG:
        required: true
      PASS_ITSM:
        required: false
      PASS_RTC:
        required: false
      NEXUS_INTERNAL_PASSWORD_ORG:
        required: false
      PIPELINE_AGIL_ORG:
        required: false
      LOAD_TEST_SUBSCRIPTION_ORG:
        required: false
      NEXUS_PASSWORD:
        required: false

jobs:
  ArgoCD_Deploy:
    runs-on: arc-runner-set-default-${{ contains(fromJSON(inputs.nprd_envs), matrix.environment) && 'n' || '' }}prod
    env:
      APIM_VERSIONAPI: ${{ vars.APIM_VERSIONAPI }}
      APIM_displaynameAPI: ${{ vars.APIM_displaynameAPI }}
      APIM_PATH: ${{ vars.APIM_PATH }}
      APIM_SWAGGERPATH: ${{ vars.APIM_SWAGGERPATH }}
      APIM_TAGSAPI: ${{ vars.APIM_TAGSAPI }}
      APIM_POLICIESALLOPERATIONSPATH: ${{ vars.APIM_POLICIESALLOPERATIONSPATH }}
    strategy:
      max-parallel: 1
      fail-fast: true
      matrix:
        environment: ${{ fromJSON(inputs.environments) }}
    environment: ${{ matrix.environment }}
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

    - name: Capture GSC lead time
      if: ${{ matrix.environment == 'PFM' && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/leadTime@main

    - name: Login Itsmts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: login_itsmts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/loginITSMts@main
      with:
        USER_ITSM: ${{ vars.USER_ITSM }}
      env:
        PASS_ITSM: ${{ secrets.PASS_ITSM }}

    - name: Login RTCts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: login_rtcts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/loginRTCts@main
      with:
        USER_RTC: ${{ vars.USER_RTC }}
      env:
        PASS_RTC: ${{ secrets.PASS_RTC }}

    - name: Search Work Item RTCts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: search_work_item_rtcts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/searchWorkItemRTCts@main
      with:
        jsessionid: ${{ steps.login_rtcts.outputs.jsessionid }}
        ltpatoken2: ${{ steps.login_rtcts.outputs.ltpatoken2 }}
        commit_to_find: ${{ steps.login_rtcts.outputs.commit_to_find }}

    - name: Reserve ITSMts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: reserve_itsmts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/reserveITSMts@main
      with:
        environment_name: ${{ matrix.environment }}
        api_token: ${{ steps.login_itsmts.outputs.api_token }}

    - name: Risk questions Itsmts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/riskQuestionsITSMts@main
      with:
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
        reserv_crq: ${{ steps.reserve_itsmts.outputs.reserv_crq }}

    - name: Open Itsmts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/openITSMts@main
      with:
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
        reserv_crq: ${{ steps.reserve_itsmts.outputs.reserv_crq }}
        pr_title: ${{ steps.reserve_itsmts.outputs.pr_title }}
        data_atual: ${{ steps.reserve_itsmts.outputs.data_atual }}
        data_futura: ${{ steps.reserve_itsmts.outputs.data_futura }}
        data_abertura_real: ${{ steps.login_itsmts.outputs.data_abertura_real }}
        run_name: ${{ github.event.repository.name }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}-${{ matrix.environment }}
        TEMPLATE_MUDANCA: ${{ vars.TEMPLATE_MUDANCA }}
        NAME_TECH: ${{ vars.NAME_TECH }}
        FONE_TECH: ${{ vars.FONE_TECH }}
        NAME_GESTOR: ${{ vars.NAME_GESTOR }}
        FONE_GESTOR: ${{ vars.FONE_GESTOR }}

    - name: Find Itsmts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: find_itsmts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/findITSMts@main
      with:
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
        reserv_crq: ${{ steps.reserve_itsmts.outputs.reserv_crq }}

    - name: Closed RTCts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/closedRTCts@main
      with:
        work_item_rtc: ${{ steps.search_work_item_rtcts.outputs.work_item_rtc }}
        jsessionid: ${{ steps.login_rtcts.outputs.jsessionid }}
        ltpatoken2: ${{ steps.login_rtcts.outputs.ltpatoken2 }}

    - name: Insert Notes ITSMts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      id: insert_notes_itsmts
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/insertNotesITSMts@main
      with:
        request_id: ${{ steps.find_itsmts.outputs.request_id }}
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
        reserv_crq: ${{ steps.reserve_itsmts.outputs.reserv_crq }}
        work_item_rtc: ${{ steps.search_work_item_rtcts.outputs.work_item_rtc }}
        build_definition_name: ${{ github.workflow }}
        build_number: ${{ github.run_number }}

    - name: Setup Azure CLI
      uses: caixagithub/DevSecOps-Actions/.github/integrations/azure/install-az-cli@main

    - name: Import ACR image
      if: >-
        ${{ matrix.environment != 'PFM' &&
        matrix.environment == 'PLT' || (matrix.environment == 'PRD' &&
        !contains(inputs.valid_deploy_environments, '"PLT"')) }}
      uses: caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/import_image_to_acr@main
      with:
        client_id_runner: ${{ secrets.CLIENT_ID_IDP_ORG }}
        registry_url: ${{ inputs.registry_url }}
        registry_url_prd: ${{ inputs.registry_url_prd }}
        image_dir: ${{ inputs.image_dir }}
        cloud_provider: ${{ inputs.cloud_provider}}
      env:
        image_tag: ${{ inputs.image_tag }}
        image_dir: ${{ inputs.image_dir }}

    - name: Run Pull Request in repo *-infranprd for ArgoCD NPRD
      if: >-
        ${{ inputs.workflows != 'dep' &&
        matrix.environment != 'PFM' &&
        (matrix.environment == 'DES' || matrix.environment == 'TST' ||
        matrix.environment == 'TQS' || matrix.environment == 'HMP' ||
        matrix.environment == 'SANDBOX') }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/pr@main
      with:
        ambiente: ${{ matrix.environment }}
        TOKEN_GITHUB: ${{ steps.app_token-caixagithub.outputs.token }}
        acr_name: acrcentralcaixanprd
        sigla: ${{ inputs.system }}
        modulo: ${{ inputs.module }}
        registry_url: ${{ inputs.registry_url }}
        image_dir: ${{ inputs.image_dir }}
        image_tag: ${{ inputs.image_tag }}
        github_org: ${{ inputs.github_org }}

    - name: Run Pull Request in repo *-infraprd for ArgoCD PRD
      if: >-
        ${{ inputs.workflows != 'dep' &&
        matrix.environment != 'PFM' &&
        (matrix.environment == 'PLT' || matrix.environment == 'PRD') }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/pr@main
      with:
        ambiente: ${{ matrix.environment }}
        TOKEN_GITHUB: ${{ steps.app_token-caixagithub.outputs.token }}
        acr_name: acrcentralcaixaprd
        sigla: ${{ inputs.system }}
        modulo: ${{ inputs.module }}
        registry_url: ${{ inputs.registry_url_prd }}
        image_dir: ${{ inputs.image_dir }}
        image_tag: ${{ inputs.image_tag }}
        github_org: ${{ inputs.github_org }}

    - name: Run Pull Request in repo *-infranprd for ArgoCD NPRD DEPARTAMENTAL
      if: >-
        ${{ inputs.workflows == 'dep' &&
        matrix.environment != 'PFM' &&
        (matrix.environment == 'DES' || matrix.environment == 'TST' ||
        matrix.environment == 'TQS' || matrix.environment == 'HMP' ||
        matrix.environment == 'SANDBOX') }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/pr@main
      with:
        ambiente: ${{ matrix.environment }}
        TOKEN_GITHUB: ${{ steps.app_token-caixadepartamental.outputs.token }}
        acr_name: acrcentralcaixanprd
        sigla: ${{ inputs.system }}
        modulo: ${{ inputs.module }}
        registry_url: ${{ inputs.registry_url }}
        image_dir: ${{ inputs.image_dir }}
        image_tag: ${{ inputs.image_tag }}
        github_org: ${{ inputs.github_org }}


    - name: Run Pull Request in repo *-infraprd for ArgoCD PRD DEPARTAMENTAL
      if: >-
        ${{ inputs.workflows == 'dep' &&
        matrix.environment != 'PFM' &&
        (matrix.environment == 'PLT' || matrix.environment == 'PRD') }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/pr@main
      with:
        ambiente: ${{ matrix.environment }}
        TOKEN_GITHUB: ${{ steps.app_token-caixadepartamental.outputs.token }}
        acr_name: acrcentralcaixanprd
        sigla: ${{ inputs.system }}
        modulo: ${{ inputs.module }}
        registry_url: ${{ inputs.registry_url_prd }}
        image_dir: ${{ inputs.image_dir }}
        image_tag: ${{ inputs.image_tag }}
        github_org: ${{ inputs.github_org }}

    - name: Prepare JQ e CURL
      if:  ${{ matrix.environment != 'PFM' }}
      uses: caixagithub/DevSecOps-Actions/.github/util/install_jq_curl@main

    - name: REPO
      if:  ${{ matrix.environment != 'PFM' }}
      run: echo "REPO=$(echo '${{ github.repository }}' | cut -d'/' -f2)" >> $GITHUB_ENV

    # [TODO]: Improve this logic to verify a list of non-production environments
    # [TODO]: Join the INFRANPRD and INFRAPRD steps flagging the repository name based on the environment
    - name: PR Approval INFRANPRD
      if: >-
        ${{ inputs.workflows != 'dep' &&
        matrix.environment != 'PFM' && matrix.environment == 'DES' ||
        matrix.environment == 'TST' || matrix.environment == 'TQS' ||
        matrix.environment == 'HMP' || matrix.environment == 'SANDBOX' }}
      run: |
        echo "JOB_TEMPLATE_ID=$JOB_TEMPLATE_ID"

        if [ -z "$REPO_INFRANPRD" ]; then
          REPO_INFRANPRD="${{ env.REPO }}-infranprd"
          REPO_INFRANPRD="$(echo $REPO_INFRANPRD | tr [:upper:] [:lower:])"
        fi

        response=$(curl -X POST -u "$ANSIBLE_USER_ORG:$ANSIBLE_PASSWORD_ORG" \
         "https://ansible-controller-aap.apps.aroidpprd.brazilsouth.aroapp.io/api/v2/job_templates/${JOB_TEMPLATE_ID}/launch/" -k -L \
          -H "Content-Type: application/json" \
          -d '{"extra_vars": {"nome_repo_github": "'"${REPO_INFRANPRD}"'", "GH_ORG": "${{env.GH_ORG}}" }}')
          echo "JOB_ID=$(echo $response | jq -r '.id')" >> $GITHUB_ENV
      env:
        ANSIBLE_USER_ORG: ${{ inputs.ANSIBLE_USER_ORG }}
        ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}
        JOB_TEMPLATE_ID: ${{ inputs.github_org == 'caixagithub' && '12' || '101' }}
        GH_ORG: ${{ inputs.github_org }}
        REPO_INFRANPRD: ${{ inputs.repo_infranprd }}

    - name: PR Approval INFRAPRD
      if: >-
        ${{ inputs.workflows != 'dep' &&
        matrix.environment != 'PFM' &&
        matrix.environment == 'PRD' || matrix.environment == 'PLT' }}
      run: |
        echo "JOB_TEMPLATE_ID=$JOB_TEMPLATE_ID"

        if [ -z "$REPO_INFRAPRD" ]; then
          REPO_INFRAPRD="${{ env.REPO }}-infraprd"
          REPO_INFRAPRD="$(echo $REPO_INFRAPRD | tr [:upper:] [:lower:])"
        fi

        response=$(curl -X POST -u "$ANSIBLE_USER_ORG:$ANSIBLE_PASSWORD_ORG" \
         "https://ansible-controller-aap.apps.aroidpprd.brazilsouth.aroapp.io/api/v2/job_templates/${JOB_TEMPLATE_ID}/launch/" -k -L \
          -H "Content-Type: application/json" \
          -d '{"extra_vars": {"nome_repo_github": "'"${REPO_INFRAPRD}"'", "GH_ORG": "${{env.GH_ORG}}" }}')
          echo "JOB_ID=$(echo $response | jq -r '.id')" >> $GITHUB_ENV
      env:
        ANSIBLE_USER_ORG: ${{ inputs.ANSIBLE_USER_ORG }}
        ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}
        JOB_TEMPLATE_ID: ${{ inputs.github_org == 'caixagithub' && '12' || '101' }}
        GH_ORG: ${{ inputs.github_org }}
        REPO_INFRAPRD: ${{ inputs.repo_infraprd }}

    - name: PR Approval INFRANPRD DEPARTAMENTAL
      if: >-
        ${{ inputs.workflows == 'dep' &&
        matrix.environment != 'PFM' && matrix.environment == 'DES' ||
        matrix.environment == 'TST' || matrix.environment == 'TQS' ||
        matrix.environment == 'HMP' || matrix.environment == 'SANDBOX' }}
      run: |
        response=$(curl -X POST -u "$ANSIBLE_USER_ORG:$ANSIBLE_PASSWORD_ORG" \
         https://ansible-controller-aap.apps.aroidpprd.brazilsouth.aroapp.io/api/v2/job_templates/101/launch/ -k -L \
          -H "Content-Type: application/json" \
          -d '{"extra_vars": {
                "nome_repo_github": "${{ env.REPO }}-infranprd",
                "GH_ORG": "caixadepartamental" }}')
          echo "JOB_ID=$(echo $response | jq -r '.id')" >> $GITHUB_ENV
      env:
        ANSIBLE_USER_ORG: ${{ inputs.ANSIBLE_USER_ORG }}
        ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}

    - name: PR Approval INFRAPRD DEPARTAMENTAL
      if: >-
        ${{ inputs.workflows == 'dep' &&
        matrix.environment != 'PFM' &&
        matrix.environment == 'PRD' || matrix.environment == 'PLT' }}
      run: |
        response=$(curl -X POST -u "$ANSIBLE_USER_ORG:$ANSIBLE_PASSWORD_ORG" \
         https://ansible-controller-aap.apps.aroidpprd.brazilsouth.aroapp.io/api/v2/job_templates/101/launch/ -k -L \
          -H "Content-Type: application/json" \
          -d '{"extra_vars": {
              "nome_repo_github": "${{ env.REPO }}-infraprd",
              "GH_ORG": "caixadepartamental" }}')
          echo "JOB_ID=$(echo $response | jq -r '.id')" >> $GITHUB_ENV
      env:
        ANSIBLE_USER_ORG: ${{ inputs.ANSIBLE_USER_ORG }}
        ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}

    - name: Check Playbook Status
      if: ${{ matrix.environment != 'PFM' }}
      run: |
        while true; do
          STATUS=$(curl -u "$ANSIBLE_USER_ORG:$ANSIBLE_PASSWORD_ORG" \
          https://ansible-controller-aap.apps.aroidpprd.brazilsouth.aroapp.io/api/v2/jobs/${{ env.JOB_ID }}/ -k -L | jq -r '.status')
          if [[ "$STATUS" == "successful" || "$STATUS" == "failed" ]]; then
            echo "Playbook execution status: $STATUS"
            break
          fi
          sleep 10
        done
      env:
        ANSIBLE_USER_ORG: ${{ inputs.ANSIBLE_USER_ORG }}
        ANSIBLE_PASSWORD_ORG: ${{ secrets.ANSIBLE_PASSWORD_ORG }}

    - name: Login ARGOCD
      if: ${{ matrix.environment != 'PFM' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/login@main
      with:
        ARGOCD_SERVER: ${{ inputs.ARGOCD_SERVER_ORG }}
        ARGOCD_USERNAME: ${{ inputs.ARGOCD_USERNAME_ORG }}
        ARGOCD_PASSWORD: ${{ secrets.ARGOCD_PASSWORD_ORG }}

    - name: GET KUBERNATES DESTINATION
      if: ${{ matrix.environment != 'PFM' && inputs.kubernetes_platform == 'openshift' }}
      id: destination
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
      with:
        argocd_server: ${{ inputs.ARGOCD_SERVER_ORG }}
        app_name: ${{ inputs.repo_name || github.event.repository.name }}
        environment: ${{ matrix.environment }}

    - name: SETUP PROJECT
      if: ${{ matrix.environment != 'PFM' && inputs.kubernetes_platform == 'openshift' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/openshift/setup_project@main
      with:
        ansible_user_org: ${{ inputs.ANSIBLE_USER_ORG }}
        ansible_password_org: ${{ secrets.ANSIBLE_PASSWORD_ORG }}
        cluster_url: ${{ steps.destination.outputs.cluster_server }}
        projeto: ${{ inputs.system }}
        ambiente: ${{ matrix.environment }}

    - name: SYNC FORCE ARGOCD PRD
      if: ${{ matrix.environment != 'PFM' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/sync@main
      with:
        ARGOCD_SERVER: "https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io"
        ARGOCD_APP: ${{ inputs.repo_name || github.event.repository.name }}
        AMBIENTE: ${{ matrix.environment }}

    - name: HEALTH CHECK ARGOCD
      id: health_check
      if: ${{ matrix.environment != 'PFM' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/health@main
      with:
        ARGOCD_SERVER: "https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io"
        ARGOCD_APP: ${{ inputs.repo_name || github.event.repository.name }}
        AMBIENTE: ${{ matrix.environment }}
        IMAGE_TAG: ${{ inputs.image_tag }}

    - name: GET PODS LOGS
      if: ${{ matrix.environment != 'PFM' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
      with:
        ARGOCD_SERVER: ${{ vars.ARGOCD_SERVER_ORG }}
        ARGOCD_APP: ${{ github.repository }}
        AMBIENTE: ${{ matrix.environment }}
        IMAGE_TAG: ${{ inputs.image_tag }}
        HEALTH_CHECK_WAS_SUCCESSFUL: ${{ steps.health_check.outputs.health_was_successful }}

    - name: Publish API .Net Template
      if: ${{ matrix.environment != 'PFM' && inputs.IMPORT_APIM == true }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/apim/import/dotnet@main
      with:
        aks_url: ${{ vars.AKS_URL }}
        swagger_path: ${{ vars.SWAGGER_PATH }}
        apim_service_name: ${{ vars.APIM_SERVICE_NAME }}
        resource_group: ${{ vars.RESOURCE_GROUP }}
        apim_name: ${{ vars.APIM_NAME }}
        client_id_runner: ${{ secrets.CLIENT_ID_IDP_ORG }}
        subscription_id: ${{ vars.SUBSCRIPTION_ID }}
        protocolo_conexao: ${{ vars.PROTOCOLO }}
        apim_path_api: ${{ vars.APIM_PATHAPI }}

    - name: OWASP ZAP Scan
      if: ${{ matrix.environment == 'TQS' }}
      continue-on-error: true
      uses: caixagithub/DevSecOps-Actions/.github/security/owaspzap/main@main
      with:
        token: ${{ steps.app_token-caixagithub.outputs.token }}

    #================
    #  Bloco de execuções de testes automatizados na esteira
    #================
    - name: Teste de Api - QA Api Tests
      continue-on-error: true
      if: >-
        ${{ contains(inputs.QA_TEST_JSON, 'teste-api')
            && (matrix.environment == 'tqs' || matrix.environment == 'sandbox')
            && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/automatizados/teste-api/qa-api-tests@main
      with:
        SYSTEM: ${{ inputs.system }}
        QUALITY_ASSURANCE_REPO: ${{ inputs.quality_assurance_repo || format('{0}-qualidade', inputs.system) }}
        MODULE: ${{ inputs.module }}
        PACKAGE_JSON_PATH: "."
        TOKEN_GITHUB: ${{ steps.app_token-caixagithub.outputs.token }}
        NEXUS_USER: ${{ inputs.NEXUS_USER }}
        NEXUS_PASSWORD: ${{ secrets.NEXUS_PASSWORD }}

    - name: Teste de Performance - Azure Load Testing
      continue-on-error: true
      if: >-
        ${{ contains(inputs.QA_TEST_JSON, 'teste-performance')
            && (matrix.environment == 'tqs' || matrix.environment == 'sandbox')
            && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/automatizados/teste-performance/azure-load-testing@main
      with:
        SYSTEM: ${{ inputs.system }}
        QUALITY_ASSURANCE_REPO: ${{ inputs.quality_assurance_repo || format('{0}-qualidade', inputs.system) }}
        MODULE: ${{ inputs.module }}
        TOKEN_GITHUB: ${{ steps.app_token-caixagithub.outputs.token }}
        CLIENT_ID_IDP_ORG: ${{ secrets.CLIENT_ID_IDP_ORG }}
        LOAD_TEST_SUBSCRIPTION: ${{ secrets.LOAD_TEST_SUBSCRIPTION_ORG }}

    - name: Teste de Acessibilidade - Axe Tools
      continue-on-error: true
      if: >-
        ${{ contains(inputs.QA_TEST_JSON, 'teste-acessibilidade')
            && (matrix.environment == 'tqs' || matrix.environment == 'sandbox')
            && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Qualidade/.github/automatizados/teste-acessibilidade/axe-tools@main
      with:
        SYSTEM: ${{ inputs.system }}
        QUALITY_ASSURANCE_REPO: ${{ inputs.system }}-qualidade
        MODULE: ${{ inputs.module }}
        TOKEN_GITHUB: ${{ steps.app_token-caixagithub.outputs.token }}
        NEXUS_USER: ${{ inputs.NEXUS_USER }}
        NEXUS_PASSWORD: ${{ secrets.NEXUS_PASSWORD }}
        JAVA_VERSION: '17'
        SELENIUM_GRID_URL: 'https://selenium-router-selenium-grid.apps.produtos4.caixa'

    #================

    - name: Closed ITSMts
      if: ${{ matrix.environment == 'PRD' && inputs.workflows == 'gsc' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/closedITSMts@main
      with:
        request_id: ${{ steps.find_itsmts.outputs.request_id }}
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
        data_fut_final: ${{ steps.insert_notes_itsmts.outputs.data_fut_final }}

    - name: Logout ITSMts
      if: ${{ always() && matrix.environment == 'PRD' && inputs.workflows == 'gsc' && steps.login_itsmts.outputs.api_token != '' }}
      uses: caixagithub/DevSecOps-Actions/.github/integrations/sigsc/logoutITSMts@main
      with:
        api_token: ${{ steps.login_itsmts.outputs.api_token }}
