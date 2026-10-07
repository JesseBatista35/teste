
-sh-4.2$ ps -ef | grep [j]boss-modules | tr ' ' '\n' | grep -E '^-D(\[|jboss\.(home|server\.base)|.*modcluster)'
-D[Standalone]
-Djboss.home.dir=/opt/jboss/jboss-eap
-Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone
-Dhttp.modcluster.proxy1=10.116.223.231
-Dhttp.modcluster.proxy2=10.116.223.232
-Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666
-Djboss_modcluster_balancer=sirta
-Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone
-sh-4.2$ getent hosts caddeapllx135.extra.caixa.gov.br caddeapllx136.extra.caixa.gov.br
10.116.223.231  caddeapllx135.extra.caixa.gov.br
10.116.223.232  caddeapllx136.extra.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n "modcluster" /opt/jboss/jboss-eap/standalone/configuration/standalone*.xml
/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml:23:        <extension module="org.jboss.as.modcluster"/>
/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml:419:        <subsystem xmlns="urn:jboss:domain:modcluster:1.2">
/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml:420:            <mod-cluster-config advertise-socket="modcluster" balancer="${jboss_modcluster_balancer:mybalancer}" proxy-list="${jboss_modcluster_proxy_list}" auto-enable-contexts="true" load-balancing-group="${jboss_modcluster_balancer:mybalancer}" connector="ajp">
/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml:665:        <socket-binding name="modcluster" port="0" multicast-address="224.0.1.105" multicast-port="23364"/>
/opt/jboss/jboss-eap/standalone/configuration/standalone-ha.xml:18:        <extension module="org.jboss.as.modcluster"/>
/opt/jboss/jboss-eap/standalone/configuration/standalone-ha.xml:314:        <subsystem xmlns="urn:jboss:domain:modcluster:1.2">
/opt/jboss/jboss-eap/standalone/configuration/standalone-ha.xml:315:            <mod-cluster-config advertise-socket="modcluster" connector="ajp">
/opt/jboss/jboss-eap/standalone/configuration/standalone-ha.xml:413:        <socket-binding name="modcluster" port="0" multicast-address="224.0.1.105" multicast-port="23364"/>
-sh-4.2$
