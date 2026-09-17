
-sh-4.2$ oc get netnamespace sicbp-des -o yaml
apiVersion: network.openshift.io/v1
egressIPs:
- 10.116.222.84
kind: NetNamespace
metadata:
  creationTimestamp: 2024-12-06T15:31:46Z
  generation: 2
  labels:
    projeto: sicbp-des
  managedFields:
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:netid: {}
      f:netname: {}
    manager: Go-http-client
    operation: Update
    time: 2024-12-06T15:31:46Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:labels:
          .: {}
          f:projeto: {}
    manager: kubectl-label
    operation: Update
    time: 2024-12-06T15:31:47Z
  - apiVersion: network.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:egressIPs: {}
    manager: kubectl-patch
    operation: Update
    time: 2024-12-06T15:32:17Z
  name: sicbp-des
  resourceVersion: "791247566"
  uid: 5347d1a0-3a5d-430f-ac87-a9bd77c87323
netid: 998810
netname: sicbp-des
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -l name=sicbp-trilha-api-des -n sicbp-des -o wide
NAME                            READY     STATUS    RESTARTS      AGE       IP          NODE                       NOMINATED NODE   READINESS GATES
sicbp-trilha-api-des-54-rrrpb   1/1       Running   1 (22h ago)   8d        25.3.20.4   ceadecldlx048.nprd.caixa   <none>           <none>
-sh-4.2$ oc get node <nome-do-node> -o wide
-sh: nome-do-node: Arquivo ou diretório não encontrado
-sh-4.2$
