ls -la /opt/etc/init.d/jboss-master
sudo -u jboss /opt/etc/init.d/jboss-master status

# tenta gracioso primeiro
sudo -u jboss kill -15 99496
sleep 15
ps -p 99496 && echo "ainda vivo" || echo "morreu"
