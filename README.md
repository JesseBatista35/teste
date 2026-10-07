
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ ip -br addr show ens224
ens224           UP             192.168.243.7/19 fe80::250:56ff:fe82:6dcf/64
[p585600@caddeapllx2781 ~]$ df -h /sisme_fgw
Sist. Arq.                                                            Tam. Usado Disp. Uso% Montado em
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW  5,0G  110M  4,9G   3% /sisme_fgw
[p585600@caddeapllx2781 ~]$ grep sisme_fgw /etc/fstab
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw nfs rw,sync,hard 0 0
[p585600@caddeapllx2781 ~]$
