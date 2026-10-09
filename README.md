oc -n <namespace-sipcs-des> get pods
oc -n <ns> exec <pod> -- ls -la /opt/jboss/standalone/deployments/
#   -> procurar .war/.ear e os marcadores .deployed / .failed / .undeployed / .dodeploy
oc -n <ns> exec <pod> -- cat /opt/jboss/standalone/deployments/*.failed
oc -n <ns> logs <pod> | grep -E "WFLYSRV0010|WFLYUT0021|WFLYCTL0013|WFLYCTL0186|missing|ERROR"
oc -n <ns> exec <pod> -- /opt/jboss/bin/jboss-cli.sh -c --command="deployment-info"
# context root definido no artefato:
oc -n <ns> exec <pod> -- sh -c 'cd /tmp && unzip -p /opt/jboss/standalone/deployments/*.war WEB-INF/jboss-web.xml'
