[p585600@sspdeapllx0041 ~]$ grep -A 5 "management-interfaces" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
        <management-interfaces>
            <native-interface security-realm="ManagementRealm">
                <socket interface="management" port="${jboss.management.native.port:9999}"/>
            </native-interface>
            <http-interface security-realm="ManagementRealm" http-upgrade-enabled="true">
                <socket interface="management" port="${jboss.management.http.port:9990}"/>
--
        </management-interfaces>
    </management>

    <domain-controller>
        <remote host="${jboss.domain.master.address:domain}" port="${jboss.domain.master.port:9999}" security-realm="ManagementRealm" username="admin"/>
    </domain-controller>
[p585600@sspdeapllx0041 ~]$

