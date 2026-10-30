oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -A12 -E "livenessProbe:|readinessProbe:"
oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -A12 -E "livenessProbe:|readinessProbe:"

oc exec sihdg-jboss8-hmp-2-76z52 -n sihdg-hmp -- sh -c 'ls -la /opt/eap/bin/*Probe* /opt/server/bin/*Probe* 2>/dev/null'


oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --liveness \
  --initial-delay-seconds=<igual DES> --period-seconds=<igual DES> --failure-threshold=<igual DES> \
  -- /bin/bash -c /opt/eap/bin/livenessProbe.sh

oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --readiness \
  --initial-delay-seconds=<igual DES> --period-seconds=<igual DES> \
  -- /bin/bash -c /opt/eap/bin/readinessProbe.sh

  
