oc rsh -c siabm-autenticacao-api-des $(oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}') -n siabm-des


oc debug dc/siabm-autenticacao-api-des -n siabm-des


ls -la /opt/jboss/bin/*Probe* 2>&1
find / -iname "readinessProbe.sh" 2>/dev/null
find / -iname "livenessProbe.sh" 2>/dev/null
