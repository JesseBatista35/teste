tail -100 /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log

sudo -u jboss kill -9 125909

ps -ef | grep java

tail -50 /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log

cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file

sudo -u jboss bash -c "echo 125771 > /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file"

echo 125771 | sudo -u jboss tee /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
