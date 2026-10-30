
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -A12 -E "livenessProbe:|readinessProbe:"
                f:livenessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:readinessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
    manager: Mozilla
    operation: Update
--
                f:livenessProbe:
                  f:httpGet:
                    f:path: {}
                f:readinessProbe:
                  f:httpGet:
                    f:path: {}
                f:volumeMounts:
                  k:{"mountPath":"/sihdg_des"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
            f:volumes:
              k:{"name":"sihdg-sinaf-data-des"}:
                .: {}
                f:name: {}
                f:persistentVolumeClaim:
--
        livenessProbe:
          failureThreshold: 6
          httpGet:
            path: /sihdg-api/health
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 5
        name: sihdg-jboss8-des
        ports:
        - containerPort: 8778
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
          timeoutSeconds: 5
        resources:
          limits:
            cpu: "1"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -A12 -E "livenessProbe:|readinessProbe:"
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
                f:ports:
                  .: {}
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
                  .: {}
                  f:limits:
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
        name: sihdg-jboss8-hmp
        ports:
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
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sihdg-jboss8-hmp-2-76z52 -n sihdg-hmp -- sh -c 'ls -la /opt/eap/bin/*Probe* /opt/server/bin/*Probe* 2>/dev/null'
error: unable to upgrade connection: container not found ("sihdg-jboss8-hmp")
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --liveness \
>   --initial-delay-seconds=<igual DES> --period-seconds=<igual DES> --failure-threshold=<igual DES> \
>   -- /bin/bash -c /opt/eap/bin/livenessProbe.sh
-sh: igual: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set probe dc/sihdg-jboss8-hmp -n sihdg-hmp --readiness \
>   --initial-delay-seconds=<igual DES> --period-seconds=<igual DES> \
>   -- /bin/bash -c /opt/eap/bin/readinessProbe.sh
-sh: igual: Arquivo ou diretório não encontrado
-sh-4.2$
