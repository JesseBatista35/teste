
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$ echo "===== ONDE ESTÁ O .11 AGORA ====="
===== ONDE ESTÁ O .11 AGORA =====
-sh-4.2$ oc get hostsubnet | grep -E 'NAME|10.116.223.11'
NAME                              HOST                              HOST IP          SUBNET           EGRESS CIDRS          EGRESS IPS
pixnprd4-x44wk-worker-0-lbxr9     pixnprd4-x44wk-worker-0-lbxr9     10.116.222.41    25.129.6.0/23    ["10.116.192.0/19"]   ["10.116.223.11","10.116.223.15","10.116.223.10","10.116.223.19","10.116.223.21","10.116.223.16"]
-sh-4.2$
-sh-4.2$ echo "===== TESTE POR CLASSE ILLUMIO ====="
===== TESTE POR CLASSE ILLUMIO =====
-sh-4.2$ for IP in 11 16 10 13 20 22 5; do
>   NS=$(oc get netnamespace | grep -E "10\.116\.223\.$IP([^0-9]|\$)" | awk 'NR==1{print $1}')
>   [ -z "$NS" ] && { echo ".$IP -> sem namespace"; continue; }
>   R=$(oc run teste-classe -n $NS --rm -i --restart=Never --image=$IMG \
>       --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>       --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")' 2>&1 | grep -E "^OK|TimeoutError|Forbidden|refused" | head -1)
>   echo ".$IP  ns=$NS  ->  ${R:-sem resposta}"
> done
.11  ns=sispx-des  ->  TimeoutError: timed out
.16  ns=sispl-tqs  ->  TimeoutError: timed out
.10  ns=pix-des  ->  OK
.13  ns=sispi-hmp  ->  OK
.20  ns=silce-hmp  ->  OK
.22  ns=sigel-tqs  ->  OK
.5  ns=sispi-des  ->  OK
-sh-4.2$
