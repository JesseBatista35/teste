oc get cronjob agendamento-sisou -o yaml

mkdir -p ~/backups-sisou
oc get cronjob agendamento-sisou -o yaml > ~/backups-sisou/agendamento-sisou-backup-$(date +%Y%m%d-%H%M%S).yaml

ls -la ~/backups-sisou/
cat ~/backups-sisou/agendamento-sisou-backup-*.yaml | head -50

oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].env}'

cat > ~/patch-agendamento-sisou.json << 'EOF'
[
  {
    "op": "replace",
    "path": "/spec/jobTemplate/spec/template/spec/containers/0/command",
    "value": ["/bin/bash", "-c"]
  },
  {
    "op": "replace",
    "path": "/spec/jobTemplate/spec/template/spec/containers/0/args",
    "value": [
      "KEYCLOAK_URL=\"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token\"\nCLIENT_ID=\"cli-ser-sou\"\nCLIENT_SECRET=$(printenv KEYCLOAK_SECRET)\n#echo \"teste por fora do cluster\"\nTARGET_DNS=\"https://sisou-sac-okd-des.apps.nprd.caixa\"\nTOKEN=$(curl -s -X POST \"${KEYCLOAK_URL}\" -H \"Content-Type: application/x-www-form-urlencoded\" -d \"grant_type=client_credentials\" -d \"client_id=${CLIENT_ID}\" -d \"client_secret=${CLIENT_SECRET}\" | sed -n 's/.*\"access_token\":\"\\([^\"]*\\)\".*/\\1/p')\n#echo \"Token obtido\"\n[[ -n \"$TOKEN\" ]] && echo \"== TOKEN recuperado ==\"\ncurl -v -w \"\\n HTTP_CODE = %{http_code}\\n\" -H \"Authorization: Bearer ${TOKEN}\" -H \"Content-Type: application/json\" \"$TARGET_DNS/sac/cronjob/indecx/pesquisa-satisfacao\""
    ]
  }
]
EOF


oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou.json)"



