"-Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true"]


oc set volume dc/sihdg-jboss8-des -n sihdg-des --remove --name=java-security-override
oc delete configmap sihdg-java-security -n sihdg-des
