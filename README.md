
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
[p585600@cadsvaprlx067 ~]$ ^C
[p585600@cadsvaprlx067 ~]$


PARAMOS AQUI O QUE VAMOS FAZER AGORA
