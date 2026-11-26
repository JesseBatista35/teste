h-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip -o wide 2>/dev/null | grep -i -E 'NAME|sispx|10.116.223.11'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip -o yaml 2>/dev/null | grep -B5 -A10 '10.116.223.11'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet 2>/dev/null | grep -E 'NAME|10.116.223.11'
NAME                              HOST                              HOST IP          SUBNET           EGRESS CIDRS          EGRESS IPS
pixnprd4-x44wk-worker-0-ns57r     pixnprd4-x44wk-worker-0-ns57r     10.116.222.69    25.130.4.0/23    ["10.116.192.0/19"]   ["10.116.223.22","10.116.223.9","10.116.223.11","10.116.223.20","10.116.223.18","10.116.223.13"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace sispx-des -o yaml 2>/dev/null | grep -A2 egressIPs
egressIPs:
- 10.116.223.11
kind: NetNamespace
--
      f:egressIPs: {}
      f:metadata:
        f:labels:
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=$(oc get pod sispx-pix-gestao-des-414-nmjc9 -n sispx-des -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}')
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run teste-cofre2 -n sispi-des --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("443_OK")'
If you don't see a command prompt, try pressing enter.
443_OK
pod "teste-cofre2" deleted
-sh-4.2$ oc run teste-cofre3 -n sispx-des --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;print(socket.gethostbyname("sicsn.caixa"));socket.create_connection(("10.221.142.2",443),10);print("443_OK")'
If you don't see a command prompt, try pressing enter.

Traceback (most recent call last):
  File "<string>", line 1, in <module>
    import socket;print(socket.gethostbyname("sicsn.caixa"));socket.create_connection(("10.221.142.2",443),10);print("443_OK")
                                                             ~~~~~~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/socket.py", line 864, in create_connection
    raise exceptions[0]
  File "/usr/local/lib/python3.13/socket.py", line 849, in create_connection
    sock.connect(sa)
    ~~~~~~~~~~~~^^^^
TimeoutError: timed out
pod "teste-cofre3" deleted
pod sispx-des/teste-cofre3 terminated (Error)
-sh-4.2$
