
-sh-4.2$
-sh-4.2$ oc get deployment silce-consulta-apostas-api-des -n silce-des -o yaml | grep -A 15 readinessProbe
                f:readinessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:path: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:resources:
                  .: {}
                  f:limits:
                    .: {}
--
        readinessProbe:
          failureThreshold: 3
          httpGet:
            path: /q/health/ready
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 25
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 5
        resources:
          limits:
            cpu: "1"
            memory: 1Gi
          requests:
            cpu: "1"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod -l app=silce-consulta-apostas-api-des -n silce-des | grep -A 20 "Liveness\|Readiness\|Limits\|Requests"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc adm top pod -l app=silce-consulta-apostas-api-des -n silce-des
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
