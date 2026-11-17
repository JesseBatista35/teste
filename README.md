
-sh-4.1$
-sh-4.1$ sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999 --command="/host=*/server-config=*:read-attribute(name=group)" | grep -B8 'sifec-intranet5' | grep -E 'host|server-config'
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
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at localhost:9999
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1075)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012174: Could not connect to remote://localhost:9999. The connection failed
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:149)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012174: Could not connect to remote://localhost:9999. The connection failed
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
-sh-4.1$
-sh-4.1$ grep -iE 'login|caixa.gov' /etc/hosts; nslookup logindes.caixa.gov.br | tail -3
10.116.88.20    sbrdeapllx0001.extra.caixa.gov.br       sbrdeapllx0001
10.116.92.206   cmdes1.extra.caixa.gov.br
10.252.132.98   dbrcoaprlx003.intra.caixa.gov.br        dbrcoaprlx003   # Control-M
10.122.154.13   cbrsvaprlx018.intra.caixa.gov.br        # Puppet Server
10.122.154.12   cbrsvaprlx017.intra.caixa.gov.br        cbrsvaprlx017   # Repositorio
Name:   logindes.caixa.gov.br
Address: 10.116.81.75

-sh-4.1$
-sh-4.1$
-sh-4.1$ for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
== https://logindes.caixa.gov.br/auth/realms/internet
== https://login.des.caixa/auth/realms/intranet
-sh-4.1$



Last login: Mon Nov 16 14:50:14 2026 from 10.122.150.31
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ grep -iE 'login|caixa.gov' /etc/hosts; nslookup logindes.caixa.gov.br | tail -3
10.122.146.248  cadsvgerlx080   cadsvgerlx080.intra.caixa.gov.br        # Satellite
10.122.152.31   crjsvitrlx030   crjsvitrlx030.intra.caixa.gov.br        # Capsule RJ
10.122.152.30   cspsvitrlx012   cspsvitrlx012.intra.caixa.gov.br        # Capsule SP
10.123.68.63    cctdcitrlx001   cctdcitrlx001.intra.caixa.gov.br        # Capsule CETEC
10.122.155.61   cbrsvaprlx174   cbrsvaprlx174.intra.caixa.gov.br        # Capsule BR
10.116.97.40    caddeapllx2780.intra.caixa.gov.br       caddeapllx2780
10.116.97.79    cbrdeapllx473.extra.caixa.gov.br        cbrdeapllx473
Address: 10.116.81.75
;; Got recursion not available from 10.122.208.125, trying next server

[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
== https://logindes.caixa.gov.br/auth/realms/internet
"kid":"olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo"
== https://login.des.caixa/auth/realms/intranet
"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw"
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$



