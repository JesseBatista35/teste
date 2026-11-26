
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressnetworkpolicy -n sispx-des
No resources found.
-sh-4.2$ oc get egressnetworkpolicy -n sispx-des -o yaml
apiVersion: v1
items: []
kind: List
metadata:
  resourceVersion: ""
  selfLink: ""
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get networkpolicy -n sispx-des
NAME                          POD-SELECTOR                   AGE
istio-expose-route-pix-mesh   maistra.io/expose-route=true   2y169d
istio-mesh-pix-mesh           <none>                         2y169d
user-workload-access          <none>                         148d
-sh-4.2$ oc get networkpolicy -n sispx-des -o yaml | grep -B3 -A15 -i egress
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressnetworkpolicy -n sigel-tqs
No resources found.
-sh-4.2$ oc get networkpolicy -n sigel-tqs
NAME                          POD-SELECTOR                   AGE
istio-expose-route-pix-mesh   maistra.io/expose-route=true   589d
istio-mesh-pix-mesh           <none>                         589d
-sh-4.2$
