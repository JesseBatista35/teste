
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip
error: the server doesn't have a resource type "egressip"
-sh-4.2$ oc get netnamespace sipgc-des -o yaml
apiVersion: network.openshift.io/v1
egressIPs:
- 10.116.222.85
kind: NetNamespace
metadata:
  creationTimestamp: 2024-12-09T15:48:25Z
  generation: 2
  labels:
    projeto: sipgc-des
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:netid: {}
      f:netname: {}
    manager: Go-http-client
    operation: Update
    time: 2024-12-09T15:48:25Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressIPs: {}
      f:metadata:
        f:labels:
          .: {}
          f:projeto: {}
    manager: oc
    operation: Update
    time: 2024-12-09T15:49:22Z
  name: sipgc-des
  resourceVersion: "796472204"
  uid: 62508c1e-11da-4220-b9be-54882f80dba5
netid: 3987458
netname: sipgc-des
-sh-4.2$
