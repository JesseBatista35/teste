oc get pods -n sispl-des -l name=sispl-canal-webhook-pix-des

oc exec <novo-pod> -n sispl-des -- grep -i "KEYSTORE_URL" /opt/jboss/standalone/configuration/standalone-okd.xml

oc set env deployment/sispl-canal-webhook-pix-des SISTEMA_AMBIENTE=des -n sispl-des
