[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]#
[root@caddeapllx2480 p585600]# systemctl stop sigdb;  sleep 2; ss -tlnp | grep 35000
[root@caddeapllx2480 p585600]# systemctl start sigdb; sleep 2; ss -tlnp | grep 35000
LISTEN 0      3            0.0.0.0:35000      0.0.0.0:*    users:(("AgtSigdb",pid=147220,fd=5))
[root@caddeapllx2480 p585600]# systemctl show sigdb -p MainPID
MainPID=147220
[root@caddeapllx2480 p585600]# cd /sigdb && ./Sigdb /c SIHEX /var/sistemas/SIHEX/ENTRADA/
/tmp/fileGDETd4
Tentando conectar...
Recebido Pacote de 35 Bytes GDBA            002-1006
Fechando Conexao
Erro -1006 no Cadastramento
[root@caddeapllx2480 sigdb]# cd /sigdb && ./Sigdb /c SIHEX /var/sistemas/SIHEX/ENTRADA/
/tmp/fileSIxD50
Tentando conectar...
Recebido Pacote de 35 Bytes GDBA            002-1006
Fechando Conexao
Erro -1006 no Cadastramento
[root@caddeapllx2480 sigdb]#
[root@caddeapllx2480 sigdb]#
[root@caddeapllx2480 sigdb]#
[root@caddeapllx2480 sigdb]#
