ls -la /opt/jboss-eap/standalone/deployments/ | grep -i sisaq
cat /opt/jboss-eap/standalone/deployments/*sisaq*/META-INF/MANIFEST.MF 2>/dev/null | grep -i version

