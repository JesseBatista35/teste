-sh-4.1$
-sh-4.1$ ping -c 4 10.192.228.146
PING 10.192.228.146 (10.192.228.146) 56(84) bytes of data.
64 bytes from 10.192.228.146: icmp_seq=1 ttl=59 time=0.602 ms
64 bytes from 10.192.228.146: icmp_seq=2 ttl=59 time=0.607 ms
64 bytes from 10.192.228.146: icmp_seq=3 ttl=59 time=0.774 ms
64 bytes from 10.192.228.146: icmp_seq=4 ttl=59 time=0.682 ms

--- 10.192.228.146 ping statistics ---
4 packets transmitted, 4 received, 0% packet loss, time 3003ms
rtt min/avg/max/mdev = 0.602/0.666/0.774/0.072 ms
-sh-4.1$ telnet 10.192.228.146 8080
Trying 10.192.228.146...
telnet: connect to address 10.192.228.146: Connection refused
-sh-4.1$ nc -zv 10.192.228.146 8080
nc: connect to 10.192.228.146 port 8080 (tcp) failed: Connection refused
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ tail -f /opt/sipen/logs/*log
tail: cannot open `/opt/sipen/logs/*log' for reading: No such file or directory
tail: no files remaining
-sh-4.1$ tail -f /var/log/sipen/*.log
tail: cannot open `/var/log/sipen/*.log' for reading: No such file or directory
tail: no files remaining
-sh-4.1$
