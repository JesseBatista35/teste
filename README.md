
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.97:9999 --command="/host=sspdeapllx0041/server=sisag-lx0041:restart"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.97:9999: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: Server rejected authentication
[p585600@sspdeapllx0041 ~]$

