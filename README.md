ls -la /home/siaoi/jboss-eap-6.4/ | grep -i CSD

tail -100 /home/siaoi/jboss-eap-6.4/CSD2/log/server.log
tail -100 /home/siaoi/jboss-eap-6.4/CSD6/log/server.log

/bin/sh ./jboss-eap6-CSD2.sh start
/bin/sh ./jboss-eap6-CSD6.sh start

