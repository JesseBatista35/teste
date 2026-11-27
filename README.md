
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# systemctl list-unit-files | grep -i -E 'jboss|eap'
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# ls -l /etc/init.d/ | grep -i -E 'jboss|eap'
lrwxrwxrwx. 1 root root    41 Oct  8  2018 jboss -> /opt/open/jboss/7.0.0/scripts/jboss-admin
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# ls -l /opt/jboss/ /opt/jboss/jboss-eap/ 2>/dev/null
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# ls /opt/jboss/jboss-eap/domain/configuration/ 2>/dev/null
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# df -hT | grep -i nfs
[root@srjdeapllx158 p585600]# grep -i nfs /etc/fstab
[root@srjdeapllx158 p585600]#



2026-11-27T19:33:45.1555415Z ##[section]Starting: Reciclagem sifpp
2026-11-27T19:33:45.1559112Z ==============================================================================
2026-11-27T19:33:45.1559191Z Task         : Bash
2026-11-27T19:33:45.1559370Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-27T19:33:45.1559435Z Version      : 3.227.0
2026-11-27T19:33:45.1559478Z Author       : Microsoft Corporation
2026-11-27T19:33:45.1559565Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-27T19:33:45.1559640Z ==============================================================================
2026-11-27T19:33:45.7794228Z Generating script.
2026-11-27T19:33:45.7804542Z ========================== Starting Command Output ===========================
2026-11-27T19:33:45.7874837Z [command]/bin/bash /opt/ads-agent/_work/_temp/06284eb7-daa7-478d-b8bf-e59e618f0a0f.sh
2026-11-27T19:33:45.7876430Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-27T19:33:45.7877128Z Reciclando 10.116.95.7
2026-11-27T19:33:45.7877452Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-27T19:33:46.2926201Z org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
2026-11-27T19:33:46.2926811Z 	at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:284)
2026-11-27T19:33:46.2927610Z 	at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:250)
2026-11-27T19:33:46.2927943Z 	at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:34)
2026-11-27T19:33:46.2928300Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-27T19:33:46.2928981Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-11-27T19:33:46.2929292Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-27T19:33:46.2929468Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-11-27T19:33:46.2929616Z 	at org.jboss.modules.Module.run(Module.java:292)
2026-11-27T19:33:46.2929760Z 	at org.jboss.modules.Main.main(Main.java:455)
2026-11-27T19:33:46.2929924Z Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 10.116.95.7:9999
2026-11-27T19:33:46.2930120Z 	at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:969)
2026-11-27T19:33:46.2930303Z 	at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:808)
2026-11-27T19:33:46.2930496Z 	at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:784)
2026-11-27T19:33:46.2930677Z 	at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:282)
2026-11-27T19:33:46.2930805Z 	... 8 more
2026-11-27T19:33:46.2931373Z Caused by: java.io.IOException: java.net.ConnectException: JBAS012174: Não foi possível conectar-se oa remote://10.116.95.7:9999. A conexão falhou
2026-11-27T19:33:46.2931616Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:129)
2026-11-27T19:33:46.2931863Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:71)
2026-11-27T19:33:46.2932073Z 	at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:947)
2026-11-27T19:33:46.2932207Z 	... 11 more
2026-11-27T19:33:46.2932448Z Caused by: java.net.ConnectException: JBAS012174: Não foi possível conectar-se oa remote://10.116.95.7:9999. A conexão falhou
2026-11-27T19:33:46.2932657Z 	at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:129)
2026-11-27T19:33:46.2932867Z 	at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:256)
2026-11-27T19:33:46.2933077Z 	at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
2026-11-27T19:33:46.2933269Z 	at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:204)
2026-11-27T19:33:46.2933745Z 	at org.jboss.as.cli.impl.CLIModelControllerClient.getOrCreateChannel(CLIModelControllerClient.java:160)
2026-11-27T19:33:46.2933947Z 	at org.jboss.as.cli.impl.CLIModelControllerClient$2.getChannel(CLIModelControllerClient.java:120)
2026-11-27T19:33:46.2934225Z 	at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:117)
2026-11-27T19:33:46.2934420Z 	at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:92)
2026-11-27T19:33:46.2934636Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:236)
2026-11-27T19:33:46.2934864Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:141)
2026-11-27T19:33:46.2935084Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:127)
2026-11-27T19:33:46.2935238Z 	... 13 more
2026-11-27T19:33:46.2935410Z Caused by: java.net.ConnectException: Conexão recusada
2026-11-27T19:33:46.2935548Z 	at sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
2026-11-27T19:33:46.2935708Z 	at sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:717)
2026-11-27T19:33:46.2935864Z 	at org.xnio.nio.NioXnioWorker$1.handleEvent(NioXnioWorker.java:322)
2026-11-27T19:33:46.2936023Z 	at org.xnio.nio.NioXnioWorker$1.handleEvent(NioXnioWorker.java:318)
2026-11-27T19:33:46.2936186Z 	at org.xnio.ChannelListeners.invokeChannelListener(ChannelListeners.java:72)
2026-11-27T19:33:46.2936339Z 	at org.xnio.nio.NioHandle.run(NioHandle.java:90)
2026-11-27T19:33:46.2936473Z 	at org.xnio.nio.WorkerThread.run(WorkerThread.java:187)
2026-11-27T19:33:46.2936607Z 	at ...asynchronous invocation...(Unknown Source)
2026-11-27T19:33:46.2936748Z 	at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:270)
2026-11-27T19:33:46.2936899Z 	at org.jboss.remoting3.EndpointImpl.doConnect(EndpointImpl.java:251)
2026-11-27T19:33:46.2937059Z 	at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:349)
2026-11-27T19:33:46.2937216Z 	at org.jboss.remoting3.EndpointImpl.connect(EndpointImpl.java:337)
2026-11-27T19:33:46.2937389Z 	at org.jboss.as.protocol.ProtocolConnectionUtils.connect(ProtocolConnectionUtils.java:80)
2026-11-27T19:33:46.2937570Z 	at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:99)
2026-11-27T19:33:46.2937708Z 	... 23 more
2026-11-27T19:33:46.3130416Z ##[error]Bash exited with code '1'.
2026-11-27T19:33:46.3144990Z ##[section]Finishing: Reciclagem sifpp
