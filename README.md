grep -A1 "sismh.api" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml



# Parar (via CLI, como você já fez antes)
sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9991 command=":shutdown"

# Confirmar que parou
ps -ef | grep java

# Se necessário, remover lock antigo
sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file

# Subir novamente
sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'




tail -n 0 -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log


ps -ef | grep java




[p585600@scttqapllx0032 opt]$ grep -A1 "sismh.api" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
        <property name="sismh.api.keycloak.public.key" value="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB"/>
        <property name="sismh.api.clients.servico.id" value="cli-ser-smh"/>
    </system-properties>
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9991 command=":shutdown"
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
Caused by: org.jboss.as.cli.CommandLineException: The controller is not available at 127.0.0.1:9991
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:888)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:727)
        at org.jboss.as.cli.impl.CommandContextImpl.connectController(CommandContextImpl.java:704)
        at org.jboss.as.cli.impl.CliLauncher.initCommandContext(CliLauncher.java:262)
        ... 8 more
Caused by: java.io.IOException: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9991. A conexão entrou em intervalo
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.executeForResult(AbstractModelControllerClient.java:129)
        at org.jboss.as.controller.client.impl.AbstractModelControllerClient.execute(AbstractModelControllerClient.java:71)
        at org.jboss.as.cli.impl.CommandContextImpl.tryConnection(CommandContextImpl.java:866)
        ... 11 more
Caused by: java.net.ConnectException: JBAS012144: Não foi possível conectar-se ao remote://127.0.0.1:9991. A conexão entrou em intervalo
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
[p585600@scttqapllx0032 opt]$ sudo su
Sorry, user p585600 is not allowed to execute '/bin/su' as root on scttqapllx0032.df.caixa.
[p585600@scttqapllx0032 opt]$ sudo
usage: sudo [-D level] -h | -K | -k | -V
usage: sudo -v [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid]
usage: sudo -l[l] [-AknS] [-D level] [-g groupname|#gid] [-p prompt] [-U user name] [-u user name|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-r role] [-t type] [-C fd] [-D level] [-g groupname|#gid] [-p prompt] [-u user name|#uid] file ...
[p585600@scttqapllx0032 opt]$
