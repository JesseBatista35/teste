ps -ef | grep -i CSD2
cat /var/run/jboss-as/standaloneCSD2.pid 2>/dev/null
tail -80 /var/log/jboss-as/consoleCSD2.log
tail -80 /home/jboss-eap-6.4/CSD2/log/server.log 2>/dev/null


sleep 30
grep "JBAS015874" /var/log/jboss-as/consoleCSD2.log
