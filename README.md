
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ grep -n -A20 -B5 "11:53:" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ ls -la /opt/jboss-eap/standalone/deployments/ | grep -E "failed|isdeploying|deployed"
-rw-r--r-- 1 jboss jboss        29 ago 19 16:37 applicationinsights-agent.jar.deployed
-rw-r--r-- 1 jboss jboss        13 ago 19 16:36 framework.jar.deployed
-rw-r--r-- 1 jboss jboss        11 ago 19 16:36 ojdbc17.jar.deployed
-rw-r--r-- 1 jboss jboss        12 ago 20 12:12 siatdEAR.ear.deployed
-rw-r--r-- 1 jboss jboss        13 ago 19 16:36 wmq.jmsra.rar.deployed
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ cat /opt/jboss-eap/standalone/deployments/siatdEAR.ear.failed 2>/dev/null
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ grep -n -B5 -A5 "11:53:5" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/audit.log
[p585600@caddeapllx1992 ~]$ grep -n -i "metaspace\|OutOfMemory" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/*.log
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:32:[2026-08-20T12:12:03.013-0300][1671ms] GC(0) Metaspace: 13631K(14080K)->13631K(14080K) NonClass: 12028K(12288K)->12028K(12288K) Class: 1603K(1792K)->1603K(1792K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:47:[2026-08-20T12:12:03.337-0300][1996ms] GC(1) Metaspace: 19007K(19584K)->19007K(19584K) NonClass: 16778K(17152K)->16778K(17152K) Class: 2228K(2432K)->2228K(2432K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:62:[2026-08-20T12:12:03.606-0300][2264ms] GC(2) Metaspace: 25941K(26944K)->25941K(26944K) NonClass: 22732K(23360K)->22732K(23360K) Class: 3209K(3584K)->3209K(3584K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:77:[2026-08-20T12:12:04.719-0300][3377ms] GC(3) Metaspace: 39575K(40896K)->39575K(40896K) NonClass: 34208K(35008K)->34208K(35008K) Class: 5366K(5888K)->5366K(5888K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:92:[2026-08-20T12:12:05.590-0300][4248ms] GC(4) Metaspace: 62119K(64192K)->62119K(64192K) NonClass: 53793K(55040K)->53793K(55040K) Class: 8325K(9152K)->8325K(9152K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:107:[2026-08-20T12:12:05.999-0300][4657ms] GC(5) Metaspace: 62428K(64448K)->62428K(64448K) NonClass: 54085K(55296K)->54085K(55296K) Class: 8342K(9152K)->8342K(9152K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:122:[2026-08-20T12:12:06.587-0300][5246ms] GC(6) Metaspace: 62503K(64512K)->62503K(64512K) NonClass: 54157K(55360K)->54157K(55360K) Class: 8345K(9152K)->8345K(9152K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:137:[2026-08-20T12:12:07.065-0300][5723ms] GC(7) Metaspace: 62593K(64704K)->62593K(64704K) NonClass: 54229K(55488K)->54229K(55488K) Class: 8363K(9216K)->8363K(9216K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:152:[2026-08-20T12:12:07.753-0300][6412ms] GC(8) Metaspace: 68366K(70464K)->68366K(70464K) NonClass: 59390K(60608K)->59390K(60608K) Class: 8976K(9856K)->8976K(9856K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:167:[2026-08-20T12:12:10.820-0300][9478ms] GC(9) Metaspace: 100967K(103680K)->100967K(103680K) NonClass: 87521K(89088K)->87521K(89088K) Class: 13445K(14592K)->13445K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:182:[2026-08-20T12:12:11.773-0300][10431ms] GC(10) Metaspace: 101034K(103808K)->101034K(103808K) NonClass: 87579K(89216K)->87579K(89216K) Class: 13454K(14592K)->13454K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:197:[2026-08-20T12:12:12.695-0300][11353ms] GC(11) Metaspace: 101039K(103808K)->101039K(103808K) NonClass: 87584K(89216K)->87584K(89216K) Class: 13454K(14592K)->13454K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:212:[2026-08-20T12:12:13.874-0300][12532ms] GC(12) Metaspace: 101097K(103808K)->101097K(103808K) NonClass: 87637K(89216K)->87637K(89216K) Class: 13460K(14592K)->13460K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:227:[2026-08-20T12:12:15.148-0300][13806ms] GC(13) Metaspace: 101142K(103872K)->101142K(103872K) NonClass: 87675K(89280K)->87675K(89280K) Class: 13467K(14592K)->13467K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:242:[2026-08-20T12:12:16.004-0300][14662ms] GC(14) Metaspace: 101157K(103872K)->101157K(103872K) NonClass: 87690K(89280K)->87690K(89280K) Class: 13467K(14592K)->13467K(14592K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:257:[2026-08-20T12:12:22.380-0300][21038ms] GC(15) Metaspace: 135660K(138688K)->135660K(138688K) NonClass: 117861K(119680K)->117861K(119680K) Class: 17798K(19008K)->17798K(19008K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:272:[2026-08-20T12:12:25.360-0300][24018ms] GC(16) Metaspace: 151901K(155072K)->151901K(155072K) NonClass: 132197K(134016K)->132197K(134016K) Class: 19704K(21056K)->19704K(21056K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:287:[2026-08-20T12:12:28.064-0300][26722ms] GC(17) Metaspace: 167047K(170496K)->167047K(170496K) NonClass: 145533K(147520K)->145533K(147520K) Class: 21514K(22976K)->21514K(22976K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log:293:[2026-08-20T12:12:31.370-0300][30028ms]  Metaspace       used 170020K, committed 173440K, reserved 622592K
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log:9:  JAVA_OPTS:  -Xlog:gc*:file="/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/mqjms.log -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:32:[2026-08-20T12:12:33.379-0300][1030ms] GC(0) Metaspace: 13589K(14080K)->13589K(14080K) NonClass: 11987K(12288K)->11987K(12288K) Class: 1601K(1792K)->1601K(1792K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:47:[2026-08-20T12:12:33.664-0300][1315ms] GC(1) Metaspace: 18862K(19456K)->18862K(19456K) NonClass: 16642K(17024K)->16642K(17024K) Class: 2220K(2432K)->2220K(2432K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:62:[2026-08-20T12:12:33.889-0300][1540ms] GC(2) Metaspace: 25783K(26752K)->25783K(26752K) NonClass: 22586K(23168K)->22586K(23168K) Class: 3197K(3584K)->3197K(3584K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:77:[2026-08-20T12:12:35.031-0300][2682ms] GC(3) Metaspace: 39498K(40960K)->39498K(40960K) NonClass: 34149K(35008K)->34149K(35008K) Class: 5348K(5952K)->5348K(5952K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:92:[2026-08-20T12:12:35.830-0300][3481ms] GC(4) Metaspace: 62530K(64576K)->62530K(64576K) NonClass: 54176K(55424K)->54176K(55424K) Class: 8353K(9152K)->8353K(9152K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:107:[2026-08-20T12:12:36.223-0300][3874ms] GC(5) Metaspace: 62793K(64896K)->62793K(64896K) NonClass: 54422K(55680K)->54422K(55680K) Class: 8370K(9216K)->8370K(9216K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:122:[2026-08-20T12:12:36.680-0300][4331ms] GC(6) Metaspace: 62932K(65024K)->62932K(65024K) NonClass: 54558K(55808K)->54558K(55808K) Class: 8373K(9216K)->8373K(9216K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:137:[2026-08-20T12:12:37.241-0300][4893ms] GC(7) Metaspace: 63491K(65664K)->63491K(65664K) NonClass: 55037K(56320K)->55037K(56320K) Class: 8453K(9344K)->8453K(9344K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:152:[2026-08-20T12:12:38.075-0300][5726ms] GC(8) Metaspace: 73414K(75584K)->73414K(75584K) NonClass: 63882K(65152K)->63882K(65152K) Class: 9532K(10432K)->9532K(10432K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:167:[2026-08-20T12:12:40.609-0300][8260ms] GC(9) Metaspace: 96274K(98944K)->96274K(98944K) NonClass: 83467K(84992K)->83467K(84992K) Class: 12806K(13952K)->12806K(13952K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:182:[2026-08-20T12:12:41.703-0300][9354ms] GC(10) Metaspace: 102018K(104704K)->102018K(104704K) NonClass: 88507K(90048K)->88507K(90048K) Class: 13510K(14656K)->13510K(14656K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:197:[2026-08-20T12:12:42.901-0300][10552ms] GC(11) Metaspace: 102315K(104960K)->102315K(104960K) NonClass: 88772K(90304K)->88772K(90304K) Class: 13542K(14656K)->13542K(14656K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:212:[2026-08-20T12:12:44.204-0300][11856ms] GC(12) Metaspace: 103835K(106496K)->103835K(106496K) NonClass: 90115K(91648K)->90115K(91648K) Class: 13720K(14848K)->13720K(14848K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:227:[2026-08-20T12:12:45.293-0300][12944ms] GC(13) Metaspace: 103870K(106624K)->103870K(106624K) NonClass: 90145K(91712K)->90145K(91712K) Class: 13724K(14912K)->13724K(14912K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:242:[2026-08-20T12:12:46.165-0300][13816ms] GC(14) Metaspace: 103910K(106624K)->103910K(106624K) NonClass: 90181K(91712K)->90181K(91712K) Class: 13728K(14912K)->13728K(14912K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:257:[2026-08-20T12:12:48.288-0300][15939ms] GC(15) Metaspace: 120773K(123712K)->120773K(123712K) NonClass: 104955K(106624K)->104955K(106624K) Class: 15817K(17088K)->15817K(17088K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:272:[2026-08-20T12:12:51.334-0300][18986ms] GC(16) Metaspace: 152246K(155392K)->152246K(155392K) NonClass: 132443K(134208K)->132443K(134208K) Class: 19802K(21184K)->19802K(21184K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:287:[2026-08-20T12:12:54.678-0300][22329ms] GC(17) Metaspace: 168128K(171456K)->168128K(171456K) NonClass: 146473K(148352K)->146473K(148352K) Class: 21655K(23104K)->21655K(23104K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:302:[2026-08-20T12:13:05.514-0300][33165ms] GC(18) Metaspace: 168960K(172352K)->168960K(172352K) NonClass: 147253K(149184K)->147253K(149184K) Class: 21706K(23168K)->21706K(23168K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:317:[2026-08-20T12:13:10.313-0300][37964ms] GC(19) Metaspace: 169021K(172416K)->169021K(172416K) NonClass: 147314K(149248K)->147314K(149248K) Class: 21706K(23168K)->21706K(23168K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:332:[2026-08-20T12:16:29.555-0300][237207ms] GC(20) Metaspace: 170443K(173888K)->170443K(173888K) NonClass: 148568K(150528K)->148568K(150528K) Class: 21875K(23360K)->21875K(23360K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:347:[2026-08-20T12:38:05.049-0300][1532700ms] GC(21) Metaspace: 179116K(182592K)->179116K(182592K) NonClass: 156357K(158272K)->156357K(158272K) Class: 22759K(24320K)->22759K(24320K)
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log:45964:2026-08-20 11:53:35,019 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/opt/jboss-eap/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/jboss-eap/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log:46082:2026-08-20 12:12:02,825 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/mqjms.log -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log:47428:2026-08-20 12:12:33,250 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/mqjms.log -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
[p585600@caddeapllx1992 ~]$




vamls la antes tava assim:


o satadalone.conf

## -*- shell-script -*- ######################################################
##                                                                          ##
##  JBoss EAP Bootstrap Script Configuration                                ##
##                                                                          ##
##############################################################################

#
# This file is optional; it may be removed if not needed.
#

#
# Specify the maximum file descriptor limit, use "max" or "maximum" to use
# the default, as queried by the system.
#
# Defaults to "maximum"
#
#MAX_FD="maximum"

#
# Specify the profiler configuration file to load.
#
# Default is to not load profiler configuration file.
#
#PROFILER=""

#
# Specify the location of the Java home directory.  If set then $JAVA will
# be defined to $JAVA_HOME/bin/java, else $JAVA will be "java".
#
#JAVA_HOME="/opt/java/jdk"

#
# Specify the exact Java VM executable to use.
#
#JAVA=""

if [ "x$JBOSS_MODULES_SYSTEM_PKGS" = "x" ]; then
   JBOSS_MODULES_SYSTEM_PKGS="org.jboss.byteman,org.jboss.logmanager"
fi

# Uncomment the following line to prevent manipulation of JVM options
# by shell scripts.
#
#PRESERVE_JAVA_OPTS=true

#
# Specify options to pass to the Java VM.
#
if [ "x$JAVA_OPTS" = "x" ]; then
   JAVA_OPTS="-Xms__JVM_HEAP_MIN__ -Xmx__JVM_HEAP_MAX__ -XX:MetaspaceSize=__JVM_METASPACE_MIN__ -XX:MaxMetaspaceSize=__JVM_METASPACE_MAX__ -Djava.net.preferIPv4Stack=true"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=$JBOSS_MODULES_SYSTEM_PKGS -Djava.awt.headless=true"
   JAVA_OPTS="$JAVA_OPTS -Djavax.net.ssl.trustStore=$JBOSS_HOME/standalone/configuration/__JKS_FILE__ -Djavax.net.ssl.trustStorePassword=__PASSWORD_TRUSTSTORE__"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.policy-permissions=true"
   JAVA_OPTS="$JAVA_OPTS -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar"
   JAVA_OPTS="$JAVA_OPTS -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/mqjms.log"
   #JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager"
   JAVA_OPTS="$JAVA_OPTS -Dsun.util.logging.disableCallerCheck=true"
   JAVA_OPTS="$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
   # APPLICATION INSIGHTS
   #
   JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=$JBOSS_HOME/standalone/configuration/applicationinsights.json"
   #
   # CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS
   #
   JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"
   JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=__URL_PROXY__"
   JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"
   JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=__URL_PROXY__"
   JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"
   JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=__SistemaNome__ -Delastic.apm.environment=__SistemaAmbiente__ -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=__URL_APM_SERVER__ -Delastic.apm.global_labels=deployment=__DEPLOYMENT__"
else
   echo "JAVA_OPTS already set in environment; overriding default settings with values: $JAVA_OPTS"
fi

# Sample JPDA settings for remote socket debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"

# Sample JPDA settings for shared memory debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_shmem,server=y,suspend=n,address=jboss"

# Uncomment to not use JBoss Modules lockless mode
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.lockless=false"

# Uncomment to gather JBoss Modules metrics
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.metrics=true"

# Uncomment this to run with a security manager enabled
# SECMGR="true"

# Uncomment this in order to be able to run WildFly on FreeBSD
# when you get "epoll_create function not implemented" message in dmesg output
#JAVA_OPTS="$JAVA_OPTS -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.PollSelectorProvider"

# enable garbage collection logging if not set in environment differently
if [ "x$GC_LOG" = "x" ]; then
   GC_LOG="true"
else
   echo "GC_LOG set in environment to $GC_LOG"
fi

export HOSTIP=$(ifconfig | grep -A 1 'ens' | tail -1 | awk '{print $2}')



MUDEI PARA ESSE

## -*- shell-script -*- ######################################################
##                                                                          ##
##  JBoss EAP Bootstrap Script Configuration                                ##
##                                                                          ##
##############################################################################

#
# This file is optional; it may be removed if not needed.
#

#
# Specify the maximum file descriptor limit, use "max" or "maximum" to use
# the default, as queried by the system.
#
# Defaults to "maximum"
#
#MAX_FD="maximum"

#
# Specify the profiler configuration file to load.
#
# Default is to not load profiler configuration file.
#
#PROFILER=""

#
# Specify the location of the Java home directory.  If set then $JAVA will
# be defined to $JAVA_HOME/bin/java, else $JAVA will be "java".
#
#JAVA_HOME="/opt/java/jdk"

#
# Specify the exact Java VM executable to use.
#
#JAVA=""

if [ "x$JBOSS_MODULES_SYSTEM_PKGS" = "x" ]; then
   JBOSS_MODULES_SYSTEM_PKGS="org.jboss.byteman,org.jboss.logmanager"
fi

# Uncomment the following line to prevent manipulation of JVM options
# by shell scripts.
#
#PRESERVE_JAVA_OPTS=true

#
# Specify options to pass to the Java VM.
#
if [ "x$JAVA_OPTS" = "x" ]; then
   JAVA_OPTS="-Xms__JVM_HEAP_MIN__ -Xmx__JVM_HEAP_MAX__ -XX:MetaspaceSize=__JVM_METASPACE_MIN__ -XX:MaxMetaspaceSize=__JVM_METASPACE_MAX__ -Djava.net.preferIPv4Stack=true"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=$JBOSS_MODULES_SYSTEM_PKGS -Djava.awt.headless=true"
   JAVA_OPTS="$JAVA_OPTS -Djavax.net.ssl.trustStore=$JBOSS_HOME/standalone/configuration/__JKS_FILE__ -Djavax.net.ssl.trustStorePassword=__PASSWORD_TRUSTSTORE__"
   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.policy-permissions=true"
   JAVA_OPTS="$JAVA_OPTS -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar"
   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar"
   #JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager"
   JAVA_OPTS="$JAVA_OPTS -Dsun.util.logging.disableCallerCheck=true"
   JAVA_OPTS="$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager"   
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml"
   #JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=__SistemaNome__ -Delastic.apm.environment=__SistemaAmbiente__ -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=__URL_APM_SERVER__ -Delastic.apm.global_labels=deployment=__DEPLOYMENT__"
   JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=$JBOSS_HOME/standalone/configuration/applicationinsights.json"
else
   echo "JAVA_OPTS already set in environment; overriding default settings with values: $JAVA_OPTS"
fi

# Sample JPDA settings for remote socket debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"

# Sample JPDA settings for shared memory debugging
#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_shmem,server=y,suspend=n,address=jboss"

# Uncomment to not use JBoss Modules lockless mode
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.lockless=false"

# Uncomment to gather JBoss Modules metrics
#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.metrics=true"

# Uncomment this to run with a security manager enabled
# SECMGR="true"

# Uncomment this in order to be able to run WildFly on FreeBSD
# when you get "epoll_create function not implemented" message in dmesg output
#JAVA_OPTS="$JAVA_OPTS -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.PollSelectorProvider"

# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS

# Use system or custom proxies, but not BOTH.
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"

# CUSTOM Proxies.
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"

JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"

# NO_PROXY
JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br"

# enable garbage collection logging if not set in environment differently
if [ "x$GC_LOG" = "x" ]; then
   GC_LOG="true"
else
   echo "GC_LOG set in environment to $GC_LOG"
fi


POSI ETAO CONFIGURANRONDO O APPINSIGTHS


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
Configuração do Application Insights no JBoss - VM
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

APPLI


New page
Configuração do Application Insights no JBoss - VM

Follow
1

Edit

Guilherme Gomes Soares da Silva
17 de abr. de 2025
O artigo abaixo é baseado na versão 3.5.1 Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

O Azure Application Insights é uma ferramenta que faz parte do Azure Monitor, usado para coleta e análise de dados telemétricos de ambientes locais e da Azure (na nuvem).

Application Insights instrumentation in your app sends telemetry to your Application Insights resource.
Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD.

Para que os dados da aplicação sejam coletados corretamente alguns requisitos devem ser atendidos (tanto em DES quanto em PRD).

Equipes envolvidas:

CEDES (Apoio na geração dos builds e configuração do ambiente DES)
CEPTI (configuração do ambiente PRD, após validação em DES)
CETAD (configuração do ambiente PRD, após validação em DES)
Contents
1. Solicitar regras de firewall para o proxynuvem.caixa
2. Liberar o acesso aos endpoints da Azure no Proxy
Instruções para preenchimento da REQ
3. Adicionar o agente na VM/Container atráves do JBoss Deployments;
4. Importar os certificados dos endpoints no JKS usado na aplicação
5. Incluir o arquivo JSON no repo de config
6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
8. Erros comuns
Caminho incorreto para o agente
Ausência dos certificados no JKS
Falha de comunicação com o Proxy
Ausência de Instrumentation Key
Referências
1. Solicitar regras de firewall para o proxynuvem.caixa
Em ambiente DES/TQS/HMP:

Nesses ambientes não é necessário solicitar regra de firewall pois eles já comunicam com o proxydes.caixa.

Em ambiente PRD:
Responsável: CEPTI

Para saber se as regras já existem é recomendável executar um teste. Dentro do terminal basta executar: curl -v proxyprd.caixa:80 ou curl -v proxynuvem.caixa:80

Se não houver nenhuma mensagem de "connection refused", as regras estão funcionais.

Caso o sistema ainda não tenha regras para o proxy, basta solicitar uma regra adicional (via infradevops) e usar os backends PROXYPRD.CAIXA e PROXYNUVEM.CAIXA.

2. Liberar o acesso aos endpoints da Azure no Proxy
Em ambiente DES/TQS/HMP:

Seguir o processo abaixo, que é o mesmo dos ambientes de PRD:

Responsável pela abertura da REQ em PRD: CEPTI

Usar a REQ:
Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
Ambiente de Alta Disponibilidade
CETAD - Serviços - Proxy

Instruções para preenchimento da REQ
Em ambientes DES/TQS/HMP: Solicitar liberação no proxydes.caixa
Em ambientes PRD: Solicitar liberação no proxynuvem.caixa

No campo "Origem (HOSTNAME E IP)", informar o endereço IP de saída do projeto, disponível no infradevops.apl.caixa em:

Listagens > Suporte > Servidores cadastrados

No campo "Destino (DOMÍNIO/ URL/ IP)", informar os dados abaixo:

southcentralus-3.in.applicationinsights.azure.com
southcentralus.livediagnostics.monitor.azure.com
*.ods.opinsights.azure.com
*.oms.opinsights.azure.com
*.blob.core.windows.net
*.azure-automation.net
dc.applicationinsights.azure.com
dc.applicationinsights.microsoft.com
dc.services.visualstudio.com
live.applicationinsights.azure.com
rt.applicationinsights.microsoft.com
rt.services.visualstudio.com
*.in.applicationinsights.azure.com
brazilsouth.livediagnostics.monitor.azure.com
brazilsoutheast.livediagnostics.monitor.azure.com
No campo "Protocolo / Porta" informar: HTTPS / 443

Após a liberação do proxy, execute o seguinte comando para testar a conexão:

curl -v -x proxynuvem.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com
ou
curl -v -x proxyprd.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com
ou
curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com

3. Adicionar o agente na VM/Container atráves do JBoss Deployments;
Responsável: Comunidades

Executar o procedimento descrito na página Deployments adicionais JBOSS

Preencher o arquivo com a informação abaixo:

com.microsoft.azure:applicationinsights-agent:3.3.1:jar

Por fim, executar uma nova build para que o agente seja incluído na imagem.

4. Importar os certificados dos endpoints no JKS usado na aplicação
Responsável em DES/TQS: Comunidades
Responsável em HMP/PRD: CEPTI

Se a sua aplicação está utilizando o "caixa-truststore.jks" padrão da esteira, é possível trocar pelo "caixa-truststore-azure.jks" que já contém os certificados da Azure.

O procedimento de alteração do arquivo JKS pode ser consultado aqui: Trocar o arquivo JKS padrão do pipeline

Será necessário adicionar apenas o certificado raiz da cadeia, obtido nos links recomendados pela Microsoft:

https://rt.services.visualstudio.com/ 
https://southcentralus-3.in.applicationinsights.azure.com/ 

O procedimento está descrito aqui: https://go.microsoft.com/fwlink/?linkid=2151450 

5. Incluir o arquivo JSON no repo de config
Caso ainda não exista, crie uma pasta "configuration" e dentro dela crie um arquivo "applicationinsights.json" como na imagem abaixo:

configurationJSON.png

Tudo que estiver dentro dessa pasta será levado para a pasta configuration do JBoss.

Esse arquivo será responsável pela configuração do agente, suas coletas e o local na Azure onde esses dados serão processados. Fique atento ao branch utilizado no release, para saber qual está em uso siga este caminho:

Releases > Selecione o pipeline desejado na lista > Clique em "View" ou "Edit" no canto superior direito > Dentro das configurações do Pipeline, localize o artefato de config semelhante ao da imagem abaixo (procure pelo simbolo do GIT):

artefatoConfig.png

Ao clicar nesse artefato, um painel se abrirá do lado direito da tela. Procure pelo trecho abaixo no painel e saberá qual o repositório e a branch utilizados nesse release:

defaultBranch.png

IMPORTANTE!

Para usar essa opção de configuração é necessário acrescentar as variáveis abaixo no variable group:

APPLICATIONINSIGHTS_CONNECTION_STRING = <Connection string obtida na Azure. Não é necessário utilizar aspas>
APPLICATIONINSIGHTS_ROLE_NAME = <Identificação do sistema na Azure>
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = <Por recomendação da GESTI, valor padrão para DES e PRD = 100>
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
URL_PROXY = <proxydes.caixa ou proxynuvem.caixa, se ambiente de produção>
O valor dessas variáveis será incluído no arquivo durante o release. Abaixo um exemplo básico do conteúdo do arquivo JSON:

{
    "connectionString": "__APPLICATIONINSIGHTS_CONNECTION_STRING__",
    "role": {
        "name": "__APPLICATIONINSIGHTS_ROLE_NAME__"
    },
    "sampling": {
        "percentage": __APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE__
    },
    "instrumentation": {
        "logging": {
            "level": "__APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL__"
        }
    },
    "selfDiagnostics": {
        "destination": "file+console",
        "level": "__APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL__",
        "file": {
            "path": "applicationinsights.log",
            "maxSizeMb": 5,
            "maxHistory": 1
        }
    },
    "proxy": {
        "host": "__URL_PROXY__",
        "port": 80
    }
}
6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Remover ou comentar toda e qualquer referência ao APM no pipeline (variáveis) e no arquivo "standalone.conf".

Comentar ou remover as linhas do arquivo standalone.conf deve ser suficiente, caso não tenha nenhuma referência em variáveis de ambiente. As referências geralmente aparecem como nas linas abaixo:

JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar ...
Para adicionar o agente do Application Insights, basta acrescentar a linha abaixo na seção "# Specify options to pass to the Java VM" do arquivo standalone.conf:

JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=$JBOSS_HOME/standalone/configuration/applicationinsights.json"
Após a seção "Specify options to pass to the Java VM", incluir a configuração do proxy como segue:

# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS

# Use system or custom proxies, but not BOTH.
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"

# CUSTOM Proxies.
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"

JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"

# NO_PROXY
JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br"
IMPORTANTE!

As informações de NO_PROXY devem ser avaliadas com o time de desenvolvimento, este valor genérico é apenas uma sugestão.

Finalizados os procedimentos acima, basta gerar uma nova release, aguardar a finalização e verificar se os dados já estão chegando na Azure.

Se possível acompanhar os logs de inicialização do JBoss para identificar possíveis erros de comunicação entre o agente do Application Insights e a nuvem.

8. Erros comuns
Um passo importante antes de determinar o erro é coletar as informações geradas pelo agente do Application Insights no arquivo "applicationinsights.log" que é criado automaticamente no mesmo diretório onde o agente foi instalado.

No caso do JBoss esse arquivo pode ser acessado em:

$JBOSS_HOME/standalone/deployments/applicationinsights.log
Caminho incorreto para o agente
Caso o caminho definido no arquivo "standalone.conf" esteja incorreto ou o agente não esteja presente na imagem, o erro abaixo será exibido no log do Pod impedindo a aplicação de iniciar:

Quarkus_manifestMissing.PNG

Ausência dos certificados no JKS
Caso o JKS utilizado na aplicação não possua os certificados da Azure, obtidos no passo 5, o agente do Application Insights irá exibir a mensagem abaixo no log da aplicação:

Quarkus_CertificateError.PNG

Falha de comunicação com o Proxy
Caso, por algum motivo, o agente não consiga enviar os dados através do proxy, o erro abaixo será exibido no log da aplicação:

Quarkus_ProxyError.PNG

Ausência de Instrumentation Key
Se nenhuma Instrumentation Key (variável APPLICATIONINSIGHTS_CONNECTION_STRING) for fornecida para o agente, a inicialização irá falhar e ele não terá nenhuma outra ação, sem impacto na aplicação. A imagem abaixo traz o log que será gerado nesse cenário:

Quarkus_NoInstrument.PNG

Referências
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/app-insights-overview 
https://skrift.io/issues/the-insightful-azure-application-insights/ 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-troubleshoot 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-in-process-agent 
http://wikiprd.corecaixa/index.php/Criação_de_monitoração_no_Azure_(insights) 

73 visits in last 30 days
Finished loading items

Finished loading items

Expanded

Collapsed

Collapsed

Collapsed

Expanded

Showing filters 1 through 1

926 results found

14 results found

No results found

14 results found

10 results found


porem antes de tudo ele me relcamou disso:

fizemos a configuração do Application Insights em DES, mas esta dando msg de "O Application Insights causou o timeout."
porta 9990 não ficou disponível em até 200 segundos
falha do Application Insights por ausência de InstrumentationKey
 
mas o InstrumentationKey foi parametrizado na library 
 
InstrumentationKey=feb888f0-4097-485c-8cb8-74350b419b6f;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/;ApplicationId=aeb64caa-3d5c-419c-8f6b-7e77949759ca
 
conforme o tutorial
 
 
Consegue dar um help pra gente ?



porem eles nao solicitram o proxy acabe de pedir pra solictar eu troquei op stadalone dele porque achei estrano e nao ta confirme a configuraçao pede


<img width="637" height="831" alt="image" src="https://github.com/user-attachments/assets/553bac20-087f-47c9-8f78-4d8ac5fd738e" />


tambem crie o file jboss-deployments dentro de configuration pois estava dentro de jboss




