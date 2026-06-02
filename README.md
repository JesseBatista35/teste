Se ele confirmar que quer SISAG-PROV, o comando para alterar é simples:
bashsed -i 's/"name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"/"name": "SISAG-PROV"/' /opt/azure/config/appinsights/applicationinsights.json
Depois verifica se ficou certo:
bashcat /opt/azure/config/appinsights/applicationinsights.json




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
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$ sudo jboss7
sudo: jboss7: command not found
[p585600@sspdeapllx0041 ~]$ sudo jboss
sudo: jboss: command not found
[p585600@sspdeapllx0041 ~]$
