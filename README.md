
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.200.237' (ED25519) to the list of known hosts.
p585600@10.116.200.237's password:
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$ head -1 /sigdb/run | cat -A        # shebang presente? termina em $ ou ^M$?
#  AgtSigdb -m<nome-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$ ls -lZ /sigdb/run /sigdb/AgtSigdb  # permissão x e contexto SELinux
-rwxr-xr-x 1 root root ? 2380140 fev 24  2022 /sigdb/AgtSigdb
-rwxr-xr-x 1 root root ?     196 out  9 15:58 /sigdb/run
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$ cat /sigdb/run
#  AgtSigdb -m<nome-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>
LD_LIBRARY_PATH=/usr/lib
export LD_LIBRARY_PATH

umask 000
nohup ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237 &[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$ cat /etc/systemd/system/sigdb.service
[Unit]
Description=Agente SIGDB
After=network.target

[Service]
Type=forking
WorkingDirectory=/sigdb
ExecStart=/sigdb/run
Restart=on-failure

[Install]
WantedBy=multi-user.target
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$
[p585600@caddeapllx2480 ~]$ getenforce; ausearch -m avc -ts today | grep -i sigdb
Disabled
Error opening config file (Permissão negada)
NOTE - using built-in logs: /var/log/audit/audit.log
Error opening /var/log/audit/audit.log (Permissão negada)
[p585600@caddeapllx2480 ~]$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx2480 p585600]# getenforce; ausearch -m avc -ts today | grep -i sigdb
Disabled
<no matches>
[root@caddeapllx2480 p585600]#
