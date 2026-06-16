[root@caddeapllx2484 p585600]# sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -k restart echo "Restart executado: $?"
Usage: /opt/httpd/sbin/httpd [-D name] [-d directory] [-f file]
                             [-C "directive"] [-c "directive"]
                             [-k start|restart|graceful|graceful-stop|stop]
                             [-v] [-V] [-h] [-l] [-L] [-t] [-T] [-S] [-X]
Options:
  -D name            : define a name for use in <IfDefine name> directives
  -d directory       : specify an alternate initial ServerRoot
  -f file            : specify an alternate ServerConfigFile
  -C "directive"     : process directive before reading config files
  -c "directive"     : process directive after reading config files
  -e level           : show startup errors of level (see LogLevel)
  -E file            : log startup errors to file
  -v                 : show version number
  -V                 : show compile settings
  -h                 : list available command line options (this page)
  -l                 : list compiled in modules
  -L                 : list available configuration directives
  -t -D DUMP_VHOSTS  : show parsed vhost settings
  -t -D DUMP_RUN_CFG : show parsed run settings
  -S                 : a synonym for -t -D DUMP_VHOSTS -D DUMP_RUN_CFG
  -t -D DUMP_MODULES : show all loaded modules
  -M                 : a synonym for -t -D DUMP_MODULES
  -t -D DUMP_INCLUDES: show all included configuration files
  -t                 : run syntax check for config files
  -T                 : start without DocumentRoot(s) check
  -X                 : debug mode (only one worker, do not detach)
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# ps aux | grep httpd | grep -v grep
root      1854  0.0  0.1 322784  8080 ?        Ss   09:25   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   13072  0.0  0.0 324392  4908 ?        S    11:54   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   13075  0.0  0.1 1637152 9356 ?        Sl   11:54   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
