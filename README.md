POD=simcn-backend-des-255-cft7g

oc exec $POD -- df -h /simcn /upload/des/simcn
oc exec $POD -- ls -la /upload/des/simcn /uploadintegracao/des/simcn /simcn
oc exec $POD -- mount | grep -i nfs


POD=$(oc get pod -l deploymentconfig=simcn-backend-des -o jsonpath='{.items[0].metadata.name}')

