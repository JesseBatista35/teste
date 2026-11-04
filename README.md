
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ ip link show
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN mode DEFAULT group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
2: ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP mode DEFAULT group default qlen 1000
    link/ether 00:50:56:82:87:a5 brd ff:ff:ff:ff:ff:ff
    altname enp11s0
3: ens224: <NO-CARRIER,BROADCAST,MULTICAST,UP> mtu 9000 qdisc mq state DOWN mode DEFAULT group default qlen 1000
    link/ether 00:50:56:82:13:be brd ff:ff:ff:ff:ff:ff
    altname enp19s0
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ nmcli -f NAME,DEVICE.SATATE con show
Erro: campo inválido “DEVICE.SATATE”; campo inexistente.
[p585600@caddeapllx1580 ~]$ nmcli -f NAME,DEVICE,SATATE con show
Erro: campo inválido “SATATE”; allowed fields: NAME,UUID,TYPE,TIMESTAMP,TIMESTAMP-REAL,AUTOCONNECT,AUTOCONNECT-PRIORITY,READONLY,DBUS-PATH,ACTIVE,DEVICE,STATE,ACTIVE-PATH,SLAVE,FILENAME.
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ grep -rl 192.168.236.173 /etc/NetworkManager/system-connections/ 2>/dev/null
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo journalctl -u NetworkManager --since "2026-10-01" | grep -iE 'conflict|duplicate|192.168.236'

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo journalctl -u NetworkManager --since "2026-10-01" | grep -iE 'conflict|duplicate|192.168.236'
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
