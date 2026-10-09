
-sh-4.2$ P=sipcs-login-unico-jboss-okd-des-15-dqm8d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- sh -c 'unzip -l /opt/jboss/standalone/deployments/sipcs-login-unico-jboss-okd.war | grep -E "commons-lang|api_|cdi-api"'
   284220  10-09-2026 15:36   WEB-INF/lib/commons-lang-2.6.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="deployment-info"
NAME                            RUNTIME-NAME                    PERSISTENT ENABLED STATUS
sipcs-login-unico-jboss-okd.war sipcs-login-unico-jboss-okd.war false      true    OK
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- curl -s -o /dev/null -w "login2: %{http_code}\n" http://localhost:8080/login2/
login2: 200
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- tail -100 /opt/jboss/standalone/log/server.log | grep -E -A15 "ERROR|Caused
>
> ^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- tail -100 /opt/jboss/standalone/log/server.log | grep -E -A15 "ERROR|Caused

>
