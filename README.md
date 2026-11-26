IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host sh -c '
echo "===== FLUXOS QUE APLICAM MARK (.11=0x15e5f48 / .22=0x117e6d1a) ====="
ovs-ofctl -O OpenFlow13 dump-flows br0 | grep -E "0x15e5f48|0x117e6d1a"
echo "===== CONTADORES SNAT ANTES ====="
iptables -t nat -L OPENSHIFT-MASQUERADE -v -n | grep -E "223\.(11|22)"
' > /tmp/antes.txt 2>&1

oc run teste-cofre -n sispx-des --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host sh -c '
echo "===== CONTADORES SNAT DEPOIS ====="
iptables -t nat -L OPENSHIFT-MASQUERADE -v -n | grep -E "223\.(11|22)"
echo "===== DROPS NO FORWARD ====="
iptables -L FORWARD -v -n | head -15
iptables -L OPENSHIFT-FIREWALL-FORWARD -v -n 2>/dev/null | head -15
' > /tmp/depois.txt 2>&1

cat /tmp/antes.txt /tmp/depois.txt
