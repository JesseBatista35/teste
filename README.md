bash-5.2$
-bash-5.2$
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.192.222.239:9999 --command=":shutdown(restart=true)"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.192.222.239:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap-7.0/hc_des/tmp/auth/local4691120234731083235.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=remote://10.192.222.239:9999 --command=":shutdown(restart=true)"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.192.222.239:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap-7.0/hc_des/tmp/auth/local7764398921107699874.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
-bash-5.2$ sudo su
Password:
p585600 is not in the sudoers file.
This incident has been reported to the administrator.
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.192.222.239:9999 --command=":shutdown(restart=true)"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.192.222.239:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap-7.0/hc_des/tmp/auth/local3383790789450620246.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
-bash-5.2$
-bash-5.2$
-bash-5.2$
-bash-5.2$ sudo su
Password:
p585600 is not in the sudoers file.
This incident has been reported to the administrator.
-bash-5.2$
-bash-5.2$
-bash-5.2$
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=remote://10.192.222.239:9999 --command=":shutdown(restart=true)"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.192.222.239:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap-7.0/hc_des/tmp/auth/local93487590624344968.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
-bash-5.2$
-bash-5.2$
-bash-5.2$
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh
You are disconnected at the moment. Type 'connect' to connect to the server or 'help' for the list of supported commands.
[disconnected /] yes
Unexpected command 'yes'. Type 'help --commands' for the list of supported commands.
[disconnected /] yes
Unexpected command 'yes'. Type 'help --commands' for the list of supported commands.
[disconnected /] y
Unexpected command 'y'. Type 'help --commands' for the list of supported commands.
[disconnected /]
-bash-5.2$
-bash-5.2$
-bash-5.2$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh
[disconnected /] connect 10.192.222.239:9999
You are disconnected at the moment. Type 'connect' to connect to the server or 'help' for the list of supported commands.
[disconnected /] yes
Unexpected command 'yes'. Type 'help --commands' for the list of supported commands.
[disconnected /]
