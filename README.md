Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siplx-plataforma-geracao-relatorios
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
CI/CD Workflow Generic
caixagithub/siplx-plataforma-geracao-relatorios_develop_39974702002.12 #12
All jobs
Run details
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
Started 6m 32s ago
Search logs
9s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
58s
0s
7s
0s
0s
0s
5s
0s
0s
0s
0s
0s
21s
5s
1s
0s
0s
4m 43s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/health@main
  with:
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    ARGOCD_APP: siplx-plataforma-geracao-relatorios
    AMBIENTE: DES
    IMAGE_TAG: 39974702002
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    AZ_INSTALL_STATUS: ms_repo_ok
    AZ_VERSION: latest
    INSTALL_PREREQUISITES: true
    AZ_LATEST_VERSION: 2.91.0
    environment: des
    repository_suffix: infranprd
    REPO: siplx-plataforma-geracao-relatorios
    JOB_ID: 167616
    ARGOCD_AUTH_TOKEN: ***
Logging image tag
0s
Run echo "INPUT_IMAGE_TAG: '39974702002'"
    echo "INPUT_IMAGE_TAG: '39974702002'"
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167616
      ARGOCD_AUTH_TOKEN: ***
  INPUT_IMAGE_TAG: '39974702002'
Aguardando processo de SYNC finalizar
Run for i in {1..30}; do
    for i in {1..30}; do
      STATUS=$(curl -s -X GET "https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siplx-plataforma-geracao-relatorios-des" \
      -H "Authorization: ***")
    
      HEALTH=$(echo "$STATUS" | jq -r '.status.health.status')
      SYNCED=$(echo "$STATUS" | jq -r '.status.sync.status')
      PHASE=$(echo "$STATUS" | jq -r '.status.operationState.phase')
      TAG=$(echo "$STATUS" | jq -r '.status.summary.images[0]' | sed 's/.*://')
    
      echo "Tentativa $i - Phase: $PHASE, Health: $HEALTH, Sync: $SYNCED, Argo_Tag: $TAG, Image_Tag: 39974702002"
    
      if [[ "$PHASE" == "Running" ]]; then
        echo "Sync ainda em execução, aguardando..."
      fi
    
      if [[ "$PHASE" == "Failed" ]]; then
        echo "HEALTH_WAS_SUCCESSFUL=false" >> $GITHUB_OUTPUT
    
        echo "A sincronização falhou"
    
        exit 0
      fi
    
      if [[ "$PHASE" == "Succeeded" && "$HEALTH" == "Healthy" && "$SYNCED" == "Synced" && "$TAG" == "39974702002" ]]; then
        echo "Aplicação UP e Sincronizada."
    
        echo "HEALTH_WAS_SUCCESSFUL=true" >> $GITHUB_OUTPUT
    
        exit 0
      fi
    
      sleep 20
    done
    
    echo "HEALTH_WAS_SUCCESSFUL=false" >> $GITHUB_OUTPUT
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.91.0
      environment: des
      repository_suffix: infranprd
      REPO: siplx-plataforma-geracao-relatorios
      JOB_ID: 167616
      ARGOCD_AUTH_TOKEN: ***




esta rodandoasdo aqui
