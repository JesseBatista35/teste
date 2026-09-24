POD=$(oc get pod -n simcn-des -l deploymentconfig=simcn-backend-des -o name | head -1)
oc exec -n simcn-des $POD -- df -h /simcn /upload/des/simcn 2>&1
oc exec -n simcn-des $POD -- ls -la /upload/des/simcn /uploadintegracao/des/simcn /simcn 2>&1
