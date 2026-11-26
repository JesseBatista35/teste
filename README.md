
-sh-4.2$
-sh-4.2$ oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)\]'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run teste-ns57r -n <ns> --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),8);print("OK")'
-sh: ns: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)([^0-9]|$)'
sigel-tqs                                          8318235    ["10.116.223.22"]
silce-des                                          16222712   ["10.116.223.18"]
silce-hmp                                          12369971   ["10.116.223.20"]
simpi-des                                          12152335   ["10.116.223.9"]
sispi-hmp                                          9220784    ["10.116.223.13"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ NS=$(oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)([^0-9]|$)' | awk 'NR==1{print $1}')
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo "Testando a partir de: $NS"
Testando a partir de: sigel-tqs
-sh-4.2$
-sh-4.2$ oc run teste-ns57r -n $NS --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),8);print("OK")'
OK
pod "teste-ns57r" deleted
-sh-4.2$ oc get pods -n openshift-sdn -o wide | grep ns57r
sdn-xfcxc              2/2       Running   2               159d      10.116.222.69    pixnprd4-x44wk-worker-0-ns57r     <none>           <none>
-sh-4.2$
