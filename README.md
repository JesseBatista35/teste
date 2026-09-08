ps -ef | grep -i node
sudo netstat -tulnp | grep 8601
ls -la /etc/init.d/ | grep -i sirpl


chkconfig --list | grep -i sirpl
sudo chkconfig sirpl.des.https off
sudo /etc/init.d/sirpl.des.https stop
ps -ef | grep sirpl
sudo netstat -tulnp | grep 8601

sudo mv /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604 /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604.desmobilizado_20260616

