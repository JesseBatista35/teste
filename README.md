     ls -la /opt/jboss-eap/standalone/deployments/
     cat /opt/jboss-eap/standalone/deployments/*.failed


     grep -n "Xmx" /opt/jboss-eap/bin/standalone.conf
sudo journalctl -u jboss-eap-standalone --since "14:00" --no-pager | tail -20
