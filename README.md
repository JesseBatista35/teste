deapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# cp -p /sigdb/run /sigdb/run.bkp.20261022
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# cp -p /etc/systemd/system/sigdb.service /root/sigdb.service.bkp.20261022
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# sed -i '1i #!/bin/bash' /sigdb/run
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# head -2 /sigdb/run
#!/bin/bash
#  AgtSigdb -m<nome-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# ps -ef | grep [A]gtSigdb
root      143707       1  0 out21 ?        00:00:06 ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# kill 143707
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# ss -tlnp | grep 35000
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl daemon-reload
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl reset-failed sigdb
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl start sigdb
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl status sigdb --no-pager
● sigdb.service - Agente SIGDB
     Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
     Active: active (running) since Thu 2026-10-22 12:41:44 -03; 6s ago
    Process: 147204 ExecStart=/sigdb/run (code=exited, status=0/SUCCESS)
   Main PID: 147205 (AgtSigdb)
      Tasks: 3 (limit: 23083)
     Memory: 2.4M
        CPU: 5ms
     CGroup: /system.slice/sigdb.service
             └─147205 ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237

out 22 12:41:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Starting Agente SIGDB...
out 22 12:41:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Started Agente SIGDB.
[root@caddeapllx2480 p585600]# ss -tlnp | grep 35000
LISTEN 0      3            0.0.0.0:35000      0.0.0.0:*    users:(("AgtSigdb",pid=147205,fd=6))
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl stop sigdb;  sleep 2; ss -tlnp | grep 35000
[root@caddeapllx2480 p585600]# systemctl start sigdb; sleep 2; ss -tlnp | grep 35000
LISTEN 0      3            0.0.0.0:35000      0.0.0.0:*    users:(("AgtSigdb",pid=147220,fd=5))
[root@caddeapllx2480 p585600]# systemctl show sigdb -p MainPID
MainPID=147220
[root@caddeapllx2480 p585600]#
