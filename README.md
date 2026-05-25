
-sh-4.2$
-sh-4.2$ cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A 5 "TCPPING"
                    <protocol type="org.jgroups.protocols.TCPPING">
                        <property name="initial_hosts">
                            ${jboss.cluster.tcp.initial_hosts}
                        </property>
                    </protocol>
                    <protocol type="MERGE3"/>
-sh-4.2$  find /opt -name "standalone-full-ha.xml" 2>/dev/null ls /opt/
-sh-4.2$
