name: Publish API Template
description: Importa o swagger da aplicação para o APIM

inputs:
  aks_url:
    required: true
  swagger_path:
    required: true
  resource_group:
    required: true
  apim_name:
    required: true
  client_id_runner:
    required: true
  subscription_id:
    required: true
  apim_service_name:
    required: true
  protocolo_conexao:
    required: true
  apim_path_api:
    required: true

runs:
  using: "composite"
  steps:
    - name: Install Az CLI
      run: |
        curl -sL https://aka.ms/InstallAzureCLIDeb | sudo bash
        sudo az aks install-cli
      shell: bash

    - name: Login on Azure
      run: |
        az login --identity --client-id ${{ inputs.client_id_runner }} --output none
        az account set -s ${{ inputs.subscription_id }}
      shell: bash

    - name: Publish API to APIM
      run: |
        set -x  # Ativa o modo de depuração
        echo "Iniciando a publicação da API para APIM..."

        swaggerUrl="${{ inputs.protocolo_conexao }}://${{ inputs.aks_url }}/${{ inputs.swagger_path }}"
        echo "Verificando a URL do Swagger: $swaggerUrl"
        httpStatus=$(curl -k --max-time 10 --write-out "%{http_code}" --silent --output /dev/null $swaggerUrl)
        echo "HTTP STATUS=$httpStatus"

        if [ "$httpStatus" -eq 200 ]; then
          echo "Swagger JSON encontrado na URL padrão. Prosseguindo com a validação..."
          curl -k -o swagger.json "$swaggerUrl"
          echo "Swagger JSON baixado com sucesso."

          az apim api import --api-id ${{ inputs.apim_service_name }} \
          --resource-group ${{ inputs.resource_group }} \
          --service-name ${{ inputs.apim_name }} \
          --service-url ${{ inputs.protocolo_conexao }}://${{ inputs.aks_url }} \
          --path ${{ inputs.apim_path_api }} \
          --specification-format "OpenApi" \
          --specification-path swagger.json \
          --display-name ${{ inputs.apim_service_name }} \
          --subscription-required false --verbose
          echo "API importada com sucesso no APIM."

          echo "Acesse: ${{ inputs.protocolo_conexao }}://${{ inputs.aks_url }}/${{ inputs.swagger_path }}"

        else
          echo "Swagger JSON não encontrado ou erro ao acessar $swaggerUrl. Código de status HTTP: $httpStatus. A publicação foi cancelada."
          exit 1
        fi
        set +x  # Desativa o modo de depuração
      shell: bash
