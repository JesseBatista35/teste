ls -l /opt/SIALI/jboss-eap-6.4/standalone/log/

cp /opt/SIALI/jboss-eap-6.4/standalone/log/server.log /tmp/SIALI_server.log.2026-09-28

sudo cp /opt/SIALI/jboss-eap-6.4/standalone/log/server.log /tmp/SIALI_server.log.2026-09-28
sudo chown p585600 /tmp/SIALI_server.log.2026-09-28

gzip /tmp/SIALI_server.log.2026-09-28

scp p585600@10.116.18.153:/tmp/SIALI_server.log.2026-09-28.gz .
