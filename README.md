oc get pod <nome-do-pod> -n simtr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'

oc get builds -n simtr-des | grep simtr-parametrizacao
oc logs -f bc/simtr-parametrizacao-des -n simtr-des


oc get istag -n simtr-des | grep simtr-parametrizacao

oc get dc simtr-parametrizacao-des -n simtr-des -o yaml | grep -A5 triggers


oc get dc simtr-parametrizacao-des -n simtr-des -o yaml | grep -A5 triggers
