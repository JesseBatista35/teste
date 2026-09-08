ps -ef | grep -i node
ps -ef | grep -i pm2
sudo netstat -tulnp | grep 8604
cat /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604/httpd/httpd.conf | grep -i proxy
crontab -l
crontab -l -u spapatr1 2>/dev/null
ls -la /etc/init.d/ | grep -i sirpl
systemctl list-units --all | grep -i sirpl
