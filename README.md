oc describe pod $POD | grep -E -A5 "Last State"
oc get events | grep $POD | grep -Ei 'probe|kill' | tail -5

oc set probe dc/sicql-mapsfeeder-tqs --liveness --readiness --remove
oc set probe dc/sicql-mapsfeeder-tqs --readiness --open-tcp=8080 --initial-delay-seconds=90 --period-seconds=10
oc set probe dc/sicql-mapsfeeder-tqs --liveness --open-tcp=8080 --initial-delay-seconds=180 --period-seconds=20 --failure-threshold=3
