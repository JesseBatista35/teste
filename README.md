
-sh-4.2$ oc get dc siorf-backend -o yaml | grep -A20 volumeMounts
Error from server (NotFound): deploymentconfigs.apps.openshift.io "siorf-backend" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siorf-backend -o yaml | grep -A15 "volumes:"
Error from server (NotFound): deploymentconfigs.apps.openshift.io "siorf-backend" not found
-sh-4.2$
