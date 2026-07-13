
-sh-4.1$ grep -n "datasources" -A 5 /opt/jboss/jboss-eap/hc/configuration/domain.xml | head -60
93:            <subsystem xmlns="urn:jboss:domain:datasources:1.2">
94:                <datasources>
95:                    <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
96-                        <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
97-                        <driver>h2</driver>
98-                        <security>
99-                            <user-name>sa</user-name>
100-                            <password>sa</password>
--
108:                </datasources>
109-            </subsystem>
110-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
111-                <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
112-                <jboss-descriptor-property-replacement>true</jboss-descriptor-property-replacement>
113-                <annotation-property-replacement>false</annotation-property-replacement>
--
321:            <subsystem xmlns="urn:jboss:domain:datasources:1.2">
322:                <datasources>
323:                    <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
324-                        <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
325-                        <driver>h2</driver>
326-                        <security>
327-                            <user-name>sa</user-name>
328-                            <password>sa</password>
--
336:                </datasources>
337-            </subsystem>
338-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
339-                <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
340-                <jboss-descriptor-property-replacement>true</jboss-descriptor-property-replacement>
341-                <annotation-property-replacement>false</annotation-property-replacement>
--
618:            <subsystem xmlns="urn:jboss:domain:datasources:1.2">
619:                <datasources>
620:                    <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
621-                        <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
622-                        <driver>h2</driver>
623-                        <security>
624-                            <user-name>sa</user-name>
625-                            <password>sa</password>
--
633:                </datasources>
634-            </subsystem>
635-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
636-                <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
637-                <jboss-descriptor-property-replacement>true</jboss-descriptor-property-replacement>
638-                <annotation-property-replacement>false</annotation-property-replacement>
--
943:            <subsystem xmlns="urn:jboss:domain:datasources:1.2">
944:                <datasources>
945:                    <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
946-                        <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
947-                        <driver>h2</driver>
948-                        <security>
949-                            <user-name>sa</user-name>
950-                            <password>sa</password>
--
958:                </datasources>
959-            </subsystem>
960-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -n "jdbc:oracle|connection-url|<datasource " -B2 -A2 /opt/jboss/jboss-eap/hc/configuration/domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -iE "domain-controller|<remote|host=" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | head -20
    <domain-controller>
        <remote host="${jboss.domain.master.address}" port="${jboss.domain.master.port:9999}" security-realm="ManagementRealm" username="admin"/>
    </domain-controller>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
