cat /etc/fstab
ls -l /etc/fstab*

ps -eo user:30,uid,cmd | grep -i vcx | grep -v grep
id vcxserver 2>/dev/null; id vcxproxy 2>/dev/null

mkdir -p /mnt/teste_nfs
mount -t nfs -o vers=3 nprdnfs01.ad.caixa:/fs_sipcs_vcx /mnt/teste_nfs
touch /mnt/teste_nfs/teste && ls -ln /mnt/teste_nfs
rm -f /mnt/teste_nfs/teste
umount /mnt/teste_nfs && rmdir /mnt/teste_nfs
