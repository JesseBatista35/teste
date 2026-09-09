
openssl s_client -connect api.des.caixa:8443 -showcerts </dev/null


oc get deployment siali -n siali-des -o yaml
