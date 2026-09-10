oc get pods -n openshift-ingress


oc logs <pod-do-router> -n openshift-ingress --tail=500 | grep -i "sigda-api-quarkus-des\|10.245.153"
