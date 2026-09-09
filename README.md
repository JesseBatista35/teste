
sh-4.2$
sh-4.2$ exit
exit
command terminated with exit code 1
-sh-4.2$ oc cp /tmp/cert-2.pem siali-des/siali-des-194-wrs24:/tmp/cert-2.pem
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cp /tmp/cert-3.pem siali-des/siali-des-194-wrs24:/tmp/cert-3.pem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siali-des-194-wrs24
sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$ keytool -cacerts -importcert -alias ac_icptestes_sub -file /tmp/cert-2.pem -storepass changeit -noprompt
Certificate was added to keystore
keytool error: java.io.FileNotFoundException: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/lib/security/cacerts (Permission denied)
sh-4.2$ keytool -cacerts -importcert -alias ac_icptestes_raiz -file /tmp/cert-3.pem -storepass changeit -noprompt
Certificate was added to keystore
keytool error: java.io.FileNotFoundException: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/lib/security/cacerts (Permission denied)
sh-4.2$
