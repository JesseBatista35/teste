oc delete pod debug-tcpdump-009 -n openshift-ingress

oc get pods -n openshift-ingress | grep debug-tcpdump
