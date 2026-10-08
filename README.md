oc run teste-egress -n sihdg-tqs --restart=Never \
  --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0 \
  --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0","command":["sleep","600"]}]}}'


  oc get pod teste-egress -n sihdg-tqs -o wide
oc rsh -n sihdg-tqs teste-egress

for i in 1 2 3; do date -u '+%H:%M:%S UTC'; timeout 5 bash -c '</dev/tcp/10.116.29.201/31153'; echo "201 rc=$?"; done

oc delete pod teste-egress -n sihdg-tqs
