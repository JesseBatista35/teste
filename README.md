
[root@caddeapllx2484 tmp]# grep -c "system-properties" /opt/jboss-eap/standalone/configuration/standalone.xml
0
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# head -50 /opt/jboss-eap/standalone/configuration/standalone.xml
<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:16.0">
    <extensions>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jdr"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.jsf"/>
        <extension module="org.jboss.as.logging"/>
        <extension module="org.jboss.as.mail"/>
        <extension module="org.jboss.as.naming"/>
        <extension module="org.jboss.as.pojo"/>
        <extension module="org.jboss.as.remoting"/>
        <extension module="org.jboss.as.sar"/>
        <extension module="org.jboss.as.security"/>
        <extension module="org.jboss.as.transactions"/>
        <extension module="org.jboss.as.webservices"/>
        <extension module="org.jboss.as.weld"/>
        <extension module="org.wildfly.extension.batch.jberet"/>
        <extension module="org.wildfly.extension.bean-validation"/>
        <extension module="org.wildfly.extension.clustering.web"/>
        <extension module="org.wildfly.extension.core-management"/>
        <extension module="org.wildfly.extension.discovery"/>
        <extension module="org.wildfly.extension.ee-security"/>
        <extension module="org.wildfly.extension.elytron"/>
        <extension module="org.wildfly.extension.health"/>
        <extension module="org.wildfly.extension.io"/>
        <extension module="org.wildfly.extension.metrics"/>
        <extension module="org.wildfly.extension.request-controller"/>
        <extension module="org.wildfly.extension.security.manager"/>
        <extension module="org.wildfly.extension.undertow"/>
    </extensions>
    <management>
        <security-realms>
            <security-realm name="ManagementRealm">
                <authentication>
                    <local default-user="$local" skip-group-loading="true"/>
                    <properties path="mgmt-users.properties" relative-to="jboss.server.config.dir"/>
                </authentication>
                <authorization map-groups-to-roles="false">
                    <properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
                </authorization>
            </security-realm>
            <security-realm name="ApplicationRealm">
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# find /opt/jboss-eap -iname "standalone*.xml" 2>/dev/null
/opt/jboss-eap/standalone/configuration/standalone-load-balancer.xml
/opt/jboss-eap/standalone/configuration/standalone.xml
/opt/jboss-eap/standalone/configuration/standalone-full.xml
/opt/jboss-eap/standalone/configuration/standalone-ha.xml
/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone-full-ha.initial.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone.initial.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone.last.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone.boot.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone-full-ha.last.xml
/opt/jboss-eap/standalone/configuration/standalone_xml_history/standalone-full-ha.boot.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-ec2-full-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-gossip-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-activemq-colocated.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-xts.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-gossip-full-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-genericjms.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-picketlink.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-azure-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-rts.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-ec2-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-jts.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/misc/docs/examples/configs/standalone-azure-full-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone-load-balancer.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone-full.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone-ha.xml
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.8.CP/configuration/standalone/standalone-full-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-activemq-colocated.xml
/opt/jboss-eap/docs/examples/configs/standalone-azure-full-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-azure-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-ec2-full-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-ec2-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-genericjms.xml
/opt/jboss-eap/docs/examples/configs/standalone-gossip-full-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-gossip-ha.xml
/opt/jboss-eap/docs/examples/configs/standalone-jts.xml
/opt/jboss-eap/docs/examples/configs/standalone-minimalistic.xml
/opt/jboss-eap/docs/examples/configs/standalone-picketlink.xml
/opt/jboss-eap/docs/examples/configs/standalone-rts.xml
/opt/jboss-eap/docs/examples/configs/standalone-xts.xml
[root@caddeapllx2484 tmp]#
