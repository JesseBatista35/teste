
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# grep -A 5 -B 5 "siosp\|simcn" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | head -30
                <option value="--add-exports=java.base/sun.nio.ch=ALL-UNNAMED"/>
            </jvm-options>
        </jvm>
    </jvms>
    <servers directory-grouping="by-type">
        <server name="siosp_node1_lx099" group="siosp" auto-start="true">
            <system-properties>
                <property name="API-KEY-SIICO" value="l7c46f92ec8b4f47c78b3371e4627354f5" boot-time="true"/>
                <property name="SIICO-SERVER-PUBLICO" value="https://api.des.caixa:8443" boot-time="true"/>
            </system-properties>
            <socket-bindings socket-binding-group="full-ha-sockets" port-offset="360"/>
[root@sbrdeapllx099 bin]# ls -la /opt/jboss/jboss-eap/hc/deployments.d/ 2>/dev/null || echo "Diretório não existe"
Diretório não existe
[root@sbrdeapllx099 bin]#
