-sh-4.2$
-sh-4.2$
-sh-4.2$  /opt/jboss/jboss-eap/bin/jboos-cli.sh --connect -controller=10.116.89.0:9999
-sh: /opt/jboss/jboss-eap/bin/jboos-cli.sh: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ :read-children-names(child-type=host)
-sh: erro de sintaxe próximo do `token' não esperado `child-type=host'
-sh-4.2$ /host=sbrdeapllx104_credito:read-attribute(name=host-state)
-sh: erro de sintaxe próximo do `token' não esperado `name=host-state'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
Authenticating against security realm: ManagementRealm
Username:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.89.0:9999: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: javax.security.sasl.SaslException: No username supplied.

-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx104 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
Authenticating against security realm: ManagementRealm
Username:
