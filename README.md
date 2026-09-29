
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# timeout 15 showmount -e nfsctcnprd.ctc.caixa | grep -E 'CEPTIBR/SIGOT ' | grep -o 192.168.228.118
192.168.228.118
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# timeout 30 mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT; echo rc=$?
rc=0
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# df -hT /SIGOT; mount | grep /SIGOT
Sist. Arq.                                                     Tipo  Tam. Usado Disp. Uso% Montado em
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT nfs4   10G  907M  9,2G   9% /SIGOT
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT on /SIGOT type nfs4 (rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.228.118,local_lock=none,addr=192.168.224.103)
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ls -ld /SIGOT
drwxrwxrwx 21 nobody nobody 687 Set  4 15:15 /SIGOT
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# touch /SIGOT/.teste_wo && rm /SIGOT/.teste_wo && echo root_ok
rm: remover arquivo comum vazio “/SIGOT/.teste_wo”?
root_ok
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# su - <usuario_app> -c 'touch /SIGOT/.teste_wo && rm /SIGOT/.teste_wo && echo app_ok'
bash: usuario_app: Arquivo ou diretório não encontrado
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# nfsstat -m | grep -A1 /SIGOT          # veja vers=3 ou 4.x
/SIGOT from nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT
 Flags: rw,relatime,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.228.118,local_lock=none,addr=192.168.224.103
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# cp -p /etc/fstab /etc/fstab.bkp.WO0000081741328
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# echo 'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT nfs defaults,_netdev,vers=<X> 0 0' >> /etc/fstab
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# umount /SIGOT && mount -a && df -hT /SIGOT
mount.nfs: access denied by server while mounting nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SILDC_RTA/
mount.nfs: parsing error on 'vers=' option
[root@cbrdeapllx010 p585600]#

