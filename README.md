ls /opt/jboss-eap/standalone/deployments/ | grep boletoService
ls -la /log_jboss/sigsj_internet/
grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -2
