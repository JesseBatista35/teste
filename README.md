[root@sbrdeapllx0005 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.20:9999: Authentication failed: the server presented no authentication mechanisms
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
Caused by: org.jboss.as.cli.CommandLineException: Unable to authenticate against controller at 10.116.88.20:9999
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1062)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: javax.security.sasl.SaslException: Authentication failed: the server presented no authentication mechanisms
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:414)
        at org.jboss.remoting3.remote.ClientConnectionOpenListener$Capabilities.handleEvent(ClientConnectionOpenListener.java:244)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
        at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
        at org.xnio.channels.TranslatingSuspendableChannel.handleReadable(TranslatingSuspendableChannel.java:189)
        at org.xnio.ssl.JsseConnectedSslStreamChannel.handleReadable(JsseConnectedSslStreamChannel.java:183)
        at org.xnio.channels.TranslatingSuspendableChannel$1.handleEvent(TranslatingSuspendableChannel.java:103)
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
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]# /host=sbrdeapllx0005/server-config=sicem_node1_lx0005:read-attribute(name=group)
bash: syntax error near unexpected token `name=group'
[root@sbrdeapllx0005 p585600]#
