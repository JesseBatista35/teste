oc exec sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -n sispl-des -- grep -i "KEYSTORE_URL" /opt/jboss/standalone/configuration/standalone-okd.xml


oc set env dc/sispl-canal-webhook-pix-des SISTEMA_AMBIENTE=des -n sispl-des

-sh-4.2$ oc exec sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -n sispl-des -- grep -i "KEYSTORE_URL" /opt/jboss/standalone/configuration/standalone-okd.xml
error: unable to upgrade connection: container not found ("sispl-canal-webhook-pix-des")
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sispl-canal-webhook-pix-des SISTEMA_AMBIENTE=des -n sispl-des
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sispl-canal-webhook-pix-des" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
