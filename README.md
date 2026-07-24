Alteração do CRON JOB agendamento-sisou na infra OKD do Projeto SISOU-DES PROJETO:

https://console-openshift-console.apps.nprd.caixa/k8s/cluster/projects/sisou-des

O campo comando deve ter o seguinte registro:


KEYCLOAK_URL="$(printenv KEYCLOAK_URL)/realms/intranet/protocol/openid-connect/token"

CLIENT_ID="cli-ser-sou"

CLIENT_SECRET=$(printenv KEYCLOAK_SECRET)

HOSTNAME=$(printenv HTTP_SERVICE_API_SAC)

TOKEN=$(curl -s -X POST "${KEYCLOAK_URL}" -H "Content-Type:
application/x-www-form-urlencoded" -d
"grant_type=client_credentials" -d "client_id=${CLIENT_ID}" -d
"client_secret=${CLIENT_SECRET}" | sed -n
's/.*"access_token":"\([^"]*\)".*/\1/p')

#echo "Token obtido"

[[ -n "$TOKEN" ]] && echo "== TOKEN recuperado =="

curl -v -w "\n HTTP_CODE = %{http_code}\n" -H "Authorization:
Bearer ${TOKEN}" -H "Content-Type: application/json"
"$HOSTNAME/sac/cronjob/indecx/pesquisa-satisfacao"
