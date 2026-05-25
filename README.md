[p585600@sspdeapllx0041 ~]$ sed -n '1488,1520p' /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml
            <outbound-socket-binding name="mail-smtp">
                <remote-destination host="localhost" port="25"/>
            </outbound-socket-binding>
        </socket-binding-group>
    </socket-binding-groups>
    <server-groups>
        <server-group name="main-server-group" profile="full">
            <jvm name="default">
                <heap size="1000m" max-size="1000m"/>
            </jvm>
            <socket-binding-group ref="full-sockets"/>
        </server-group>
        <server-group name="other-server-group" profile="full-ha">
            <jvm name="default">
                <heap size="1000m" max-size="1000m"/>
            </jvm>
            <socket-binding-group ref="full-ha-sockets"/>
        </server-group>
    </server-groups>
    <host-excludes>
        <host-exclude name="EAP62">
            <host-release id="EAP6.2"/>
            <excluded-extensions>
                <extension module="org.wildfly.extension.batch.jberet"/>
                <extension module="org.wildfly.extension.bean-validation"/>
                <extension module="org.wildfly.extension.clustering.singleton"/>
                <extension module="org.wildfly.extension.io"/>
                <extension module="org.wildfly.extension.messaging-activemq"/>
                <extension module="org.wildfly.extension.request-controller"/>
                <extension module="org.wildfly.extension.security.manager"/>
                <extension module="org.wildfly.extension.undertow"/>
                <extension module="org.wildfly.iiop-openjdk"/>
            </excluded-extensions>
[p585600@sspdeapllx0041 ~]$
