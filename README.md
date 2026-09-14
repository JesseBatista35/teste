# o nome do pod muda a cada restart, então pega o atual
oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des

# log do init container que busca os segredos - esse é o mais importante agora
oc logs <nome-do-pod-atual> -n siinp-des -c secrets-check

# status geral, mostra se o init container falhou e por quê
oc describe pod <nome-do-pod-atual> -n siinp-des

oc get configmap siinp-nucleo-des-script-bt-check -n siinp-des -o yaml
