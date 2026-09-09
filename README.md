
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siali-des-194-wrs24
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ find / -name cacerts 2>/dev/null
/etc/pki/ca-trust/extracted/java/cacerts
/etc/pki/java/cacerts
/usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/lib/security/cacerts

sh-4.2$
sh-4.2$ find / -name cacerts 2>/dev/null
/etc/pki/ca-trust/extracted/java/cacerts
/etc/pki/java/cacerts
/usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/lib/security/cacerts
sh-4.2$
sh-4.2$
sh-4.2$ keytool -list -keystore <caminho_encontrado>/cacerts -storepass changeit | grep -i icptestes
sh: caminho_encontrado: No such file or directory
sh-4.2$
sh-4.2$
sh-4.2$ keytool -list -keystore /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/lib/security/cacerts -storepass changeit | grep -i icptestes
Warning: use -cacerts option to access cacerts keystore
sh-4.2$
sh-4.2$
sh-4.2$
