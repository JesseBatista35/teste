[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/
total 328
drwxrwxr-x 2 jboss jboss     73 Mar 27  2015 .
drwxrwxr-x 3 jboss jboss     18 Mar 27  2015 ..
-rw-r--r-- 1 jboss jboss 330241 Fev  4  2026 jboss-logmanager-1.5.4.Final-redhat-1.jar
-rwxrwxr-x 1 jboss jboss   1491 Mar 27  2015 module.xml
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# find /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/ -name "*.jar" -exec ls -la {} \;
-rw-r--r-- 1 jboss jboss 330241 Fev  4  2026 /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
Archive:  /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
  End-of-central-directory signature not found.  Either this file is not
  a zipfile, or it constitutes one disk of a multi-part archive.  In the
  latter case the central directory and zipfile comment will be found on
  the last disk(s) of this archive.
unzip:  cannot find zipfile directory in one of /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar or
        /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.zip, and cannot find /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.ZIP, period.
[root@sbrdeapllx104 servers]#
