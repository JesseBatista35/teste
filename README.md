
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- nc -s 10.116.221.46 -zv -w 5 10.116.29.201 31153
Ncat: Version 7.70 ( https://nmap.org/ncat )
Ncat: Connected to 10.116.29.201:31153.
Ncat: 0 bytes sent, 0 bytes received in 0.02 seconds.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- nc -s 10.116.222.5 -zv -w 5 10.116.29.201 31153
Ncat: Version 7.70 ( https://nmap.org/ncat )
Ncat: Connection timed out.
command terminated with exit code 1
-sh-4.2$ oc get netnamespace sihdg-tqs -o jsonpath='{.netid}{"\n"}'
12401478
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n openshift-sdn -o wide | grep ceadecldlx081
sdn-4g965              2/2       Running   0              292d      10.116.208.101   ceadecldlx081.nprd.caixa   <none>           <none>
-sh-4.2$ oc exec -n openshift-sdn <pod-sdn-do-081> -c openvswitch -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "12401478|10.116.208.104"
-sh: pod-sdn-do-081: Arquivo ou diretório não encontrado
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- iptables -t nat -S OPENSHIFT-MASQUERADE | grep -E "10.116.221.46|10.116.222.5"
-A OPENSHIFT-MASQUERADE -s 70.59.189.0/32 -m mark --mark 0xbd3b46 -j SNAT --to-source 10.116.221.46
-A OPENSHIFT-MASQUERADE -s 116.74.190.1/32 -m mark --mark 0x1be4a74 -j SNAT --to-source 10.116.222.5
-sh-4.2$
