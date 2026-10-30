ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ getent hosts crjdeaprlx038
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ getent hosts crjdeaprlx039
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.200.250  caddeapllx2501.agil.nprd.caixa.gov.br caddeapllx2501
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ bash -c 'timeout 5 bash -c "</dev/tcp/crjdeaprlx038/7015" && echo ABERTA || echo FECHADA'
bash: linha 1: crjdeaprlx038: Nome ou serviço desconhecido
bash: linha 1: /dev/tcp/crjdeaprlx038/7015: Argumento inválido
FECHADA
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ bash -c 'timeout 5 bash -c "</dev/tcp/crjdeaprlx039/7015" && echo ABERTA || echo FECHADA'
bash: linha 1: crjdeaprlx039: Nome ou serviço desconhecido
bash: linha 1: /dev/tcp/crjdeaprlx039/7015: Argumento inválido
FECHADA
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
