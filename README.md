-sh-4.2$ sed -n '145,215p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
            <datasources>
                <datasource jta="false" jndi-name="java:/db2cmu" pool-name="db2cmu" enabled="true">
                    <connection-url>jdbcdb2://10.216.80.111:446/RJKDB2DSDH</connection-url>
                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
                    <connection-property name="currentSchema">
                        TQSCMU
                    </connection-property>
                    <driver>db2</driver>
                    <pool>
                        <min-pool-size>5</min-pool-size>
                        <max-pool-size>20</max-pool-size>
                        <prefill>true</prefill>
                        <use-strict-min>true</use-strict-min>
                        <flush-strategy>FailingConnectionOnly</flush-strategy>
                    </pool>
                    <security>
                        <user-name>SCMUTR01</user-name>
                        <password>yj48cwu</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
                    </validation>
                    <timeout>
                        <idle-timeout-minutes>5</idle-timeout-minutes>
                    </timeout>
                    <statement>
                        <track-statements>true</track-statements>
                    </statement>
                </datasource>
                <datasource jta="false" jndi-name="java:/db2cdm" pool-name="db2cdm" enabled="true">
                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
                    <connection-property name="currentSchema">
                        TQSCMU
                    </connection-property>
                    <driver>db2</driver>
                    <pool>
                        <min-pool-size>5</min-pool-size>
                        <max-pool-size>20</max-pool-size>
                        <prefill>true</prefill>
                        <use-strict-min>true</use-strict-min>
                        <flush-strategy>FailingConnectionOnly</flush-strategy>
                    </pool>
                    <security>
                        <user-name>SCMUTR01</user-name>
                        <password>yj48cwu</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
                    </validation>
                    <timeout>
                        <idle-timeout-minutes>5</idle-timeout-minutes>
                    </timeout>
                    <statement>
                        <track-statements>true</track-statements>
                    </statement>
                </datasource>
                <drivers>
                    <driver name="db2" module="com.ibm.db2">
                        <xa-datasource-class>com.ibm.db2.jcc.DB2XADataSource</xa-datasource-class>
                    </driver>
                </drivers>
            </datasources>
-sh-4.2$
