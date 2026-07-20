
[p585600@caddeapllx2193 monitoracao]$
[p585600@caddeapllx2193 monitoracao]$ mount | grep -i sigdb
[p585600@caddeapllx2193 monitoracao]$ mount | grep -i sigdb
[p585600@caddeapllx2193 monitoracao]$ df -h | grep -i integracoes
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC  5,0G  492M  4,6G  10% /integracoes/SIEXC
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC     16G   39M   16G   1% /integracoes/SIAPC
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF  7,0G  5,1G  1,9G  73% /integracoes/SIISF
[p585600@caddeapllx2193 monitoracao]$
[p585600@caddeapllx2193 monitoracao]$
[p585600@caddeapllx2193 monitoracao]$
[p585600@caddeapllx2193 monitoracao]$ timeout 5 bash -c "echo > /dev/tcp/10.116.88.160/2049" && echo "PORTA 2049 AGUARDANDO/OK" || echo "PORTA 2049 BLOQUEADA/TIMEOUT"
PORTA 2049 BLOQUEADA/TIMEOUT
[p585600@caddeapllx2193 monitoracao]$ timeout 5 bash -c "echo > /dev/tcp/10.116.88.160/111" && echo "PORTA 111 AGUARDANDO/OK" || echo "PORTA 111 BLOQUEADA/TIMEOUT"
PORTA 111 BLOQUEADA/TIMEOUT
[p585600@caddeapllx2193 monitoracao]$ nc -zv -w 5 10.116.88.160 2049
-sh: nc: comando não encontrado
[p585600@caddeapllx2193 monitoracao]$ nc -zv -w 5 10.116.88.160 111
-sh: nc: comando não encontrado
[p585600@caddeapllx2193 monitoracao]$ rpcinfo -p 10.116.88.160
^C
^C

^C
^C



^[[A^[[A^[[A
^C
^C
^[^[^[
exit
^C^C
showmount -e 10.116.88.160
^C

[p585600@caddeapllx2193 monitoracao]$
[p585600@caddeapllx2193 monitoracao]$ ^C
[p585600@caddeapllx2193 monitoracao]$ ^C
[p585600@caddeapllx2193 monitoracao]$ showmount -e 10.116.88.160


