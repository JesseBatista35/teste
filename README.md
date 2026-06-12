[root@caddeapllx1979 p585600]# mount -a
mount.nfs: access denied by server while mounting nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# ping -c 5 192.168.224.1
PING 192.168.224.1 (192.168.224.1) 56(84) bytes de dados.
64 bytes de 192.168.224.1: icmp_seq=1 ttl=64 tempo=0.199 ms
64 bytes de 192.168.224.1: icmp_seq=2 ttl=64 tempo=0.236 ms
64 bytes de 192.168.224.1: icmp_seq=3 ttl=64 tempo=0.276 ms
64 bytes de 192.168.224.1: icmp_seq=4 ttl=64 tempo=0.230 ms
64 bytes de 192.168.224.1: icmp_seq=5 ttl=64 tempo=0.213 ms

--- 192.168.224.1 estatísticas de ping ---
5 pacotes transmitidos, 5 recebidos, 0% packet loss, time 4074ms
rtt min/avg/max/mdev = 0.199/0.230/0.276/0.026 ms
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# cat /etc/fstab | grep simpg
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG /simpg-tqs nfs rw,sync,hard 0 0
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
