
-sh-4.1$
-sh-4.1$ find /opt/jboss/jboss-eap -iname "*.xml" 2>/dev/null | grep -i "domain|host"
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -ril "orad01ng|cnpexdadvm01|siouv" /opt/jboss/jboss-eap/hc/ 2>/dev/null
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -i "orad01ng|connection-url|jndi-name|pool-name" -B5 -A5 <caminho_do_arquivo_encontrado>
-sh: syntax error near unexpected token `newline'
-sh-4.1$
-sh-4.1$
-sh-4.1$ cat /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | grep -i "domain-controller|remote"
-sh-4.1$ /opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.88.30:9990
Failed to connect to the controller: The controller is not available at 10.116.88.30:9990: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed: Connection refused
org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:306)
        at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:283)
        at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:45)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.modules.Module.run(Module.java:318)
        at org.jboss.modules.Main.main(Main.java:473)
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 10.116.88.30:9990
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1075)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:149)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed
        at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:133)
        at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:256)
        at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
        at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:208)
        at org.jboss.as.cli.impl.CLIModelControllerClient.getOrCreateChannel(CLIModelControllerClient.java:169)
        at org.jboss.as.cli.impl.CLIModelControllerClient$2.getChannel(CLIModelControllerClient.java:129)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:123)
        at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:98)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:263)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:168)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:147)
        ... 13 more
Caused by: java.net.ConnectException: Connection refused
        at sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
        at sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:715)
        at org.xnio.nio.NioXnioWorker$1.handleEvent(NioXnioWorker.java:329)
        at org.xnio.nio.NioXnioWorker$1.handleEvent(NioXnioWorker.java:325)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.nio.NioHandle.run(NioHandle.java:90)
        at org.xnio.nio.WorkerThread.run(WorkerThread.java:198)
        at ...asynchronous invocation...(Unknown Source)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:293)
        at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:274)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:386)
        at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:374)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connect(ProtocolConnectionUtils.java:84)
        at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:103)
        ... 23 more
-sh-4.1$ /host=*/server=siouv_node1_lx0002/subsystem=datasources:read-resource(recursive=true)**
-sh: syntax error near unexpected token `recursive=true'
-sh-4.1$
-sh-4.1$
-sh-4.1$
