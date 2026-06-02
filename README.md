-sh-4.2$ oc get secret sifug-siofg-api-des -n sifug-des -o jsonpath='{.data.SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}' | base64 -d; echo
/usr/src/app/secrets_files/SIOFG_DES/
-sh-4.2$ oc get secret sifug-siofg-api-des -n sifug-des -o jsonpath='{.data.QUARKUS_SIOFG_IBM_MQ_PASSWORD}' | base64 -d; echo
${SIFUG_XMQD1}
-sh-4.2$ oc get dc/sifug-siofg-api-des -n sifug-des -o yaml | grep -i -A6 volumeMounts
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
            f:restartPolicy: {}
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/script"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
--
        volumeMounts:
        - mountPath: /deployments/caixa-truststore-azure.jks
          name: caixa-truststore-azure
          subPath: caixa-truststore-azure.jks
        - mountPath: /deployments/caixa-truststore-sifug-insights.jks
          name: caixa-truststore-sifug-insights
          subPath: caixa-truststore-sifug-insights.jks
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
        - /bin/bash
        - /script/bt-check.sh
        env:
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
      restartPolicy: Always
      schedulerName: default-scheduler
-sh-4.2$ oc get dc/sifug-siofg-api-des -n sifug-des -o yaml | grep -i -A10 'volumes:'
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
              k:{"name":"caixa-truststore-azure"}:
                .: {}
--
      volumes:
      - name: caixa-truststore-azure
        secret:
          defaultMode: 420
          secretName: caixa-truststore-azure
      - name: caixa-truststore-sifug-insights
        secret:
          defaultMode: 420
          secretName: caixa-truststore-sifug-insights
      - emptyDir:
          medium: Memory
-sh-4.2$
