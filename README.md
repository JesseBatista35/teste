oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --liveness --readiness --remove

oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --liveness \
  --get-url=http://:8080/sihdg-api/health \
  --initial-delay-seconds=60 --period-seconds=10 --timeout-seconds=5 --failure-threshold=6

oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --readiness \
  --get-url=http://:8080/sihdg-api/health \
  --initial-delay-seconds=30 --period-seconds=10 --timeout-seconds=5 --failure-threshold=5

oc get dc sihdg-jboss8-prd -n sihdg-prd -o yaml | grep -A8 -E "^        (livenessProbe|readinessProbe):"
