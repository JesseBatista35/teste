
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 cp /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml.bkp_$(date +%Y%m%d)
[p585600@sspdeapllx0041 ~]$ grep -n -A 20 'name="sisag-lx0041"' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
147:        <server name="sisag-lx0041" group="sisag" auto-start="true">
148-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>
149-        </server>
150-        <server name="sipgt-lx0041" group="sipgt" auto-start="true">
151-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="10"/>
152-        </server>
153-        <server name="siagt-lx0041" group="siagt" auto-start="true">
154-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="9"/>
155-        </server>
156-        <server name="sisag-teste-lx0041" group="sisag-teste" auto-start="true">
157-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="7"/>
158-        </server>
159-        <server name="simtx-lx0041" group="simtx" auto-start="false">
160-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="11"/>
161-        </server>
162-        <server name="sipdi-lx0041" group="sipdi" auto-start="true">
163-            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
164-                <environment-variables>
165-                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sipdi-lx0041"/>
166-                </environment-variables>
167-            </jvm>
[p585600@sspdeapllx0041 ~]$
