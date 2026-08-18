oc set env dc/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye

oc get pods -n sigfa-des | grep sigfa-api-extratos-des | grep -v deploy

oc logs -n sigfa-des $(oc get pods -n sigfa-des | grep sigfa-api-extratos-des | grep -v deploy | awk '{print $1}') -c sigfa-api-extratos-des --tail=50


oc exec -n sigfa-des <POD> -c sigfa-api-extratos-des -- sh -c 'echo "$SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"'

