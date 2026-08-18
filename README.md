cat -A /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA

od -c /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA

exit

oc get pods -n sigfa-des | grep extratos

oc logs -n sigfa-des sigfa-api-extratos-des-16-m75ws -c sigfa-api-extratos-des --tail=60
