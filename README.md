cat <<'EOF' > debug-tcpdump-009.yaml
apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-009
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx009.nprd.caixa
  containers:
  - name: tcpdump
    image: registry.redhat.io/rhel8/support-tools
    command: ["sleep", "3600"]
    securityContext:
      privileged: true
  restartPolicy: Never



oc create -f debug-tcpdump-009.yaml


oc get pod debug-tcpdump-009 -n openshift-ingress


oc rsh -n openshift-ingress debug-tcpdump-009
tcpdump -i any -w /tmp/sigda-test-009.pcap 'port 443 and host 10.116.180.64'
