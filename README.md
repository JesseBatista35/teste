oc get pods | grep mapsfeeder

POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')
oc exec $POD -- curl -s -m 5 -o /dev/null -w '%{http_code}\n' localhost:8080/feeder/
