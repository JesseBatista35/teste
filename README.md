
-sh-4.2$ oc rollout cancel dc/sicbc-backend-des -n sicbc-des
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sicbc-backend-des -n sicbc-des
deploymentconfig.apps.openshift.io/sicbc-backend-des rolled out
-sh-4.2$ oc get pods -n sicbc-des
NAME                          READY     STATUS             RESTARTS      AGE
sicbc-backend-des-17-5jxn2    0/1       CrashLoopBackOff   1 (14s ago)   19s
sicbc-backend-des-17-deploy   0/1       Completed          0             21s
-sh-4.2$ oc get pods -n sicbc-des
NAME                          READY     STATUS             RESTARTS      AGE
sicbc-backend-des-17-5jxn2    0/1       CrashLoopBackOff   2 (13s ago)   32s
sicbc-backend-des-17-deploy   0/1       Completed          0             34s
-sh-4.2$ oc get pods -n sicbc-des
NAME                          READY     STATUS             RESTARTS      AGE
sicbc-backend-des-17-5jxn2    0/1       CrashLoopBackOff   2 (16s ago)   35s
sicbc-backend-des-17-deploy   0/1       Completed          0             37s
-sh-4.2$ oc get pods -n sicbc-des
NAME                          READY     STATUS             RESTARTS      AGE
sicbc-backend-des-17-5jxn2    0/1       CrashLoopBackOff   2 (18s ago)   37s
sicbc-backend-des-17-deploy   0/1       Completed          0             39s
-sh-4.2$
