oc get rc sicmo-internet-des-97 -n sicmo-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
