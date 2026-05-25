[p585600@sspdeapllx0041 ~]$ grep -n "sisag|jvm|javaagent" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml | head -80
[p585600@sspdeapllx0041 ~]$ sed -n '140,200p' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
        </server>
        <server name="sidcn-lx0041" group="sidcn" auto-start="true" update-auto-start-with-server-status="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="5"/>
        </server>
        <server name="simai-lx0041" group="simai" auto-start="true" update-auto-start-with-server-status="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="4"/>
        </server>
        <server name="sisag-lx0041" group="sisag" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>
        </server>
        <server name="sipgt-lx0041" group="sipgt" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="10"/>
        </server>
        <server name="siagt-lx0041" group="siagt" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="9"/>
        </server>
        <server name="sisag-teste-lx0041" group="sisag-teste" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="7"/>
        </server>
        <server name="simtx-lx0041" group="simtx" auto-start="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="11"/>
        </server>
        <server name="sipdi-lx0041" group="sipdi" auto-start="true">
            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
                <environment-variables>
                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sipdi-lx0041"/>
                </environment-variables>
            </jvm>
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="12"/>
        </server>
        <server name="sippm-lx0041" group="sippm" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="13"/>
        </server>
        <server name="simtx-intra-lx0041" group="simtx-intra" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="14"/>
        </server>
        <server name="siran-lx0041" group="siran" auto-start="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="15"/>
        </server>
        <server name="sisag02-lx0041" group="sisag02" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="16"/>
        </server>
        <server name="sisag03-lx0041" group="sisag03" auto-start="true" update-auto-start-with-server-status="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="17"/>
        </server>
        <server name="sisag04-lx0041" group="sisag04" auto-start="true" update-auto-start-with-server-status="false">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="18"/>
        </server>
        <server name="sisag05-lx0041" group="sisag05" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="19"/>
        </server>
        <server name="sidcn-batch-lx0041" group="sidcn-batch" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="31"/>
        </server>
</servers>
    <profile>
        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
            <expose-resolved-model/>
            <expose-expression-model/>
            <remoting-connector/>
        </subsystem>
[p585600@sspdeapllx0041 ~]$
