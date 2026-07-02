-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -n volumes
113:            f:volumes:
320:            f:volumes:
444:            f:volumes:
702:      volumes:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | head -50
apiVersion: apps.openshift.io/v1
kind: DeploymentConfig
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  creationTimestamp: 2025-02-14T02:02:54Z
  generation: 5218
  labels:
    CGC_DES: "7390"
    CGC_OPS: "7259"
    UNIDADE: BR
    app: sibec-arquivos-tqs
    application: sibec-arquivos-tqs
    template: quarkus-caixa-release
  managedFields:
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:description: {}
          f:openshift.io/generated-by: {}
        f:labels:
          .: {}
          f:app: {}
          f:application: {}
          f:template: {}
      f:spec:
        f:replicas: {}
        f:revisionHistoryLimit: {}
        f:selector:
          .: {}
          f:name: {}
        f:strategy:
          f:activeDeadlineSeconds: {}
          f:rollingParams:
            .: {}
            f:intervalSeconds: {}
            f:maxSurge: {}
            f:maxUnavailable: {}
            f:timeoutSeconds: {}
            f:updatePeriodSeconds: {}
          f:type: {}
        f:template:
          .: {}
          f:metadata:
            .: {}
            f:annotations:
-sh-4.2$
