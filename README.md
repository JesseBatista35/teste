
Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$ pwd ls -la / find / -name ".js" 2>/dev/null | head -100 find / -name "main.js" 2>/dev/null | head -50
-sh-4.2$ vlear
-sh: vlear: comando não encontrado
-sh-4.2$ clear
-sh-4.2$ oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des --previous --tail=200
sed: can't read /opt/app-root/src/main*.js: No such file or directory
-sh-4.2$ oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter --previous --tail=200
2026/05/14 00:01:23 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/05/14 00:01:23 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused
-sh-4.2$ pwd ls -la / find / -name ".js" 2>/dev/null | head -100 find / -name "main.js" 2>/dev/null | head -50

find: ‘/usr/share/polkit-1/rules.d’: Permissão negada
find: ‘/usr/libexec/initscripts/legacy-actions/auditd’: Permissão negada
^C
-sh-4.2$ oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des --previous --tail=200
sed: can't read /opt/app-root/src/main*.js: No such file or directory
-sh-4.2$
