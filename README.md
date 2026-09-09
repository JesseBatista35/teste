
-sh-4.2$
-sh-4.2$ oc describe quota quata-resourcer -n sisgf-des
Error from server (NotFound): resourcequotas "quata-resourcer" not found
-sh-4.2$ oc describe quota quata-resourcer -n sisgf-des
Error from server (NotFound): resourcequotas "quata-resourcer" not found
-sh-4.2$ oc describe quota quota-resource -n sisgf-des
Name:            quota-resources
Namespace:       sisgf-des
Resource         Used    Hard
--------         ----    ----
limits.cpu       5650m   10
limits.memory    7936Mi  12Gi
pods             6       10
requests.cpu     4050m   5
requests.memory  4640Mi  6Gi

-sh-4.2$
