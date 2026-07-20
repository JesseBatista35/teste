timeout 5 bash -c "echo > /dev/tcp/10.116.88.160/2049" && echo "PORTA 2049 AGUARDANDO/OK" || echo "PORTA 2049 BLOQUEADA/TIMEOUT"

timeout 5 bash -c "echo > /dev/tcp/10.116.88.160/111" && echo "PORTA 111 AGUARDANDO/OK" || echo "PORTA 111 BLOQUEADA/TIMEOUT"

nc -zv -w 5 10.116.88.160 2049
nc -zv -w 5 10.116.88.160 111

rpcinfo -p 10.116.88.160

showmount -e 10.116.88.160

traceroute 10.116.88.160

tracepath 10.116.88.160

