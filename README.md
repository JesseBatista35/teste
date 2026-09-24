oc get pods -n sihdg-des -l name=sihdg-jboss8-des --sort-by=.metadata.creationTimestamp

oc rollout latest dc/sihdg-jboss8-des -n sihdg-des

oc debug dc/sihdg-jboss8-des -n sihdg-des -- bash -c '
  ls -l /opt/server/bin/java.security.override
  java -Djava.security.properties=/opt/server/bin/java.security.override \
       -XshowSettings:security:properties -version 2>&1 | grep disabledAlgorithms'

       POD=$(oc get pod -l name=sihdg-jboss8-des -n sihdg-des --sort-by=.metadata.creationTimestamp -o name | tail -1)
oc logs -f $POD -n sihdg-des | grep -E "WFLYSRV0025|WFLYSRV0026|SHA1withRSA|sihdgDS"
