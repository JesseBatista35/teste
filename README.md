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
-sh-4.2$

