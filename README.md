oc get pods -n sipdm-des
oc rsh -n sipdm-des <pod-atual>
timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU

oc logs -n sipdm-des <pod-atual> --since=10m | grep -iE "SQLServerException|Acquisition timeout|GlobalExceptionHandler|ERROR" | tail -30

oc get hostsubnet | grep 10.116.221.183
