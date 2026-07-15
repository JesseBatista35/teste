oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp


oc rsh -c siabm-autenticacao-api-des <nome-do-pod-atual> -n siabm-des

echo $JAVA_HOME
ls -la $JAVA_HOME/jre/lib/ext/
find / -iname "*dinamo*" 2>/dev/null
find / -iname "*ndjca*" 2>/dev/null
