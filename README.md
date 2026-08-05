sh-4.2$ oc get dc
NAME                 REVISION   DESIRED   CURRENT   TRIGGERED BY
siorf-backend-tqs    123        1         1
siorf-frontend-tqs   73         1         1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment
No resources found.
-sh-4.2$ oc get deployment
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siorf-backend-tqs -o yaml | grep -A15 "volumes:"
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd-jks"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
              k:{"name":"caixa-truststore-azure2023v3-jks"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
--
      volumes:
      - name: caixa-truststore-loginmicrosoftv2-jks
        secret:
          defaultMode: 420
          secretName: caixa-truststore-loginmicrosoftv2-jks
      - name: caixa-truststore-azure2023v3-jks
        secret:
          defaultMode: 420
          secretName: caixa-truststore-azure2023v3-jks
      - name: dskeystore-siorf-tqs-jceks
        secret:
          defaultMode: 420
          secretName: dskeystore-siorf-tqs-jceks
      - name: caixa-truststore-acteste-nprd-jks
        secret:
          defaultMode: 420
-sh-4.2$ oc get dc siorf-backend-tqs -o yaml | grep -A20 volumeMounts
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/opt/jboss/bin/standalone.conf"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/opt/jboss/standalone/configuration/caixa-truststore-azure2023v3.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/opt/jboss/standalone/configuration/caixa-truststore-loginmicrosoftv2.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
--
        volumeMounts:
        - mountPath: /opt/jboss/standalone/configuration/caixa-truststore-loginmicrosoftv2.jks
          name: caixa-truststore-loginmicrosoftv2-jks
          subPath: caixa-truststore-loginmicrosoftv2.jks
        - mountPath: /opt/jboss/standalone/configuration/caixa-truststore-azure2023v3.jks
          name: caixa-truststore-azure2023v3-jks
          subPath: caixa-truststore-azure2023v3.jks
        - mountPath: /opt/jboss/standalone/configuration/dskeystore_siorf_tqs.jceks
          name: dskeystore-siorf-tqs-jceks
          subPath: dskeystore_siorf_tqs.jceks
        - mountPath: /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd-jks
          subPath: caixa-truststore-acteste-nprd.jks
        - mountPath: /tmp/standalone-okd.xml
          name: jboss-config-siorf-backend
          subPath: standalone-okd.xml
        - mountPath: /opt/jboss/bin/standalone.conf
          name: java-config-siorf-backend
          subPath: standalone.conf
      dnsPolicy: ClusterFirst
      imagePullSecrets:
-sh-4.2$
