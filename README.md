
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --liveness --readiness --remove
deploymentconfig.apps.openshift.io/sihdg-jboss8-prd probes updated
-sh-4.2$
-sh-4.2$ oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --liveness \
>   --get-url=http://:8080/sihdg-api/health \
>   --initial-delay-seconds=60 --period-seconds=10 --timeout-seconds=5 --failure-threshold=6
deploymentconfig.apps.openshift.io/sihdg-jboss8-prd probes updated
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/sihdg-jboss8-prd -n sihdg-prd --readiness \
>   --get-url=http://:8080/sihdg-api/health \
>   --initial-delay-seconds=30 --period-seconds=10 --timeout-seconds=5 --failure-threshold=5
deploymentconfig.apps.openshift.io/sihdg-jboss8-prd probes updated
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-prd -n sihdg-prd -o yaml | grep -A8 -E "^        (livenessProbe|readinessProbe):"
        livenessProbe:
          failureThreshold: 6
          httpGet:
            path: /sihdg-api/health
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
--
        readinessProbe:
          failureThreshold: 5
          httpGet:
            path: /sihdg-api/health
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 30
          periodSeconds: 10
          successThreshold: 1
-sh-4.2$
