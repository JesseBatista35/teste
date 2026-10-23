oc get pods -n sicow-des | grep penhor
oc exec <pod-novo> -n sicow-des -- ls -R /opt/jboss/modules/br/gov/caixa
oc logs <pod-novo> -n sicow-des | grep -E "WFLYUT0021|WFLYSRV0010|ModuleNotFound|scowdb01"
