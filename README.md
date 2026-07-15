oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp

oc rsh -c siabm-autenticacao-api-des <nome-do-pod> -n siabm-des

ls -la /opt/jboss/bin/*Probe* 2>&1
find / -iname "readinessProbe.sh" 2>/dev/null
find / -iname "livenessProbe.sh" 2>/dev/null
cat /opt/jboss/bin/standalone.conf | head -3
