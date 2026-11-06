grep -E 'WFLYUT0021|WFLYSRV0010|ERROR' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -20
curl -s -o /dev/null -w '%{http_code}\n' http://localhost/<contexto-do-internet>/
