oc patch pv sibec-arquivos-data-tqs -p '{"spec":{"claimRef": null}}'

oc delete pvc sibec-arquivos-data-tqs -n sibec-tqs

apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: sibec-arquivos-data-tqs
  namespace: sibec-tqs
  labels:
    app: sibec-arquivos-tqs
spec:
  accessModes:
    - ReadWriteMany
  resources:
    requests:
      storage: 50Gi
  volumeName: sibec-arquivos-data-tqs


  oc apply -f pvc-sibec-arquivos-data-tqs.yaml


  oc get pvc sibec-arquivos-data-tqs -n sibec-tqs
