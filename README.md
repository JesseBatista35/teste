oc whoami
oc project siinp-des

# O DC existe mesmo, com esse nome exato?
oc get dc siinp-nucleo-des -n siinp-des

# Se não existir como DC, será que virou Deployment (k8s nativo)?
oc get deployment -n siinp-des | grep -i siinp-nucleo

# Confirma o nome do container dentro do DC
oc get dc siinp-nucleo-des -n siinp-des -o jsonpath='{.spec.template.spec.containers[*].name}{"\n"}'

# Roda o comando exato do script, isolado, pra ver o erro real sem o pipeline no meio
oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des --list -c "siinp-nucleo-des"
