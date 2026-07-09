oc get pod simtr-batch-des-42-l42zw -n simtr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'

oc get dc simtr-batch-des -n simtr-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'

oc logs simtr-batch-des-42-l42zw -n simtr-des

