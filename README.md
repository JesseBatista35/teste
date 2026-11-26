
-sh-4.2$
-sh-4.2$
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
>   timeout 60 tcpdump -nni ens192 'host 10.221.142.2 and port 443'
Temporary namespace openshift-debug-bmqtz is created for debugging node...
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
timeout: failed to run command 'tcpdump': No such file or directory

Removing debug pod ...
Temporary namespace openshift-debug-bmqtz was removed.
error: non-zero exit code from debug container
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ IMG=$(oc get pod sispx-pix-gestao-des-414-nmjc9 -n sispx-des -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}')
Error from server (NotFound): pods "sispx-pix-gestao-des-414-nmjc9" not found
-sh-4.2$ oc run teste-tcpdump -n sispx-des --rm -it --restart=Never --image=$IMG \
>   --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
>   --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
error: --image is required
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ bash
[p585600@cadsvaprlx067 ~]$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host sh -c '
> iptables -t nat -S | grep -E "10.116.223.(11|22)";
> ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "0x5e5f49|0x7eed1b"'
Temporary namespace openshift-debug-mlv9h is created for debugging node...
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
# Warning: iptables-legacy tables present, use iptables-legacy to see them
-A OPENSHIFT-MASQUERADE -s 25.128.0.0/14 -m mark --mark 0x15e5f48 -j SNAT --to-source 10.116.223.11
-A OPENSHIFT-MASQUERADE -s 25.128.0.0/14 -m mark --mark 0x117e6d1a -j SNAT --to-source 10.116.223.22

Removing debug pod ...
Temporary namespace openshift-debug-mlv9h was removed.
[p585600@cadsvaprlx067 ~]$
[p585600@cadsvaprlx067 ~]$
[p585600@cadsvaprlx067 ~]$
[p585600@cadsvaprlx067 ~]$
