tail -100 /opt/jboss-eap/standalone/log/server.log


systemctl list-units --type=service | grep -i jboss
ps -ef | grep java


apachectl configtest


httpd -t


ss -tlnp | grep 8443

