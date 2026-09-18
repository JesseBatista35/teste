-sh-4.1$
-sh-4.1$ ps -ef | grep httpd
p585600  10169  5920  0 10:35 pts/0    00:00:00 grep httpd
-sh-4.1$ ps -ef | grep java
root      1813     1  0 10:24 ?        00:00:00 /opt/CA/APMCommandCenterController/./bin/wrapper-linux-x86-64 /opt/CA/APMCommandCenterController/./bin/wrapper.conf wrapper.syslog.ident=apmccctrl wrapper.pidfile=/opt/CA/APMCommandCenterController/./bin/apmccctrl.pid wrapper.name=apmccctrl wrapper.displayname=CA APM Command Center Agent Controller wrapper.daemonize=TRUE wrapper.statusfile=/opt/CA/APMCommandCenterController/./bin/apmccctrl.status wrapper.java.statusfile=/opt/CA/APMCommandCenterController/./bin/apmccctrl.java.status wrapper.lockfile=/var/lock/subsys/apmccctrl wrapper.script.version=3.5.25 --
root      1815  1813  0 10:24 ?        00:00:06 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/bin/java -Xmx64m -Djava.library.path=lib -classpath lib/acc-controller.jar:lib/wrapper.jar:lib/jython-standalone-2.7-b2.jar -Dwrapper.key=QcqbFv1NPqYCC-Lt8I_oKMgnLL9xYRYl -Dwrapper.port=32000 -Dwrapper.jvm.port.min=31000 -Dwrapper.jvm.port.max=31999 -Dwrapper.disable_console_input=TRUE -Dwrapper.pid=1813 -Dwrapper.version=3.5.25-st -Dwrapper.native_library=wrapper -Dwrapper.arch=x86 -Dwrapper.service=TRUE -Dwrapper.cpu.timeout=10 -Dwrapper.jvmid=1 -Dwrapper.lang.domain=wrapper -Dwrapper.lang.folder=../lang org.springframework.boot.loader.JarLauncher --spring.config.location=file:config/apmccctrl.properties
logstash 11639     1 99 10:41 ?        00:00:23 /usr/java/jdk1.8.0_141/bin/java -Xms256m -Xmx1g -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -XX:+DisableExplicitGC -Djava.awt.headless=true -Dfile.encoding=UTF-8 -XX:+HeapDumpOnOutOfMemoryError -cp /usr/share/logstash/logstash-core/lib/jars/animal-sniffer-annotations-1.14.jar:/usr/share/logstash/logstash-core/lib/jars/commons-compiler-3.0.8.jar:/usr/share/logstash/logstash-core/lib/jars/error_prone_annotations-2.0.18.jar:/usr/share/logstash/logstash-core/lib/jars/google-java-format-1.5.jar:/usr/share/logstash/logstash-core/lib/jars/guava-22.0.jar:/usr/share/logstash/logstash-core/lib/jars/j2objc-annotations-1.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-annotations-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-core-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-databind-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/jackson-dataformat-cbor-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/janino-3.0.8.jar:/usr/share/logstash/logstash-core/lib/jars/javac-shaded-9-dev-r4023-3.jar:/usr/share/logstash/logstash-core/lib/jars/jruby-complete-9.1.13.0.jar:/usr/share/logstash/logstash-core/lib/jars/jsr305-1.3.9.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-api-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-core-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/log4j-slf4j-impl-2.9.1.jar:/usr/share/logstash/logstash-core/lib/jars/logstash-core.jar:/usr/share/logstash/logstash-core/lib/jars/slf4j-api-1.7.25.jar org.logstash.Logstash --path.settings /etc/logstash
p585600  11681  5920  0 10:41 pts/0    00:00:00 grep java
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ls /etc/init.d/ | grep - iE "jboss|eap"
grep: iE: No such file or directory
grep: jboss|eap: No such file or directory
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ mount | grep jboss_modules64
-sh-4.1$ mount -t nfs 10.116.95.13:/export/jboss_modules64 /opt/jboss/jboss-eap/modules
mount: only root can do that
-sh-4.1$ ls -lat $JBOSS_HOME/domain/log/
ls: cannot access /domain/log/: No such file or directory
-sh-4.1$ tail -n 200 $JBOSS_HOME/domain/log/host-controller.log
tail: cannot open `/domain/log/host-controller.log' for reading: No such file or directory
-sh-4.1$ tail -n 200 $JBOSS_HOME/domain/servers/sicem_node1_lx0005/log/server.log
tail: cannot open `/domain/servers/sicem_node1_lx0005/log/server.log' for reading: No such file or directory
-sh-4.1$
