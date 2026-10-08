oc get pod sihdg-jboss8-tqs-28-q6ngx -n sihdg-tqs -o jsonpath='{.spec.containers[0].image}{"\n"}'

oc run teste-egress -n sihdg-tqs --restart=Never --image=IMAGEM \
  --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"IMAGEM","command":["sleep","600"]}]}}'
oc get pod teste-egress -n sihdg-tqs -o wide
oc rsh -n sihdg-tqs teste-egress

for i in 1 2 3; do date -u '+%H:%M:%S UTC'; timeout 5 bash -c '</dev/tcp/10.116.29.201/31153'; echo "201 rc=$?"; done

