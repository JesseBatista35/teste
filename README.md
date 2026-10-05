
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod $POD
NAME                           READY     STATUS    RESTARTS      AGE
sicql-mapsfeeder-tqs-3-dqrhg   0/1       Running   1 (90s ago)   3m34s
-sh-4.2$ oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness

^[[A^C
-sh-4.2$ oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
error: Internal error occurred: error executing command in container: container is not created or running
-sh-4.2$
