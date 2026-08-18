oc set env deployment/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye

oc exec -n sigfa-des sigfa-api-extratos-des-13-vbwx8 -c sigfa-api-extratos-des -- sh -c 'echo "$SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"'

oc set env deployment/<app-irmao-funcionando> -n <namespace> --list | grep -i "smallrye\|vault"

oc get deployment <app-irmao-funcionando> -n <namespace> -o yaml | grep -B3 -A15 "secrets-agent\|beyondtrust\|vault"
