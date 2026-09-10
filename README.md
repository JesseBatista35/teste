-sh-4.2$
-sh-4.2$ oc get events -n sigda-des --sort-by='.lastTimestamp' | tail -20
No resources found.
-sh-4.2$ oc get node ceadecldlx009.nprd.caixa -o jsonpath='{.spec.taints}'
[map[key:node-role.kubernetes.io/infra value:reserved effect:NoSchedule] map[key:node-role.kubernetes.io/infra value:reserved effect:NoExecute]]-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
