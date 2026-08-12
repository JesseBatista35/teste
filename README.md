# Ver env vars que o deploymentconfig está de fato passando pro container
oc get dc siint-saquetecban-pendencia-api-des -o yaml | grep -B2 -A2 "API_KEY\|API_CLIENT_SECRET\|name: API\|value:"

# ou mais direto, listar todo o env do container
oc set env dc/siint-saquetecban-pendencia-api-des --list
