oc get pod siint-saquetecban-pendencia-api-des-37-8clsc -o jsonpath='{.spec.containers[0].image}{"\n"}'
oc get pod siint-saquetecban-pendencia-api-des-47-d4m25 -o jsonpath='{.spec.containers[0].image}{"\n"}' 2>/dev/null


oc get pods -w &
# assim que aparecer "Running" novo, corre imediatamente:
oc exec <pod-novo> -- cat /usr/src/app/secrets_files/SIINT_DES/* 2>&1

oc debug dc/siint-saquetecban-pendencia-api-des
