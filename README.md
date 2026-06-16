#!/bin/bash
set -e

# 1. Atualizar imagem
oc set image dc/sipgc-api-informacoes-tqs \
  sipgc-api-informacoes-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-informacoes:1.1.0.14 \
  -n sipgc-tqs

# 2. Aguardar conclusão (NÃO tente fazer rollout latest novamente!)
sleep 5

# 3. Monitorar o status COM watch (sem --timeout)
oc rollout status dc/sipgc-api-informacoes-tqs -n sipgc-tqs --watch
