
[root@caddeapllx1369 deploy]# alternatives --remove keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 2>/dev/null
[root@caddeapllx1369 deploy]#
[root@caddeapllx1369 deploy]#
[root@caddeapllx1369 deploy]#
[root@caddeapllx1369 deploy]# alternatives --install /usr/bin/keytool keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 3
[root@caddeapllx1369 deploy]# alternatives --display keytool
keytool - o status está automático.
 a ligação aponta atualmente para /usr/lib/jvm/jdk-21.0.11+10/bin/keytool
/usr/lib/jvm/jdk-17.0.19+10/bin/keytool - priority 2
/usr/lib/jvm/jdk-21.0.11+10/bin/keytool - priority 3
A "melhor" versão atual é /usr/lib/jvm/jdk-21.0.11+10/bin/keytool.
[root@caddeapllx1369 deploy]#
