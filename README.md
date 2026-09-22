
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$ sudo su
[root@caddeapllx2193 p585600]# ls -la /SWIFT/
total 42
drwxr-xr-x   4 jboss jboss   51 set 22 09:37 .
dr-xr-xr-x. 22 root  root  4096 set 22 09:34 ..
drwxr-xr-x   2 jboss jboss    0 jul 16 10:41 lost+found
drwxrwx---   7 jboss jboss  131 jul 16 10:43 SWIFT
[root@caddeapllx2193 p585600]#
[root@caddeapllx2193 p585600]#
[root@caddeapllx2193 p585600]# ls -la /SWIFT/SWIFT/
total 46
drwxrwx--- 7 jboss jboss 131 jul 16 10:43 .
drwxr-xr-x 4 jboss jboss  51 set 22 09:37 ..
drwxrwx--- 3 jboss jboss  22 jul 16 10:43 BACKUP
drwxrwx--- 2 jboss jboss   0 jul 16 10:42 RECEBIDAS
drwxrwx--- 3 jboss jboss  22 jul 16 10:43 TRANSMITE
drwxrwx--- 2 jboss jboss   0 jul 16 10:43 TRANSMITIDOS
drwxrwx--- 2 jboss jboss   0 jul 16 10:43 TRASH
[root@caddeapllx2193 p585600]# ls -la /SWIFT/SWIFT/BACKUP/
total 38
drwxrwx--- 3 jboss jboss  22 jul 16 10:43 .
drwxrwx--- 7 jboss jboss 131 jul 16 10:43 ..
drwxrwx--- 2 jboss jboss   0 jul 16 10:43 Temp
[root@caddeapllx2193 p585600]# ls -la /SWIFT/SWIFT/TRANSMITE/
total 38
drwxrwx--- 3 jboss jboss  22 jul 16 10:43 .
drwxrwx--- 7 jboss jboss 131 jul 16 10:43 ..
drwxrwx--- 2 jboss jboss   0 jul 16 10:43 temp
[root@caddeapllx2193 p585600]# stat -c "%U:%G %a %n" /SWIFT/SWIFT /SWIFT/SWIFT/*
jboss:jboss 770 /SWIFT/SWIFT
jboss:jboss 770 /SWIFT/SWIFT/BACKUP
jboss:jboss 770 /SWIFT/SWIFT/RECEBIDAS
jboss:jboss 770 /SWIFT/SWIFT/TRANSMITE
jboss:jboss 770 /SWIFT/SWIFT/TRANSMITIDOS
jboss:jboss 770 /SWIFT/SWIFT/TRASH
[root@caddeapllx2193 p585600]# echo "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0" | sudo tee -a /etc/fstab
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0
[root@caddeapllx2193 p585600]#
[root@caddeapllx2193 p585600]#
[root@caddeapllx2193 p585600]#
[root@caddeapllx2193 p585600]# cat /etc/fstab | grep SWIFT
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0
[root@caddeapllx2193 p585600]#
