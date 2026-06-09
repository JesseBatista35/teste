
[root@sbrdeapllx099 bin]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/
total 352
drwxrwxr-x 2 jboss jboss     54 Jun  9 15:25 .
drwxrwxr-x 3 jboss jboss     17 Jan  3  2018 ..
-rwxr-xr-x 1 root  root  352768 Jun  9 15:25 dom4j-1.6.1.redhat-7.jar
-rwxrwxr-x 1 jboss jboss   1511 Jan  3  2018 module.xml
[root@sbrdeapllx099 bin]# find /opt/jboss -name "dom4j-2.1.1*" -type f 2>/dev/null
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/dom4j/main/dom4j-2.1.1.redhat-00001.jar
[root@sbrdeapllx099 bin]# cp /result-do-find-acima /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/
cp: impossível obter estado de “/result-do-find-acima”: Arquivo ou diretório não encontrado
[root@sbrdeapllx099 bin]#
