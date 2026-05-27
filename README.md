
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="/host=master/server=sisag-lx0041:restart"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: Connection refused
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="/host=master/server=sisag-lx0041:restart"
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: WFLYPRT0053: Could not connect to http-remoting://localhost:9990. The connection failed: Connection refused
[p585600@sspdeapllx0041 ~]$



ps -ef | grep sisag-lx0041 | grep -v grep

