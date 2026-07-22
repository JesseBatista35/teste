name: 'ARGOCD GET POD LOGS'
description: 'ARGOCD GET LOGS PODS'

inputs:
  ARGOCD_SERVER:
    description: 'Argo SERVER'
    required: true
    type: string
  ARGOCD_APP:
    description: 'ARGOCD_APP'
    required: true
    type: string
  AMBIENTE:
    description: 'AMBIENTE'
    required: true
    type: string
  IMAGE_TAG:
    description: 'TAG repo infra'
    required: true
    type: string
  HEALTH_CHECK_WAS_SUCCESSFUL:
    required: true
    type: string
runs:
  using: "composite"
  steps:
    - name: Formate ARGO REPOSITORY
      run: |
        echo "REPO_NAME=$(echo '${{ inputs.ARGOCD_APP }}' | cut -d'/' -f2)" >> $GITHUB_ENV
        echo "INPUT_IMAGE_TAG: '${{ inputs.IMAGE_TAG }}'"
        echo "AMBIENTE_LOWER=$(echo '${{ inputs.AMBIENTE }}' | tr '[:upper:]' '[:lower:]')" >> $GITHUB_ENV
      shell: bash

    - name: Coletando logs dos pods
      run: |
        RESOURCE_TREE_URL="${{ inputs.ARGOCD_SERVER }}/api/v1/applications/${{ env.REPO_NAME }}-${{ env.environment }}/resource-tree?appNamespace=openshift-gitops"
        echo "Fazendo requisição para: ${RESOURCE_TREE_URL}"

        RESOURCE_TREE_JSON=$(curl -s -H "Authorization: Bearer ${ARGOCD_AUTH_TOKEN}" "${RESOURCE_TREE_URL}")
        if [ $? -ne 0 ]; then
          echo "Erro ao fazer requisição para o resource-tree"
          exit 1
        fi

        echo "Resource-tree obtido com sucesso"

        echo "Filtrando pods e encontrando o mais recente..."

        LATEST_POD=$(echo "$RESOURCE_TREE_JSON" | jq -r '
          .nodes // [] |
          map(select(.kind == "Pod" and .createdAt != null)) |
          sort_by(.createdAt) |
          last |
          .name // empty
        ')

        if [ -z "$LATEST_POD" ]; then
          echo "Nenhum pod encontrado ou JSON não contém dados esperados"
          exit 0
        fi

        echo "Pod mais recente encontrado: ${LATEST_POD}"

        LOGS_URL="${{ inputs.ARGOCD_SERVER }}/api/v1/applications/${{ env.REPO_NAME }}-${{ env.environment }}/logs?appNamespace=openshift-gitops&container=${{ env.REPO_NAME }}-${{ env.environment }}&namespace=${{ env.REPO_NAME }}&follow=false&podName=${LATEST_POD}&tailLines=1000&sinceSeconds=0"
        echo "URL dos logs: ${LOGS_URL}"

        LOGS_RESPONSE=$(curl -s -H "Authorization: Bearer ${ARGOCD_AUTH_TOKEN}" "${LOGS_URL}")

        if [ $? -ne 0 ]; then
          echo "Erro ao obter logs do pod"
          exit 1
        fi

        echo "Logs obtidos com sucesso"
        echo "Logs do pod ${LATEST_POD}:"
        echo "================================================"

        echo "Exibindo os Logs:"
        echo "$LOGS_RESPONSE" | jq -r '.result.content'

        echo "================================================"
        echo "Script executado com sucesso!"
        echo "Pod utilizado: ${LATEST_POD}"

        if [ "${{ inputs.HEALTH_CHECK_WAS_SUCCESSFUL }}" = "false" ]; then
          echo "Falha na sincronização"
          exit 1
        fi
      shell: bash
