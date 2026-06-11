
-sh-4.2$ sudo sed -i 's|jdbcdb2://|jdbc:db2://|g' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[sudo] senha para p585600:
-sh-4.2$ grep "connection-url" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo systemctl restart jboss-eap-standalone
-sh-4.2$
