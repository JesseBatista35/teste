
-sh-4.2$
-sh-4.2$ oc create -f debug-tcpdump-009.yaml
pod/debug-tcpdump-009 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n openshift-ingress --sort-by='.lastTimestamp' | tail -20
LAST SEEN   FIRST SEEN   COUNT     NAME                                 KIND      SUBOBJECT   TYPE      REASON                 SOURCE                              MESSAGE
3m          3m           1         debug-tcpdump-009.18d3fb7ab7a8218d   Pod                   Warning   TaintToleration        kubelet, ceadecldlx009.nprd.caixa   Predicate TaintToleration failed
3m          3m           1         debug-tcpdump-009.18d3fb7aba3fdb87   Pod                   Normal    TaintManagerEviction   taint-controller                    Cancelling deletion of Pod openshift-ingress/debug-tcpdump-009
6s          3m           2         debug-tcpdump-009.18d3fb7ab798d678   Pod                   Normal    TaintManagerEviction   taint-controller                    Marking for deletion Pod openshift-ingress/debug-tcpdump-009
6s          6s           1         debug-tcpdump-009.18d3fbad4efbaaef   Pod                   Warning   TaintToleration        kubelet, ceadecldlx009.nprd.caixa   Predicate TaintToleration failed
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sigda-des --sort-by='.lastTimestamp' | tail -20
No resources found.
-sh-4.2$
