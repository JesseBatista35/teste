
[jboss7@sspdeapllx0041 tmp]$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.98:9990 --user=jboss7
Authenticating against security realm: ManagementRealm
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.98:9990: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: Server rejected authentication
[jboss7@sspdeapllx0041 tmp]$ cat /opt/jboss/jboss-eap-7.0/domain/configuration/mgmt-users.properties
#
# Properties declaration of users for the realm 'ManagementRealm' which is the default realm
# for new installations. Further authentication mechanism can be configured
# as part of the <management /> in host.xml.
#
# Users can be added to this properties file at any time, updates after the server has started
# will be automatically detected.
#
# By default the properties realm expects the entries to be in the format: -
# username=HEX( MD5( username ':' realm ':' password))
#
# A utility script is provided which can be executed from the bin folder to add the users: -
# - Linux
#  bin/add-user.sh
#
# - Windows
#  bin\add-user.bat
# On start-up the server will also automatically add a user $local - this user is specifically
# for local tools running against this AS installation.
#
# The following illustrates how an admin user could be defined, this
# is for illustration only and does not correspond to a usable password.
#
admin=e95dbef9501b08397dfb60f407711c7a
#
#$REALM_NAME=ManagementRealm$ This line is used by the add-user utility to identify the realm name already used in this file.
#
[jboss7@sspdeapllx0041 tmp]$
