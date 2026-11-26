
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace | grep -E '10\.116\.223\.11([^0-9]|$)'
sispx-des                                          6184777    ["10.116.223.11"]
-sh-4.2$ oc get hostsubnet -o yaml | grep -n '10.116.223.11'
1022:  - 10.116.223.11
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n openshift-sdn sdn-xfcxc -c sdn --since=72h | grep -i -E '10\.116\.223\.11|egress' | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ arping -D -I <iface> -c 3 10.116.223.11
-sh: iface: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ arping -I <iface> -c 3 10.116.223.11
-sh: iface: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host ip -br link   # se tiver permissão
error: cannot debug pixnprd4-x44wk-worker-0-ns57r: unable to extract pod template from type *v1.Node
-sh-4.2$
-sh-4.2$
