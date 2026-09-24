
-sh-4.2$ oc get netnamespace sicbp-des
NAME        NETID     EGRESS IPS
sicbp-des   998810    ["10.116.222.84"]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip -o wide
error: the server doesn't have a resource type "egressip"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip -o jsonpath='{range .items[*]}{.metadata.name}{"\t"}{.spec.namespaceSelector}{"\t"}{.status.items[*].egressIP}{"\n"}{end}'
error: the server doesn't have a resource type "egressip"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sicbp-des -o wide | grep trilha
sicbp-trilha-api-des-57-deploy                 0/1       Completed   0              3h35m     25.1.24.214   ceadecldlx073.nprd.caixa   <none>           <none>
sicbp-trilha-api-des-58-88xfr                  1/1       Running     0              69m       25.2.7.105    ceadecldlx020.nprd.caixa   <none>           <none>
sicbp-trilha-api-des-58-deploy                 0/1       Completed   0              69m       25.0.32.156   ceadecldlx066.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-backend-des-72-deploy    0/1       Completed   0              49d       25.1.28.93    ceadecldlx061.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-backend-des-73-b4c4x     1/1       Running     3 (44h ago)    44d       25.0.41.191   ceadecldlx085.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-backend-des-73-deploy    0/1       Completed   0              44d       25.0.19.53    ceadecldlx040.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-frontend-des-45-deploy   0/1       Completed   0              350d      25.3.7.148    ceadecldlx019.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-frontend-des-46-deploy   0/1       Completed   0              350d      25.2.7.244    ceadecldlx020.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-frontend-des-46-w4r97    2/2       Running     0              350d      25.3.18.123   ceadecldlx043.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-mfe-des-22-deploy        0/1       Completed   0              46h       25.0.42.38    ceadecldlx080.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-mfe-des-23-cbbz5         2/2       Running     0              95m       25.0.32.144   ceadecldlx066.nprd.caixa   <none>           <none>
sicbp-trilhaauditoria-mfe-des-23-deploy        0/1       Completed   0              95m       25.2.17.186   ceadecldlx038.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -n sicbp-des -o name | grep trilha | head -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sicbp-des $POD -- curl -sv -x http://proxydes.caixa:80 https://brazilsoutheast-0.in.applicationinsights.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|TMG"
-sh-4.2$
