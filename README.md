cat /etc/redhat-release
ldd --version | head -1
rpm -qa | grep -i jdk
ls -la /opt/batch/deploy/ 2>/dev/null
alternatives --display java 2>/dev/null


100
scp OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz p585600@caddeapllx1567.agil.nprd.caixa.gov.br:/tmp/

sudo su
mkdir -p /usr/lib/jvm
tar -xzf /tmp/OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz -C /usr/lib/jvm/
chown -R root:root /usr/lib/jvm/jdk-21.0.11+10
/usr/lib/jvm/jdk-21.0.11+10/bin/java -version






-sh-4.2$ ldd --version | head -1
ldd (GNU libc) 2.17
-sh-4.2$ rpm -qa | grep -i jdk
jdk1.8-1.8.0_221-fcs.x86_64
-sh-4.2$ ls -la /opt/batch/deploy/ 2>/dev/null
total 94428
drwxr-xr-x. 2 root     root           29 Mar 26 10:15 .
drwxr-xr-x. 5 root     root           53 Ago 15  2023 ..
-rw-------. 1 ctmagelx controlm 96691079 Mar 26 10:15 sirsa-batch.jar
-sh-4.2$ alternatives --display java 2>/dev/null
java - o status está automático.
 a ligação aponta atualmente para /usr/java/jdk1.8.0_221-amd64/jre/bin/java
/usr/java/jdk1.8.0_221-amd64/jre/bin/java - priority 180221
 ControlPanel escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/ControlPanel
 javaws escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/javaws
 jcontrol escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/jcontrol
 jjs escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/jjs
 keytool escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/keytool
 orbd escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/orbd
 pack200 escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/pack200
 policytool escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/policytool
 rmid escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/rmid
 rmiregistry escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/rmiregistry
 servertool escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/servertool
 tnameserv escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/tnameserv
 unpack200 escravo: /usr/java/jdk1.8.0_221-amd64/jre/bin/unpack200
 java.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/java.1
 javaws.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/javaws.1
 jjs.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/jjs.1
 keytool.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/keytool.1
 orbd.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/orbd.1
 pack200.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/pack200.1
 policytool.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/policytool.1
 rmid.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/rmid.1
 rmiregistry.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/rmiregistry.1
 servertool.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/servertool.1
 tnameserv.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/tnameserv.1
 unpack200.1 escravo: /usr/java/jdk1.8.0_221-amd64/man/man1/unpack200.1
A "melhor" versão atual é /usr/java/jdk1.8.0_221-amd64/jre/bin/java.
-sh-4.2$

