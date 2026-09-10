Nó 008 — nova aba:

bash
vi debug-tcpdump-008.yaml

Aperta i, cola:

apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-008
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx008.nprd.caixa
  tolerations:
  - key: node-role.kubernetes.io/infra
    operator: Equal
    value: reserved
    effect: NoSchedule
  - key: node-role.kubernetes.io/infra
    operator: Equal
    value: reserved
    effect: NoExecute
  containers:
  - name: tcpdump
    image: nicolaka/netshoot
    command: ["sleep", "3600"]
    securityContext:
      privileged: true
  restartPolicy: Never

Esc, :wq, Enter, depois:

bash
oc create -f debug-tcpdump-008.yaml
oc get pod debug-tcpdump-008 -n openshift-ingress

(espera ficar Running)

bash
oc rsh -n openshift-ingress debug-tcpdump-008
tcpdump -i any -w /tmp/sigda-test-008.pcap 'port 443 and host 10.116.180.64'

Nó 010 — outra nova aba:

bash
vi debug-tcpdump-010.yaml

Aperta i, cola:

apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-010
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx010.nprd.caixa
  tolerations:
  - key: node-role.kubernetes.io/infra
    operator: Equal
    value: reserved
    effect: NoSchedule
  - key: node-role.kubernetes.io/infra
    operator: Equal
    value: reserved
    effect: NoExecute
  containers:
  - name: tcpdump
    image: nicolaka/netshoot
    command: ["sleep", "3600"]
    securityContext:
      privileged: true
  restartPolicy: Never

Esc, :wq, Enter, depois:

bash
oc create -f debug-tcpdump-010.yaml
oc get pod debug-tcpdump-010 -n openshift-ingress

(espera ficar Running)

bash
oc rsh -n openshift-ingress debug-tcpdump-010
tcpdump -i any -w /tmp/sigda-test-010.pcap 'port 443 and host 10.116.180.64'

Quando tiver os 4 rodando (009, 007, 008, 010), me avisa que aí é hora de chamar o Mateus pra disparar o teste.
