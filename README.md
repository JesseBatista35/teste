
condicoes deste aviso
***********************************************************************
p585600@10.122.155.62's password:
Last login: Wed Sep  9 16:58:39 2026 from 10.122.150.31
-sh-4.2$ oc rollout status dc/sisgf-backend-des -n sisgf-des
Waiting for rollout to finish: 1 old replicas are pending termination...
Waiting for rollout to finish: 1 old replicas are pending termination...
Waiting for latest deployment config spec to be observed by the controller loop...
replication controller "sisgf-backend-des-376" successfully rolled out
-sh-4.2$ ^C
-sh-4.2$ oc rollout status dc/sisgf-backend-des -n sisgf-des
replication controller "sisgf-backend-des-376" successfully rolled out
-sh-4.2$


