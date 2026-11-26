IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

echo "===== MARKS NO OVS DO ns57r ====="
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
  sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 | grep -i -E "pkt_mark|0x5e5f49|0x7eed1b" | head -30'

echo "===== TABELA 100 NO gp64t (nó do sispi, que funciona) ====="
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-gp64t -- chroot /host \
  sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | head -20'

echo "===== sigel-tqs rodando no ns57r ====="
oc run teste-sigel -n sigel-tqs --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
