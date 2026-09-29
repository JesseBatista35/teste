timeout 15 showmount -e nfsctcnprd.ctc.caixa | grep -E 'CEPTIBR/SIGOT ' | grep -o 192.168.228.118
timeout 30 mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT; echo rc=$?
df -hT /SIGOT; mount | grep /SIGOT


ls -ld /SIGOT
touch /SIGOT/.teste_wo && rm /SIGOT/.teste_wo && echo root_ok
su - <usuario_app> -c 'touch /SIGOT/.teste_wo && rm /SIGOT/.teste_wo && echo app_ok'


nfsstat -m | grep -A1 /SIGOT          # veja vers=3 ou 4.x
cp -p /etc/fstab /etc/fstab.bkp.WO0000081741328
echo 'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT nfs defaults,_netdev,vers=<X> 0 0' >> /etc/fstab
umount /SIGOT && mount -a && df -hT /SIGOT



