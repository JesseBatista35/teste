oc create -f debug-tcpdump-009.yaml
oc get events -n openshift-ingress --sort-by='.lastTimestamp' | tail -20


oc get events -n sigda-des --sort-by='.lastTimestamp' | tail -20
