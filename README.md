
You have access to 355 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sihdg-prd | grep jboss8
sihdg-jboss8-prd-3-deploy      0/1       Error       0          41m
sihdg-jboss8-prd-4-deploy      0/1       Error       0          29m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sihdg-prd --sort-by=.lastTimestamp | grep -i -E "probe|kill|back-off" | tail -20
F1111 10:52:27.261740   46955 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs dc/sihdg-jboss8-prd -n sihdg-prd --previous | grep -E "sihdgDS|PKIX|WFLYSRV0025|WFLYSRV0026|ERROR" | head -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-prd -n sihdg-prd -o yaml | grep -A10 -E "livenessProbe:|readinessProbe:"
                f:livenessProbe:
                  .: {}
                  f:exec:
                    .: {}
                    f:command: {}
                  f:failureThreshold: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:name: {}
--
                f:readinessProbe:
                  .: {}
                  f:exec:
                    .: {}
                    f:command: {}
                  f:failureThreshold: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:resources:
--
        livenessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/livenessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 1
--
        readinessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/readinessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 1
-sh-4.2$
