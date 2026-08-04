echo | openssl s_client -connect login.des.caixa:443 -servername login.des.caixa -showcerts 2>/dev/null | \
awk '/-----BEGIN CERTIFICATE-----/,/-----END CERTIFICATE-----/' > ~/login-des-caixa-chain.pem


cat ~/login-des-caixa-chain.pem

oc create configmap sso-des-ca-bundle \
  --from-file=ca-bundle.pem=~/login-des-caixa-chain.pem \
  -n sisou-des


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


--cacert /etc/ssl/custom-ca/ca-bundle.pem


