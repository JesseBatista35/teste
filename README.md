-sh-4.2$ oc get dc
NAME                 REVISION   DESIRED   CURRENT   TRIGGERED BY
siorf-backend-des    358        2         2
siorf-frontend-des   193        1         1
-sh-4.2$ oc get dc siorf-backend-des -o yaml | grep -A15 "volumes:"
            f:volumes:
              .: {}
              k:{"name":"accaixa-v4"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
              k:{"name":"dskeystore-siorf-des-jceks"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
--
            f:volumes:
              k:{"name":"siorf-backend-data-des"}:
                .: {}
                f:name: {}
                f:persistentVolumeClaim:
                  .: {}
                  f:claimName: {}
    manager: kubectl-set
    operation: Update
    time: 2026-07-27T20:34:03Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:availableReplicas: {}
        f:conditions:
--
      volumes:
      - name: dskeystore-siorf-des-jceks
        secret:
          defaultMode: 420
          secretName: dskeystore-siorf-des-jceks
      - name: accaixa-v4
        secret:
          defaultMode: 420
          secretName: accaixa-v4
      - name: siorf-backend-data-des
        persistentVolumeClaim:
          claimName: siorf-backend-data-des
      - configMap:
          defaultMode: 420
          name: jboss-config-siorf-backend
        name: jboss-config-siorf-backend
-sh-4.2$ oc get dc siorf-backend-des -o yaml | grep -A20 volumeMounts
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
                  k:{"mountPath":"/opt/jboss/standalone/configuration/dskeystore_siorf_des.jceks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/tmp/standalone-okd.xml"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
--
                f:volumeMounts:
                  k:{"mountPath":"/siorf/Convenio/Resultado"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
            f:volumes:
              k:{"name":"siorf-backend-data-des"}:
                .: {}
                f:name: {}
                f:persistentVolumeClaim:
                  .: {}
                  f:claimName: {}
    manager: kubectl-set
    operation: Update
    time: 2026-07-27T20:34:03Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:availableReplicas: {}
        f:conditions:
--
        volumeMounts:
        - mountPath: /opt/jboss/standalone/configuration/dskeystore_siorf_des.jceks
          name: dskeystore-siorf-des-jceks
          subPath: dskeystore_siorf_des.jceks
        - mountPath: /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
          name: accaixa-v4
          subPath: caixa-truststore-acteste-nprd.jks
        - mountPath: /siorf/Convenio/Resultado
          name: siorf-backend-data-des
        - mountPath: /tmp/standalone-okd.xml
          name: jboss-config-siorf-backend
          subPath: standalone-okd.xml
        - mountPath: /opt/jboss/bin/standalone.conf
          name: java-config-siorf-backend
          subPath: standalone.conf
      dnsPolicy: ClusterFirst
      imagePullSecrets:
      - name: registry-secret
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
-sh-4.2$
