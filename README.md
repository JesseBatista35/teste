cd /opt/jboss-eap/standalone/deployments/
touch sigsj_internet-ear.ear.dodeploy
chown jboss:jboss sigsj_internet-ear.ear.dodeploy


ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_internet
ls -la /log_jboss/sigsj_internet/
grep -E 'log4j:ERROR|WFLYSRV0010.*sigsj_internet' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -3
