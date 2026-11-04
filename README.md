
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet | grep 10.116.221.183
ceadecldlx084.nprd.caixa   ceadecldlx084.nprd.caixa   10.116.208.104   25.3.40.0/23   ["10.116.192.0/19"]   ["10.116.222.190","10.116.222.6","10.116.209.59","10.116.221.183","10.116.222.164","10.116.222.206","10.116.220.210","10.116.222.5","10.116.220.180","10.116.221.245"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n sipdm-des -o wide | grep estudante
sipdm-api-estudante-des-265-deploy   0/1       Completed   0          20d       25.3.41.60    ceadecldlx084.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-5n6s8    1/1       Running     0          176m      25.3.25.219   ceadecldlx052.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-deploy   0/1       Completed   0          4d23h     25.1.23.8     ceadecldlx049.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet | grep 10.116.221.183
ceadecldlx085.nprd.caixa   ceadecldlx085.nprd.caixa   10.116.208.105   25.0.40.0/23   ["10.116.192.0/19"]   ["10.116.220.39","10.116.209.87","10.116.222.93","10.116.220.214","10.116.220.140","10.116.221.160","10.116.221.224","10.116.221.25","10.116.222.134","10.116.209.155","10.116.221.183"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sipdm-des sipdm-api-estudante-des-266-5n6s8
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU
OK
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU
OK
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$



rroslvio o bruno dtesotou no ´pastma retornou 200
