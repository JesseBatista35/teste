-sh-4.2$
-sh-4.2$ oc logs sipar-inter-des-25-nbb8n --since=15m | grep -iE "403|certif|x509|forbidden|error" | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sipar-inter-des-25-nbb8n bash -c 'grep -iE "truststore|trust-store|security-domain|client-cert|verify-client|ajp" $JBOSS_HOME/standalone/configuration/standalone*.xml'
/opt/jboss/standalone/configuration/standalone-full-ha.xml:            <default-security-domain value="other"/>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:            <mod-cluster-config advertise-socket="modcluster" connector="ajp">
/opt/jboss/standalone/configuration/standalone-full-ha.xml:            <security-domains>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                <security-domain name="other" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                <security-domain name="jboss-web-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                <security-domain name="jboss-ejb-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                <security-domain name="jaspitest" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:            </security-domains>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:                <ajp-listener name="ajp" socket-binding="ajp"/>
/opt/jboss/standalone/configuration/standalone-full-ha.xml:        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
/opt/jboss/standalone/configuration/standalone-full.xml:            <default-security-domain value="other"/>
/opt/jboss/standalone/configuration/standalone-full.xml:            <security-domains>
/opt/jboss/standalone/configuration/standalone-full.xml:                <security-domain name="other" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full.xml:                <security-domain name="jboss-web-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full.xml:                <security-domain name="jboss-ejb-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full.xml:                <security-domain name="jaspitest" cache-type="default">
/opt/jboss/standalone/configuration/standalone-full.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-full.xml:            </security-domains>
/opt/jboss/standalone/configuration/standalone-full.xml:        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
/opt/jboss/standalone/configuration/standalone-ha.xml:            <default-security-domain value="other"/>
/opt/jboss/standalone/configuration/standalone-ha.xml:            <mod-cluster-config advertise-socket="modcluster" connector="ajp">
/opt/jboss/standalone/configuration/standalone-ha.xml:            <security-domains>
/opt/jboss/standalone/configuration/standalone-ha.xml:                <security-domain name="other" cache-type="default">
/opt/jboss/standalone/configuration/standalone-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-ha.xml:                <security-domain name="jboss-web-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-ha.xml:                <security-domain name="jboss-ejb-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-ha.xml:                <security-domain name="jaspitest" cache-type="default">
/opt/jboss/standalone/configuration/standalone-ha.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-ha.xml:            </security-domains>
/opt/jboss/standalone/configuration/standalone-ha.xml:                <ajp-listener name="ajp" socket-binding="ajp"/>
/opt/jboss/standalone/configuration/standalone-ha.xml:        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
/opt/jboss/standalone/configuration/standalone-okd.xml:            <default-security-domain value="other"/>
/opt/jboss/standalone/configuration/standalone-okd.xml:            <security-domains>
/opt/jboss/standalone/configuration/standalone-okd.xml:                <security-domain name="other" cache-type="default">
/opt/jboss/standalone/configuration/standalone-okd.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-okd.xml:                <security-domain name="jboss-web-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-okd.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-okd.xml:                <security-domain name="jboss-ejb-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone-okd.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-okd.xml:                <security-domain name="jaspitest" cache-type="default">
/opt/jboss/standalone/configuration/standalone-okd.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone-okd.xml:            </security-domains>
/opt/jboss/standalone/configuration/standalone-okd.xml:                <ajp-listener name="ajp" socket-binding="ajp"/>
/opt/jboss/standalone/configuration/standalone-okd.xml:        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
/opt/jboss/standalone/configuration/standalone.xml:            <default-security-domain value="other"/>
/opt/jboss/standalone/configuration/standalone.xml:            <security-domains>
/opt/jboss/standalone/configuration/standalone.xml:                <security-domain name="other" cache-type="default">
/opt/jboss/standalone/configuration/standalone.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone.xml:                <security-domain name="jboss-web-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone.xml:                <security-domain name="jboss-ejb-policy" cache-type="default">
/opt/jboss/standalone/configuration/standalone.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone.xml:                <security-domain name="jaspitest" cache-type="default">
/opt/jboss/standalone/configuration/standalone.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone.xml:                <security-domain name="keycloak">
/opt/jboss/standalone/configuration/standalone.xml:                </security-domain>
/opt/jboss/standalone/configuration/standalone.xml:            </security-domains>
/opt/jboss/standalone/configuration/standalone.xml:        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
-sh-4.2$
