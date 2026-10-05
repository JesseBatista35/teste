oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi

oc get dc sicql-mapspegasusenquadramento-tqs -o yaml | grep -B2 -A4 -E 'secretKeyRef|envFrom'
oc get secret | grep -Ei 'enquadramento|feeder'

  curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
