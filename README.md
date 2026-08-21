
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ cat /opt/batch/config/sigdb/des/run
#  AgtSigdb -m<nome-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>
#  onde:
#    nome-desse-host    -
#    ip-do-destino      -
#    ip-desse-servidor  -
LD_LIBRARY_PATH=/usr/lib
export LD_LIBRARY_PATH

umask 000
nohup ./AgtSigdb -mtr7261lx560 -h10.192.224.66 -i10.116.201.27 &[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ls -la /sigdb/
total 1144
drwxr-xr-x   3 root root      36 jun 10 13:50 .
dr-xr-xr-x. 22 root root    4096 ago 20 16:54 ..
drwxr-xr-x   9 root root     290 ago 20 16:55 sigdb
-rwxr-xr-x   1 root root 1163641 jun 10 13:50 sigdb.zip
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ cat /sigdb/run 2>/dev/null | head -30
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ sudo -u ctmagelx touch /sigdb/sigdb/TRANSMITE/teste_permissao 2>&1

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Sinto muito, usuário p585600 não tem permissão para executar "/bin/touch /sigdb/sigdb/TRANSMITE/teste_permissao" como ctmagelx em caddeapllx2560.agil.nprd.caixa.gov.br.
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# ctmagelx touch /sigdb/sigdb/TRANSMITE/teste_permissao 2>&1
bash: ctmagelx: comando não encontrado
[root@caddeapllx2560 opt]#
