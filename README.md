
-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$ echo "===== MARKS NO OVS DO ns57r ====="
===== MARKS NO OVS DO ns57r =====
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
>   sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 | grep -i -E "pkt_mark|0x5e5f49|0x7eed1b" | head -30'
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
 cookie=0x0, duration=239420.557s, table=20, n_packets=25779, n_bytes=1082718, priority=100,arp,in_port=2985,arp_spa=25.130.4.46,arp_sha=00:00:19:82:04:2e/00:00:ff:ff:ff:ff actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:30
 cookie=0x0, duration=90874.540s, table=20, n_packets=11296, n_bytes=474432, priority=100,arp,in_port=3020,arp_spa=25.130.4.82,arp_sha=00:00:19:82:04:52/00:00:ff:ff:ff:ff actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:30
 cookie=0x0, duration=249.360s, table=20, n_packets=12, n_bytes=504, priority=100,arp,in_port=3037,arp_spa=25.130.4.99,arp_sha=00:00:19:82:04:63/00:00:ff:ff:ff:ff actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:30
 cookie=0x0, duration=239420.557s, table=20, n_packets=3472960, n_bytes=1110165780, priority=100,ip,in_port=2985,nw_src=25.130.4.46 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=90874.540s, table=20, n_packets=1176525, n_bytes=389699559, priority=100,ip,in_port=3020,nw_src=25.130.4.82 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=249.360s, table=20, n_packets=70, n_bytes=5684, priority=100,ip,in_port=3037,nw_src=25.130.4.99 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=239420.557s, table=25, n_packets=2144033, n_bytes=739256655, priority=100,ip,nw_src=25.130.4.46 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=90874.540s, table=25, n_packets=819262, n_bytes=308171810, priority=100,ip,nw_src=25.130.4.82 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=249.360s, table=25, n_packets=48, n_bytes=4096, priority=100,ip,nw_src=25.130.4.99 actions=load:0x5e5f49->NXM_NX_REG0[],goto_table:27
 cookie=0x0, duration=187.723s, table=27, n_packets=4668, n_bytes=1744502, priority=50,reg0=0x5e5f49 actions=goto_table:30
 cookie=0x0, duration=239420.557s, table=70, n_packets=3483169, n_bytes=977271434, priority=100,ip,nw_dst=25.130.4.46 actions=load:0x5e5f49->NXM_NX_REG1[],load:0xba9->NXM_NX_REG2[],goto_table:80
 cookie=0x0, duration=90874.540s, table=70, n_packets=1225572, n_bytes=355889585, priority=100,ip,nw_dst=25.130.4.82 actions=load:0x5e5f49->NXM_NX_REG1[],load:0xbcc->NXM_NX_REG2[],goto_table:80
 cookie=0x0, duration=249.360s, table=70, n_packets=50, n_bytes=10064, priority=100,ip,nw_dst=25.130.4.99 actions=load:0x5e5f49->NXM_NX_REG1[],load:0xbdd->NXM_NX_REG2[],goto_table:80
 cookie=0x0, duration=1687.362s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x5e5f49,reg1=0x519c9 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=1687.362s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x7eed1b,reg1=0x519c9 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=1687.362s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x5e5f49,reg1=0xb96e0f actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=1687.362s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x7eed1b,reg1=0xb96e0f actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=1101.557s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x5e5f49,reg1=0x1806ae actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=1101.557s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x7eed1b,reg1=0x1806ae actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=746.097s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x5e5f49,reg1=0x9b41f7 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=746.097s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x7eed1b,reg1=0x9b41f7 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x9b41f7,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xadab5b,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xb96e0f,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xbc701a,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xbcc033,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xc3e59a,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xd5d1c9,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0x1806ae,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]
 cookie=0x0, duration=187.723s, table=80, n_packets=0, n_bytes=0, priority=150,reg0=0xf789f8,reg1=0x5e5f49 actions=output:NXM_NX_REG2[]

Removing debug pod ...
-sh-4.2$
-sh-4.2$ echo "===== TABELA 100 NO gp64t (nó do sispi, que funciona) ====="
===== TABELA 100 NO gp64t (nó do sispi, que funciona) =====
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-gp64t -- chroot /host \
>   sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | head -20'
Starting pod/pixnprd4-x44wk-worker-0-gp64t-debug ...
To use host binaries, run `chroot /host`
OFPST_FLOW reply (OF1.3) (xid=0x6):
 cookie=0x0, duration=13772928.743s, table=100, n_packets=4185357427, n_bytes=1613771143237, priority=0 actions=goto_table:101

Removing debug pod ...
-sh-4.2$
-sh-4.2$ echo "===== sigel-tqs rodando no ns57r ====="
===== sigel-tqs rodando no ns57r =====
-sh-4.2$ oc run teste-sigel -n sigel-tqs --rm -i --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
OK
pod "teste-sigel" deleted
-sh-4.2$
