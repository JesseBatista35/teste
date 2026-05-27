[p585600@sspdeapllx0041 ~]$ grep -n -A 40 'name="sipdi-lx0041"' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
162:        <server name="sipdi-lx0041" group="sipdi" auto-start="true">
163-            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
164-                <environment-variables>
165-                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sipdi-lx0041"/>
166-                </environment-variables>
167-            </jvm>
168-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="12"/>
169-        </server>
170-        <server name="sippm-lx0041" group="sippm" auto-start="true">
171-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="13"/>
172-        </server>
173-        <server name="simtx-intra-lx0041" group="simtx-intra" auto-start="true">
174-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="14"/>
175-        </server>
176-        <server name="siran-lx0041" group="siran" auto-start="false">
177-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="15"/>
178-        </server>
179-        <server name="sisag02-lx0041" group="sisag02" auto-start="true">
180-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="16"/>
181-        </server>
182-        <server name="sisag03-lx0041" group="sisag03" auto-start="true" update-auto-start-with-server-status="false">
183-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="17"/>
184-        </server>
185-        <server name="sisag04-lx0041" group="sisag04" auto-start="true" update-auto-start-with-server-status="false">
186-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="18"/>
187-        </server>
188-        <server name="sisag05-lx0041" group="sisag05" auto-start="true">
189-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="19"/>
190-        </server>
191-        <server name="sidcn-batch-lx0041" group="sidcn-batch" auto-start="true">
192-            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="31"/>
193-        </server>
194-</servers>
195-    <profile>
196-        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
197-            <expose-resolved-model/>
198-            <expose-expression-model/>
199-            <remoting-connector/>
200-        </subsystem>
201-    </profile>
202-</host>
[p585600@sspdeapllx0041 ~]$

