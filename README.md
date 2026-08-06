
[root@sbrdeapllx114 tmp]# netstat -tlnp | grep -i java
tcp        0      0 10.116.94.221:9895      0.0.0.0:*               OUÇA       27903/java
tcp        0      0 127.0.0.1:5383          0.0.0.0:*               OUÇA       27485/java
tcp        0      0 127.0.0.1:46824         0.0.0.0:*               OUÇA       27903/java
tcp        0      0 10.116.94.221:9864      0.0.0.0:*               OUÇA       27485/java
tcp        0      0 127.0.0.1:5353          0.0.0.0:*               OUÇA       28059/java
tcp        0      0 10.116.94.221:9834      0.0.0.0:*               OUÇA       28059/java
tcp        0      0 10.116.94.221:9930      0.0.0.0:*               OUÇA       27763/java
tcp        0      0 127.0.0.1:5358          0.0.0.0:*               OUÇA       28724/java
tcp        0      0 10.116.94.221:9839      0.0.0.0:*               OUÇA       28724/java
tcp        0      0 10.116.94.221:9935      0.0.0.0:*               OUÇA       27485/java
tcp        0      0 10.116.94.221:9999      0.0.0.0:*               OUÇA       27411/java
tcp        0      0 127.0.0.1:5328          0.0.0.0:*               OUÇA       7777/java
tcp        0      0 10.116.94.221:9809      0.0.0.0:*               OUÇA       7777/java
tcp        0      0 10.116.94.221:9905      0.0.0.0:*               OUÇA       28059/java
tcp        0      0 127.0.0.1:35698         0.0.0.0:*               OUÇA       27763/java
tcp        0      0 127.0.0.1:45523         0.0.0.0:*               OUÇA       28059/java
tcp        0      0 127.0.0.1:43283         0.0.0.0:*               OUÇA       27485/java
tcp        0      0 127.0.0.1:46100         0.0.0.0:*               OUÇA       28724/java
tcp        0      0 10.116.94.221:10293     0.0.0.0:*               OUÇA       27763/java
tcp        0      0 10.116.94.221:9910      0.0.0.0:*               OUÇA       28724/java
tcp        0      0 10.116.94.221:9880      0.0.0.0:*               OUÇA       7777/java
tcp        0      0 127.0.0.1:41658         0.0.0.0:*               OUÇA       7777/java
tcp        0      0 127.0.0.1:5338          0.0.0.0:*               OUÇA       28314/java
tcp        0      0 10.116.94.221:9819      0.0.0.0:*               OUÇA       28314/java
tcp        0      0 127.0.0.1:43519         0.0.0.0:*               OUÇA       28314/java
tcp        0      0 127.0.0.1:5343          0.0.0.0:*               OUÇA       27903/java
tcp        0      0 10.116.94.221:9824      0.0.0.0:*               OUÇA       27903/java
tcp        0      0 127.0.0.1:36065         0.0.0.0:*               OUÇA       27391/java
tcp        0      0 10.116.94.221:9890      0.0.0.0:*               OUÇA       28314/java
tcp        0      0 127.0.0.1:5378          0.0.0.0:*               OUÇA       27763/java
tcp        0      0 10.116.94.221:9859      0.0.0.0:*               OUÇA       27763/java
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]# ss -tlnp | grep 999
LISTEN     0      50     10.116.94.221:9999                     *:*                   users:(("java",pid=27411,fd=91))
[root@sbrdeapllx114 tmp]# grep -A5 "management-interfaces" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml
        <management-interfaces>
            <native-interface security-realm="ManagementRealm">
                <socket interface="management" port="${jboss.management.native.port:9999}"/>
            </native-interface>
        </management-interfaces>
    </management>
    <domain-controller>
        <remote security-realm="ManagementRealm" username="admin">
            <discovery-options>
                <static-discovery name="primary" protocol="${jboss.domain.master.protocol:remote}" host="${jboss.domain.master.address}" port="${jboss.domain.master.port:9999}"/>
[root@sbrdeapllx114 tmp]#
