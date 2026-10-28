grep -nE "WFLYUT0021|WFLYEE0047" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -4
curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/sigsj_intranet/
