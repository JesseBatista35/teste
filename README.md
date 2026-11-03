oc rsh -n sipdm-des sipdm-api-estudante-des-266-qlttf
while true; do date +%T; timeout 3 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU; sleep 2; done

