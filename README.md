P=sipcs-login-unico-jboss-okd-des-15-dqm8d

# 1) O WAR novo tem o commons-lang e está sem as APIs de spec?
oc exec $P -- sh -c 'unzip -l /opt/jboss/standalone/deployments/sipcs-login-unico-jboss-okd.war | grep -E "commons-lang|api_|cdi-api"'

# 2) Deploy OK?
oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="deployment-info"

# 3) Teste da aplicação
oc exec $P -- curl -s -o /dev/null -w "login2: %{http_code}\n" http://localhost:8080/login2/

# 4) Se não vier 200/302, ver o erro
oc exec $P -- tail -100 /opt/jboss/standalone/log/server.log | grep -E -A15 "ERROR|Caused
