2026-11-27T18:58:50.5398223Z ##[section]Starting: Reciclagem sifpp
2026-11-27T18:58:50.5410102Z ==============================================================================
2026-11-27T18:58:50.5410192Z Task         : Bash
2026-11-27T18:58:50.5410291Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-27T18:58:50.5410413Z Version      : 3.227.0
2026-11-27T18:58:50.5410553Z Author       : Microsoft Corporation
2026-11-27T18:58:50.5410608Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-27T18:58:50.5410728Z ==============================================================================
2026-11-27T18:58:51.4562621Z Generating script.
2026-11-27T18:58:51.4578354Z ========================== Starting Command Output ===========================
2026-11-27T18:58:51.4598390Z [command]/bin/bash /opt/ads-agent/_work/_temp/068cdc83-abd4-4aa8-8d83-b439e4ee8308.sh
2026-11-27T18:58:51.4620464Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-27T18:58:51.4622749Z Reciclando 10.116.95.7
2026-11-27T18:58:51.4626282Z - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
2026-11-27T18:58:56.9648475Z org.jboss.as.cli.CliInitializationException: Failed to connect to the controller
2026-11-27T18:58:56.9652371Z 	at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:284)
2026-11-27T18:58:56.9652817Z 	at org.jboss.as.cli.impl.CliLauncher.main(CliLauncher.java:250)
2026-11-27T18:58:56.9653201Z 	at org.jboss.as.cli.CommandLineMain.main(CommandLineMain.java:34)
2026-11-27T18:58:56.9653479Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-27T18:58:56.9653773Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-11-27T18:58:56.9654493Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-27T18:58:56.9654731Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-11-27T18:58:56.9654869Z 	at org.jboss.modules.Module.run(Module.java:292)
2026-11-27T18:58:56.9655029Z 	at org.jboss.modules.Main.main(Main.java:455)
2026-11-27T18:58:56.9655197Z Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 10.116.95.7:9999
2026-11-27T18:58:56.9655385Z 	at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:969)
2026-11-27T18:58:56.9655567Z 	at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:808)
2026-11-27T18:58:56.9655759Z 	at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:784)
2026-11-27T18:58:56.9655942Z 	at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:282)
2026-11-27T18:58:56.9656069Z 	... 8 more
2026-11-27T18:58:56.9656527Z Caused by: java.io.IOException: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://10.116.95.7:9999. A conexão entrou em intervalo
2026-11-27T18:58:56.9656775Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:129)
2026-11-27T18:58:56.9657020Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:71)
2026-11-27T18:58:56.9657218Z 	at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:947)
2026-11-27T18:58:56.9657353Z 	... 11 more
2026-11-27T18:58:56.9657606Z Caused by: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://10.116.95.7:9999. A conexão entrou em intervalo
2026-11-27T18:58:56.9657818Z 	at org.jboss.as.protocol.ProtocolConnectionUtils.connectSync(ProtocolConnectionUtils.java:131)
2026-11-27T18:58:56.9658022Z 	at org.jboss.as.protocol.ProtocolConnectionManager$EstablishingConnection.connect(ProtocolConnectionManager.java:256)
2026-11-27T18:58:56.9658231Z 	at org.jboss.as.protocol.ProtocolConnectionManager.connect(ProtocolConnectionManager.java:70)
2026-11-27T18:58:56.9658422Z 	at org.jboss.as.protocol.mgmt.FutureManagementChannel$Establishing.getChannel(FutureManagementChannel.java:204)
2026-11-27T18:58:56.9658947Z 	at org.jboss.as.cli.impl.CLIModelControllerClient.getOrCreateChannel(CLIModelControllerClient.java:160)
2026-11-27T18:58:56.9659144Z 	at org.jboss.as.cli.impl.CLIModelControllerClient$2.getChannel(CLIModelControllerClient.java:120)
2026-11-27T18:58:56.9659429Z 	at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:117)
2026-11-27T18:58:56.9659622Z 	at org.jboss.as.protocol.mgmt.ManagementChannelHandler.executeRequest(ManagementChannelHandler.java:92)
2026-11-27T18:58:56.9659833Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeRequest(AbstractModelControllerClient.java:236)
2026-11-27T18:58:56.9660054Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:141)
2026-11-27T18:58:56.9660269Z 	at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:127)
2026-11-27T18:58:56.9660418Z 	... 13 more
2026-11-27T18:58:56.9880197Z ##[error]Bash exited with code '1'.
2026-11-27T18:58:56.9891852Z ##[section]Finishing: Reciclagem sifpp







