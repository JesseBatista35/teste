
-sh-4.2$ oc debug rc/sijur-middleware-backend-v2-des-35 -n sijur-des -- sleep 900 > /tmp/debug.log 2>&1 &
[1] 113805
-sh-4.2$ sleep 20
-sh-4.2$ oc get pods -n sijur-des | grep debug
sijur-middleware-backend-v2-des-35-debug           1/1       Running     0               20s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
