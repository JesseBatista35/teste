
[root@caddeapllx2484 tmp]# grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />
        <property name="url.sisgr" value="https://servicossociais.des.corerj.caixa/intranet.do?segmento=INTRANET01" />
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# grep -A 15 "<system-properties>" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
    <system-properties>
        <property name="java.net.preferIPv4Stack" value="true"/>
        <property name="org.apache.catalina.connector.URI_ENCODING" value="UTF-8" />
        <property name="org.apache.catalina.connector.USE_BODY_ENCODING_FOR_QUERY_STRING" value="true" />
        <property name="jboss.as.management.blocking.timeout" value="1800"/>
        <property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />
        <property name="url.sisgr" value="https://servicossociais.des.corerj.caixa/intranet.do?segmento=INTRANET01" />
        <property name="file.encoding" value="UTF-8" />
        <property name="pageEncoding" value="UTF-8" />
        <property name="user.country" value="BR" />
        <property name="user.language" value="pt" />
    </system-properties>
    <management>
        <security-realms>
            <security-realm name="ManagementRealm">
                <authentication>
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
