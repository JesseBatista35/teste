
-sh-4.2$ oc get hostsubnet | grep -E 'NAME|10.116.223.11'
NAME                              HOST                              HOST IP          SUBNET           EGRESS CIDRS          EGRESS IPS
pixnprd4-x44wk-worker-0-ns57r     pixnprd4-x44wk-worker-0-ns57r     10.116.222.69    25.130.4.0/23    ["10.116.192.0/19"]   ["10.116.223.22","10.116.223.9","10.116.223.11","10.116.223.20","10.116.223.18","10.116.223.13"]
-sh-4.2$ oc get pods -n sispx-des | grep pix-gestao | grep -v deploy
sispx-pix-gestao-des-391-ld6h8                            1/2       Running                 0                 2d18h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
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
-sh-4.2$
