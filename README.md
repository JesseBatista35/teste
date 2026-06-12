-sh-4.2$ oc patch resourcequota quota-resources -n sicia-tqs -p '{"spec":{"hard":{"limits.cpu":"10"}}}' --type merge
resourcequota/quota-resources patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch resourcequota quota-resources -n sicia-tqs --type='json' -p='[{"op": "replace", "path": "/spec/hard/limits.cpu", "value":"10"}]'
resourcequota/quota-resources not patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch resourcequota quota-resources -n sicia-tqs -p '{"spec":{"hard":{"limits.cpu":"10"}}}' --type merge
resourcequota/quota-resources not patched
-sh-4.2$ ^C
-sh-4.2$ oc describe resourcequota quota-resources -n sicia-tqs
Name:       quota-resources
Namespace:  sicia-tqs
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used  Hard
--------       ----  ----
limits.cpu     3     10
limits.memory  3Gi   8Gi
pods           3     8
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete rc -n sicia-tqs sicia-frontend-tqs-10 sicia-frontend-tqs-11 --ignore-not-found
replicationcontroller "sicia-frontend-tqs-11" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sicia-frontend-tqs -n sicia-tqs
error: #11 is already in progress (Running).
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout cancel  dc/sicia-frontend-tqs -n sicia-tqs
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sicia-frontend-tqs -n sicia-tqs
deploymentconfig.apps.openshift.io/sicia-frontend-tqs rolled out
-sh-4.2$ oc get pods -n sicia-tqs -w
NAME                                READY     STATUS    RESTARTS   AGE
sicia-apinode-backend-tqs-4-l66bz   1/1       Running   0          184d
sicia-backend-tqs-1-prz46           1/1       Running   0          8d
sicia-backend-tqs-18-deploy         0/1       Error     0          13m
sicia-frontend-tqs-1-jb4nb          2/2       Running   0          8m
sicia-frontend-tqs-12-deploy        1/1       Running   0          8s
sicia-frontend-tqs-12-ljm7t         1/2       Running   0          5s


