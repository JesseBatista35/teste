
-bash-5.2$
-bash-5.2$ su - jboss -c "/etc/init.d/jboss-7.0_hc_des.sh restart"
Password:
su: Authentication failed
-bash-5.2$
-bash-5.2$
-bash-5.2$
/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect controller=10.192.222.239:9999
:shutdown(restart=true)
Failed to connect to the controller: The controller is not available at 10.192.222.239:9999: java.net.ConnectException: WFLYPRT0023: Could not connect to remoting://10.192.222.239:9999. The connection timed out: WFLYPRT0023: Could not connect to remoting://10.192.222.239:9999. The connection timed out
-bash: syntax error near unexpected token ‘restart=true’
-bash-5.2$
-bash-5.2$
-bash-5.2$
