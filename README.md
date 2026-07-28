oc exec sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -n sispl-des -- grep -i "KEYSTORE_URL" /opt/jboss/standalone/configuration/standalone-okd.xml


oc set env dc/sispl-canal-webhook-pix-des SISTEMA_AMBIENTE=des -n sispl-des

