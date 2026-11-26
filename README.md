
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace sispi-des -o jsonpath='{.egressIPs}{"\n"}'
[10.116.223.5]
-sh-4.2$ oc get netnamespace sispx-des -o yaml | grep -E 'time:|operation:|manager:'
    manager: openshift-sdn-controller
    operation: Update
    time: 2024-04-01T18:32:01Z
    manager: oc
    operation: Update
    time: 2024-04-01T18:32:34Z
-sh-4.2$ oc get hostsubnet | grep -E 'NAME|10.116.223'
NAME                              HOST                              HOST IP          SUBNET           EGRESS CIDRS          EGRESS IPS
pixnprd4-x44wk-worker-0-gp64t     pixnprd4-x44wk-worker-0-gp64t     10.116.222.99    25.131.0.0/23    ["10.116.192.0/19"]   ["10.116.223.4","10.116.223.14","10.116.223.24","10.116.223.5","10.116.223.12","10.116.223.17"]
pixnprd4-x44wk-worker-0-lbxr9     pixnprd4-x44wk-worker-0-lbxr9     10.116.222.41    25.129.6.0/23    ["10.116.192.0/19"]   ["10.116.223.15","10.116.223.10","10.116.223.19","10.116.223.21","10.116.223.16"]
pixnprd4-x44wk-worker-0-ns57r     pixnprd4-x44wk-worker-0-ns57r     10.116.222.69    25.130.4.0/23    ["10.116.192.0/19"]   ["10.116.223.22","10.116.223.9","10.116.223.11","10.116.223.20","10.116.223.18","10.116.223.13"]
pixnprd4-x44wk-worker-0-rjg8j     pixnprd4-x44wk-worker-0-rjg8j     10.116.222.147   25.129.4.0/23    ["10.116.192.0/19"]   ["10.116.223.6","10.116.223.25","10.116.223.23","10.116.223.26"]
-sh-4.2$ oc run teste-egress -n sispx-des --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c '
> import socket
> for h,p in [("api.des.caixa",8443),("cnpexdadvm01-scan4.extra.caixa.gov.br",1521),("sicsn.caixa",443)]:
>     try: socket.create_connection((h,p),8); print(h,p,"OK")
>     except Exception as e: print(h,p,"FALHA",e)'
If you don't see a command prompt, try pressing enter.

api.des.caixa 8443 FALHA timed out
cnpexdadvm01-scan4.extra.caixa.gov.br 1521 FALHA timed out
sicsn.caixa 443 FALHA timed out
pod "teste-egress" deleted
-sh-4.2$
