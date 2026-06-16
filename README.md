✅ Comandos corretos:
Já que o rollout #61 está completo, você só precisa fazer:
bash# Inicia um novo rollout com a imagem já atualizada
oc rollout latest dc/sipgc-api-informacoes-tqs -n sipgc-tqs

Se quiser esperar antes:
bashsleep 5  # ← (ortografia correta!)
oc rollout latest dc/sipgc-api-informacoes-tqs -n sipgc-tqs

Para verificar o status:
bash# Ver o histórico de rollouts
oc rollout history dc/sipgc-api-informacoes-tqs -n sipgc-tqs

# Ver o status em tempo real
oc rollout status dc/sipgc-api-informacoes-tqs -n sipgc-tqs

# Ver os pods rodando
oc get pods -n sipgc-tqs -l app=sipgc-api-informacoes-tqs

📝 Resumo para o script do Azure DevOps:
bash#!/bin/bash

# Atualizar imagem
oc set image dc/sipgc-api-informacoes-tqs \
  sipgc-api-informacoes-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-informacoes:1.1.0.14 \
  -n sipgc-tqs

# Aguardar um pouco
sleep 5

# Iniciar novo rollout
oc rollout latest dc/sipgc-api-informacoes-tqs -n sipgc-tqs

# Aguardar conclusão (até 5 minutos)
oc rollout status dc/sipgc-api-informacoes-tqs -n sipgc-tqs --timeout=5m
Isso vai resolver! 🚀
