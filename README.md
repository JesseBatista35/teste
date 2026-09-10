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
