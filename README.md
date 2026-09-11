oc get pods -n openshift-ingress | grep debug-tcpdump

for n in 007 008 009 010; do
cat > debug-tcpdump-${n}.yaml <<EOF
apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-${n}
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx${n}.nprd.caixa
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
    command: ["sleep", "86400"]
    securityContext:
      privileged: true
  restartPolicy: Never
EOF

done

oc create -f debug-tcpdump-007.yaml
oc create -f debug-tcpdump-008.yaml
oc create -f debug-tcpdump-009.yaml
oc create -f debug-tcpdump-010.yaml


oc get pods -n openshift-ingress | grep debug-tcpdump

oc rsh -n openshift-ingress debug-tcpdump-007
tcpdump -i any -w /tmp/sigda-test3-007.pcap 'net 10.116.4.144/28'


oc rsh -n openshift-ingress debug-tcpdump-008
tcpdump -i any -w /tmp/sigda-test3-008.pcap 'net 10.116.4.144/28'

oc rsh -n openshift-ingress debug-tcpdump-009
tcpdump -i any -w /tmp/sigda-test3-009.pcap 'net 10.116.4.144/28'

oc rsh -n openshift-ingress debug-tcpdump-010
tcpdump -i any -w /tmp/sigda-test3-010.pcap 'net 10.116.4.144/28'
