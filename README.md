
[p585600@caddeapllx2577 ~]$ nslookup caddeapllx2577.agil.nprd.caixa.gov.br
Server:         10.116.193.77
Address:        10.116.193.77#53

Name:   caddeapllx2577.agil.nprd.caixa.gov.br
Address: 10.116.201.44

[p585600@caddeapllx2577 ~]$ ip addr show
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host
       valid_lft forever preferred_lft forever
2: ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:82:c5:4a brd ff:ff:ff:ff:ff:ff
    altname enp11s0
    inet 10.116.201.44/19 brd 10.116.223.255 scope global noprefixroute ens192
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe82:c54a/64 scope link
       valid_lft forever preferred_lft forever
3: ens224: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:82:2e:44 brd ff:ff:ff:ff:ff:ff
    altname enp19s0
    inet 192.168.242.114/19 brd 192.168.255.255 scope global noprefixroute ens224
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe82:2e44/64 scope link noprefixroute
       valid_lft forever preferred_lft forever
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ hostname -I
10.116.201.44 192.168.242.114
[p585600@caddeapllx2577 ~]$
