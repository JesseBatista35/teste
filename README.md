oc debug rc/sijur-middleware-backend-v2-des-35 -n sijur-des -- sleep 900 > /tmp/debug.log 2>&1 &
sleep 20
oc get pods -n sijur-des | grep debug

