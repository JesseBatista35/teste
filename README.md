sudo grep -E "JBOSS_HOME|offset|EAP" /etc/init.d/jboss-standalone /etc/init.d/jboss-standalone-sso

sudo service jboss-standalone stop
ps -ef | grep java | grep -v grep

sudo kill -9 9770
sudo rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file

sudo service jboss-standalone start
sudo tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log

ls /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/deployments/ | grep -E "\.failed|\.deployed"




[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ sudo service jboss-standalone stop
Stopping Jboss:
Limpando pastas...
[p585600@scttqapllx0032 ~]$ ps -ef | grep java | grep -v grep
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ sudo kill -9 9770
kill 9770: Processo inexistente
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
