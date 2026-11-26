
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1
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
-sh-4.2$
-sh-4.2$
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
>   ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 2>&1 | grep -E '0x5e5f49|0x7eed1b|6184777|8318235'
-sh-4.2$
-sh-4.2$
-sh-4.2$
