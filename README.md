ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_internet
tail -5 /log_jboss/sigsj_internet/sigsj_internet.log
grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -2
