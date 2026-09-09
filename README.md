-sh-4.2$
-sh-4.2$ oc get pvc | grep sihdg
sihdg-backend-data-des   Bound     sihdg-backend-data-des   10Gi       RWX                           167d
sihdg-jboss8-data-des    Bound     sihdg-jboss8-data-des    50Gi       RWX                           8d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv | grep sihdg
sihdg-backend-data-des                                  10Gi       RWX            Retain           Bound         sihdg-des/sihdg-backend-data-des                                                                                        167d
sihdg-backend-data-hmp                                  10Gi       RWX            Retain           Bound         sihdg-hmp/sihdg-backend-data-hmp                                                                                        2y26d
sihdg-backend-data-tqs                                  20Gi       RWX            Retain           Bound         sihdg-tqs/sihdg-backend-data-tqs                                                                                        153d
sihdg-jboss8-data-des                                   50Gi       RWX            Retain           Bound         sihdg-des/sihdg-jboss8-data-des                                                                                         8d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -o yaml | grep -A 20 "volumes:"
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
              k:{"name":"java-config-sihdg-jboss8"}:
                .: {}
                f:configMap:
                  .: {}
                  f:defaultMode: {}
                  f:name: {}
                f:name: {}
              k:{"name":"jboss-config-sihdg-jboss8"}:
                .: {}
                f:configMap:
                  .: {}
                  f:defaultMode: {}
--
      volumes:
      - name: sihdg-jboss8-data-des
        persistentVolumeClaim:
          claimName: sihdg-jboss8-data-des
      - name: caixa-truststore-acteste-nprd
        secret:
          defaultMode: 420
          secretName: caixa-truststore-acteste-nprd
      - configMap:
          defaultMode: 420
          name: jboss-config-sihdg-jboss8
        name: jboss-config-sihdg-jboss8
      - configMap:
          defaultMode: 420
          name: java-config-sihdg-jboss8
        name: java-config-sihdg-jboss8
  test: false
  triggers: []
status:
  availableReplicas: 1
  conditions:
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -o yaml > sihdg-jboss8-des-dc.yaml
-sh-4.2$ oc logs sihdg-jboss8-des-89-deploy
--> Scaling up sihdg-jboss8-des-89 from 0 to 1, scaling down sihdg-jboss8-des-88 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sihdg-jboss8-des-89 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
