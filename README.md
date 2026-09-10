
-sh-4.2$ cat debug-tcpdump-009.yaml
apiVersion: v1
kind: Pod
metadata:
  name: debug-tcpdump-009
  namespace: openshift-ingress
spec:
  hostNetwork: true
  nodeName: ceadecldlx009.nprd.caixa
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
    image: registry.redhat.io/rhel8/support-tools
    command: ["sleep", "3600"]
    securityContext:
      privileged: true
  restartPolicy: Never
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
