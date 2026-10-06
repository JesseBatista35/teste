
[p585600@caddeapllx2821 ~]$ ip -br addr
lo               UNKNOWN        127.0.0.1/8 ::1/128
ens192           UP             10.116.202.23/19 fe80::250:56ff:fe82:3bcf/64
ens224           UP             10.188.6.225/19 fe80::250:56ff:fe82:a51d/64
[p585600@caddeapllx2821 ~]$ ip neigh show dev ens224          # esperado: 10.188.0.14 FAILED/INCOMPLETE
10.188.0.14 FAILED
10.188.0.18 FAILED
10.188.0.16 FAILED
10.188.0.13 FAILED
10.188.0.11 FAILED
10.188.0.17 FAILED
[p585600@caddeapllx2821 ~]$
[p585600@caddeapllx2821 ~]$
[p585600@caddeapllx2821 ~]$ arping -c3 -I ens224 10.188.0.14  # esperado: 0 respostas
ARPING 10.188.0.14 de 10.188.6.225 ens224
Enviadas 3 sondas (3 broadcast(s))
Recebida(s) 0 resposta(s)
[p585600@caddeapllx2821 ~]$
