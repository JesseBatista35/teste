
-sh-4.2$ oc get pods -n sisgf-des -o wide
NAME                            READY     STATUS      RESTARTS       AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sisgf-api-des-85-deploy         0/1       Completed   0              51d       25.1.8.180    ceadecldlx027.nprd.caixa   <none>           <none>
sisgf-api-des-86-deploy         0/1       Completed   0              50d       25.3.43.149   ceadecldlx086.nprd.caixa   <none>           <none>
sisgf-api-des-86-vhp4x          1/1       Running     0              50d       25.3.22.10    ceadecldlx034.nprd.caixa   <none>           <none>
sisgf-backend-des-369-deploy    0/1       Completed   0              8d        25.1.28.38    ceadecldlx061.nprd.caixa   <none>           <none>
sisgf-backend-des-370-58dxl     1/1       Running     0              6d23h     25.1.21.74    ceadecldlx046.nprd.caixa   <none>           <none>
sisgf-backend-des-370-deploy    0/1       Completed   0              7d        25.3.14.3     ceadecldlx035.nprd.caixa   <none>           <none>
sisgf-backend-des-370-gpc5z     1/1       Running     2 (116m ago)   6d23h     25.3.19.166   ceadecldlx043.nprd.caixa   <none>           <none>
sisgf-backend-des-370-zg8dc     1/1       Running     0              7d        25.3.14.5     ceadecldlx035.nprd.caixa   <none>           <none>
sisgf-backend-des-373-deploy    0/1       Error       0              18m       25.0.14.60    ceadecldlx078.nprd.caixa   <none>           <none>
sisgf-batch-des-300-deploy      0/1       Completed   0              6d        25.0.15.141   ceadecldlx078.nprd.caixa   <none>           <none>
sisgf-batch-des-301-ctt5b       1/1       Running     0              6d        25.2.9.232    ceadecldlx022.nprd.caixa   <none>           <none>
sisgf-batch-des-301-deploy      0/1       Completed   0              6d        25.3.13.60    ceadecldlx032.nprd.caixa   <none>           <none>
sisgf-frontend-des-282-deploy   0/1       Completed   0              5d3h      25.0.34.134   ceadecldlx070.nprd.caixa   <none>           <none>
sisgf-frontend-des-283-deploy   0/1       Completed   0              5d3h      25.3.30.136   ceadecldlx064.nprd.caixa   <none>           <none>
sisgf-frontend-des-283-xf854    2/2       Running     0              5d3h      25.0.34.140   ceadecldlx070.nprd.caixa   <none>           <none>
-sh-4.2$
