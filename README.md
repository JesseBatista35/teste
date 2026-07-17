oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
  --path /opt/server/modules/system/layers/base/org/jboss/as:/tmp/modulos-jboss-as \
  -n build-images-ads
ls /tmp/modulos-jboss-as

oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
  --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao \
  -n build-images-ads
cat /tmp/verificacao/standalone.xml | grep -A40 "<extensions>"
