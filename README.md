# 1. Por que o rollout 81 falhou
oc logs sirex-agenda-api-des-81-deploy

# 2. Qual imagem o 81 tentou usar (e qual o 80 usa)
oc get rc sirex-agenda-api-des-81 sirex-agenda-api-des-80 \
  -o jsonpath='{range .items[*]}{.metadata.name}{"\t"}{.spec.template.spec.containers[0].image}{"\n"}{end}'

# 3. Eventos recentes (pull, crash, probe)
oc get events --sort-by=.lastTimestamp | grep -i agenda-api | tail -20

# 4. Java da versão que está no ar (baseline do builder antigo)
oc exec sirex-agenda-api-des-80-48n9b -- java -version
