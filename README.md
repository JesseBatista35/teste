oc registry login --to=$HOME/.docker/config.json
oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
  --path /opt/server/standalone/configuration/standalone.xml:$HOME/verificacao \
  -n build-images-ads \
  --insecure=true \
  --registry-config=$HOME/.docker/config.json
