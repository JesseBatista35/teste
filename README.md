
-sh-4.1$ grep -n "OracleSiouvDS" -B2 -A 20 /opt/jboss/jboss-eap/dc/configuration/domain.xml
13183-            <subsystem xmlns="urn:jboss:domain:datasources:1.2">
13184-                <datasources>
13185:                    <datasource jta="false" jndi-name="java:/jdbc/OracleSiouvDS" pool-name="jdbc/OracleSiouvDS" enabled="true" use-ccm="false">
13186-                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
13187-                        <driver-class>oracle.jdbc.OracleDriver</driver-class>
13188-                        <driver>ojdbc6.jar</driver>
13189-                        <security>
13190-                            <user-name>SOUVBD01</user-name>
13191-                            <password>pwsouvbd01</password>
13192-                        </security>
13193-                        <validation>
13194-                            <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleValidConnectionChecker"/>
13195-                            <check-valid-connection-sql>select 1 from dual</check-valid-connection-sql>
13196-                            <validate-on-match>false</validate-on-match>
13197-                            <background-validation>true</background-validation>
13198-                            <background-validation-millis>300000</background-validation-millis>
13199-                        </validation>
13200-                        <statement>
13201-                            <share-prepared-statements>false</share-prepared-statements>
13202-                        </statement>
13203-                    </datasource>
13204-                </datasources>
13205-            </subsystem>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
