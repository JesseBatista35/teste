
sh-4.4$ find / -maxdepth 4 -iname "*entrypoint*" 2>/dev/null
sh-4.4$ find / -maxdepth 4 -iname "*start*.sh" 2>/dev/null
sh-4.4$ ls -la /deployments/
total 55264
drwxrwxr-x. 1 1001 root       42 Sep 16 16:55 .
dr-xr-xr-x. 1 root root       36 Sep 16 16:55 ..
-rw-r--r--. 1 root root      460 Sep 16 16:54 cfd_publickey.pem
drwxr-xr-x. 2 root root       67 Sep 16 16:55 lib
-rw-r--r--. 1 1001 root 29769698 Sep  3 11:01 monitora-0.0.1-SNAPSHOT.jar
-rw-r--r--. 1 1001 root 26795156 Sep  3 11:01 monitora-20260903-1100-0-0-1-SNAPSHOT.zip
-r-xr-----. 1 1001 root    20218 Mar  2  2022 run-java.sh
sh-4.4$
