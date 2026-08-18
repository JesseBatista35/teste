oc exec -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c sigfa-api-extratos-des -- ls -la /usr/src/app/secrets_files/SIGFA_DES/

oc exec -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c sigfa-api-extratos-des -- sh -c 'ls /usr/src/app/secrets_files/SIGFA_DES/ | grep -iE "CLISERGFA_SSO_INTRA|SGFADS01_ORACLE|SIGFA_APIKEY"'

oc get pod sigfa-api-extratos-des-15-sh4lk -n sigfa-des -o jsonpath='{.spec.initContainers[*].name}{"\n"}{.spec.containers[*].name}'

oc logs -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c <nome-do-container-secrets-agent>

