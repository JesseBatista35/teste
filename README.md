oc logs siabm-autenticacao-api-des-195-zvv72 -n siabm-des


oc rollout pause dc/siabm-autenticacao-api-des -n siabm-des


oc get pod siabm-autenticacao-api-des-195-zvv72 -n siabm-des -o jsonpath='{.spec.containers[*].image}'
