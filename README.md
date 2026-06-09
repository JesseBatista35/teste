[root@sbrdeapllx099 bin]# find /opt/jboss -name "*dom4j*.jar" 2>/dev/null
/opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/dom4j-1.6.1.redhat-7.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/dom4j/main/dom4j-2.1.1.redhat-00001.jar
[root@sbrdeapllx099 bin]# ^C
[root@sbrdeapllx099 bin]# rm -f /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/dom4j-1.6.1.redhat-7.jar
[root@sbrdeapllx099 bin]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/dom4j/main/
total 4
drwxrwxr-x 2 jboss jboss   23 Jun  9 14:39 .
drwxrwxr-x 3 jboss jboss   17 Jan  3  2018 ..
-rwxrwxr-x 1 jboss jboss 1511 Jan  3  2018 module.xml
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# find /opt/jboss -name "*dom4j*.jar" 2>/dev/null
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/dom4j/main/dom4j-2.1.1.redhat-00001.jar
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# kill -TERM 26176
bash: kill: (26176) - Processo inexistente
[root@sbrdeapllx099 bin]#
