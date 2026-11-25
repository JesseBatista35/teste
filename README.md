
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ wc -l /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
657 /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ grep -c 'security-realm' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
12
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ grep -c 'urn:jboss:domain:keycloak' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
0
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ls -l /opt/jboss-eap/standalone/configuration/ /opt/jboss-eap/standalone/deployments/
/opt/jboss-eap/standalone/configuration/:
total 212
-rwxrwxr-x 1 jboss jboss   711 jun 23  2021 application-roles.properties
-rwxrwxr-x 1 jboss jboss   935 jun 23  2021 application-users.properties
-rw------- 1 jboss jboss 39055 nov 25 11:59 caixa-truststore-acteste-nprd.jks
-rwxrwxr-x 1 jboss jboss  1705 set 30  2024 logging.properties
-rwxrwxr-x 1 jboss jboss   669 jun 23  2021 mgmt-groups.properties
-rwxrwxr-x 1 jboss jboss  1111 jun 12  2023 mgmt-users.properties
-rwxrwxr-x 1 jboss jboss 37803 jun 12  2023 standalone-full-ha.xml
-rwxrwxr-x 1 jboss jboss 33377 jun 12  2023 standalone-full.xml
-rwxrwxr-x 1 jboss jboss 34165 jun 12  2023 standalone-ha.xml
-rwxrwxr-x 1 jboss jboss  7014 jun 23  2021 standalone-load-balancer.xml
-rwxrwxr-x 1 jboss jboss 29987 jun 12  2023 standalone.xml
drwxrwxr-x 4 jboss jboss   229 set 30  2024 standalone_xml_history

/opt/jboss-eap/standalone/deployments/:
total 114532
-rwxrw-rw- 1 jboss jboss 117261762 nov 25 12:00 gec-ear.ear
-rw-r--r-- 1 jboss jboss        57 nov 25 12:03 gec-ear.ear.failed
-rwxrwxr-x 1 jboss jboss      8888 jun 23  2021 README.txt
[p585600@caddeapllx2871 ~]$
