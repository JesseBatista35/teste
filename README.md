-sh-4.2$ cd /opt/jboss/jboss-eap/bin
-sh-4.2$ ./jboss-cli.sh -c --controller=10.116.94.206:9999 "/host=sbrdeapllx099/server-config=siosp_node1_lx099:stop"
Authenticating against security realm: ManagementRealm
Username: P585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.94.206:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: ELY05128: [JBOSS-LOCAL-USER] Failed to read challenge file [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap/hc/tmp/auth/local7957618567298702598.challenge (Permissão negada)]
   DIGEST-MD5: javax.security.sasl.SaslException: DIGEST-MD5: Server rejected authentication
-sh-4.2$ ./jboss-cli.sh -c --controller=10.116.94.206:9999 "/host=sbrdeapllx099/server-config=siosp_node1_lx099:stop"
Authenticating against security realm: ManagementRealm
Username: admin
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.94.206:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: ELY05128: [JBOSS-LOCAL-USER] Failed to read challenge file [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap/hc/tmp/auth/local2971652147077728727.challenge (Permissão negada)]
   DIGEST-MD5: javax.security.sasl.SaslException: DIGEST-MD5: Server rejected authentication
-sh-4.2$ ./jboss-cli.sh -c --controller=10.116.94.206:9999 "/host=sbrdeapllx099/server-config=siosp_node1_lx099:stop"
Authenticating against security realm: ManagementRealm
Username: admin
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.94.206:9999: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: ELY05128: [JBOSS-LOCAL-USER] Failed to read challenge file [Caused by java.io.FileNotFoundException: /opt/jboss/jboss-eap/hc/tmp/auth/local2249874730254492800.challenge (Permissão negada)]
   DIGEST-MD5: javax.security.sasl.SaslException: DIGEST-MD5: Server rejected authentication
-sh-4.2$ sudo su jboos -s
su: option requires an argument -- 's'

Usage:
 su [options] [-] [USER [arg]...]

Change the effective user id and group id to that of USER.
A mere - implies -l.   If USER not given, assume root.

Options:
 -m, -p, --preserve-environment  do not reset environment variables
 -g, --group <group>             specify the primary group
 -G, --supp-group <group>        specify a supplemental group

 -, -l, --login                  make the shell a login shell
 -c, --command <command>         pass a single command to the shell with -c
 --session-command <command>     pass a single command to the shell with -c
                                 and do not create a new session
 -f, --fast                      pass -f to the shell (for csh or tcsh)
 -s, --shell <shell>             run shell if /etc/shells allows it

 -h, --help     display this help and exit
 -V, --version  output version information and exit

For more details see su(1).
-sh-4.2$ sudo -u jboos -s
sudo: usuário desconhecido: jboos
sudo: não foi possível inicializar plug-in de política
-sh-4.2$ sudo -u jboos7
sudo: usuário desconhecido: jboos7
sudo: não foi possível inicializar plug-in de política
-sh-4.2$ sudo su jboos7 -s
su: option requires an argument -- 's'

Usage:
 su [options] [-] [USER [arg]...]

Change the effective user id and group id to that of USER.
A mere - implies -l.   If USER not given, assume root.

Options:
 -m, -p, --preserve-environment  do not reset environment variables
 -g, --group <group>             specify the primary group
 -G, --supp-group <group>        specify a supplemental group

 -, -l, --login                  make the shell a login shell
 -c, --command <command>         pass a single command to the shell with -c
 --session-command <command>     pass a single command to the shell with -c
                                 and do not create a new session
 -f, --fast                      pass -f to the shell (for csh or tcsh)
 -s, --shell <shell>             run shell if /etc/shells allows it

 -h, --help     display this help and exit
 -V, --version  output version information and exit

For more details see su(1).
-sh-4.2$ sudo jboss
sudo: jboss: comando não encontrado
-sh-4.2$ sudo jboss -s
sudo: jboss: comando não encontrado
-sh-4.2$



-sh-4.2$ sudo su
[root@sbrdeapllx099 bin]# ./jboss-cli.sh -c "/profile=default/server-config=siosp_node1_lx099:stop"
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: Conexão recusada
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
