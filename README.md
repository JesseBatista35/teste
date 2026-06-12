
-sh-4.2$ oc describe resourcequota -n sicia-tqs
Name:       quota-resources
Namespace:  sicia-tqs
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used    Hard
--------       ----    ----
limits.cpu     3500m   4
limits.memory  3584Mi  8Gi
pods           4       8
-sh-4.2$ oc patch resourcequota -n sicia-tqs -p \
>   '{"spec":{"hard":{"limits.cpu":"10"}}}'  --type merge
error: resource(s) were provided, but no name, label selector, or --all flag specified
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe resourcequota -n sicia-tqs
Name:       quota-resources
Namespace:  sicia-tqs
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used    Hard
--------       ----    ----
limits.cpu     3500m   4
limits.memory  3584Mi  8Gi
pods           4       8
-sh-4.2$
-sh-4.2$
-sh-4.2$
