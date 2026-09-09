
-sh-4.2$ oc patch resourcequota quota-resources -n sisgf-des --type='json' -p='[{"op": "replace", "path": "/spec/hard/requests.cpu", "value": "6"}]'
resourcequota/quota-resources patched
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe quota quota-resources -n sisgf-des
Name:            quota-resources
Namespace:       sisgf-des
Resource         Used    Hard
--------         ----    ----
limits.cpu       5650m   10
limits.memory    7936Mi  12Gi
pods             6       10
requests.cpu     4050m   6
requests.memory  4640Mi  6Gi
-sh-4.2$
