[p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
[p585600@sspdeapllx0041 ~]$ sudo su jboss7
[jboss7@sspdeapllx0041 p585600]$ cd /opt/jboss/jboss-eap-7.0
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ./jboss.sh host start &
[1] 877
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ Executando start do Host Controller!!!!
Starting jboss-as: p585[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_BEARER_ONLY=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_PUBLIC_CLIENT=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_REALM_NAME=internet
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_RESOURCE_NAME=cli-ser-cdc
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTERNET_TYPE_OF_SSL_REQUIRED=external
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_AUTH_URL=https://login.des.caixa/auth
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_BEARER_ONLY=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_PUBLIC_CLIENT=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_REALM_NAME=intranet
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_RESOURCE_NAME=cli-ser-cdc
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] SSO_INTRANET_TYPE_OF_SSL_REQUIRED=external
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] [Server:sicdc-lx0041]=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] awt.toolkit=sun.awt.X11.XToolkit
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.ca.apm.introscope.threadgroup=Agent
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.sun.jndi.ldap.connect.pool.maxsize=200
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.sun.jndi.ldap.connect.pool.prefsize=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.sun.jndi.ldap.connect.pool.timeout=180000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.wily.introscope.agentProfile=/opt/apm/wily/core/config/IntroscopeAgent-sicdc.profile
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] com.wily.log4j.defaultInitOverride=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] file.encoding=iso-8859-1
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] file.encoding.pkg=sun.io
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] file.separator=/
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] https.protocols=TLSv1.2
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] instancias.list=nodelx0041[7601],nodelx0076[7601]
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.agentAutoNamingEnabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.agentAutoNamingMaximumConnectionDelayInSeconds=120
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.agentAutoRenamingIntervalInMinutes=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.agentName=JBoss Agent
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.agentNameSystemPropertyKey=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.appmap.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.appmap.levels.enabled=MethodClass
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.appmap.owners.enabled=Application,BusinessTransactionComponent
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.bizRecording.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.bizdef.matchPost=before
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.bizdef.matchPost.vetoedURI=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.clonedAgent=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.common.directory=../../common
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.crossprocess.compression=lzma
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.crossprocess.compression.minlimit=1500
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.crossprocess.correlationid.maxlimit=4096
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.customProcessName=jboss-eap-7.0
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.decorator.enabled=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.decorator.security=clear
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.automatic.trace.clamp=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.automatic.trace.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.entrypoint.count.max=100
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.entrypoint.enabled=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.entrypoint.skip.pkgs=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.errorsnapshot.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.custom.prefixes=java
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.level=low
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.level.batch.interval=2
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.level.batch.size=5
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.instrumentation.max.methods=10000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.stallsnapshot.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.trace.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.trace.max.components=1000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.deep.trace.max.consecutive.components=15
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.defaultProcessName=UnknownProcess
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.disableLogFileAutoNaming=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.display.hostName.as.fqdn=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.dns.lookup.max.wait.in.milliseconds=200
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.dns.lookup.type=separateThread
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.connectionorder=DEFAULT
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.host.DEFAULT=sspdeaprlx0054
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.host.FAILOVER=sspdeaprlx0056
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.port.DEFAULT=5001
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.port.FAILOVER=5001
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.socketfactory.DEFAULT=com.wily.isengard.postofficehub.link.net.DefaultSocketFactory
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.enterprisemanager.transport.tcp.socketfactory.FAILOVER=com.wily.isengard.postofficehub.link.net.DefaultSocketFactory
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.errorsnapshots.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.errorsnapshots.throttle=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.extensions.directory=../ext
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.external.biz.bt.count.max=100
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.external.biz.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.external.biz.header.size.max=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.gcmonitor.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.io.socket.client.hosts=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.io.socket.client.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.io.socket.server.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.jmx.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.jmx.excludeStringMetrics=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.jmx.name.filter=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.collectAllocationStackTraces=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.enable=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.0=org.apache.taglibs.standard.lang.jstl.*
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.1=net.sf.hibernate.collection.*
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.10=org.jboss.seam.servlet.ServletSessionMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.11=org.jboss.seam.servlet.ServletRequestSessionMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.12=org.jboss.seam.servlet.ServletRequestMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.2=org.jnp.interfaces.FastNamingProperties
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.3=java.util.SubList
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.4=org.jboss.seam.servlet.ServletApplicationMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.5=com.sun.faces.context.BaseContextMap$EntrySet
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.6=com.sun.faces.context.BaseContextMap$KeySet
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.7=com.sun.faces.context.SessionMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.8=java.util.Collections$UnmodifiableMap
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.ignore.9=org.hibernate.collection.PersistentSet
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.leakSensitivity=5
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.logfile.append=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.logfile.location=../../logs/LeakHunter.log
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.leakhunter.timeoutInMinutes=120
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.dataChunk=500
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.heartbeatInterval=86400
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.metricExclude.ignore.0=Threads*
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.metricExclude.ignore.1=ChangeDetector.AgentID
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.numberTimeslices=180000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.metricAging.turnOn=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.datagram.client.hosts=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.datagram.client.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.datagram.server.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.socket.client.hosts=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.socket.client.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.nio.socket.server.ports=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.non.synthetic.node.name=Real Users
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.remoteagentconfiguration.allowedFiles=domainconfig.xml
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.remoteagentconfiguration.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.remoteagentdynamicinstrumentation.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.managed.reportClassAppEdge=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.managed.reportClassBTEdge=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.managed.reportMethodAppEdge=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.managed.reportMethodBTEdge=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.managed.reportToAppmap=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.sockets.reportRateMetrics=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.stalls.resolutionseconds=10
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.stalls.thresholdseconds=30
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.synthetic.node.name=Synthetic Users
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.synthetic.user.name=Synthetic_Trace_By_Vuser
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.threaddump.MaxStackElements=12000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.threaddump.deadlockpoller.enable=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.threaddump.deadlockpollerinterval=15000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.threaddump.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.transactiontracer.tailfilterPropagate.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.ttClamp=50
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.urlgroup.group.default.format=Default
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.urlgroup.group.default.pathprefix=*
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.agent.urlgroup.keys=default
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.deepinheritance.auto.turnoff.enable=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.deepinheritance.auto.turnoff.maxtime.per.interval=12000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.deepinheritance.auto.turnoff.maxtime.total=120000
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.deepinheritance.auto.turnoff.requests.per.interval=100
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.deepinheritance.enabled=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.directivesFile=jboss-typical.pbl,hotdeploy
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.enable=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.autoprobe.logfile=../../logs/AutoProbe.log
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.bootstrapClassesManager.enabled=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] introscope.bootstrapClassesManager.waitAtStartup=5
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.awt.graphicsenv=sun.awt.X11GraphicsEnvironment
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.awt.headless=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.awt.printerjob=sun.print.PSPrinterJob
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.class.path=/opt/jboss/jboss-eap-7.0/jboss-modules.jar:/opt/apm/wily/Agent.jar:/opt/azure/config/appinsights/applicationinsights-agent.jar
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.class.version=52.0
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.endorsed.dirs=/opt/jboss/jdk1.8.0_172/jre/lib/endorsed
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.ext.dirs=/opt/jboss/jdk1.8.0_172/jre/lib/ext:/usr/java/packages/lib/ext
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.home=/opt/jboss/jdk1.8.0_172/jre
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.io.tmpdir=/tmp
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.library.path=/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.net.preferIPv4Stack=true
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.runtime.name=Java(TM) SE Runtime Environment
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.runtime.version=1.8.0_172-b11
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.specification.name=Java Platform API Specification
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.specification.vendor=Oracle Corporation
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.specification.version=1.8
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vendor=Oracle Corporation
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vendor.url=http://java.oracle.com/
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vendor.url.bug=http://bugreport.sun.com/bugreport/
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.version=1.8.0_172
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.info=mixed mode
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.name=Java HotSpot(TM) 64-Bit Server VM
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.specification.name=Java Virtual Machine Specification
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.specification.vendor=Oracle Corporation
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.specification.version=1.8
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.vendor=Oracle Corporation
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] java.vm.version=25.172-b11
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] javax.net.ssl.trustStore=/opt/keystore/certchain.jks
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.as.management.blocking.timeout=600
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.home.dir=/opt/jboss/jboss-eap-7.0
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.wily*
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.server.data.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sicdc-lx0041/data
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.server.log.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sicdc-lx0041/log
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jboss.server.temp.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sicdc-lx0041/tmp
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] jdk.tls.client.protocols=TLSv1.2
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] line.separator=
[Server:sicdc-lx0041]
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.additivity.IntroscopeAgent=false
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.console=com.wily.org.apache.log4j.ConsoleAppender
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.console.layout=com.wily.org.apache.log4j.PatternLayout
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.console.layout.ConversionPattern=%d{M/dd/yy hh:mm:ss a z} [%-3p] [%c] %m%n
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.console.target=System.err
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile=com.wily.introscope.agent.AutoNamingRollingFileAppender
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile.File=/opt/apm/wily/logs/IntroscopeAgent.log
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile.MaxBackupIndex=4
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile.MaxFileSize=2MB
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile.layout=com.wily.org.apache.log4j.PatternLayout
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.appender.logfile.layout.ConversionPattern=%d{M/dd/yy hh:mm:ss a z} [%-3p] [%c] %m%n
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] log4j.logger.IntroscopeAgent=INFO, console, logfile
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] logging.configuration=file:/opt/jboss/jboss-eap-7.0/domain/servers/sicdc-lx0041/data/logging.properties
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] os.arch=amd64
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] os.name=Linux
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] os.version=2.6.32-754.35.1.el6.x86_64
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] path.separator=:
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.arch.data.model=64
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.boot.class.path=/opt/jboss/jdk1.8.0_172/jre/lib/resources.jar:/opt/jboss/jdk1.8.0_172/jre/lib/rt.jar:/opt/jboss/jdk1.8.0_172/jre/lib/sunrsasign.jar:/opt/jboss/jdk1.8.0_172/jre/lib/jsse.jar:/opt/jboss/jdk1.8.0_172/jre/lib/jce.jar:/opt/jboss/jdk1.8.0_172/jre/lib/charsets.jar:/opt/jboss/jdk1.8.0_172/jre/lib/jfr.jar:/opt/jboss/jdk1.8.0_172/jre/classes:/opt/apm/wily/Agent.jar
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.boot.library.path=/opt/jboss/jdk1.8.0_172/jre/lib/amd64
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.cpu.endian=little
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.cpu.isalist=
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.io.unicode.encoding=UnicodeLittle
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.java.command=/opt/jboss/jboss-eap-7.0/jboss-modules.jar -mp /opt/jboss/jboss-eap-7.0/modules:/opt/jboss/jboss-eap-7.0/modules-caixa org.jboss.as.server
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.java.launcher=SUN_STANDARD
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.jnu.encoding=UTF-8
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.management.compiler=HotSpot 64-Bit Tiered Compilers
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] sun.os.patch.level=unknown
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.country=BR
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.dir=/opt/jboss/jboss-eap-7.0
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.home=/opt/jboss7
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.language=pt
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.name=jboss7
[Server:sicdc-lx0041] 5/27/26 02:19:27 PM BRT [INFO] [IntroscopeAgent.Properties] user.timezone=Brazil/East
60[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Release 10.0.0.16 (Build 990201)
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Using Java VM version "Java HotSpot(TM) 64-Bit Server VM 1.8.0_172" from Oracle Corporation
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Trying to load agent profile based on system property "com.wily.introscope.agentProfile"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Trying to load file from /opt/apm/wily/core/config/IntroscopeAgent-sicdc.profile
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Loaded file from /opt/apm/wily/core/config/IntroscopeAgent-sicdc.profile
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent using old configuration (introscope.agent.configuration.old) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Canonical Key Map Thread Local (introscope.agent.reduceAgentMemoryOverhead.usecanonicalkeysthreadlocal) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Thread priority (introscope.agent.thread.all.priority) set to default value of "5"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Transaction Trace Limit (introscope.agent.ttClamp) set to "50"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.tracer.sampling.maxrate) set to default value of "10"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.tracer.sampling.initial.period) set to default value of "100"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.tracer.sampling.reset.period) set to default value of "10000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.tailfilterPropagate.enable) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.capture.sessionid) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Aging (introscope.agent.metricAging.turnOn) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Aging Interval (introscope.agent.metricAging.heartbeatInterval) set to "86400" seconds
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Aging Data Chunk (introscope.agent.metricAging.dataChunk) set to "500"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Aging Exclusion List (introscope.agent.metricAging.metricExclude.ignore) set to "[Threads*, ChangeDetector.AgentID]"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Agent Timeslice Intervals (introscope.agent.metricAging.numberTimeslices) set to "180000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Looking for agent profile property "introscope.agent.extensions.directory" to locate the extensions directory.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The agent extensions directory /opt/apm/wily/core/ext was successfully located
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(ProbeBuilder.jar): Pre-loaded 670 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(BasicDirectiveLoader.jar): Pre-loaded 9 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(DynInstrSupport15.jar): Pre-loaded 133 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(Inheritance.jar): Pre-loaded 22 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(Java15DynamicInstrumentation.jar): Pre-loaded 67 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(IntelligentInstrumentation.jar): Pre-loaded 139 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] EagerClassLoader(DynInstrBootstrap.jar): Pre-loaded 69 classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Introscope AutoProbe Release 10.0.0.16 (Build 990201)
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.autoprobe.logging) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The Introscope AutoProbe log has been created at /opt/apm/wily/logs/AutoProbe.20260527-141925.log
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.enabled) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] AutoProbe has reloaded all directive configuration.  This is because a change to a directive configuration file was detected.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.autoprobe.logskippedclasses.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Lock File created in /opt/apm/wily/core/config/hotdeploy
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Fully Qualified Agent Host Name (introscope.agent.display.hostName.as.fqdn) set to "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Configuration property (introscope.agent.fallback.domain.name) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Configuration property (introscope.agent.hostName) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Configuration property (introscope.agent.primary.net.interface.name) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Configuration property (introscope.agent.ip.family.order) set to default value of "1"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent] Configuration property (introscope.agent.subnetworks.path) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Business Recording Enabled (introscope.agent.bizRecording.enabled) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Introscope Agent startup complete.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Agent Metric Limit (introscope.agent.metricClamp) set to default value of "50000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.autoprobe.deepinheritance.enabled) set to "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [WARN] [IntroscopeAgent.Agent] Dynamic Instrumentation is turned off
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.maxmethodsize) set to default value of "2000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.decisionthreshold) set to default value of "-1"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.methodscoring.fullparse) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.custom.prefixes) set to "java"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.pubmethod set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.synmethod set to default value 2
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.sgnexcp set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.custompkgmc set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.sameclassmc set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.samepkgmc set to default value 2
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.diffpfgmc set to default value 3
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.diffrtpfgmc set to default value 4
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.recurmc set to default value 5
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.bdyexcp set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.switch set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.cghtexcp set to default value 1
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.synblck set to default value 2
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.loop set to default value 2
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Scoring property introscope.agent.deep.instrumentation.loop set to default value 2
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level) set to "low"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.methods.low) set to default value of "150"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.methods.medium) set to default value of "110"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.methods.high) set to default value of "80"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.autoprobelog.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.max.methods) set to "10000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.max.components) set to "1000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.max.consecutive.components) set to "15"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.sustainability.metrics.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.batch.size) set to "5"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.batch.interval) set to "2"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.persistence.queue.size) set to default value of "50"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.entrypoint.count.max) set to "100"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.entrypoint.blacklist.count.max) set to default value of "50"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.level.hot.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.visibility.processor.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.instrumentation.visibility.processor.interval) set to default value of "240"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.entrypoint.candidate.stack.threshold) set to default value of "300000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.entrypoint.candidate.inactivity.threshold) set to default value of "600000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.entrypoint.pseudocandidate.instrumentation.threshold) set to default value of "180000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.deep.trace.entrypoint.candidate.transaction.count) set to default value of "100"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Entry Point Detection Feature - frequency at which initial candidate processor will be executed (introscope.agent.deep.entrypoint.initial.candidate.processor.intervalSeconds) set to default value of "60"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Entry Point Detection Feature - frequency at which monitored candidate processor will be executed (introscope.agent.deep.entrypoint.monitored.candidate.processor.intervalSeconds) set to default value of "60"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.BootstrapInstrumentationManager] Initializing Bootstrap Dynamic Instrumentation.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.BootstrapInstrumentationManager] Bootstrap Manager will wait 5 seconds to instrument post main bootstrap classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Using delegate class =com.wily.introscope.api.instrument.AClassRedefinitionDelegate
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Try and add transformer using java5 API
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.BootstrapInstrumentationManager] Executing Bootstrap Classes Dynamic Instrumentation.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.BootstrapInstrumentationManager] Processed All Bootstrap Classes.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.BootstrapInstrumentationManager] Initialized pre-main Bootstrap Dynamic Instrumentation successfully.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] I/O Socket Client Hosts (introscope.agent.io.socket.client.hosts) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] I/O Socket Client Ports (introscope.agent.io.socket.client.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] I/O Socket Server Ports (introscope.agent.io.socket.server.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Datagram Client Hosts (introscope.agent.nio.datagram.client.hosts) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Socket Client Hosts (introscope.agent.nio.socket.client.hosts) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Datagram Client Ports (introscope.agent.nio.datagram.client.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Datagram Server Ports (introscope.agent.nio.datagram.server.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Socket Client Ports (introscope.agent.nio.socket.client.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] NIO Socket Server Ports (introscope.agent.nio.socket.server.ports) set to ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.debugmetrics.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.optimize.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.transaction.doTransactionTrace) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.highconcurrency.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.usesharedaccumulators.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.aging.period) set to default value of "60000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.aging.duration.max) set to default value of "30000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.aging.checkperiod) set to default value of "30000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.attentionlevel.absolute) set to default value of "100000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.aging.attentionlevel.percentage) set to default value of "5"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.WilyTransactionStructure] Newly created concurrent counters will use synchronized approach
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.synchronized.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.timer.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.perinterval.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.error.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.concurrent.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.stall.trace.enabled) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.backend.BTC.enable) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.highconcurrency.stripes) set to default value of "16"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.creation.attentionlevel.absolute) set to default value of "100000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.harvesting.transaction.creation.checkperiod) set to default value of "30000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Transaction Trace Component Count Limit (introscope.agent.transactiontrace.componentCountClamp) set to default value of "5000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.transactions.debugmetrics.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.transactions.contextualmetrics.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.transactions.metrics.maxlength) set to default value of "1000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (concurrentMapPolicy.generatemetrics) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.transactions.depth.max) set to default value of "4096"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.blame.stall.invocationData.max) set to default value of "1000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] TT_Min_Component_Count (com.wily.introscope.agent.intelligentinstrumentation.min.componentcount) set to default value of "3"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.WilyTransactionStructure] Wily Transaction Structure is adding the callback for incoming correlations
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.stalls.thresholdseconds) set to "30"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.stalls.resolutionseconds) set to "10"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Transaction Trace Component Count Limit (introscope.agent.transactiontrace.componentCountClamp) set to default value of "5000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Transaction Trace Head Filter Limit (introscope.agent.transactiontrace.headFilterClamp) set to default value of "30"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.tailfilterPropagate.enable) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.trace.filter.metrics.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.charEncoding) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.parameters) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.attributes) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httpsession.attributes) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.userid.key) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.userid.method) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (com.wily.introscope.agent.cem.force.trace.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [WARN] [IntroscopeAgent.Agent] Agent_Transaction_Trace_UserID_Not_Configured
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.synthetic.node.name) set to "Synthetic Users"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.non.synthetic.node.name) set to "Real Users"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.synthetic.user.name) set to "Synthetic_Trace_By_Vuser"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.headers) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.synthetic.header.names) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.dns.lookup.type) set to "separateThread"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Maximum time in milliseconds that the separateThread implementation waits to lookup a host name or IP address (introscope.agent.dns.lookup.max.wait.in.milliseconds) set to "200"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.aging.agingTime) set to default value of "2592000000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.AppMapService] App Map Stack has been enabled
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.enabled) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.metrics.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.catalystIntegration.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.intermediateNodes.enabled) set to default value of "false"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.consecutiveerrors.max) set to default value of "3"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.consecutiveerrors.restart.delay) set to default value of "1800000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.consecutiveerrors.shutdown) set to default value of "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.owners.enabled) set to "BusinessTransactionComponent,Application"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.appmap.levels.enabled) set to "MethodClass"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.AppMapService] App Map Service is adding the callback for replying in cross process
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.AppMapService] App Map Service has started
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.charEncoding) set to default value of null
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.headers) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.parameters) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httprequest.attributes) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.transactiontracer.parameter.httpsession.attributes) set to default value of ""
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [WARN] [IntroscopeAgent.Agent] Agent_Transaction_Trace_UserID_Not_Configured
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The Agent will attempt to determine its name.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to determine the Agent name from the System Property "com.wily.introscope.agent.agentName" because that property was either not found or had no value.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to determine the Agent name from a user specified System Property because the property "introscope.agent.agentNameSystemPropertyKey" in the Introscope Agent Profile was either not found or had no value.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The Agent will attempt to automatically determine its name from the Application Server.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The connection to the Introscope Enterprise Manager will be delayed for up to 120 seconds while the Agent attempts to determine its name.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to automatically determine the Agent Name because: The Application Server naming mechanism is not yet available.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.GCMonitorAgentService] Garbage Collection Monitor Agent Service started successfully.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.gcmonitor.enable) set to "true"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.gcmonitor.frequency) set to default value of "15000"
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] No Agent profile value found for introscope.agent.platform.monitor.system, using os.name system property to load Platform Monitor.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] No Agent profile value found for introscope.agent.platform.monitor.system, using os.name system property to load Platform Monitor.
[Server:sicdc-lx0041] 5/27/26 02:19:28 PM BRT [INFO] [IntroscopeAgent.Agent] The supportability metric -> Metric Count will not be reported since introscope.ext.agent.metric.count is set to false
bash: p5856: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ [p585600@sspdeapllx0041 ~]$ sudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.logsudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log
bash: [p585600@sspdeapllx0041: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ chown: invalid option -- 'u'
bash: chown:: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ Try `chown --help' for more information.
> [p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
> rm: invalid option -- 'u'
> Try `rm --help' for more information.
> [p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
> rm: invalid option -- 'u'
> Try `rm --help' for more information.
bash: command substitution: line 3: unexpected EOF while looking for matching `''
bash: command substitution: line 5: syntax error: unexpected end of file
bash: Try: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ [p585600@sspdeapllx0041 ~]$
bash: [p585600@sspdeapllx0041: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ [p585600@sspdeapllx0041 ~]$ sudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.logsudo -u root chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log
bash: [p585600@sspdeapllx0041: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ chown: invalid option -- 'u'
bash: chown:: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ Try `chown --help' for more information.
> [p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
> rm: invalid option -- 'u'
> Try `rm --help' for more information.
> [p585600@sspdeapllx0041 ~]$ sudo rm /opt/jboss/jboss-eap-7.0/domain/log/console.log sudo -u jboss7 touch /opt/jboss/jboss-eap-7.0/domain/log/console.log
> rm: invalid option -- 'u'
> Try `rm --help' for more information.
bash: command substitution: line 3: unexpected EOF while looking for matching `''
bash: command substitution: line 5: syntax error: unexpected end of file
bash: Try: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ [p585600@sspdeapllx0041 ~]$
bash: [p585600@sspdeapllx0041: command not found
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ [Server:sicdc-lx0041] 5/27/26 02:19:42 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to automatically determine the Agent Name because: The Application Server naming mechanism is not yet available.
[p585600@sspdeapllx0041 ~]$[Server:sicdc-lx0041] 5/27/26 02:19:44 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (wily.VirtualStackCursor.maxDecorations) set to default value of "5000"
[Server:sicdc-lx0041] 5/27/26 02:19:44 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (wily.TransactionCache.maxDBConnections) set to default value of "100"
[Server:sicdc-lx0041] 5/27/26 02:19:44 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (wily.TransactionCache.maxCallerHasSeenStackElements) set to default value of "20"
[Server:sicdc-lx0041] 5/27/26 02:19:44 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (wily.TransactionCache.maxInvocationDatasFromWebServices) set to default value of "20"
[Server:sicdc-lx0041] 5/27/26 02:19:44 PM BRT [INFO] [IntroscopeAgent.Agent] Configuration property (introscope.agent.errorsnapshots.throttle) set to "10"
[Server:sicdc-lx0041] 5/27/26 02:19:46 PM BRT [ERROR] [IntroscopeAgent.Agent] A problem occurred while attempting to Introscope-enable io/opentelemetry/javaagent/tooling/UnsafeInitializer: Unsupported class file version 53.0
[Server:sicdc-lx0041] 5/27/26 02:19:55 PM BRT [ERROR] [IntroscopeAgent.Agent] A problem occurred while attempting to Introscope-enable io/opentelemetry/javaagent/instrumentation/httpclient/HttpClientInstrumentationModule: Unsupported class file version 55.0
[Server:sicdc-lx0041] 5/27/26 02:19:56 PM BRT [ERROR] [IntroscopeAgent.Agent] A problem occurred while attempting to Introscope-enable io/opentelemetry/javaagent/instrumentation/jaxrs/v3_0/JerseyInstrumentationModule: Unsupported class file version 55.0
[Server:sicdc-lx0041] 5/27/26 02:19:56 PM BRT [ERROR] [IntroscopeAgent.Agent] A problem occurred while attempting to Introscope-enable io/opentelemetry/javaagent/instrumentation/jaxrs/v3_0/ResteasyInstrumentationModule: Unsupported class file version 55.0
[Server:sicdc-lx0041] 5/27/26 02:19:56 PM BRT [ERROR] [IntroscopeAgent.Agent] A problem occurred while attempting to Introscope-enable io/opentelemetry/javaagent/instrumentation/jetty/v11_0/Jetty11InstrumentationModule: Unsupported class file version 55.0
[Server:sicdc-lx0041] 5/27/26 02:19:57 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to automatically determine the Agent Name because: The Application Server naming mechanism is not yet available.
[Server:sicdc-lx0041] 5/27/26 02:20:12 PM BRT [INFO] [IntroscopeAgent.Agent] Unable to automatically determine the Agent Name because: The Application Server naming mechanism is not yet available.

