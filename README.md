
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$ N=pixnprd4-x44wk-worker-0-lbxr9
-sh-4.2$ C(){ /usr/local/bin/oc-v4.13 debug node/$N -- chroot /host iptables -L ILO-FILTER-FORWARD -v -n -x 2>/dev/null | grep ND-DROP; }
-sh-4.2$
-sh-4.2$ echo ANTES;  C
ANTES
 2730888 164184469 ILO-FILTER-ND-DROP  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x40/0x70
-sh-4.2$ oc run teste-cofre -n sispx-des --rm -i --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")' 2>&1 | tail -1
pod sispx-des/teste-cofre terminated (Error)
-sh-4.2$ echo DEPOIS; C
DEPOIS
 2731224 164204629 ILO-FILTER-ND-DROP  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x40/0x70
-sh-4.2$
