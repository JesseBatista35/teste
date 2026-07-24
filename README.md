

-sh-4.2$
-sh-4.2$ oc get dc sisns-backend-tqs -o yaml | grep -A 15 volumes
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sisns-backend-tqs" not found
-sh-4.2$ oc get dc sisns-backend-tqs -o yaml | grep -A 10 volumeMounts
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sisns-backend-tqs" not found
-sh-4.2$ oc rollout latest dc/sisns-backend-tqs
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sisns-backend-tqs" not found
-sh-4.2$
