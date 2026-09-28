
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# cat /etc/fstab
ls -l /etc/fstab*

#
# /etc/fstab
# Created by anaconda on Mon Feb  9 16:50:47 2026
#
# Accessible filesystems, by reference, are maintained under '/dev/disk/'.
# See man pages fstab(5), findfs(8), mount(8) and/or blkid(8) for more info.
#
# After editing this file, run 'systemctl daemon-reload' to update systemd
# units generated from this file.
#
/dev/mapper/VG_PRINCIPAL-LV_BARRA /                       xfs     defaults        0 0
UUID=2132c67b-ddef-4877-94c9-731c125288fd /boot                   xfs     defaults        0 0
/dev/mapper/VG_PRINCIPAL-LV_LOGS /logs                   xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_OPT /opt                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_TMP /tmp                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_VAR /var                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_SWAP none                    swap    defaults        0 0
#nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIPCS /opt/app/vcx/datafiles nfs rw,sync,hard 0 0

###WO0000081726782#####
#hypernprd12.ad.caixa:/fs_sipcs /sipcs/vcx nfs rw,sync,hard 0 0
-rw-r--r--  1 root root 1130 set 25 19:55 /etc/fstab
-rw-r--r--  1 root root 1028 abr 13 18:22 /etc/fstab.20260708
-rw-r--r--. 1 root root  935 fev  9  2026 /etc/fstab.8072.2026-04-13@18:22:27~
-rw-r--r--  1 root root 1040 set  8 10:50 /etc/fstab.copy
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# ps -eo user:30,uid,cmd | grep -i vcx | grep -v grep
vcxproxyservice                  978 /opt/node/bin/node /opt/app/vcx/main/proxyServer.bundle.js
vcxservice                       979 /opt/node/bin/node /opt/app/vcx/main/server.bundle.js
[root@caddeapllx2462 p585600]# id vcxserver 2>/dev/null; id vcxproxy 2>/dev/null
[root@caddeapllx2462 p585600]# mkdir -p /mnt/teste_nfs
mount -t nfs -o vers=3 nprdnfs01.ad.caixa:/fs_sipcs_vcx /mnt/teste_nfs
touch /mnt/teste_nfs/teste && ls -ln /mnt/teste_nfs
rm -f /mnt/teste_nfs/teste
umount /mnt/teste_nfs && rmdir /mnt/teste_nfs
Created symlink /run/systemd/system/remote-fs.target.wants/rpc-statd.service → /usr/lib/systemd/system/rpc-statd.service.
total 24
-rw-r--r-- 1 0 0 0 set 28 14:29 teste
[root@caddeapllx2462 p585600]#
