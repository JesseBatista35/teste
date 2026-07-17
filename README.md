
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -A10 "triggers:"
        f:triggers: {}
    manager: kubectl-create
    operation: Update
    time: 2026-07-10T16:31:06Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:labels:
          f:CGC_DES: {}
          f:CGC_OPS: {}
--
  triggers: []
status:
  availableReplicas: 0
  conditions:
  - lastTransitionTime: 2026-07-10T16:31:06Z
    lastUpdateTime: 2026-07-10T16:31:06Z
    message: Deployment config does not have minimum availability.
    status: "False"
    type: Available
  - lastTransitionTime: 2026-07-17T17:03:00Z
    lastUpdateTime: 2026-07-17T17:03:00Z
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.spec.template.spec.containers[0].image}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.12.0.7-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao -n build-images-ads
error: invalid argument: stat /tmp/verificacao: no such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao -n build-images-ads
error: invalid argument: stat /tmp/verificacao: no such file or directory
-sh-4.2$ cat /tmp/verificacao/standalone.xml | grep -A8 "jndi-name=\"java:jboss/jdbc/sihdgDS\""
cat: /tmp/verificacao/standalone.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
