chkconfig --list | grep -i sirpl
sudo chkconfig sirpl.des.https off
sudo /etc/init.d/sirpl.des.https stop
ps -ef | grep sirpl
sudo netstat -tulnp | grep 8601



sudo mv /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601 /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601.desmobilizado_20260616
