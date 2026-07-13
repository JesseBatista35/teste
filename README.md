-sh-4.2$ grep -n -A 5 "urn:jboss:domain:keycloak" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
543:        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
544-            <secure-deployment name="siamc-web-3.0.0-SNAPSHOT.war">
545-                <realm>internet</realm>
546-                <resource>cli-web-amc</resource>
547-                <use-resource-role-mappings>false</use-resource-role-mappings>
548-                <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n -B 2 -A 15 "siamc" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
42-    <system-properties>
43-        <property name="numero.maximo.erros.arquivo" value="10000"/>
44:        <property name="diretorio.arquivo.importacao.siapx" value="/siamc/importacao/siapx"/>
45:        <property name="diretorio.arquivo.erros.siapx" value="/siamc/erros/siapx"/>
46:        <property name="diretorio.arquivo.erros.processado" value="/siamc/erros/processado"/>
47-    </system-properties>
48-
49-    <management>
50-        <security-realms>
51-            <security-realm name="ManagementRealm">
52-                <authentication>
53-                    <local default-user="$local" skip-group-loading="true"/>
54-                    <properties path="mgmt-users.properties" relative-to="jboss.server.config.dir"/>
55-                </authentication>
56-                <authorization map-groups-to-roles="false">
57-                    <properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
58-                </authorization>
59-            </security-realm>
60-            <security-realm name="ApplicationRealm">
61-                <server-identities>
--
542-        <subsystem xmlns="urn:jboss:domain:weld:4.0"/>
543-        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
544:            <secure-deployment name="siamc-web-3.0.0-SNAPSHOT.war">
545-                <realm>internet</realm>
546-                <resource>cli-web-amc</resource>
547-                <use-resource-role-mappings>false</use-resource-role-mappings>
548-                <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
549-                <ssl-required>EXTERNAL</ssl-required>
550-                <allow-any-hostname>true</allow-any-hostname>
551-                <disable-trust-manager>true</disable-trust-manager>
552-                <principal-attribute>preferred_username</principal-attribute>
553-                <credential name="secret">db729c82-5b5f-4127-8e25-9523a112edb5</credential>
554-                <confidential-port>443</confidential-port>
555-            </secure-deployment>
556-        </subsystem>
557-    </profile>
558-    <interfaces>
559-        <interface name="management">
-sh-4.2$
