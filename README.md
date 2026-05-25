[p585600@sspdeapllx0041 ~]$ sed -n '103,125p' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
    <jvms>
        <jvm name="default">
            <heap size="64m" max-size="256m"/>
            <jvm-options>
                <option value="-server"/>
                <option value="-XX:MetaspaceSize=1024m"/>
                <option value="-XX:MaxMetaspaceSize=1024m"/>
            </jvm-options>
        </jvm>
    </jvms>

    <servers>
        <server name="sicdc-lx0041" group="sicdc" auto-start="true">
            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
                <environment-variables>
                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sicdc-lx0041"/>
                </environment-variables>
            </jvm>
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="1"/>
        </server>
        <server name="siavl-lx0041" group="siavl" auto-start="true">
            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="2"/>
        </server>
[p585600@sspdeapllx0041 ~]$ sed -n '162,172p' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
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
[p585600@sspdeapllx0041 ~]$
