# Context-root efetivo registrado no Undertow
oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/deployment=sipcs-login-unico-jboss-okd.war/subsystem=undertow:read-attribute(name=context-root)"

# Teste de dentro do pod
oc exec $P -- curl -s -o /dev/null -w "raiz-app: %{http_code}\n" http://localhost:8080/sipcs-login-unico-jboss-okd/
oc exec $P -- curl -s -o /dev/null -w "login2:   %{http_code}\n" http://localhost:8080/login2/

# O WAR tem jboss-web.xml?
oc exec $P -- sh -c 'unzip -l /opt/jboss/standalone/deployments/sipcs-login-unico-jboss-okd.war | grep -iE "jboss-web.xml|web.xml"'
