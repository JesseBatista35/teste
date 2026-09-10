-sh-4.2$ oc delete pod debug-tcpdump-009 -n openshift-ingress --ignore-not-found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create -f debug-tcpdump-009.yaml
pod/debug-tcpdump-009 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod debug-tcpdump-009 -n openshift-ingress
NAME                READY     STATUS         RESTARTS   AGE
debug-tcpdump-009   0/1       ErrImagePull   0          7s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
