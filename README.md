sudo systemctl daemon-reload
sudo systemctl list-units --all | grep -i sirpl


ls -la /etc/init.d/ | grep -i sirpl
chkconfig --list | grep -i sirpl
sudo chkconfig <nome_do_servico> off
sudo /etc/init.d/<nome_do_servico> stop
ps -ef | grep sirpl
sudo netstat -tulnp | grep 8601
sudo mv /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601 /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601.desmobilizado_20260616


tqs

sudo systemctl list-units --all | grep -i sirpl
ps -ef | grep -i node
