
[root@caddeapllx1945 /]# pkill -9 java
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# chown -R jboss:jboss /opt/jboss-eap/standalone
[root@caddeapllx1945 /]# chmod -R 755 /opt/jboss-eap/standalone
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]#
[root@caddeapllx1945 /]# ls -la /opt/jboss-eap/standalone/ | head -20
total 8
drwxr-xr-x  8 jboss jboss   91 jun 16 11:47 .
drwxrwxr-x 14 jboss jboss 4096 mai 21  2024 ..
drwxr-xr-x  6 jboss jboss 4096 jun 16 11:47 configuration
drwxr-xr-x  7 jboss jboss  100 jun 12  2023 data
drwxr-xr-x  2 jboss jboss  195 jun 16 14:25 deployments
drwxr-xr-x  3 jboss jboss   17 jun 12  2023 lib
drwxr-xr-x  2 jboss jboss   94 jun 16 14:25 log
drwxr-xr-x  4 jboss jboss   29 jun 16 11:51 tmp
[root@caddeapllx1945 /]#
