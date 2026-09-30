oc login https://api.produtos4.caixa:6443
# ou com token copiado do console (Copy login command):
# oc login --token=<seu-token> --server=https://api.produtos4.caixa:6443

oc whoami --show-server   # confirmar que mudou
oc get build sirex-agenda-api-63 -n build-images-ads
oc logs build/sirex-agenda-api-63 -n build-images-ads | tail -20
