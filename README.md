Se ele confirmar que quer SISAG-PROV, o comando para alterar é simples:
bashsed -i 's/"name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"/"name": "SISAG-PROV"/' /opt/azure/config/appinsights/applicationinsights.json
Depois verifica se ficou certo:
bashcat /opt/azure/config/appinsights/applicationinsights.json




}
[p585600@sspdeapllx0041 ~]$ sed -i 's/"name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"/"name": "SISAG-PROV"/' /opt/azure/config/appinsights/applicationinsights.json
sed: couldn't open temporary file /opt/azure/config/appinsights/sedEuFs08: Permission denied
[p585600@sspdeapllx0041 ~]$ sudo jboos7

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
sudo: jboos7: command not found
[p585600@sspdeapllx0041 ~]$ sudo jboos
sudo: jboos: command not found
[p585600@sspdeapllx0041 ~]$ sudo jboss7
sudo: jboss7: command not found
[p585600@sspdeapllx0041 ~]$ sudo jboss
sudo: jboss: command not found
[p585600@sspdeapllx0041 ~]$ sudo su
id: cannot find name for group ID 927
Falha de seguranca. Acesso indevido como root por p585600
[p585600@sspdeapllx0041 ~]$ sudo
usage: sudo [-D level] -h | -K | -k | -V
usage: sudo -v [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid]
usage: sudo -l[l] [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-U user name] [-u user name|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] file ...
[p585600@sspdeapllx0041 ~]$ sudo -u
sudo: option requires an argument -- 'u'
usage: sudo [-D level] -h | -K | -k | -V
usage: sudo -v [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid]
usage: sudo -l[l] [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-U user name] [-u user name|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] file ...

