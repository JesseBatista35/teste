root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# sed -n '10,20p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jdr"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.jsf"/>
        <extension module="org.jboss.as.jsr77"/>
        <extension module="org.jboss.as.logging"/>
        <extension module="org.jboss.as.mail"/>
        <extension module="org.jboss.as.modcluster"/>
        <extension module="org.jboss.as.naming"/>
[root@caddeapllx2484 tmp]# ^C
[root@caddeapllx2484 tmp]# sed -n '39,50p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
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
[root@caddeapllx2484 tmp]#
