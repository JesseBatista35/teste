
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c sigfa-api-extratos-des -- ls -la /usr/src/app/secrets_files/SIGFA_DES/
error: unable to upgrade connection: container not found ("sigfa-api-extratos-des")
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c sigfa-api-extratos-des -- sh -c 'ls /usr/src/app/secrets_files/SIGFA_DES/ | grep -iE "CLISERGFA_SSO_INTRA|SGFADS01_ORACLE|SIGFA_APIKEY"'
error: unable to upgrade connection: container not found ("sigfa-api-extratos-des")
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sigfa-api-extratos-des-15-sh4lk -n sigfa-des -o jsonpath='{.spec.initContainers[*].name}{"\n"}{.spec.containers[*].name}'
secrets-agent-sidecar secrets-check
sigfa-api-extratos-des-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c <nome-do-container-secrets-agent>
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c secrets-agent-sidecar secrets-check
error: only one of -c or an inline [CONTAINER] arg is allowed
-sh-4.2$
-sh-4.2$
-sh-4.2$
