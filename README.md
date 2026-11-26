IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
N=pixnprd4-x44wk-worker-0-lbxr9
C(){ /usr/local/bin/oc-v4.13 debug node/$N -- chroot /host iptables -L ILO-FILTER-FORWARD -v -n -x 2>/dev/null | grep ND-DROP; }

echo ANTES;  C
oc run teste-cofre -n sispx-des --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")' 2>&1 | tail -1
echo DEPOIS; C
