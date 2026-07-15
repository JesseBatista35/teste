
-sh-4.2$
-sh-4.2$ oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siabm-autenticacao-api-des-201-vqr9x   1/1       Running   0          7m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-201-vqr9x -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-201-vqr9x" not found
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des-201-vqr9x -n siabm-des
error: rsh requires a single Pod to connect to
See 'oc rsh -h' for help and examples.
-sh-4.2$

