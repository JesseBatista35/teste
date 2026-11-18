[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]# grep -n -A30 'jdbc/IdmsSiapxDS' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vE '<password>|<user-name>' | head -60
19346:                    <datasource jta="true" jndi-name="java:/jdbc/IdmsSiapxDS" pool-name="jdbc/IdmsSiapxDS" enabled="true" use-ccm="true">
19347-                        <connection-url>jdbc:idms://10.192.224.76:1204/DICTAPX</connection-url>
19348-                        <driver-class>ca.idms.jdbc.IdmsJdbcDriver</driver-class>
19349-                        <driver>idmsjdbc.jar</driver>
19350-                        <pool>
19351-                            <min-pool-size>0</min-pool-size>
19352-                            <max-pool-size>10</max-pool-size>
19353-                            <flush-strategy>IdleConnections</flush-strategy>
19354-                        </pool>
19355-                        <security>
19358-                        </security>
19359-                        <validation>
19360-                            <check-valid-connection-sql>SELECT CURRENT DATE FROM SYSCA.SINGLETON_NULL</check-valid-connection-sql>
19361-                            <validate-on-match>true</validate-on-match>
19362-                        </validation>
19363-                        <timeout>
19364-                            <idle-timeout-minutes>1</idle-timeout-minutes>
19365-                            <allocation-retry>3</allocation-retry>
19366-                            <allocation-retry-wait-millis>500</allocation-retry-wait-millis>
19367-                        </timeout>
19368-                    </datasource>
19369-                    <drivers>
19370-                        <driver name="db2" module="com.ibm.db2">
19371-                            <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
19372-                        </driver>
19373-                    </drivers>
19374-                </datasources>
19375-            </subsystem>
19376-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
--
21081:                    <datasource jta="true" jndi-name="java:/jdbc/IdmsSiapxDS" pool-name="jdbc/IdmsSiapxDS" enabled="true" use-ccm="true">
21082-                        <connection-url>jdbc:idms://10.192.224.76:1204/DICTAPX</connection-url>
21083-                        <driver-class>ca.idms.jdbc.IdmsJdbcDriver</driver-class>
21084-                        <driver>idmsjdbc.jar</driver>
21085-                        <pool>
21086-                            <min-pool-size>0</min-pool-size>
21087-                            <max-pool-size>10</max-pool-size>
21088-                            <flush-strategy>IdleConnections</flush-strategy>
21089-                        </pool>
21090-                        <security>
21093-                        </security>
21094-                        <validation>
21095-                            <check-valid-connection-sql>SELECT CURRENT DATE FROM SYSCA.SINGLETON_NULL</check-valid-connection-sql>
21096-                            <validate-on-match>true</validate-on-match>
21097-                        </validation>
21098-                        <timeout>
21099-                            <idle-timeout-minutes>1</idle-timeout-minutes>
21100-                            <allocation-retry>3</allocation-retry>
21101-                            <allocation-retry-wait-millis>500</allocation-retry-wait-millis>
21102-                        </timeout>
21103-                    </datasource>
21104-                    <drivers>
21105-                        <driver name="db2" module="com.ibm.db2">
21106-                            <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
21107-                        </driver>
21108-                    </drivers>
21109-                </datasources>
21110-            </subsystem>
21111-            <subsystem xmlns="urn:jboss:domain:ee:1.2">
--
[root@sbrdeapllx0001 p585600]#
