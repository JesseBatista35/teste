
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/deployment=sipcs-login-unico-jboss-okd.war/subsystem=undertow:read-attribute(name=context-root)"
{
    "outcome" => "success",
    "result" => "/login2"
}
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- curl -s -o /dev/null -w "raiz-app: %{http_code}\n" http://localhost:8080/sipcs-login-unico-jboss-okd/
raiz-app: 404
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- curl -s -o /dev/null -w "login2:   %{http_code}\n" http://localhost:8080/login2/
login2:   500
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- sh -c 'unzip -l /opt/jboss/standalone/deployments/sipcs-login-unico-jboss-okd.war | grep -iE "jboss-web.xml|web.xml"'
      163  10-02-2026 14:36   WEB-INF/jboss-web.xml
     3422  10-02-2026 14:36   WEB-INF/web.xml
-sh-4.2$
