# 1. O DC ainda existe?
oc get dc/simpi-med-des -n simpi-des

# 2. Se existir, qual o estado do rollout?
oc rollout status dc/simpi-med-des -n simpi-des

# 3. Eventos recentes do namespace (mostra se algo foi deletado, falhou o pull da imagem, etc)
oc get events -n simpi-des --sort-by='.lastTimestamp' | tail -30
