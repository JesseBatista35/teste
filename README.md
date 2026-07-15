sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-201-vqr9x
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ echo $JAVA_HOME
/usr/java/latest
sh-4.4$
sh-4.4$
sh-4.4$ ls -la $JAVA_HOME/jre/lib/ext/
total 17460
drwxr-xr-x. 1 root root      61 Aug  7  2024 .
drwxr-xr-x. 1 root root      33 Aug  7  2024 ..
-rw-r--r--. 1 root root 3866714 Jun  9  2021 cldrdata.jar
-rw-r--r--. 1 root root    8792 Jun  9  2021 dnsns.jar
-rw-r--r--. 1 root root   44623 Jun  9  2021 jaccess.jar
-rw-r--r--. 1 root root 8729154 Jun  9  2021 jfxrt.jar
-rw-r--r--. 1 root root 2246522 Aug  7  2024 localedata.jar
-rw-r--r--. 1 root root    1269 Jun  9  2021 meta-index
-rw-r--r--. 1 root root 2016757 Jun  9  2021 nashorn.jar
-rw-r--r--. 1 root root  172746 Aug  7  2024 ndjca-4.10.2.jar
-rw-r--r--. 1 root root   43004 Jun  9  2021 sunec.jar
-rw-r--r--. 1 root root  288113 Jun  9  2021 sunjce_provider.jar
-rw-r--r--. 1 root root  285500 Jun  9  2021 sunpkcs11.jar
-rw-r--r--. 1 root root   70454 Aug  7  2024 tacndjavalib-4.10.2.jar
-rw-r--r--. 1 root root   69828 Jun  9  2021 zipfs.jar
sh-4.4$ find / -iname "*dinamo*" 2>/dev/null
/opt/jboss-eap-7.4/standalone/tmp/vfs/temp/temp3df9711d96f57cfa/content-5d914e17e0160f3d/WEB-INF/classes/br/gov/caixa/common/infra/ApiDinamoAdapter.class
/opt/jboss-eap-7.4/standalone/tmp/vfs/temp/temp3df9711d96f57cfa/content-5d914e17e0160f3d/WEB-INF/lib/dinamo-hsm-4.10.2.jar
/opt/jboss-eap-7.4/standalone/tmp/vfs/deployment/deploymentd47e81a24e7b0cb3/dinamo-hsm-4.10.2.jar-f28af1f926878b47
/opt/jboss-eap-7.4/standalone/tmp/vfs/deployment/deploymentd47e81a24e7b0cb3/dinamo-hsm-4.10.2.jar-f28af1f926878b47/dinamo-hsm-4.10.2.jar
/opt/dinamo
/home/jboss/DinamoJCA.log
/usr/include/dinamo.h
/usr/lib64/libdinamo.so
/usr/lib64/libdinamo.so.4.10.2.0
sh-4.4$ find / -iname "*ndjca*" 2>/dev/null
/opt/dinamo/ndjca-4.10.2.jar
/usr/java/jdk1.8.0_301-amd64/jre/lib/ext/ndjca-4.10.2.jar
sh-4.4$ find / -iname "*trueaccess*" 2>/dev/null
sh-4.4$
