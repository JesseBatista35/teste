grep -nE "ERROR|WFLYCTL0013|WFLYCTL0412|Caused by" /opt/jboss-eap/standalone/log/server.log | tail -60



9*96
cat /opt/jboss-eap/version.txt
sudo systemctl status jboss* --no-pager -l | head -30
sudo journalctl -u 'jboss*' --since "11:20" --no-pager | tail -40
sudo tail -80 /opt/jboss-eap/standalone/log/server.log
grep -nE "Xms|Xmx|Metaspace|#\{" /opt/jboss-eap/bin/standalone.conf
