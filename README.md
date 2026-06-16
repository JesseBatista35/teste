[root@caddeapllx1945 opt]# find /opt -name "standalone.sh" -o -name "domain.sh" 2>/dev/null
/opt/jboss-eap/bin/domain.sh
/opt/jboss-eap/bin/standalone.sh
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.14.CP/misc/bin/standalone.sh
/opt/jboss-eap/.installation/patches/jboss-eap-7.4.14.CP/misc/bin/domain.sh
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]# ls -la /etc/init.d/ | grep -i jboss
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]# ps aux | grep jboss
root       22383  0.0  0.0   6436  2364 pts/0    S+   14:23   0:00 grep --color=auto jboss
[root@caddeapllx1945 opt]# ls -la /opt/jboss-eap/bin/
total 428
drwxrwxr-x  4 jboss jboss  4096 jun 16 11:47 .
drwxrwxr-x 14 jboss jboss  4096 mai 21  2024 ..
-rwxrwxr-x  1 jboss jboss  2459 jun 23  2021 add-user.bat
-rwxrwxr-x  1 jboss jboss  2444 jun 23  2021 add-user.properties
-rwxrwxr-x  1 jboss jboss  1095 jun 23  2021 add-user.ps1
-rwxrwxr-x  1 jboss jboss  2392 jun 23  2021 add-user.sh
-rwxrwxr-x  1 jboss jboss  4011 jun 23  2021 appclient.bat
-rwxrwxr-x  1 jboss jboss  1841 jun 23  2021 appclient.conf
-rwxrwxr-x  1 jboss jboss  2464 jun 23  2021 appclient.conf.bat
-rwxrwxr-x  1 jboss jboss  2542 jun 23  2021 appclient.conf.ps1
-rwxrwxr-x  1 jboss jboss  1175 jun 23  2021 appclient.ps1
-rwxrwxr-x  1 jboss jboss  4621 jun 23  2021 appclient.sh
drwxrwxr-x  2 jboss jboss   115 jun 12  2023 client
-rwxrwxr-x  1 jboss jboss  4233 fev  8  2024 common.bat
-rwxrwxr-x  1 jboss jboss 15852 fev  8  2024 common.ps1
-rwxrwxr-x  1 jboss jboss  4036 fev  8  2024 common.sh
-rwxr-xr-x  1 jboss jboss  3148 jun 12  2023 common_start.sh
-rwxrwxr-x  1 jboss jboss  7990 fev  8  2024 domain.bat
-rwxrwxr-x  1 jboss jboss  2666 jun 23  2021 domain.conf
-rwxrwxr-x  1 jboss jboss  3387 jun 23  2021 domain.conf.bat
-rwxrwxr-x  1 jboss jboss  3111 jun 23  2021 domain.conf.ps1
-rwxrwxr-x  1 jboss jboss  4530 fev  8  2024 domain.ps1
-rwxrwxr-x  1 jboss jboss 11994 fev  8  2024 domain.sh
-rwxrwxr-x  1 jboss jboss  2438 jun 12  2023 elytron-tool.bat
-rwxrwxr-x  1 jboss jboss  1867 jun 12  2023 elytron-tool.ps1
-rwxrwxr-x  1 jboss jboss  2747 jun 12  2023 elytron-tool.sh
drwxrwxr-x  2 jboss jboss    84 jun 16 11:47 init.d
-rwxrwxr-x  1 jboss jboss  3313 jun 23  2021 jboss-cli.bat
-rwxrwxr-x  1 jboss jboss  1933 jun 23  2021 jboss-cli-logging.properties
-rwxrwxr-x  1 jboss jboss   913 jun 23  2021 jboss-cli.ps1
-rwxrwxr-x  1 jboss jboss   477 jun 23  2021 .jbossclirc
-rwxrwxr-x  1 jboss jboss  2742 jun 23  2021 jboss-cli.sh
-rwxrwxr-x  1 jboss jboss  3035 jun 23  2021 jboss-cli.xml
-rwxrwxr-x  1 jboss jboss  2829 jun 23  2021 jboss-server-migration.bat
-rwxrwxr-x  1 jboss jboss  1961 jun 12  2023 jboss-server-migration.ps1
-rwxrwxr-x  1 jboss jboss  2932 jun 23  2021 jboss-server-migration.sh
-rwxrwxr-x  1 jboss jboss  2378 jun 23  2021 jconsole.bat
-rwxrwxr-x  1 jboss jboss  1351 jun 23  2021 jconsole.ps1
-rwxrwxr-x  1 jboss jboss  2697 jun 23  2021 jconsole.sh
-rwxrwxr-x  1 jboss jboss  2217 jun 23  2021 jdr.bat
-rwxrwxr-x  1 jboss jboss   712 jun 23  2021 jdr.ps1
-rwxrwxr-x  1 jboss jboss  2172 jun 23  2021 jdr.sh
-rwxrwxr-x  1 jboss jboss 60789 mar 19  2024 launcher.jar
-rwxrwxr-x  1 jboss jboss    48 jun 23  2021 product.conf
-rwxrwxr-x  1 jboss jboss 18378 jun 12  2023 service.bat
-rwxrwxr-x  1 jboss jboss 11043 fev  8  2024 standalone.bat
-rwxrwxr-x  1 jboss jboss  4053 jun 16 11:47 standalone.conf
-rwxrwxr-x  1 jboss jboss  3381 jun 23  2021 standalone.conf.bat
-rwxrwxr-x  1 jboss jboss  3154 jun 23  2021 standalone.conf.ps1
-rwxrwxr-x  1 jboss jboss  2199 fev  8  2024 standalone.ps1
-rwxrwxr-x  1 jboss jboss 13406 fev  8  2024 standalone.sh
-rwxrwxr-x  1 jboss jboss  2311 jun 23  2021 vault.bat
-rwxrwxr-x  1 jboss jboss   725 jun 23  2021 vault.ps1
-rwxrwxr-x  1 jboss jboss  2362 jun 23  2021 vault.sh
-rwxrwxr-x  1 jboss jboss 68149 mar 19  2024 wildfly-elytron-tool.jar
-rwxrwxr-x  1 jboss jboss  2292 jun 23  2021 wsconsume.bat
-rwxrwxr-x  1 jboss jboss   801 jun 23  2021 wsconsume.ps1
-rwxrwxr-x  1 jboss jboss  2744 jun 23  2021 wsconsume.sh
-rwxrwxr-x  1 jboss jboss  2292 jun 23  2021 wsprovide.bat
-rwxrwxr-x  1 jboss jboss   801 jun 23  2021 wsprovide.ps1
-rwxrwxr-x  1 jboss jboss  2744 jun 23  2021 wsprovide.sh
[root@caddeapllx1945 opt]#
