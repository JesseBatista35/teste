
-sh-4.2$ oc get pods -n sicpu-des -o wide
NAME                         READY     STATUS      RESTARTS       AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sicpu-painel-des-89-deploy   0/1       Completed   0              3d4h      25.2.41.138   ceadecldlx082.nprd.caixa   <none>           <none>
sicpu-painel-des-90-deploy   0/1       Completed   0              3d2h      25.3.19.205   ceadecldlx043.nprd.caixa   <none>           <none>
sicpu-painel-des-90-pxzq8    2/2       Running     1 (3d2h ago)   3d2h      25.3.23.17    ceadecldlx034.nprd.caixa   <none>           <none>
-sh-4.2$



-sh-4.2$ oc get network.config/cluster -o yaml
apiVersion: config.openshift.io/v1
kind: Network
metadata:
  creationTimestamp: 2022-11-09T20:25:16Z
  generation: 2
  managedFields:
  - apiVersion: config.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        .: {}
        f:clusterNetwork: {}
        f:externalIP:
          .: {}
          f:policy: {}
        f:networkType: {}
        f:serviceNetwork: {}
      f:status: {}
    manager: cluster-bootstrap
    operation: Update
    time: 2022-11-09T20:25:16Z
  - apiVersion: config.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:clusterNetwork: {}
        f:clusterNetworkMTU: {}
        f:networkType: {}
        f:serviceNetwork: {}
    manager: cluster-network-operator
    operation: Update
    time: 2022-11-09T20:28:53Z
  name: cluster
  resourceVersion: "3167"
  uid: 62c1e972-7bb1-424e-aa58-4d071bd64dc2
spec:
  clusterNetwork:
  - cidr: 25.0.0.0/14
    hostPrefix: 23
  externalIP:
    policy: {}
  networkType: OpenShiftSDN
  serviceNetwork:
  - 25.128.0.0/16
status:
  clusterNetwork:
  - cidr: 25.0.0.0/14
    hostPrefix: 23
  clusterNetworkMTU: 1450
  networkType: OpenShiftSDN
  serviceNetwork:
  - 25.128.0.0/16
-sh-4.2$
