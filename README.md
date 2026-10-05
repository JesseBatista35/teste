POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')
oc get pod $POD
oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/feeder/


  oc set probe dc/sicql-mapsfeeder-tqs --liveness --readiness --remove
  oc set probe dc/sicql-mapsfeeder-tqs --readiness --open-tcp=8080 --initial-delay-seconds=90 --period-seconds=10
  oc set probe dc/sicql-mapsfeeder-tqs --liveness  --open-tcp=8080 --initial-delay-seconds=180 --period-seconds=20 --failure-threshold=3

  
