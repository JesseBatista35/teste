
[root@nfs-test /]# for i in $(seq 1 10); do getent hosts nfsctcnprd.ctc.caixa; sleep 30; done
192.168.224.111 nfsctcnprd.ctc.caixa
192.168.224.108 nfsctcnprd.ctc.caixa
^C
[root@nfs-test /]# for i in $(seq 1 10); do getent hosts nfsctcnprd.ctc.caixa; sleep 5; done
192.168.224.104 nfsctcnprd.ctc.caixa
192.168.224.101 nfsctcnprd.ctc.caixa
192.168.224.111 nfsctcnprd.ctc.caixa
192.168.224.103 nfsctcnprd.ctc.caixa
192.168.224.100 nfsctcnprd.ctc.caixa
192.168.224.108 nfsctcnprd.ctc.caixa
192.168.224.102 nfsctcnprd.ctc.caixa
192.168.224.111 nfsctcnprd.ctc.caixa
192.168.224.103 nfsctcnprd.ctc.caixa
192.168.224.109 nfsctcnprd.ctc.caixa
[root@nfs-test /]#

