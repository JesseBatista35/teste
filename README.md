ls -ld /sipcs /sipcs/vcx /opt/app/vcx/datafiles
ls -la /sipcs/vcx | head
id vcxservice; id vcxproxyservice

cp -p /etc/fstab /etc/fstab.bkp_WO0000081726775
mkdir -p /sipcs/vcx
cat >> /etc/fstab <<'EOF'

###WO0000081726775#####
nprdnfs01.ad.caixa:/fs_sipcs_vcx /sipcs/vcx nfs rw,sync,hard,vers=3,_netdev 0 0
EOF
systemctl daemon-reload
mount -a
df -hT /sipcs/vcx


chown vcxservice:$(id -gn vcxservice) /sipcs/vcx
chmod 775 /sipcs/vcx
ls -ld /sipcs/vcx
