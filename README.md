
Last login: Tue Nov  3 14:54:04 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc login --token=sha256~APplf5ZpY0exQi5z6FXkvpMxmPnAJHV_PcRfzOWrUts --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 1000 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sihdg-hmp".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip -o wide | grep 192.168.236.173
error: the server doesn't have a resource type "egressip"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet 2>/dev/null | grep 236.173
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug node/ceadecldlx071.nprd.caixa -- chroot /host sh -c \
>   'ip -4 addr | grep -B2 236.173; nmcli -f NAME,DEVICE,FILENAME con show; grep -rn 192.168 /etc/NetworkManager/system-connections/'
error: cannot debug ceadecldlx071.nprd.caixa: unable to extract pod template from type *v1.Node
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get nncp 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get mc | grep -iE 'net|nm|ens'
99-master-okd-extensions                                                                           3.2.0             3y360d
99-worker-okd-extensions                                                                           3.2.0             3y360d
-sh-4.2$
