oc get egressip -o wide | grep 10.188.6.220
oc get netnamespace | grep 10.188.6.220

oc get nodes -o wide | grep 10.188.6.220

nslookup 10.188.6.220
