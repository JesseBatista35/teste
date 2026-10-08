exit
-sh-4.2$ oc delete pod teste-egress -n sihdg-tqs
pod "teste-egress" deleted
-sh-4.2$ oc get netnamespace sihdg-tqs -o yaml
apiVersion: network.openshift.io/v1
egressIPs:
- 10.116.221.46
kind: NetNamespace
metadata:
  creationTimestamp: 2023-12-22T20:55:45Z
  generation: 2
  labels:
    projeto: sihdg-tqs
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:netid: {}
      f:netname: {}
    manager: Go-http-client
    operation: Update
    time: 2023-12-22T20:55:45Z
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
    time: 2023-12-22T20:56:30Z
  name: sihdg-tqs
  resourceVersion: "321916710"
  uid: ac94b137-b0f7-45c4-a3f4-7c5d3f164470
netid: 12401478
netname: sihdg-tqs
-sh-4.2$ oc get hostsubnet ceadecldlx084.nprd.caixa -o yaml | grep -B2 -A2 -i "10.116.221.46"
- 10.116.222.164
- 10.116.220.210
- 10.116.221.46
- 10.116.220.180
- 10.116.221.183
-sh-4.2$
-sh-4.2$
-sh-4.2$
