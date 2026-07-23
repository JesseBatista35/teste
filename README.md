




-sh-4.2$ ls -la /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz
-rw-r--r--. 1 p585600 usucef 207513939 Jul 23 15:14 /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz
-sh-4.2$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# mkdir -p /usr/java
[root@caddeapllx1567 p585600]# tar -xzf /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz -C /usr/java/
[root@caddeapllx1567 p585600]# chown -R root:root /usr/java/jdk-21.0.11+10
[root@caddeapllx1567 p585600]# ls -la /usr/java/
total 0
drwxr-xr-x.  4 root root  83 Jul 23 15:15 .
drwxr-xr-x. 14 root root 167 Jun  2  2021 ..
lrwxrwxrwx.  1 root root  16 Jun  2  2021 default -> /usr/java/latest
drwxr-xr-x.  8 root root 258 Jun  2  2021 jdk1.8.0_221-amd64
drwxr-xr-x.  9 root root 121 Abr 22 10:33 jdk-21.0.11+10
lrwxrwxrwx.  1 root root  28 Jun  2  2021 latest -> /usr/java/jdk1.8.0_221-amd64
[root@caddeapllx1567 p585600]# /usr/java/jdk-21.0.11+10/bin/java -version
openjdk version "21.0.11" 2026-04-21 LTS
OpenJDK Runtime Environment Temurin-21.0.11+10 (build 21.0.11+10-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.11+10 (build 21.0.11+10-LTS, mixed mode, sharing)
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
