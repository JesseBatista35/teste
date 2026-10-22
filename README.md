# backup
cp -p /sigdb/run /sigdb/run.bkp.20261022
cp -p /etc/systemd/system/sigdb.service /root/sigdb.service.bkp.20261022

# inclui o shebang na 1ª linha
sed -i '1i #!/bin/bash' /sigdb/run
head -2 /sigdb/run

# derruba o agente que está rodando manualmente (libera a porta 35000)
ps -ef | grep [A]gtSigdb
kill <pid>          # hoje deve ser o 143707
ss -tlnp | grep 35000   # tem que voltar vazio

# sobe pelo systemd
systemctl daemon-reload
systemctl reset-failed sigdb
systemctl start sigdb
systemctl status sigdb --no-pager
ss -tlnp | grep 35000




systemctl stop sigdb;  sleep 2; ss -tlnp | grep 35000   # deve sumir
systemctl start sigdb; sleep 2; ss -tlnp | grep 35000   # deve voltar
systemctl show sigdb -p MainPID                          # deve bater com o pid do AgtSigdb
