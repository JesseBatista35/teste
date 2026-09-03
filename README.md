
-sh-4.2$ oc rollout latest dc/sisgf-batch-des -n sisgf-des
deploymentconfig.apps.openshift.io/sisgf-batch-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sisgf-batch-des -n sisgf-des
Waiting for rollout to finish: 1 old replicas are pending termination...
^C-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe resourcequota -n sisgf-des
Name:            quota-resources
Namespace:       sisgf-des
Resource         Used    Hard
--------         ----    ----
limits.cpu       6800m   10
limits.memory    10Gi    12Gi
pods             8       10
requests.cpu     4700m   5
requests.memory  5920Mi  6Gi
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
