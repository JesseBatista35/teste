IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
NODE=pixnprd4-x44wk-worker-0-ns57r

/usr/local/bin/oc-v4.13 debug node/$NODE -- chroot /host sh -c '
echo "===== REGRAS CUSTOM ====="
iptables-save -t filter | grep -E "ILO-FILTER-FORWARD|OPENSHIFT-ADMIN-OUTPUT-RULES|OPENSHIFT-BLOCK-OUTPUT"
echo "===== QUALQUER REGRA QUE CITE O SPX ====="
iptables-save | grep -E "25\.130\.4\.|0x15e5f48|10\.116\.223\.11|0x5e5f49"
echo "===== CONTADORES ANTES ====="
iptables -L ILO-FILTER-FORWARD -v -n -x | grep -v " 0 *0 "
iptables -L OPENSHIFT-ADMIN-OUTPUT-RULES -v -n -x
iptables -L OPENSHIFT-BLOCK-OUTPUT -v -n -x
iptables -t nat -L OPENSHIFT-MASQUERADE -v -n -x | grep 223.11
' > /tmp/fw-antes.txt 2>&1

oc run teste-cofre -n sispx-des --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"'$NODE'"}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

/usr/local/bin/oc-v4.13 debug node/$NODE -- chroot /host sh -c '
echo "===== CONTADORES DEPOIS ====="
iptables -L ILO-FILTER-FORWARD -v -n -x | grep -v " 0 *0 "
iptables -L OPENSHIFT-ADMIN-OUTPUT-RULES -v -n -x
iptables -L OPENSHIFT-BLOCK-OUTPUT -v -n -x
iptables -t nat -L OPENSHIFT-MASQUERADE -v -n -x | grep 223.11
' > /tmp/fw-depois.txt 2>&1

cat /tmp/fw-antes.txt /tmp/fw-depois.txt
