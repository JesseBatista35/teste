
[root@sbrdeapllx104 servers]# find /opt/jboss/jboss-eap/modules/system/layers/base/sun -maxdepth 2 2>&1
find: ‘/opt/jboss/jboss-eap/modules/system/layers/base/sun’: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 servers]# find /opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun -maxdepth 2 2>&1
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun/jdk
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun/jdk/main
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun/scripting
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/sun/scripting/main
[root@sbrdeapllx104 servers]# grep -rl "sun.jdk" /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/ 2>/dev/null
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/io/undertow/core/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/io/undertow/jsp/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/io/undertow/servlet/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/apache/activemq/artemis/journal/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/apache/activemq/artemis/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/infinispan/commons/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/infinispan/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/cli/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/connector/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/controller/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/domain-management/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/naming/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/security/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/as/server/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/ironjacamar/impl/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/jts/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/migration/cli/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/marshalling/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/marshalling/river/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/weld/core/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/xnio/nio/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/security/negotiation/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/extension/elytron/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/extension/io/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/extension/picketlink/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/extension/request-controller/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/extension/undertow/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/mod_cluster/undertow/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/security/elytron-private/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/openssl/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/client/config/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/wildfly/common/main/module.xml
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/picketbox/main/module.xml
[root@sbrdeapllx104 servers]# grep -rl "sun\.jdk" /opt/jboss/jboss-eap/jboss-modules.jar 2>/dev/null
[root@sbrdeapllx104 servers]# find /opt/jboss/jboss-eap -maxdepth 2 -iname "jboss-modules.jar"
/opt/jboss/jboss-eap/jboss-modules.jar
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
