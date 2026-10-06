oc get pv sicmo-internet-data-des -o yaml > pv-internet-bkp.yaml
oc get pvc sicmo-internet-data-des -n sicmo-des -o yaml > pvc-internet-bkp.yaml
ls -l *bkp.yaml


cat > pv-pvc-internet.yaml <<'EOF'
apiVersion: v1
kind: PersistentVolume
metadata:
  name: sicmo-internet-data-des
spec:
  capacity:
    storage: 10Gi
  accessModes:
  - ReadWriteMany
  persistentVolumeReclaimPolicy: Retain
  nfs:
    server: hypernprd56.ad.caixa
    path: /fs_sicmo
  claimRef:
    namespace: sicmo-des
    name: sicmo-internet-data-des
---
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: sicmo-internet-data-des
  namespace: sicmo-des
spec:
  accessModes:
  - ReadWriteMany
  resources:
    requests:
      storage: 10Gi
  storageClassName: ""
  volumeName: sicmo-internet-data-des


grep server pv-pvc-internet.yaml


oc scale dc sicmo-internet-des --replicas=0 -n sicmo-des
oc delete pvc sicmo-internet-data-des -n sicmo-des
oc delete pv sicmo-internet-data-des


oc apply -f pv-pvc-internet.yaml
oc get pvc sicmo-internet-data-des -n sicmo-des


oc scale dc sicmo-internet-des --replicas=1 -n sicmo-des
oc get pod -n sicmo-des | grep internet-des

