oc create configmap sso-des-ca-bundle \
  --from-file=ca-bundle.pem=$HOME/login-des-caixa-chain.pem \
  -n sisou-des


  oc get configmap sso-des-ca-bundle -n sisou-des
