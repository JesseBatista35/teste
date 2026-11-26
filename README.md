-sh-4.2$
-sh-4.2$ ip -br addr
lo               UNKNOWN        127.0.0.1/8 ::1/128
eth0             UP             10.122.155.62/23 fe80::250:56ff:fe8e:345/64
eth1             UP             10.122.24.108/20 fe80::250:56ff:fe8e:d83a/64
docker0          DOWN           172.17.0.1/16
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ping -c 2 10.116.223.11
PING 10.116.223.11 (10.116.223.11) 56(84) bytes of data.
From 10.116.223.11 icmp_seq=1 Destination Port Unreachable
From 10.116.223.11 icmp_seq=2 Destination Port Unreachable

--- 10.116.223.11 ping statistics ---
2 packets transmitted, 0 received, +2 errors, 100% packet loss, time 1001ms

-sh-4.2$ ping -c 2 10.116.222.69
PING 10.116.222.69 (10.116.222.69) 56(84) bytes of data.
64 bytes from 10.116.222.69: icmp_seq=1 ttl=56 time=0.618 ms
64 bytes from 10.116.222.69: icmp_seq=2 ttl=56 time=0.565 ms

--- 10.116.222.69 ping statistics ---
2 packets transmitted, 2 received, 0% packet loss, time 1000ms
rtt min/avg/max/mdev = 0.565/0.591/0.618/0.035 ms
-sh-4.2$
-sh-4.2$ ip neigh show | grep -E '10\.116\.223\.11 |10\.116\.222\.69 |10\.116\.223\.22 '
-sh-4.2$ IFACE=$(ip -br addr | awk '/10\.116\.(2(0[8-9]|1[0-9]|2[0-3]))\./{print $1; exit}')
-sh-4.2$ echo $IFACE

-sh-4.2$ sudo arping -D -I $IFACE -c 3 10.116.223.11
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
Usage: arping [-fqbDUAV] [-c count] [-w timeout] [-I device] [-s source] destination
  -f : quit on first reply
  -q : be quiet
  -b : keep broadcasting, don't go unicast
  -D : duplicate address detection mode
  -U : Unsolicited ARP mode, update your neighbours
  -A : ARP answer mode, update your neighbours
  -V : print version and exit
  -c count : how many packets to send
  -w timeout : how long to wait for a reply
  -I device : which ethernet device to use
  -s source : source ip address
  destination : ask for what ip address
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo arping -I $IFACE -c 3 10.116.223.11
Usage: arping [-fqbDUAV] [-c count] [-w timeout] [-I device] [-s source] destination
  -f : quit on first reply
  -q : be quiet
  -b : keep broadcasting, don't go unicast
  -D : duplicate address detection mode
  -U : Unsolicited ARP mode, update your neighbours
  -A : ARP answer mode, update your neighbours
  -V : print version and exit
  -c count : how many packets to send
  -w timeout : how long to wait for a reply
  -I device : which ethernet device to use
  -s source : source ip address
  destination : ask for what ip address
-sh-4.2$ ls /usr/local/bin/oc-v4* 2>/dev/null
/usr/local/bin/oc-v4.13
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host ip -br addr | grep -E '10\.116\.223\.(11|22)'
Temporary namespace openshift-debug-ncvxk is created for debugging node...
Starting pod/pixnprd4-x44wk-worker-0-ns57r-debug ...
To use host binaries, run `chroot /host`
ens192           UP             10.116.222.69/19 10.116.223.22/19 10.116.223.18/19 10.116.223.20/19 10.116.223.9/19 10.116.223.13/19 10.116.223.11/19 fe80::f8b9:3792:4156:e04c/64

Removing debug pod ...
Temporary namespace openshift-debug-ncvxk was removed.
-sh-4.2$
