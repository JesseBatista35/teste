
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$ # captura em TODAS as interfaces do nó (tun0, br0, ens192...)
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
>   timeout 90 tcpdump -nni any 'host 10.221.142.2 and port 443' > /tmp/captura-any.txt 2>&1 &
[1] 81882
-sh-4.2$
-sh-4.2$ sleep 30
-sh-4.2$
-sh-4.2$ # teste do sispx-des rodando no próprio ns57r
-sh-4.2$ oc run teste-ns57r -n sispx-des --rm -i --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
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
pod "teste-ns57r" deleted
pod sispx-des/teste-ns57r terminated (Error)
-sh-4.2$
-sh-4.2$ wait
[1]+  Concluído              /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- timeout 90 tcpdump -nni any 'host 10.221.142.2 and port 443' > /tmp/captura-any.txt 2>&1
-sh-4.2$ echo "======== CAPTURA ANY ========"
======== CAPTURA ANY ========
-sh-4.2$ cat /tmp/captura-any.txt
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
dropped privs to tcpdump
tcpdump: verbose output suppressed, use -v or -vv for full protocol decode
listening on any, link-type LINUX_SLL (Linux cooked v1), capture size 262144 bytes
14:16:56.280345 IP 25.130.4.99.37656 > 10.221.142.2.443: Flags [S], seq 960569492, win 64860, options [mss 1410,sackOK,TS val 782715866 ecr 0,nop,wscale 7], length 0
14:16:56.280374 IP 25.130.4.99.37656 > 10.221.142.2.443: Flags [S], seq 960569492, win 64860, options [mss 1410,sackOK,TS val 782715866 ecr 0,nop,wscale 7], length 0
14:17:10.732939 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782730319 ecr 0,nop,wscale 7], length 0
14:17:10.733087 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782730319 ecr 0,nop,wscale 7], length 0
14:17:11.768369 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782731354 ecr 0,nop,wscale 7], length 0
14:17:11.768407 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782731354 ecr 0,nop,wscale 7], length 0
14:17:13.817314 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782733403 ecr 0,nop,wscale 7], length 0
14:17:13.817346 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782733403 ecr 0,nop,wscale 7], length 0
14:17:17.848323 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782737434 ecr 0,nop,wscale 7], length 0
14:17:17.848363 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782737434 ecr 0,nop,wscale 7], length 0
14:17:25.976336 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782745562 ecr 0,nop,wscale 7], length 0
14:17:25.976373 IP 25.130.4.99.52854 > 10.221.142.2.443: Flags [S], seq 1473802914, win 64860, options [mss 1410,sackOK,TS val 782745562 ecr 0,nop,wscale 7], length 0
14:17:27.147409 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518352012 ecr 0,nop,wscale 7], length 0
14:17:27.147588 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518352012 ecr 0,nop,wscale 7], length 0
14:17:28.152314 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518353017 ecr 0,nop,wscale 7], length 0
14:17:28.152348 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518353017 ecr 0,nop,wscale 7], length 0
14:17:30.200347 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518355065 ecr 0,nop,wscale 7], length 0
14:17:30.200387 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518355065 ecr 0,nop,wscale 7], length 0
14:17:34.232323 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518359097 ecr 0,nop,wscale 7], length 0
14:17:34.232354 IP 25.130.4.100.53822 > 10.221.142.2.443: Flags [S], seq 1991029232, win 64860, options [mss 1410,sackOK,TS val 1518359097 ecr 0,nop,wscale 7], length 0
14:17:41.171576 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782760758 ecr 0,nop,wscale 7], length 0
14:17:41.171772 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782760758 ecr 0,nop,wscale 7], length 0
14:17:42.232314 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782761818 ecr 0,nop,wscale 7], length 0
14:17:42.232341 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782761818 ecr 0,nop,wscale 7], length 0
14:17:44.280336 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782763866 ecr 0,nop,wscale 7], length 0
14:17:44.280370 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782763866 ecr 0,nop,wscale 7], length 0
14:17:48.312335 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782767898 ecr 0,nop,wscale 7], length 0
14:17:48.312370 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782767898 ecr 0,nop,wscale 7], length 0
14:17:56.696321 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782776282 ecr 0,nop,wscale 7], length 0
14:17:56.696354 IP 25.130.4.99.52066 > 10.221.142.2.443: Flags [S], seq 3205361565, win 64860, options [mss 1410,sackOK,TS val 782776282 ecr 0,nop,wscale 7], length 0
14:18:12.005618 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782791592 ecr 0,nop,wscale 7], length 0
14:18:12.005896 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782791592 ecr 0,nop,wscale 7], length 0
14:18:13.016310 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782792602 ecr 0,nop,wscale 7], length 0
14:18:13.016330 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782792602 ecr 0,nop,wscale 7], length 0
14:18:15.064332 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782794650 ecr 0,nop,wscale 7], length 0
14:18:15.064377 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782794650 ecr 0,nop,wscale 7], length 0
14:18:19.096321 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782798682 ecr 0,nop,wscale 7], length 0
14:18:19.096353 IP 25.130.4.99.45370 > 10.221.142.2.443: Flags [S], seq 485383056, win 64860, options [mss 1410,sackOK,TS val 782798682 ecr 0,nop,wscale 7], length 0

38 packets captured
47 packets received by filter
0 packets dropped by kernel

Removing debug pod ...
-sh-4.2$
-sh-4.2$ echo "======== OVS TABLE 100 ========"
======== OVS TABLE 100 ========
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
>   sh -c 'ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 2>&1 | head -40'
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
OFPST_FLOW reply (OF1.3) (xid=0x6):
 cookie=0x0, duration=13772240.269s, table=100, n_packets=5118140833, n_bytes=1328224091492, priority=0 actions=goto_table:101

Removing debug pod ...
-sh-4.2$
