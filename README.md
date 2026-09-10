oc delete pod debug-tcpdump-009 -n openshift-ingress --ignore-not-found


oc create -f debug-tcpdump-009.yaml


oc get pod debug-tcpdump-009 -n openshift-ingress
