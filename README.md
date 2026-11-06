[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$ grep -n -B2 -A2 '<driver' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
169-                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="true">
170-                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
171:                    <driver>h2</driver>
172-                    <security>
173-                        <user-name>sa</user-name>
--
175-                    </security>
176-                </datasource>
177:                <drivers>
178:                    <driver name="h2" module="com.h2database.h2">
179-                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
180-                    </driver>
--
185-                <datasource jndi-name="java:jboss/datasources/SIGSJ04" pool-name="SIGSJ04_Pool" enabled="true" use-java-context="true">
186-                    <connection-url>jdbc:oracle:thin:@CNPEXDADVM01CLU08.EXTRA.CAIXA.GOV.BR:1521/orad01bc</connection-url>
187:                    <driver>oracle</driver>
188-                    <pool>
189-                        <min-pool-size>32</min-pool-size>
--
199-                    </timeout>
200-                </datasource>
201:                <drivers>
202-
203:                <driver name="oracle" module="com.oracle">
204:                        <driver-class>oracle.jdbc.OracleDriver</driver-class>
205-                        <xa-datasource-class>oracle.jdbc.xa.client.OracleXADataSource</xa-datasource-class>
206-                </driver>
[p585600@caddeapllx2863 ~]$ grep -n -B2 -A2 '<driver' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
169-                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="true">
170-                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
171:                    <driver>h2</driver>
172-                    <security>
173-                        <user-name>sa</user-name>
--
175-                    </security>
176-                </datasource>
177:                <drivers>
178:                    <driver name="h2" module="com.h2database.h2">
179-                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
180-                    </driver>
--
185-                <datasource jndi-name="java:jboss/datasources/SIGSJ04" pool-name="SIGSJ04_Pool" enabled="true" use-java-context="true">
186-                    <connection-url>jdbc:oracle:thin:@CNPEXDADVM01CLU08.EXTRA.CAIXA.GOV.BR:1521/orad01bc</connection-url>
187:                    <driver>oracle</driver>
188-                    <pool>
189-                        <min-pool-size>32</min-pool-size>
--
199-                    </timeout>
200-                </datasource>
201:                <drivers>
202-
203:                <driver name="oracle" module="com.oracle">
204:                        <driver-class>oracle.jdbc.OracleDriver</driver-class>
205-                        <xa-datasource-class>oracle.jdbc.xa.client.OracleXADataSource</xa-datasource-class>
206-                </driver>
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
[p585600@caddeapllx2863 ~]$
