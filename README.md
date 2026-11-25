sudo systemctl status jboss-eap-standalone --no-pager -l
sudo journalctl -u jboss-eap-standalone --no-pager -n 80
ls -lt /opt/jboss-eap/standalone/log/ | head
tail -150 /opt/jboss-eap/standalone/log/server.log
grep -n -E "ERROR|FATAL|WFLYCTL0013|WFLYSRV0026|WFLYSRV0025|BindException|Address already|Could not|Caused by" /opt/jboss-eap/standalone/log/server.log | tail -40
ls -l /opt/jboss-eap/standalone/configuration/*.xml
