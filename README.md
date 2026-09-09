[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# # 1. Confirmar que a cópia realmente está lá
[root@sbrdeapllx104 servers]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/sun/jdk/main/
total 8
drwxr-xr-x 3 jboss jboss   56 Set  9 19:40 .
drwxr-xr-x 3 jboss jboss   18 Set  9 19:40 ..
-rwxr-xr-x 1 jboss jboss 5941 Set  9 19:40 module.xml
drwxr-xr-x 3 jboss jboss   22 Set  9 19:40 service-loader-resources
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# # 2. Matar TUDO (incluindo o process-controller pai, que está preso desde 19:22)
[root@sbrdeapllx104 servers]# systemctl stop jboss-eap7_hc
[root@sbrdeapllx104 servers]# sleep 5
[root@sbrdeapllx104 servers]# ps -ef | grep jboss
root      58527  32741  0 19:43 pts/0    00:00:00 grep --color=auto jboss
[root@sbrdeapllx104 servers]# # se ainda sobrar algo, mata na força:
[root@sbrdeapllx104 servers]# ps -ef | grep -i "jboss-modules\|process-controller\|domain.sh" | grep -v grep | awk '{print $2}' | xargs -r kill -9
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# # 3. Confirmar que limpou tudo
[root@sbrdeapllx104 servers]# ps -ef | grep jboss
root      58742  32741  0 19:43 pts/0    00:00:00 grep --color=auto jboss
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# # 4. Subir de novo, do zero
[root@sbrdeapllx104 servers]# systemctl reset-failed jboss-eap7_hc
[root@sbrdeapllx104 servers]# systemctl start jboss-eap7_hc
[root@sbrdeapllx104 servers]# sleep 60
[root@sbrdeapllx104 servers]# ps -ef | grep jboss
root      58836      1  0 19:43 ?        00:00:00 su - jboss -c ulimit -n 65535; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     58839  58836  0 19:43 ?        00:00:00 -bash -c ulimit -n 65535; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     59054  58839  0 19:43 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     59174  59054  0 19:43 ?        00:00:00 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.94.211 -bmanagement 10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
root      59454  32741  0 19:44 pts/0    00:00:00 grep --color=auto jboss
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# # 5. Ver log FRESCO (últimas linhas, não a cauda antiga)
[root@sbrdeapllx104 servers]# tail -30 /logs/jboss-eap/console-stdout.log
[Host Controller]       at org.jboss.modules.ModuleLoader.findModule(ModuleLoader.java:677)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModuleLocal(ModuleLoader.java:487)
[Host Controller]       at org.jboss.modules.ModuleLoader.preloadModule(ModuleLoader.java:390)
[Host Controller]       at org.jboss.modules.Module.addExportedPaths(Module.java:1363)
[Host Controller]       at org.jboss.modules.Module.addPaths(Module.java:1255)
[Host Controller]       at org.jboss.modules.Module.link(Module.java:1582)
[Host Controller]       at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
[Host Controller]       at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
[Host Controller]       at org.jboss.modules.Main.main(Main.java:399)
[Host Controller] Caused by: org.jboss.modules.xml.XmlPullParserException: Failed to add resource root 'jboss-common-beans-1.1.0.Final-redhat-2.jar' at path 'jboss-common-beans-1.1.0.Final-redhat-2.jar' (position: END_TAG seen ...resource-root path="jboss-common-beans-1.1.0.Final-redhat-2.jar"/>... @31:76) caused by: java.util.zip.ZipException: error in opening zip file
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseResourceRoot(ModuleXmlParser.java:1006)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseResources(ModuleXmlParser.java:850)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseModuleContents(ModuleXmlParser.java:645)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseDocument(ModuleXmlParser.java:416)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseModuleXml(ModuleXmlParser.java:296)
[Host Controller]       ... 16 more
[Host Controller] Caused by: java.util.zip.ZipException: error in opening zip file
[Host Controller]       at java.util.zip.ZipFile.open(Native Method)
[Host Controller]       at java.util.zip.ZipFile.<init>(ZipFile.java:231)
[Host Controller]       at java.util.zip.ZipFile.<init>(ZipFile.java:156)
[Host Controller]       at java.util.jar.JarFile.<init>(JarFile.java:168)
[Host Controller]       at java.util.jar.JarFile.<init>(JarFile.java:147)
[Host Controller]       at org.jboss.modules.xml.JDKSpecific.getJarFile(JDKSpecific.java:33)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser$DefaultResourceRootFactory.createResourceLoader(ModuleXmlParser.java:1380)
[Host Controller]       at org.jboss.modules.LocalModuleFinder.lambda$new$0(LocalModuleFinder.java:94)
[Host Controller]       at org.jboss.modules.xml.ModuleXmlParser.parseResourceRoot(ModuleXmlParser.java:1004)
[Host Controller]       ... 20 more
19:44:16,402 INFO  [org.jboss.as.process.Host Controller.status] (reaper for Host Controller) JBAS012010: Processo 'Host Controller' encerrado com o status de saída do 1
19:44:16,403 INFO  [org.jboss.as.process-controller.server] (reaper for Host Controller) JBAS012020: Espera 30 segundos até tentar reiniciar o processo Host Controller.
[root@sbrdeapllx104 servers]#
