
[p585600@sspdeapllx0041 ~]$ grep -n -A 10 'name="sisag-lx0041"' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
147:        <server name="sisag-lx0041" group="sisag" auto-start="true">
148-            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
149-                <environment-variables>
150-                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>
151-                </environment-variables>
152-            </jvm>
153-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>
154-        </server>
155-        <server name="sipgt-lx0041" group="sipgt" auto-start="true">
156-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="10"/>
157-        </server>
[p585600@sspdeapllx0041 ~]$

