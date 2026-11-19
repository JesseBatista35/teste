
-sh-4.2$
-sh-4.2$ oc get hostsubnet ceadecldlx040.nprd.caixa -o yaml
apiVersion: network.openshift.io/v1
egressCIDRs:
- 10.116.192.0/19
egressIPs:
- 10.116.221.95
- 10.116.221.34
- 10.116.209.75
- 10.116.221.4
- 10.116.209.14
- 10.116.220.248
- 10.116.222.9
- 10.116.222.96
- 10.116.209.54
- 10.116.222.2
- 10.116.221.1
host: ceadecldlx040.nprd.caixa
hostIP: 10.116.208.60
kind: HostSubnet
metadata:
  annotations:
    pod.network.openshift.io/node-uid: 27238b44-3f6f-41ee-9d04-801b25eb3839
  creationTimestamp: 2023-11-20T11:54:51Z
  generation: 961
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressCIDRs: {}
    manager: kubectl-patch
    operation: Update
    time: 2023-12-21T10:48:49Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:host: {}
      f:hostIP: {}
      f:metadata:
        f:annotations:
          .: {}
          f:pod.network.openshift.io/node-uid: {}
      f:subnet: {}
    manager: Go-http-client
    operation: Update
    time: 2025-05-31T14:11:19Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressIPs: {}
    manager: openshift-sdn-controller
    operation: Update
    time: 2026-08-30T05:39:07Z
  name: ceadecldlx040.nprd.caixa
  resourceVersion: "2171219022"
  uid: 85830e4e-3a38-4481-b641-7e0d1c1f4497
subnet: 25.0.18.0/23
-sh-4.2$
