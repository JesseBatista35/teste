ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/
find /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/ -name "*.jar" -exec ls -la {} \;
unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
