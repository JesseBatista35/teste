
-sh-4.2$ oc set probe dc/sicbc-backend-des -n sicbc-des --liveness --initial-delay-seconds=0 --remove
deploymentconfig.apps.openshift.io/sicbc-backend-des probes updated
-sh-4.2$ oc set probe dc/sicbc-backend-des -n sicbc-des --readiness --initial-delay-seconds=0 --remove
deploymentconfig.apps.openshift.io/sicbc-backend-des probes updated
-sh-4.2$ oc rollout latest dc/sicbc-backend-des -n sicbc-des
error: #16 is already in progress (Running).
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sicbc-backend-des -n sicbc-des
error: #16 is already in progress (Running).
-sh-4.2$
