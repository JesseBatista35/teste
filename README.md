oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp


oc rsh -c siabm-autenticacao-api-des <nome-do-pod-atual> -n siabm-des


ls -la $JAVA_HOME/jre/lib/ext/ 2>&1
find / -iname "*dinamo*" 2>/dev/null
find / -iname "*ndjca*" 2>/dev/null
find / -iname "*trueaccess*" 2>/dev/null

