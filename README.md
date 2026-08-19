cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file


echo 125771 | sudo -u jboss tee /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file

ps -ef | grep java

