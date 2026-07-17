[root@nfs-test /]# ping -c 4 nfsctcnprd.ctc.caixa
bash: ping: command not found
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]# timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/2049' && echo "PORTA ABERTA" || echo "PORTA FECHADA OU SEM RESPOSTA"
PORTA FECHADA OU SEM RESPOSTA
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]# bash -c 'exec 3<>/dev/tcp/nfsctcnprd.ctc.caixa/2049 && echo CONECTOU || echo FALHOU'
^C
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]# timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/111' && echo "PORTA 111 ABERTA" || echo "PORTA 111 FECHADA OU SEM RESPOSTA"
PORTA 111 FECHADA OU SEM RESPOSTA
[root@nfs-test /]# timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/111' && echo "PORTA 111 ABERTA" || echo "PORTA 111 FECHADA OU SEM RESPOSTA"
PORTA 111 FECHADA OU SEM RESPOSTA
[root@nfs-test /]#
