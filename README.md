
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
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
-sh-4.2$
