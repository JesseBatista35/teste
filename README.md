
-sh-4.2$ ^C
-sh-4.2$ oc get egressip -o wide | grep 10.188.6.220
error: the server doesn't have a resource type "egressip"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace | grep 10.188.6.220
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get nodes -o wide | grep 10.188.6.220
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ nslookup 10.188.6.220
** server can't find 220.6.188.10.in-addr.arpa.: NXDOMAIN

-sh-4.2$
-sh-4.2$
-sh-4.2$
