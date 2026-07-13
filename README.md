[p585600@scttqapllx0032 opt]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 opt]$ sudo
usage: sudo [-D level] -h | -K | -k | -V
usage: sudo -v [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid]
usage: sudo -l[l] [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-U user name] [-u user name|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] file ...
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 opt]$ cd ..
[p585600@scttqapllx0032 /]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ history
    1  ps -ef | grep sismh
    2  sudo su
    3  sudo -i
    4  cd /opt/etc/init.d/jboss-master
    5  ps -ef | grep jboss
    6  Favor alterar os parâmetros da etapa Publica no Nexus na esteira do projeto sisag-documento-digital-lib, seguindo a configuração do projeto sisag-spring-util.
    7
    8  EXEMPLO:
    9  mvn deploy:deploy-file
   10  -Dversion.app=1.12.0.0
   11  -DgroupId=br.gov.caixa.sisag
   12  -DartifactId=sisag-spring-util
   13  -Dversion=1.12.0.0
   14  -Dpackaging=jar
   15  -Dfile=./target/sisag-spring-util-1.12.0.0.jar
   16  -DrepositoryId=NEXUS_INTERNO
   17  -DgeneratePom=true
   18  -Durl=http://binario.caixa:8081/repository/releases
   19
   20  ------------------------------------------------------
   21
   22  COMO ESTÁ:
   23  mvn deploy:deploy-file
   24  -DgroupId=br.gov.caixa.sisag
   25  -DartifactId=documento-digital-lib
   26  -Dversion=1.0.0.0
   27  -Dpackaging=zip
   28  -Dfile=documento-digital-lib-1-0-0-0.zip
   29  -DrepositoryId=NEXUS_INTERNO
   30  -DgeneratePom=true
   31  -Durl=http://binario.caixa:8081/repository/releases
   32
   33  systctl -a | grep -i jboss
   34  systemctl -a | grep -i jboss
   35  ps -ef | grep log
   36  cd /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone
   37  ls -ltrh
   38  cd log/
   39  ls -ltrh
   40  tail -100f server.log
   41  pwd
   42  cd /logs
   43  pwd
   44  cd /opt/
   45  ls -la
   46  sudo su
   47  sudo
   48  sudo su
   49  cd ..
   50  sudo su
   51  history
[p585600@scttqapllx0032 /]$ ^C
[p585600@scttqapllx0032 /]$ systemctl -a | grep -i jboss
-bash: systemctl: comando não encontrado
[p585600@scttqapllx0032 /]$ ps -ef | grep -i jboss
p585600   13288  13248  0 12:08 pts/2    00:00:00 grep -i jboss
root      99445      1  0 Jun15 ?        00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss     99448  99445  0 Jun15 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss     99496  99448  0 Jun15 ?        00:57:00 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ ps -ef | grep log
root       1925      1  0 Feb05 ?        00:00:05 /sbin/rsyslogd -i /var/run/syslogd.pid -c 5
root       2506      1  0 Feb05 ?        00:00:00 /usr/sbin/mcelog --daemon
postgres   2728   2726  0 Feb05 ?        00:00:00 postgres: logger process
p585600   13293  13248  0 12:08 pts/2    00:00:00 grep log
jboss     99496  99448  0 Jun15 ?        00:57:00 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
[p585600@scttqapllx0032 /]$ tail -100f server.log
tail: não foi possível abrir "server.log" para leitura: Arquivo ou diretório não encontrado
tail: nenhum aquivo restante
[p585600@scttqapllx0032 /]$ systemctl restart jboss
-bash: systemctl: comando não encontrado
[p585600@scttqapllx0032 /]$ systemctl -a | grep -i jboss
-bash: systemctl: comando não encontrado
[p585600@scttqapllx0032 /]$ sudo systemctl -a | grep jboss
sudo: systemctl: command not found
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ hystory | grep start
-bash: hystory: comando não encontrado
[p585600@scttqapllx0032 /]$ history | grep start
   56  systemctl restart jboss
   59  hystory | grep start
   60  history | grep start
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ ps -ef | grep jboss
p585600   13323  13248  0 12:11 pts/2    00:00:00 grep jboss
root      99445      1  0 Jun15 ?        00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss     99448  99445  0 Jun15 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss     99496  99448  0 Jun15 ?        00:57:01 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
[p585600@scttqapllx0032 /]$ tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
12:10:12,091 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:11:12,077 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:12:13,485 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:13:12,053 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space

12:14:12,076 WARN  [net.bull.javamelody] (javamelody sismh) exception while collecting data: java.lang.OutOfMemoryError: PermGen space: java.lang.OutOfMemoryError: PermGen space




