
-sh-4.2$
-sh-4.2$ oc logs -n openshift-sdn sdn-rprgw -c sdn --since=72h | grep -i -E "10.116.221.46|egress" | tail -50
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n openshift-sdn sdn-rprgw -c sdn > /tmp/sdn-084.log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c . /tmp/sdn-084.log
179295
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "10.116.221.46" /tmp/sdn-084.log | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- iptables -t nat -S | grep -i 10.116.221.46
-A OPENSHIFT-MASQUERADE -s 70.59.189.0/32 -m mark --mark 0xbd3b46 -j SNAT --to-source 10.116.221.46
-sh-4.2$
-sh-4.2$
-sh-4.2$ c exec -n openshift-sdn sdn-rprgw -c sdn -- ip -4 addr | grep -B2 10.116.221.46
-sh: c: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- ip -4 addr | grep -B2 10.116.221.46
    inet 10.116.222.5/19 brd 10.116.223.255 scope global secondary ens192:eip
       valid_lft forever preferred_lft forever
    inet 10.116.221.46/19 brd 10.116.223.255 scope global secondary ens192:eip
-sh-4.2$
