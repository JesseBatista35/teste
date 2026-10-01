
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sipge-tqs
Now using project "sipge-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                          READY     STATUS             RESTARTS      AGE
sipge-backend-tqs-4-deploy    0/1       Error              0             44h
sipge-backend-tqs-5-deploy    0/1       Error              0             25h
sipge-frontend-tqs-1-deploy   0/1       Completed          0             44h
sipge-frontend-tqs-1-qphq9    2/2       Running            0             44h
sipge-webhook-tqs-6-deploy    1/1       Running            0             7m55s
sipge-webhook-tqs-6-mrf59     0/1       CrashLoopBackOff   6 (96s ago)   7m50s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sipge-webhook-tqs-6-mrf59 -c secrets-agent-sidecar -n sipge-tqs

Error from server (BadRequest): container secrets-agent-sidecar is not valid for pod sipge-webhook-tqs-6-mrf59
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
