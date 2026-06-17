
[root@caddeapllx2598 p585600]#
[root@caddeapllx2598 p585600]# ps aux | grep -i java | grep -v grep
[root@caddeapllx2598 p585600]#
[root@caddeapllx2598 p585600]#
[root@caddeapllx2598 p585600]# systemctl status jboss
Unit jboss.service could not be found.
[root@caddeapllx2598 p585600]# cd /opt/jboss-eap/
[root@caddeapllx2598 jboss-eap]# ls -la
total 472
drwxrwxr-x  12 jboss jboss    256 mai 28  2025 .
drwxr-xr-x.  4 root  root      36 mai 28  2025 ..
drwxrwxr-x   3 jboss jboss     27 jan 19  2024 appclient
drwxrwxr-x   4 jboss jboss   4096 mai 23  2025 bin
drwxrwxr-x   5 jboss jboss     52 jan 19  2024 docs
drwxrwxr-x   4 jboss jboss     38 jan 19  2024 domain
drwxrwxr-x   3 jboss jboss     90 mai 23  2025 .galleon
drwxrwxr-x   4 jboss jboss    162 mai 23  2025 .installation
-rwxrwxr-x   1 jboss jboss    419 jan 19  2024 JBossEULA.txt
-rwxrwxr-x   1 jboss jboss 441127 jul 31  2024 jboss-modules.jar
-rwxrwxr-x   1 jboss jboss  26530 jan 19  2024 LICENSE.txt
drwxrwxr-x   3 jboss jboss     20 jan 19  2024 modules
drwxrwxr-x   8 jboss jboss     91 jul 30  2024 standalone
-rwxrwxr-x   1 jboss jboss     71 mai 23  2025 version.txt
drwxrwxr-x   4 jboss jboss    158 jan 19  2024 welcome-content
drwxrwxr-x   3 jboss jboss     28 jan 19  2024 .well-known
[root@caddeapllx2598 jboss-eap]# sudo tail -50 /opt/jboss-eap/standalone/log/server.log
tail: não foi possível abrir '/opt/jboss-eap/standalone/log/server.log' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx2598 jboss-eap]#
[root@caddeapllx2598 jboss-eap]#
[root@caddeapllx2598 jboss-eap]#
[root@caddeapllx2598 jboss-eap]#
