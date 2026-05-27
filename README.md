
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 netstat -tlnp | grep jboss
(Not all processes could be identified, non-owned process info
 will not be shown, you would have to be root to see it all.)
[p585600@sspdeapllx0041 ~]$ grep -r "management" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml | head -5
    <management>
        <management-interfaces>
                <socket interface="management" port="${jboss.management.native.port:9999}"/>
                <socket interface="management" port="${jboss.management.http.port:9990}"/>
        </management-interfaces>
[p585600@sspdeapllx0041 ~]$


