oc get rc siinp-nucleo-des-313 -n siinp-des -o yaml | grep -A1 'name: SECURITY_CRYPTO_KEY'
oc get rc siinp-nucleo-des-315 -n siinp-des -o yaml | grep -A1 'name: SECURITY_CRYPTO_KEY'


   oc rollout cancel dc/siinp-nucleo-des -n siinp-des

   
