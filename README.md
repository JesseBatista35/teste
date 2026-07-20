

#
# /etc/fstab
# Created by anaconda on Thu Oct 10 14:24:45 2024
#
# Accessible filesystems, by reference, are maintained under '/dev/disk/'.
# See man pages fstab(5), findfs(8), mount(8) and/or blkid(8) for more info.
#
# After editing this file, run 'systemctl daemon-reload' to update systemd
# units generated from this file.
#
/dev/mapper/VG_PRINCIPAL-LV_BARRA /                       xfs     defaults        0 0
UUID=81cabae9-536c-4b2b-9952-579d5c3f382b /boot                   xfs     defaults        0 0
/dev/mapper/VG_PRINCIPAL-LV_LOGS /logs                   xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_OPT /opt                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_TMP /tmp                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_VAR /var                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_SWAP none                    swap    defaults        0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /siexc nfs rw,sync,hard 0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /producao nfs rw,sync,hard 0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIEXC nfs rw,sync,hard 0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIAPC nfs rw,sync,hard 0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /integracoes/SIISF nfs rw,sync,hard 0 0
10.116.88.160:/export/sigdb/sicql /opt/sigdb nfs rw,sync,hard 0 0
[p585600@caddeapllx2193 ~]$ mount /opt/sigdb/
mount.nfs: failed to prepare mount: Operation not permitted

mount: (hint) your fstab has been modified, but systemd still uses
       the old version; use 'systemctl daemon-reload' to reload.
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$



1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host
       valid_lft forever preferred_lft forever
2: ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:82:d6:87 brd ff:ff:ff:ff:ff:ff
    altname enp11s0
    inet 10.116.199.181/19 brd 10.116.223.255 scope global noprefixroute ens192
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe82:d687/64 scope link
       valid_lft forever preferred_lft forever
3: ens224: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:82:2b:ca brd ff:ff:ff:ff:ff:ff
    altname enp19s0
    inet 192.168.233.69/19 brd 192.168.255.255 scope global noprefixroute ens224
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe82:2bca/64 scope link
       valid_lft forever preferred_lft forever
[p585600@caddeapllx2193 ~]$


nao é solicitao de regra de firel a equipe de amarzeanemto que deve liber a maquina para ficar lçiberar dentro desse moiutt que nao esta montaodo me ajuda com texto


