
    │ ⮞ For more info, ctrl+click on help or visit our website.            │
    └──────────────────────────────────────────────────────────────────────┘

Last login: Thu Nov  5 17:13:40 2026 from 10.211.12.40
[p585600@cadsvitrlx100 ~]$ ssh 10.116.197.61
p585600@10.116.197.61's password:
Last login: Wed Nov  4 09:21:45 2026 from 10.122.150.31
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo cp -p /etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection \
  /root/VMware-customization-ens224.nmconnection.bkp_$(date +%Y%m%d)
[sudo] senha para p585600:
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo nmcli con show "VMware customization ens224" | grep -E 'ipv4\.(method|addresses|gateway|routes)'
ipv4.method:                            manual
ipv4.addresses:                         192.168.236.173/19
ipv4.gateway:                           --
ipv4.routes:                            --
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo nmcli con mod "VMware customization ens224" ipv4.method manual ipv4.addresses 10.188.8.190/16
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo grep -n -E 'address|gateway|route' /etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection
9:mac-address=00:50:56:82:13:BE
12:address1=10.188.8.190/16
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$ sudo grep -rn 192.168.236.173 /etc/NetworkManager/system-connections
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$
[p585600@caddeapllx1580 ~]$





<img width="1011" height="762" alt="image" src="https://github.com/user-attachments/assets/7d32dfe9-8a93-4739-a782-52b35efab4eb" />


ja troquei no infrafacil

