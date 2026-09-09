    testing: org/jboss/logmanager/formatters/Formatters$14.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$19.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$4.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$27.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$15.class   OK
    testing: org/jboss/logmanager/CopyOnWriteWeakMap$Queue.class   OK
No errors detected in compressed data of /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar.
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# systemctl reset-failed jboss-eap7_hc
[root@sbrdeapllx104 servers]# systemctl start jboss-eap7_hc
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ps -ef | grep jboss
root      40660      1  0 19:22 ?        00:00:00 su - jboss -c ulimit -n 65535; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     40663  40660  0 19:22 ?        00:00:00 -bash -c ulimit -n 65535; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     40878  40663  0 19:22 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     40998  40878  0 19:22 ?        00:00:00 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
root      41265  32741  0 19:23 pts/0    00:00:00 grep --color=auto jboss
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# tail -80 /logs/jboss-eap/console-stdout.log
  JBOSS_HOME: /opt/jboss/jboss-eap

  JAVA: java

  JAVA_OPTS: -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true

=========================================================================

19:22:29,441 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
19:22:29,583 INFO  [org.jboss.as.process.Host Controller.status] (main) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:22:30,029 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:22:30,030 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 1 segundos até tentar reiniciar o processo Host Controller.
19:22:31,030 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:22:31,207 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:22:31,207 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 5 segundos até tentar reiniciar o processo Host Controller.
19:22:36,207 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:22:36,385 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:22:36,386 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 10 segundos até tentar reiniciar o processo Host Controller.
19:22:46,386 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:22:46,566 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:22:46,567 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 15 segundos até tentar reiniciar o processo Host Controller.
19:23:01,567 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:23:01,747 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:23:01,747 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 30 segundos até tentar reiniciar o processo Host Controller.
19:23:31,748 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:23:31,939 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:23:31,940 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 30 segundos até tentar reiniciar o processo Host Controller.
19:24:01,940 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012017: Processo de inicialização 'Host Controller'
[Host Controller] org.jboss.modules.ModuleNotFoundException: sun.jdk
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1377)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
19:24:02,130 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:24:02,130 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 30 segundos até tentar reiniciar o processo Host Controller.
[root@sbrdeapllx104 servers]#
