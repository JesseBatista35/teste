
-sh-4.2$ ls -la /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
-rw-r--r-- 1 p585600 usucef 193335385 Jul 21 16:15 /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# mkdir -p /usr/lib/jvm
[root@caddeapllx1369 p585600]# tar -xzf /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz -C /usr/lib/jvm/
[root@caddeapllx1369 p585600]# ls -la /usr/lib/jvm/
total 4
drwxr-xr-x.  4 root root  255 Jul 21 16:16 .
dr-xr-xr-x. 41 root root 4096 Dez 21  2023 ..
lrwxrwxrwx.  1 root root   26 Out 20  2022 java -> /etc/alternatives/java_sdk
lrwxrwxrwx.  1 root root   29 Out 20  2022 java-11 -> /etc/alternatives/java_sdk_11
lrwxrwxrwx.  1 root root   37 Out 20  2022 java-11-openjdk -> /etc/alternatives/java_sdk_11_openjdk
drwxr-xr-x.  8 root root   97 Out 20  2022 java-11-openjdk-11.0.8.10-1.el7.x86_64
lrwxrwxrwx.  1 root root   34 Out 20  2022 java-openjdk -> /etc/alternatives/java_sdk_openjdk
drwxr-xr-x   9 root root  121 Abr 21 18:31 jdk-17.0.19+10
lrwxrwxrwx.  1 root root   21 Out 20  2022 jre -> /etc/alternatives/jre
lrwxrwxrwx.  1 root root   24 Out 20  2022 jre-11 -> /etc/alternatives/jre_11
lrwxrwxrwx.  1 root root   32 Out 20  2022 jre-11-openjdk -> /etc/alternatives/jre_11_openjdk
lrwxrwxrwx.  1 root root   38 Out 20  2022 jre-11-openjdk-11.0.8.10-1.el7.x86_64 -> java-11-openjdk-11.0.8.10-1.el7.x86_64
lrwxrwxrwx.  1 root root   29 Out 20  2022 jre-openjdk -> /etc/alternatives/jre_openjdk
[root@caddeapllx1369 p585600]#
