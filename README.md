sudo kill -9 21999
sudo systemctl start jboss-eap-standalone
sleep 15 && sudo systemctl status jboss-eap-standalone
