cat <<EOF | oc apply -f -
apiVersion: v1
kind: PersistentVolume
metadata:
  labels:
    app: sihdg-des
  name: sihdg-sinaf-data-des
spec:
  accessModes:
    - ReadWriteMany
  capacity:
    storage: 50Gi
  claimRef:
    apiVersion: v1
    kind: PersistentVolumeClaim
    name: sihdg-sinaf-data-des
    namespace: sihdg-des
  nfs:
    path: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
    server: nprdnfs01.ad.caixa
  persistentVolumeReclaimPolicy: Retain
  volumeMode: Filesystem
EOF




cat <<EOF | oc apply -f -
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: sihdg-sinaf-data-des
  namespace: sihdg-des
spec:
  accessModes:
    - ReadWriteMany
  resources:
    requests:
      storage: 50Gi
  storageClassName: ""
  volumeMode: Filesystem
  volumeName: sihdg-sinaf-data-des
EOF



oc get pv,pvc | grep sinaf


oc rollout latest dc/sihdg-jboss8-des
oc rollout status dc/sihdg-jboss8-des


oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des --field-selector=status.phase=Running -o jsonpath='{.items[0].metadata.name}')
ls -la /sihdg_sinaf
df -h /sihdg_sinaf
