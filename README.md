Solicitamos a alteração do CRON JOB agendamento-sisou na infra OKD do Projeto SISOU-DES PROJETO:

https://console-openshift-console.apps.nprd.caixa/k8s/cluster/projects/sisou-des

O campo comando deve ter o seguinte registro:

DE
-------------------------------

curl --fail \
  "http://sisou-sac-okd-des.sisou-des.svc.cluster.local:8080/sac/cronjob/indecx/pesquisa-satisfacao" 


PARA
-------------------------------

KEYCLOAK_URL="https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token"
CLIENT_ID="cli-ser-sou"
CLIENT_SECRET=$(printenv KEYCLOAK_SECRET)

#echo "teste por fora do cluster"
TARGET_DNS="https://sisou-sac-okd-des.apps.nprd.caixa"

TOKEN=$(curl -s -X POST "${KEYCLOAK_URL}" \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -d "grant_type=client_credentials" \
  -d "client_id=${CLIENT_ID}" \
  -d "client_secret=${CLIENT_SECRET}" \
| sed -n 's/.*"access_token":"\([^"]*\)".*/\1/p')

#echo "Token obtido"
[[ -n "$TOKEN" ]] && echo "== TOKEN recuperado =="

curl -v -w "\n HTTP_CODE = %{http_code}\n" \
  -H "Authorization: Bearer ${TOKEN}" \
  -H "Content-Type: application/json" \
  "$TARGET_DNS/sac/cronjob/indecx/pesquisa-satisfacao"
