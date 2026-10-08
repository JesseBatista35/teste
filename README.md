oc run teste-egress -n sihdg-tqs --restart=Never \
  --image=quay.io/openshift/okd-content@sha256:c53bb2c01dc951dfe46ba91d76553d6d16b007de0a5475f05c91e51505900a0c \
  --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"quay.io/openshift/okd-content@sha256:c53bb2c01dc951dfe46ba91d76553d6d16b007de0a5475f05c91e51505900a0c","command":["sleep","600"]}]}}'
oc get pod teste-egress -n sihdg-tqs -o wide



oc rsh -n sihdg-tqs teste-egress
for i in 1 2 3; do date -u '+%H:%M:%S UTC'; timeout 5 bash -c '</dev/tcp/10.116.29.201/31153'; echo "201 rc=$?"; done
exit
oc delete pod teste-egress -n sihdg-tqs
