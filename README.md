
-sh-4.2$ oc get pod -n sicmo-des -o wide | grep sicmo
sicmo-api-17-des-23-gd5tc               1/1       Running     0          365d      25.0.26.37    ceadecldlx054.nprd.caixa   <none>           <none>
sicmo-backend-des-198-deploy            0/1       Completed   0          5d2h      25.1.36.21    ceadecldlx077.nprd.caixa   <none>           <none>
sicmo-backend-des-199-deploy            0/1       Completed   0          21h       25.3.37.33    ceadecldlx079.nprd.caixa   <none>           <none>
sicmo-backend-des-199-vj7mx             1/1       Running     0          21h       25.3.41.134   ceadecldlx084.nprd.caixa   <none>           <none>
sicmo-internet-des-94-deploy            0/1       Completed   0          20h       25.3.26.46    ceadecldlx057.nprd.caixa   <none>           <none>
sicmo-internet-des-94-kn4qr             0/1       Init:0/2    0          91m       <none>        ceadecldlx041.nprd.caixa   <none>           <none>
sicmo-internet-des-97-deploy            0/1       Error       0          92m       25.3.20.216   ceadecldlx048.nprd.caixa   <none>           <none>
sicmo-internet-frontend-des-98-deploy   0/1       Completed   0          40d       25.3.23.227   ceadecldlx034.nprd.caixa   <none>           <none>
sicmo-internet-frontend-des-99-deploy   0/1       Completed   0          21h       25.2.29.148   ceadecldlx059.nprd.caixa   <none>           <none>
sicmo-internet-frontend-des-99-zdjzc    2/2       Running     0          21h       25.2.29.149   ceadecldlx059.nprd.caixa   <none>           <none>
sicmo-web-des-210-deploy                0/1       Completed   0          25d       25.1.14.196   ceadecldlx033.nprd.caixa   <none>           <none>
sicmo-web-des-211-68zr5                 2/2       Running     0          21h       25.3.37.32    ceadecldlx079.nprd.caixa   <none>           <none>
sicmo-web-des-211-deploy                0/1       Completed   0          21h       25.3.41.133   ceadecldlx084.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc -n sicmo-des -o yaml | grep -B3 -A3 fs_sicmo
-sh-4.2$
-sh-4.2$ oc get node ceadecldlx019.nprd.caixa -o wide
NAME                       STATUS    ROLES     AGE       VERSION           INTERNAL-IP     EXTERNAL-IP   OS-IMAGE                        KERNEL-VERSION           CONTAINER-RUNTIME
ceadecldlx019.nprd.caixa   Ready     worker    3y327d    v1.25.8+27e744f   10.116.208.39   <none>        Fedora CoreOS 37.20230322.3.0   6.1.18-200.fc37.x86_64   cri-o://1.25.1
-sh-4.2$ oc delete pod sicmo-internet-des-97-8bb57 -n sicmo-des
Error from server (NotFound): pods "sicmo-internet-des-97-8bb57" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
