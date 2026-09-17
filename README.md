
-sh-4.2$ oc get pv simcn-backend-data-des -o yaml
apiVersion: v1
kind: PersistentVolume
metadata:
  annotations:
    pv.kubernetes.io/bound-by-controller: "yes"
  creationTimestamp: 2026-05-11T15:55:31Z
  finalizers:
  - kubernetes.io/pv-protection
  labels:
    app: simcn-backend-des
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:claimRef:
          .: {}
          f:apiVersion: {}
          f:kind: {}
          f:name: {}
          f:namespace: {}
          f:resourceVersion: {}
          f:uid: {}
    manager: kube-controller-manager
    operation: Update
    time: 2026-05-11T15:55:31Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:phase: {}
    manager: kube-controller-manager
    operation: Update
    subresource: status
    time: 2026-05-11T15:55:31Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:pv.kubernetes.io/bound-by-controller: {}
        f:finalizers:
          .: {}
          v:"kubernetes.io/pv-protection": {}
        f:labels:
          .: {}
          f:app: {}
      f:spec:
        f:accessModes: {}
        f:capacity:
          .: {}
          f:storage: {}
        f:nfs:
          .: {}
          f:path: {}
          f:server: {}
        f:persistentVolumeReclaimPolicy: {}
        f:volumeMode: {}
    manager: kubectl-create
    operation: Update
    time: 2026-05-11T15:55:31Z
  name: simcn-backend-data-des
  resourceVersion: "1949835542"
  uid: f36d7687-fa20-4412-9d94-38c6cc17d3b7
spec:
  accessModes:
  - ReadWriteMany
  capacity:
    storage: 50Gi
  claimRef:
    apiVersion: v1
    kind: PersistentVolumeClaim
    name: simcn-backend-data-des
    namespace: simcn-des
    resourceVersion: "1949835539"
    uid: 63206da3-6140-4e12-8049-5c466771bfc1
  nfs:
    path: /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMCN
    server: nfsctcnprd.ctc.caixa
  persistentVolumeReclaimPolicy: Retain
  volumeMode: Filesystem
status:
  phase: Bound
-sh-4.2$
-sh-4.2$
-sh-4.2$
