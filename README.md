
[p585600@caddeapllx2821 ~]$
Broadcast message from root@caddeapllx2821 (Tue 2026-10-06 10:06:42 -03):

The system will power off now!

Connection to 10.116.202.23 closed by remote host.
Connection to 10.116.202.23 closed.
[p585600@cadsvitrlx100 ~]$ getent hosts hypernprd12.ad.caixa
^C
[p585600@cadsvitrlx100 ~]$ ssh 10.116.202.23
p585600@10.116.202.23's password:
Permission denied, please try again.
p585600@10.116.202.23's password:
Last failed login: Tue Oct  6 10:30:08 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
[p585600@caddeapllx2821 ~]$
[p585600@caddeapllx2821 ~]$
[p585600@caddeapllx2821 ~]$ getent hosts hypernprd12.ad.caixa
10.188.0.14     hypernprd12.ad.caixa
[p585600@caddeapllx2821 ~]$
[p585600@caddeapllx2821 ~]$ ping -c3 hypernprd12.ad.caixa
PING hypernprd12.ad.caixa (10.188.0.17) 56(84) bytes de dados.
De caddeapllx2821.agil.nprd.caixa.gov.br (10.188.6.225) icmp_seq=1 Host de destino inalcançável
De caddeapllx2821.agil.nprd.caixa.gov.br (10.188.6.225) icmp_seq=2 Host de destino inalcançável
De caddeapllx2821.agil.nprd.caixa.gov.br (10.188.6.225) icmp_seq=3 Host de destino inalcançável

--- hypernprd12.ad.caixa estatísticas de ping ---
3 pacotes transmitidos, 0 recebidos, +3 erros, 100% packet loss, time 2082ms
pipe 3
[p585600@caddeapllx2821 ~]$ nc -zv hypernprd12.ad.caixa 2049
-sh: nc: comando não encontrado
[p585600@caddeapllx2821 ~]$ nc -zv hypernprd12.ad.caixa 111
-sh: nc: comando não encontrado
[p585600@caddeapllx2821 ~]$ howmount -e hypernprd12.ad.caixa
-sh: howmount: comando não encontrado
[p585600@caddeapllx2821 ~]$ showmount -e hypernprd12.ad.caixa
clnt_create: RPC: Unable to receive
[p585600@caddeapllx2821 ~]$ ip route get 10.188.0.14
10.188.0.14 dev ens224 src 10.188.6.225 uid 10585600
    cache
[p585600@caddeapllx2821 ~]$ ip -br addr
lo               UNKNOWN        127.0.0.1/8 ::1/128
ens192           UP             10.116.202.23/19 fe80::250:56ff:fe82:3bcf/64
ens224           UP             10.188.6.225/19 fe80::250:56ff:fe82:a51d/64
[p585600@caddeapllx2821 ~]$
