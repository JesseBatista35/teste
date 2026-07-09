oc get pods -n simtr-des | grep simtr-batch


oc get pod <nome-do-pod-retornado-acima> -n simtr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'


oc get builds -n simtr-des | grep simtr-batch


oc get istag -n simtr-des | grep simtr-batch

oc rollout latest dc/simtr-batch-des -n simtr-des
