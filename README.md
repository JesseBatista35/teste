find /opt/jboss/jboss-eap/modules/system/layers/base/sun -maxdepth 2 2>&1
find /opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun -maxdepth 2 2>&1
grep -rl "sun.jdk" /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/ 2>/dev/null
grep -rl "sun\.jdk" /opt/jboss/jboss-eap/jboss-modules.jar 2>/dev/null
find /opt/jboss/jboss-eap -maxdepth 2 -iname "jboss-modules.jar"
