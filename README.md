Já visualizei a mudança 
 
Por enquanto estou focado no batch. Assim que resolver, vejo o online. 
 
Thiago Jeferson de Sousa Silva, consigo reinicar o Jboss ou preciso solicitar a vocÊs?
 
Jesse Mouta Pereira Batista ou Thiago Jeferson de Sousa Silva, podem disponibilizar o log do batch? Na sequência, poderiam reiniciar o mesmo ou este é reiniciado a cada deploy?



 
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# systemctl list-units --type=service --all | grep -iE 'jboss|eap|wildfly'
● httpd-eap.service                      loaded    failed   failed  The Apache HTTP Server
  jboss-eap-standalone.service           loaded    active   running JBoss EAP Systemctl - STANDALONE
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# systemctl restart jboss-eap-standalone
[root@caddeapllx2884 p585600]# systemctl status jboss-eap-standalone --no-pager -l
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
     Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; preset: disabled)
     Active: active (running) since Wed 2026-11-25 17:12:53 -03; 21s ago
    Process: 1239720 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
   Main PID: 1239730 (runuser)
      Tasks: 250 (limit: 23083)
     Memory: 1.4G
        CPU: 46.409s
     CGroup: /system.slice/jboss-eap-standalone.service
             ├─1239730 runuser jboss -c "LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml"
             ├─1239733 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml
             └─1239907 java "-D[Standalone]" -server "-Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/gc.log:time,uptimemillis:filecount=5,filesize=3M" "-Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -XX:+UseG1GC -XX:+ExplicitGCInvokesConcurrent -XX:MaxGCPauseMillis=500 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml

nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239720]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239722]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239722]: pam_unix(runuser:session): session closed for user jboss
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239726]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239726]: pam_unix(runuser:session): session closed for user jboss
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239730]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239720]: Starting JBoss EAP:
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1240061]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# journalctl -u jboss-eap-standalone --since "3 min ago" --no-pager | tail -40
nov 25 17:12:39 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Stopping JBoss EAP Systemctl - STANDALONE...
nov 25 17:12:39 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239480]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239480]: Stopping JBoss EAP:
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239713]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[380201]: *** JBossAS process (380375) received TERM signal ***
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[380198]: Sessão terminada, matando o shell...
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[380201]: /opt/jboss-eap/bin/standalone.sh: linha 1: kill: (380375) - Processo inexistente
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[380201]: *** JBossAS process (380375) received KILL signal ***
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239718]: grep: /opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid: Arquivo ou diretório inexistente
nov 25 17:12:45 caddeapllx2884.agil.nprd.caixa.gov.br runuser[380198]: pam_unix(runuser:session): session closed for user jboss
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[380198]:  ...morto.
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Stopped JBoss EAP Systemctl - STANDALONE.
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 40min 36.055s CPU time.
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239720]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239722]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239722]: pam_unix(runuser:session): session closed for user jboss
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239726]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239726]: pam_unix(runuser:session): session closed for user jboss
nov 25 17:12:47 caddeapllx2884.agil.nprd.caixa.gov.br runuser[1239730]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1239720]: Starting JBoss EAP:
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[1240061]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 25 17:12:53 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# systemctl status httpd-eap --no-pager -l
× httpd-eap.service - The Apache HTTP Server
     Loaded: loaded (/etc/systemd/system/httpd-eap.service; enabled; preset: disabled)
     Active: failed (Result: exit-code) since Wed 2026-11-25 17:09:37 -03; 3min 53s ago
   Duration: 33.210s
    Process: 1235321 ExecStop=/opt/httpd/sbin/apachectl -k greceful-stop (code=exited, status=1/FAILURE)
   Main PID: 1232893 (code=exited, status=0/SUCCESS)
        CPU: 98ms

nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -S                 : a synonym for -t -D DUMP_VHOSTS -D DUMP_RUN_CFG
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_MODULES : show all loaded modules
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -M                 : a synonym for -t -D DUMP_MODULES
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_INCLUDES: show all included configuration files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t                 : run syntax check for config files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -T                 : start without DocumentRoot(s) check
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -X                 : debug mode (only one worker, do not detach)
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: httpd-eap.service: Control process exited, code=exited, status=1/FAILURE
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: httpd-eap.service: Failed with result 'exit-code'.
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Stopped The Apache HTTP Server.
[root@caddeapllx2884 p585600]# journalctl -u httpd-eap -n 30 --no-pager
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]: httpd: illegal option -- k
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]: Usage: /opt/httpd/sbin/httpd [-D name] [-d directory] [-f file]
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:                              [-C "directive"] [-c "directive"]
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:                              [-k start|restart|graceful|graceful-stop|stop]
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:                              [-v] [-V] [-h] [-l] [-L] [-t] [-T] [-S] [-X]
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]: Options:
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -D name            : define a name for use in <IfDefine name> directives
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -d directory       : specify an alternate initial ServerRoot
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -f file            : specify an alternate ServerConfigFile
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -C "directive"     : process directive before reading config files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -c "directive"     : process directive after reading config files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -e level           : show startup errors of level (see LogLevel)
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -E file            : log startup errors to file
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -v                 : show version number
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -V                 : show compile settings
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -h                 : list available command line options (this page)
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -l                 : list compiled in modules
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -L                 : list available configuration directives
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_VHOSTS  : show parsed vhost settings
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_RUN_CFG : show parsed run settings
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -S                 : a synonym for -t -D DUMP_VHOSTS -D DUMP_RUN_CFG
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_MODULES : show all loaded modules
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -M                 : a synonym for -t -D DUMP_MODULES
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t -D DUMP_INCLUDES: show all included configuration files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -t                 : run syntax check for config files
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -T                 : start without DocumentRoot(s) check
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br apachectl[1235323]:   -X                 : debug mode (only one worker, do not detach)
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: httpd-eap.service: Control process exited, code=exited, status=1/FAILURE
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: httpd-eap.service: Failed with result 'exit-code'.
nov 25 17:09:37 caddeapllx2884.agil.nprd.caixa.gov.br systemd[1]: Stopped The Apache HTTP Server.
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#




ja reiniciei. me ajdua a pegar o log. igal o ajeferos
