oc get pods -l name=sipge-webhook-des -n sipge-des --sort-by=.metadata.creationTimestamp
oc describe pod <pod-mais-novo-da-lista> -n sipge-des
