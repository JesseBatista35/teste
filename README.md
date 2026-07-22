
-sh-4.2$
-sh-4.2$ oc get resourcequota -n simil-des
NAME              AGE       REQUEST      LIMIT
quota-resources   359d      pods: 9/10   limits.cpu: 8/8, limits.memory: 9Gi/10Gi
-sh-4.2$ oc describe resourcequota -n -simil-des
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe resourcequota -n simil-des
Name:       quota-resources
Namespace:  simil-des
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used  Hard
--------       ----  ----
limits.cpu     8     8
limits.memory  9Gi   10Gi
pods           9     10
-sh-4.2$ oc logs simil-precificacao-frontend-des-75-deploy -n simil-des
--> Scaling up simil-precificacao-frontend-des-75 from 0 to 1, scaling down simil-precificacao-frontend-des-65 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling simil-precificacao-frontend-des-75 up to 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n simil-des --sort-by=.lastTimestamp | tail -30
F0722 17:09:54.859407  101376 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
