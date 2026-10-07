
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$ ping -c2 -W1 192.168.243.10
PING 192.168.243.10 (192.168.243.10) 56(84) bytes de dados.

--- 192.168.243.10 estatísticas de ping ---
2 pacotes transmitidos, 0 recebidos, 100% packet loss, time 1054ms

[p585600@caddeapllx2193 ~]$ ip neigh show 192.168.243.10
192.168.243.10 dev ens224 FAILED
[p585600@caddeapllx2193 ~]$
