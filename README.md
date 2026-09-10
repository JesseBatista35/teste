
-sh-4.2$ oc get dc sihdg-jboss8-des -o yaml | grep -A 5 "sihdg-sinaf-data-des"
              k:{"name":"sihdg-sinaf-data-des"}:
                .: {}
                f:name: {}
                f:persistentVolumeClaim:
                  .: {}
                  f:claimName: {}
--
          name: sihdg-sinaf-data-des
        - mountPath: /sihdg_des
          name: sihdg-jboss8-data-des
        - mountPath: /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd
          subPath: caixa-truststore-acteste-nprd.jks
--
      - name: sihdg-sinaf-data-des
        persistentVolumeClaim:
          claimName: sihdg-sinaf-data-des
      - name: sihdg-jboss8-data-des
        persistentVolumeClaim:
          claimName: sihdg-jboss8-data-des
      - name: caixa-truststore-acteste-nprd
        secret:
-sh-4.2$
