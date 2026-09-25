name: 'Purge CDN Cache'
description: 'Realiza purge de URLs na CDN'

inputs:
  API_URL:
    description: Endpoint da API
    required: true

  API_TOKEN:
    description: Token de autenticação
    required: true

  CUSTOM_DOMAIN:
    description: Domínio da aplicação
    required: true

outputs:
  response:
    description: Resposta da API
    value: ${{ steps.purge.outputs.response }}

runs:
  using: 'composite'

  steps:
    - name: Purge Cache
      id: purge
      shell: bash
      run: |
        echo "CUSTOM_DOMAIN=${{ inputs.CUSTOM_DOMAIN }}"
        RESPONSE=$(curl -vsS -X POST "${{ inputs.API_URL }}/v4/workspace/purge/wildcard" \
          -H "Authorization: Token ${{ inputs.API_TOKEN }}" \
          -H "Accept: application/json" \
          -H "Content-Type: application/json" \
          -d '{
            "items": [
              "https://${{ inputs.CUSTOM_DOMAIN }}/*"
            ],
            "layer": "cache"
          }')

        echo "$RESPONSE"

        if echo "$RESPONSE" | jq -e '.state == "executed"' > /dev/null; then
          echo "✅ Cache purge successful"
        else
          echo "❌ Cache purge failed"
          exit 1
        fi

        echo "### Purge CDN" >> "$GITHUB_STEP_SUMMARY"
        echo "Purge - Domain: ${{ inputs.CUSTOM_DOMAIN }}" >> "$GITHUB_STEP_SUMMARY"
