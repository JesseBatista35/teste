
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/siinp-nucleo-des -n siinp-des
deploymentconfigs "siinp-nucleo-des"
REVISION        STATUS          CAUSE
291             Complete        manual change
293             Failed          manual change

-sh-4.2$ oc rollout status dc/siinp-nucleo-des -n siinp-des
error: replication controller "siinp-nucleo-des-293" has failed progressing
-sh-4.2$ oc get rc -n siinp-des -l app=siinp-nucleo-des
NAME                   DESIRED   CURRENT   READY     AGE
siinp-nucleo-des-291   3         3         3         4h16m
siinp-nucleo-des-293   0         0         0         17m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc adm cordon ceadecldlx081.nprd.caixa
node/ceadecldlx081.nprd.caixa cordoned
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/siinp-nucleo-des -n siinp-des
deploymentconfig.apps.openshift.io/siinp-nucleo-des rolled out
-sh-4.2$ oc get pods -n siinp-des -l deploymentconfig=siinp-nucleo-des -o wide -w
NAME                         READY     STATUS     RESTARTS   AGE       IP            NODE                       NOMINATED NODE
siinp-nucleo-des-291-4vtrx   1/1       Running    0          4h        25.3.36.161   ceadecldlx079.nprd.caixa   <none>
siinp-nucleo-des-291-c55mr   1/1       Running    0          4h        25.2.32.145   ceadecldlx068.nprd.caixa   <none>
siinp-nucleo-des-291-rvnkb   1/1       Running    0          4h        25.0.37.7     ceadecldlx076.nprd.caixa   <none>
siinp-nucleo-des-294-4jqcb   0/1       Init:0/2   0          2s        <none>        ceadecldlx062.nprd.caixa   <none>

