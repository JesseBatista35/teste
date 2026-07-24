
-sh-4.2$ oc get dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des -o yaml | grep -E -A15 "livenessProbe|readinessProbe"
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
                f:name: {}
                f:ports:
                  .: {}
                  k:{"containerPort":8080,"protocol":"TCP"}:
                    .: {}
--
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
                f:resources:
                  .: {}
                  f:limits:
                    .: {}
                    f:cpu: {}
--
                f:livenessProbe:
                  f:httpGet:
                    f:path: {}
                f:readinessProbe:
                  f:httpGet:
                    f:path: {}
    manager: Mozilla
    operation: Update
    time: 2026-07-23T18:54:23Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:template:
          f:spec:
            f:containers:
              k:{"name":"sipcs-digital-pay-provisionamento-visa-des"}:
                f:env:
                  k:{"name":"API_MANAGER_URL"}:
--
        livenessProbe:
          failureThreshold: 3
          httpGet:
            path: /cartoes/cartao-credito/digital-pay/provisionamento/visa/health/live
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 15
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        name: sipcs-digital-pay-provisionamento-visa-des
        ports:
        - containerPort: 8080
          protocol: TCP
        readinessProbe:
          failureThreshold: 3
          httpGet:
            path: /cartoes/cartao-credito/digital-pay/provisionamento/visa/health/ready
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
            cpu: 30m
-sh-4.2$ oc get dc -n sipcs-des | grep visa
sipcs-digital-pay-criptografia-visa-des      3          1         1
sipcs-digital-pay-provisionamento-visa-des   16         1         1
-sh-4.2$ oc get pods -n sipcs-des -l name=sipcs-digital-pay-provisionamento-visa-des
NAME                                                  READY     STATUS             RESTARTS      AGE
sipcs-digital-pay-provisionamento-visa-des-10-4h6r5   0/1       CrashLoopBackOff   4 (15s ago)   116s
sipcs-digital-pay-provisionamento-visa-des-16-m66cr   0/1       Running            5 (9s ago)    6m9s
-sh-4.2$
