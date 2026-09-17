
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# nslookup sigfi2.desenvolvimento.extracaixa
Server:         10.116.84.160
Address:        10.116.84.160#53

Non-authoritative answer:
Name:   sigfi2.desenvolvimento.extracaixa
Address: 10.116.80.21

[root@sbrdeapllx093 p585600]# $JBOSS_HOME/bin/jboss-cli.sh --connect controller=10.116.89.252:9990
bash: /bin/jboss-cli.sh: No such file or directory
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# /host=*:read-resource
bash: /host=*:read-resource: No such file or directory
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# /host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:list-proxies-info
bash: nome-do-host: No such file or directory
[root@sbrdeapllx093 p585600]# /host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:enable-context(virtualhost=default-host,context=ecr-web)
bash: syntax error near unexpected token `('
[root@sbrdeapllx093 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10.116.89.252:9990
Failed to connect to the controller: The controller is not available at 10.116.89.252:9990: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.89.252:9990. The connection failed: JBAS012174: Could not connect to remote://10.116.89.252:9990. The connection failed: Connection refused
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
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 10.116.89.252:9990
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1075)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:903)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:879)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:304)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.89.252:9990. The connection failed
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:149)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:75)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:1053)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012174: Could not connect to remote://10.116.89.252:9990. The connection failed
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
[root@sbrdeapllx093 p585600]# /host=*:read-resource(name=host)
bash: syntax error near unexpected token `name=host'
[root@sbrdeapllx093 p585600]# nslookup 10.116.80.21
;; Truncated, retrying in TCP mode.
Server:         10.116.84.160
Address:        10.116.84.160#53

21.80.116.10.in-addr.arpa       name = sisrh2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sitah-legado.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siico2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sinch_inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifes-intranet3.des.caixa.
21.80.116.10.in-addr.arpa       name = sinch.inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipld-testes.des.caixa.
21.80.116.10.in-addr.arpa       name = siric.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipge.extra.caixa.gov.br.
21.80.116.10.in-addr.arpa       name = sievj.des.caixa.
21.80.116.10.in-addr.arpa       name = sipen2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipmc-inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipon.des.caixa.
21.80.116.10.in-addr.arpa       name = sipon2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = apicadastro.des.caixa.
21.80.116.10.in-addr.arpa       name = novocadastro.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = spbpdfview.des.caixa.
21.80.116.10.in-addr.arpa       name = siaef2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siaef-sp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sisdu.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sicve-internet.des.caixa.
21.80.116.10.in-addr.arpa       name = siaoi2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipge.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipag.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siotp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siopi_internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sitah2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sisgd-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siafc.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siafc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sipld2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siatd-pauta-intranet.des.caixa.
21.80.116.10.in-addr.arpa       name = sicrs2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sictd.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sictd-digitalizar.des.caixa.
21.80.116.10.in-addr.arpa       name = sictd-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siatd-internet.des.caixa.
21.80.116.10.in-addr.arpa       name = siatd-intranet.des.caixa.
21.80.116.10.in-addr.arpa       name = siatd-pauta-internet.des.caixa.
21.80.116.10.in-addr.arpa       name = siapc.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siarc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siatd.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siatd2.des.caixa.
21.80.116.10.in-addr.arpa       name = sifec3.des.caixa.
21.80.116.10.in-addr.arpa       name = sifec-internet.des.caixa.
21.80.116.10.in-addr.arpa       name = sifes-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifes-intranet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siefi.des.extra.caixa.gov.br.
21.80.116.10.in-addr.arpa       name = siefi.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifes-intranet4.des.caixa.
21.80.116.10.in-addr.arpa       name = sigcr2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sigda2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sigdp2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sigfi2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sicve-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifes-intranet2.des.caixa.
21.80.116.10.in-addr.arpa       name = sijur2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = simph.des.caixa.
21.80.116.10.in-addr.arpa       name = sinaf.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifec.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sifec2.des.caixa.
21.80.116.10.in-addr.arpa       name = sicut2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sigfi-sp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sigtc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sisdu2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sirta.des.caixa.
21.80.116.10.in-addr.arpa       name = siemp2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = sinaf3.des.caixa.
21.80.116.10.in-addr.arpa       name = sinch.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = siatd2-internet.des.caixa.
21.80.116.10.in-addr.arpa       name = siouv2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa       name = tarifas.desenvolvimento.extracaixacaixa.
21.80.116.10.in-addr.arpa       name = siorc2.desenvolvimento.extracaixa.

[root@sbrdeapllx093 p585600]# dig -x 10.116.80.21
;; Truncated, retrying in TCP mode.

; <<>> DiG 9.8.2rc1-RedHat-9.8.2-0.68.rc1.el6 <<>> -x 10.116.80.21
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 42065
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 73, AUTHORITY: 0, ADDITIONAL: 0

;; QUESTION SECTION:
;21.80.116.10.in-addr.arpa.     IN      PTR

;; ANSWER SECTION:
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siico2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sinch_inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifes-intranet3.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sinch.inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipld-testes.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siric.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipge.extra.caixa.gov.br.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sievj.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipen2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipmc-inter.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipon.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipon2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     apicadastro.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     novocadastro.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     spbpdfview.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siaef2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sitah-legado.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siaef-sp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sisdu.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sicve-internet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siaoi2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipge.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipag.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siotp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siopi_internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sitah2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sisgd-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siafc.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siafc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sipld2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd-pauta-intranet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sicrs2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sictd.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sictd-digitalizar.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sictd-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd-internet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd-intranet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd-pauta-internet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siapc.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siarc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd2.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifec3.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifec-internet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifes-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifes-intranet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siefi.des.extra.caixa.gov.br.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siefi.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifes-intranet4.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigcr2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigda2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigdp2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigfi2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sicve-internet.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifes-intranet2.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sijur2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     simph.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sinaf.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifec.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sifec2.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sicut2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigfi-sp.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sigtc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sisdu2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sirta.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siemp2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sinaf3.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sinch.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siatd2-internet.des.caixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siouv2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     tarifas.desenvolvimento.extracaixacaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     siorc2.desenvolvimento.extracaixa.
21.80.116.10.in-addr.arpa. 3600 IN      PTR     sisrh2.desenvolvimento.extracaixa.

;; Query time: 1 msec
;; SERVER: 10.116.84.160#53(10.116.84.160)
;; WHEN: Thu Sep 17 14:20:28 2026
;; MSG SIZE  rcvd: 1847

[root@sbrdeapllx093 p585600]#
