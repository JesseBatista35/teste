
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sicow-portal-okd-des-197-nzdl5 -n sicow-des -- grep -n -i -A30 "<system-properties>" /opt/jboss/standalone/configuration/standalone-okd.xml
35:    <system-properties>
36-        <property name="org.apache.tomcat.util.http.Parameters.MAX_COUNT" value="5000" />
37-        <property name="mail.smtp.socketFactory.class" value="javax.net.ssl.SSLSocketFactory" />
38-        <property name="mail.delayMs" value="100" />
39-        <property name="sicowlg_war" value="https://sicow-lg-okd-des.apps.nprd.caixa/sicowlg" />
40-        <property name="sicowpenhor_war" value="https://sicow-penhor-okd-des.apps.nprd.caixa/sicowpenhor/pages/home.cef" />
41-        <property name="sicowmte_war" value="https://sicow-mte-okd-des.apps.nprd.caixa/sicow-mte-okd" />
42-        <property name="sicowseg_war" value="https://sicow-seg-okd-des.apps.nprd.caixa/sicowseg" />
43-        <property name="sicownia_war" value="https://sicow-nia-okd-des.apps.nprd.caixa/sicow-nia-okd" />
44-        <property name="sicowconres_war" value="https://sicow-conres-okd-des.apps.nprd.caixa/sicow-conres" />
45-        <property name="sicowimp_war" value="https://sicow-imp-okd-des.apps.nprd.caixa/sicow-imp-okd" />
46-        <property name="sicowportalURL" value="https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef" />
47-
48-        <property name="sicow.sicli.ws.token.url" value="https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token" />
49-        <property name="sicow.sicli.ws.token.client.id" value="cli-ser-cow" />
50-        <property name="sicow.sicli.ws.token.grant.type" value="client_credentials" />
51-        <property name="sicow.sicli.ws.url" value="https://api.des.caixa:8443/cadastro/v1/clientes" />
52-        <property name="sicow.sicli.ws.sistema" value="SICOW" />
53-        <property name="sicow.sicli.ws.apikey" value="l7415d496745d74a079735c47ef0f3b4be" />
54-        <property name="org.apache.el.parser.COERCE_TO_ZERO" value="false" />
55-        <property name="user.timezone" value="America/Buenos_Aires" />
56-
57-        <property name="sicow.siiso.ws.client.url" value="https://api.des.caixa:8443/cadastro-receita/v4/pessoas-fisicas" />
58-        <property name="sicow.siiso.ws.token.url" value="https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token" />
59-        <property name="sicow.siiso.ws.token.client.id" value="cli-ser-cow" />
60-
61-        <property name="sicow.siiso.ws.token.client.grant_type" value="client_credentials" />
62-
63-        <property name="jboss.as.management.blocking.timeout" value="500" />
64-        <property name="pasta.nfs" value="/sicow" />
65-
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sicow-portal-okd-des-197-nzdl5 -n sicow-des -- grep -rn -i "sicowportalURL" /opt/jboss/standalone/configuration/
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.initial.xml:46:        <property name="sicowportalURL" value="https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef" />
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.last.xml:46:        <property name="sicowportalURL" value="https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef" />
/opt/jboss/standalone/configuration/standalone_xml_history/standalone-okd.boot.xml:46:        <property name="sicowportalURL" value="https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef" />
/opt/jboss/standalone/configuration/standalone-okd.xml:46:        <property name="sicowportalURL" value="https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef" />
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
