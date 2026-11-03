oc rsh -n sipdm-des sipdm-api-estudante-des-266-qlttf
timeout 5 bash -c '</dev/tcp/10.116.81.74/443' && echo LOGIN-OK || echo LOGIN-FALHOU
timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo BANCO-OK || echo BANCO-FALHOU
