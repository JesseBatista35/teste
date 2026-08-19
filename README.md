
[p585600@scttqapllx0032 opt]$ sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9992 command=":shutdown"
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
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 127.0.0.1:9992
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:888)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:727)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:704)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:262)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9992. A conexão entrou em intervalo
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:129)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:71)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:866)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9992. A conexão entrou em intervalo
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
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ ps -ef | grep java
jboss     45082  45034  0 Aug05 ?        00:24:32 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  125656 125354  0 15:40 pts/1    00:00:00 grep java
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ netstat -tlnp 2>/dev/null | grep 9999
[p585600@scttqapllx0032 opt]$ netstat -tlnp 2>/dev/null | grep 999
tcp        0      0 0.0.0.0:9991                0.0.0.0:*                   OUÇA       -
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
