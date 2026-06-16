Verificar  o ambiente do simpg-monolito em DES pois não está realizando deploy na VM: caddeapllx1945.agil.nprd.caixa.gov.br

A pipeline/release é a seguinte: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=486099

O único erro que identifiquei é o abaixo quando ele tenta mapear o JDBC, mas, os arquivos e arquivos de configuração estão no local esperado.

2026-06-16 11:47:09,927 ERROR [org.jboss.as.controller.management-operation] (pool-4-thread-1) WFLYCTL0013: Falha na operação ("list-resource-loader-paths") - endereço ([("core-service" => "module-loading")]) - falha na descrição: "org.postgresql"



[root@caddeapllx1979 p585600]# mount | grep simpg-tqs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG on /simpg-tqs type nfs4 (rw,relatime,sync,vers=4.0,rsize=1048576,wsize=1048576,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=192.168.242.150,local_lock=none,addr=192.168.224.105)
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# ping -c 5 192.168.224.1
PING 192.168.224.1 (192.168.224.1) 56(84) bytes de dados.
64 bytes de 192.168.224.1: icmp_seq=1 ttl=64 tempo=0.480 ms
64 bytes de 192.168.224.1: icmp_seq=2 ttl=64 tempo=0.177 ms
64 bytes de 192.168.224.1: icmp_seq=3 ttl=64 tempo=0.174 ms
64 bytes de 192.168.224.1: icmp_seq=4 ttl=64 tempo=0.164 ms
64 bytes de 192.168.224.1: icmp_seq=5 ttl=64 tempo=0.184 ms

--- 192.168.224.1 estatísticas de ping ---
5 pacotes transmitidos, 5 recebidos, 0% packet loss, time 4101ms
rtt min/avg/max/mdev = 0.164/0.235/0.480/0.122 ms
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# mount -a
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# df -h | grep simpg-tqs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG  5,0G  298M  4,8G   6% /simpg-tqs
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]# ls -la /simpg-tqs/
total 8
drwxrwxrwx+  3 nobody nobody     26 mai 11 09:20 .
dr-xr-xr-x. 20 root   root     4096 jun 15 23:48 ..
drwxrwxrwx+  2 nobody supadmin  146 mai  6 11:49 arquivos
[root@caddeapllx1979 p585600]# touch /simpg-tqs/teste_$(date +%s).txt
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#
[root@caddeapllx1979 p585600]#


