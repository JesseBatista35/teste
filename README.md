oc get pods -n sihdg-prd | grep jboss8

oc get events -n sihdg-prd --sort-by=.lastTimestamp | grep -i -E "probe|kill|back-off" | tail -20

oc logs dc/sihdg-jboss8-prd -n sihdg-prd --previous | grep -E "sihdgDS|PKIX|WFLYSRV0025|WFLYSRV0026|ERROR" | head -30

oc get dc sihdg-jboss8-prd -n sihdg-prd -o yaml | grep -A10 -E "livenessProbe:|readinessProbe:"
