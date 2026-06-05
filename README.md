
-sh-4.2$ # 1. Aumentar delays das probes para 120s
-sh-4.2$ oc patch dc sicbc-backend-des -n sicbc-des -p '
> {
>   "spec": {
>     "template": {
>       "spec": {
>         "containers": [
>           {
>             "name": "sicbc-backend-des",
>             "readinessProbe": {"initialDelaySeconds": 120},
>             "livenessProbe": {"initialDelaySeconds": 120}
>           }
>         ]
>       }
>     }
>   }
> }'
deploymentconfig.apps.openshift.io/sicbc-backend-des patched
-sh-4.2$
-sh-4.2$ # 2. Esperar novo pod subir
-sh-4.2$ sleep 5
-sh-4.2$ oc get pods -n sicbc-des -w
NAME                          READY     STATUS             RESTARTS   AGE
sicbc-backend-des-15-deploy   1/1       Running            0          5m
sicbc-backend-des-15-mstdb    0/1       CrashLoopBackOff   5          5m
sicbc-backend-des-15-mstdb   0/1       Running   6         6m
sicbc-backend-des-15-mstdb   0/1       Error     6         6m
sicbc-backend-des-15-mstdb   0/1       CrashLoopBackOff   6         6m



^C-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
