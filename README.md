E, se der, faça o teste de mover o pod já, mesmo antes da sala. É rápido, está no seu escopo e, se funcionar, encerra a discussão:

bash
oc delete pod sipdm-api-estudante-des-266-qlttf -n sipdm-des
oc get pod -n sipdm-des -o wide | grep estudante

Garanta que o pod novo não caiu no ceadecldlx084. Se cair, delete de novo. Depois teste de dentro do pod novo:

bash
oc rsh -n sipdm-des <pod-novo>
timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU

Se der OK, você chega no grupo com o problema resolvido, e a cobrança acaba ali.

-sh-4.2$ oc project sipdm-des
Now using project "sipdm-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sipdm-api-estudante-des-266-qlttf -n sipdm-des
pod "sipdm-api-estudante-des-266-qlttf" deleted
-sh-4.2$ oc get pod -n sipdm-des -o wide | grep estudante
sipdm-api-estudante-des-265-deploy   0/1       Completed   0          20d       25.3.41.60    ceadecldlx084.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-5n6s8    0/1       Running     0          58s       25.3.25.219   ceadecldlx052.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-deploy   0/1       Completed   0          4d20h     25.1.23.8     ceadecldlx049.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n sipdm-des -o wide | grep estudante
sipdm-api-estudante-des-265-deploy   0/1       Completed   0          20d       25.3.41.60    ceadecldlx084.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-5n6s8    1/1       Running     0          104s      25.3.25.219   ceadecldlx052.nprd.caixa   <none>           <none>
sipdm-api-estudante-des-266-deploy   0/1       Completed   0          4d20h     25.1.23.8     ceadecldlx049.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
