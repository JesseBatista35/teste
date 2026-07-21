
[root@caddeapllx1369 p585600]# cd /opt/batch/deploy
[root@caddeapllx1369 deploy]# ls -la
total 94428
drwxr-xr-x 2 root     root           29 Jul 17 09:55 .
drwxr-xr-x 5 root     root           53 Nov 29  2022 ..
-rwxr-xr-x 1 ctmagelx controlm 96691079 Jul 17 09:55 sirsa-batch.jar
[root@caddeapllx1369 deploy]# java -jar sirsa-batch.jar --spring.profiles.active=des
Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/sirsa/springbatch/SpringBatchApplication has been compiled by a more recent version of the Java Runtime (class file version 65.0), this version of the Java Runtime only recognizes class file versions up to 61.0
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
        at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
        at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
        at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
        at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
        at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:592)
        at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
        at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:469)
        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:99)
        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
        at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
[root@caddeapllx1369 deploy]#
[root@caddeapllx1369 deploy]#
[root@caddeapllx1369 deploy]#
