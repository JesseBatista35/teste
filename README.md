ls -la /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/
ls -la /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/ 2>&1
cat /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/.overlays.txt 2>/dev/null
cat /opt/jboss/jboss-eap/modules/layers.conf 2>/dev/null


unzip -t /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar
