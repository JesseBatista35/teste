oc get secret sicql-mapsfeeder-tqs               -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum
oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum

POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o name | head -1)
echo $POD
oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
