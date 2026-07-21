[root@caddeapllx1369 p585600]# /usr/lib/jvm/jdk-17.0.19+10/bin/java -version
openjdk version "17.0.19" 2026-04-21
OpenJDK Runtime Environment Temurin-17.0.19+10 (build 17.0.19+10)
OpenJDK 64-Bit Server VM Temurin-17.0.19+10 (build 17.0.19+10, mixed mode, sharing)
[root@caddeapllx1369 p585600]# alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-17.0.19+10/bin/java 2
[root@caddeapllx1369 p585600]# alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-17.0.19+10/bin/javac 2
[root@caddeapllx1369 p585600]# alternatives --display java
java - o status está automático.
 a ligação aponta atualmente para /usr/lib/jvm/jdk-17.0.19+10/bin/java
/usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/java - family java-11-openjdk.x86_64 priority 1
 alt-java escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/alt-java
 jjs escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/jjs
 keytool escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/keytool
 pack200 escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/pack200
 rmid escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/rmid
 rmiregistry escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/rmiregistry
 unpack200 escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/unpack200
 jre escravo: /usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64
 alt-java.1.gz escravo: /usr/share/man/man1/alt-java-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 java.1.gz escravo: /usr/share/man/man1/java-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 jjs.1.gz escravo: /usr/share/man/man1/jjs-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 keytool.1.gz escravo: /usr/share/man/man1/keytool-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 pack200.1.gz escravo: /usr/share/man/man1/pack200-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 rmid.1.gz escravo: /usr/share/man/man1/rmid-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 rmiregistry.1.gz escravo: /usr/share/man/man1/rmiregistry-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
 unpack200.1.gz escravo: /usr/share/man/man1/unpack200-java-11-openjdk-11.0.8.10-1.el7.x86_64.1.gz
/usr/lib/jvm/jdk-17.0.19+10/bin/java - priority 2
 alt-java escravo: (null)
 jjs escravo: (null)
 keytool escravo: (null)
 pack200 escravo: (null)
 rmid escravo: (null)
 rmiregistry escravo: (null)
 unpack200 escravo: (null)
 jre escravo: (null)
 alt-java.1.gz escravo: (null)
 java.1.gz escravo: (null)
 jjs.1.gz escravo: (null)
 keytool.1.gz escravo: (null)
 pack200.1.gz escravo: (null)
 rmid.1.gz escravo: (null)
 rmiregistry.1.gz escravo: (null)
 unpack200.1.gz escravo: (null)
A "melhor" versão atual é /usr/lib/jvm/jdk-17.0.19+10/bin/java.
[root@caddeapllx1369 p585600]#
