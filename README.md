
-sh-4.2$
-sh-4.2$ oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des
NAME                         READY     STATUS    RESTARTS   AGE
siinp-nucleo-des-291-4vtrx   1/1       Running   0          3h57m
siinp-nucleo-des-291-c55mr   1/1       Running   0          3h55m
siinp-nucleo-des-291-rvnkb   1/1       Running   0          3h56m
-sh-4.2$ oc rollout status dc/siinp-nucleo-des -n siinp-des
error: replication controller "siinp-nucleo-des-292" has failed progressing
-sh-4.2$
