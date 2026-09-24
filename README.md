
14:07:24,239 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 22891ms - Started 1176 of 1265 services (7 services failed or missing dependencies, 162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
-sh-4.2$ oc set volume dc/sihdg-jboss8-des -n sihdg-des --remove --name=java-security-override
deploymentconfig.apps.openshift.io/sihdg-jboss8-des volume updated
-sh-4.2$ oc delete configmap sihdg-java-security -n sihdg-des
configmap "sihdg-java-security" deleted
-sh-4.2$
