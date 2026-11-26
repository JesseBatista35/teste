-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$ NODE=pixnprd4-x44wk-worker-0-ns57r
-sh-4.2$
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/$NODE -- chroot /host sh -c '
> echo "===== REGRAS CUSTOM ====="
> iptables-save -t filter | grep -E "ILO-FILTER-FORWARD|OPENSHIFT-ADMIN-OUTPUT-RULES|OPENSHIFT-BLOCK-OUTPUT"
> echo "===== QUALQUER REGRA QUE CITE O SPX ====="
> iptables-save | grep -E "25\.130\.4\.|0x15e5f48|10\.116\.223\.11|0x5e5f49"
> echo "===== CONTADORES ANTES ====="
> iptables -L ILO-FILTER-FORWARD -v -n -x | grep -v " 0 *0 "
> iptables -L OPENSHIFT-ADMIN-OUTPUT-RULES -v -n -x
> iptables -L OPENSHIFT-BLOCK-OUTPUT -v -n -x
> iptables -t nat -L OPENSHIFT-MASQUERADE -v -n -x | grep 223.11
> ' > /tmp/fw-antes.txt 2>&1
-sh-4.2$
-sh-4.2$ oc run teste-cofre -n sispx-des --rm -i --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"'$NODE'"}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
If you don't see a command prompt, try pressing enter.
Traceback (most recent call last):
  File "<string>", line 1, in <module>
    import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")
                  ~~~~~~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/socket.py", line 864, in create_connection
    raise exceptions[0]
  File "/usr/local/lib/python3.13/socket.py", line 849, in create_connection
    sock.connect(sa)
    ~~~~~~~~~~~~^^^^
