oc start-build sifof-api-aplicacao \
  --from-dir=/opt/ads-agent/_work/61/a \
  --follow \
  --wait=true \
  -n build-images-ads \
  -v=5 \
  --request-timeout=5m



  # Ver logs do API server
oc logs -n openshift-kube-apiserver -l component=kube-apiserver

# Ver status do build config
oc describe buildconfig sifof-api-aplicacao -n build-images-ads


