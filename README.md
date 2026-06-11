
Last login: Thu Jun 11 16:51:50 2026 from 10.122.150.31
-sh-4.2$ grep -n "db2cmu\|SicmuConnectionFactory\|LQ_REQ\|MQ_HOSTNAME\|QUEUE\|DB2" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
146:                <datasource jta="false" jndi-name="java:/db2cmu" pool-name="db2cmu" enabled="true">
147:                    <connection-url>jdbcdb2://10.216.80.111:446/RJKDB2DSDH</connection-url>
148:                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
165:                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
168:                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
169:                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
179:                    <connection-url>jdbc:db2://10.216.80.111:446/RJKDB2DSDH</connection-url>
180:                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
197:                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
200:                        <stale-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2StaleConnectionChecker"/>
201:                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
212:                        <xa-datasource-class>com.ibm.db2.jcc.DB2XADataSource</xa-datasource-class>
450:                        <connection-definition class-name="com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl" jndi-name="java:/jms/SicmuConnectionFactory" pool-name="SicmuConnectionFactory">
476:                        <admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:/jms/LQ_REQ_SICMU_ENV" pool-name="LQ_REQ_SICMU_ENV">
-sh-4.2$

