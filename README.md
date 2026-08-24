
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx104 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: The controller is not available at 10.116.89.0:9999: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remoting://10.116.89.0:9999. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remoting://10.116.89.0:9999. A conexão falhou: JBREM000202: Abrupt close on Remoting connection 77a953b0 to /10.116.89.0:9999 of endpoint "cli-client" <f0e995e>
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999 --user=p585600 --password=oculto
Failed to connect to the controller: Unable to authenticate against controller at 10.116.89.0:9999: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: javax.security.sasl.SaslException: DIGEST-MD5: Server rejected authentication
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#

