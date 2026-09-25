p585600@SCTDEAPLLX0094:~$ ps -ef | grep -Ei 'java|node|python|gunicorn|uvicorn|php|docker|containerd' | grep -v grep
sicia     1219 29666  0 Jun15 ?        00:22:10 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    29587   716  0 Jun15 ?        01:05:43 node /opt/sicia/server/index.js                                                                                                                     
sicia    29593   716  0 Jun15 ?        01:06:34 node /opt/sicia/server/index.js                                                                                                                     
sicia    29599   716  0 Jun15 ?        00:50:16 node /opt/sicia/server/services/ldap/index.js                                                                                                       
sicia    29619   716  0 Jun15 ?        03:22:19 node /opt/sicia/server/index.js                                                                                                                     
sicia    29630   716  0 Jun15 ?        00:33:24 node /opt/sicia/server/services/desktop/index.js                                                                                                    
sicia    29638   716  0 Jun15 ?        08:39:55 node /opt/sicia/server/index.js                                                                                                                     
sicia    29649   716  0 Jun15 ?        02:30:40 node /opt/sicia/server/services/loki/index.js                                                                                                       
sicia    29666   716  0 Jun15 ?        00:40:09 node /opt/sicia/server/index.js                                                                                                                     
sicia    29684 29587  0 Jun15 ?        00:00:00 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    29685 29593  0 Jun15 ?        00:00:00 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    29699 29619  0 Jun15 ?        00:00:00 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    29705 29638  0 Jun15 ?        00:00:00 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    29711 29666  0 Jun15 ?        00:23:57 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
sicia    31415 29666  0 Jun15 ?        00:19:08 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ systemctl list-units --type=service --state=running | grep -viE 'systemd|dbus|ssh|cron|rsyslog'
UNIT                        LOAD   ACTIVE SUB     DESCRIPTION
acpid.service               loaded active running ACPI event daemon
getty@tty1.service          loaded active running Getty on tty1
getty@tty2.service          loaded active running Getty on tty2
nfs-common.service          loaded active running LSB: NFS support files common to client and server
nfs-kernel-server.service   loaded active running LSB: Kernel NFS server support
nginx.service               loaded active running A high performance web server and a reverse proxy server
nscd.service                loaded active running LSB: Starts the Name Service Cache Daemon
open-vm-tools.service       loaded active running Service for virtual machines hosted on VMware
pm2-sicia.service           loaded active running PM2 process manager
postgresql@9.4-main.service loaded active running PostgreSQL Cluster 9.4-main
puppet.service              loaded active running Puppet agent
rpcbind.service             loaded active running LSB: RPC portmapper replacement
snmpd.service               loaded active running LSB: SNMP agents

LOAD   = Reflects whether the unit definition was properly loaded.
ACTIVE = The high-level unit activation state, i.e. generalization of SUB.
SUB    = The low-level unit activation state, values depend on unit type.

20 loaded units listed. Pass --all to see loaded but inactive units, too.
To show all installed unit files use 'systemctl list-unit-files'.
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -alE 'LDAP_URL|STRATEGY' /proc/[0-9]*/environ 2>/dev/null
/proc/1219/environ
/proc/29587/environ
/proc/29593/environ
/proc/29599/environ
/proc/29619/environ
/proc/29630/environ
/proc/29638/environ
/proc/29666/environ
/proc/29684/environ
/proc/29685/environ
/proc/29699/environ
/proc/29705/environ
/proc/29711/environ
/proc/31415/environ
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo cat /proc/<PID>/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
-bash: PID: Arquivo ou diretório não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo docker ps --format '{{.Names}}\t{{.Image}}'
sudo: docker: comando não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo docker inspect <container> --format '{{range .Config.Env}}{{println .}}{{end}}' \
>   | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
-bash: container: Arquivo ou diretório não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ systemctl cat <servico> | grep -E 'Environment|EnvironmentFile'
-bash: erro de sintaxe próximo do `token' não esperado `|'
p585600@SCTDEAPLLX0094:~$ sudo grep -rEsn '(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)\s*[=:]' \
>   /etc /opt /srv /var/www /app /home 2>/dev/null | grep -v '\.log:'


^C
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo find / -xdev \( -name '.env' -o -name '*.env' -o -name 'docker-compose*.yml' \) 2>/dev/null
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
