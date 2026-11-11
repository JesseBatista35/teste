
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ grep -iE "cxextrlx038|crjdeaprlx03" /etc/hosts
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
10.192.224.54  cxextrlx038
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ timeout 5 bash -c '</dev/tcp/10.192.224.54/7015' && echo "7015 ABERTA" || echo "7015 FECHADA/BLOQUEADA"
7015 ABERTA
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ curl -v --connect-timeout 5 telnet://10.192.224.54:7015
*   Trying 10.192.224.54:7015...
* Connected to 10.192.224.54 (10.192.224.54) port 7015 (#0)
^C
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
root     1751485       1  0 nov09 ?        00:00:01 /opt/ctmage/ctm/exe/p_ctmag
root     1751558       1  0 nov09 ?        00:00:03 /opt/ctmage/ctm/exe/p_ctmat
root     1751560 1751558  0 nov09 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmatw -ATW_NAME ATW000
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
