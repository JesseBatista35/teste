
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~kVBjGP0aGuJemQH5nhKWyQ1rEUoaYe8obcFlpFEA8S0 --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 984 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sisgf-des".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sicvr-des
Now using project "sicvr-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace sicvr-des -o yaml
apiVersion: network.openshift.io/v1
egressIPs:
- 10.116.220.120
kind: NetNamespace
metadata:
  creationTimestamp: 2023-09-04T22:13:14Z
  generation: 2
  labels:
    projeto: sicvr-des
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:netid: {}
      f:netname: {}
    manager: Go-http-client
    operation: Update
    time: 2023-09-04T22:13:14Z
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
    time: 2023-09-04T22:42:22Z
  name: sicvr-des
  resourceVersion: "214431674"
  uid: 52c18922-7f83-45f6-86c5-0eb76badab0b
netid: 2725649
netname: sicvr-des
-sh-4.2$
