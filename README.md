oc rsh sipar-inter-des-25-nbb8n bash -c 'grep -iE "truststore|trust-store|security-domain|client-cert|verify-client|ajp" $JBOSS_HOME/standalone/configuration/standalone*.xml'
