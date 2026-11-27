[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# ps -ef | grep file.encoding | grep -v grep
[root@caddeapllx955 p585600]# ps -ef | grep file.encoding | grep -v grep
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep -i "default-encoding" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" default-encoding="ISO-8859-1" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# ps -ef | grep file.encoding | grep -v grep
[root@caddeapllx955 p585600]# grep -i "default-encoding" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" default-encoding="ISO-8859-1" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#



oot@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# ps -ef | grep jboss
root     2704265 2693427  0 09:42 pts/2    00:00:00 grep --color=auto jboss
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#


2026-11-27 09:42:09,482 ERROR [org.jboss.as.controller] (Controller Boot Thread)

OPVDX001: erro de valida▒▒o em standalone-full-ha.xml --------------------------
|
|  577:     <object-store path="tx-object-store" relative-to="jboss.server.data.dir"/>
|  578: </subsystem>
|  579: <subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" default-encoding="ISO-8859-1" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">
|                                                                                                                                                                                                 ^^^^ 'default-encoding' n▒o ▒ um atributo permitido para o elemento
|                                                                                                                                                                                                        'subsystem'
|
|                                                                                                                                                                                                      Os atributos permitidos aqui s▒o:
|                                                                                                                                                                                                        default-security-domain    instance-id
|                                                                                                                                                                                                        default-server             name
|                                                                                                                                                                                                        default-servlet-container  obfuscate-session-route
|                                                                                                                                                                                                        default-virtual-host       statistics-enabled
|
|  580:     <buffer-cache name="default"/>
|  581:     <server name="default-server">
|  582:         <ajp-listener name="ajp" socket-binding="ajp" max-parameters="30000" max-post-size="52428800"/>
|
| 'default-encoding' ▒ permitido nos elementos:
| - server > profile > {urn:jboss:domain:undertow:12.0}subsystem > servlet-container
|
|
| A mensagem de erro prim▒rio subjacente foi:
| > ParseError at [row,col]:[579,9]
| > Message: WFLYCTL0376: Foi encontrado um atributo 'default-encoding'
| >   inesperado. Atributos v▒lidos s▒o: 'default-server,
| >   default-virtual-host, default-servlet-container, instance-id,
| >   obfuscate-session-route, default-security-domain, statistics-enabled,
| >   name'
|
|-------------------------------------------------------------------------------

2026-11-27 09:42:09,483 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Foi vista uma exce▒▒o durante a inicializa▒▒o: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Falha ao pesquisar a configura▒▒o
        at org.jboss.as.controller.persistence.XmlConfigurationPersister.load(XmlConfigurationPersister.java:145)
        at org.jboss.as.server.ServerService.boot(ServerService.java:406)
        at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:447)
        at java.lang.Thread.run(Thread.java:750)
