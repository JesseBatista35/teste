oc get pod simpi-dict-api-des-12-2h7h2 -o jsonpath='{.spec.containers[*].name}{"\n"}'


oc describe pod simpi-dict-api-des-12-2h7h2 -n simpi-des

oc logs simpi-dict-api-des-12-2h7h2 -c simpi-dict-api-des -n simpi-des --previous

oc logs simpi-dict-api-des-12-2h7h2 -c <nome-sidecar-bt> -n simpi-des

oc exec simpi-dict-api-des-12-2h7h2 -c simpi-dict-api-des -n simpi-des -- sh -c 'echo VAULT_LOCATION=$VAULT_LOCATION; ls -la $VAULT_LOCATION 2>&1; find /usr/src/app/secrets_files -type f 2>&1'

oc get pods -n simpi-des -w
