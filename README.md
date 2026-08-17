
-sh-4.2$ oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK_TOKEN
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -n simpi-des -l deploymentconfig=simpi-dict-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}'); echo "pod=$POD"; oc exec $POD -c simpi-dict-api-des -n simpi-des -- sh -c 'env | grep -i PIX_FRAMEWORK_TOKEN'
pod=simpi-dict-api-des-14-hrwmw
error: unable to upgrade connection: container not found ("simpi-dict-api-des")
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
