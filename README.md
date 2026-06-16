cd /opt/jboss-eap/bin
./standalone.sh -c standalone-full-ha.xml



[jboss@caddeapllx1945 ~]$ cd /opt/jboss-eap/bin
./standalone.sh -c standalone-full-ha.xml
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss-eap/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager

=========================================================================

Failed to read or configure the org.jboss.logmanager.LogManager
java.lang.IllegalArgumentException: Failed to instantiate class "org.jboss.logmanager.handlers.PeriodicRotatingFileHandler" for handler "FILE"
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$ConstructAction.lambda$validate$2(AbstractPropertyConfiguration.java:122)
        at org.jboss.logmanager.config.WrappedAction.execute(WrappedAction.java:42)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$ConstructAction.validate(AbstractPropertyConfiguration.java:118)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doPrepare(LogContextConfigurationImpl.java:336)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.prepare(LogContextConfigurationImpl.java:289)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.commit(LogContextConfigurationImpl.java:298)
        at org.jboss.logmanager.PropertyConfigurator.configure(PropertyConfigurator.java:546)
        at org.jboss.logmanager.PropertyConfigurator.configure(PropertyConfigurator.java:97)
        at org.jboss.logmanager.LogManager.readConfiguration(LogManager.java:170)
        at org.jboss.logmanager.LogManager.readConfiguration(LogManager.java:132)
        at java.util.logging.LogManager$3.run(LogManager.java:399)
        at java.util.logging.LogManager$3.run(LogManager.java:396)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
        at java.util.logging.LogManager.access$800(LogManager.java:145)
        at java.util.logging.LogManager$2.run(LogManager.java:345)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
        at java.util.logging.LogManager.getLogManager(LogManager.java:378)
        at org.jboss.modules.Main.main(Main.java:457)
Caused by: java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$ConstructAction.lambda$validate$2(AbstractPropertyConfiguration.java:120)
        ... 19 more
Caused by: java.io.FileNotFoundException: /logs/jboss/server.log (Permissão negada)
        at java.io.FileOutputStream.open0(Native Method)
        at java.io.FileOutputStream.open(FileOutputStream.java:270)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
        at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
        at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingFileHandler.java:109)
        at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
        at org.jboss.logmanager.handlers.FileHandler.<init>(FileHandler.java:119)
        at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.<init>(PeriodicRotatingFileHandler.java:77)
        ... 24 more
[jboss@caddeapllx1945 bin]$
