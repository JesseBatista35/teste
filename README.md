
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# su - spssodr1
Last login: Thu Sep 10 10:23:44 -03 2026 on pts/1
[spssodr1@crjtqapllx036 ~]$
[spssodr1@crjtqapllx036 ~]$
[spssodr1@crjtqapllx036 ~]$ cd /opt/open/sso/7.3.0/bin
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start.log 2>&1 &
[1] 37768
[spssodr1@crjtqapllx036 bin]$ tail -f /infra_app/logs/siset/server-crjtqapllx036.log
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment user-storage-jpa-siper-jar-with-dependencies.jar (runtime-name: user-storage-jpa-siper-jar-with-dependencies.jar) in 16ms
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment OTPCaixaCond.jar (runtime-name: OTPCaixaCond.jar) in 15ms
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment eventExternal-jar-with-dependencies.jar (runtime-name: eventExternal-jar-with-dependencies.jar) in 15ms
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment directgrantpassword-jar-with-dependencies.jar (runtime-name: directgrantpassword-jar-with-dependencies.jar) in 13ms
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment loginCaixa-jar-with-dependencies.jar (runtime-name: loginCaixa-jar-with-dependencies.jar) in 13ms
2026-09-10 10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment siset-user-session-provider.jar (runtime-name: siset-user-session-provider.jar) in 12ms
2026-09-10 10:24:29,555 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment resource-provider-jar-with-dependencies.jar (runtime-name: resource-provider-jar-with-dependencies.jar) in 13ms
2026-09-10 10:24:29,556 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Stopped deployment validaLogin-jar-with-dependencies.jar (runtime-name: validaLogin-jar-with-dependencies.jar) in 17ms
2026-09-10 10:24:29,561 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Stopped deployment BrowserPassword-jar-with-dependencies.jar (runtime-name: BrowserPassword-jar-with-dependencies.jar) in 19ms
2026-09-10 10:24:29,585 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment servico.war (runtime-name: servico.war) in 44ms
^C
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ ps -ef | grep java
spssodr1  37901  37768 99 11:55 pts/1    00:01:04 /opt/open/java/jdk1.8.0_121/bin/java -D[Standalone] -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms32768m -Xmx32768m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost=proxydes.caixa -DhttpRecaptchaProxyPort=80 -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dftp.proxyHost=proxydes.caixa -Dftp.proxyPort=80 -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.3.1.jar -Dorg.jboss.boot.log.file=/opt/open/sso/7.3.0/standalone/log/server.log -Dlogging.configuration=file:/opt/open/sso/7.3.0/standalone/configuration/logging.properties -jar /opt/open/sso/7.3.0/jboss-modules.jar -mp /opt/open/sso/7.3.0/modules org.jboss.as.standalone -Djboss.home.dir=/opt/open/sso/7.3.0 -Djboss.server.base.dir=/opt/open/sso/7.3.0/standalone -c standalone.xml
spssodr1  38175  37513  0 11:56 pts/1    00:00:00 grep --color=auto java
[spssodr1@crjtqapllx036 bin]$
