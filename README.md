ls -la /opt/jboss-eap/standalone/deployments/ | grep -i sirot
\rm -f /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.undeployed

ls -la /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
grep -E 'WFLYSRV0010|WFLYUT0021|WFLYSRV0026|ERROR' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -20
