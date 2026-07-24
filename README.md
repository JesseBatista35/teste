# ver o estado atual do pod e contagem de restarts
oc get pod -l name=siavl-enviomsgativa-microfront-des -n siavl-des

# pegar o yaml completo do pod pra ver env vars e volumes montados
oc get pod siavl-enviomsgativa-microfront-des-3-xjh66 -n siavl-des -o yaml

# se o script vier de configmap, listar e inspecionar
oc get configmap -n siavl-des | grep -i siavl-enviomsgativa
oc describe configmap <nome-do-configmap> -n siavl-des
