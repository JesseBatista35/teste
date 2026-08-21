585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" -newer /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/console.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/boot.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/data/hypersonic/localDB.log
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" 2>/dev/null
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/console.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/boot.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01_time.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01.log
/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/data/hypersonic/localDB.log
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ tail -150 $(find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" 2>/dev/null | head -1)
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss/jboss-4.2.3.GA-jdk6

  JAVA: /opt/jboss/jdk/bin/java

  JAVA_OPTS: -Dprogram.name=run.sh -server -Xms3072m -Xmx3072m -XX:PermSize=1024m -Xdebug -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n -Djboss.cef.instance=sinac01 -Djboss.cef.ajp=9001 -Djboss.cef.jnp=1099 -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.partition.name=sinac-dsv-rhel -DappName=sinac01-lx011 -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true

  CLASSPATH: /opt/jboss/jboss-4.2.3.GA-jdk6/bin/run.jar:/opt/jboss/jdk/lib/tools.jar

=========================================================================

Listening for transport dt_socket at address: 8787
17:36:49,371 INFO  [Server] Starting JBoss (MX MicroKernel)...
17:36:49,371 INFO  [Server] Release ID: JBoss [Trinity] 4.2.3.GA (build: SVNTag=JBoss_4_2_3_GA date=200807181439)
17:36:49,372 INFO  [Server] Home Dir: /opt/jboss/jboss-4.2.3.GA-jdk6
17:36:49,372 INFO  [Server] Home URL: file:/opt/jboss/jboss-4.2.3.GA-jdk6/
17:36:49,372 INFO  [Server] Patch URL: null
17:36:49,372 INFO  [Server] Server Name: sinac01
17:36:49,372 INFO  [Server] Server Home Dir: /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01
17:36:49,373 INFO  [Server] Server Home URL: file:/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/
17:36:49,373 INFO  [Server] Server Log Dir: /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log
17:36:49,373 INFO  [Server] Server Temp Dir: /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/tmp
17:36:49,373 INFO  [Server] Root Deployment Filename: jboss-service.xml
17:36:49,494 INFO  [ServerInfo] Java version: 1.6.0_211,Sun Microsystems Inc.
17:36:49,495 INFO  [ServerInfo] Java VM: Java HotSpot(TM) 64-Bit Server VM 20.211-b11,Sun Microsystems Inc.
17:36:49,495 INFO  [ServerInfo] OS-System: Linux 2.6.32-754.35.1.el6.x86_64,amd64
17:36:49,664 INFO  [Server] Core system initialized
17:36:50,735 INFO  [WebService] Using RMI server codebase: http://cspdeapllx011:8083/
17:36:50,735 INFO  [Log4jService$URLWatchTimerTask] Configuring from URL: resource:jboss-log4j.xml
log4j:WARN Continuable parsing error 322 and column 23
log4j:WARN The content of element type "log4j:configuration" must match "(renderer*,appender*,(category|logger)*,root?,categoryFactory?)".
log4j: Threshold ="null".
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [br.gov.caixa] additivity to [true].
log4j: Level value for br.gov.caixa is  [DEBUG].
log4j: br.gov.caixa level set to DEBUG
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.apache] additivity to [true].
log4j: Level value for org.apache is  [WARN].
log4j: org.apache level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [jacorb] additivity to [true].
log4j: Level value for jacorb is  [WARN].
log4j: jacorb level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.jgroups] additivity to [true].
log4j: Level value for org.jgroups is  [WARN].
log4j: org.jgroups level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.quartz] additivity to [true].
log4j: Level value for org.quartz is  [DEBUG].
log4j: org.quartz level set to DEBUG
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [javax.enterprise.resource.webcontainer.jsf] additivity to [true].
log4j: Level value for javax.enterprise.resource.webcontainer.jsf is  [WARN].
log4j: javax.enterprise.resource.webcontainer.jsf level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.jboss] additivity to [true].
log4j: Level value for org.jboss is  [INFO].
log4j: org.jboss level set to INFO
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.hibernate] additivity to [true].
log4j: Level value for org.hibernate is  [DEBUG].
log4j: org.hibernate level set to DEBUG
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.jboss.management] additivity to [true].
log4j: Level value for org.jboss.management is  [WARN].
log4j: org.jboss.management level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [org.jboss.serial] additivity to [true].
log4j: Level value for org.jboss.serial is  [WARN].
log4j: org.jboss.serial level set to WARN
log4j: Retreiving an instance of org.apache.log4j.Logger.
log4j: Setting [br.gov.caixa.sinac.negocio.autorizarinvestidor] additivity to [true].
log4j: Level value for br.gov.caixa.sinac.negocio.autorizarinvestidor is  [INFO].
log4j: br.gov.caixa.sinac.negocio.autorizarinvestidor level set to INFO
log4j: Class name: [org.jboss.logging.appender.DailyRollingFileAppender]
log4j: Setting property [file] to [/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01_time.log].
log4j: Setting property [append] to [true].
log4j: Setting property [datePattern] to ['.'yyyy-MM-dd].
log4j: Parsing layout of class: "org.apache.log4j.PatternLayout"
log4j: Setting property [conversionPattern] to [%d %-5p [%c] %m%n].
log4j: setFile called: /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01_time.log, true
log4j: setFile ended
log4j: Appender [TIME_FILE] to be rolled at midnight.
log4j: Adding appender named [TIME_FILE] to category [br.gov.caixa.sinac.negocio.autorizarinvestidor].
log4j: Class name: [org.apache.log4j.AsyncAppender]
log4j: Attaching appender named [FILE] to appender named [ASYNC].
log4j: Class name: [org.jboss.logging.appender.RollingFileAppender]
log4j: Setting property [file] to [/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01.log].
log4j: Setting property [append] to [true].
log4j: Setting property [maxFileSize] to [100MB].
log4j: Setting property [maxBackupIndex] to [19].
log4j: Parsing layout of class: "org.apache.log4j.PatternLayout"
log4j: Setting property [conversionPattern] to [%d %-5r %-5p [%c] (%t:%x) %m%n].
log4j: setFile called: /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01.log, true
log4j: setFile ended
log4j: Adding appender named [ASYNC] to category [root].
[p585600@cspdeapllx011 ~]$






so me da annota para cabar com issso
