
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9999 --command="/host=master/server=sisag-lx0041:restart"
Failed to connect to the controller: The controller is not available at localhost:9999: java.net.ConnectException: WFLYPRT0053: Could not connect to remoting://localhost:9999. The connection failed: WFLYPRT0053: Could not connect to remoting://localhost:9999. The connection failed: Connection refused
[p585600@sspdeapllx0041 ~]$


