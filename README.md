
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# cat /proc/mounts | grep jboss_modules64
10.116.95.13:/export/jboss_modules64 /opt/jboss/jboss-eap/modules nfs4 rw,relatime,vers=4.1,rsize=262144,wsize=262144,namlen=255,hard,proto=tcp,timeo=600,retrans=2,sec=sys,clientaddr=10.116.94.211,local_lock=none,addr=10.116.95.13 0 0
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# find /opt/jboss/jboss-eap/modules_bkp -iname "jboss-common-beans*.jar"
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/org/jboss/common-beans/main/jboss-common-beans-2.0.0.Final-redhat-1.jar
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# unzip -t /caminho/encontrado/jboss-common-beans-1.1.0.Final-redhat-2.jar
unzip:  cannot find or open /caminho/encontrado/jboss-common-beans-1.1.0.Final-redhat-2.jar, /caminho/encontrado/jboss-common-beans-1.1.0.Final-redhat-2.jar.zip or /caminho/encontrado/jboss-common-beans-1.1.0.Final-redhat-2.jar.ZIP.
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/
total 68
drwxrwxr-x 2 jboss jboss    75 Mar 27  2015 .
drwxrwxr-x 3 jboss jboss    18 Mar 27  2015 ..
-rwxrwxr-x 1 jboss jboss 63849 Fev  4  2026 jboss-common-beans-1.1.0.Final-redhat-2.jar
-rwxrwxr-x 1 jboss jboss  1402 Mar 27  2015 module.xml
[root@sbrdeapllx104 servers]# cp /opt/jboss/jboss-eap/modules_bkp/.../jboss-common-beans-1.1.0.Final-redhat-2.jar /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/
cp: impossível obter estado de “/opt/jboss/jboss-eap/modules_bkp/.../jboss-common-beans-1.1.0.Final-redhat-2.jar”: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 servers]# chown jboss:jboss /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/jboss-common-beans-1.1.0.Final-redhat-2.jar
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
