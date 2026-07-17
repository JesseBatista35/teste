oc get pods -n sihdg-des -l deploymentconfig=sihdg-jboss8-des -o wide
oc describe pod <nome-do-pod-novo> -n sihdg-des | grep -i image


oc get is sihdg-jboss8-des -n sihdg-des -o yaml

oc get builds -n sihdg-des
oc logs build/<nome-do-build-mais-recente> -n sihdg-des | grep -i "Cloning\|commit\|branch"

oc get bc sihdg-jboss8-des -n sihdg-des -o yaml | grep -i "incremental\|forcePull\|noCache"

oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.spec.template.spec.containers[0].image}'