TimeoutError: timed out
pod "teste-cofre" deleted
pod sispx-des/teste-cofre terminated (Error)
-sh-4.2$
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/$NODE -- chroot /host sh -c '
> echo "===== CONTADORES DEPOIS ====="
> iptables -L ILO-FILTER-FORWARD -v -n -x | grep -v " 0 *0 "
> iptables -L OPENSHIFT-ADMIN-OUTPUT-RULES -v -n -x
> iptables -L OPENSHIFT-BLOCK-OUTPUT -v -n -x
> iptables -t nat -L OPENSHIFT-MASQUERADE -v -n -x | grep 223.11
> ' > /tmp/fw-depois.txt 2>&1
-sh-4.2$
-sh-4.2$ cat /tmp/fw-antes.txt /tmp/fw-depois.txt
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
===== REGRAS CUSTOM =====
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
:ILO-FILTER-FORWARD - [0:0]
:ILO-FILTER-FORWARD-ICMP-IN - [0:0]
:ILO-FILTER-FORWARD-ICMP-OUT - [0:0]
:ILO-FILTER-FORWARD-OTHER-IN - [0:0]
:ILO-FILTER-FORWARD-OTHER-OUT - [0:0]
:ILO-FILTER-FORWARD-TCP-IN - [0:0]
:ILO-FILTER-FORWARD-TCP-OUT - [0:0]
:ILO-FILTER-FORWARD-UDP-IN - [0:0]
:ILO-FILTER-FORWARD-UDP-OUT - [0:0]
:ILO-FILTER-FORWARD-USR - [0:0]
:OPENSHIFT-ADMIN-OUTPUT-RULES - [0:0]
:OPENSHIFT-BLOCK-OUTPUT - [0:0]
-A FORWARD -j ILO-FILTER-FORWARD
-A FORWARD -i tun0 ! -o tun0 -m comment --comment "administrator overrides" -j OPENSHIFT-ADMIN-OUTPUT-RULES
-A FORWARD -m comment --comment "firewall overrides" -j OPENSHIFT-BLOCK-OUTPUT
-A OUTPUT -m comment --comment "firewall overrides" -j OPENSHIFT-BLOCK-OUTPUT
-A ILO-FILTER-FORWARD -m mark --mark 0x10/0x70 -g ILO-FILTER-ACCEPT
-A ILO-FILTER-FORWARD -m mark --mark 0x20/0x70 -g ILO-FILTER-ND-ILLUMINATE
-A ILO-FILTER-FORWARD -m mark --mark 0x30/0x70 -g ILO-FILTER-INPUT-ND-REJECT
-A ILO-FILTER-FORWARD -m mark --mark 0x40/0x70 -g ILO-FILTER-ND-DROP
-A ILO-FILTER-FORWARD -m mark --mark 0x50/0x70 -g ILO-FILTER-SYSTEM
-A ILO-FILTER-FORWARD -m mark --mark 0x60/0x70 -g ILO-FILTER-ILLUMINATE
-A ILO-FILTER-FORWARD -j RETURN
-A OPENSHIFT-BLOCK-OUTPUT -p tcp -m tcp --dport 22623 --tcp-flags FIN,SYN,RST,ACK SYN -j REJECT --reject-with icmp-port-unreachable
-A OPENSHIFT-BLOCK-OUTPUT -p tcp -m tcp --dport 22624 --tcp-flags FIN,SYN,RST,ACK SYN -j REJECT --reject-with icmp-port-unreachable
===== QUALQUER REGRA QUE CITE O SPX =====
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
-A KUBE-SEP-2DQ2ZMFWLGDOWLFC -s 25.130.4.144/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-2DQ2ZMFWLGDOWLFC -p tcp -m tcp -j DNAT --to-destination 25.130.4.144:3100
-A KUBE-SEP-2LOUAFOYXC2MPQNU -s 25.130.4.90/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-2LOUAFOYXC2MPQNU -p tcp -m tcp -j DNAT --to-destination 25.130.4.90:8080
-A KUBE-SEP-2MEBCA7IOTI3ZFRB -s 25.130.4.247/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-2MEBCA7IOTI3ZFRB -p tcp -m tcp -j DNAT --to-destination 25.130.4.247:4318
-A KUBE-SEP-3NNYBIUNS5NYKXW3 -s 25.130.4.9/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-3NNYBIUNS5NYKXW3 -p tcp -m tcp -j DNAT --to-destination 25.130.4.9:24231
-A KUBE-SEP-4IL25YZBFQPZJDSZ -s 25.130.4.23/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-4IL25YZBFQPZJDSZ -p tcp -m tcp -j DNAT --to-destination 25.130.4.23:8000
-A KUBE-SEP-7BOEVDNUTOWW5OPY -s 25.130.4.19/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-7BOEVDNUTOWW5OPY -p tcp -m tcp -j DNAT --to-destination 25.130.4.19:8443
-A KUBE-SEP-7M76XAGTME4ZYEMB -s 25.130.4.32/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-7M76XAGTME4ZYEMB -p tcp -m tcp -j DNAT --to-destination 25.130.4.32:8080
-A KUBE-SEP-AE7TT54XEWF4SSUU -s 25.130.4.2/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-AE7TT54XEWF4SSUU -p tcp -m tcp -j DNAT --to-destination 25.130.4.2:9154
-A KUBE-SEP-AGNYHXD5S3XWNRBP -s 25.130.4.10/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-AGNYHXD5S3XWNRBP -p tcp -m tcp -j DNAT --to-destination 25.130.4.10:24231
-A KUBE-SEP-HGE4YXJBPEUE763E -s 25.130.4.247/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-HGE4YXJBPEUE763E -p tcp -m tcp -j DNAT --to-destination 25.130.4.247:8888
-A KUBE-SEP-KEA6BTMAQPU5FOLT -s 25.130.4.115/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-KEA6BTMAQPU5FOLT -p tcp -m tcp -j DNAT --to-destination 25.130.4.115:8000
-A KUBE-SEP-KNYXP2MGTIPPZFN7 -s 25.130.4.6/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-KNYXP2MGTIPPZFN7 -p tcp -m tcp -j DNAT --to-destination 25.130.4.6:8080
-A KUBE-SEP-KZYFAUPMJQQHOBDJ -s 25.130.4.6/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-KZYFAUPMJQQHOBDJ -p tcp -m tcp -j DNAT --to-destination 25.130.4.6:8888
-A KUBE-SEP-LIZPFJJILW25SN43 -s 25.130.4.19/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-LIZPFJJILW25SN43 -p tcp -m tcp -j DNAT --to-destination 25.130.4.19:8080
-A KUBE-SEP-LZHEYNQFNJANBNUV -s 25.130.4.145/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-LZHEYNQFNJANBNUV -p tcp -m tcp -j DNAT --to-destination 25.130.4.145:3100
-A KUBE-SEP-MMH6X36PRL3LU7L7 -s 25.130.4.90/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-MMH6X36PRL3LU7L7 -p tcp -m tcp -j DNAT --to-destination 25.130.4.90:8080
-A KUBE-SEP-PBTSYSEWPTRGOMSN -s 25.130.4.2/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-PBTSYSEWPTRGOMSN -p udp -m udp -j DNAT --to-destination 25.130.4.2:5353
-A KUBE-SEP-QYP3HFSMB26XBLJK -s 25.130.4.82/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-QYP3HFSMB26XBLJK -p tcp -m tcp -j DNAT --to-destination 25.130.4.82:8080
-A KUBE-SEP-SWELP4RBJUC26SPL -s 25.130.4.7/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-SWELP4RBJUC26SPL -p tcp -m tcp -j DNAT --to-destination 25.130.4.7:8080
-A KUBE-SEP-T6D6QIBJ2REPRFZU -s 25.130.4.23/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-T6D6QIBJ2REPRFZU -p tcp -m tcp -j DNAT --to-destination 25.130.4.23:9443
-A KUBE-SEP-U3UXFYLHAVMTCDRF -s 25.130.4.19/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-U3UXFYLHAVMTCDRF -p tcp -m tcp -j DNAT --to-destination 25.130.4.19:15021
-A KUBE-SEP-U3VJLZ375NJTPX3R -s 25.130.4.32/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-U3VJLZ375NJTPX3R -p tcp -m tcp -j DNAT --to-destination 25.130.4.32:8080
-A KUBE-SEP-W75E76ATE5ZR7SWN -s 25.130.4.82/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-W75E76ATE5ZR7SWN -p tcp -m tcp -j DNAT --to-destination 25.130.4.82:8080
-A KUBE-SEP-WS2JNOTTRCNPK2XI -s 25.130.4.2/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-WS2JNOTTRCNPK2XI -p tcp -m tcp -j DNAT --to-destination 25.130.4.2:5353
-A KUBE-SEP-YZTAMKTX4VLL2EKE -s 25.130.4.247/32 -j KUBE-MARK-MASQ
-A KUBE-SEP-YZTAMKTX4VLL2EKE -p tcp -m tcp -j DNAT --to-destination 25.130.4.247:4317
===== CONTADORES ANTES =====
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain ILO-FILTER-FORWARD (1 references)
    pkts      bytes target     prot opt in     out     source               destination
   93489 10368023 ILO-FILTER-ACCEPT  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x10/0x70
  126570  9881342 ILO-FILTER-INPUT-ND-REJECT  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x30/0x70
