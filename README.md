
-sh-4.2$ oc whoami --show-server
https://api.pixnprd4.caixa:6443
-sh-4.2$ oc get nodes | grep worker
pixnprd4-x44wk-cp4i-847c9         Ready     cp4i,worker            2y81d     v1.28.15+d227d65
pixnprd4-x44wk-cp4i-cx7z6         Ready     cp4i,worker            2y81d     v1.28.15+d227d65
pixnprd4-x44wk-cp4i-xvt26         Ready     cp4i,worker            2y81d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-4xv2t     Ready     worker                 2y70d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-66pmj     Ready     worker                 2y70d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-676vg     Ready     worker                 2y70d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-7xjx8     Ready     worker                 644d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-84lvg     Ready     worker                 681d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-8cvtn     Ready     worker                 679d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-cg5wr     Ready     worker                 681d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-gp64t     Ready     worker                 3y4d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-lbxr9     Ready     worker                 3y10d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-lgxz7     Ready     worker                 2y150d    v1.28.15+d227d65
pixnprd4-x44wk-worker-0-m4grn     Ready     worker                 681d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-n7l66     Ready     worker                 681d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-n8p47     Ready     worker                 2y70d     v1.28.15+d227d65
pixnprd4-x44wk-worker-0-ns57r     Ready     worker                 3y4d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-p69xr     Ready     worker                 681d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-q6mh2     Ready     worker                 2y216d    v1.28.15+d227d65
pixnprd4-x44wk-worker-0-q8c9d     Ready     worker                 2y150d    v1.28.15+d227d65
pixnprd4-x44wk-worker-0-rjg8j     Ready     worker                 3y4d      v1.28.15+d227d65
pixnprd4-x44wk-worker-0-rrzdh     Ready     worker                 2y147d    v1.28.15+d227d65
pixnprd4-x44wk-worker-0-tcmhw     Ready     worker                 2y220d    v1.28.15+d227d65
pixnprd4-x44wk-worker-0-vrvrl     Ready     worker                 2y216d    v1.28.15+d227d65
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
