find /opt/jboss/jboss-eap/modules_bkp -iname "jboss-common-beans*.jar"

unzip -t /caminho/encontrado/jboss-common-beans-1.1.0.Final-redhat-2.jar

ls -la /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/
cp /opt/jboss/jboss-eap/modules_bkp/.../jboss-common-beans-1.1.0.Final-redhat-2.jar /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/
chown jboss:jboss /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/common-beans/main/jboss-common-beans-1.1.0.Final-redhat-2.jar
