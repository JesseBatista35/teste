oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK_TOKEN


POD=$(oc get pod -n simpi-des -l deploymentconfig=simpi-dict-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}'); echo "pod=$POD"; oc exec $POD -c simpi-dict-api-des -n simpi-des -- sh -c 'env | grep -i PIX_FRAMEWORK_TOKEN'
