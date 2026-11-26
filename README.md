IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
  timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443' > /tmp/captura.txt 2>&1 &

sleep 30

for NS in sispx-des sigel-tqs; do
  echo "=== $NS ==="
  oc run teste-cofre -n $NS --rm -i --restart=Never --image=$IMG \
    --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
    --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
done

echo "Aguardando fim da captura..."
wait
echo "======== CAPTURA ========"
cat /tmp/captura.txt
