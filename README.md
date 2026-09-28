
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# ls -ld /sipcs /sipcs/vcx /opt/app/vcx/datafiles
ls -la /sipcs/vcx | head
id vcxservice; id vcxproxyservice
drwxr-xr-x 6 vcxservice vcxservice 54 abr 30 18:10 /opt/app/vcx/datafiles
drwxr-xr-x 3 root       root       17 abr 13 18:22 /sipcs
drwxr-xr-x 2 root       root        6 abr 13 18:22 /sipcs/vcx
total 0
drwxr-xr-x 2 root root  6 abr 13 18:22 .
drwxr-xr-x 3 root root 17 abr 13 18:22 ..
uid=979(vcxservice) gid=1002(vcxservice) grupos=1002(vcxservice)
uid=978(vcxproxyservice) gid=1002(vcxservice) grupos=1002(vcxservice)
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# cp -p /etc/fstab /etc/fstab.bkp_WO0000081726775
mkdir -p /sipcs/vcx
cat >> /etc/fstab <<'EOF'

###WO0000081726775#####
nprdnfs01.ad.caixa:/fs_sipcs_vcx /sipcs/vcx nfs rw,sync,hard,vers=3,_netdev 0 0
EOF
systemctl daemon-reload
mount -a
df -hT /sipcs/vcx
Sist. Arq.                       Tipo  Tam. Usado Disp. Uso% Montado em
nprdnfs01.ad.caixa:/fs_sipcs_vcx nfs    50G     0   50G   0% /sipcs/vcx
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# chown vcxservice:$(id -gn vcxservice) /sipcs/vcx
chmod 775 /sipcs/vcx
ls -ld /sipcs/vcx
drwxrwxr-x 2 vcxservice vcxservice 0 set 28 14:29 /sipcs/vcx
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
