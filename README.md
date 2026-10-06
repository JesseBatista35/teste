
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$ ip -br addr
lo               UNKNOWN        127.0.0.1/8 ::1/128
ens192           UP             10.116.199.181/19 fe80::250:56ff:fe82:294c/64
ens224           UP             192.168.233.69/19 fe80::250:56ff:fe82:4562/64
[p585600@caddeapllx2193 ~]$ ip route get 192.168.224.102
192.168.224.102 dev ens224 src 192.168.233.69 uid 10585600
    cache
[p585600@caddeapllx2193 ~]$






