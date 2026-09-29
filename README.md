
oc get route -A | grep -i sipar-inter


oc get route -n NOME_DO_NS -o yaml | grep -B2 -A8 "tls:"

