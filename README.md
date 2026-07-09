oc rsh simtr-batch-des-43-xsvr8 java -version

oc get pod simtr-batch-des-43-xsvr8 -n simtr-des -o jsonpath='{.status.containerStatuses[0].imageID}{"\n"}'
