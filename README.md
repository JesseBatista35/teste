,[jboss7@sspdeapllx0041 p585600]$/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: Connection refused
[jboss7@sspdeapllx0041 p585600]$ grep -n "management" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml | grep "port\|interface"
74:        <management-interfaces>
76:                <socket interface="management" port="${jboss.management.native.port:9999}"/>
79:                <socket interface="management" port="${jboss.management.http.port:9990}"/>
81:        </management-interfaces>
89:        <interface name="management">
[jboss7@sspdeapllx0041 p585600]$

