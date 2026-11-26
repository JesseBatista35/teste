IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

# captura em TODAS as interfaces do nó (tun0, br0, ens192...)
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
  timeout 90 tcpdump -nni any 'host 10.221.142.2 and port 443' > /tmp/captura-any.txt 2>&1 &

sleep 30

# teste do sispx-des rodando no próprio ns57r
oc run teste-ns57r -n sispx-des --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

wait
echo "======== CAPTURA ANY ========"
cat /tmp/captura-any.txt

echo "======== OVS TABLE 100 ========"
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
  sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 2>&1 | head -40'
