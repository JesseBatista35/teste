
drwxr-xr-x 3 root root 18 Mar 13 10:25 layers
-sh-4.2$ cd layers/
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 18 Mar 13 10:25 .
drwxr-xr-x 3 root root 20 Mar 13 10:25 ..
drwxr-xr-x 3 root root 17 Mar 13 10:25 base
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 18 Mar 13 10:25 .
drwxr-xr-x 3 root root 20 Mar 13 10:25 ..
drwxr-xr-x 3 root root 17 Mar 13 10:25 base
-sh-4.2$ ls
base
-sh-4.2$ cd base
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 17 Mar 13 10:25 .
drwxr-xr-x 3 root root 18 Mar 13 10:25 ..
drwxr-xr-x 3 root root 21 Mar 13 10:25 org
-sh-4.2$ cd org
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 21 Mar 13 10:25 .
drwxr-xr-x 3 root root 17 Mar 13 10:25 ..
drwxr-xr-x 3 root root 23 Mar 13 10:25 wildfly
-sh-4.2$ pwd
/opt/jboss-eap/modules/system/layers/base/org
-sh-4.2$ cd wildfly/
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root root 23 Mar 13 10:25 .
drwxr-xr-x 3 root root 21 Mar 13 10:25 ..
drwxr-xr-x 3 root root 33 Mar 13 10:25 extension
-sh-4.2$ cd extension/
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 root  root  33 Mar 13 10:25 .
drwxr-xr-x 3 root  root  23 Mar 13 10:25 ..
drwxr-xr-x 3 jboss jboss 18 Mar 13 10:25 elytron-oidc-client
-sh-4.2$ cd elytron-oidc-client/
-sh-4.2$ ls -la
total 0
drwxr-xr-x 3 jboss jboss 18 Mar 13 10:25 .
drwxr-xr-x 3 root  root  33 Mar 13 10:25 ..
drwxr-xr-x 2 jboss jboss 86 Mar 13 11:16 main
-sh-4.2$ cd main
-sh-4.2$ ls -la
total 72
drwxr-xr-x 2 jboss jboss    86 Mar 13 11:16 .
drwxr-xr-x 3 jboss jboss    18 Mar 13 10:25 ..
-rw-r--r-- 1 jboss jboss  1698 Mar 13 11:16 module.xml
-rw-r--r-- 1 jboss jboss 66969 Mar 13 11:16 wildfly-elytron-oidc-client-subsystem-26.1.0.Final.jar
-sh-4.2$
