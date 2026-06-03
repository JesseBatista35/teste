 readinessProbe:
            httpGet:
              path: /health/ready
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 60
            timeoutSeconds: 5
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sirur-condicoes-negociais-des2-des
          livenessProbe:
            httpGet:
              path: /health/live
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 60
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          env:
