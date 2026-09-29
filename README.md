

[sudo] senha para p585600:
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# hostname; ip -4 -br addr
cbrdeapllx010.extra.caixa.gov.br
lo               UNKNOWN        127.0.0.1/8
eth0             UP             10.116.95.24/23
eth1             UP             10.122.21.219/20
eth2             UP             192.168.228.118/19
eth3             UP             10.184.19.40/14
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ip route get 192.168.224.108
192.168.224.108 dev eth2 src 192.168.228.118
    cache
[root@cbrdeapllx010 p585600]# sudo timeout 15 showmount -e nfsctcnprd.ctc.caixa | grep -i SIGOT
Sinto muito, usuário root não tem permissão para executar "/usr/bin/timeout 15 showmount -e nfsctcnprd.ctc.caixa" como root em cbrdeapllx010.extra.caixa.gov.br.
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# sudo mkdir -p /SIGOT && sudo mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT \
>   && sudo -u <usuario_app> touch /SIGOT/.teste_wo && sudo -u <usuario_app> rm /SIGOT/.teste_wo
Sinto muito, usuário root não tem permissão para executar "/usr/bin/mkdir -p /SIGOT" como root em cbrdeapllx010.extra.caixa.gov.br.
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#



