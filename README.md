IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

echo "===== ONDE ESTÁ O .11 AGORA ====="
oc get hostsubnet | grep -E 'NAME|10.116.223.11'

echo "===== TESTE POR CLASSE ILLUMIO ====="
for IP in 11 16 10 13 20 22 5; do
  NS=$(oc get netnamespace | grep -E "10\.116\.223\.$IP([^0-9]|\$)" | awk 'NR==1{print $1}')
  [ -z "$NS" ] && { echo ".$IP -> sem namespace"; continue; }
  R=$(oc run teste-classe -n $NS --rm -i --restart=Never --image=$IMG \
      --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
      --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")' 2>&1 | grep -E "^OK|TimeoutError|Forbidden|refused" | head -1)
  echo ".$IP  ns=$NS  ->  ${R:-sem resposta}"
done