11403743 684764199 ILO-FILTER-ND-DROP  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x40/0x70
49124743 122190280103 RETURN     all  --  *      *       0.0.0.0/0            0.0.0.0/0
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain OPENSHIFT-ADMIN-OUTPUT-RULES (1 references)
    pkts      bytes target     prot opt in     out     source               destination
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain OPENSHIFT-BLOCK-OUTPUT (2 references)
    pkts      bytes target     prot opt in     out     source               destination
       0        0 REJECT     tcp  --  *      *       0.0.0.0/0            0.0.0.0/0            tcp dpt:22623 flags:0x17/0x02 reject-with icmp-port-unreachable
       0        0 REJECT     tcp  --  *      *       0.0.0.0/0            0.0.0.0/0            tcp dpt:22624 flags:0x17/0x02 reject-with icmp-port-unreachable
# Warning: iptables-legacy tables present, use iptables-legacy to see them

Removing debug pod ...
error: non-zero exit code from debug container
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
===== CONTADORES DEPOIS =====
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain ILO-FILTER-FORWARD (1 references)
    pkts      bytes target     prot opt in     out     source               destination
   93497 10369069 ILO-FILTER-ACCEPT  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x10/0x70
  126578  9881798 ILO-FILTER-INPUT-ND-REJECT  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x30/0x70
11403743 684764199 ILO-FILTER-ND-DROP  all  --  *      *       0.0.0.0/0            0.0.0.0/0           [goto]  mark match 0x40/0x70
49131527 122201571907 RETURN     all  --  *      *       0.0.0.0/0            0.0.0.0/0
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain OPENSHIFT-ADMIN-OUTPUT-RULES (1 references)
    pkts      bytes target     prot opt in     out     source               destination
# Warning: iptables-legacy tables present, use iptables-legacy to see them
Chain OPENSHIFT-BLOCK-OUTPUT (2 references)
    pkts      bytes target     prot opt in     out     source               destination
       0        0 REJECT     tcp  --  *      *       0.0.0.0/0            0.0.0.0/0            tcp dpt:22623 flags:0x17/0x02 reject-with icmp-port-unreachable
       0        0 REJECT     tcp  --  *      *       0.0.0.0/0            0.0.0.0/0            tcp dpt:22624 flags:0x17/0x02 reject-with icmp-port-unreachable
# Warning: iptables-legacy tables present, use iptables-legacy to see them

Removing debug pod ...
error: non-zero exit code from debug container
-sh-4.2$
