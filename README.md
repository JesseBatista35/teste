oc exec <pod-portal> -n sicow-des -- ls -R /opt/jboss/modules/br/gov/caixa/siusr
oc exec <pod-penhor> -n sicow-des -- ls -R /opt/jboss/modules/br/gov/caixa 2>&1


oc logs <pod-penhor> -n sicow-des | grep -i "WFLYUT0021"
