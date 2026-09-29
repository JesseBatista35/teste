
-sh-4.2$
-sh-4.2$ oc get imagepruner cluster -o yaml
apiVersion: imageregistry.operator.openshift.io/v1
kind: ImagePruner
metadata:
  creationTimestamp: 2022-11-09T20:32:13Z
  generation: 1
  managedFields:
  - apiVersion: imageregistry.operator.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        .: {}
        f:failedJobsHistoryLimit: {}
        f:ignoreInvalidImageReferences: {}
        f:keepTagRevisions: {}
        f:logLevel: {}
        f:schedule: {}
        f:successfulJobsHistoryLimit: {}
        f:suspend: {}
    manager: Go-http-client
    operation: Update
    time: 2022-11-09T20:32:13Z
  - apiVersion: imageregistry.operator.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        .: {}
        f:observedGeneration: {}
    manager: Go-http-client
    operation: Update
    subresource: status
    time: 2022-11-09T20:32:13Z
  - apiVersion: imageregistry.operator.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:conditions: {}
    manager: cluster-image-registry-operator
    operation: Update
    subresource: status
    time: 2026-05-01T00:00:58Z
  name: cluster
  resourceVersion: "1928882647"
  uid: e1450536-c292-4ea7-b759-69dc3b6a005b
spec:
  failedJobsHistoryLimit: 3
  ignoreInvalidImageReferences: true
  keepTagRevisions: 3
  logLevel: Normal
  schedule: ""
  successfulJobsHistoryLimit: 3
  suspend: false
status:
  conditions:
  - lastTransitionTime: 2022-11-09T20:32:14Z
    message: Pruner CronJob has been created
    reason: AsExpected
    status: "True"
    type: Available
  - lastTransitionTime: 2026-05-01T00:00:58Z
    message: Pruner completed successfully
    reason: Complete
    status: "False"
    type: Failed
  - lastTransitionTime: 2022-11-09T20:32:14Z
    message: The pruner job has been scheduled
    reason: Scheduled
    status: "True"
    type: Scheduled
  - lastTransitionTime: 2026-05-01T00:00:58Z
    reason: AsExpected
    status: "False"
    type: Degraded
  observedGeneration: 1
-sh-4.2$
