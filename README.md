
[root@sbrdeapllx099 bin]# cd /opt/jboss/jboss-eap/bin
[root@sbrdeapllx099 bin]# cd /opt/jboss/jboss-eap/bin
[root@sbrdeapllx099 bin]# ./jboss-cli.sh -c "/profile=default/server-config=siosp_node1_lx099:stop"
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: Conexão recusada
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# exit
exit
-sh-4.2$ sudo -u jboss7
sudo: usuário desconhecido: jboss7
sudo: não foi possível inicializar plug-in de política
-sh-4.2$ sudo -u jboss
usage: sudo -h | -K | -k | -V
usage: sudo -v [-AknS] [-g group] [-h host] [-p prompt] [-u user]
usage: sudo -l [-AknS] [-g group] [-h host] [-p prompt] [-U user] [-u user] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C num] [-g group] [-h host] [-p prompt] [-T timeout] [-u user] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C num] [-g group] [-h host] [-p prompt] [-T timeout] [-u user] file ...
-sh-4.2$ sudo jboss -s
[sudo] senha para p585600:
sudo: jboss: comando não encontrado
-sh-4.2$ sudo jboss
sudo: jboss: comando não encontrado
-sh-4.2$
