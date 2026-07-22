oc scale rc simil-precificacao-frontend-des-65 --replicas=0 -n simil-des

oc get pods -n simil-des -l name=simil-precificacao-frontend-des

oc get events -n simil-des --sort-by='.metadata.creationTimestamp' | tail -30

