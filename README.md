#!/bin/bash
set -e

# 1. Verificar imagem
curl --location --request GET \
  https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14 \
  --header 'Authorization: Bearer ***' \
  --header 'Content-Type: text/plain' \
  -s -k -o /dev/null -w '%{http_code}'

# 2. APENAS atualizar a imagem
oc set image dc/sipgc-api-informacoes-tqs \
  sipgc-api-informacoes-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-informacoes:1.1.0.14 \
  -n sipgc-tqs

# 3. APENAS aguardar o rollout terminar
oc rollout status dc/sipgc-api-informacoes-tqs -n sipgc-tqs --watch

echo "✅ Deploy concluído com sucesso!"
