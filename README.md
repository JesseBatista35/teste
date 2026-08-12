root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# grep -n "system-properties" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
39:    <system-properties>
50:    </system-properties>
[root@caddeapllx2484 tmp]#
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
[root@caddeapllx2484 tmp]#
