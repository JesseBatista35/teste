oc run debug-siavl --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-enviomsgativa-microfront:1.0.0-SNAPSHOT \
  --restart=Never -n siavl-des \
  --overrides='{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}' \
  --command -- sleep 3600

  oc exec debug-siavl -n siavl-des -- sed -n '15,35p' /tmp/scripts/run

  oc exec debug-siavl -n siavl-des -- find / -iname "*.sh" -path "*scripts*" 2>/dev/null
