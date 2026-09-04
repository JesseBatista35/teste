tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log

grep -i -E "sismh|deployed|started in|ERROR" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log | tail -50
