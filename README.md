oc get dc sihdg-jboss8-des -o jsonpath='{range .spec.template.spec.containers[0].volumeMounts[*]}{.name}{"\t"}{.mountPath}{"\n"}{end}'


-sh-4.2$ oc get dc sihdg-jboss8-des -o jsonpath='{range .spec.template.spec.containers[0].volumeMounts[*]}{.name}{"\t"}{.mountPath}{"\n"}{end}'

sihdg-sinaf-data-des    /sihdg_sinaf
sihdg-jboss8-data-des   /sihdg_des
caixa-truststore-acteste-nprd   /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
jboss-config-sihdg-jboss8       /opt/server/standalone/configuration/standalone.xml
java-config-sihdg-jboss8        /opt/server/bin/standalone.conf
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


