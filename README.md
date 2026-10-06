
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ ip -br addr
lo               UNKNOWN        127.0.0.1/8 ::1/128
ens192           UP             10.116.201.252/19 fe80::250:56ff:fe82:9d68/64
ens224           UP             192.168.221.15/19 fe80::250:56ff:fe82:9b75/64
[p585600@caddeapllx2781 ~]$ ip route get 192.168.224.102
192.168.224.102 via 10.116.192.1 dev ens192 src 10.116.201.252 uid 10585600
    cache
[p585600@caddeapllx2781 ~]$

