
-sh-4.2$ oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o yaml | grep -A 10 -E "livenessProbe|readinessProbe"
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
        name: sispl-processamento-sumarizacao-des
        ports:
        - containerPort: 8080
          name: web
          protocol: TCP
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
        resources:
          limits:
            cpu: "1"
            memory: 2Gi
          requests:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' echo oc
Error from server (NotFound): deployments.apps "echo" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}' echo
-sh: get: comando não encontrado
-sh-4.2$
