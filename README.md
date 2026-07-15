oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp

oc get pod siabm-autenticacao-api-des-201-vqr9x -n siabm-des -o jsonpath='{.spec.containers[0].image}'
echo

oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-201-vqr9x -n siabm-des


ls -la $JAVA_HOME/jre/lib/ext/
find / -iname "*dinamo*" 2>/dev/null
