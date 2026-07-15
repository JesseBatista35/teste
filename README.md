
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
-sh-4.2$ oc whoami
p585600@corp.caixa.gov.br
-sh-4.2$ oc project
Using project "default" on server "https://api.nprd.caixa:6443".
-sh-4.2$ oc get project siabm-des
NAME        DISPLAY NAME   STATUS
siabm-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-201-vqr9x -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-201-vqr9x" not found
-sh-4.2$ oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siabm-autenticacao-api-des-201-vqr9x   1/1       Running   0          10m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod siabm-autenticacao-api-des-201-vqr9x -n siabm-des -o wide
NAME                                   READY     STATUS    RESTARTS   AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
siabm-autenticacao-api-des-201-vqr9x   1/1       Running   0          11m       25.1.21.203   ceadecldlx046.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
