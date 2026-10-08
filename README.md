oc exec -n openshift-sdn sdn-4wz4s -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100
oc exec -n openshift-sdn sdn-rprgw -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100

oc get pods -n sisam-tqs -o wide

oc run teste-egress -n sihdg-tqs --rm -it --restart=Never --image=<imagem-com-bash-disponivel> \
  --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa"}}' -- bash
