
NAME                                 READY     STATUS    RESTARTS   AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sipgc-api-informacoes-des-37-s9497   1/1       Running   0          14d       25.0.18.207   ceadecldlx040.nprd.caixa   <none>           <none>
-sh-4.2$ ^C
-sh-4.2$ getent hosts ceadecldlx040.nprd.caixa
10.116.208.60   ceadecldlx040.nprd.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get node ceadecldlx040.nprd.caixa -o wide
NAME                       STATUS    ROLES     AGE       VERSION           INTERNAL-IP     EXTERNAL-IP   OS-IMAGE                        KERNEL-VERSION           CONTAINER-RUNTIME
ceadecldlx040.nprd.caixa   Ready     worker    3y        v1.25.8+27e744f   10.116.208.60   <none>        Fedora CoreOS 37.20230322.3.0   6.1.18-200.fc37.x86_64   cri-o://1.25.1
-sh-4.2$
-sh-4.2$
-sh-4.2$
