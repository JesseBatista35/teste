
-sh-4.2$
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o yaml | grep -A 3 -i "secretKeyRef\|valueFrom"
                    f:valueFrom:
                      .: {}
                      f:secretKeyRef: {}
                  k:{"name":"CLIENT_SECRET"}:
                    .: {}
                    f:name: {}
                    f:valueFrom:
                      .: {}
                      f:secretKeyRef: {}
                  k:{"name":"SECRETS_LIST"}:
                    .: {}
                    f:name: {}
--
          valueFrom:
            secretKeyRef:
              key: BT_CLIENT_ID
              name: bt-client-secret-sicfd-monitoramento-des
        - name: CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              key: BT_CLIENT_SECRET
              name: bt-client-secret-sicfd-monitoramento-des
        - name: BT_API_VERSION
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
