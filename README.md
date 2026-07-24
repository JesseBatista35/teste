oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].env}'

cat > ~/patch-agendamento-sisou-v2.json << 'EOF'
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
      "KEYCLOAK_URL=\"$(printenv KEYCLOAK_URL)/realms/intranet/protocol/openid-connect/token\"\nCLIENT_ID=\"cli-ser-sou\"\nCLIENT_SECRET=$(printenv KEYCLOAK_SECRET)\nHOSTNAME=$(printenv HTTP_SERVICE_API_SAC)\nTOKEN=$(curl -s -X POST \"${KEYCLOAK_URL}\" -H \"Content-Type: application/x-www-form-urlencoded\" -d \"grant_type=client_credentials\" -d \"client_id=${CLIENT_ID}\" -d \"client_secret=${CLIENT_SECRET}\" | sed -n 's/.*\"access_token\":\"\\([^\"]*\\)\".*/\\1/p')\n#echo \"Token obtido\"\n[[ -n \"$TOKEN\" ]] && echo \"== TOKEN recuperado ==\"\ncurl -v -w \"\\n HTTP_CODE = %{http_code}\\n\" -H \"Authorization: Bearer ${TOKEN}\" -H \"Content-Type: application/json\" \"$HOSTNAME/sac/cronjob/indecx/pesquisa-satisfacao\""
    ]
  }
]
EOF


oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou-v2.json)"
