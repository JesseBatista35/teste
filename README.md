root@caddeapllx2484 tmp]# ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
ls: não é possível acessar /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties: Arquivo ou diretório não encontrado
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# cd /opt/jboss-eap/standalone/configuration/
[root@caddeapllx2484 configuration]# ls -lth
total 208K
drwxrwxr-x 4 jboss jboss  229 Ago 12 13:58 standalone_xml_history
-rwxrwxr-x 1 jboss jboss 1,4K Ago 12 13:58 logging.properties
-rwxrwxr-x 1 jboss jboss  34K Ago 12 13:58 standalone-full-ha.xml
-rw------- 1 jboss jboss  39K Jul 30 16:42 caixa-truststore-acteste-nprd.jks
-rwxrwxr-x 1 jboss jboss 1,1K Jan  6  2023 mgmt-users.properties
-rwxrwxr-x 1 jboss jboss  33K Jan  6  2023 standalone-full.xml
-rwxrwxr-x 1 jboss jboss  34K Jan  6  2023 standalone-ha.xml
-rwxrwxr-x 1 jboss jboss  30K Jan  6  2023 standalone.xml
-rwxrwxr-x 1 jboss jboss 6,9K Jun 23  2021 standalone-load-balancer.xml
-rwxrwxr-x 1 jboss jboss  711 Jun 23  2021 application-roles.properties
-rwxrwxr-x 1 jboss jboss  935 Jun 23  2021 application-users.properties
-rwxrwxr-x 1 jboss jboss  669 Jun 23  2021 mgmt-groups.properties
[root@caddeapllx2484 configuration]# cd /opt/jboss/
bash: cd: /opt/jboss/: Arquivo ou diretório não encontrado
[root@caddeapllx2484 configuration]# cd /opt/jboss
bash: cd: /opt/jboss: Arquivo ou diretório não encontrado
[root@caddeapllx2484 configuration]# cd /opt/jboss-eap/
[root@caddeapllx2484 jboss-eap]# ls -la
total 528
drwxrwxr-x  14 jboss jboss    317 Jun 21  2023 .
drwxr-xr-x.  8 root  root     110 Jun 21  2023 ..
drwxrwxr-x   3 jboss jboss     27 Jan  6  2023 appclient
drwxrwxr-x   4 jboss jboss   4096 Jul 30 16:43 bin
drwxrwxr-x   5 jboss jboss     52 Jan  6  2023 docs
drwxrwxr-x   4 jboss jboss     38 Jan  6  2023 domain
drwxrwxr-x   2 jboss jboss     33 Jan  6  2023 installation
drwxrwxr-x   4 jboss jboss     57 Jan  6  2023 .installation
-rwxrwxr-x   1 jboss jboss    419 Jun 23  2021 JBossEULA.txt
-rwxrwxr-x   1 jboss jboss 495495 Jan  6  2023 jboss-modules.jar
-rwxrwxr-x   1 jboss jboss  26530 Jun 23  2021 LICENSE.txt
drwxrwxr-x   3 jboss jboss     44 Jan  6  2023 migration
drwxrwxr-x   3 jboss jboss     20 Jan  6  2023 modules
-rwxrwxr-x   1 jboss jboss   3083 Jan  6  2023 myinstall.xml
drwxrwxr-x   8 jboss jboss     91 Jul 30 16:43 standalone
drwxrwxr-x   2 jboss jboss     29 Jan  6  2023 uninstaller
-rwxrwxr-x   1 jboss jboss     65 Jan  6  2023 version.txt
drwxrwxr-x   4 jboss jboss    158 Jan  6  2023 welcome-content
drwxrwxr-x   3 jboss jboss     28 Jan  6  2023 .well-known
[root@caddeapllx2484 jboss-eap]# cd standalone/
[root@caddeapllx2484 standalone]# ls -la
total 4
drwxrwxr-x  8 jboss jboss   91 Jul 30 16:43 .
drwxrwxr-x 14 jboss jboss  317 Jun 21  2023 ..
drwxrwxr-x  3 jboss jboss 4096 Ago 12 13:58 configuration
drwxrwxr-x  8 jboss jboss  118 Jul 30 16:44 data
drwxrwxr-x  2 jboss jboss  260 Ago 12 13:58 deployments
drwxrwxr-x  3 jboss jboss   17 Jan  6  2023 lib
drwxr-xr-x  2 root  root    23 Jul 30 16:43 log
drwxrwxr-x  5 jboss jboss  118 Ago 12 13:58 tmp
[root@caddeapllx2484 standalone]# cd deployments/
[root@caddeapllx2484 deployments]# ls -lth
total 69M
-rwxrw-rw- 1 jboss jboss  22M Ago  7 09:51 SICMU-ear.ear
-rw-r--r-- 1 jboss jboss   13 Ago  7 09:51 SICMU-ear.ear.deployed
-rw-r--r-- 1 jboss jboss  36M Jul 30 16:42 applicationinsights-agent.jar
-rw-r--r-- 1 jboss jboss   29 Jul 30 16:42 applicationinsights-agent.jar.deployed
-rw-r--r-- 1 jboss jboss  66K Jul 30 16:42 framework.jar
-rw-r--r-- 1 jboss jboss   13 Jul 30 16:42 framework.jar.deployed
-rw-r--r-- 1 jboss jboss  12M Jul 30 16:42 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss   13 Jul 30 16:42 wmq.jmsra.rar.deployed
-rwxrwxr-x 1 jboss jboss 8,7K Jun 23  2021 README.txt
[root@caddeapllx2484 deployments]#
