oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.volumes}{"\n"}{.spec.jobTemplate.spec.template.spec.containers[0].volumeMounts}{"\n"}'


cat > ~/patch-add-ca-volume.json << 'EOF'
[
  {
    "op": "add",
    "path": "/spec/jobTemplate/spec/template/spec/volumes",
    "value": [
      {
        "name": "sso-ca-bundle",
        "configMap": {
          "name": "sso-des-ca-bundle"
        }
      }
    ]
  },
  {
    "op": "add",
    "path": "/spec/jobTemplate/spec/template/spec/containers/0/volumeMounts",
    "value": [
      {
        "name": "sso-ca-bundle",
        "mountPath": "/etc/ssl/custom-ca",
        "readOnly": true
      }
    ]
  }
]
EOF

oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-add-ca-volume.json)"


oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.volumes}{"\n"}{.spec.jobTemplate.spec.template.spec.containers[0].volumeMounts}{"\n"}'







cat > ~/agendamento-sisou-script-v4.sh << 'SCRIPTEOF'
set -euo pipefail
echo "===== ENV ====="
env | sort
echo "==============="
echo "=== INICIO EXECUCAO CRONJOB ==="
#
# Recupera variaveis de ambiente
#
KEYCLOAK_AUTH_SERVER_URL="$(printenv KEYCLOAK_AUTH_SERVER_URL || true)"
KEYCLOAK_CREDENTIAL_SECRET="$(printenv KEYCLOAK_CREDENTIAL_SECRET || true)"
HOSTNAME="$(printenv HTTP_SERVICE_API_SAC || true)"
CLIENT_ID="cli-ser-sou"
CA_BUNDLE="/etc/ssl/custom-ca/ca-bundle.pem"
#
# Validacoes iniciais
#
if [ -z "${KEYCLOAK_AUTH_SERVER_URL}" ]; then
    echo "[ERRO] Variavel KEYCLOAK_AUTH_SERVER_URL nao encontrada."
    exit 1
fi
if [ -z "${KEYCLOAK_CREDENTIAL_SECRET}" ]; then
    echo "[ERRO] Variavel KEYCLOAK_CREDENTIAL_SECRET nao encontrada."
    exit 1
fi
if [ -z "${HOSTNAME}" ]; then
    echo "[ERRO] Variavel HTTP_SERVICE_API_SAC nao encontrada."
    exit 1
fi
if [ ! -f "${CA_BUNDLE}" ]; then
    echo "[ERRO] Certificado CA nao encontrado em ${CA_BUNDLE}"
    exit 1
fi
#
# Remove barras finais para evitar // na URL
#
KEYCLOAK_AUTH_SERVER_URL="${KEYCLOAK_AUTH_SERVER_URL%/}"
HOSTNAME="${HOSTNAME%/}"
#
# Monta URL do Keycloak
#
KEYCLOAK_AUTH_SERVER_URL="${KEYCLOAK_AUTH_SERVER_URL}/realms/intranet/protocol/openid-connect/token"
echo "[INFO] KEYCLOAK_AUTH_SERVER_URL = ${KEYCLOAK_AUTH_SERVER_URL}"
echo "[INFO] HOSTNAME     = ${HOSTNAME}"
echo "[INFO] CLIENT_ID    = ${CLIENT_ID}"
echo "[INFO] CA_BUNDLE    = ${CA_BUNDLE}"
#
# Validacao simples das URLs
#
case "${KEYCLOAK_AUTH_SERVER_URL}" in
    http://*|https://*)
        ;;
    *)
        echo "[ERRO] KEYCLOAK_AUTH_SERVER_URL invalida: ${KEYCLOAK_AUTH_SERVER_URL}"
        exit 1
        ;;
esac
case "${HOSTNAME}" in
    http://*|https://*)
        ;;
    *)
        echo "[ERRO] HTTP_SERVICE_API_SAC invalida: ${HOSTNAME}"
        exit 1
        ;;
esac
#
# Obtencao do token
#
echo "[INFO] Obtendo token..."
TOKEN=$(
curl --silent --show-error --fail \
  --cacert "${CA_BUNDLE}" \
  -X POST "${KEYCLOAK_AUTH_SERVER_URL}" \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -d "grant_type=client_credentials" \
  -d "client_id=${CLIENT_ID}" \
  -d "client_secret=${KEYCLOAK_CREDENTIAL_SECRET}" \
| sed -n 's/.*"access_token":"\([^"]*\)".*/\1/p'
)
if [ -z "${TOKEN}" ]; then
    echo "[ERRO] Nao foi possivel obter o access_token."
    exit 1
fi
echo "[INFO] TOKEN recuperado com sucesso"
#
# Endpoint final
#
ENDPOINT="${HOSTNAME}/sac/cronjob/indecx/pesquisa-satisfacao"
echo "[INFO] ENDPOINT = ${ENDPOINT}"
#
# Chamada da API
#
HTTP_CODE=$(
curl \
  --silent \
  --show-error \
  --location \
  --cacert "${CA_BUNDLE}" \
  --output /tmp/cronjob-response.txt \
  --write-out "%{http_code}" \
  -H "Authorization: Bearer ${TOKEN}" \
  -H "Content-Type: application/json" \
  "${ENDPOINT}"
)
echo "HTTP_CODE = ${HTTP_CODE}"
if [ "${HTTP_CODE}" -lt 200 ] || [ "${HTTP_CODE}" -ge 300 ]; then
    echo "[ERRO] Chamada retornou HTTP ${HTTP_CODE}"
    echo "=== RESPOSTA ==="
    cat /tmp/cronjob-response.txt || true
    exit 1
fi
echo "[SUCESSO] CronJob executado com sucesso."
echo "=== FIM EXECUCAO CRONJOB ==="
SCRIPTEOF













python3 << 'PYEOF'
import json
import os

script_path = os.path.expanduser('~/agendamento-sisou-script-v4.sh')
patch_path = os.path.expanduser('~/patch-agendamento-sisou-v4.json')

with open(script_path) as f:
    script = f.read()

patch = [
    {
        "op": "replace",
        "path": "/spec/jobTemplate/spec/template/spec/containers/0/args",
        "value": [script]
    }
]

with open(patch_path, 'w') as f:
    json.dump(patch, f)

print("Patch gerado com sucesso em:", patch_path)
PYEOF





python3 -m json.tool ~/patch-agendamento-sisou-v4.json > /dev/null && echo "JSON válido" || echo "JSON INVÁLIDO"
oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou-v4.json)"
