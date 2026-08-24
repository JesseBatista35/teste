ps -ef | grep -i CSD2
cat /var/run/jboss-as/standaloneCSD2.pid 2>/dev/null
tail -80 /home/jboss-eap-6.4/CSD2/log/server.log

/etc/rc.d/init.d/jboss-eap6-CSD6.sh start
ps -ef | grep -i CSD6/etc/rc.d/init.d/jboss-eap6-CSD6.sh start
ps -ef | grep -i CSD6
