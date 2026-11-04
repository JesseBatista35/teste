
[sudo] senha para p585600:
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo journalctl -u NetworkManager --since "2026-10-01" | grep -iE 'conflict|duplicate|192.168.236'
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo nmcli -f NAME,DEVICE,STATE,FILENAME con show
NAME                         DEVICE  STATE    FILENAME
VMware customization ens192  ens192  ativado  /etc/NetworkManager/system-connections/VMware-customization-ens192.nmconnection
lo                           lo      ativado  /run/NetworkManager/system-connections/lo.nmconnection
VMware customization ens224  --      --       /etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo grep -rn 192.168 /etc/NetworkManager/system-connections/ /etc/sysconfig/network-scripts/ 2>/dev/null
/etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection:17:address1=192.168.236.173/19
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
