
sh-4.4$
sh-4.4$ oc rsh -c siabm-autenticacao-api-des <nome-do-pod> -n siabm-des
sh: nome-do-pod: No such file or directory
sh-4.4$ echo $JAVA_HOME
/usr/java/latest
sh-4.4$ ls -la $JAVA_HOME/jre/lib/ext/ 2>&1 || ls -la $JAVA_HOME/lib/ext/ 2>&1
total 17460
drwxr-xr-x. 1 root root      61 Jul 19  2024 .
drwxr-xr-x. 1 root root      33 Jul 19  2024 ..
-rw-r--r--. 1 root root 3866714 Jun  9  2021 cldrdata.jar
-rw-r--r--. 1 root root    8792 Jun  9  2021 dnsns.jar
-rw-r--r--. 1 root root   44623 Jun  9  2021 jaccess.jar
-rw-r--r--. 1 root root 8729154 Jun  9  2021 jfxrt.jar
-rw-r--r--. 1 root root 2246522 Jul 19  2024 localedata.jar
-rw-r--r--. 1 root root    1269 Jun  9  2021 meta-index
-rw-r--r--. 1 root root 2016757 Jun  9  2021 nashorn.jar
-rw-r--r--. 1 root root  172746 Jul 19  2024 ndjca-4.10.2.jar
-rw-r--r--. 1 root root   43004 Jun  9  2021 sunec.jar
-rw-r--r--. 1 root root  288113 Jun  9  2021 sunjce_provider.jar
-rw-r--r--. 1 root root  285500 Jun  9  2021 sunpkcs11.jar
-rw-r--r--. 1 root root   70454 Jul 19  2024 tacndjavalib-4.10.2.jar
-rw-r--r--. 1 root root   69828 Jun  9  2021 zipfs.jar
sh-4.4$

