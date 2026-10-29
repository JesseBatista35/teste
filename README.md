
-sh-4.2$
-sh-4.2$ oc get dc siavl-gestaomodelonota-des -n siavl-des -o yaml | grep -B2 -A10 -E 'livenessProbe|readinessProbe'
                f:image: {}
                f:imagePullPolicy: {}
                f:livenessProbe:
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
--
                    f:name: {}
                    f:protocol: {}
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
--
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gestaomodelonota-backend:0.0.0.7
        imagePullPolicy: Always
        livenessProbe:
          failureThreshold: 3
          httpGet:
            path: /actuator/health/liveness
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        name: siavl-gestaomodelonota-des
--
          name: web
          protocol: TCP
        readinessProbe:
          failureThreshold: 3
          httpGet:
            path: /actuator/health/readiness
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        resources:
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siavl-gestaomodelonota-des-2-856xb -n siavl-des -- curl -s -o /dev/null -w '%{http_code}\n' http://localhost:8080/actuator/health
000
command terminated with exit code 7
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siavl-gestaomodelonota-des-2-856xb -n siavl-des -- curl -s -o /dev/null -w '%{http_code}\n' http://localhost:8080<path-da-probe>
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$
