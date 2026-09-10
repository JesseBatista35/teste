oc delete pod debug-tcpdump-007 debug-tcpdump-008 debug-tcpdump-009 debug-tcpdump-010

vi debug-tcpdump-009.yaml


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
    image: nicolaka/netshoot
    command: ["sleep", "86400"]
    securityContext:
      privileged: true
  restartPolicy: Never


oc create -f debug-tcpdump-009.yaml


oc get pod debug-tcpdump-009
