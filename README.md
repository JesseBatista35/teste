oc describe pod $POD | grep -E -A5 "Last State"
oc get events | grep $POD | grep -Ei 'probe|kill' | tail -5

oc set probe dc/sicql-mapsfeeder-tqs --liveness --readiness --remove
oc set probe dc/sicql-mapsfeeder-tqs --readiness --open-tcp=8080 --initial-delay-seconds=90 --period-seconds=10
oc set probe dc/sicql-mapsfeeder-tqs --liveness --open-tcp=8080 --initial-delay-seconds=180 --period-seconds=20 --failure-threshold=3


oc get dc sicql-mapsfeeder-tqs -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}{"\n"}{.spec.template.spec.containers[0].readinessProbe}{"\n"}'
oc get pods -w | grep mapsfeeder


POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')
oc exec $POD -- curl -s -m 5 -o /dev/null -w '%{http_code}\n' localhost:8080/feeder/
