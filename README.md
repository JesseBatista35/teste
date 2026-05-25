
[p585600@sspdeapllx0041 ~]$ grep -rn "server-group name.*sisag|server-group name.*sipdi" /opt/jboss/jboss-eap-7.0/domain/configuration/
grep: /opt/jboss/jboss-eap-7.0/domain/configuration/mgmt-users.properties: Permission denied
grep: /opt/jboss/jboss-eap-7.0/domain/configuration/application-users.properties: Permission denied
[p585600@sspdeapllx0041 ~]$ ls /opt/jboss/jboss-eap-7.0/domain/configuration/
application-roles.properties  backup                             DinamoJCA.log  host-master.xml  host.xml          logging.properties      mgmt-users.properties
application-users.properties  default-server-logging.properties  domain.xml     host-slave.xml   host_xml_history  mgmt-groups.properties
[p585600@sspdeapllx0041 ~]$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
id: cannot find name for group ID 927
Falha de seguranca. Acesso indevido como root por p585600
[p585600@sspdeapllx0041 ~]$ sudo
usage: sudo [-D level] -h | -K | -k | -V
usage: sudo -v [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid]
usage: sudo -l[l] [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-U user name] [-u user name|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] file ...
[p585600@sspdeapllx0041 ~]$
