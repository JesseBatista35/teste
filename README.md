
-sh-4.2$ oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siabm-autenticacao-api-des-188-rwtkz   0/1       Running   2          10m
siabm-autenticacao-api-des-199-wrsg5   0/1       Running   0          3m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-199-wrsg5 -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-199-wrsg5" not found
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-199-wrsg5 -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-199-wrsg5" not found
-sh-4.2$
