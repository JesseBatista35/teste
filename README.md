exit

oc logs -n sipdm-des sipdm-api-estudante-des-266-qlttf --since=30m | grep -iE "SQLServerException|Acquisition timeout|GlobalExceptionHandler" | tail -10
oc get hostsubnet | grep 10.116.221.183
oc get hostsubnet

