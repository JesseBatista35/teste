grep -n -iE "ERROR|Caused by|DeploymentException|ClassNotFoundException|NoClassDefFoundError" /opt/jboss-eap/standalone/log/server.log

ls -la /opt/jboss-eap/standalone/deployments/


cat /opt/jboss-eap/standalone/deployments/siamc-ear.ear.failed

/opt/jboss-eap/bin/jboss-cli.sh -c --command="/deployment=siamc-ear.ear:read-resource(attributes-only=true,include-runtime=true,recursive=true)"
