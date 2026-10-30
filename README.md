
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ bash -c 'timeout 5 bash -c "</dev/tcp/10.116.99.99/7015" && echo ABERTA || echo FECHADA'
bash: connect: Conexão recusada
bash: linha 1: /dev/tcp/10.116.99.99/7015: Conexão recusada
FECHADA
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ bash -c 'timeout 5 bash -c "</dev/tcp/10.116.99.100/7015" && echo ABERTA || echo FECHADA'
bash: connect: Conexão recusada
bash: linha 1: /dev/tcp/10.116.99.100/7015: Conexão recusada
FECHADA
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
