h-4.2$
-sh-4.2$ oc delete pod debug-tcpdump-009 -n openshift-ingress --ignore-not-found
pod "debug-tcpdump-009" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create -f debug-tcpdump-009.yaml
pod/debug-tcpdump-009 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod debug-tcpdump-009 -n openshift-ingress
NAME                READY     STATUS              RESTARTS   AGE
debug-tcpdump-009   0/1       ContainerCreating   0          5s
-sh-4.2$
-sh-4.2$
-sh-4.2$
