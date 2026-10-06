oc get routes -n siepr-des -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination,TEMCERT:.spec.tls.certificate | cut -c1-160

openssl s_client -connect siepr-backend-intranet-des.apps.nprd.caixa:443 \
  -servername siepr-backend-intranet-des.apps.nprd.caixa -showcerts </dev/null 2>/dev/null | grep -E ' s:| i:'
