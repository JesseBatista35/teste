[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# tail -150 /logs/jboss-eap/console-stdout.log
logname: no login name
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss/jboss-eap

  JAVA: java

  JAVA_OPTS: -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true

=========================================================================

Exception in thread "main" org.jboss.modules.ModuleLoadException: Error loading module from /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/module.xml
        at org.jboss.modules.xml.ModuleXmlParser.parseModuleXml(ModuleXmlParser.java:298)
        at org.jboss.modules.xml.ModuleXmlParser.parseModuleXml(ModuleXmlParser.java:254)
        at org.jboss.modules.xml.ModuleXmlParser.parseModuleXml(ModuleXmlParser.java:215)
        at org.jboss.modules.LocalModuleFinder.parseModuleXmlFile(LocalModuleFinder.java:256)
        at org.jboss.modules.LocalModuleFinder.lambda$findModule$1(LocalModuleFinder.java:199)
        at java.security.AccessController.doPrivileged(Native Method)
        at org.jboss.modules.LocalModuleFinder.findModule(LocalModuleFinder.java:199)
        at org.jboss.modules.ModuleLoader.findModule0(ModuleLoader.java:684)
        at org.jboss.modules.ModuleLoader.findModule(ModuleLoader.java:677)
        at org.jboss.modules.ModuleLoader.loadModuleLocal(ModuleLoader.java:487)
        at org.jboss.modules.ModuleLoader.preloadModule(ModuleLoader.java:390)
        at org.jboss.modules.Module.addPaths(Module.java:1212)
        at org.jboss.modules.Module.link(Module.java:1582)
        at org.jboss.modules.Module.relinkIfNecessary(Module.java:1610)
        at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
        at org.jboss.modules.Main.main(Main.java:399)
Caused by: org.jboss.modules.xml.XmlPullParserException: Failed to add resource root 'jboss-logmanager-1.5.4.Final-redhat-1.jar' at path 'jboss-logmanager-1.5.4.Final-redhat-1.jar' (position: END_TAG seen ... <resource-root path="jboss-logmanager-1.5.4.Final-redhat-1.jar"/>... @27:74) caused by: java.util.zip.ZipException: error in opening zip file
        at org.jboss.modules.xml.ModuleXmlParser.parseResourceRoot(ModuleXmlParser.java:1006)
        at org.jboss.modules.xml.ModuleXmlParser.parseResources(ModuleXmlParser.java:850)
        at org.jboss.modules.xml.ModuleXmlParser.parseModuleContents(ModuleXmlParser.java:645)
        at org.jboss.modules.xml.ModuleXmlParser.parseDocument(ModuleXmlParser.java:416)
        at org.jboss.modules.xml.ModuleXmlParser.parseModuleXml(ModuleXmlParser.java:296)
        ... 15 more
Caused by: java.util.zip.ZipException: error in opening zip file
        at java.util.zip.ZipFile.open(Native Method)
        at java.util.zip.ZipFile.<init>(ZipFile.java:231)
        at java.util.zip.ZipFile.<init>(ZipFile.java:156)
        at java.util.jar.JarFile.<init>(JarFile.java:168)
        at java.util.jar.JarFile.<init>(JarFile.java:147)
        at org.jboss.modules.xml.JDKSpecific.getJarFile(JDKSpecific.java:33)
        at org.jboss.modules.xml.ModuleXmlParser$DefaultResourceRootFactory.createResourceLoader(ModuleXmlParser.java:1380)
        at org.jboss.modules.LocalModuleFinder.lambda$new$0(LocalModuleFinder.java:94)
        at org.jboss.modules.xml.ModuleXmlParser.parseResourceRoot(ModuleXmlParser.java:1004)
        ... 19 more
35892
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# cat /etc/pam.d/su
#%PAM-1.0
auth            sufficient      pam_rootok.so
# Uncomment the following line to implicitly trust users in the "wheel" group.
#auth           sufficient      pam_wheel.so trust use_uid
# Uncomment the following line to require a user to be in the "wheel" group.
#auth           required        pam_wheel.so use_uid
auth            substack        system-auth
auth            include         postlogin
account         sufficient      pam_succeed_if.so uid = 0 use_uid quiet
account         include         system-auth
password        include         system-auth
session         include         system-auth
session         include         postlogin
session         optional        pam_xauth.so
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# cat /etc/pam.d/system-auth 2>/dev/null | grep -i limits
session     required      pam_limits.so
[root@sbrdeapllx104 servers]#
