# Env atual do DC em TQS
oc set env dc/sicbp-avaliarisco-backend-tqs --list -n sicbp-tqs | grep -i swagger

# Comparar com DES (se lá funciona, provavelmente tem a variável)
oc set env dc/sicbp-avaliarisco-backend-des --list -n sicbp-des | grep -i swagger

# ConfigMaps/Secrets referenciados via envFrom
oc get dc/sicbp-avaliarisco-backend-tqs -n sicbp-tqs -o jsonpath='{.spec.template.spec.containers[0].envFrom}'
