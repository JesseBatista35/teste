oc exec $P -- sh -c 'unzip -l /opt/jboss/standalone/deployments/sipcs-login-unico-jboss-okd.war | grep -iE "commons-lang|jboss-deployment-structure"'
