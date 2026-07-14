# 1. Ver todos os pods do RC que falhou, mesmo os que crasharam/terminaram
oc get pods -n simpi-des -l deploymentconfig=simpi-med-des --show-labels

# 2. Descrever o RC da revisão 4 pra ver o motivo da falha (evento de scheduling, pull de imagem, etc)
oc describe rc/simpi-med-des-4 -n simpi-des

# 3. Se algum pod aparecer (mesmo em CrashLoopBackOff ou Error), pegar o log dele
oc logs -n simpi-des <nome-do-pod> --previous

