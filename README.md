# remove as probes antigas (exec /opt/jboss/...)
oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --liveness --readiness --remove

# liveness igual ao DES
oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --liveness \
  --get-url=http://:8080/sihdg-api/health \
  --initial-delay-seconds=60 --period-seconds=10 --timeout-seconds=5 --failure-threshold=6

# readiness igual ao DES
oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --readiness \
  --get-url=http://:8080/sihdg-api/health \
  --initial-delay-seconds=30 --period-seconds=10 --timeout-seconds=5 --failure-threshold=5

# conferir
oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -A10 -E "^        (livenessProbe|readinessProbe):"



oc rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
oc get pods -n sihdg-hmp -w | grep jboss8

oc exec <pod-novo> -n sihdg-hmp -- curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/sihdg-api/health
