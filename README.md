ps -ef | grep -i vcx | grep -v grep
ls -ld /opt/VCX-Linux


mkdir -p /mnt/teste_nfs
mount -t nfs nprdnfs01.ad.caixa:/fs_sipcs_vcx /mnt/teste_nfs
df -hT /mnt/teste_nfs
touch /mnt/teste_nfs/teste && ls -l /mnt/teste_nfs && rm -f /mnt/teste_nfs/teste
umount /mnt/teste_nfs && rmdir /mnt/teste_nfs

