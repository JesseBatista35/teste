
-sh-4.2$ IMG=$(oc get pods -n sispx-des -o jsonpath='{range .items[*]}{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}{"\n"}{end}' | grep -v '^$' | head -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo "IMAGEM: $IMG"
IMAGEM: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$ oc run teste-cofre -n sispx-des --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
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
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami --show-server
https://api.pixnprd4.caixa:6443
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
>   timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443'
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
dropped privs to tcpdump
tcpdump: verbose output suppressed, use -v or -vv for full protocol decode
listening on ens192, link-type EN10MB (Ethernet), capture size 262144 bytes
^C
Removing debug pod ...
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami --show-server
https://api.pixnprd4.caixa:6443
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$
-sh-4.2$ for NS in sispx-des sigel-tqs; do
>   echo "=== $NS ==="
>   oc run teste-cofre -n $NS --rm -it --restart=Never --image=$IMG \
>     --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>     --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
> done
=== sispx-des ===
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
=== sigel-tqs ===
If you don't see a command prompt, try pressing enter.
Error attaching, falling back to logs: Internal error occurred: error attaching to container: container is not created or running
OK
pod "teste-cofre" deleted
-sh-4.2$ ^C
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
-sh-4.2$
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
>   timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443' > /tmp/captura.txt 2>&1 &
[1] 81164
-sh-4.2$
-sh-4.2$ sleep 30
-sh-4.2$
-sh-4.2$ for NS in sispx-des sigel-tqs; do
>   echo "=== $NS ==="
>   oc run teste-cofre -n $NS --rm -i --restart=Never --image=$IMG \
>     --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>     --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
> done
=== sispx-des ===
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
=== sigel-tqs ===
OK
pod "teste-cofre" deleted
-sh-4.2$
-sh-4.2$ echo "Aguardando fim da captura..."
Aguardando fim da captura...
-sh-4.2$ wait
[1]+  Concluído              /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443' > /tmp/captura.txt 2>&1
-sh-4.2$ echo "======== CAPTURA ========"
======== CAPTURA ========
-sh-4.2$ cat /tmp/captura.txt
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
dropped privs to tcpdump
tcpdump: verbose output suppressed, use -v or -vv for full protocol decode
listening on ens192, link-type EN10MB (Ethernet), capture size 262144 bytes
14:11:29.771936 IP 10.116.223.22.55808 > 10.221.142.2.443: Flags [S], seq 2538815036, win 64860, options [mss 1410,sackOK,TS val 137554665 ecr 0,nop,wscale 7], length 0
14:11:29.772890 IP 10.221.142.2.443 > 10.116.223.22.55808: Flags [S.], seq 1051230238, ack 2538815037, win 8192, options [mss 1330,nop,wscale 8,nop,nop,sackOK], length 0
14:11:29.773725 IP 10.116.223.22.55808 > 10.221.142.2.443: Flags [.], ack 1, win 507, length 0
14:11:29.773734 IP 10.116.223.22.55808 > 10.221.142.2.443: Flags [F.], seq 1, ack 1, win 507, length 0
14:11:29.774404 IP 10.221.142.2.443 > 10.116.223.22.55808: Flags [F.], seq 1, ack 2, win 512, length 0
14:11:29.774588 IP 10.116.223.22.55808 > 10.221.142.2.443: Flags [.], ack 2, win 507, length 0

6 packets captured
10 packets received by filter
0 packets dropped by kernel

Removing debug pod ...
-sh-4.2$
