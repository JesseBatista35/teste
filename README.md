h-4.2$
-sh-4.2$ oc exec dc/sihdg-jboss8-hmp -n sihdg-hmp -- grep -n sihdgDS /opt/server/standalone/configuration/standalone.xml
error: invalid resource name "dc/sihdg-jboss8-hmp": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sihdg-hmp
Now using project "sihdg-hmp" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec dc/sihdg-jboss8-hmp -n sihdg-hmp -- grep -n sihdgDS /opt/server/standalone/configuration/standalone.xml
error: invalid resource name "dc/sihdg-jboss8-hmp": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-hmp -n sihdg-hmp -o yaml | grep -B2 -A8 -i configmap
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
                  f:name: {}
                f:name: {}
    manager: kubectl-set
    operation: Update
    time: 2026-10-30T19:02:42Z
  - apiVersion: apps.openshift.io/v1
--
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
  availableReplicas: 0
  conditions:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B2 -A8 -i configmap
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
                  f:name: {}
                f:name: {}
              k:{"name":"sihdg-jboss8-data-des"}:
                .: {}
                f:name: {}
                f:persistentVolumeClaim:
--
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
-sh-4.2$
-sh-4.2$ oc set env dc/sihdg-jboss8-hmp -n sihdg-hmp --list | grep -i -E "datasource|DB_|jndi"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sihdg-jboss8-des -n sihdg-des --list | grep -i -E "datasource|DB_|jndi"
-sh-4.2$
-sh-4.2$
-sh-4.2$
