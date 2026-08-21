
[p585600@srjdeapllx158 opt]$
[p585600@srjdeapllx158 opt]$ cd /opt/open/jboss/7.0.0/domain/configuration grep -n "SICPU_APLICATIVO|AUTHENTICATION_SERVER_URL|sifpp_intra" domain.xml host.xml
[p585600@srjdeapllx158 configuration]$ /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at srjdeapllx158:9990: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/open/jboss/7.0.0/domain/tmp/auth/local1578743252134412394.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$ /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
Authenticating against security realm: ManagementRealm
Username: admin
Password:
Failed to connect to the controller: Unable to authenticate against controller at srjdeapllx158:9990: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/open/jboss/7.0.0/domain/tmp/auth/local1424752793997975484.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
[p585600@srjdeapllx158 configuration]$ sudo su
[root@srjdeapllx158 configuration]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
