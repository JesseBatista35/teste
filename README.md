
,[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# ps -ef | grep -i vcx | grep -v grep
vcxprox+     967       1  0 set02 ?        00:00:11 /opt/node/bin/node /opt/app/vcx/main/proxyServer.bundle.js
vcxserv+     968       1  0 set02 ?        00:00:23 /opt/node/bin/node /opt/app/vcx/main/server.bundle.js
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# mkdir -p /mnt/teste_nfs
mount -t nfs nprdnfs01.ad.caixa:/fs_sipcs_vcx /mnt/teste_nfs
df -hT /mnt/teste_nfs
touch /mnt/teste_nfs/teste && ls -l /mnt/teste_nfs && rm -f /mnt/teste_nfs/teste
umount /mnt/teste_nfs && rmdir /mnt/teste_nfs
mount: (hint) your fstab has been modified, but systemd still uses
       the old version; use 'systemctl daemon-reload' to reload.
Sist. Arq.                       Tipo  Tam. Usado Disp. Uso% Montado em
nprdnfs01.ad.caixa:/fs_sipcs_vcx nfs4   50G     0   50G   0% /mnt/teste_nfs
total 24
-rw-r--r-- 1 nobody nobody 0 set 28 12:34 teste
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
