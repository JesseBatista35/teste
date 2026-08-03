oc get pods -n <namespace-sispl-tqs> | grep sispl-consulta-apostas
oc rsh <nome-do-pod>

curl -v --connect-timeout 5 telnet://cics.des.coredf.caixa:8080

timeout 5 bash -c "</dev/tcp/cics.des.coredf.caixa/8080" && echo "CONECTOU" || echo "TIMEOUT/BLOQUEADO"

getent hosts cics.des.coredf.caixa

nslookup cics.des.coredf.caixa

traceroute -T -p 8080 cics.des.coredf.caixa

curl -v --connect-timeout 5 telnet://10.192.224.76:8080
