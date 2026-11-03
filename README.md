
-sh-4.2$
-sh-4.2$  oc get pod sipdm-api-estudante-des-266-qlttf -n sipdm-des -o wide
NAME                                READY     STATUS    RESTARTS   AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
sipdm-api-estudante-des-266-qlttf   1/1       Running   0          3d22h     25.3.41.53   ceadecldlx084.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ while true; do date +%T; timeout 3 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU; sleep 2; done
14:54:46
OK
14:54:48
OK
14:54:50
OK