^C
[p585600@scttqapllx0032 /]$ ps -ef | grep -i jboss cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
grep: cat: Arquivo ou diretório não encontrado
[p585600@scttqapllx0032 /]$ ls -l /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log
total 150128
-rwxr-xr-x. 1 jboss jboss      6621 Jun 15 11:41 boot.log
-rw-rw-r--. 1 jboss jboss    514578 Jul 13 12:14 server.log
-rwxr-xr-x. 1 jboss jboss   4870522 Jun  9 23:01 server.log.2026-06-09
-rwxr-xr-x. 1 jboss jboss   3091542 Jun 10 23:01 server.log.2026-06-10
-rwxr-xr-x. 1 jboss jboss   2656767 Jun 11 23:01 server.log.2026-06-11
-rwxr-xr-x. 1 jboss jboss   3178061 Jun 12 23:01 server.log.2026-06-12
-rwxr-xr-x. 1 jboss jboss     45355 Jun 13 23:01 server.log.2026-06-13
-rwxr-xr-x. 1 jboss jboss     45400 Jun 14 23:01 server.log.2026-06-14
-rwxr-xr-x. 1 jboss jboss   1690037 Jun 15 23:41 server.log.2026-06-15
-rw-rw-r--. 1 jboss jboss    435126 Jun 16 23:41 server.log.2026-06-16
-rw-rw-r--. 1 jboss jboss   1505660 Jun 17 23:41 server.log.2026-06-17
-rw-rw-r--. 1 jboss jboss    478703 Jun 18 23:41 server.log.2026-06-18
-rw-rw-r--. 1 jboss jboss    213036 Jun 19 23:41 server.log.2026-06-19
-rw-rw-r--. 1 jboss jboss     36757 Jun 20 23:41 server.log.2026-06-20
-rw-rw-r--. 1 jboss jboss     36757 Jun 21 23:41 server.log.2026-06-21
-rw-rw-r--. 1 jboss jboss     36902 Jun 22 23:41 server.log.2026-06-22
-rw-rw-r--. 1 jboss jboss    528703 Jun 23 23:41 server.log.2026-06-23
-rw-rw-r--. 1 jboss jboss   2662879 Jun 24 23:41 server.log.2026-06-24
-rw-rw-r--. 1 jboss jboss    615899 Jun 25 23:41 server.log.2026-06-25
-rw-rw-r--. 1 jboss jboss    865737 Jun 26 23:50 server.log.2026-06-26
-rw-rw-r--. 1 jboss jboss     36810 Jun 27 23:41 server.log.2026-06-27
-rw-rw-r--. 1 jboss jboss     45400 Jun 28 23:41 server.log.2026-06-28
-rw-rw-r--. 1 jboss jboss   3088307 Jun 29 23:41 server.log.2026-06-29
-rw-rw-r--. 1 jboss jboss   4158069 Jun 30 23:41 server.log.2026-06-30
-rw-rw-r--. 1 jboss jboss   1268544 Jul  1 23:41 server.log.2026-07-01
-rw-rw-r--. 1 jboss jboss     45398 Jul  2 23:41 server.log.2026-07-02
-rw-rw-r--. 1 jboss jboss   4630468 Jul  3 23:41 server.log.2026-07-03
-rw-rw-r--. 1 jboss jboss     45336 Jul  4 23:41 server.log.2026-07-04
-rw-rw-r--. 1 jboss jboss     45398 Jul  5 23:41 server.log.2026-07-05
-rw-rw-r--. 1 jboss jboss    662381 Jul  6 23:41 server.log.2026-07-06
-rw-rw-r--. 1 jboss jboss   1486740 Jul  7 23:41 server.log.2026-07-07
-rw-rw-r--. 1 jboss jboss 109676907 Jul  8 23:41 server.log.2026-07-08
-rw-rw-r--. 1 jboss jboss   3993400 Jul  9 23:41 server.log.2026-07-09
-rw-rw-r--. 1 jboss jboss    724042 Jul 10 23:41 server.log.2026-07-10
-rw-rw-r--. 1 jboss jboss     45490 Jul 11 23:41 server.log.2026-07-11
-rw-rw-r--. 1 jboss jboss     45470 Jul 12 23:41 server.log.2026-07-12
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
99496
[p585600@scttqapllx0032 /]$  sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9991 command=":shutdown"
org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:264)
        at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:230)
        at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:34)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:607)
        at org.jboss.modules.Module.run(Module.java:270)
        at org.jboss.modules.Main.main(Main.java:294)
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 127.0.0.1:9991
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:888)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:727)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:704)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:262)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9991. A conexão entrou em intervalo
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:129)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:71)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:866)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9991. A conexão entrou em intervalo
        at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:120)
        at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:247)
        at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
        at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:176)
        at org.jboss.as.controller.client.impl.RemotingModelControllerClient.getOrCreateChannel(RemotingModelControllerClient.java:146)
        at org.jboss.as.controller.client.impl.RemotingModelControllerClient$1.getChannel(RemotingModelControllerClient.java:67)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:115)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:98)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:236)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:141)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:127)
        ... 13 more
[p585600@scttqapllx0032 /]$ ps -p 99496 && echo "ainda rodando" || echo "parou"
   PID TTY          TIME CMD
 99496 ?        00:57:04 java
ainda rodando
[p585600@scttqapllx0032 /]$ ^C
[p585600@scttqapllx0032 /]$
