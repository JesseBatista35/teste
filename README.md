oc get pod -l name=siavl-gerencial-backend-des -n siavl-des --sort-by=.metadata.creationTimestamp


oc rsh <nome-do-pod-mais-recente> -n siavl-des

curl -v http://localhost:8080/actuator/health/readiness
curl -v http://localhost:8080/actuator/health/liveness

oc get pod -l name=siavl-gerencial-backend-des -n siavl-des --sort-by=.metadata.creationTimestamp

last_pod=$(oc get pod -l name=siavl-gerencial-backend-des -n siavl-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}' --sort-by=.metadata.creationTimestamp | tail -n1)
echo "Pod mais recente: $last_pod"

oc rsh $last_pod -n siavl-des
