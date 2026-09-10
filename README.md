vi debug-tcpdump-007.yaml


apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-007
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx007.nprd.caixa
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


oc create -f debug-tcpdump-007.yaml
oc get pod debug-tcpdump-007 -n openshift-ingress

oc rsh -n openshift-ingress debug-tcpdump-007
tcpdump -i any -w /tmp/sigda-test-007.pcap 'port 443 and host 10.116.180.64'
