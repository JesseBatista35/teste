
[root@srjtqapllx0056 p585600]#

[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# grep -A4 "<domain-controller" /opt/open/jboss/7.0.0/domain/configuration/host*.xml
/opt/open/jboss/7.0.0/domain/configuration/host-master.xml:    <domain-controller>
/opt/open/jboss/7.0.0/domain/configuration/host-master.xml-        <local/>
/opt/open/jboss/7.0.0/domain/configuration/host-master.xml-    </domain-controller>
/opt/open/jboss/7.0.0/domain/configuration/host-master.xml-    <interfaces>
/opt/open/jboss/7.0.0/domain/configuration/host-master.xml-        <interface name="management">
--
/opt/open/jboss/7.0.0/domain/configuration/host-slave.xml:    <domain-controller>
/opt/open/jboss/7.0.0/domain/configuration/host-slave.xml-        <remote security-realm="ManagementRealm">
/opt/open/jboss/7.0.0/domain/configuration/host-slave.xml-            <discovery-options>
/opt/open/jboss/7.0.0/domain/configuration/host-slave.xml-                <static-discovery name="primary" protocol="${jboss.domain.master.protocol:remote}" host="${jboss.domain.master.address}" port="${jboss.domain.master.port:9999}"/>
/opt/open/jboss/7.0.0/domain/configuration/host-slave.xml-            </discovery-options>
--
/opt/open/jboss/7.0.0/domain/configuration/host.xml:    <domain-controller>
/opt/open/jboss/7.0.0/domain/configuration/host.xml-        <local/>
/opt/open/jboss/7.0.0/domain/configuration/host.xml-    </domain-controller>
/opt/open/jboss/7.0.0/domain/configuration/host.xml-
/opt/open/jboss/7.0.0/domain/configuration/host.xml-    <interfaces>
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# ps -ef | grep "Host Controller" | grep -v grep
spjbotr2  16159  15957  0 03:05 ?        00:01:07 /opt/open/java/jdk1.8.0_121//bin/java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/log/host-controller.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.host-controller -mp /opt/open/jboss/7.0.0/modules --pc-address 127.0.0.1 --pc-port 41397 -default-jvm /opt/open/java/jdk1.8.0_121//bin/java -Djboss.bind.address=srjtqapllx0056 -Djboss.bind.address.management=srjtqapllx0056 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -b=srjtqapllx0056 -host-config=host.xml --domain-config=domain.xml -Djboss.home.dir=/opt/open/jboss/7.0.0
[root@srjtqapllx0056 p585600]# sudo -u spjbotr2 /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0056:9990
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] ls /host
srjtqapllx0056

[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=<host>/server-config=srjtqapllx0056_sigaf_intra_8083:read-attribute(name=group)
Failed to get the list of the operation properties: "WFLYCTL0030: No resource definition is registered for address [
    ("host" => "<host>"),
    ("server-config" => "srjtqapllx0056_sigaf_intra_8083")
]"
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /server-group=<grupo>:read-attribute(name=profile)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[(\"server-group\" => \"<grupo>\")]' not found",
    "rolled-back" => true
}
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /server-group=<grupo>/jvm=*:read-resource
{
    "outcome" => "success",
    "result" => []
}
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] ls /profile=<profile>/subsystem=datasources/data-source
WFLYCTL0216: Management resource '[("profile" => "<profile>")]' not found
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /profile=<profile>/subsystem=datasources/data-source=<ds>:read-resource
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[(\"profile\" => \"<profile>\")]' not found",
    "rolled-back" => true
}
[domain@srjtqapllx0056:9990 /] /host=<host>/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=<ds>/statistics=pool:read-resource(include-runtime=true)
Failed to get the list of the operation properties: "WFLYCTL0030: No resource definition is registered for address [
    ("host" => "<host>"),
    ("server" => "srjtqapllx0056_sigaf_intra_8083"),
    ("subsystem" => "datasources"),
    ("data-source" => "<ds>"),
    ("statistics" => "pool")
]"
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /profile=<profile>/subsystem=transactions:read-attribute(name=default-timeout)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[(\"profile\" => \"<profile>\")]' not found",
    "rolled-back" => true
}
[domain@srjtqapllx0056:9990 /] /profile=<profile>/subsystem=io/worker=default:read-resource
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[(\"profile\" => \"<profile>\")]' not found",
    "rolled-back" => true
}
[domain@srjtqapllx0056:9990 /]
