
-sh-4.1$ grep -B3 "Listener refused" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -E "^2026-07-13 1[45]:" | tail -10
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -n "Listener refused" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -5
24359:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
24580:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
24590:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
24811:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
24821:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.30:9990 --command="reload"
Failed to connect to the controller: The controller is not available at 10.116.88.30:9990: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed: JBAS012174: Could not connect to remote://10.116.88.30:9990. The connection failed: Connection refused
org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:306)
        at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:271)
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
-sh-4.1$
